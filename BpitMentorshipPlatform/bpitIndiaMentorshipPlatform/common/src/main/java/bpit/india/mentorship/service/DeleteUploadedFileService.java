package bpit.india.mentorship.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetUploadedFilePathAndDeleteThatRecordDao;

@Service
public class DeleteUploadedFileService {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginService.class);
	
	@Autowired
	private GetUploadedFilePathAndDeleteThatRecordDao getUploadedFilePathAndDeleteThatRecordDao; 
	
	public String deleteUploadedFile(String libraryId)
	{
		LOGGER.debug("creating the variable to get the path of the file to be deleted");
		
		/*
		 * 1) Get path of uploaded file
		 * 2) Delete file from location
		 * 3) Delete record from Database
		 */

		/*
		 * Getting path of file
		 */
		String pathOfUploadedFile = getUploadedFilePathAndDeleteThatRecordDao.getUploadedFilePath(libraryId);		
		LOGGER.debug("got the path");
		if(pathOfUploadedFile== null)
		{
			LOGGER.debug("path of the file is null");
			/*
			 * An error occurred while fetching path corresponding librarayId
			 */
			System.out.println("Path:" + pathOfUploadedFile);
			return null;
		}
		
		/*
		 * Deleting file from server
		 */
		LOGGER.debug("creating the reference of the file ");
		File deleteFile = new File(pathOfUploadedFile);
		LOGGER.debug("reference created");
		try{
			LOGGER.debug("inside try block");
			
		
		if(deleteFile.delete())
		{
			LOGGER.debug("in deletefile.delete");
			/*
			 * File deleted successfully from server 
			 * Now delete corresponding record from DB
			 */
			System.out.println("In deletefile.delete" );
			LOGGER.debug("getting the status of the deleted file");
			int status = getUploadedFilePathAndDeleteThatRecordDao.deleteFromLibrary(libraryId);
			System.out.println(status);
			if(status==-1)
			{
				LOGGER.debug("status =-1 an error occured while deleting from the database");
				/*
				 * An error occurred while deleting record from DB 
				 */
				System.out.println("Error deleting from DB");
				return null;
			}
			else 
			{
				LOGGER.debug("File deleted successfully from server and record from DB");
				/*
				 * File deleted successfully from server and record from DB
				 */
				
				return "Success";
			}
		}
		
		else 
		{
			LOGGER.debug("Error deleting file from server");
			/*
			 * Error deleting file from server 
			 */
			System.out.println("Error deleting from Server");
			return null;
		}
		}
		catch(Exception e)
		{
			LOGGER.error("An exception occured while creating user " + e);
			e.printStackTrace();
			return null;
		}
	}
}

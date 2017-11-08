package bpit.india.mentorship.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetUploadedFilePathAndDeleteThatRecordDao;

@Service
public class DeleteUploadedFileService {

	@Autowired
	private GetUploadedFilePathAndDeleteThatRecordDao getUploadedFilePathAndDeleteThatRecordDao; 
	
	public String deleteUploadedFile(String libraryId)
	{
		/*
		 * 1) Get path of uploaded file
		 * 2) Delete file from location
		 * 3) Delete record from Database
		 */

		/*
		 * Getting path of file
		 */
		String pathOfUploadedFile = getUploadedFilePathAndDeleteThatRecordDao.getUploadedFilePath(libraryId);		
		if(pathOfUploadedFile== null)
		{
			/*
			 * An error occurred while fetching path corresponding librarayId
			 */
			System.out.println("Path:" + pathOfUploadedFile);
			return null;
		}
		
		/*
		 * Deleting file from server
		 */
		
		File deleteFile = new File(pathOfUploadedFile);
		try{
		
		if(deleteFile.delete())
		{
			/*
			 * File deleted successfully from server 
			 * Now delete corresponding record from DB
			 */
			System.out.println("In deletefile.delete" );
			int status = getUploadedFilePathAndDeleteThatRecordDao.deleteFromLibrary(libraryId);
			System.out.println(status);
			if(status==-1)
			{
				/*
				 * An error occurred while deleting record from DB 
				 */
				System.out.println("Error deleting from DB");
				return null;
			}
			else 
			{
				/*
				 * File deleted successfully from server and record from DB
				 */
				
				return "Success";
			}
		}
		
		else 
		{
			/*
			 * Error deleting file from server 
			 */
			System.out.println("Error deleting from Server");
			return null;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}

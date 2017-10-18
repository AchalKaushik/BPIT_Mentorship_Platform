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
		libraryId = "59";
		
		String pathOfUploadedFile = getUploadedFilePathAndDeleteThatRecordDao.getUploadedFilePath(libraryId);		
		if(pathOfUploadedFile== null)
		{
			/*
			 * An error occurred while fetching path corresponding librarayId
			 */
			return null;
		}
		
		/*
		 * Deleting file from server
		 */
		
		File deleteFile = new File(pathOfUploadedFile);
		
		if(deleteFile.delete())
		{
			/*
			 * File deleted successfully from server 
			 * Now delete corresponding record from DB
			 */
			
			int status = getUploadedFilePathAndDeleteThatRecordDao.deleteFromLibrary(libraryId);
			if(status==-1)
			{
				/*
				 * An error occurred while deleting record from DB 
				 */
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
			return null;
		}
	}
}

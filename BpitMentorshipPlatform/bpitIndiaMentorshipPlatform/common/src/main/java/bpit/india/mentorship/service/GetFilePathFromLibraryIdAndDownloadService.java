package bpit.india.mentorship.service;

import java.io.File;
import java.io.FileInputStream;
import javax.activation.MimetypesFileTypeMap;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetFilePathFromLibraryIdDao;

@Service
public class GetFilePathFromLibraryIdAndDownloadService {
	private static final Logger LOGGER = LoggerFactory.getLogger(GetFilePathFromLibraryIdAndDownloadService.class);
	
	@Autowired
	private GetFilePathFromLibraryIdDao getFilePathFromLibraryIdDao;
	
	public void getFilePathFromLibraryIdAndDownload(String libraryId,String fileName,HttpServletResponse response)
	{
		LOGGER.debug("creating the string for filepath");
		String filePath = getFilePathFromLibraryIdDao.getFilePathFromLibraryIdDao(libraryId);
		LOGGER.debug("successfully got the filepath from libraryid dao "+ filePath);
		System.out.println("FilePath is  : " + filePath);
		
		if(filePath==null)
		{
			LOGGER.debug("file path = null");
			/*
			 * An exception occurred while fetching path of file 
			 */
			
		}
		else
		{
			LOGGER.debug("Download file code goes here");
			/*
			 * Download file code goes here 
			 */
			
			try 
			{
				LOGGER.debug("creating the  refrence of the fileinput stream class");
				FileInputStream is = new FileInputStream(new File(filePath));
				
				LOGGER.debug("successfully passed the file path in the file input stream ");
				
				MimetypesFileTypeMap getContentTypeOfFile =  new MimetypesFileTypeMap();
				response.setContentType(getContentTypeOfFile.getContentType(filePath));
				response.setHeader("Content-disposition", "attachment; filename="+fileName+filePath.substring(filePath.indexOf(".")));
				org.apache.commons.io.IOUtils.copy(is,response.getOutputStream());
				LOGGER.debug("a file is ready for the download and downloaded ");
			} 
			catch (Exception e) 
			{
				LOGGER.error("An exception occured while creating user " + e);
				/*
				 * An error occurred while downloading a file 
				 */
				e.printStackTrace();
				//return null;
		    }
	
		}
	}
}

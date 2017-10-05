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

	@Autowired
	private GetFilePathFromLibraryIdDao getFilePathFromLibraryIdDao;
	
	public void getFilePathFromLibraryIdAndDownload(String libraryId,String fileName,HttpServletResponse response)
	{
		String filePath = getFilePathFromLibraryIdDao.getFilePathFromLibraryIdDao(libraryId);
		
		System.out.println("FilePath is  : " + filePath);
		
		if(filePath==null)
		{
			/*
			 * An exception occurred while fetching path of file 
			 */
			
		}
		else
		{
			/*
			 * Download file code goes here 
			 */
			
			try 
			{
				FileInputStream is = new FileInputStream(new File(filePath));
				
				MimetypesFileTypeMap getContentTypeOfFile =  new MimetypesFileTypeMap();
				response.setContentType(getContentTypeOfFile.getContentType(filePath));
				response.setHeader("Content-disposition", "attachment; filename="+fileName+filePath.substring(filePath.indexOf(".")));
				org.apache.commons.io.IOUtils.copy(is,response.getOutputStream());
			} 
			catch (Exception e) 
			{
				/*
				 * An error occurred while downloading a file 
				 */
				e.printStackTrace();
				//return null;
		    }
	
		}
	}
}

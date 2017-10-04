package bpit.india.mentorship.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetFilePathFromLibraryIdDao;

@Service
public class GetFilePathFromLibraryIdAndDownloadService {

	@Autowired
	private GetFilePathFromLibraryIdDao getFilePathFromLibraryIdDao;
	
	public String getFilePathFromLibraryIdAndDownload(String libraryId,HttpServletResponse response)
	{
		String filePath = getFilePathFromLibraryIdDao.getFilePathFromLibraryIdDao(libraryId);
		if(filePath==null)
		{
			/*
			 * An exception occurred while fetching path of file 
			 */
			
			return null;
		}
		else
		{
			/*
			 * Download file code goes here 
			 */
			
			try 
			{
				FileInputStream is = new FileInputStream(new File(filePath));
				response.setContentType("application/zip");
		    	//response.setHeader("Content-disposition", "attachment; filename="+ fileName+".zip");
				org.apache.commons.io.IOUtils.copy(is,response.getOutputStream());
			} 
			catch (IOException ex) 
			{
		      throw new RuntimeException("IOError writing file to output stream");
		    }
			catch (Exception e) {
				
				// Error message 
			}
			
			
			
			
			
		}
		return null;
	}
}

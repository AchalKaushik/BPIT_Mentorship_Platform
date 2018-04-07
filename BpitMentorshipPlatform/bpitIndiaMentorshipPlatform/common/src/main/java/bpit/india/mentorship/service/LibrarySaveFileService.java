package bpit.india.mentorship.service;

import java.nio.file.Files;
import java.nio.file.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class LibrarySaveFileService {
	private static final Logger LOGGER = LoggerFactory.getLogger(LibrarySaveFileService.class);

	public String saveFile(MultipartFile file,Path path)
	{
		
		try{
			LOGGER.debug("inside try block");
			LOGGER.debug("Reading the uploaded file( in bytestream)");
			/*
			 * Reading the uploaded file( in bytestream)
			 */
		
			
			
			  byte[] bytes=file.getBytes();
	
			
			 // Saving the file at desired location
			 
			  System.out.println(path.toString());
			 Files.write(path, bytes);
			
			
			LOGGER.debug("Path for saving file is  :" + path.toString());
			//File destFile = new File(path.toString());
			LOGGER.debug("Saving the file at desired location");
			//file.transferTo(destFile);
			
			return "Success";
		}
		catch(Exception e)
		{
			LOGGER.error("Any other exception occurred " + e);
			
			e.printStackTrace();
			return null;
		}
		
	}
}

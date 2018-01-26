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
			LOGGER.debug("Saving the file at desired location");
			
			/*
			 * Saving the file at desired location
			 */
			Files.write(path, bytes);
			LOGGER.debug("Saved the file at desired location");
			
			
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

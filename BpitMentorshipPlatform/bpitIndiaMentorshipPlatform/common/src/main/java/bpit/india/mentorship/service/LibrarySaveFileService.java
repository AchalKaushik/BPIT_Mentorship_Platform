package bpit.india.mentorship.service;

import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class LibrarySaveFileService {

	public String saveFile(MultipartFile file,Path path)
	{
		try{
			/*
			 * Reading the uploaded file( in bytestream)
			 */
			
			byte[] bytes=file.getBytes();
			
			/*
			 * Saving the file at desired location
			 */
			Files.write(path, bytes);
			
			return "Success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
}

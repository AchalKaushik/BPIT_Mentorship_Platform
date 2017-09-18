package bpit.india.mentorship.poc;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class RestControllerExample {

	@Autowired
	private RandomService randomService; 
	
	@Autowired
	private RandomService1 randomService1;
	
	@RequestMapping(value="/abc")
	public String print()
	{
		return randomService.randomService();
		
	}
	
	@RequestMapping(value="/def")
	public Collection<RandomDto> print1()
	{
		return randomService1.randomService1();
	}
	
	@RequestMapping(value = "/hello", method = { RequestMethod.GET, RequestMethod.POST },consumes=MediaType.ALL_VALUE)
	   public String singleFileUpload(@RequestParam("uploadedFile") MultipartFile file,@RequestParam("fileDetails") String obj) 
	{
		try{
		System.out.println("file received ");
		System.out.println(file.getOriginalFilename()+ file.getBytes());
		byte[] bytes=file.getBytes();
		Path path=Paths.get("D://"+file.getOriginalFilename());
		Files.write(path, bytes);
		System.out.println("Hashmap" + obj);
		//System.out.println("branch : " + obj.get("branch"));
		//System.out.println("branch : " + obj.get("library.branch"));
		}
		catch(Exception e	)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}

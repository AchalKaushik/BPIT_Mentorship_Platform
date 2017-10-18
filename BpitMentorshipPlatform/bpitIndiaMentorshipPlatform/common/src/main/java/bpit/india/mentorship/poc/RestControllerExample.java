package bpit.india.mentorship.poc;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bpit.india.mentorship.dto.GetLibraryIdFileNameSemesterBranchTypeCourseDto;
import bpit.india.mentorship.service.DeleteUploadedFileService;
import bpit.india.mentorship.service.GetLibraryIdAndFileNameFromUserIdService;

@RestController
public class RestControllerExample {

	@Autowired
	private RandomService randomService; 
	
	@Autowired
	private RandomService1 randomService1;
	
	@Autowired
	private GetLibraryIdAndFileNameFromUserIdService getLibraryIdAndFileNameFromUserIdService;
	
	@Autowired
	private DeleteUploadedFileService deleteUploadedFileService;
	
	@RequestMapping(value="/abc")
	public String print()
	{
		String libraryId="58";
		return deleteUploadedFileService.deleteUploadedFile(libraryId);
		
	}
	
	@RequestMapping(value="/def")
	public Collection<RandomDto> print1()
	{
		return randomService1.randomService1();
	}
	
	@RequestMapping(value="/qwert")
	public Collection<GetLibraryIdFileNameSemesterBranchTypeCourseDto> print2()
	{
		return getLibraryIdAndFileNameFromUserIdService.getLibraryIdAndFileNameFromUserId();
	}
	
	
}

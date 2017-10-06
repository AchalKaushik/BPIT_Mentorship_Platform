package bpit.india.mentorship.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bpit.india.mentorship.common.ConvertSemesterStringIntoNumber;
import bpit.india.mentorship.dto.GetInfoToFetchFileNamesDto;
import bpit.india.mentorship.dto.GetLibraryIdAndFileNameDto;
import bpit.india.mentorship.service.GetFileNameAndLibraryIdService;
import bpit.india.mentorship.service.GetFilePathFromLibraryIdAndDownloadService;
import bpit.india.mentorship.service.GetLibraryIdAndFileNameForSearchService;


@RestController
public class LibraryController {

	@Autowired
	private GetLibraryIdAndFileNameForSearchService getLibraryIdAndFileNameForSearchService;
	
	@Autowired
	private ConvertSemesterStringIntoNumber convertSemesterStringIntoNumber;
	
	@Autowired
	private GetFileNameAndLibraryIdService getFileNameAndLibraryIdService;
	
	@Autowired
	private GetFilePathFromLibraryIdAndDownloadService getFilePathFromLibraryIdAndDownloadService;
	
	@RequestMapping(value="/searchForFile",method=RequestMethod.POST,produces = "application/json") 
	public Collection<GetLibraryIdAndFileNameDto> searchForFile(@RequestBody GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto)
	{
		System.out.println("In search for file " + getInfoToFetchFileNamesDto.getUserId()+ getInfoToFetchFileNamesDto.getSemester());
		/*
		 * Setting the semester into numeric form and setting it in DTo
		 */
		getInfoToFetchFileNamesDto.setSemester(convertSemesterStringIntoNumber.convertSemesterStringIntoNumber(getInfoToFetchFileNamesDto.getSemester()));
		
		return getLibraryIdAndFileNameForSearchService.getLibraryIdAndFileNameForSearch(getInfoToFetchFileNamesDto);
	}
	
	
	
	@RequestMapping(value="/getFileNameAndLibraryId",method=RequestMethod.POST,produces = "application/json") 
	public Collection<GetLibraryIdAndFileNameDto> getFileNameAndLibraryId(@RequestBody GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto)
	{
		/*
		 * Setting the semester into numeric form and setting it in DTo
		 */
		getInfoToFetchFileNamesDto.setSemester(convertSemesterStringIntoNumber.convertSemesterStringIntoNumber(getInfoToFetchFileNamesDto.getSemester()));
		
		return getFileNameAndLibraryIdService.getfileNameAndLibraryId(getInfoToFetchFileNamesDto);
		
	}
	
	
	
	@RequestMapping(value="/downloadFile",method=RequestMethod.GET,produces = "application/json") 
	public void downloadFile(@RequestParam("libraryId") String libraryId,@RequestParam("fileName") String fileName,HttpServletResponse response)
	{
		System.out.println("Received hit in download file " + libraryId+fileName);
		
		 getFilePathFromLibraryIdAndDownloadService.getFilePathFromLibraryIdAndDownload(libraryId,fileName, response);
		
	}
	
}

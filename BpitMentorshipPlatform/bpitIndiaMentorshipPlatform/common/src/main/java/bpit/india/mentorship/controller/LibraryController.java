package bpit.india.mentorship.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import bpit.india.mentorship.common.ConvertSemesterStringIntoNumber;
import bpit.india.mentorship.dto.DeleteFileDto;
import bpit.india.mentorship.dto.GetInfoToFetchFileNamesDto;
import bpit.india.mentorship.dto.GetLibraryIdAndFileNameDto;
import bpit.india.mentorship.dto.GetLibraryIdFileNameSemesterBranchTypeCourseDto;
import bpit.india.mentorship.service.DeleteUploadedFileService;
import bpit.india.mentorship.service.GetFileNameAndLibraryIdService;
import bpit.india.mentorship.service.GetFilePathFromLibraryIdAndDownloadService;
import bpit.india.mentorship.service.GetLibraryIdAndFileNameForSearchService;
import bpit.india.mentorship.service.GetLibraryIdAndFileNameFromUserIdService;
import bpit.india.mentorship.service.GetUserRoleService;
import bpit.india.mentorship.service.LibraryUploadFileService;


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

 @Autowired
 private LibraryUploadFileService libraryUploadFileService;

 @Autowired
 private DeleteUploadedFileService deleteUploadedFileService;

 @Autowired
 private GetUserRoleService getUserRoleService;
 
 @Autowired
 private GetLibraryIdAndFileNameFromUserIdService getLibraryIdAndFileNameFromUserIdService;


 @RequestMapping(value = "/searchForFile", method = RequestMethod.POST, produces = "application/json")
 public Collection < GetLibraryIdAndFileNameDto > searchForFile(@RequestBody GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto) {
  if (getInfoToFetchFileNamesDto.getUserId().equalsIgnoreCase("") || getInfoToFetchFileNamesDto.getUserId() == null) {
   return null;
  }

  System.out.println("In search for file " + getInfoToFetchFileNamesDto.getUserId() + getInfoToFetchFileNamesDto.getSemester());
  /*
   * Setting the semester into numeric form and setting it in DTo
   */
  getInfoToFetchFileNamesDto.setSemester(convertSemesterStringIntoNumber.convertSemesterStringIntoNumber(getInfoToFetchFileNamesDto.getSemester()));

  return getLibraryIdAndFileNameForSearchService.getLibraryIdAndFileNameForSearch(getInfoToFetchFileNamesDto);
 }



 @RequestMapping(value = "/getFileNameAndLibraryId", method = RequestMethod.POST, produces = "application/json")
 public Collection < GetLibraryIdAndFileNameDto > getFileNameAndLibraryId(@RequestBody GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto) {
  /*
   * Setting the semester into numeric form and setting it in DTo
   */
  getInfoToFetchFileNamesDto.setSemester(convertSemesterStringIntoNumber.convertSemesterStringIntoNumber(getInfoToFetchFileNamesDto.getSemester()));

  return getFileNameAndLibraryIdService.getfileNameAndLibraryId(getInfoToFetchFileNamesDto);

 }



 @RequestMapping(value = "/downloadFile", method = RequestMethod.GET, produces = "application/json")
 public void downloadFile(@RequestParam("libraryId") String libraryId, @RequestParam("fileName") String fileName, HttpServletResponse response) {

  System.out.println("Received hit in download file " + libraryId + fileName);

  getFilePathFromLibraryIdAndDownloadService.getFilePathFromLibraryIdAndDownload(libraryId, fileName, response);

 }


 @RequestMapping(value = "/uploadFile", method = {
  RequestMethod.GET,
  RequestMethod.POST
 }, consumes = MediaType.ALL_VALUE)
 public String singleFileUpload(@RequestParam("file") MultipartFile file, @RequestParam("branch") String branch, @RequestParam("type") String type, @RequestParam("fileName") String fileName, @RequestParam("semester") String semester, @RequestParam("subject") String subject, @RequestParam("userId") String userId, HttpServletRequest servletRequest) {
  /*
   * Checking user role of user...
   */

  if (getUserRoleService.getUserRole(userId).equalsIgnoreCase("Teacher")) {


   System.out.println("Received response in backend ");
   System.out.println("file is  : " + file);
   System.out.println("Filename is  : " + file.getOriginalFilename());

   semester = convertSemesterStringIntoNumber.convertSemesterStringIntoNumber(semester);

   System.out.println("branch is  : " + branch + userId + semester + fileName);

   System.out.println(servletRequest.getServletContext().getRealPath("/image"));

   return libraryUploadFileService.uploadFile(file, branch, subject, type, fileName, semester, userId);
  } else {
   /*
    * Unauthorized access....
    */
   return null;
  }


 }

 @RequestMapping(value = "/delFile", method = {
  RequestMethod.GET,
  RequestMethod.POST
 }, consumes = MediaType.ALL_VALUE)
 public String delFile(@RequestBody DeleteFileDto deleteFileDto) {
  /*
   * Checking user role of user...
   */
  if (getUserRoleService.getUserRole(deleteFileDto.getUserId()).equalsIgnoreCase("Teacher")) {
   System.out.println("In del file controller : " + deleteFileDto.getLibraryId());
   return deleteUploadedFileService.deleteUploadedFile(deleteFileDto.getLibraryId());
  } else {
   /*
    * Unauthorized access....
    */
   return null;
  }

 }

 
 @RequestMapping(value="/qwert")
	public Collection<GetLibraryIdFileNameSemesterBranchTypeCourseDto> print2(@RequestParam("userId") String userId)
	{
		return getLibraryIdAndFileNameFromUserIdService.getLibraryIdAndFileNameFromUserId(userId);
	}
 
 

}
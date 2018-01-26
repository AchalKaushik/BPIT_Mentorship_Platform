package bpit.india.mentorship.service;

import java.util.ArrayList;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetLibraryIdFileNameSemesterBranchTypeCourseFromUserIdDao;
import bpit.india.mentorship.dto.GetLibraryIdFileNameSemesterBranchTypeCourseDto;

@Service
public class GetLibraryIdAndFileNameFromUserIdService {
	private static final Logger LOGGER = LoggerFactory.getLogger(GetLibraryIdAndFileNameFromUserIdService.class);
	

	@Autowired
	private GetLibraryIdFileNameSemesterBranchTypeCourseFromUserIdDao getLibraryIdFileNameSemesterBranchTypeCourseFromUserIdDao;
	
	public Collection<GetLibraryIdFileNameSemesterBranchTypeCourseDto> getLibraryIdAndFileNameFromUserId()
	{
		LOGGER.debug("Request Received from Controller");
        LOGGER.debug("In GetLibraryIdFileNameSemesterBranchTypeCourse - getCollection");
        LOGGER.debug("Creating ArrayList object");
		
        LOGGER.debug("Creating Collection object");
        LOGGER.debug("Making a Request to Dao to get data for libraryid and filename from dao");
        Collection<GetLibraryIdFileNameSemesterBranchTypeCourseDto> result = new ArrayList<GetLibraryIdFileNameSemesterBranchTypeCourseDto>();
		
		  LOGGER.debug("Successfully created");
		  result = getLibraryIdFileNameSemesterBranchTypeCourseFromUserIdDao.getLibraryIdFileNameSemesterBranchTypeCourseFromUserId();
		  LOGGER.debug("got the value of the result");	
		if(result.size()>0)
		{
			 LOGGER.debug("RESULT.SIZE > 0 ");
			System.out.println("Result > 0 "+ result);
			return result;
		}
		else 
		{
			LOGGER.debug("no record found ");
			/*
			 * No record found or exception occurred 
			 */
			return null;
		}
	}
}

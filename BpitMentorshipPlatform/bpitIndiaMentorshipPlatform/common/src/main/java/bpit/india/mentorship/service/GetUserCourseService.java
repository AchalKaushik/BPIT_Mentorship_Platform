package bpit.india.mentorship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bpit.india.mentorship.dao.GetUserCourseDao;

@Service
public class GetUserCourseService {
	private static final Logger LOGGER = LoggerFactory.getLogger(GetUserCourseService.class);

	@Autowired
	private GetUserCourseDao getUserCourseDao;
	
	public String getUserCouse(String userId)
	{
		LOGGER.debug("succefully get into the fuction get-user-role");
	    LOGGER.debug("the user id is " + userId);
		try{
			/*
			 * set userId from session 
			 */
			
		/*
		 * If null is returned then an error has occurred
		 */
			
			LOGGER.debug("successfully got into the try block");
			LOGGER.debug("returning the value of the userid");
		
		return getUserCourseDao.getUserCourse(userId);
		}
		catch(Exception e)
		{
			LOGGER.error("an exception occured while returing course name");
			/*
			 * An error occurred while returning courseName
			 */
			e.printStackTrace();
			return null;
		}
	}
	
}

package bpit.india.mentorship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetUserCourseDao;

@Service
public class GetUserCourseService {

	@Autowired
	private GetUserCourseDao getUserCourseDao;
	
	public String getUserCouse(String userId)
	{
		try{
			/*
			 * set userId from session 
			 */
			
		/*
		 * If null is returned then an error has occurred
		 */
		
		return getUserCourseDao.getUserCourse(userId);
		}
		catch(Exception e)
		{
			/*
			 * An error occurred while returning courseName
			 */
			e.printStackTrace();
			return null;
		}
	}
	
}

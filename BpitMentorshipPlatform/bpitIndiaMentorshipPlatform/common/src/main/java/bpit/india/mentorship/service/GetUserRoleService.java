package bpit.india.mentorship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bpit.india.mentorship.dao.GetUserRoleDao;

@Service
public class GetUserRoleService {
	private static final Logger LOGGER = LoggerFactory.getLogger(GetUserRoleService.class);
	@Autowired
	private GetUserRoleDao getUserRoleDao;
	
	public String getUserRole(String userId)
	{ 
		LOGGER.debug("succefuclly get into the fuction get-user-role");
		LOGGER.debug("the user id is " + userId);
		try{
			/*
			 * set userId from session 
			 */
			LOGGER.debug("successfully got into the try block");
		//	String userId="ruchit.jain15@gmail.com";
			
		/*
		 * If null is returned then an error has occurred
		 */
			LOGGER.debug("returning the value of the userid");
	    
		return getUserRoleDao.getUserRole(userId);
		
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

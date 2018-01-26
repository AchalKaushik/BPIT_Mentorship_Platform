package bpit.india.mentorship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bpit.india.mentorship.dao.LoginDao;
import bpit.india.mentorship.dto.LoginUniqueIdAndPasswordDto;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginService.class);
	
	public String login(LoginUniqueIdAndPasswordDto loginUniqueIdAndPasswordDto)
	{
		try{
			LOGGER.debug("trying to get login details from the form");
			int  status= loginDao.login(loginUniqueIdAndPasswordDto);
			
			if(status==1)
			{
				LOGGER.debug("login successful and user is authenticated ");
				/*
				 * Authenticated user
				 */
				return "Success";
			}
			else if(status==0)
			{
				LOGGER.debug("no record found");
				/*
				 * No record found 
				 */
				return "Error";
			}
			else if(status==-1)
			{
				LOGGER.debug("An exception occurred while checking Authenticating user");
				/*
				 * An exception occurred while checking Authenticating user
				 */
				return null;
			}
			else
			{
			    LOGGER.debug("An unknown issued arose");
				/*
				 * An unknown issued arose   
				 */
				return null;
			}
		}
		catch(Exception e)
		{
			LOGGER.error("An exception occured while creating user " + e);
			e.printStackTrace();
			return null;	
		}
	}
}

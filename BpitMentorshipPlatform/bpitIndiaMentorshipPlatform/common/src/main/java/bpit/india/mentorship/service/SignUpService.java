package bpit.india.mentorship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.SignUpDao;
import bpit.india.mentorship.dto.SignUpDto;

@Service
public class SignUpService {

	@Autowired
	private SignUpDao signUpDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SignUpService.class);
	 
	public String signUp(SignUpDto signUpDto)
	{
		try{
			LOGGER.debug("getting into signup try block");
		int status=signUpDao.insertIntoSignUp(signUpDto);
		if(status>0)
		{
			LOGGER.debug("signup successful");
			return "Success";
		}
		else if(status==0)
		{
			LOGGER.debug("Status is equals to 0 duplicate value entered");
			/*
			 * Duplicate key exception occurrred
			 */
			return null;
		}
		else
		{
			LOGGER.debug("An other exception occurred while inserting data in database");
			/*
			 * An other exception occurred while inserting data in database 
			 */
			return "Error";
		}
		}
		catch(Exception e)
		{
			LOGGER.error("An exception occured while creating user " + e);
			/*
			 * Another error occurred while inserting data in database
			 */
			return "Error";
		}
	}
}

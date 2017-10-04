package bpit.india.mentorship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.SignUpDao;
import bpit.india.mentorship.dto.SignUpDto;

@Service
public class SignUpService {

	@Autowired
	private SignUpDao signUpDao;
	 
	public String signUp(SignUpDto signUpDto)
	{
		try{
		int status=signUpDao.insertIntoSignUp(signUpDto);
		if(status>0)
		{
			return "Success";
		}
		else if(status==0)
		{
			/*
			 * Duplicate key exception occurrred
			 */
			return null;
		}
		else
		{
			/*
			 * An other exception occurred while inserting data in database 
			 */
			return "Error";
		}
		}
		catch(Exception e)
		{
			/*
			 * Another error occurred while inserting data in database
			 */
			return "Error";
		}
	}
}

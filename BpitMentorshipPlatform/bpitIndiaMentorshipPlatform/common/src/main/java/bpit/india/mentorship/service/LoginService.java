package bpit.india.mentorship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.LoginDao;
import bpit.india.mentorship.dto.LoginUniqueIdAndPasswordDto;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;
	
	public String login(LoginUniqueIdAndPasswordDto loginUniqueIdAndPasswordDto)
	{
		try{
			int  status= loginDao.login(loginUniqueIdAndPasswordDto);
			
			if(status==1)
			{
				/*
				 * Authenticated user
				 */
				return "Success";
			}
			else if(status==0)
			{
				/*
				 * No record found 
				 */
				return "Error";
			}
			else if(status==-1)
			{
				/*
				 * An exception occurred while checking Authenticating user
				 */
				return null;
			}
			else
			{
				/*
				 * An unknown issued arose   
				 */
				return null;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;	
		}
	}
}

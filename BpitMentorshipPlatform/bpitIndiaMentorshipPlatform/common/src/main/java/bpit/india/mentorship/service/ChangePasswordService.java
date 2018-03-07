package bpit.india.mentorship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.ChangePasswordDao;
import bpit.india.mentorship.dao.VerifyCurrentPasswordDao;
import bpit.india.mentorship.dto.ChangePasswordDto;

@Service
public class ChangePasswordService {

	@Autowired
	private VerifyCurrentPasswordDao verifyCurrentPasswordDao;
	
	@Autowired
	private ChangePasswordDao changePasswordDao;
	
	public String changePassword(ChangePasswordDto changePasswordDto)
	{
		try{
		int status = verifyCurrentPasswordDao.verifyCurrentPassword(changePasswordDto);
		
		if(status==0)
		{
			/*
			 * No entry corresponding that userId
			 */
			return "0";
		}
		else if(status==2)
		{
			/*
			 * An unknown exception occurred
			 */
			return "2";
		}
		else if(status==-1)
		{
			/*
			 * Password mismatch
			 */
			return "-1";
		}
		else 
		{
			/*
			* Password Matched...
		 	* Starting updating password process...	
		 	*/
			
			int passChangeStatus= changePasswordDao.changePassword(changePasswordDto);
			if(passChangeStatus==1)
			{
				/*
				 * Password successfully changed...
				 */
				return "1";
			}
			
			else
			{
				/*
				 * An exception occurred while updating password..
				 */
				return "-2";
			}
			
		}
		
		}
		catch(Exception e)
		{
			/*
			 * An unknown Exception occurred ...
			 */
			return "10";
			
		}
	}
}

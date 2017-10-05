package bpit.india.mentorship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetUserRoleDao;

@Service
public class GetUserRoleService {

	@Autowired
	private GetUserRoleDao getUserRoleDao;
	
	public String getUserRole(String userId)
	{
		try{
			/*
			 * set userId from session 
			 */
			
		//	String userId="ruchit.jain15@gmail.com";
			
		/*
		 * If null is returned then an error has occurred
		 */
	
		return getUserRoleDao.getUserRole(userId);
		
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

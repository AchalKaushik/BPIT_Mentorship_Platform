package bpit.india.mentorship.dao;

import java.util.HashMap;
import java.util.Map;

import javassist.bytecode.stackmap.BasicBlock.Catch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.ChangePasswordConfig;
import bpit.india.mentorship.dto.ChangePasswordDto;

@Repository
public class ChangePasswordDao extends AbstractDao{

	
	@Autowired
	private ChangePasswordConfig changePasswordConfig;
	
	public int changePassword(ChangePasswordDto changePasswordDto)
	{
		try{
		Map<String,String> parameters = new HashMap<String, String>();
		
		parameters.put("userId", changePasswordDto.getUserId());
		parameters.put("newPassword", changePasswordDto.getNewPassword());
		
		int status=getJdbcTemplate().update(changePasswordConfig.getChangeCurrentPassword(), parameters);
		if(status==1)
		{
			/*
			 * Password Successfully changed..
			 */
			return 1;
		}
		
		else
		{
			/*
			 * An error occurred while executing update query..
			 */
			return -2;
		}
	}
		catch(Exception e)
		{
			/*
			 * An exception occurred ...
			 */
			return -2;
		}
	}
	 
}

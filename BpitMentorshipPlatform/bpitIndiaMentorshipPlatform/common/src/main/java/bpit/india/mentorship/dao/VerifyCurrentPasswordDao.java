package bpit.india.mentorship.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.ChangePasswordConfig;
import bpit.india.mentorship.dto.ChangePasswordDto;

@Repository
public class VerifyCurrentPasswordDao extends AbstractDao{

	@Autowired
	private ChangePasswordConfig changePasswordConfig;
	
	
	public int verifyCurrentPassword(ChangePasswordDto changePasswordDto)
	{
		try{
		Map<String,String> parameters = new HashMap<String,String>();
		
		parameters.put("userId", changePasswordDto.getUserId());
		
		String savedPassword = getJdbcTemplate().queryForObject(changePasswordConfig.getGetCurrentPassword(), parameters, String.class);
		
		if(savedPassword.equals(changePasswordDto.getCurrentPassword()))
		{
			/*
			 * Password Match
			 */
			return 1;
		}
		else
		{
			/*
			 * Password Mismatch
			 */
			return -1;
		}
		}
		catch(EmptyResultDataAccessException e)
		{
			/*
			 * No result found corresponding to the given email Id
			 */
			return 0;
		}
		catch(Exception e1)
		{
			/*
			 * An exception occurred ..
			 */
			return 2;
		}
		
	}
}

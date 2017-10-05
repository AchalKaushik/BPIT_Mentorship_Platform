package bpit.india.mentorship.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.LoginConfig;
import bpit.india.mentorship.dto.LoginUniqueIdAndPasswordDto;

@Repository
public class LoginDao extends AbstractDao{

	@Autowired
	private LoginConfig loginConfig;
	
	public int login(LoginUniqueIdAndPasswordDto loginUniqueIdAndPasswordDto)
	{
		try{
			Map<String, String> parameters = new HashMap<String, String>();
			parameters.put("userId", loginUniqueIdAndPasswordDto.getUserId());
			parameters.put("password", loginUniqueIdAndPasswordDto.getPassword());
			return getJdbcTemplate().queryForObject(loginConfig.getMatchUniqueIdAndPassword(), parameters, Integer.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return -1;
		}
	}
}

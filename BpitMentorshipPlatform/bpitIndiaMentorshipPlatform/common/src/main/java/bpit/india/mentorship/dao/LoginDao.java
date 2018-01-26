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
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginDao.class);
	@Autowired
	private LoginConfig loginConfig;
	
	public int login(LoginUniqueIdAndPasswordDto loginUniqueIdAndPasswordDto)
	{
		
		try{ 
			LOGGER.debug("inside try block");
			LOGGER.debug("creating the hashmap");
			
			Map<String, String> parameters = new HashMap<String, String>();
			
			LOGGER.debug("hashmap successfully created");
			
			parameters.put("userId", loginUniqueIdAndPasswordDto.getUserId());
			LOGGER.debug("got the userid from the loginuniqueid and password dao" + loginUniqueIdAndPasswordDto.getUserId());
			
			parameters.put("password", loginUniqueIdAndPasswordDto.getPassword());
			LOGGER.debug("got the PASSWORD from the loginuniqueid and password dao");
			
			return getJdbcTemplate().queryForObject(loginConfig.getMatchUniqueIdAndPassword(), parameters, Integer.class);
		}
		catch(Exception e)
		{
			LOGGER.error("An exception occured while creating user " + e);
			e.printStackTrace();
			return -1;
		}
	}
}

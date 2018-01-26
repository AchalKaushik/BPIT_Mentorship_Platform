package bpit.india.mentorship.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.SignUpConfig;
import bpit.india.mentorship.dto.SignUpDto;

@Repository
public class SignUpDao extends AbstractDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(SignUpDao.class);
	@Autowired
	private SignUpConfig signUpConfig;
	
	public int insertIntoSignUp(SignUpDto signUpDto)
	{
		try{
			LOGGER.debug("inside try block");
			LOGGER.debug("creating the hashmap");
		Map<String, Object> parameters = new HashMap<String, Object>();
		LOGGER.debug("hashmap successfully created");
		
		parameters.put("firstName",signUpDto.getFirstName());
		LOGGER.debug("got the first name from the signup dao" + signUpDto.getFirstName());
		
		parameters.put("lastName",signUpDto.getLastName());
		LOGGER.debug("got the last name from the signup dao" + signUpDto.getLastName());
		
		parameters.put("password",signUpDto.getPassword());
		
		parameters.put("mobileNumber",signUpDto.getMobileNumber());
		LOGGER.debug("got the mobile number from the signup dao" + signUpDto.getMobileNumber() );
		
		parameters.put("uniqueId",signUpDto.getUniqueId());
		LOGGER.debug("got the uniqueid from the signup dao" + signUpDto.getUniqueId());
		
		parameters.put("userId",signUpDto.getUserId());
		LOGGER.debug("got the userid from the signup dao" + signUpDto.getUserId());
		
		parameters.put("course",signUpDto.getCourse());
		LOGGER.debug("got the course from the signup dao" +signUpDto.getCourse());
		
		parameters.put("registeredAs",signUpDto.getRegisteredAs());
		LOGGER.debug("got the registrated as from the signup dao" + signUpDto.getRegisteredAs());
		
		return getJdbcTemplate().update(signUpConfig.getInsertIntoSignUp(), parameters);
		}
		catch(DuplicateKeyException e)
		{
			LOGGER.error("Duplicate key exception occurred " + e);
			/*
			 * Duplicate key exception occurred
			 */
			return 0;
		}
		catch(Exception e)
		{
			LOGGER.error("An exception occured while creating user " + e);
			/*
			 * Any other exception occurred while inserting data in database
			 */
			e.printStackTrace();
			return -1;
		}
	}
}

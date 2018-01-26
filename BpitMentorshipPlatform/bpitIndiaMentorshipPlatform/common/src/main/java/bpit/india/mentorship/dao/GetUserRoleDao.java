package bpit.india.mentorship.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.GetUserCourseAndUserRoleConfig;

@Repository
public class GetUserRoleDao extends AbstractDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(GetUserRoleDao.class);
	@Autowired
	private GetUserCourseAndUserRoleConfig getUserCourseAndUserRoleConfig;
	
	public String getUserRole(String userId)
	{
		try {
		    	LOGGER.debug("inside try block");
		    	LOGGER.debug("creating the hashmap");
			    Map < String, String > parameters = new HashMap < String, String > ();
			    LOGGER.debug("hashmap successfully created");
			    parameters.put("userId", userId);
			    LOGGER.debug("got the userid " );
			    return getJdbcTemplate().queryForObject(getUserCourseAndUserRoleConfig.getGetUserRole(), parameters, String.class);
			  } catch (EmptyResultDataAccessException e) {
				  LOGGER.error("  An error occurred while fetching Course corresponding to user role not found for particular Id " + e);
			   /*
			    * An error occurred while fetching Course corresponding to user 
			    * role not found for particular Id 
			    */
			   e.printStackTrace();
			   return null;
			  }
	}
}

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
public class GetUserCourseDao extends AbstractDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(GetUserCourseDao.class);
 @Autowired
 private GetUserCourseAndUserRoleConfig getUserCourseConfig;
 /*
  * Function to get Course name corresponding to user
  */
 public String getUserCourse(String userId) {
  try {
	  LOGGER.debug("inside try block");
	  LOGGER.debug("creating the hashmap");
	  Map < String, String > parameters = new HashMap < String, String > ();
	  LOGGER.debug("hashmap successfully created");
	  parameters.put("userId", userId);
   LOGGER.debug("got the userid " );
   System.out.println(userId);
   return getJdbcTemplate().queryForObject(getUserCourseConfig.getGetUserCourse(), parameters, String.class);
  } catch (EmptyResultDataAccessException e) {
	  LOGGER.error("  An error occurred while fetching Course corresponding to user course not found for particular Id " + e);
		
   /*
    * An error occurred while fetching Course corresponding to user 
    * course not found for particular Id 
    */
   e.printStackTrace();
   return null;
  }
  catch (Exception e) {
	  LOGGER.error("   Any other exception occurred while getting course for corresponding user " + e);
		
	  /*
	   * Any other exception occurred while getting course for 
	   * corresponding user
	   */
	e.printStackTrace();
	return null;
}
 }




}
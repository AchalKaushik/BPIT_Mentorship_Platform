package bpit.india.mentorship.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.GetUserCourseAndUserRoleConfig;

@Repository
public class GetUserRoleDao extends AbstractDao {

	@Autowired
	private GetUserCourseAndUserRoleConfig getUserCourseAndUserRoleConfig;
	
	public String getUserRole(String userId)
	{
		try {
			   Map < String, String > parameters = new HashMap < String, String > ();
			   parameters.put("userId", userId);
			   return getJdbcTemplate().queryForObject(getUserCourseAndUserRoleConfig.getGetUserRole(), parameters, String.class);
			  } catch (EmptyResultDataAccessException e) {
			   /*
			    * An error occurred while fetching Course corresponding to user 
			    * role not found for particular Id 
			    */
			   e.printStackTrace();
			   return null;
			  }
	}
}

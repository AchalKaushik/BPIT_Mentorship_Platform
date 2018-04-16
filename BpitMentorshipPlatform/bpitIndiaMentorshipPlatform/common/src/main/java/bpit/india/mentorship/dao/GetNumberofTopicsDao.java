package bpit.india.mentorship.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.ForumOperationsConfig;

@Repository
public class GetNumberofTopicsDao extends AbstractDao {

	@Autowired
	private ForumOperationsConfig forumOperationsConfig;
	
	public Integer getNumberofTopics(String category)
	{
		try{
		Map<String, String> parameters = new HashMap<String, String>();
 		
		if(category.trim().equalsIgnoreCase("Technical"))
		{
			return getJdbcTemplate().queryForObject(forumOperationsConfig.getGetNumberofTechnicalTopics(), parameters, Integer.class);
		}
		else if(category.trim().equalsIgnoreCase("NonTechnical"))
		{
			return getJdbcTemplate().queryForObject(forumOperationsConfig.getGetNumberofNonTechnicalTopics(), parameters, Integer.class);
		}
		else
		{
			return null;
		}
		} /* End of try */
		catch(DataAccessException e)
		{
			/*
			 * Query Fails...
			 */
			e.printStackTrace();
			return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}

package bpit.india.mentorship.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.ForumOperationsConfig;

@Repository
public class GetRecentTopicsListDao extends AbstractDao{

	@Autowired
	private ForumOperationsConfig forumOperationsConfig;
	
	public List<String> getRecentTopicsListDao(String category)
	{
		try{
			
		Map<String,String> parameters = new HashMap<String,String >();
		if(category.trim().equalsIgnoreCase("Technical"))
		{
			return getJdbcTemplate().queryForList(forumOperationsConfig.getGetRecentTechnicalTopicsList(),parameters,String.class);
		}
		else if(category.trim().equalsIgnoreCase("NonTechnical"))
		{
			return getJdbcTemplate().queryForList(forumOperationsConfig.getGetRecentNonTechnicalTopicsList(),parameters,String.class);
		}
		else
		{
		/*
		 * Category neither Technical nor Non Technical	
		 */
			return null;
		}
		
		}
		catch(DataAccessException e)
		{
			/*
			 * Query Fails..
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

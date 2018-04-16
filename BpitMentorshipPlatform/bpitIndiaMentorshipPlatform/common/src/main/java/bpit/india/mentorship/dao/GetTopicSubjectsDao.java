package bpit.india.mentorship.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.ForumOperationsConfig;

@Repository
public class GetTopicSubjectsDao extends AbstractDao{

	@Autowired
	private ForumOperationsConfig forumOperationsConfig;
	
	public List<String> getTopicSubjectsDao(String category)
	{
		try{
		Map<String, String> parameters = new HashMap<String, String>();
		
		if(category.trim().equalsIgnoreCase("Technical"))
		{
			return getJdbcTemplate().queryForList(forumOperationsConfig.getGetTechSubjects(), parameters, String.class);
		}
		else if(category.trim().equalsIgnoreCase("NonTechnical"))
		{
			return getJdbcTemplate().queryForList(forumOperationsConfig.getGetNonTechSubjects(), parameters, String.class);
		}
		else
		{
			return null;
		}
		}/* End of Try*/
		catch(DataAccessException e)
		{
			/*
			 * Query fails...
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

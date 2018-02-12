package bpit.india.mentorship.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.ForumOperationsConfig;
import bpit.india.mentorship.dto.GetAllTopicsDto;


@Repository
public class GetAllTopicsDao extends AbstractDao {

	@Autowired
	private ForumOperationsConfig forumOperationsConfig;
	
	private static final GetAllTopicsRowMapper ROW_MAPPER = new  GetAllTopicsRowMapper();
	
	
	public List<GetAllTopicsDto> GetAllTopics()
	{
		try{
			System.out.println("In Dao..");
			System.out.println("Query :"+forumOperationsConfig.getGetAllTopics());
			return getJdbcTemplate().query(forumOperationsConfig.getGetAllTopics(),ROW_MAPPER);
		}
		catch(Exception e)
		{
		return null;
		}
	}
	
	private static class GetAllTopicsRowMapper implements RowMapper<GetAllTopicsDto> {
		
		@Override
		public GetAllTopicsDto mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
		    String topicId = resultSet.getString("topic_id");
		    String topicSubject = resultSet.getString("topic_subject");
		    String topicDate = resultSet.getString("topic_date");
		    String topicCat = resultSet.getString("topic_cat");
		    String topicBy = resultSet.getString("topic_by");

			return new GetAllTopicsDto(topicId, topicSubject, topicDate, topicCat, topicBy);
		}

	}
	
}

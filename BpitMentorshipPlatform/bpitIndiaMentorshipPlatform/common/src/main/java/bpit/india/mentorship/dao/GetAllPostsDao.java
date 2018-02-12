package bpit.india.mentorship.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.ForumOperationsConfig;

import bpit.india.mentorship.dto.GetAllPosts;


@Repository
public class GetAllPostsDao extends AbstractDao{

	@Autowired
	private ForumOperationsConfig forumOperationsConfig;
	
	private static final GetAllPostsRowMapper ROW_MAPPER = new  GetAllPostsRowMapper();
	
	
	public List<GetAllPosts> GetAllPost()
	{
		try{
			System.out.println("In Dao..");
			System.out.println("Query :"+forumOperationsConfig.getGetAllTopics());
			return getJdbcTemplate().query(forumOperationsConfig.getGetAllPosts(),ROW_MAPPER);
		}
		catch(Exception e)
		{
		return null;
		}
	}
	
	private static class GetAllPostsRowMapper implements RowMapper<GetAllPosts> {
		
		@Override
		public GetAllPosts mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
		    String postId = resultSet.getString("post_id");
		    String postContent = resultSet.getString("post_content");
		    String postDate = resultSet.getString("post_date");
		    String postTopic = resultSet.getString("post_topic");
		    String postBy = resultSet.getString("post_by");

			return new GetAllPosts(postId, postContent, postDate, postTopic, postBy);
		}

	}

}

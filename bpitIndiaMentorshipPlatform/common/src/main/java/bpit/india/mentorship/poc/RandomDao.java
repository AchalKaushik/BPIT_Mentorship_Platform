package bpit.india.mentorship.poc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;

@Repository
public class RandomDao extends AbstractDao {

	@Autowired
	private RandomConfig randomConfig;
	
	public int insertIntoTable()
	{
		System.out.println("In dao");
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("userId", "Ruchit.jain15@gmail.com");
		System.out.println("In dao"  + randomConfig.getInsertData().toString());
		return getJdbcTemplate().update(randomConfig.getInsertData(), parameters);
	}
	
	
	
	
	
	private static final RandomRowMapper ROW_MAPPER = new RandomRowMapper(); 
	
	public Collection<RandomDto> selectFromTable()
	{
		Map< String, Object> parameters = new HashMap<String, Object>();
		return getJdbcTemplate().query(randomConfig.getSelectData(), parameters, ROW_MAPPER);
	}
	
	private static class RandomRowMapper implements RowMapper<RandomDto>
	{
		@Override
		public RandomDto mapRow(ResultSet resultSet,int rowNum) throws SQLException
		{
			String userId=resultSet.getString("userId");
			return new RandomDto(userId);
		}
	}
	
}

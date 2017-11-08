package bpit.india.mentorship.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.LibraryOperationsConfig;
import bpit.india.mentorship.dto.GetLibraryIdFileNameSemesterBranchTypeCourseDto;

@Repository
public class GetLibraryIdFileNameSemesterBranchTypeCourseFromUserIdDao extends AbstractDao{

	@Autowired
	private LibraryOperationsConfig libraryOperationsConfig;
	
	private static final GetLibraryIdAndFileNameFromUserIdRowMapper ROW_MAPPER = new  GetLibraryIdAndFileNameFromUserIdRowMapper();
	
	public Collection<GetLibraryIdFileNameSemesterBranchTypeCourseDto> getLibraryIdFileNameSemesterBranchTypeCourseFromUserId()
	{
		
		try{
		Map<String, String> parameters = new HashMap<String, String>();
		
		String userId="achalkaushik@bpitindia.com";
		
		parameters.put("userId", userId);
		
		return getJdbcTemplate().query(libraryOperationsConfig.getGetLibraryIdFileNameSemesterBranchTypeCourse(), parameters, ROW_MAPPER);
		}
		catch(Exception e)
		{
			/*
			 * An exception occurred while fetching details of uploads of a user
			 */
			e.printStackTrace();
			return null;
		}
	}
	
	private static class GetLibraryIdAndFileNameFromUserIdRowMapper implements RowMapper<GetLibraryIdFileNameSemesterBranchTypeCourseDto> {

		@Override
		public GetLibraryIdFileNameSemesterBranchTypeCourseDto mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
		    String libraryId = resultSet.getString("libraryId");
			String fileName = resultSet.getString("fileName");
			String semester = resultSet.getString("semester");
			String branch = resultSet.getString("branch");
			String type = resultSet.getString("type");
			String course = resultSet.getString("course");
			
			return new GetLibraryIdFileNameSemesterBranchTypeCourseDto(libraryId, fileName, semester, branch, type, course);
		}

	}
	
}

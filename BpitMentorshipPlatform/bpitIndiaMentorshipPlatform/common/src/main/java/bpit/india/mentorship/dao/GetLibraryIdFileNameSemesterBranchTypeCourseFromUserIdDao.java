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

	private static final Logger LOGGER = LoggerFactory.getLogger(GetLibraryIdFileNameSemesterBranchTypeCourseFromUserIdDao.class);
	
	@Autowired
	private LibraryOperationsConfig libraryOperationsConfig;
	
	private static final GetLibraryIdAndFileNameFromUserIdRowMapper ROW_MAPPER = new  GetLibraryIdAndFileNameFromUserIdRowMapper();
	
	public Collection<GetLibraryIdFileNameSemesterBranchTypeCourseDto> getLibraryIdFileNameSemesterBranchTypeCourseFromUserId()
	{
		
		try{
			LOGGER.debug("inside try block");
		    LOGGER.debug("creating the hashmap");
			
		Map<String, String> parameters = new HashMap<String, String>();
		LOGGER.debug("hashmap successfully created");
		String userId="achalkaushik@bpitindia.com";
		
		parameters.put("userId", userId);
		 LOGGER.debug("got the userid ");
		
		return getJdbcTemplate().query(libraryOperationsConfig.getGetLibraryIdFileNameSemesterBranchTypeCourse(), parameters, ROW_MAPPER);
		}
		catch(Exception e)
		{
			LOGGER.error("An exception occurred while fetching details of uploads of a user" + e);
			/*
			 * An exception occurred while fetching details of uploads of a user
			 */
			e.printStackTrace();
			return null;
		}
	}
	
	private static class GetLibraryIdAndFileNameFromUserIdRowMapper implements RowMapper<GetLibraryIdFileNameSemesterBranchTypeCourseDto> {

		private static final Logger LOGGER = LoggerFactory.getLogger( GetLibraryIdAndFileNameFromUserIdRowMapper.class);
		@Override
		public GetLibraryIdFileNameSemesterBranchTypeCourseDto mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
			
		    String libraryId = resultSet.getString("libraryId");
		    LOGGER.debug("got the value of the libraryid ");
			String fileName = resultSet.getString("fileName");
			LOGGER.debug("got the value of the filename ");
			String semester = resultSet.getString("semester");
			LOGGER.debug("got the value of the semister ");
			String branch = resultSet.getString("branch");
			LOGGER.debug("got the value of the branch ");
			String type = resultSet.getString("type");
			LOGGER.debug("got the value of the type ");
			String course = resultSet.getString("course");
			LOGGER.debug("got the value of the course ");
			
			return new GetLibraryIdFileNameSemesterBranchTypeCourseDto(libraryId, fileName, semester, branch, type, course);
		}

	}
	
}

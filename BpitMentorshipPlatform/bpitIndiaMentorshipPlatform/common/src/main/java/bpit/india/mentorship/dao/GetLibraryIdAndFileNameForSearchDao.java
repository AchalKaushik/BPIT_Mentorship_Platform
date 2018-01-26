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
import bpit.india.mentorship.dto.GetInfoToFetchFileNamesDto;
import bpit.india.mentorship.dto.GetLibraryIdAndFileNameDto;
import bpit.india.mentorship.service.GetUserCourseService;

@Repository
public class GetLibraryIdAndFileNameForSearchDao extends AbstractDao{
	private static final Logger LOGGER = LoggerFactory.getLogger(GetLibraryIdAndFileNameForSearchDao.class);
	@Autowired
	private LibraryOperationsConfig libraryOperationsConfig;
	
	@Autowired
	private GetUserCourseService getUserCourseService;
	LOGGER.debug("creating the reference of the GetLibraryIdAndFileNameForSearchRowMapper ");
	private static final GetLibraryIdAndFileNameForSearchRowMapper ROW_MAPPER = new  GetLibraryIdAndFileNameForSearchRowMapper();
	LOGGER.debug("successfully created the reference");
	public Collection<GetLibraryIdAndFileNameDto> getLibraryIdAndFileNameForSearch(GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto,String typeOfRequest)
	{
		try{
			LOGGER.debug("inside try block");
			LOGGER.debug("creating the hashmap");
			Map<String, Object> parameters= new HashMap<String, Object>();
			LOGGER.debug("hashmap successfully created");
			/*
			 * Hardcoding course for now ( till session management is done ) 
			 */
				
			System.out.println("Branch in search is : "+ getInfoToFetchFileNamesDto.getBranch());
			
			
			
			
			parameters.put("course", getUserCourseService.getUserCouse(getInfoToFetchFileNamesDto.getUserId()));
			LOGGER.debug("got the course");
			parameters.put("semester", getInfoToFetchFileNamesDto.getSemester());
			LOGGER.debug("got the semister");
			if(getInfoToFetchFileNamesDto.getBranch().trim().equalsIgnoreCase("Select Branch"))
			{ 
				LOGGER.debug("branch null");
				parameters.put("branch","NULL");
			}
			else
			{
			
			parameters.put("branch", getInfoToFetchFileNamesDto.getBranch());
			LOGGER.debug("putted the branch" +getInfoToFetchFileNamesDto.getBranch() );
			}
			
			
			parameters.put("subject", getInfoToFetchFileNamesDto.getSubject());
			LOGGER.debug("putted the subject" +getInfoToFetchFileNamesDto.getSubject());
			
			if(typeOfRequest.equalsIgnoreCase("Search"))
			{
				LOGGER.debug("typeof request =search");
				parameters.put("type", getInfoToFetchFileNamesDto.getType());
				return getJdbcTemplate().query(libraryOperationsConfig.getGetLibraryIdAndFileNameForSearch(), parameters, ROW_MAPPER);
			}
			else if(typeOfRequest.equalsIgnoreCase("FileNameValidation"))
			{
				LOGGER.debug("type of request= filename validation");
				return getJdbcTemplate().query(libraryOperationsConfig.getGetAllFileNamesFromLibrary(), parameters, ROW_MAPPER);
			}
			else
			{
				LOGGER.debug("Type of request not recognized ..");
				/*
				 * Type of request not recognized ..
				 */
				return null;
			}
			
			}
			catch(Exception e)
			{
				LOGGER.error("An error occurred while getting fileNames and libraryId for required files  " + e);
				/*
				 * An error occurred while getting fileNames and libraryId for required files 
				 */
				e.printStackTrace();
				return null;
			}
	}
	
	private static class GetLibraryIdAndFileNameForSearchRowMapper implements RowMapper<GetLibraryIdAndFileNameDto> {
		private static final Logger LOGGER = LoggerFactory.getLogger( GetLibraryIdAndFileNameForSearchRowMapper.class);
		@Override
		public GetLibraryIdAndFileNameDto mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
		    String libraryId = resultSet.getString("libraryId");
		    LOGGER.debug("got the value of the libraryid ");
			String fileName = resultSet.getString("fileName");
		    LOGGER.debug("got the value of the filename ");
			
			return new GetLibraryIdAndFileNameDto(libraryId, fileName);
		}

	}
	
}

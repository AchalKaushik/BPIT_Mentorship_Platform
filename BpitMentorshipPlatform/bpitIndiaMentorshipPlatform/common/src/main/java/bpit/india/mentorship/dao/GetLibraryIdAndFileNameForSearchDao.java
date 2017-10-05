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

@Repository
public class GetLibraryIdAndFileNameForSearchDao extends AbstractDao{

	@Autowired
	private LibraryOperationsConfig libraryOperationsConfig;
	
	
	private static final GetLibraryIdAndFileNameForSearchRowMapper ROW_MAPPER = new  GetLibraryIdAndFileNameForSearchRowMapper();
	
	public Collection<GetLibraryIdAndFileNameDto> getLibraryIdAndFileNameForSearch(GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto,String typeOfRequest)
	{
		try{
			Map<String, Object> parameters= new HashMap<String, Object>();
			/*
			 * Hardcoding course for now ( till session management is done ) 
			 */
			parameters.put("course", getInfoToFetchFileNamesDto.getCourse());
			parameters.put("semester", getInfoToFetchFileNamesDto.getSemester());
			parameters.put("branch", getInfoToFetchFileNamesDto.getBranch());
			parameters.put("subject", getInfoToFetchFileNamesDto.getSubject());
			
			
			if(typeOfRequest.equalsIgnoreCase("Search"))
			{
				parameters.put("type", getInfoToFetchFileNamesDto.getType());
				return getJdbcTemplate().query(libraryOperationsConfig.getGetLibraryIdAndFileNameForSearch(), parameters, ROW_MAPPER);
			}
			else if(typeOfRequest.equalsIgnoreCase("FileNameValidation"))
			{
				return getJdbcTemplate().query(libraryOperationsConfig.getGetAllFileNamesFromLibrary(), parameters, ROW_MAPPER);
			}
			else
			{
				/*
				 * Type of request not recognized ..
				 */
				return null;
			}
			
			}
			catch(Exception e)
			{
				/*
				 * An error occurred while getting fileNames and libraryId for required files 
				 */
				e.printStackTrace();
				return null;
			}
	}
	
	private static class GetLibraryIdAndFileNameForSearchRowMapper implements RowMapper<GetLibraryIdAndFileNameDto> {

		@Override
		public GetLibraryIdAndFileNameDto mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
		    String libraryId = resultSet.getString("libraryId");
			String fileName = resultSet.getString("fileName");
			
			return new GetLibraryIdAndFileNameDto(libraryId, fileName);
		}

	}
	
}

package bpit.india.mentorship.dao;

import java.sql.Date;
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
public class LibraryUploadFileDao extends AbstractDao{

	@Autowired
	private LibraryOperationsConfig libraryOperationsConfig;
	
	
	public int insertIntoLibrary(HashMap<String, Object> getDataForLibrary)
	{
		try{
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("userId", getDataForLibrary.get("userId"));
		parameters.put("fileName", getDataForLibrary.get("fileName"));
		parameters.put("type", getDataForLibrary.get("type"));
		parameters.put("semester", getDataForLibrary.get("semester"));
		parameters.put("course", getDataForLibrary.get("course"));
		parameters.put("subject", getDataForLibrary.get("subject"));
		parameters.put("branch", getDataForLibrary.get("branch"));
		parameters.put("locationOfUploadedFile", getDataForLibrary.get("locationOfUploadedFile"));
		Date date=new Date(System.currentTimeMillis());	
		parameters.put("uploadDate", date);
		return getJdbcTemplate().update(libraryOperationsConfig.getInsertIntoLibrary(), parameters);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return -1;
		}
	}
	
	
	private static final GetLibraryIdAndFileNameRowMapper ROW_MAPPER = new  GetLibraryIdAndFileNameRowMapper();
	
	public Collection<GetLibraryIdAndFileNameDto> getLibraryIdAndFileName(GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto)
	{
		try{
		Map<String, Object> parameters= new HashMap<String, Object>();
		parameters.put("course",getInfoToFetchFileNamesDto.getCourse());
		parameters.put("semester", getInfoToFetchFileNamesDto.getSemester());
		parameters.put("branch", getInfoToFetchFileNamesDto.getBranch());
		parameters.put("subject", getInfoToFetchFileNamesDto.getSubject());
		return getJdbcTemplate().query(libraryOperationsConfig.getGetLibraryIdAndFileName(), parameters, ROW_MAPPER);
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
	
	 private static class GetLibraryIdAndFileNameRowMapper implements RowMapper<GetLibraryIdAndFileNameDto> {

			@Override
			public GetLibraryIdAndFileNameDto mapRow(ResultSet resultSet, int rowNum)
					throws SQLException {
			    String libraryId = resultSet.getString("libraryId");
				String fileName = resultSet.getString("fileName");
				
				return new GetLibraryIdAndFileNameDto(libraryId, fileName);
			}

		}
		
	
	
}

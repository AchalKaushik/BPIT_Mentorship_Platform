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
	
	
}

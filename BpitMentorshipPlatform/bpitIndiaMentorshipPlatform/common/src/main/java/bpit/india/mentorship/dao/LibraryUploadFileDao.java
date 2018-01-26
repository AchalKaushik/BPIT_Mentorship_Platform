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
	private static final Logger LOGGER = LoggerFactory.getLogger(LibraryUploadFileDao.class);
	@Autowired
	private LibraryOperationsConfig libraryOperationsConfig;
	
	
	public int insertIntoLibrary(HashMap<String, Object> getDataForLibrary)
	{
		try{
			LOGGER.debug("inside try block");
			LOGGER.debug("creating the hashmap");
		Map<String, Object> parameters = new HashMap<String, Object>();
		LOGGER.debug("hashmap successfully created");
		
		parameters.put("userId", getDataForLibrary.get("userId"));
		LOGGER.debug("got the userid from the getDataForLibrary dao" + getDataForLibrary.get("userId"));
		
		parameters.put("fileName", getDataForLibrary.get("fileName"));
		LOGGER.debug("got the file name from the getDataForLibrary dao" + getDataForLibrary.get("fileName"));
		
		parameters.put("type", getDataForLibrary.get("type"));
		LOGGER.debug("got the type from the getDataForLibrary dao" + getDataForLibrary.get("type"));
		
		parameters.put("semester", getDataForLibrary.get("semester"));
		LOGGER.debug("got the semister from the getDataForLibrary dao" + getDataForLibrary.get("semester"));
		
		parameters.put("course", getDataForLibrary.get("course"));
		LOGGER.debug("got the course from the getDataForLibrary dao" +  getDataForLibrary.get("course"));
		
		parameters.put("subject", getDataForLibrary.get("subject"));
		LOGGER.debug("got the subject from the getDataForLibrary dao" +  getDataForLibrary.get("subject"));
		
		parameters.put("branch", getDataForLibrary.get("branch"));
		LOGGER.debug("got the branch from the getDataForLibrary dao" + getDataForLibrary.get("branch"));
		
		parameters.put("locationOfUploadedFile", getDataForLibrary.get("locationOfUploadedFile"));
		LOGGER.debug("got the locationOfUploadedFile from the getDataForLibrary dao" + getDataForLibrary.get("locationOfUploadedFile"));
		
		Date date=new Date(System.currentTimeMillis());	
		parameters.put("uploadDate", date);
		LOGGER.debug("got the date from the getDataForLibrary dao");
		
		return getJdbcTemplate().update(libraryOperationsConfig.getInsertIntoLibrary(), parameters);
		}
		catch(Exception e)
		{
			LOGGER.error("An exception occured while creating user " + e);
			e.printStackTrace();
			return -1;
		}
	}
	
	
}

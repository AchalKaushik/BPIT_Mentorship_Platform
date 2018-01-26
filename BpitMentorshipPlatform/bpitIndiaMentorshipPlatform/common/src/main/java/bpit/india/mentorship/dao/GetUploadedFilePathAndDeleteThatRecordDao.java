package bpit.india.mentorship.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.LibraryOperationsConfig;

@Repository
public class GetUploadedFilePathAndDeleteThatRecordDao extends AbstractDao{
	private static final Logger LOGGER = LoggerFactory.getLogger(GetUploadedFilePathAndDeleteThatRecordDao.class);
	
	@Autowired
	private LibraryOperationsConfig libraryOperationsConfig;
	
	public String getUploadedFilePath(String libraryId)
	{
		
		try{
			LOGGER.debug("inside try block for getuploadfile path");
			LOGGER.debug("creating the hashmap");
		Map<String, String> parameters = new HashMap<String, String>();
		LOGGER.debug("hashmap successfully created");
		
		parameters.put("libraryId", libraryId);
		 LOGGER.debug("got the libraryid " );
		 
		return getJdbcTemplate().queryForObject(libraryOperationsConfig.getGetFilePathFromLibraryId(), parameters, String.class);
		}
		catch(Exception e)
		{
			LOGGER.error("an exception occurred " + e);
			e.printStackTrace();
			return null;
		}
	}
	
	
	public int deleteFromLibrary(String libraryId)
	{
		try{
			LOGGER.debug("inside try block for deletefrom library");
			LOGGER.debug("creating the hashmap");
			
		Map<String, String> parameters = new HashMap<String, String>();
		LOGGER.debug("hashmap successfully created");
		parameters.put("libraryId",libraryId);

		 LOGGER.debug("got the libraryid " );
		
		 return getJdbcTemplate().update(libraryOperationsConfig.getDeleteFromLibrary(), parameters);
		}
		catch(Exception e)
		{
			LOGGER.error("an exception occurred " + e);
			e.printStackTrace();
			return -1;
		}
	}
	
	
	
}

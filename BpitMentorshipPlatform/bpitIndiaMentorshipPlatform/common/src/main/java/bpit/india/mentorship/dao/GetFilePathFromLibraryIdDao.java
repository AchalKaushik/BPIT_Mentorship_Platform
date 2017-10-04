package bpit.india.mentorship.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.LibraryOperationsConfig;

@Repository
public class GetFilePathFromLibraryIdDao extends AbstractDao {

	@Autowired
	private LibraryOperationsConfig libraryOperationsConfig;
	
	public String getFilePathFromLibraryIdDao(String libraryId)
	{
		try{
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("libraryId", libraryId);
		return getJdbcTemplate().queryForObject(libraryOperationsConfig.getGetFilePathFromLibraryId(), parameters, String.class);
		}
		catch(Exception e)
		{
			/*
			 * An exception occurred while getting file path from DB 
			 * corresponding to libraryId
			 */
			e.printStackTrace();
			return null;
		}
		
	}
}

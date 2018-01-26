package bpit.india.mentorship.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.LibraryOperationsConfig;
import bpit.india.mentorship.dto.GetInfoToFetchFileNamesDto;

@Repository
public class GetAllFileNamesFromLibraryDao extends AbstractDao{
	private static final Logger LOGGER = LoggerFactory.getLogger(GetAllFileNamesFromLibraryDao.class);
	
	@Autowired
	private LibraryOperationsConfig libraryOperationsConfig; 
	
	
	public List<String> getAllFileNamesFromLibrary(GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto )
	{
		try{
			LOGGER.debug("inside try block");
			LOGGER.debug("creating the hashmap");
		Map<String, String> parameters = new HashMap<String, String>();
		LOGGER.debug("hashmap successfully created");
		
		parameters.put("course", getInfoToFetchFileNamesDto.getCourse());
		LOGGER.debug("got the course from the getInfoToFetchFileNamesDto" + getInfoToFetchFileNamesDto.getCourse());
		
		parameters.put("semester", getInfoToFetchFileNamesDto.getSemester());
		LOGGER.debug("got the semister from the getInfoToFetchFileNamesDto" +  getInfoToFetchFileNamesDto.getSemester());
		parameters.put("subject", getInfoToFetchFileNamesDto.getSubject());
		LOGGER.debug("got the subject from the getInfoToFetchFileNamesDto" +getInfoToFetchFileNamesDto.getSubject());
		parameters.put("branch", getInfoToFetchFileNamesDto.getBranch());
		LOGGER.debug("got the branch from the getInfoToFetchFileNamesDto" + getInfoToFetchFileNamesDto.getBranch());
		
		return getJdbcTemplate().queryForList(libraryOperationsConfig.getGetAllFileNamesFromLibrary(),parameters,String.class);
		}
		catch(DataAccessException e)
		{
			LOGGER.error("An error occurred while getting list of fileNmaes " + e);
			/*
			 * An error occurred while getting list of fileNmaes
			 */
			e.printStackTrace();
			return null;
		}
		catch (Exception e) {
			LOGGER.error("Any other exception occurred while getting list of fileNames " + e);
			/*
			 * Any other exception occurred while getting list of fileNames
			 */
			e.printStackTrace();
			return null;
		}
	}
}

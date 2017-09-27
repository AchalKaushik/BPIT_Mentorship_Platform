package bpit.india.mentorship.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.LibraryOperationsConfig;
import bpit.india.mentorship.dto.GetInfoToFetchFileNamesDto;

@Repository
public class GetAllFileNamesFromLibraryDao extends AbstractDao{

	@Autowired
	private LibraryOperationsConfig libraryOperationsConfig; 
	
	
	public List<String> getAllFileNamesFromLibrary(GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto )
	{
		try{
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("type", getInfoToFetchFileNamesDto.getType());
		parameters.put("course", getInfoToFetchFileNamesDto.getCourse());
		parameters.put("semester", getInfoToFetchFileNamesDto.getSemester());
		parameters.put("subject", getInfoToFetchFileNamesDto.getSubject());
		parameters.put("stream", getInfoToFetchFileNamesDto.getStream());
		return getJdbcTemplate().queryForList(libraryOperationsConfig.getGetAllFileNamesFromLibrary(),parameters,String.class);
		}
		catch(DataAccessException e)
		{
			/*
			 * An error occurred while getting list of fileNmaes
			 */
			e.printStackTrace();
			return null;
		}
		catch (Exception e) {
			/*
			 * Any other exception occurred while getting list of fileNames
			 */
			e.printStackTrace();
			return null;
		}
	}
}

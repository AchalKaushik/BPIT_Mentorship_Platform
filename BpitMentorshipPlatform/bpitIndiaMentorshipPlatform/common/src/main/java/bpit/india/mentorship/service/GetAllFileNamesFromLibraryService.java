package bpit.india.mentorship.service;


import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetAllFileNamesFromLibraryDao;
import bpit.india.mentorship.dto.GetInfoToFetchFileNamesDto;

@Service
public class GetAllFileNamesFromLibraryService {

	private static final Logger LOGGER = LoggerFactory.getLogger(GetAllFileNamesFromLibraryService.class);
	
	@Autowired
	private GetAllFileNamesFromLibraryDao getAllFileNamesFromLibraryDao;
	
	
	public List<String> getAllFileNames(GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto)
	{
		LOGGER.debug("successfully created the list for the filenames");
		try{
			LOGGER.debug("inside try block");
			/*
			 * If null is returned then an exception have occurred while
			 * getting fileNames corresponding type,semester,course,subject 
			 */
		return getAllFileNamesFromLibraryDao.getAllFileNamesFromLibrary(getInfoToFetchFileNamesDto);
		}
		catch(Exception e)
		{
			LOGGER.error("An exception occurred while returning all file names");
			/*
			 * An exception occurred while returning all file names 
			 */
			e.printStackTrace();
			return null;
		}
	}
}

package bpit.india.mentorship.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetAllFileNamesFromLibraryDao;
import bpit.india.mentorship.dto.GetInfoToFetchFileNamesDto;

@Service
public class GetAllFileNamesFromLibraryService {

	@Autowired
	private GetAllFileNamesFromLibraryDao getAllFileNamesFromLibraryDao;
	
	public List<String> getAllFileNames(GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto)
	{
		try{
			/*
			 * If null is returned then an exception have occurred while
			 * getting fileNames corresponding type,semester,course,subject 
			 */
		return getAllFileNamesFromLibraryDao.getAllFileNamesFromLibrary(getInfoToFetchFileNamesDto);
		}
		catch(Exception e)
		{
			/*
			 * An exception occurred while returning all file names 
			 */
			e.printStackTrace();
			return null;
		}
	}
}

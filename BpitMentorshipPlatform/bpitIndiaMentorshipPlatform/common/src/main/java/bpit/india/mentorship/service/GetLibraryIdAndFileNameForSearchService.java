package bpit.india.mentorship.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetLibraryIdAndFileNameForSearchDao;
import bpit.india.mentorship.dto.GetInfoToFetchFileNamesDto;
import bpit.india.mentorship.dto.GetLibraryIdAndFileNameDto;

@Service
public class GetLibraryIdAndFileNameForSearchService {

	@Autowired
	private GetLibraryIdAndFileNameForSearchDao getLibraryIdAndFileNameForSearchDao;
	
	public Collection<GetLibraryIdAndFileNameDto> getLibraryIdAndFileNameForSearch(GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto) 
	{
		try{
			Collection<GetLibraryIdAndFileNameDto> libraryIdAndFileNameForSearch = getLibraryIdAndFileNameForSearchDao.getLibraryIdAndFileNameForSearch(getInfoToFetchFileNamesDto);
			if(libraryIdAndFileNameForSearch.equals(null))
			{
				/*
				 * No notes or ebooks corresponding to entered subject exists 
				 */
				return null;
			}
			else 
			{
				return libraryIdAndFileNameForSearch;
			}
		}
		catch(Exception e)
		{
			/*
			 * An exception occurred while getting filename and libraryid for 
			 * specific subject notes/ebooks
			 */
			e.printStackTrace();
			return null;
		}	}
}

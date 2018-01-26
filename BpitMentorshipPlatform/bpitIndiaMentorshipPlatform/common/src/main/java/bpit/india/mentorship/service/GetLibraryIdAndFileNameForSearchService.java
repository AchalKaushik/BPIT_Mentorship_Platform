package bpit.india.mentorship.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetLibraryIdAndFileNameForSearchDao;
import bpit.india.mentorship.dto.GetInfoToFetchFileNamesDto;
import bpit.india.mentorship.dto.GetLibraryIdAndFileNameDto;

@Service
public class GetLibraryIdAndFileNameForSearchService {
	private static final Logger LOGGER = LoggerFactory.getLogger(GetLibraryIdAndFileNameFromUserIdService.class);

	@Autowired
	private GetLibraryIdAndFileNameForSearchDao getLibraryIdAndFileNameForSearchDao;
	
	LOGGER.debug("creating a object of collection for getting lib id and filename for search ");
	public Collection<GetLibraryIdAndFileNameDto> getLibraryIdAndFileNameForSearch(GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto) 
	{
		LOGGER.debug("creating a string for type of request");
		
		String typeOfRequest = "Search";
		LOGGER.debug("String created "+ typeOfRequest);
		try{
			LOGGER.debug("in try block");
			Collection<GetLibraryIdAndFileNameDto> libraryIdAndFileNameForSearch = getLibraryIdAndFileNameForSearchDao.getLibraryIdAndFileNameForSearch(getInfoToFetchFileNamesDto,typeOfRequest);
			System.out.println(libraryIdAndFileNameForSearch);
			return libraryIdAndFileNameForSearch;
		}
		catch(Exception e)
		{
			LOGGER.error("An exception occurred while getting filename and libraryid for specific subject notes/ebooks");
			/*
			 * An exception occurred while getting filename and libraryid for 
			 * specific subject notes/ebooks
			 */
			e.printStackTrace();
			return null;
		}	}
}

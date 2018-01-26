package bpit.india.mentorship.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetLibraryIdAndFileNameForSearchDao;
import bpit.india.mentorship.dto.GetInfoToFetchFileNamesDto;
import bpit.india.mentorship.dto.GetLibraryIdAndFileNameDto;

@Service
public class GetFileNameAndLibraryIdService {
	private static final Logger LOGGER = LoggerFactory.getLogger(GetFileNameAndLibraryIdService.class);
	
	@Autowired
	private GetLibraryIdAndFileNameForSearchDao getLibraryIdAndFileNameForSearchDao;
	
	public Collection<GetLibraryIdAndFileNameDto> getfileNameAndLibraryId(GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto)
	{

		LOGGER.debug("Request Received from Controller");
        LOGGER.debug("In GetFileNameAndLibraryIdService - getCollection");
       
        LOGGER.debug("creating the string type of request for file name validation");
       String typeOfRequest = "FileNameValidation";
		System.out.println("In service" + getInfoToFetchFileNamesDto.getBranch());
		
		try{
			Collection<GetLibraryIdAndFileNameDto> libraryIdAndFileName =getLibraryIdAndFileNameForSearchDao.getLibraryIdAndFileNameForSearch(getInfoToFetchFileNamesDto,typeOfRequest);
			LOGGER.debug("In GetLibraryIdAndFileNameDto - getCollection");
			LOGGER.debug("returning the library id and filename");
			return libraryIdAndFileName;
		
		}
		catch(Exception e)
		{
			LOGGER.error("An exception occurred while getting list of filenames and libraryid for specific subject notes/ebooks");
			/*
			 * An exception occurred while getting list of filenames and libraryid for 
			 * specific subject notes/ebooks
			 */
			e.printStackTrace();
			return null;
		}
	}
}

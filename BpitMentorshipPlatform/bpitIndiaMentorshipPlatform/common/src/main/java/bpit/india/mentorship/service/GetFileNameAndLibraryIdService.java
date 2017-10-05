package bpit.india.mentorship.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetLibraryIdAndFileNameForSearchDao;
import bpit.india.mentorship.dto.GetInfoToFetchFileNamesDto;
import bpit.india.mentorship.dto.GetLibraryIdAndFileNameDto;

@Service
public class GetFileNameAndLibraryIdService {

	@Autowired
	private GetLibraryIdAndFileNameForSearchDao getLibraryIdAndFileNameForSearchDao;
	
	public Collection<GetLibraryIdAndFileNameDto> getfileNameAndLibraryId(GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto)
	{
		String typeOfRequest = "FileNameValidation";
		System.out.println("In service" + getInfoToFetchFileNamesDto.getBranch());
		
		try{
			Collection<GetLibraryIdAndFileNameDto> libraryIdAndFileName =getLibraryIdAndFileNameForSearchDao.getLibraryIdAndFileNameForSearch(getInfoToFetchFileNamesDto,typeOfRequest);
				return libraryIdAndFileName;
		
		}
		catch(Exception e)
		{
			/*
			 * An exception occurred while getting list of filenames and libraryid for 
			 * specific subject notes/ebooks
			 */
			e.printStackTrace();
			return null;
		}
	}
}

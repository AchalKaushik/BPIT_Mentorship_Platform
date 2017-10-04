package bpit.india.mentorship.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.LibraryUploadFileDao;
import bpit.india.mentorship.dto.GetInfoToFetchFileNamesDto;
import bpit.india.mentorship.dto.GetLibraryIdAndFileNameDto;

@Service
public class GetFileNameAndLibraryIdService {

	@Autowired
	private LibraryUploadFileDao libraryUploadFileDao;
	
	public Collection<GetLibraryIdAndFileNameDto> getfileNameAndLibraryId(GetInfoToFetchFileNamesDto getInfoToFetchFileNamesDto)
	{
		try{
			Collection<GetLibraryIdAndFileNameDto> libraryIdAndFileName =libraryUploadFileDao.getLibraryIdAndFileName(getInfoToFetchFileNamesDto);
			if(libraryIdAndFileName.equals(null))
			{
				/*
				 * No notes or ebooks corresponding to entered subject exists 
				 */
				return null;
			}
			else 
			{
				return libraryIdAndFileName;
			}
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

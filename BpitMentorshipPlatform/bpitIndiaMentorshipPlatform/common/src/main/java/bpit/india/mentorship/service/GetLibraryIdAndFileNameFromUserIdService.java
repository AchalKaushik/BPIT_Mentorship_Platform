package bpit.india.mentorship.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetLibraryIdFileNameSemesterBranchTypeCourseFromUserIdDao;
import bpit.india.mentorship.dto.GetLibraryIdFileNameSemesterBranchTypeCourseDto;

@Service
public class GetLibraryIdAndFileNameFromUserIdService {

	@Autowired
	private GetLibraryIdFileNameSemesterBranchTypeCourseFromUserIdDao getLibraryIdFileNameSemesterBranchTypeCourseFromUserIdDao;
	
	public Collection<GetLibraryIdFileNameSemesterBranchTypeCourseDto> getLibraryIdAndFileNameFromUserId()
	{
		Collection<GetLibraryIdFileNameSemesterBranchTypeCourseDto> result = new ArrayList<GetLibraryIdFileNameSemesterBranchTypeCourseDto>();
		
		result = getLibraryIdFileNameSemesterBranchTypeCourseFromUserIdDao.getLibraryIdFileNameSemesterBranchTypeCourseFromUserId();
		
		if(result.size()>0)
		{
			System.out.println("Result > 0 "+ result);
			return result;
		}
		else 
		{
			/*
			 * No record found or exception occurred 
			 */
			return null;
		}
	}
}

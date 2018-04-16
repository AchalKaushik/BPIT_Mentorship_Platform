package bpit.india.mentorship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetTopicSubjectsDao;

@Service
public class GetTopicSubjectsService {

	@Autowired
	private GetTopicSubjectsDao getTopicSubjectsDao;
	
	public List<String> getTopicSubjectsService(String category)
	{
		try{
		return getTopicSubjectsDao.getTopicSubjectsDao(category);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}

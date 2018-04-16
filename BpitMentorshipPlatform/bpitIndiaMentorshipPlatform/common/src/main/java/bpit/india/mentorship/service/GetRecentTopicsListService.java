package bpit.india.mentorship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetRecentTopicsListDao;

@Service
public class GetRecentTopicsListService {

	@Autowired
	private GetRecentTopicsListDao getRecentTopicsListDao;
	
	
	public List<String> getRecentTopicsList(String category)
	{
		try{
		return getRecentTopicsListDao.getRecentTopicsListDao(category);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}

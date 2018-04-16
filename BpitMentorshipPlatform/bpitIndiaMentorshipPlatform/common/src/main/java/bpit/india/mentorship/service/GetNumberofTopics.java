package bpit.india.mentorship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetNumberofTopicsDao;

@Service
public class GetNumberofTopics {

	@Autowired
	private GetNumberofTopicsDao getNumberofTopicsDao;
	
	public Integer getNumberofTopicsService(String category)
	{
		try{
		return getNumberofTopicsDao.getNumberofTopics(category);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}

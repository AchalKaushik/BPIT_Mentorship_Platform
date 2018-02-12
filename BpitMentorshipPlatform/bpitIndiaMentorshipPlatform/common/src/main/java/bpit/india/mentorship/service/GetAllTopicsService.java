package bpit.india.mentorship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetAllTopicsDao;
import bpit.india.mentorship.dto.GetAllTopicsDto;

@Service
public class GetAllTopicsService {

	@Autowired
	private GetAllTopicsDao getAllTopicsDao;
	
	public List<GetAllTopicsDto> GetAllTopics()
	{
		System.out.println("In Service..");
		return getAllTopicsDao.GetAllTopics();		
	}
}

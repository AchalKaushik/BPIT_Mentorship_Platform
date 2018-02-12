package bpit.india.mentorship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.dao.GetAllPostsDao;
import bpit.india.mentorship.dto.GetAllPosts;

@Service
public class GetAllPostsService {
	
	@Autowired
	private GetAllPostsDao getAllPostsDao;
	
	
	public List<GetAllPosts> GetAllPosts()
	{
		return getAllPostsDao.GetAllPost(); 
	}

}

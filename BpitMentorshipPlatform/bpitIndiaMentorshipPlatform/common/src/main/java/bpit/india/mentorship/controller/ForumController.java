package bpit.india.mentorship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bpit.india.mentorship.dto.GetAllPosts;
import bpit.india.mentorship.dto.GetAllTopicsDto;
import bpit.india.mentorship.service.GetAllPostsService;
import bpit.india.mentorship.service.GetAllTopicsService;

@RestController
public class ForumController {
	
	@Autowired
	private GetAllTopicsService getAllTopicsService;
	
	@Autowired
	private GetAllPostsService getAllPostsService;
	
	@RequestMapping("/getAllTopics")
	public List<GetAllTopicsDto> getAllTopics()
	{
		System.out.println("In controller..");
		return getAllTopicsService.GetAllTopics();
	}
	
	
	@RequestMapping("/getAllPosts")
	public List<GetAllPosts> getAllPosts()
	{
		System.out.println("In controller..");
		return getAllPostsService.GetAllPosts(); 
	}

}

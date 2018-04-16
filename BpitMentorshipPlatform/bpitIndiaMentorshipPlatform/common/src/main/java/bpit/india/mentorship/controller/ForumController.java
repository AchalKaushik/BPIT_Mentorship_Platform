package bpit.india.mentorship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bpit.india.mentorship.dto.GetAllPosts;
import bpit.india.mentorship.dto.GetAllTopicsDto;
import bpit.india.mentorship.service.GetAllPostsService;
import bpit.india.mentorship.service.GetAllTopicsService;
import bpit.india.mentorship.service.GetNumberofTopics;
import bpit.india.mentorship.service.GetRecentTopicsListService;
import bpit.india.mentorship.service.GetTopicSubjectsService;

@RestController
public class ForumController {
	
	@Autowired
	private GetAllTopicsService getAllTopicsService;
	
	@Autowired
	private GetAllPostsService getAllPostsService;
	
	@Autowired
	private GetRecentTopicsListService getRecentTopicsListService;
	
	@Autowired
	private GetNumberofTopics getNumberofTopicsService;
	
	@Autowired
	private GetTopicSubjectsService getTopicSubjectsService;
	
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
	
	@RequestMapping("/getAllRecentTechnicalTopics")
	public List<String> getAllRecentTechnicalTopics()
	{
		String category="Technical";
		
		 return getRecentTopicsListService.getRecentTopicsList(category);
	}

	@RequestMapping("/getNumberofTopics")
	public Integer getNumberofTopics()
	{
		String category="Technical";
		
		 return getNumberofTopicsService.getNumberofTopicsService(category);
	}

	
	@RequestMapping("/getTopicSubjects")
	public List<String> getTopicSubjects()
	{
		String category="Technical";
		
		return getTopicSubjectsService.getTopicSubjectsService(category);
	}
}

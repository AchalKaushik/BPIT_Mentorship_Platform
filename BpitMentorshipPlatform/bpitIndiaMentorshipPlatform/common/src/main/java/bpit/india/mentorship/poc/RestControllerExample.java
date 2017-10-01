package bpit.india.mentorship.poc;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {

	@Autowired
	private RandomService randomService; 
	
	@Autowired
	private RandomService1 randomService1;
	
	@RequestMapping(value="/abc")
	public String print()
	{
		return randomService.randomService();
		
	}
	
	@RequestMapping(value="/def")
	public Collection<RandomDto> print1()
	{
		return randomService1.randomService1();
	}
}

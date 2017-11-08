package bpit.india.mentorship.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bpit.india.mentorship.service.GetLibraryIdAndFileNameFromUserIdService;

@Controller
public class randomController {

	
	
	@RequestMapping(value="/")
	public String hey()
	{
		return "index";
	}
	
	
}

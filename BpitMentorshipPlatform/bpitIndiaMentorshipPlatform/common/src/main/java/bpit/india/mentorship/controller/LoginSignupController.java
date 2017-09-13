package bpit.india.mentorship.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bpit.india.mentorship.dto.SignUpDto;
import bpit.india.mentorship.service.SignUpService;

@RestController
public class LoginSignupController {

	@Autowired
	private SignUpService signUpService;
	
	@RequestMapping(value="/SignUp",method=RequestMethod.POST,produces = "application/json")
	public String SignUp(@RequestBody SignUpDto signUpDto)
	{
		/*String a=signUpService.signUp(signUpDto);
		System.out.println(signUpDto.getRegisteredAs()+"   " + signUpDto.getMobileNumber()+ signUpDto.getCourse());
		HashMap<String, String> ab=new HashMap<String, String>();
		ab.put("1",a);
		return ab;*/
	
		return signUpService.signUp(signUpDto);
	}
}


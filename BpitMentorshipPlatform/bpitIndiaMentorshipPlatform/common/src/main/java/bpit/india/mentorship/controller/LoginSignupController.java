package bpit.india.mentorship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bpit.india.mentorship.dto.ChangePasswordDto;
import bpit.india.mentorship.dto.LoginUniqueIdAndPasswordDto;
import bpit.india.mentorship.dto.SignUpDto;
import bpit.india.mentorship.service.ChangePasswordService;
import bpit.india.mentorship.service.GetUserCourseService;
import bpit.india.mentorship.service.GetUserRoleService;
import bpit.india.mentorship.service.LoginService;
import bpit.india.mentorship.service.SignUpService;

@RestController
public class LoginSignupController {

 @Autowired
 private SignUpService signUpService;

 @Autowired
 private LoginService loginService;

 @Autowired
 private GetUserCourseService getUserCourseService;

 @Autowired
 private GetUserRoleService getUserRoleService;
 
 @Autowired
 private ChangePasswordService changePasswordService;

 @RequestMapping(value = "/SignUp", method = RequestMethod.POST, produces = "application/json")
 public String SignUp(@RequestBody SignUpDto signUpDto) {
  /*String a=signUpService.signUp(signUpDto);
  System.out.println(signUpDto.getRegisteredAs()+"   " + signUpDto.getMobileNumber()+ signUpDto.getCourse());
  HashMap<String, String> ab=new HashMap<String, String>();
  ab.put("1",a);
  return ab;*/

  return signUpService.signUp(signUpDto);
 }




 @RequestMapping(value = "/loginAuthenticate", method = RequestMethod.POST, produces = "application/json")
 public String loginAuthenticate(@RequestBody LoginUniqueIdAndPasswordDto loginUniqueIdAndPasswordDto) {
  return loginService.login(loginUniqueIdAndPasswordDto);
 }



 @RequestMapping(value = "/getUserRole", method = RequestMethod.GET, produces = "application/json")
 public String getUserRole(@RequestParam("userId") String userId) {
  return getUserRoleService.getUserRole(userId);

 }


 @RequestMapping(value = "/getUserCourse", method = RequestMethod.GET, produces = "application/json")
 public String getUserCourse(@RequestParam("userId") String userId) {
  return getUserCourseService.getUserCouse(userId);

 }


 @RequestMapping(value = "/changePassword", method = RequestMethod.POST, produces = "application/json")
 public String changePassword(@RequestBody ChangePasswordDto changePasswordDto) {
  return changePasswordService.changePassword(changePasswordDto);

 }
 
 
 

}
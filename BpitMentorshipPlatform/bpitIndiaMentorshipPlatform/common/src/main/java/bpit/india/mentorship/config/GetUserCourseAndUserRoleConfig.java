package bpit.india.mentorship.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "couseNameAndUserRole", locations = "classpath:sql/GetCourseNameAndUserRole.yml")
public class GetUserCourseAndUserRoleConfig {

 private String getUserCourse;
 private String getUserRole;
 

 /**
 * @return the getUserRole
 */
public String getGetUserRole() {
	return getUserRole;
}

/**
 * @param getUserRole the getUserRole to set
 */
public void setGetUserRole(String getUserRole) {
	this.getUserRole = getUserRole;
}

/**
  * @return the getUserCourse
  */
 public String getGetUserCourse() {
  return getUserCourse;
 }

 /**
  * @param getUserCourse the getUserCourse to set
  */
 public void setGetUserCourse(String getUserCourse) {
  this.getUserCourse = getUserCourse;
 }


}
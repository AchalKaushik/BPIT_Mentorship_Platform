package bpit.india.mentorship.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "couseNameAndAllFilesName", locations = "classpath:sql/GetCourseName.yml")
public class GetUserCourseConfig {

 private String getUserCourse;

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
package bpit.india.mentorship.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "changePassword", locations = "classpath:sql/ChangePassword.yml")
public class ChangePasswordConfig {

	private String getCurrentPassword;
	private String changeCurrentPassword;
	/**
	 * @return the getCurrentPassword
	 */
	public String getGetCurrentPassword() {
		return getCurrentPassword;
	}
	/**
	 * @param getCurrentPassword the getCurrentPassword to set
	 */
	public void setGetCurrentPassword(String getCurrentPassword) {
		this.getCurrentPassword = getCurrentPassword;
	}
	/**
	 * @return the changeCurrentPassword
	 */
	public String getChangeCurrentPassword() {
		return changeCurrentPassword;
	}
	/**
	 * @param changeCurrentPassword the changeCurrentPassword to set
	 */
	public void setChangeCurrentPassword(String changeCurrentPassword) {
		this.changeCurrentPassword = changeCurrentPassword;
	}
	
	
}

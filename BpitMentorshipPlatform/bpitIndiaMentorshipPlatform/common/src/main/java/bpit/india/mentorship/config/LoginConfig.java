package bpit.india.mentorship.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix="login",locations="classpath:sql/Login.yml")

public class LoginConfig {

	private String matchUniqueIdAndPassword;

	/**
	 * @return the matchUniqueIdAndPassword
	 */
	public String getMatchUniqueIdAndPassword() {
		return matchUniqueIdAndPassword;
	}

	/**
	 * @param matchUniqueIdAndPassword the matchUniqueIdAndPassword to set
	 */
	public void setMatchUniqueIdAndPassword(String matchUniqueIdAndPassword) {
		this.matchUniqueIdAndPassword = matchUniqueIdAndPassword;
	}
	
	
}

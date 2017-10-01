package bpit.india.mentorship.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="signUp",locations="classpath:sql/SignUp.yml")
public class SignUpConfig {

	private String insertIntoSignUp;

	/**
	 * @return the insertIntoSignUp
	 */
	public String getInsertIntoSignUp() {
		return insertIntoSignUp;
	}

	/**
	 * @param insertIntoSignUp the insertIntoSignUp to set
	 */
	public void setInsertIntoSignUp(String insertIntoSignUp) {
		this.insertIntoSignUp = insertIntoSignUp;
	}
	
	
}

package bpit.india.mentorship.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "forumOperations", locations = "classpath:sql/ForumOperations.yml")
public class ForumOperationsConfig {

	private String getAllTopics;
	private String getAllPosts;
	
	

	/**
	 * @return the getAllPosts
	 */
	public String getGetAllPosts() {
		return getAllPosts;
	}

	/**
	 * @param getAllPosts the getAllPosts to set
	 */
	public void setGetAllPosts(String getAllPosts) {
		this.getAllPosts = getAllPosts;
	}

	/**
	 * @return the getAllTopics
	 */
	public String getGetAllTopics() {
		return getAllTopics;
	}

	/**
	 * @param getAllTopics the getAllTopics to set
	 */
	public void setGetAllTopics(String getAllTopics) {
		this.getAllTopics = getAllTopics;
	}
	
	
}

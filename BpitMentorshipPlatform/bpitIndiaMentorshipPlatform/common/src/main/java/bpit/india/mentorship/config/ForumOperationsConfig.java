package bpit.india.mentorship.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "forumOperations", locations = "classpath:sql/ForumOperations.yml")
public class ForumOperationsConfig {

	private String getAllTopics;
	private String getAllPosts;
	private String getRecentTechnicalTopicsList;
	private String getRecentNonTechnicalTopicsList;
	private String getNumberofTechnicalTopics;
	private String getNumberofNonTechnicalTopics;
	private String getTechSubjects;
	private String getNonTechSubjects;
	
	
	
	

	/**
	 * @return the getTechSubjects
	 */
	public String getGetTechSubjects() {
		return getTechSubjects;
	}

	/**
	 * @param getTechSubjects the getTechSubjects to set
	 */
	public void setGetTechSubjects(String getTechSubjects) {
		this.getTechSubjects = getTechSubjects;
	}

	/**
	 * @return the getNonTechSubjects
	 */
	public String getGetNonTechSubjects() {
		return getNonTechSubjects;
	}

	/**
	 * @param getNonTechSubjects the getNonTechSubjects to set
	 */
	public void setGetNonTechSubjects(String getNonTechSubjects) {
		this.getNonTechSubjects = getNonTechSubjects;
	}

	/**
	 * @return the getNumberofTechnicalTopics
	 */
	public String getGetNumberofTechnicalTopics() {
		return getNumberofTechnicalTopics;
	}

	/**
	 * @param getNumberofTechnicalTopics the getNumberofTechnicalTopics to set
	 */
	public void setGetNumberofTechnicalTopics(String getNumberofTechnicalTopics) {
		this.getNumberofTechnicalTopics = getNumberofTechnicalTopics;
	}

	/**
	 * @return the getNumberofNonTechnicalTopics
	 */
	public String getGetNumberofNonTechnicalTopics() {
		return getNumberofNonTechnicalTopics;
	}

	/**
	 * @param getNumberofNonTechnicalTopics the getNumberofNonTechnicalTopics to set
	 */
	public void setGetNumberofNonTechnicalTopics(
			String getNumberofNonTechnicalTopics) {
		this.getNumberofNonTechnicalTopics = getNumberofNonTechnicalTopics;
	}

	/**
	 * @return the getRecentNonTechnicalTopicsList
	 */
	public String getGetRecentNonTechnicalTopicsList() {
		return getRecentNonTechnicalTopicsList;
	}

	/**
	 * @param getRecentNonTechnicalTopicsList the getRecentNonTechnicalTopicsList to set
	 */
	public void setGetRecentNonTechnicalTopicsList(
			String getRecentNonTechnicalTopicsList) {
		this.getRecentNonTechnicalTopicsList = getRecentNonTechnicalTopicsList;
	}

	/**
	 * @return the getRecentTechnicalTopicsList
	 */
	public String getGetRecentTechnicalTopicsList() {
		return getRecentTechnicalTopicsList;
	}

	/**
	 * @param getRecentTopicsList the getRecentTechnicalTopicsList to set
	 */
	public void setGetRecentTechnicalTopicsList(String getRecentTechnicalTopicsList) {
		this.getRecentTechnicalTopicsList = getRecentTechnicalTopicsList;
	}

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

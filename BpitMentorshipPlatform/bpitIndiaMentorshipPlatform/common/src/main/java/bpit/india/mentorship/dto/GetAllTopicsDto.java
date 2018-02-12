package bpit.india.mentorship.dto;

public class GetAllTopicsDto {

	private String topicId;
	private String topicSubject;
	private String topicDate;
	private String topicCat;
	private String topicBy;
	/**
	 * @return the topicId
	 */
	public String getTopicId() {
		return topicId;
	}
	/**
	 * @param topicId the topicId to set
	 */
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	/**
	 * @return the topicSubject
	 */
	public String getTopicSubject() {
		return topicSubject;
	}
	/**
	 * @param topicSubject the topicSubject to set
	 */
	public void setTopicSubject(String topicSubject) {
		this.topicSubject = topicSubject;
	}
	/**
	 * @return the topicDate
	 */
	public String getTopicDate() {
		return topicDate;
	}
	/**
	 * @param topicDate the topicDate to set
	 */
	public void setTopicDate(String topicDate) {
		this.topicDate = topicDate;
	}
	/**
	 * @return the topicCat
	 */
	public String getTopicCat() {
		return topicCat;
	}
	/**
	 * @param topicCat the topicCat to set
	 */
	public void setTopicCat(String topicCat) {
		this.topicCat = topicCat;
	}
	/**
	 * @return the topicBy
	 */
	public String getTopicBy() {
		return topicBy;
	}
	/**
	 * @param topicBy the topicBy to set
	 */
	public void setTopicBy(String topicBy) {
		this.topicBy = topicBy;
	}
	/**
	 * @param topicId
	 * @param topicSubject
	 * @param topicDate
	 * @param topicCat
	 * @param topicBy
	 */
	public GetAllTopicsDto(String topicId, String topicSubject,
			String topicDate, String topicCat, String topicBy) {
		super();
		this.topicId = topicId;
		this.topicSubject = topicSubject;
		this.topicDate = topicDate;
		this.topicCat = topicCat;
		this.topicBy = topicBy;
	}
	
	
	
}

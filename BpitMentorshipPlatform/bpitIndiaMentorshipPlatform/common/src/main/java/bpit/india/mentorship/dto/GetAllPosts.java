package bpit.india.mentorship.dto;

public class GetAllPosts {

	private String postId;
	private String postContent;
	private String postDate;
	private String postTopic;
	private String postBy;
	/**
	 * @return the postId
	 */
	public String getPostId() {
		return postId;
	}
	/**
	 * @param postId the postId to set
	 */
	public void setPostId(String postId) {
		this.postId = postId;
	}
	/**
	 * @return the postContent
	 */
	public String getPostContent() {
		return postContent;
	}
	/**
	 * @param postContent the postContent to set
	 */
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	/**
	 * @return the postDate
	 */
	public String getPostDate() {
		return postDate;
	}
	/**
	 * @param postDate the postDate to set
	 */
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	/**
	 * @return the postTopic
	 */
	public String getPostTopic() {
		return postTopic;
	}
	/**
	 * @param postTopic the postTopic to set
	 */
	public void setPostTopic(String postTopic) {
		this.postTopic = postTopic;
	}
	/**
	 * @return the postBy
	 */
	public String getPostBy() {
		return postBy;
	}
	/**
	 * @param postBy the postBy to set
	 */
	public void setPostBy(String postBy) {
		this.postBy = postBy;
	}
	/**
	 * @param postId
	 * @param postContent
	 * @param postDate
	 * @param postTopic
	 * @param postBy
	 */
	public GetAllPosts(String postId, String postContent, String postDate,
			String postTopic, String postBy) {
		super();
		this.postId = postId;
		this.postContent = postContent;
		this.postDate = postDate;
		this.postTopic = postTopic;
		this.postBy = postBy;
	}
	
	
	
}

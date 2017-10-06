package bpit.india.mentorship.dto;

public class GetInfoToFetchFileNamesDto {

	private String semester;
	private String course;
	private String subject;
	private String type;
	private String branch;
	private String userId;
	
	
	
	/**
	 * 
	 */
	public GetInfoToFetchFileNamesDto() {
		super();
	}
	/**
	 * @param semester
	 * @param course
	 * @param subject
	 * @param type
	 * @param branch
	 * @param userId
	 */
	public GetInfoToFetchFileNamesDto(String semester, String course,
			String subject, String type, String branch, String userId) {
		super();
		this.semester = semester;
		this.course = course;
		this.subject = subject;
		this.type = type;
		this.branch = branch;
		this.userId = userId;
	}
	/**
	 * @return the semester
	 */
	public String getSemester() {
		return semester;
	}
	/**
	 * @param semester the semester to set
	 */
	public void setSemester(String semester) {
		this.semester = semester;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
		
	
}

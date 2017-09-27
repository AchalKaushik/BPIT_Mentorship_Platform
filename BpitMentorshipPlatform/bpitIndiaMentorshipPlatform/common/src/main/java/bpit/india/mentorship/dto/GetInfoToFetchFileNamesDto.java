package bpit.india.mentorship.dto;

public class GetInfoToFetchFileNamesDto {

	private String semester;
	private String course;
	private String subject;
	private String type;
	private String stream;
	
	
	
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
	 * @param stream
	 */
	public GetInfoToFetchFileNamesDto(String semester, String course,
			String subject, String type, String stream) {
		super();
		this.semester = semester;
		this.course = course;
		this.subject = subject;
		this.type = type;
		this.stream = stream;
	}
	/**
	 * @return the stream
	 */
	public String getStream() {
		return stream;
	}
	/**
	 * @param stream the stream to set
	 */
	public void setStream(String stream) {
		this.stream = stream;
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
	
	
}

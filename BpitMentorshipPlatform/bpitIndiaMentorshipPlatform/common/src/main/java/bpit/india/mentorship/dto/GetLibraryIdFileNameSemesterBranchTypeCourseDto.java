package bpit.india.mentorship.dto;

public class GetLibraryIdFileNameSemesterBranchTypeCourseDto {

	private String libraryId;
	private String fileName;
	private String semester;
	private String branch;
	private String type;
	private String course;
	
	
	
	/**
	 * @param libraryId
	 * @param fileName
	 * @param semester
	 * @param branch
	 * @param type
	 * @param course
	 */
	public GetLibraryIdFileNameSemesterBranchTypeCourseDto(String libraryId,
			String fileName, String semester, String branch, String type,
			String course) {
		super();
		this.libraryId = libraryId;
		this.fileName = fileName;
		this.semester = semester;
		this.branch = branch;
		this.type = type;
		this.course = course;
	}
	/**
	 * @return the libraryId
	 */
	public String getLibraryId() {
		return libraryId;
	}
	/**
	 * @param libraryId the libraryId to set
	 */
	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
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
	
	
}

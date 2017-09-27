package bpit.india.mentorship.dto;

public class SignUpDto {

	private String firstName;
	private String lastName;
	private String password;
	private String mobileNumber;
	private String userId;
	private String uniqueId;
	private String course;
	private String registeredAs;
	
	
	
	
	/**
	 * 
	 */
	public SignUpDto() {
		super();
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param password
	 * @param mobileNumber
	 * @param userId
	 * @param uniqueId
	 * @param course
	 * @param type
	 */
	public SignUpDto(String firstName, String lastName, String password,
			String mobileNumber, String userId, String uniqueId,
			String course, String registeredAs) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.userId = userId;
		this.uniqueId = uniqueId;
		this.course = course;
		this.registeredAs = registeredAs;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the uniqueId
	 */
	public String getUniqueId() {
		return uniqueId;
	}
	/**
	 * @param uniqueId the uniqueId to set
	 */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
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
	 * @return the registeredAs
	 */
	public String getRegisteredAs() {
		return registeredAs;
	}
	/**
	 * @param registeredAs the registeredAs to set
	 */
	public void setRegisteredAs(String registeredAs) {
		this.registeredAs = registeredAs;
	}
	
	
}

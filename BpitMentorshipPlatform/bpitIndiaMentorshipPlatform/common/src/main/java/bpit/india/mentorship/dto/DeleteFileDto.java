package bpit.india.mentorship.dto;

public class DeleteFileDto {

	private String libraryId;
	private String userId;
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
	/**
	 * @param libraryId
	 * @param userId
	 */
	public DeleteFileDto(String libraryId, String userId) {
		super();
		this.libraryId = libraryId;
		this.userId = userId;
	}
	/**
	 * 
	 */
	public DeleteFileDto() {
		super();
	}
	
	
	
}

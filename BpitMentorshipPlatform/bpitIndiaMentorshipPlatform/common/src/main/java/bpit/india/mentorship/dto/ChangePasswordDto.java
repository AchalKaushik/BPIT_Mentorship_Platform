package bpit.india.mentorship.dto;

public class ChangePasswordDto {

	private String userId;
	private String currentPassword;
	private String newPassword;
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
	 * @return the currentPassword
	 */
	public String getCurrentPassword() {
		return currentPassword;
	}
	/**
	 * @param currentPassword the currentPassword to set
	 */
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}
	/**
	 * @return the newPassword
	 */
	public String getNewPassword() {
		return newPassword;
	}
	/**
	 * @param newPassword the newPassword to set
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	/**
	 * @param userId
	 * @param currentPassword
	 * @param newPassword
	 */
	public ChangePasswordDto(String userId, String currentPassword,
			String newPassword) {
		super();
		this.userId = userId;
		this.currentPassword = currentPassword;
		this.newPassword = newPassword;
	}
	/**
	 * 
	 */
	public ChangePasswordDto() {
		super();
	}
	
	
	 
}
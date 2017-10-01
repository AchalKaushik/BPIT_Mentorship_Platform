package bpit.india.mentorship.dto;

public class GetLibraryIdAndFileNameDto {

	String libraryId;
	String fileName;
	
	
	/**
	 * @param libraryId
	 * @param fileName
	 */
	public GetLibraryIdAndFileNameDto(String libraryId, String fileName) {
		super();
		this.libraryId = libraryId;
		this.fileName = fileName;
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
	
	
}

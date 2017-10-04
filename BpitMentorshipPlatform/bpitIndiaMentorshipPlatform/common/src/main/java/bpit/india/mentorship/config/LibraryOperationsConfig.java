package bpit.india.mentorship.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "library", locations = "classpath:sql/Library.yml")
public class LibraryOperationsConfig {

	private String getAllFileNamesFromLibrary;
	private String insertIntoLibrary;
	private String getLibraryIdAndFileName;
	private String getGetLibraryIdAndFileNameForSearch;
	private String getFilePathFromLibraryId;
	
	
	

	/**
	 * @return the getFilePathFromLibraryId
	 */
	public String getGetFilePathFromLibraryId() {
		return getFilePathFromLibraryId;
	}

	/**
	 * @param getFilePathFromLibraryId the getFilePathFromLibraryId to set
	 */
	public void setGetFilePathFromLibraryId(String getFilePathFromLibraryId) {
		this.getFilePathFromLibraryId = getFilePathFromLibraryId;
	}

	/**
	 * @return the getGetLibraryIdAndFileNameForSearch
	 */
	public String getGetGetLibraryIdAndFileNameForSearch() {
		return getGetLibraryIdAndFileNameForSearch;
	}

	/**
	 * @param getGetLibraryIdAndFileNameForSearch the getGetLibraryIdAndFileNameForSearch to set
	 */
	public void setGetGetLibraryIdAndFileNameForSearch(
			String getGetLibraryIdAndFileNameForSearch) {
		this.getGetLibraryIdAndFileNameForSearch = getGetLibraryIdAndFileNameForSearch;
	}

	/**
	 * @return the getLibraryIdAndFileName
	 */
	public String getGetLibraryIdAndFileName() {
		return getLibraryIdAndFileName;
	}

	/**
	 * @param getLibraryIdAndFileName the getLibraryIdAndFileName to set
	 */
	public void setGetLibraryIdAndFileName(String getLibraryIdAndFileName) {
		this.getLibraryIdAndFileName = getLibraryIdAndFileName;
	}

	/**
	 * @return the insertIntoLibrary
	 */
	public String getInsertIntoLibrary() {
		return insertIntoLibrary;
	}

	/**
	 * @param insertIntoLibrary the insertIntoLibrary to set
	 */
	public void setInsertIntoLibrary(String insertIntoLibrary) {
		this.insertIntoLibrary = insertIntoLibrary;
	}

	/**
	 * @return the getAllFileNamesFromLibrary
	 */
	public String getGetAllFileNamesFromLibrary() {
		return getAllFileNamesFromLibrary;
	}

	/**
	 * @param getAllFileNamesFromLibrary the getAllFileNamesFromLibrary to set
	 */
	public void setGetAllFileNamesFromLibrary(String getAllFileNamesFromLibrary) {
		this.getAllFileNamesFromLibrary = getAllFileNamesFromLibrary;
	}
	
	
}

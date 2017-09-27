package bpit.india.mentorship.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "library", locations = "classpath:sql/Library.yml")
public class LibraryOperationsConfig {

	private String getAllFileNamesFromLibrary;

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

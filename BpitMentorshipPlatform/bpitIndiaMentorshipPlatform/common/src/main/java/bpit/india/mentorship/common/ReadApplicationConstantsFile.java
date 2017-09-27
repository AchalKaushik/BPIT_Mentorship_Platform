package bpit.india.mentorship.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:applicationConstants.properties")
@ConfigurationProperties
public class ReadApplicationConstantsFile {

	private String saveFilesInFolder;

	
	/**
	 * @return the saveFilesInFolder
	 */
	public String getSaveFilesInFolder() {
		return saveFilesInFolder;
	}

	/**
	 * @param saveFilesInFolder the saveFilesInFolder to set
	 */
	public void setSaveFilesInFolder(String saveFilesInFolder) {
		this.saveFilesInFolder = saveFilesInFolder;
	}
	
	
}

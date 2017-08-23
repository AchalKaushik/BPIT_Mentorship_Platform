package bpit.india.mentorship.poc;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "random" , locations="classpath:sql/Random.yml")
public class RandomConfig {

	private String insertData;
	private String selectData;
	
	
	
	/**
	 * @return the selectData
	 */
	public String getSelectData() {
		return selectData;
	}

	/**
	 * @param selectData the selectData to set
	 */
	public void setSelectData(String selectData) {
		this.selectData = selectData;
	}

	/**
	 * @return the insertData
	 */
	public String getInsertData() {
		System.out.println("Here" + insertData);
		return insertData;
	}

	/**
	 * @param insertData the insertData to set
	 */
	public void setInsertData(String insertData) {
		System.out.println("Here" + insertData);
		this.insertData = insertData;
	}
	
}

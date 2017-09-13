package bpit.india.mentorship.common;

import org.jasypt.util.text.BasicTextEncryptor;

public class PasswordUtils {

	public static String decrypt(String encryptionKey, String databasePassword) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(encryptionKey);
		//return textEncryptor.decrypt(databasePassword);
		
		return "qwerty";
	}

	public static String encrypt(String encryptionKey, String databasePassword) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(encryptionKey);
		return textEncryptor.encrypt(databasePassword);
		
	}
	
}

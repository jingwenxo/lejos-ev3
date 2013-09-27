package lejos.ev3.startup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Settings {
	
	private static Properties props = new Properties();
	private static final String PROPS_FILE = "/home/root/lejos/settings.properties";
	
	static {
		try {
            //load a properties file
			props.load(new FileInputStream(PROPS_FILE));
		} catch (IOException e) {
			System.err.println("Failed to load properties file");
		}
	}

	public static void setProperty(String key, String value) {
		props.setProperty(key, value);
		try {
			props.store(new FileOutputStream(PROPS_FILE), null);
		} catch (IOException e) {
			System.err.println("Failed to store properties");
		}	
	}

	public static String getProperty(String key, String defaultValue) {
		return props.getProperty(key, defaultValue);
	}

}

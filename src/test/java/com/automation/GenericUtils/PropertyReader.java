package com.automation.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	static Properties prop =new Properties();
	
	public static void initProperty() throws FileNotFoundException, IOException {
		prop.load(new FileInputStream("C:\\Users\\sagar.kamdi\\eclipse-workspace\\OrangeHRM_Globallogic\\src\\test\\resources\\Config\\Config"));
	}
	
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}

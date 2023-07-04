package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	/**
	 * This function loads the properties file
	 */
 Properties prop;
	
	public Properties initialize_prop() throws IOException {
		prop = new Properties();
	
			FileInputStream inFile = new FileInputStream("C:\\Users\\visha\\eclipse-workspace\\Automationtesting_WITHCUCUMBER\\src\\test\\resources\\config\\config.properties");
			prop.load(inFile);
		
		
		return prop;
	}

}

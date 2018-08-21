package com.myfirstutils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtilss {
	
	private static Properties properties = null;
	private static String propertiesFileName;
	
	public PropertiesUtilss(String path){
		this.propertiesFileName = path;
	}
	
	public String getPropertiesFileValue(String Keyname){
		properties = new Properties();
		 InputStream is = PropertiesUtilss.class.getClassLoader().
                 getResourceAsStream("com/myfirstconfig/"+propertiesFileName); 
		 String keyvalue = null;
		 try {
			properties.load(is);
			 keyvalue = properties.getProperty(Keyname);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return keyvalue;
		 
	}


}

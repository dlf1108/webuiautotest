package com.myfirstconfig;

import com.myfirstutils.PropertiesUtilss;

public class LocadProperties {
	
	static PropertiesUtilss propertiesUtilss = new PropertiesUtilss("local.properties");
	public static String URL = propertiesUtilss.getPropertiesFileValue("url");
	public static String ChromeDriverPath = propertiesUtilss.getPropertiesFileValue("chromeDriverPath");
	public static final String FIREFOX_PATH = propertiesUtilss.getPropertiesFileValue("fireFoxDriverPath");
	public static final String IE_PATH = propertiesUtilss.getPropertiesFileValue("ieDriverPath");
	public static final String SCREENSHOTPATH = propertiesUtilss.getPropertiesFileValue("shotPath");
	
}

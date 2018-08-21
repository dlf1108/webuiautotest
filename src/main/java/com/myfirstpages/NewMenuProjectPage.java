package com.myfirstpages;

import org.openqa.selenium.WebDriver;

import com.myfirstuiframework.BasePage;
import com.myfirstuiframework.Locator;

public class NewMenuProjectPage extends BasePage{
	
//	WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	public NewMenuProjectPage(WebDriver driver){
		super(driver);
//		this.driver = driver;
	}
	
	Locator projectName = getLocator("projectName");
	
	public String getProjectName(){
		return getText(projectName);
		
	}

	public static void setDriver(WebDriver driver) {
		NewMenuProjectPage.driver = driver;	
	}
}

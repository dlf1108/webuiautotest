package com.myfirstactions;

import org.openqa.selenium.WebDriver;
import com.myfirstpages.MenuProjectPage;
import com.myfirstpages.SubmenucreatePage;

public class subMenuCreatePage {
	
	static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		subMenuCreatePage.driver = driver;
	}
	
	private static MenuProjectPage menuprojectpage;
	private static SubmenucreatePage submenucreatesage;
	
	public static SubmenucreatePage clickReturnMeunProject(String name , String psword){
		clickMenuProject.setDriver(driver);
		menuprojectpage = clickMenuProject.clickProject(name, psword);
		menuprojectpage.submenucreateclick(); 
		return new SubmenucreatePage(getDriver());
		
	}
	
}

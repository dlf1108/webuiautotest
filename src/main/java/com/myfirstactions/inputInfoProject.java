package com.myfirstactions;

import org.openqa.selenium.WebDriver;

import com.myfirstpages.ReturnMenuPorjectPage;
import com.myfirstpages.SubmenucreatePage;

public class inputInfoProject {
	
	static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		inputInfoProject.driver = driver;
	}
	
	private static SubmenucreatePage submenucreatesage;
	private static ReturnMenuPorjectPage returnmenuporjectpage;
	
	public static ReturnMenuPorjectPage inputInfo(String name, String psword,String pname , String number , String teamName , String contect){
		subMenuCreatePage.setDriver(driver);
		submenucreatesage = subMenuCreatePage.clickReturnMeunProject(name, psword);
		submenucreatesage.createproject(pname , number , teamName , contect);
		return new ReturnMenuPorjectPage(getDriver());	
	}
	
	public static ReturnMenuPorjectPage inputInfoError(String name, String psword,String pname , String number , String teamName , String contect){
		subMenuCreatePage.setDriver(driver);
		submenucreatesage = subMenuCreatePage.clickReturnMeunProject(name, psword);
		submenucreatesage.createproject(pname , number , teamName , contect);
		submenucreatesage.JSdeal();
		return new ReturnMenuPorjectPage(getDriver());	
	}

}

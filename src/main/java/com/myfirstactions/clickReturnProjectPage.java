package com.myfirstactions;

import org.openqa.selenium.WebDriver;

import com.myfirstpages.NewMenuProjectPage;
import com.myfirstpages.ReturnMenuPorjectPage;

public class clickReturnProjectPage {
	
	static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		clickReturnProjectPage.driver = driver;
	}
	
	private static ReturnMenuPorjectPage returnmenuporjectpage;
	private static NewMenuProjectPage newmenuprojectpage;
	
	public static NewMenuProjectPage  clickReturn(String name , String psword,String pname , String number , String teamName , String contect){
		inputInfoProject.setDriver(driver);
		returnmenuporjectpage = inputInfoProject.inputInfo(name, psword,pname,number,teamName,contect);
		returnmenuporjectpage.returnmenuporjectpage();
		return new NewMenuProjectPage(getDriver()) ;
	}
	
	public static NewMenuProjectPage  NotClickReturn(String name , String psword,String pname , String number , String teamName , String contect){
		inputInfoProject.setDriver(driver);
		returnmenuporjectpage = inputInfoProject.inputInfoError(name, psword,pname,number,teamName,contect);
		return new NewMenuProjectPage(getDriver()) ;
	}
	
	public static String getProjectName(String name , String psword,String pname , String number , String teamName , String contect){
		newmenuprojectpage = clickReturn(name, psword,pname,number,teamName,contect);
		return newmenuprojectpage.getProjectName();
	}

}

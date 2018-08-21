package com.myfirstactions;

import org.openqa.selenium.WebDriver;

import com.myfirstpages.LoginPage;
import com.myfirstpages.MainPage;
import com.myfirstpages.MenuProjectPage;

public class clickMenuProject{
	
	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver(WebDriver driver) {
		clickMenuProject.driver = driver;
	}
	
	private static MainPage mainpage;
	private static MenuProjectPage menprojectpage;
	
	public static MenuProjectPage clickProject(String name,String psword){
		clickLoginButton.setDriver(driver);
		mainpage = clickLoginButton.loginSucess(name, psword);
 		mainpage.clickMenuProject();
		return new MenuProjectPage(getDriver());
	}
	
	public static MenuProjectPage clickProjectLoginTest(String name,String psword){
		clickLoginButton.setDriver(driver);
		mainpage = clickLoginButton.loginSucess(name, psword);
		return new MenuProjectPage(getDriver());
	}
	
	public static void clickProjectLoginTest1(String name,String psword){
		clickLoginButton.setDriver(driver);
		clickLoginButton.loginNotSucess(name, psword);
//		return new MenuProjectPage(getDriver());
	}
}

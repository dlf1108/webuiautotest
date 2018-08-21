package com.myfirstactions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.myfirstpages.LoginPage;
import com.myfirstpages.MainPage;
import com.myfirstuiframework.BasePage;
import com.myfirstuiframework.DriverUtils;

public class clickLoginButton{
	

	static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver(WebDriver driver) {
		clickLoginButton.driver = driver;
	}

	private static LoginPage loginpage;
	private static MainPage mainpage;
	
	public static MainPage loginSucess(String name , String psword){
		loginpage = new LoginPage(getDriver());
		loginpage.inputUserName(name);
		loginpage.inputPassword(psword);
		loginpage.clickLoginButton();
		return  new MainPage(getDriver());
	}
	
	public static MainPage loginNotSucess(String name , String psword){
		loginpage = new LoginPage(getDriver());
		loginpage.inputUserName(name);
		loginpage.inputPassword(psword);
		loginpage.clickLoginButton();
		BasePage.confirmAlert();
//		Alert a = driver.switchTo().alert();    //处理JS弹框
//		a.accept();
		return  new MainPage(getDriver());
	}
	
	public String getUserName(String name, String psword){
		mainpage = loginSucess(name,psword);
		return mainpage.getInfoUserName();	
	}
	

}

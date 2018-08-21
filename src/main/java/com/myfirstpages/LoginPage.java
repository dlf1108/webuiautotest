package com.myfirstpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.myfirstconfig.LocadProperties;
import com.myfirstuiframework.BasePage;
import com.myfirstuiframework.Locator;

public  class LoginPage extends BasePage{

	public LoginPage(WebDriver driver){
		super(driver);
		openWeb(LocadProperties.URL);		
	}
	
	Locator usernameInputbox = getLocator("usernameInputbox");
	Locator passwordInputbox = getLocator("passwordInputbox");
	Locator loginButton = getLocator("loginButton");
	
//	public MainPage inputUserInfo(String name , String psword){
//		input(usernameInputbox, name);
//		input(passwordInputbox, psword);
//		click(loginButton);
//		return new MainPage(driver);
//	}
	
	public void inputUserName(String name){
		input(usernameInputbox, name);
	}
	
	public void inputPassword(String password){
		input(passwordInputbox, password);
	}
	
	public void clickLoginButton(){
		click(loginButton);
	}
	

}

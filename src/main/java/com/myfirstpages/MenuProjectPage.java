package com.myfirstpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.myfirstuiframework.BasePage;
import com.myfirstuiframework.Locator;

public class MenuProjectPage extends BasePage{

	public WebDriver getDriver() {
		return driver;
	}

	public MenuProjectPage(WebDriver driver) {
		super(driver);
	}
	
	Locator menuProject = getLocator("menuProject");
	
	//点击新建项目
//	public SubmenucreatePage submenucreateclick(){
//		click(menuProject);
//		return new SubmenucreatePage(driver);
//	}
	
	public void submenucreateclick(){
		click(menuProject);
	}
	

}

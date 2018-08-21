package com.myfirstpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.myfirstuiframework.BasePage;
import com.myfirstuiframework.Locator;

public class MainPage extends BasePage{

	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	Locator userMenu = getLocator("userMenu");
	Locator clickmenuproject = getLocator("clickmenuproject");
	
	public String getInfoUserName(){
		return getText(userMenu);
	}
	//点击项目按钮方法
//    public MenuProjectPage menuprojectclick(){
//    	click(clickmenuproject);
//		return new MenuProjectPage(driver);
//				
//	}
    
    public void clickMenuProject(){
    	click(clickmenuproject);
    }

}

package com.myfirstpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.myfirstuiframework.BasePage;
import com.myfirstuiframework.Locator;

public class ReturnMenuPorjectPage extends BasePage{
	
//	WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	public ReturnMenuPorjectPage(WebDriver driver){
		super(driver);
//		this.driver = driver;
//		returnmenuporjectpage = findElement("xpath","//*[@id='tipsModal']/div[2]/div/div/a[4]");
//		returnmenuporjectpage = driver.findElement(By.xpath("//*[@id='tipsModal']/div[2]/div/div/a[4]"));
	}
	
	Locator returnMenuPorjectPage = getLocator("returnMenuPorjectPage");
	
//	public NewMenuProjectPage returnmenuporjectpage(){
//		click(returnMenuPorjectPage);   //		returnmenuporjectpage.click();
//		return new NewMenuProjectPage(driver);
//	}
	
	public void returnmenuporjectpage(){
		click(returnMenuPorjectPage);
	}
}

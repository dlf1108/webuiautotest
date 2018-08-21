package com.myfirstpages;

import org.apache.logging.log4j.core.appender.rolling.action.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.myfirstuiframework.BasePage;
import com.myfirstuiframework.Locator;

public class SubmenucreatePage extends BasePage{
		
	public SubmenucreatePage(WebDriver driver){
		super(driver);

	}
	
	Locator inputName = getLocator("inputName");
	Locator codeNumber = getLocator("codeNumber");
	Locator beginDate = getLocator("beginDate");
	Locator selectDate = getLocator("selectDate");
	Locator clickDelta31 = getLocator("clickDelta31");
	Locator inputTeamName = getLocator("inputTeamName");
	Locator porjectType = getLocator("porjectType");
	Locator selectPorjectType = getLocator("selectPorjectType");
	Locator inIframePage = getLocator("inIframePage");
	Locator inputContect = getLocator("inputContect");
	Locator selectControl = getLocator("selectControl");
	Locator clickSubmit = getLocator("clickSubmit");
	
//	public ReturnMenuPorjectPage createproject(){
//		input(inputName,"mmmm");
//		input(codeNumber,"TO1");
//		click(beginDate);
//		click(selectDate);
//		click(clickDelta31);
//		input(inputTeamName,"Group2");
//		click(porjectType);
//		click(selectPorjectType);
//		
//		switchtoFrameByElement(inIframePage);
//		input(inputContect,"UI自动化学习");
//		switchDefaultContent();
		
//		Actions action = new Actions(driver);    //利用操作键盘属性，点击TAB操作实现下面的操作
//		action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
		
//		((JavascriptExecutor) driver).executeScript("scrollTo(0,3000)");   //浏览器竖向滚动条
//         
//		click(selectControl);
//		submit(clickSubmit);
//		return new ReturnMenuPorjectPage(driver);
//	}
	
	public void createproject(String pname , String number , String teamName , String contect){
		input(inputName,pname); 
		input(codeNumber,number);
		click(beginDate);
		click(selectDate);
		click(clickDelta31);
		input(inputTeamName,teamName);
		click(porjectType);
		click(selectPorjectType);
		
		switchtoFrameByElement(inIframePage);
		input(inputContect,contect);
		switchDefaultContent();
		
		Actions action = new Actions(driver);    //利用操作键盘属性，点击TAB操作实现下面的操作
		action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
		
		((JavascriptExecutor) driver).executeScript("scrollTo(0,3000)");   //浏览器竖向滚动条
         
		click(selectControl);
		submit(clickSubmit);
	}	
	
	public void JSdeal(){
        getJsText();
		confirmAlert();
	}
}

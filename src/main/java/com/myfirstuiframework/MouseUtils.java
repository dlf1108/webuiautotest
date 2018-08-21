package com.myfirstuiframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseUtils {

	private Actions action;
	
	public MouseUtils(WebDriver dr){        //鼠标事件
		action = new Actions(dr);
	}
	
	public void doubleClick(WebElement el){     //鼠标双击
		action.doubleClick(el).perform();
	} 
	
	public void rightClick(WebElement el){       //鼠标右击
		action.contextClick(el);
	}
	
}

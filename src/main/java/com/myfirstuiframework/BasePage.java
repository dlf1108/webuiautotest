package com.myfirstuiframework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends WebElementUtils{

	public BasePage(WebDriver driver) {
		super(driver);	
	}
	
    //获取页面源代码
	
	public String getPageSource(){
		return driver.getPageSource();
	}
	
	//页面JS弹框处理
	
	public static void confirmAlert(){         //js弹框点击确定
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void inputAlert(String value){            //js弹框要求输入内容
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}
	
	public void cancelAlert(){                     //js弹框如果有取消按钮，则点击取消
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public String getJsText(){                     //js弹框如果有取消按钮，则点击取消
		Alert alert = driver.switchTo().alert();
		String jsvalue = alert.getText();
		System.out.println(jsvalue);
		return jsvalue;
	}
	
	//frame
	
	public void switchtoFrameByIdorName(Locator locator){   //通过frame的id或者name属性值进入frame表单
		WebElement el = findElement(locator);
		driver.switchTo().frame(el);
	}
	
	public void switchtoFrameByElement(Locator locator){    //通过frame的元素定位进入frame表单
		WebElement el = findElement(locator);
		driver.switchTo().frame(el);
	}
	
	public void switchDefaultContent(){       //跳出frame表单
		driver.switchTo().defaultContent();
	}
	
}



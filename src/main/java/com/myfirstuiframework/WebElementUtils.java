package com.myfirstuiframework;

import java.util.HashMap;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.myfirstuiframework.Locator.ByType;
import com.myfirstutils.xmlUtils;

import junit.framework.Assert;

public class WebElementUtils extends DriverUtils{

	protected HashMap<String, Locator> locatorMap;
	protected String path;
	
	public WebElementUtils(WebDriver driver) {
		super(driver);

		path = System.getProperty("user.dir") + "/webelementdata/"
				+ this.getClass().getSimpleName() + ".xml";
		try {
			locatorMap = xmlUtils.readElementInfo(path);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	//查找元素 xpath、cssSelector......
	//点击，输入、提交、获取元素属性、获取元素文本、下拉框选择
	
	public WebElement getElement(Locator locator){
		WebElement el = null;
		ByType  type = locator.getByType();
		try{
		switch(type){
		    case id:
		    	el = driver.findElement(By.id(locator.getLocatorInfo()));break; 
		    case name:
		    	el = driver.findElement(By.name(locator.getLocatorInfo()));break; 
		    case xpath:
		    	el = driver.findElement(By.xpath(locator.getLocatorInfo()));break; 
		    case cssSelector:
		    	el = driver.findElement(By.cssSelector(locator.getLocatorInfo()));break; 
		    default:
		    	el = driver.findElement(By.xpath(locator.getLocatorInfo()));break; 
		}}catch(Exception e){
			log.error("元素："+locator.getElementName() + " 识别异常");
			takeScreenShot("findElementErrorImage");
			Assert.fail("元素识别异常，退出此次用例"); 
		}
		return el;
	}
	
	protected WebElement findElement(final Locator locator){      //增加显示等待方法
		WebDriverWait wait = new WebDriverWait(driver, locator.getTimeOut());
		WebElement el = wait.until(new ExpectedCondition<WebElement>() {   
            public WebElement apply(WebDriver driver) {
				return getElement(locator);          
            }  
        });
		return el;
	}
	
	public void click(Locator locator){     //封装点击方法
		WebElement el = findElement(locator);
		el.click();
		log.info("点击元素  "+locator.getElementName());
	}
	
	public void input(Locator locator , String content){     //封装输入方法
		WebElement el = findElement(locator);
		el.sendKeys(content);
		log.info("在元素 "+locator.getElementName()+"输入"+content) ;
	}
	
	public void submit(Locator locator){   //提交表单
		WebElement el = findElement(locator);
		el.submit();
		log.info("点击提交按钮");
	}
	
	public String getAttribute(Locator locator,String key){    //获取元素属性值
		WebElement el = findElement(locator);
		log.info("获取元素 "+locator.getElementName()+key+"的属性值");
		return el.getAttribute(key);
	}
	
	public String getText(Locator locator){       //获取元素值
		WebElement el = findElement(locator);
		log.info("获取元素："+locator.getElementName()+"文本值");
		return el.getText();	
	}
	
	public void selectByIndex(Locator locator,int index){    //获取下拉框值，按照排序选择
		WebElement el = findElement(locator);
		Select select = new Select(el);
		select.selectByIndex(index);
		log.info("按照下拉框值排序获取相对应的下拉框值");
	}
	
	public void selectByText(Locator locator,String text){     //获取下拉框值，按照下拉框元素文本值
		WebElement el = findElement(locator);
		Select select = new Select(el);
		select.selectByVisibleText(text);
		log.info("按照下拉框内的文本值获取下拉框值："+text);
	}
	
	public void selectByValue(Locator locator,String value){      //获取下拉框值，通过匹配到标签里的值
		WebElement el = findElement(locator);
		Select select = new Select(el);
		select.selectByValue(value);
//		log.info("获取下拉框值，通过匹配到标签里的值"+value);
	}
	
	public Locator getLocator(String locatorName){
		Locator locator = locatorMap.get(locatorName);
	    log.info("显示xml内的值"+locator);
		return locator;
		
	} 
	
	
}



package com.myfirstuiframework;

public class Locator {
	
	public enum ByType{
		id,name,classname,linktest,xpath,cssSelector,tagname,partialLinkText
	}
	private String elementName;
	private String locatorInfo;
	private int timeOut;
	private ByType byType;
	
	public Locator(String name , String info , int time , ByType byType ){
		this.elementName = name;
		this.locatorInfo = info;
		this.timeOut = time;
		this.byType = byType;
	}

	public String getElementName() {
		return elementName;
	}

	public String getLocatorInfo() {
		return locatorInfo;
	}

	public int getTimeOut() {
		return timeOut;
	}

	public ByType getByType() {
		return byType;
	}

}

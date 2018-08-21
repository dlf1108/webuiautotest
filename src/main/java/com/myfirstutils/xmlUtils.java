package com.myfirstutils;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.myfirstuiframework.Locator;
import com.myfirstuiframework.Locator.ByType;


public class xmlUtils {
	
	public static HashMap<String,Locator> readElementInfo(String filePath) throws DocumentException{
		Map<String,Locator> elementinfos= new HashMap<String,Locator>(); 
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File(filePath));
		Element root = document.getRootElement();
		List<Element> childList = root.elements("locator");
		for(Element e:childList){
			String value = e.attributeValue("value").toString();
			int timeOut = Integer.parseInt(e.attributeValue("timeout"));
			String name = e.attributeValue("name").toString();
			String type = e.attributeValue("type").toString(); 
			Locator locator = new Locator(name,value,timeOut,getType(type));   //此处带入参数的顺序必须与定义Locator方法时候带入参数顺序一致
			String keyName = e.getText();
			elementinfos.put(keyName, locator);
		}
		return (HashMap<String, Locator>) elementinfos;
	}
	
	public static ByType getType(String value){
		ByType type = null;
		switch(value){
		case "css":
			type = ByType.cssSelector;
			break;
		case "xpath":
			type = ByType.xpath;
			break;
		case "id":
			type = ByType.id;
		case "name":
			type = ByType.name;
		case "classname":
			type = ByType.classname;
		case "linktest":
		    type = ByType.linktest;
		case "tagname":
			type = ByType.tagname;
		case "partialLinkText":
			type = ByType.partialLinkText;
		}
		return type;
	}

}

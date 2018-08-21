package com.myfirstuiframework;

import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.myfirstconfig.LocadProperties;
import com.myfirstutils.Log;

public class WebDriverFactory {
	
	private static WebDriver driver;
	
	static Runtime runtime = Runtime.getRuntime();     //使用方法调用DOS命令
	private static Log log = new Log(WebDriverFactory.class);
	
	public static WebDriver getChromeDriver(){
		try { 
			runtime.exec("taskkill /F /IM chrome.exe");    // 杀死chrome进程，如果事先chrome存在的话
			log.info("杀死chrome进程");
		} catch (IOException e) {
			e.printStackTrace();
			log.error("杀死浏览器进程异常");
		}
		String chromedriverPath = System.getProperty("user.dir")+LocadProperties.ChromeDriverPath;
		System.setProperty("webdriver.chrome.driver",chromedriverPath);
		ChromeOptions options = new ChromeOptions();
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.switches",
				Arrays.asList("--start-maximized"));
		options.addArguments("--test-type", "--start-maximized");
		
		driver = new ChromeDriver(options);
		return driver;
		
	}
	
	

}

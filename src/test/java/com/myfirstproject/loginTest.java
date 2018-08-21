package com.myfirstproject;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.myfirstactions.clickMenuProject;
import com.myfirstuiframework.WebDriverFactory;
import com.myfirstutils.ExeclUtils;
import com.myfirstutils.TestCase;

public class loginTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setDriver() {
		driver = WebDriverFactory.getChromeDriver();
		driver.manage().window().maximize();
		clickMenuProject.setDriver(driver);
	}
	
    @Test
    public void f01() {
    	List<TestCase> testcases = ExeclUtils.getUITestData("Exceldata.xlsx");
    	HashMap<String,String> testdata = (HashMap<String, String>) testcases.get(0).getTestdata();
    	clickMenuProject.clickProjectLoginTest(testdata.get("username"),testdata.get("password"));	
    }
    
    @Test(enabled = false)
    public void f02(){
    	List<TestCase> testcases = ExeclUtils.getUITestData("Exceldata.xlsx");
    	HashMap<String,String> testdata = (HashMap<String, String>) testcases.get(1).getTestdata();
    	clickMenuProject.clickProjectLoginTest1(testdata.get("username"),testdata.get("password"));	
    }
    
    @Test(enabled = false)
    public void f03(){
    	List<TestCase> testcases = ExeclUtils.getUITestData("Exceldata.xlsx");
    	HashMap<String,String> testdata = (HashMap<String, String>) testcases.get(2).getTestdata();
    	clickMenuProject.clickProjectLoginTest1(testdata.get("username"),testdata.get("password"));	
    }
    
    @Test(enabled = false)
    public void f04(){
    	List<TestCase> testcases = ExeclUtils.getUITestData("Exceldata.xlsx");
    	HashMap<String,String> testdata = (HashMap<String, String>) testcases.get(3).getTestdata();
    	clickMenuProject.clickProjectLoginTest1(testdata.get("username"),testdata.get("password"));	
    }
    
    @Test(enabled = false)
    public void f05(){
    	List<TestCase> testcases = ExeclUtils.getUITestData("Exceldata.xlsx");
    	HashMap<String,String> testdata = (HashMap<String, String>) testcases.get(4).getTestdata();
    	clickMenuProject.clickProjectLoginTest1(testdata.get("username"),testdata.get("password"));	
    }
    
    
    
    @AfterMethod
    public void closeWindow(){
    	driver.quit();
    }
}

package com.myfirstproject;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.myfirstactions.clickReturnProjectPage;
import com.myfirstuiframework.WebDriverFactory;
import com.myfirstutils.AssertUtils;
import com.myfirstutils.ExeclUtils;
import com.myfirstutils.TestCase;

public class addprojecttest {

	WebDriver driver;
	AssertUtils assertUtils; 

	@BeforeMethod
	public void setDriver() {
		driver = WebDriverFactory.getChromeDriver();
		driver.manage().window().maximize();
		assertUtils = new AssertUtils();
		clickReturnProjectPage.setDriver(driver);
	
	}
	
	
	@Test 
	public void LoginTest01() {
		List<TestCase> testcases = ExeclUtils.getUITestData("Exceldata.xlsx");
    	HashMap<String,String> testdata = (HashMap<String, String>) testcases.get(5).getTestdata();
    	clickReturnProjectPage.clickReturn(testdata.get("username"),testdata.get("password"),
    			testdata.get("inputName"),testdata.get("codeNumber"),testdata.get("inputTeamName"),
    			testdata.get("inputContect"));
//    	assertUtils.checkString(value, testcases.get(5).getExpectedResult(), "项目添加失败");
    }
	
	@Test 
	public void LoginTest02() {
		List<TestCase> testcases = ExeclUtils.getUITestData("Exceldata.xlsx");
    	HashMap<String,String> testdata = (HashMap<String, String>) testcases.get(10).getTestdata();
    	clickReturnProjectPage.NotClickReturn(testdata.get("username"),testdata.get("password"),
    			testdata.get("inputName"),testdata.get("codeNumber"),testdata.get("inputTeamName"),
    			testdata.get("inputContect"));
    }
	
	@AfterMethod
	public void caseXunHuan(){
	}
}

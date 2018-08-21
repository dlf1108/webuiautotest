package com.myfirstproject;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.NetworkMode;

public class extentReportDemo {

	public static void main(String[] args) {
		
		ExtentReports extent = new ExtentReports("c:\\ExtentReports.html", true, NetworkMode.OFFLINE);
		ExtentTest  test = extent.startTest("stringTest");
		extent.flush();
		
	}

}

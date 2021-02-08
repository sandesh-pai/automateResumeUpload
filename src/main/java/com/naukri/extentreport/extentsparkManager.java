package com.naukri.extentreport;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class extentsparkManager {

	
	private static ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();

	public static ExtentTest getTest()  {
		return extenttest.get();
	}

	public static void setExtent(ExtentTest test) {
		extenttest.set(test);
	}
	
	public static void unload() 
	{
		extenttest.remove();
	}
	
	
	
	
}

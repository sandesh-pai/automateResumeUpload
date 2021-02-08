package com.naukri.extentreport;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.naukri.Driver.DriverManager;
import com.naukri.resources.config;
import com.naukri.utils.readproperty;

public class ExtentLogger {

	
	
	public static void pass(String message)
	{
		extentsparkManager.getTest().pass(message);
	}
	
	public static void fail(String message)
	{
		extentsparkManager.getTest().pass(message);
	}
	
	public static void skip(String message)
	{
		extentsparkManager.getTest().pass(message);
	}
	
	public static void pass(String message, boolean isscreenshotneeded)
	{
		if (readproperty.getvalue(config.passedtestscreenshot).equalsIgnoreCase("yes") 
				&& isscreenshotneeded) {
			extentsparkManager.getTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());
		}
		else 
		{
			pass(message);
		}
		
	}
	
	
	public static void fail(String message, boolean isscreenshotneeded)
	{
		if (readproperty.getvalue(config.failedtestscreenshot).equalsIgnoreCase("yes") 
				&& isscreenshotneeded) {
			extentsparkManager.getTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());
		}
		else
		{
			fail(message);
		}
		
	}
	
	public static void skip(String message, boolean isscreenshotneeded)
	{
		if (readproperty.getvalue(config.skippedtestscreenshot).equalsIgnoreCase("yes") 
				&& isscreenshotneeded) {
			extentsparkManager.getTest().skip(message , MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());
		}
		else
		{
			skip(message);
		}
		
	}
	
	
	public static String getBase64Image()
	{
		return ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
		
	}
	
}

package com.naukri.extentreport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.naukri.FrameworkConstants.naukriFrameworkConstants;

public final class ExtentManager {

	private ExtentManager() {};

	private static ExtentReports extent;


	public static void SetUpExtent() {
		if (Objects.isNull(extent)) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("naukriReport");
		}
	}

	
	public static void CreateNode(String TestName)
	{
		 ExtentTest test = extent.createTest(TestName);
		 extentsparkManager.setExtent(test);
		 extentsparkManager.getTest();
			
	}



	public static void flushExtentReport()
	{
		if (Objects.nonNull(extent)) {
			extent.flush();
		}

		try {
			Desktop.getDesktop().browse(new File("index.html").toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}





}


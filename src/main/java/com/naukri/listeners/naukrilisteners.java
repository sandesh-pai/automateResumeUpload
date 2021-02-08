package com.naukri.listeners;

import java.util.Arrays;
import java.util.Set;

import org.testng.IClass;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import com.naukri.extentreport.ExtentLogger;
import com.naukri.extentreport.ExtentManager;
import com.naukri.extentreport.extentsparkManager;

public class naukrilisteners implements ITestListener,ITestResult,ISuiteListener{

public void onStart(ISuite suite) {
		
		ExtentManager.SetUpExtent();
	}

	public void onFinish(ISuite suite) {
		
		ExtentManager.flushExtentReport();
	}

	public void onTestStart(ITestResult result) {
		ExtentManager.CreateNode(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		
		extentsparkManager.getTest().pass(result.getMethod().getMethodName() + " is pass");
		ExtentLogger.pass(result.getMethod().getMethodName() + " is passed", true);
		
	}

	public void onTestFailure(ITestResult result) {
	
	      ExtentLogger.fail(result.getMethod().getMethodName() + " is failed", true);
	      ExtentLogger.fail(result.getThrowable().toString());
	      ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
		
	}

	public void onTestSkipped(ITestResult result) {
		ExtentLogger.skip(result.getMethod().getMethodName() + " is skipped", true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public Object getAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAttribute(String name, Object value) {
		// TODO Auto-generated method stub
		
	}

	public Set<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object removeAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public int compareTo(ITestResult o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getStatus() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setStatus(int status) {
		// TODO Auto-generated method stub
		
	}

	public ITestNGMethod getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setParameters(Object[] parameters) {
		// TODO Auto-generated method stub
		
	}

	public IClass getTestClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public Throwable getThrowable() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setThrowable(Throwable throwable) {
		// TODO Auto-generated method stub
		
	}

	public long getStartMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	public long getEndMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setEndMillis(long millis) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isSuccess() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getHost() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] getFactoryParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTestName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getInstanceName() {
		// TODO Auto-generated method stub
		return null;
	}

	public ITestContext getTestContext() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTestName(String name) {
		// TODO Auto-generated method stub
		
	}

	public boolean wasRetried() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setWasRetried(boolean wasRetried) {
		// TODO Auto-generated method stub
		
	}

}

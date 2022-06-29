package com.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listners extends BaseClass implements ITestListener{
	
	ExtentReports extent= ExtentRportgenerater.getReports();
	ThreadLocal<ExtentTest> extenttest= new ThreadLocal<ExtentTest>();


	public void onTestStart(ITestResult result) {
		
		librart.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(librart.test);
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS,"Test case is pass");
		librart.test.addScreenCaptureFromBase64String(getscreenshot());
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL,"Test case is fail");
		librart.test.addScreenCaptureFromBase64String(getscreenshot());
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP,"Test case is skip");
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	
	}
	
	public static String getscreenshot() {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		return ts.getScreenshotAs(OutputType.BASE64);
	}
	
	
	
	
	

}

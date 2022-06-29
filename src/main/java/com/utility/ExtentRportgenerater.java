package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentRportgenerater {
		
		//Extentsparkrepoter
		//Extentreports
	public static ExtentReports extent;
		public static  ExtentReports getReports() {
			
			String reportpath="C:\\Users\\RAHUL\\eclipse-workspace\\Batch_10_Framework\\reports\\index.html";
			ExtentSparkReporter report = new ExtentSparkReporter(reportpath);
			report.config().setDocumentTitle("Batch_10_reports");
			report.config().setReportName("Automation test report");
			report.config().setTheme(Theme.DARK);
			
	    	 extent = new ExtentReports();
			extent.attachReporter(report);
			extent.setSystemInfo("project_name","Abc project");
			extent.setSystemInfo("QA","Rahul");
			return extent;
		}
	

}

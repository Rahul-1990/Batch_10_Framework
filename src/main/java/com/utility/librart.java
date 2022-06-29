package com.utility;

import javax.swing.text.Element;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class librart {
	
	public static ExtentTest test;
	
	public static void Custom_sendkeys(WebElement element,String value,String fildname) {
		
		try {
			
		element.sendKeys(value);
		test.log(Status.PASS,fildname+"value successfully send="+value);
			
		}catch(Exception e) {
			test.log(Status.FAIL,e.getMessage());
			System.out.println(e.getMessage());
				
		}
	}

	
	public static void custom_click(WebElement element,String fildname) {
		
		try {
			element.click();
			test.log(Status.PASS,"clicked successfully"+fildname);
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}

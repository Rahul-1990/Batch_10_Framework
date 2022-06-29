package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.LoginPom;
import com.utility.BaseClass;
import com.utility.librart;

public class VerifyLoginPage extends BaseClass {
	
	@Test
	public void tc_01_loginverifywithvaliddata() {
		
		LoginPom login=PageFactory.initElements(driver,LoginPom.class);
	
		
		librart.Custom_sendkeys(login.getTxt_email(),excel.getSringdata("Sheet1", 0, 0),"Emailid");
		librart.Custom_sendkeys(login.getTxt_pass(),excel.getSringdata("Sheet1", 0, 1),"password");
		librart.custom_click(login.getLogin_btn(),"login");
		Assert.assertTrue(false);
		
	}

}

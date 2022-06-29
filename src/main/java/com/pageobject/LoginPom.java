package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@id='ema']")
	private WebElement Txt_email;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement Txt_pass;
	
	@FindBy(how=How.XPATH,using="//button[@id='loginbutton']")
	private WebElement Login_btn;
	
	
	
	public WebElement getTxt_email() {
		
		return Txt_email;
	}
	
   public WebElement getTxt_pass() {
		
		return Txt_pass;
	}
   
    public WebElement getLogin_btn() {
		
		return Login_btn;
	}
  

}

package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
public static CnfigDataProvider config;
 public static ExcelDataProvider excel; 
    @BeforeSuite
    public void initiligation() throws Exception {
    	config = new CnfigDataProvider();
        excel = new ExcelDataProvider();
    }
    
    @Parameters({"browsername"})
	@BeforeMethod
	public void setup(String browsername) {
    	if(browsername.equalsIgnoreCase("chrome")) {
    		WebDriverManager.chromedriver().setup();
   		 driver = new ChromeDriver();
    	}else if(browsername.equalsIgnoreCase("Edge")) {
    		
    		WebDriverManager.edgedriver().setup();
      		 driver = new EdgeDriver();
    	}
		
		 driver.manage().window().maximize();
		 driver.get(config.getQaenv_1());
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void browserClose(){
		driver.quit();
		
	}

}

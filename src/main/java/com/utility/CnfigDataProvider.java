package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CnfigDataProvider {
	Properties pro ;
	public  CnfigDataProvider() throws Exception {
		
		String file="C:\\Users\\RAHUL\\eclipse-workspace\\Batch_10_Framework\\Confing\\confing.properties";
		FileInputStream fis = new FileInputStream(file);
		 pro = new Properties();
		pro.load(fis);
	}
	
	
	  public String getQaenv_1() {
		return pro.getProperty("Qaenv_1");
	}

}

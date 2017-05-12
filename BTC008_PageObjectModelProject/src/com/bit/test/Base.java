package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	FirefoxDriver dr;
	
	@Before
	public void open(){
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shafi\\Downloads\\geckodriver.exe");
	dr = new FirefoxDriver();
	dr.manage().window().maximize();
	dr.get("https://www.macys.com");
	}
	
	@After
	
	public void close() throws InterruptedException{
		Thread.sleep(10000);
		dr.quit();
		
	}

}

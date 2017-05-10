package com.bit.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	
	static WebDriver dr;
	
	@BeforeClass
	public static void openBrowser()
	{
		
		dr=new FirefoxDriver();
		dr.get("http://www.Target.com");
		dr.manage().window().maximize();
		
	}
	
	@AfterClass
	public static void end() throws InterruptedException
	{
		Thread.sleep(6000);
		dr.quit();
	}
	
}

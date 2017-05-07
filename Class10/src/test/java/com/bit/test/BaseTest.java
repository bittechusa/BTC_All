package com.bit.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	FirefoxDriver dr;
	public HomePage nevigateToHomePage()
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver");
		dr=new FirefoxDriver();
		dr.get("http://www.target.com");
		return new HomePage(dr);
	}

	void close1()
	{
		dr.quit();
	}
}

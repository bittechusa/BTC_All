package com.selim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	WebDriver dr;
	public void openBrowser(String browser)
	{
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver");
			dr=new FirefoxDriver();
			
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
			dr=new ChromeDriver();
			
		}
		
	}
	public HomePage1 nevigateURL()
	{
		dr.get("http://www.facebook.com");
		return new HomePage1(dr);
	}
	public void close1()
	{
		dr.quit();
	}

}


package com.bit.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	
	WebDriver dr;
	@Before
	public void startBrowser() throws IOException
	{
		FileInputStream f=new FileInputStream("cross.properties");
		Properties p=new Properties();
		p.load(f);
		
		String b=p.getProperty("browser");
		String m=p.getProperty("runmode");
		
		if(b.equals("firefox"))
		{
			if(m.equals("local"))
			{
				System.out.println("ran locally");
				//System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver");
				dr=new FirefoxDriver();
			}
			else if(m.equals("remote"))
			{
				System.out.println("ran remotely");
				System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver");
				dr=new FirefoxDriver();
			}
			
		}
			//for chrome
			else if(b.equals("chrome"))
			{
				if(m.equals("local"))
				{
					System.out.println("ran locally");
					System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
					dr=new ChromeDriver();
				}
				else if(m.equals("remote"))
				{
					System.out.println("ran remotely");
					System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
					dr=new ChromeDriver();
				}
				dr.get(p.getProperty("url"));
		}
		
		
		
		/*//to run project from command line using parameter
		//to give value into terminal while running
	
		String b=System.getProperty("browser");
		String m=System.getProperty("runmode");
		
		//for firefox
		if(b.equals("firefox"))
		{
			if(m.equals("local"))
			{
				System.out.println("ran locally");
				System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver");
				dr=new FirefoxDriver();
			}
			else if(m.equals("remote"))
			{
				System.out.println("ran remotely");
				System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver");
				dr=new FirefoxDriver();
			}
			
		}
			//for chrome
			else if(b.equals("chrome"))
			{
				if(m.equals("local"))
				{
					System.out.println("ran locally");
					System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
					dr=new ChromeDriver();
				}
				else if(m.equals("remote"))
				{
					System.out.println("ran remotely");
					System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
					dr=new ChromeDriver();
				}
		}
		*/
		
		
	}
	
}

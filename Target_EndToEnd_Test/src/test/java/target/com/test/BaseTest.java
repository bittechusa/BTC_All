package target.com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import target.com.share.HomePage;

public class BaseTest 
{
	static WebDriver dr;		
	static Properties p=new Properties();
	static FileInputStream f;
	
	@BeforeClass
	
	public static void openTargetHome() throws IOException
	{
		f=new FileInputStream("config.properties");
		p.load(f);
		
		if(p.getProperty("driver").equals("amarshali"))
		{
		dr=new FirefoxDriver();	
		}
		
		else if(p.getProperty("driver").equals("amarbou"))
		
		{
			System.setProperty("webdriver.chrome.driver", "/Users/MdEmadulHaque/Downloads/chromedriver");
		dr=new ChromeDriver();
		}
		
		dr.get("http://www.target.com/");
		dr.manage().window().maximize();
		
	}
	
	
	
	@AfterClass
	public static void closeWindow() throws InterruptedException
	{
		Thread.sleep(6000);
		dr.quit();
	}
}

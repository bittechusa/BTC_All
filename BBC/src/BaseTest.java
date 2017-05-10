import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	WebDriver dr;

	@Before
	public void start()
	{
		dr=new FirefoxDriver();
		dr.get("http://www.bbc.com");
		dr.manage().window().maximize();
	}
	/*@After
	public void end()
	{
		dr.quit();
	}*/
}

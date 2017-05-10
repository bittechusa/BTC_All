import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetterSetter 
{
	private int a=43535;
	static int b=56;
	
	public int get()
	{
		return a;
	}
	
	public int setA(int x)
	{
		a=x;
		return x;
	}
	
	//abstract void d();
	

	public void openUrl()
	
	{
		System.setProperty("webdriver.geco.driver", "/Users/MdEmadulHaque/Desktop");
		FirefoxDriver dr=new FirefoxDriver();
		
	}
}

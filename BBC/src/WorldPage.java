import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class WorldPage extends LoadableComponent<WorldPage>
{
	WebDriver dr;
	
	@FindBy(xpath=".//*[@id='site-container']/div[1]/div[4]/nav/ul/li[3]/a")
	WebElement ele3;
	WorldPage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public AustraliaPage clickAustralia()
	{
	
		//WebElement ele3=dr.findElement(By.xpath(".//*[@id='site-container']/div[1]/div[4]/nav/ul/li[3]/a"));
	    ele3.click();
	  
									
		return new AustraliaPage(dr);
	}
	public void getTitleWorld()
	{
		String s=dr.getTitle();
		  System.out.println(s);
	}

	@Override
	protected void isLoaded() throws Error 
	{
		Assert.assertTrue(dr.getCurrentUrl().equals("http://www.bbc.com/news/world"));
				System.out.println("isloaded");
		
	}

	@Override
	protected void load() 
	{
		dr.get("http://www.bbc.com/news/world");
		System.out.println("loaded");
		
	}

		
}

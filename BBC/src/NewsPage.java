import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsPage 
{
	WebDriver dr;
	@FindBy(xpath=".//*[@id='site-container']/div[1]/div[2]/ul/li[3]/a")
	WebElement ele1;
	
	NewsPage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	public WorldPage clickWorld()
	{
		//WebElement ele1=dr.findElement(By.xpath(".//*[@id='site-container']/div[1]/div[2]/ul/li[3]/a"));
				ele1.click();
		
	return new WorldPage(dr);
	}
}

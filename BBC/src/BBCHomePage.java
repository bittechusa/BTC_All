import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BBCHomePage 
{
	@FindBy(xpath=".//*[@id='orb-nav-links']/ul/li[1]/a")
	WebElement ele2;
	
	WebDriver dr;
	
	BBCHomePage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	public NewsPage clickNews()
	{
	       //WebElement ele2=dr.findElement(By.xpath(".//*[@id='orb-nav-links']/ul/li[1]/a"));
	       ele2.click();
	return new NewsPage(dr);
	}
}

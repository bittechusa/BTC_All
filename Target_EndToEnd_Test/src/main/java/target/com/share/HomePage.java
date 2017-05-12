package target.com.share;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	WebDriver dr;
	@FindBy(xpath=".//*[@id='searchLabel']")
	WebElement searchButton;	
	
	@FindBy(xpath="html/body/div[2]/div[2]/nav[1]/div[1]/form/button[2]")
	WebElement open_Men_ShirtPage;
	
	public HomePage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	public void search_men_shirt()
	{
		//= dr.findElement(By.xpath(".//*[@id='searchLabel']"));
		searchButton.sendKeys("men shirt");
		
	}
	public MenShirtPage click_on_go()
	{
		open_Men_ShirtPage.click();
		
		return new MenShirtPage(dr);
	}
		
	
}

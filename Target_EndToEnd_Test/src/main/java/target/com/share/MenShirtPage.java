package target.com.share;

import java.util.List;

import javax.swing.text.html.ListView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class MenShirtPage

{
	WebDriver dr;
	@FindBy(xpath=".//*[@id='promotedFacet']/div/div[1]/div[2]/button")
	WebElement size_Button;
	
	@FindBy(xpath=".//*[@id='promotedFacet']/div/div[1]/div[2]/ul/li/label")
	List<WebElement> list_of_sizes;
	
	@FindBy(xpath=".//*[@id='slp']/section/div/div/ul/li/div[1]/div[1]/h3/a")
	List<WebElement> list_of_products;
	
//	@FindBy(xpath=".//*[@id='atcMainWrap']/div[4]/div[2]/div/ul/li/a")
//	List<WebElement> sizeOf_currenProducts;
	
	public MenShirtPage(WebDriver dr) 
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
		
	}
	public void verify_Title()
	{
		String title=dr.getTitle();
		if(title=="lkskskl")
		{
			System.out.println("Title matched");
			
		}
		else
		{
			System.out.println(dr.getTitle());
		}
		
	}
	public void click_Size_Button()
	{
		size_Button.click();
	}
	
	public void select_Sizes()
	{
		list_of_sizes.get(3).click();
	}
	public void select_Product()
	{
		System.out.println(list_of_products.size());
		list_of_products.get(0).click();
		
	}
	public void select_currentProduct_Size()
	{
		
		dr.findElement(By.xpath(".//*[@id='atcMainWrap']/div[4]/div[2]/div/ul/li[1]/a")).click();
		
		
//		int a=sizeOf_currenProducts.size();
//		System.out.println(a);
//		Boolean b=sizeOf_currenProducts.get(0).isDisplayed();
//		System.out.println(b);
//		sizeOf_currenProducts.get(0).click();
			
	}
	public void clickAddTocart()
	{
		
		dr.findElement(By.xpath("html/body/div[2]/div[4]/div/aside/div[2]/div[4]/div/div[1]/div[5]/div/div[1]/div/button")).click();
			
	}
	
	public void continue_Shopping()
	{
		dr.findElement(By.xpath(".//*[@id='block-ATC']/div[2]/div/div[2]/div/div[3]/button")).click();
	}
	
	public void verifiy_Cart()
	{
		
	Boolean b=dr.findElements(By.xpath(".//*[@id='js-toggleMiniCartLg']/span")).isEmpty();
	System.out.println(b);
		
		
	}


}

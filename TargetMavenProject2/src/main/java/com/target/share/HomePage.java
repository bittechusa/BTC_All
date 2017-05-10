package com.target.share;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	WebDriver dr;
	
	public HomePage(WebDriver dr)
	{
		this.dr=dr;
	}
	
	
	public MenShirt typeMenShirt_clickGo()
	{
		WebElement ele1=dr.findElement(By.xpath(".//*[@id='searchLabel']"));
				ele1.sendKeys("Men Shirt");
		WebElement ele2=dr.findElement(By.xpath("html/body/div[2]/div[2]/nav[1]/div[1]/form/button[2]"));
		ele2.click();
		return new MenShirt(dr);
	}

}

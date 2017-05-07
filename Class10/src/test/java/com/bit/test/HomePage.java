package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage 
{
	FirefoxDriver dr;
	HomePage(FirefoxDriver x)
	{
		dr=x;
	}
	public void clickCatagory()
	{
		
		dr.findElement(By.xpath(".//*[@id='js-toggleLeftNavLg']")).click();
	}
	public void clickClothing()
	{
		dr.findElement(By.xpath(".//*[@id='5xtd3']/a")).click();
	}
	public ClothPage clickShopAllClothing()
	{
		dr.findElement(By.xpath(".//*[@id='5xtd3']/a")).click();
		return new ClothPage(dr);
	}
	

}

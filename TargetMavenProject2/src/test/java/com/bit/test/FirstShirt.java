package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class FirstShirt 
{
	WebDriver dr;
	public FirstShirt(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public void select_Click_17_32_33() throws InterruptedException
	{
        dr.findElement(By.xpath(".//*[@id='atcMainWrap']/div[4]/div[2]/div/ul/li[1]/a")).click();
		Thread.sleep(5000);
	
		dr.findElement(By.xpath(".//*[@id='AddToCartAreaId']/div[1]/div/button")).click();
		Thread.sleep(5000);
		
		dr.findElement(By.xpath(".//*[@id='block-ATC']/div[2]/div/div[2]/div/div[3]/button")).click();
		
		Thread.sleep(3000);
	}
	public void verifyItem()
	{
	
				
		try
		{
		
		dr.findElement(By.xpath(".//*[@id='js-toggleMiniCartLg']/span"));
		System.out.println("Element exists");
		}
		catch(NoSuchElementException e)
		{
		System.out.println("Element Not exists");
		}
		
		
		
	}

}

package com.target.share;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bit.test.FirstShirt;

public class MenShirt 
{
	WebDriver dr;
	MenShirt(WebDriver dr)
	{
		this.dr=dr;
	}

	public void clickSize_Select_15_5_32_33()
	{
		dr.findElement(By.xpath(".//*[@id='promotedFacet']/div/div[1]/div[2]/button")).click();
		dr.findElement(By.xpath(".//*[@id='promotedFacet']/div/div[1]/div[2]/ul/li[3]/label")).click();
		int size=dr.findElements(By.xpath(".//*[@id='slp']/section/div/div/ul/li")).size();
		System.out.println(size);

	}
	public FirstShirt clickMenShirt()
	{
		dr.findElement(By.xpath(".//*[@id='slp']/section/div/div/ul/li[1]/div[1]/div[1]/h3/a")).click();
		return new FirstShirt(dr);
	}
	
}

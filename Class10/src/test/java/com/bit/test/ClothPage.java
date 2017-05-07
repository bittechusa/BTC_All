package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClothPage 
{
	FirefoxDriver dr;
	ClothPage(FirefoxDriver x)
{
	dr=x;
}

	public MensPage clickMensCloth()
	{
		dr.findElement(By.xpath("")).click();
		return new MensPage();
		
		
	}
	
}

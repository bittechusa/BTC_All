package com.selim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver dr;
	@FindBy(xpath=".//*[@id='logonIdMain']") WebElement userIdTextBox;
	@FindBy(xpath=".//*[@id='logonPasswordMain']") WebElement passTextBox;
	LoginPage(WebDriver x)
	{
		dr=x;
		PageFactory.initElements(dr, this);
	}
	public void type(String text)
	{
		userIdTextBox.sendKeys(text);
	}
	public void typePass(String text)
	{
		passTextBox.sendKeys(text);
	}


}

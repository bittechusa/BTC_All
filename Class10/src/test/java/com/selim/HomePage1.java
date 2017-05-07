package com.selim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 
{
	WebDriver dr;
	@FindBy(xpath=".//*[@id='js-toggleRightNavLg']") WebElement createAccount;
	HomePage1(WebDriver x)
	{
		dr=x;
		PageFactory.initElements(dr, this);
	}
	public void clickCreateAccount()
	{
		createAccount.click();
	}
	public LoginPage clickLogIn()
	{
		dr.findElement(By.xpath(".//*[@id='rightNav-signIn']")).click();
		return new LoginPage(dr);
	}
	void clickCatagory()
	{
		dr.findElement(By.xpath("Scenario Outline: login validation")).click();
	}
	
	public void typeUserID()
	{
		dr.findElement(By.id("email")).sendKeys("sjghjg");
	}
	
	public void typeUserID(String s)
	{
		dr.findElement(By.id("email")).sendKeys(s);
	}
	
	public void typPass(String s)
	{
		dr.findElement(By.id("email")).sendKeys(s);
	}
	
	public void typePass()
	{
		dr.findElement(By.id("pass")).sendKeys("12sjghjg");
	}
	public void click()
	{
		dr.findElement(By.id("u_0_u")).click();
	}

}

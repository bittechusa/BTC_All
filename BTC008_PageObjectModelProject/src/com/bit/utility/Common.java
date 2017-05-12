package com.bit.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	
	FirefoxDriver dr;
	
	public Common(FirefoxDriver dr){
		this.dr = dr;
	}
	
	public void verifyTitle(String url){
		String title = dr.getTitle();
		
		if(title.equals(url)){
			System.out.println("Title found as : " + title);
		}
		else{
			System.out.println("Title not found");
		}
	}
	public void verifyUrl(String Url){
		String U =dr.getCurrentUrl();
		
		if(U.equals(Url)){
			System.out.println("URL found as :" + Url); 
		}
		else{
			System.out.println("URL not found");
		}
	}
	public void myClick(By by){
		dr.findElement(by).click();
	}
	public void myType(WebElement ele,String value){
		ele.sendKeys(value);
	}
	public void verifyElementDisplayById(String idValue){
		WebElement e = dr.findElement(By.id(idValue));
		if(e.isDisplayed()){
			System.out.println("Element is displayed");
	}
		else{
			System.out.println("Element not displayed");
	}
	}
	
	public WebElement anyAction(WebElement ele){
		
		return ele;
	}
}

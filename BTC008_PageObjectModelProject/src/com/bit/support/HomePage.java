package com.bit.support;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.utility.Common;

public class HomePage {
	FirefoxDriver dr;
	Common c;
	
	public  HomePage(FirefoxDriver dr){
		this.dr=dr;
	}

public void verifyHomepageTitle(){
	c = new Common (dr);
	c.verifyUrl("https://www.macys.com");
}
public void verifyLogo(){
	c= new Common (dr);
	c.verifyElementDisplayById("core");
}
public KidsPage clickKids(){
	c = new Common (dr);
	c.myClick(By.xpath(".//*[@id='flexLabel_5991']/a"));
	
	return new KidsPage(dr);
}
}
	
	
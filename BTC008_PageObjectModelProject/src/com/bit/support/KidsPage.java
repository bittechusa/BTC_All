package com.bit.support;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.utility.Common;

public class KidsPage {
	FirefoxDriver dr;
	Common c;

	public KidsPage(FirefoxDriver dr) {
		this.dr= dr;
	}
	public void verifyKidsPageURL(){
		c= new Common (dr);
		c.verifyUrl("https://www.macys.com/shop/kids-clothes?id=5991&cm_sp=us_hdr-_-kids-_-5991_kids");
	
	}
	public void verifyKidsPageTitle(){
		c = new Common (dr);
		c.verifyTitle("Kids Clothes at Macy's - Clothing for Children - Macy's");
	}
	
	public void verifyLogo(){
		c= new Common (dr);
		c.anyAction(dr.findElement(By.cssSelector("first>a"))).isDisplayed();
	}

}

package com.bit.test;

import org.junit.Test;

import com.bit.support.HomePage;
import com.bit.support.KidsPage;

public class SmokeTest extends Base{
	HomePage homePage;
	KidsPage kidsPage;
	
	@Test
	public void searchVerify(){
		homePage= new HomePage(dr);
		System.out.println("Homepage Start......................");
		homePage.verifyHomepageTitle();
		System.out.println("Homepage Close......................");
		System.out.println("Kidspage Start......................");
		kidsPage= homePage.clickKids();
		kidsPage.verifyKidsPageURL();
		kidsPage.verifyKidsPageTitle();
		System.out.println("Kidspage Close.....................");
		
	}
	

}

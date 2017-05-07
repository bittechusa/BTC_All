package com.bit.test;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination 
{
	BaseTest bs;
	HomePage hp;
	ClothPage cp;
	MensPage mp;
	@When("^nevigate to target HomePage$")
	public void nevigate_to_target_HomePage() throws Throwable {
		bs=new BaseTest();
		hp=bs.nevigateToHomePage();
	}

	@When("^i click catagory menu$")
	public void i_click_catagory_menu() throws Throwable {
	    hp.clickCatagory();
	}

	@When("^i click clothing subCatagory$")
	public void i_click_clothing_subCatagory() throws Throwable {
	  hp.clickClothing();  
	}

	@When("^i click shopAllClothing subcatagory$")
	public void i_click_shopAllClothing_subcatagory() throws Throwable {
	   cp=hp.clickShopAllClothing();
	}

	@When("^i click mensOption$")
	public void i_click_mensOption() throws Throwable {
	    mp=cp.clickMensCloth();
	}

	@Then("^i shold nevigate to MenPage$")
	public void i_shold_nevigate_to_MenPage() throws Throwable {
	  bs.close1();  
	}

	
	
	
	
	
	

	
//	@Test
//	public void m1()
//	{
//		BaseTest bs=new BaseTest();
//		HomePage hp=bs.nevigateToHomePage();
//		hp.clickCatagory();
//		hp.clickClothing();
//		ClothPage cl=hp.clickShopAllClothing();
//		MensPage mp=cl.clickMensCloth();
//	}

}

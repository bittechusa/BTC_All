//package com.selim;
//
//import java.util.List;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefination_selim
//{
//	Base b;
//	HomePage1 hp1;
//	LoginPage lp;
//	
//	
//	@Before
//	public void m1()
//	{
//		System.out.println("scenario started");
//	}
//	@After
//	public void m2()
//	{
//		System.out.println("scenario finished");
//	}
//	
//	@Before("@tag1")
//	public void m3()
//	{
//		System.out.println(" tag1 scenario started");
//	}
//	@After("@tag1")
//	public void m4()
//	{
//		System.out.println(" tag1 scenario finished");
//	}
//	
//	@Given("^i open browser$")
//	public void i_open_browser(DataTable arg1) throws Throwable {
//	  b=new Base();
//	  List<List<String>> datas=arg1.raw();
//	 String f= datas.get(0).get(0);
//	 String c= datas.get(1).get(0);
//	 b.openBrowser(f);
//	}
//
//	@Given("^i navigate to target homePage$")
//	public void i_navigate_to_target_homePage() throws Throwable {
//	  hp1=b.nevigateURL();
//	}
//
//	@When("^i click create account button$")
//	public void i_click_create_account_button() throws Throwable {
//	  hp1.clickCreateAccount();
//	  Thread.sleep(5000);
//	 lp= hp1.clickLogIn();
//	}
//
//	@When("^i type userId \"([^\"]*)\"$")
//	public void i_type_userId(String arg1) throws Throwable {
//		 Thread.sleep(5000);
//		lp.type(arg1);
//	}
//
//	@When("^i type password \"([^\"]*)\"$")
//	public void i_type_password(String arg1) throws Throwable {
//		 Thread.sleep(5000);
//		lp.typePass(arg1);
//	}
//
//	@When("^i will click login button$")
//	public void i_will_click_login_button() throws Throwable {
//	  b.close1();
//	}
//
//	@Then("^i should be on my profile page$")
//	public void i_should_be_on_my_profile_page() throws Throwable {
//	   
//	}
//	@When("^i click catagory button$")
//	public void i_click_catagory_button() throws Throwable {
//	    hp1.clickCatagory();
//	}
//
//
//
//}

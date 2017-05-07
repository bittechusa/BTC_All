package bdd.secondClass;

import java.util.List;

import com.selim.Base;
import com.selim.HomePage1;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination 
{
	Base b;
	HomePage1 hp;
	@Given("^i open browser$")
	public void i_open_browser(DataTable arg1) throws Throwable {
	  b=new Base();
	  List<List<String>> datas=arg1.raw();
	 String f= datas.get(0).get(0);
	 String c= datas.get(1).get(0);
	  b.openBrowser(f);
	}

	@Given("^i nevigate to facebook homePage$")
	public void i_nevigate_to_facebook_homePage() throws Throwable {
	   hp=b.nevigateURL();
	}

	@When("^i type valid email in userIDBox$")
	public void i_type_valid_email_in_userIDBox() throws Throwable {
	  hp.typeUserID();
	}

	@When("^i type valid password in passwordBox$")
	public void i_type_valid_password_in_passwordBox() throws Throwable {
	   hp.typePass();
	}

	@When("^i click on logIn button$")
	public void i_click_on_logIn_button() throws Throwable {
	 hp.click();   
	}

	@Then("^i should be on my profile page$")
	public void i_should_be_on_my_profile_page() throws Throwable {
	    b.close1();
	}

	@When("^i type invalid email in \"([^\"]*)\"$")
	public void i_type_invalid_email_in(String arg1) throws Throwable {
	   hp.typeUserID(arg1);
	}

	@When("^i type invalid password in \"([^\"]*)\"$")
	public void i_type_invalid_password_in(String arg1) throws Throwable {
	    hp.typPass(arg1);
	}

	@Then("^i should not be on my profile page$")
	public void i_should_not_be_on_my_profile_page() throws Throwable {
	  System.out.println("invalid scenario");
		b.close1();
	}


}

package stepdef;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.LoginPageOrangehrm;

public class Stepdef {
         LoginPage loginpage=new LoginPage(BaseClass.getDriver());
         LoginPageOrangehrm login=new LoginPageOrangehrm(BaseClass.getDriver());
	

	   @Given("user is on facebook login page.")
	   public void user_is_on_facebook_login_page() {
		   loginpage.user_navigatesto_loginpage(); 
	   }

	   @When("user click on sign up for facebook link.")
	   public void user_click_on_sign_up_for_facebook_link() {
		   loginpage.clickonsignupelink(); 
	   }

	   @Then("verify user navigates to facebook signup page.")
	   public void verify_user_navigates_to_facebook_signup_page() {
		  assertEquals("Create a new account",loginpage.verifypagetitle());  
	   }
	  
	
}












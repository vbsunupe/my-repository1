package stepdef;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.LoginPageOrangehrm;

public class Stepdef2 {
         LoginPage loginpage=new LoginPage(BaseClass.getDriver());
         LoginPageOrangehrm login=new LoginPageOrangehrm(BaseClass.getDriver());
         @When("user navigates to Facebook login page.")
     	public void user_navigates_to_facebook_login_page() {
     		loginpage.user_navigatesto_loginpage();
     	}

     	@Then("verify the text is {string}")
     	public void verify_the_text_is(String text1) {
     		
     		assertTrue(loginpage.textverification().contains(text1));
     	}

	 
	
}




/*@Given("user navigates to registration page.")
public void user_navigates_to_registration_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user fill all details.")
public void user_fill_all_details() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("clicks on submit button.")
public void clicks_on_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("verify the registration is succefull.")
public void verify_the_registration_is_succefull() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}*/







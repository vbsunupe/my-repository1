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
import pages.DEMOQA_page;
import pages.LoginPage;
import pages.LoginPageOrangehrm;

public class DEMOQA_REGISTRATION {
	DEMOQA_page demoqa=new DEMOQA_page(BaseClass.getDriver());

	@Given("user navigates to registration page.")
	public void user_navigates_to_registration_page() throws IOException {
		demoqa.user_navigatesto_registration_page();
	}

	@When("user fill all details.")
	public void user_fill_all_details() {
		demoqa.setalldetails();
	}

	@When("clicks on submit button.")
	public void clicks_on_submit_button() {
	}

	@Then("verify the registration is succefull.")
	public void verify_the_registration_is_succefull() {
		
	}
}






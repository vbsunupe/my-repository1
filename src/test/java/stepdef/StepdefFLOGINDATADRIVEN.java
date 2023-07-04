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

public class StepdefFLOGINDATADRIVEN {
	LoginPage loginpage=new LoginPage(BaseClass.getDriver());
	LoginPageOrangehrm login=new LoginPageOrangehrm(BaseClass.getDriver());

	@Given("user navigates to login page.")
	public void user_navigates_to_login_page() {
		loginpage.user_navigatesto_loginpage();
	}

	@When("user provides {string} and {string}")
	public void user_provides_and(String email, String password) {
		loginpage.setemailandpassword(email, password);
	}

	@When("clicks on login botton.")
	public void clicks_on_login_botton() {
		loginpage.clickonloginbtn();
	}
	@Then("verify company logo is displayed or not.")
	public void verify_company_logo_is_displayed_or_not() {
		assertTrue(loginpage.logoverification().isDisplayed());

	}

	



}








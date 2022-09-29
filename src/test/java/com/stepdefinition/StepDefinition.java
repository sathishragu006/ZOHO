package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclase.ZohoBaseClass;
import com.runner.ZohoRunnerClass;

import ZohoPom.Loginpage;
import ZohoProperties.ConfigrationHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends ZohoBaseClass {

	public static WebDriver driver = ZohoRunnerClass.driver;
	
	public static Loginpage log = new Loginpage(driver);

	@Given("user Need To Launch Url")
	public void user_need_to_launch_url() throws IOException {
		String url = ConfigrationHelper.getInstance().getUrl();
		launchUrlBaseClass(url);

	}

	@When("user Should Select Sign Up Now button")
	public void user_should_select_sign_up_now_button() throws IOException {
		clickOnElement(log.getSignup());
	}

	@When("user Need To Fetch The Email Module")
	public void user_need_to_fetch_the_email_module() throws IOException, InterruptedException {
		String email2 = ConfigrationHelper.getInstance().getEmail();
		userInput(log.getEmail(), email2);

	}

	@Then("need To Pass Email Id Through Sendkeys")
	public void need_to_pass_email_id_through_sendkeys() throws IOException {
		String password = ConfigrationHelper.getInstance().getPassword();
		userInput(log.getPassword(), password);
		clickOnElement(log.getButton());
		clickOnElement(log.getLogin());

	}

}

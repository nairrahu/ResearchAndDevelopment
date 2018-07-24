package com.bitwiseglobal.automation.step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs {

	private WebDriver webDriver;

	public LoginStepDefs() {
		webDriver = Hooks.getDriver();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^user is able to view Dashboard$")
	public void user_is_able_to_view_Dashboard() throws Throwable {
		Thread.sleep(20000);
		Assert.assertTrue("Dashboard".equals(
				webDriver.findElement(By.className("main-content--header")).findElement(By.tagName("h1")).getText()));
	}

	@Then("^user is able to logout$")
	public void user_is_able_to_logout() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^user views BusinessView Portal$")
	public void user_views_BusinessView_Portal() throws Throwable {
		webDriver.get("https://merchantplatform-qa1.globalpay.com");
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@When("^user with username (.*) and password (.*) logs in$")
	public void user_with_username_gp_tech_support_admin_globalpay_com_and_password_P_ssword_logs_in(String userName,
			String password) throws Throwable {
		webDriver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		webDriver.findElement(By.id("signInName")).sendKeys(userName);
		webDriver.findElement(By.id("password")).sendKeys(password);
		webDriver.findElement(By.id("next")).click();
		Thread.sleep(5000);

	}
}

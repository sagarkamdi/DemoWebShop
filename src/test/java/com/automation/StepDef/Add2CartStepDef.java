package com.automation.StepDef;

import com.automation.GenericUtils.DriverUtils;
import com.automation.Pages.Add2cartPage;
import com.automation.Test.LoginTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add2CartStepDef {
	@Given("Open Browser and Login")
	public void open_browser_and_login() {
		DriverUtils.getDriver().get("http://demowebshop.tricentis.com/");
		LoginTest lt = new LoginTest();
		lt.VerifysuccessfulLogin();
	}

	@When("Search an Item to buy")
	public void search_an_item_to_buy() throws InterruptedException {
		Add2cartPage up = new Add2cartPage();
		up.Perform_ACT1();
		up.clickAddCart1();
		Thread.sleep(2000);
		up.Perform_ACT2();
		up.clickAddCart2();
		Thread.sleep(2000);
	}

	@Then("add that Item to cart")
	public void add_that_item_to_cart() {
	    System.out.println("Item added to cart");
	}

}

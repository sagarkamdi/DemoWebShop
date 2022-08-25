package com.automation.StepDef;

import java.io.IOException;

import com.automation.Pages.CheckoutPage;
import com.automation.Test.Add2cartTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepDef {

	@Given("Open browser login and add2cart")
	public void open_browser_login_and_add2cart() throws InterruptedException {
		Add2cartTest at = new Add2cartTest();
		at.VerifyAdd2Cart();
		Thread.sleep(2000);
	}

	CheckoutPage cp = new CheckoutPage();

	@When("go to cart and checkout")

	public void go_to_cart_and_checkout() throws InterruptedException, IOException {

		cp.clickCart();
		Thread.sleep(2000);
		cp.clickTOS();
		cp.clickCheckout();
		cp.clickCont();

	}

	@Then("add payment info")
	public void add_payment_info() throws InterruptedException, IOException {
		cp.pickInStore();
		cp.shipkAdd();
		cp.PayMethod();
		cp.PayInfo();
		cp.clickConOrder();
		cp.orderDetails();
		cp.takeSS();
		Thread.sleep(2000);
		cp.downloadInvoice();
	}

}

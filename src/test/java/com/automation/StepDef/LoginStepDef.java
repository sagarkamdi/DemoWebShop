package com.automation.StepDef;

import org.testng.Assert;

import com.automation.GenericUtils.DriverUtils;
import com.automation.GenericUtils.ExcelData;
import com.automation.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	@Given("Open the Browser")
	public void open_the_browser() {
		DriverUtils.getDriver().get("http://demowebshop.tricentis.com/");
	  
	}

	@When("Enter valid username and Password")
	public void enter_valid_username_and_password() {
		String Username = ExcelData.getData(
				"C:\\Users\\sagar.kamdi\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\Data\\DWS_data.xlsx", "Sheet1", 0, 0);
		String Password = ExcelData.getData(
				"C:\\Users\\sagar.kamdi\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\Data\\DWS_data.xlsx", "Sheet1", 0, 1);

		String act=DriverUtils.getDriver().getTitle();
		String exp="Demo Web Shop";
		Assert.assertEquals(act, exp);
		LoginPage lp = new LoginPage();
		lp.selectLogin();
		lp.enterUsername(Username);
		lp.enterPassword(Password);
		lp.clickbtnLogin();
	}

	@Then("Login Validation Successful")
	public void login_validation_successful() {
	    System.out.println("Login Validation Successful");
	}


}

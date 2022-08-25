package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Feature\\Login.feature" ,"src\\test\\resources\\Feature\\Add2Cart.feature",
		"src\\test\\resources\\Feature\\Checkout.feature"
		}, glue = "com.automation.StepDef", plugin = {
				"html:reports/reports.html", "json:target/cucumber.json", "rerun:target/rerun.txt" },tags="@Login_tag or @Add2cart_tag")

public class Testrunner {

}

package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	@FindBy(xpath = "//a[@class='ico-login']")
	private WebElement loginSelect;

	@FindBy(xpath = "//input[@name='Email']")
	private WebElement emailInput;

	@FindBy(xpath = "//input[@name='Password']")
	private WebElement passwordInput;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	public void selectLogin() {
		loginSelect.click();
	}

	public void enterUsername(String username) {
		emailInput.sendKeys(username);

	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);

	}

	public void clickbtnLogin() {
		loginButton.click();
	}

}

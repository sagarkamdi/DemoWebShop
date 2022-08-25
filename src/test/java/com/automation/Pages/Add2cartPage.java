package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Add2cartPage extends BasePage {

	// declaration
	@FindBy(xpath = "(//a[@href='/electronics'])[1]")
	private WebElement electronics;

	@FindBy(xpath = "(//a[@href='/cell-phones'])[1]")
	private WebElement cellphone;

	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	private WebElement btnaddcart;
	
	
	@FindBy(xpath = "(//a[@href='/apparel-shoes'])[1]")
	private WebElement apparel;

	@FindBy(xpath = "(//input[@value='Add to cart'])[5]")
	private WebElement btnaddcart2;

	

	public void Perform_ACT1() {
		Actions act = new Actions(driver);
		act.moveToElement(electronics).perform();
		act.moveToElement(cellphone).perform();
		cellphone.click();

	}

	public void clickAddCart1() {
		btnaddcart.click();
	}
	
	public void Perform_ACT2() {
		Actions act = new Actions(driver);
		act.moveToElement(apparel).perform();
		apparel.click();

	}

	public void clickAddCart2() {
		btnaddcart2.click();
	}

}

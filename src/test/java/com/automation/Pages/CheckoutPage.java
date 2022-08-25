package com.automation.Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
	@FindBy(xpath = "(//a[@class='ico-cart'])[1]")
	private WebElement btncart;

	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement tos;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSubmit;

	@FindBy(xpath = "//input[@title='Continue']")
	private WebElement btnCont;

	@FindBy(xpath = "//input[@id='PickUpInStore']")
	private WebElement pickInStore;

	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement shipAdd;

	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement payMode;

	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement payInfo;

	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement btnConfirmOrd;

	@FindBy(linkText = "Click here for order details.")
	private WebElement ordDetails;
	
	@FindBy(xpath = "//a[@class='button-2 pdf-order-button']")
	private WebElement printInvo;
	
	
	public void clickCart() {
		btncart.click();
	}

	public void clickTOS() {
		tos.click();
	}

	public void clickCheckout() {
		btnSubmit.click();
	}

	public void clickCont() {
		btnCont.click();
	}

	public void pickInStore() {
		pickInStore.click();
	}

	public void shipkAdd() {
		shipAdd.click();
	}

	public void PayMethod() {
		payMode.click();
	}

	public void PayInfo() {
		payInfo.click();
	}

	public void clickConOrder() {
		btnConfirmOrd.click();
	}

	public void orderDetails() {
		ordDetails.click();
	}
	
	public void takeSS() throws InterruptedException, IOException {
		TakesScreenshot t= (TakesScreenshot)driver;
		File src= t.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest=new File("D:\\SS\\order.jpg");
		Thread.sleep(2000);
		FileUtils.copyFile(src, dest);
	}

	public void downloadInvoice() {
		printInvo.click();
	}
}

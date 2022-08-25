package com.automation.Test;


import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.Pages.CheckoutPage;

public class CheckoutTest extends BaseTest {
	
	
	
	@Test

	public void VerifyCheckout() throws InterruptedException, IOException {
		Add2cartTest at= new Add2cartTest();
		at.VerifyAdd2Cart();
		Thread.sleep(2000);
		CheckoutPage cp=new CheckoutPage();
		cp.clickCart();
		Thread.sleep(2000);
		cp.clickTOS();
		cp.clickCheckout();
		cp.clickCont();
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

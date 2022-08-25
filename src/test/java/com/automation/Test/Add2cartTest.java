package com.automation.Test;


import org.testng.annotations.Test;
import com.automation.Pages.Add2cartPage;

public class Add2cartTest extends BaseTest {
	
	
	
	
	@Test

	public void VerifyAdd2Cart() throws InterruptedException {
		LoginTest lt = new LoginTest();
		lt.VerifysuccessfulLogin();
		
		Add2cartPage up = new Add2cartPage();
		up.Perform_ACT1();
		up.clickAddCart1();
		Thread.sleep(2000);
		up.Perform_ACT2();
		up.clickAddCart2();
		Thread.sleep(2000);
		//up.clickCart();

	}
}

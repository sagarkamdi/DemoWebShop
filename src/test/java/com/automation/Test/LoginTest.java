package com.automation.Test;


import org.testng.Assert;

import org.testng.annotations.Test;
import com.automation.GenericUtils.DriverUtils;
import com.automation.GenericUtils.ExcelData;
import com.automation.Pages.LoginPage;


public class LoginTest extends BaseTest {
	

	@Test

	public void VerifysuccessfulLogin() {
		String Username = ExcelData.getData(
				"C:\\Users\\sagar.kamdi\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\Data\\DWS_data.xlsx", "Sheet1", 0, 0);
		String Password = ExcelData.getData(
				"C:\\Users\\sagar.kamdi\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\Data\\DWS_data.xlsx", "Sheet1", 0, 1);

		System.out.println(Username+"\n"+Password);
		DriverUtils.getDriver().get("http://demowebshop.tricentis.com/");
		String act=DriverUtils.getDriver().getTitle();
		String exp="Demo Web Shop";
		Assert.assertEquals(act, exp);
		LoginPage lp = new LoginPage();
		lp.selectLogin();
		lp.enterUsername(Username);
		lp.enterPassword(Password);
		lp.clickbtnLogin();

	}
}

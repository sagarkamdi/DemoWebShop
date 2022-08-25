package com.automation.Test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.GenericUtils.DriverUtils;
import com.automation.Pages.LoginPage;

public class LoginTest_DataProvider extends BaseTest {

	@Test(dataProvider ="create_login")

	public void VerifysuccessfulLogin(String username, String password) {
		DriverUtils.getDriver().get("http://demowebshop.tricentis.com/");
		LoginPage lp = new LoginPage();
		lp.selectLogin();
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickbtnLogin();
		//DriverUtils.getDriver().close();
		

	}
	
	@DataProvider(name="create_login")
	public Object[][] dataSet1()
	{
		return new Object[][]
				{
				{"standard_user","secret_sauce"},
				{"Plbani@gmail.com","admin1234"},
				{"locked_out_user","secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"},
				};
	}
}

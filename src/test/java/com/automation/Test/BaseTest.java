package com.automation.Test;

import org.testng.annotations.BeforeMethod;

import com.automation.GenericUtils.DriverUtils;

public class BaseTest {
	@BeforeMethod
	public void Precondition() {
		{
			DriverUtils.createDriver();
		}

	}

	/*
	 * @AfterMethod public void Postcondition() { { DriverUtils.getDriver().close();
	 * }
	 * 
	 * }
	 */

}

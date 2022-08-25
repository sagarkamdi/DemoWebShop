package com.automation.Test;

import org.testng.annotations.Test;

public class Grps extends BaseTest{

	

	@Test(priority = 1)
		public void VerifyLogin() {
			// TODO Auto-generated method stub
			System.out.println("Hi.... User Logged In");

		}

	@Test(dependsOnMethods = "VerifyLogin",priority = 2)
		public void searchItem() {
			// TODO Auto-generated method stub
			System.out.println("search the Item you want to buy");

		}

	@Test(groups = {"searchItem","Add2cart"} )
		public void Add2cart() {
			// TODO Auto-generated method stub
			System.out.println("Add2cart");

		}
	
	@Test(priority = 3,dependsOnGroups = {"searchItem","Add2cart"})
	public void Checkout() {
		// TODO Auto-generated method stub
		System.out.println("Checkout");

	}

	@Test(dependsOnMethods = "Checkout")
		public void Add_Card_Details() {
			// TODO Auto-generated method stub
			System.out.println("Added_Card_Details");

		}

}


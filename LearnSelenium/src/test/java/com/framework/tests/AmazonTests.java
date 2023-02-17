package com.framework.tests;

import org.testng.annotations.Test;

import com.awa.framework.DriverManager;
import com.awa.framework.Selenium;

import junit.framework.Assert;

public class AmazonTests {

	@Test
	public void verifyThatIAmAbleToRunMyFirstAutomatedTest() throws InterruptedException {

		DriverManager.openBrowser();
		Selenium selenium = new Selenium();
		selenium.navigateToAmazon();
		selenium.clickHelloSignIn();
		selenium.setEmail("amit.tripathi9696@gmail.com");
		selenium.clickContinueButton();
		selenium.setPassword("Amazon@113920");
		selenium.clickSignInButton();
		Thread.sleep(10000);
		String expectedLoggedInUser = "Hello, Amit";
		String actualLoggedInUser = selenium.getNameOfLoggedInUser();
		Assert.assertEquals(expectedLoggedInUser, actualLoggedInUser);

		selenium.closeBrowser();
		
	}
}

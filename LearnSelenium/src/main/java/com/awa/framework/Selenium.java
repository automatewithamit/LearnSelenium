package com.awa.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selenium {

	public void navigateToAmazon() {
		DriverManager.driver.navigate().to("https://www.amazon.in/");
	}

	public void clickHelloSignIn() {
		WebElement helloSignIn = DriverManager.driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
		helloSignIn.click();
	}

	public void setEmail(String email) {
		WebElement emailTextBox = DriverManager.driver.findElement(By.xpath("//input[@type='email']"));
		emailTextBox.sendKeys(email);
	}

	public void clickContinueButton() {
		WebElement continueButton = DriverManager.driver.findElement(By.xpath("//input[@id='continue']"));
		continueButton.click();
	}

	public void setPassword(String password) {
		WebElement passwordTextBox = DriverManager.driver.findElement(By.xpath("//input[@type='password']"));
		passwordTextBox.sendKeys(password);
	}

	public void clickSignInButton() {
		WebElement signInButton = DriverManager.driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signInButton.click();
	}

	public String getNameOfLoggedInUser() {
		WebElement loggedInUser = DriverManager.driver
				.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		return loggedInUser.getText();
	}

	public void closeBrowser() {
		DriverManager.driver.quit();
	}

}

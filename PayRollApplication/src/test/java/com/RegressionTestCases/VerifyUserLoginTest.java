package com.RegressionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.PageObjects.LoginPage;
import com.ActionDriver.Action;

public class VerifyUserLoginTest extends BaseClass {
	@BeforeTest
	public void call() {
		launchApp();
	}
	@Test
	public void validUserLoginTest() {
		LoginPage lp = new LoginPage(driver);
		lp.validLogin();
		WebElement ele =  driver.findElement(By.xpath("//h1[text()='Payroll Application']"));
		Action act = new Action();
		act.implicitWait(driver, 10);
		boolean flag = act.isDisplayed(driver, ele);
		Assert.assertTrue(flag);
		
	}
}

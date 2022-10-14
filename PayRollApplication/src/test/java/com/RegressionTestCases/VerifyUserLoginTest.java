package com.RegressionTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.PageObjects.LoginPage;

public class VerifyUserLoginTest extends BaseClass {
	@BeforeTest
	public void call() {
		launchApp();
	}
	@Test
	public void validUserLoginTest() {
		
		LoginPage lp = new LoginPage(driver);
		lp.validLogin();
		
		boolean flag =lp.actionCheck();
		Assert.assertTrue(flag);
	}
}

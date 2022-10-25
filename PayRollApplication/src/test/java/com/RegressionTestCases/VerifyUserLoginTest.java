package com.RegressionTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.LoginPage;
import com.payroll.utility.Log;

public class VerifyUserLoginTest extends BaseClass {
	@BeforeMethod
	public void call() {
		launchApp();
	}
	@Test
	public void validUserLoginTest() throws Exception {
		Log.startTestCase("User Login");
		LoginPage lp = new LoginPage(driver);
		Log.info("Going to enter usrname and password");
		lp.validLogin();
		//Action act = new Action();
				
		boolean flag =lp.afterLoginCheck();
		Assert.assertTrue(flag);
	}
}

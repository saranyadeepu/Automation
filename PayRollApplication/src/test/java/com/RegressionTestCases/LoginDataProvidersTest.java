package com.RegressionTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.LoginPage;

public class LoginDataProvidersTest extends BaseClass {

	@BeforeMethod
	public void call() {
		launchApp();
	}

	@Test(dataProvider = "getLogin")
	public void loginPage(String Username, String pwd) throws Exception {

		LoginPage lp = new LoginPage(driver);
		lp.validLogin(Username, pwd);
		boolean flag =lp.afterLoginCheck();
		Assert.assertTrue(flag);
	}

	@DataProvider
	public Object[][] getLogin() {
		Object[][] data = new Object[1][1];
		data[0][0] = "carol";
		data[0][1] = "1q2w3e4r";
		return data;
	}
}
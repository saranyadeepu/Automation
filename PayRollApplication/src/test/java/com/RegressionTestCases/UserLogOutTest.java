package com.RegressionTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.payroll.actiondriver.Action;
import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.HomePage;
import com.payroll.pageobjects.LoginPage;

public class UserLogOutTest extends BaseClass {

	@BeforeMethod
	public void call() {
		launchApp();
	}

	@Test
	public void userLogOut() {
		LoginPage lp = new LoginPage(driver);
		Action act = new Action();
		try {
			lp.validLogin();
			act.implicitWait(driver, 20);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		HomePage hp = new HomePage(driver);
		act.mouseover(driver, hp.userProfile());
		hp.userProfile().click();
		hp.userLogout().click();

		boolean flag = lp.beforeLoginCheck();
		Assert.assertTrue(flag);

	}
}

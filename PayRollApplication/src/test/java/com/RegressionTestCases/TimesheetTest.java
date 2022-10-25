package com.RegressionTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.actiondriver.Action;
import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.HomePage;
import com.payroll.pageobjects.LoginPage;
import com.payroll.pageobjects.TimeSheet;

public class TimesheetTest extends BaseClass{
	@BeforeTest
	public void call() {
		launchApp();
	}
	@Test
	public void TimeSheetGeneratePayslip() throws Exception {
		LoginPage lp = new LoginPage(driver);
		HomePage hp= new HomePage(driver);
		TimeSheet ts = new TimeSheet(driver);
		Action act = new Action();
		lp.validLogin();
		hp.TimeSheet().click();
		ts.pendingTimesheet().click();
		ts.generatePayslip().click();
		act.implicitWait(driver, 30);
		act.Alert(driver);
		act.implicitWait(driver, 70);
		boolean flag = act.Alert(driver);
		
		Assert.assertTrue(flag);
		
	}
}

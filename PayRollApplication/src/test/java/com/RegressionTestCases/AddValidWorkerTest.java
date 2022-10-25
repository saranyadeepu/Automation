package com.RegressionTestCases;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.actiondriver.Action;
import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.HomePage;
import com.payroll.pageobjects.LoginPage;
import com.payroll.pageobjects.Workers;

public class AddValidWorkerTest extends BaseClass {
	ArrayList<String> value;
	boolean flag;

	Action act = new Action();

	@BeforeTest
	public void call() {
		launchApp();
	}

	public Workers Login() throws Exception {
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		Workers wk = new Workers(driver);
		lp.validLogin();
		hp.WorkersMenu().click();
		return wk;
	}
	@Test
	public void addBlankWorker() throws Exception {
		Workers wk = Login();
		wk.workerCreate().click();
		act.scrollByVisibilityOfElement(driver, wk.workerNextButton());
		wk.workerNextButton().click();
		flag = wk.actionCheck();
		Assert.assertTrue(flag);
	}
	
}

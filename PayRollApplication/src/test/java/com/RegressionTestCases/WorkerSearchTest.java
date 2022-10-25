package com.RegressionTestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.actiondriver.Action;
import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.HomePage;
import com.payroll.pageobjects.LoginPage;
import com.payroll.pageobjects.Workers;

public class WorkerSearchTest extends BaseClass{ 
	
		@BeforeTest
		public void call() {
			launchApp();
		}
		@Test
		public void searchWorker() throws Exception {
			LoginPage lp = new LoginPage(driver);
			HomePage hp= new HomePage(driver);
			Action act = new Action();
			Workers wk = new Workers(driver);
			
			lp.validLogin();
			hp.WorkersMenu().click();
			wk.workerMenu().click();
			wk.workerSearchFName().sendKeys("Saranya");
		}
}

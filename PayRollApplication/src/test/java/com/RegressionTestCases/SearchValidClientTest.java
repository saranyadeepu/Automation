package com.RegressionTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.ClientSearch;
import com.payroll.pageobjects.Clients;
import com.payroll.pageobjects.LoginPage;

public class SearchValidClientTest extends BaseClass {
	@BeforeTest
	public void call() {
		launchApp();
	}
	@Test
	public void SearchByID() throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.validLogin();
		
		Clients clients = new Clients(driver);
		ClientSearch search = new ClientSearch(driver);
		
		clients.clickClientMenu().click();
		clients.clientSearch().click();
		clients.clientid().click();
		clients.clientid().sendKeys("Saranya");
		boolean flag1 =search.clientSearchAction();
		Assert.assertTrue(flag1);
	}
}

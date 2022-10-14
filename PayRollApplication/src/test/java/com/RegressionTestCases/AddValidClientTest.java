package com.RegressionTestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ActionDriver.Action;
import com.BaseClass.BaseClass;
import com.PageObjects.Clients;
import com.PageObjects.LoginPage;

public class AddValidClientTest extends BaseClass{
	
	@BeforeTest
	public void call() {
		launchApp();
	}
	@Test
	public void addClient() {
		LoginPage lp = new LoginPage(driver);
		lp.validLogin();
		
		Clients clients = new Clients(driver);
		clients.clickClientMenu().click();
		clients.clickCreateClientMenu().click();
		Action act = new Action();
		act.implicitWait(driver, 10);
		
		clients.clickCreateClientMenu().click();
		boolean flag = clients.clickCreateClientMenuAssert();
		if(flag) {
			System.out.println("Pass");
			clients.selectClientBranch().click();
			
			clients.yourRef().sendKeys("Test");
			
			clients.invoiceOrderSelect();
			act.implicitWait(driver, 30);
		}
		else
			System.out.println("Failed");
	}
}

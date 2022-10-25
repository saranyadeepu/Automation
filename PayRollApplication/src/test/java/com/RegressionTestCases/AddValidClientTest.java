package com.RegressionTestCases;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.actiondriver.Action;
import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.ClientAdd;
import com.payroll.pageobjects.Clients;
import com.payroll.pageobjects.LoginPage;
import com.payroll.utility.ExcelLibrary;

public class AddValidClientTest extends BaseClass{
	ArrayList<String> value;
		
	@BeforeTest
	public void call() throws Exception {
		launchApp();
		ExcelLibrary excel =new ExcelLibrary();
		value = excel.getData("AddClient", "Create Client");
		for(String a : value) {
			System.out.println(a);
		}
	}
	@Test
	public void addClientbySendKeys() throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.validLogin();
		
		Clients clients = new Clients(driver);
		ClientAdd clientAdd = new ClientAdd(driver);
		Action act = new Action();
		
		clients.clickClientMenu().click();
		clients.clickCreateClientMenu().click();
		
		act.implicitWait(driver, 10);
		
		clients.clickCreateClientMenu().click();
		boolean flag = clients.clickCreateClientMenuAssert();
		if(flag) {
			clientAdd.selectClientBranch().click();
			//Enter Details by SendKeys
			act.selectByIndex(clientAdd.clientBranch(),1);
			act.selectByIndex(clientAdd.clientDivision(),1);
			act.implicitWait(driver, 30);
			act.type(clientAdd.clientName(), "Saranya");
			act.type(clientAdd.clientAddress(), "Client Address1");
			act.type(clientAdd.clientPostCode(),"1234");
			act.type(clientAdd.yourRef(), "Ref01");
			act.type(clientAdd.invoiceContact(), "invoice001");
			act.type(clientAdd.clientPhone(),"987654321");
			act.type(clientAdd.clientFax(),"Fax001");
			act.type(clientAdd.clientEmail(),"client1@test.com");
			act.type(clientAdd.clientCompanyReg(),"Reg001");
			act.selectByIndex(clientAdd.clientInvoiceOrder(),1);
			act.selectByIndex(clientAdd.clientDeliveryMethod(),1);
			act.selectByIndex(clientAdd.clientMasterDocument(),1);
			act.type(clientAdd.clientSettlementDays(),"1");
			act.selectByIndex(clientAdd.clientVAT(),1);
			act.moveToElement(driver, clientAdd.clientSubmit());
			clientAdd.clientSubmit().click();		
			boolean flag1 =clientAdd.actionCheck();
			Assert.assertTrue(flag1);
		}
		else
			System.out.println("Failed");
	}
	@Test
	public void addClientbyExcel() throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.validLogin();
		
		Clients clients = new Clients(driver);
		ClientAdd clientAdd = new ClientAdd(driver);
		Action act = new Action();
		
		clients.clickClientMenu().click();
		clients.clickCreateClientMenu().click();
		
		act.implicitWait(driver, 10);
		
		clients.clickCreateClientMenu().click();
		boolean flag = clients.clickCreateClientMenuAssert();
		if(flag) {
			System.out.println("Pass");
			ExcelLibrary xlx = new ExcelLibrary(); 
			String sheetname = "AddClient";
			String testcase = "Create Client";
			ArrayList<String> value = xlx.getData(sheetname, testcase);
			
			clientAdd.selectClientBranch().click();
			act.type(clientAdd.clientBranch(),value.get(0));
			act.selectByIndex(clientAdd.clientDivision(),1);
			act.implicitWait(driver, 30);
			act.type(clientAdd.clientName(), value.get(2));
			act.type(clientAdd.clientAddress(), value.get(3));
			act.type(clientAdd.clientPostCode(),value.get(4));
			act.type(clientAdd.yourRef(), value.get(6));
			act.type(clientAdd.invoiceContact(), value.get(7));
			act.type(clientAdd.clientPhone(),value.get(8));
			act.type(clientAdd.clientFax(),value.get(9));
			act.type(clientAdd.clientEmail(),value.get(10));
			act.type(clientAdd.clientCompanyReg(),value.get(11));
			act.selectByIndex(clientAdd.clientInvoiceOrder(),1);
			act.selectByIndex(clientAdd.clientDeliveryMethod(),1);
			act.selectByIndex(clientAdd.clientMasterDocument(),1);
			act.type(clientAdd.clientSettlementDays(),value.get(12));
			act.selectByIndex(clientAdd.clientVAT(),1);
			act.moveToElement(driver, clientAdd.clientSubmit());
			clientAdd.clientSubmit().click();		
			boolean flag1 =clientAdd.actionCheck();
			Assert.assertTrue(flag1);
		}
		else
			System.out.println("Failed");
	}
}

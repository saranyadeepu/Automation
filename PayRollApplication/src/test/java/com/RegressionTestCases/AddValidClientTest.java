package com.RegressionTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.actiondriver.Action;
import com.payroll.baseclass.BaseClass;
import com.payroll.pageobjects.ClientAdd;
import com.payroll.pageobjects.Clients;
import com.payroll.pageobjects.LoginPage;


public class AddValidClientTest extends BaseClass{
	
	//ArrayList<String> value;
	
	@BeforeTest
	public void call() throws Exception {
		launchApp();
	//	ExcelLibrary excel =new ExcelLibrary();
		//value = excel.getData("AddClient", "Create Client");
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
			System.out.println("Pass");
			clientAdd.selectClientBranch().click();
			
			
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
	/*@Test
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
			clientAdd.selectClientBranch().click();
			
			
			act.selectByIndex(clientAdd.clientBranch(),1);
			act.selectByIndex(clientAdd.clientDivision(),1);
			act.implicitWait(driver, 30);
			act.type(clientAdd.clientName(), value.get(1));
			act.type(clientAdd.clientAddress(), value.get(1));
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
	}*/
}

package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActionDriver.Action;

public class Clients {
	WebDriver driver;
	Action act = new Action();

	boolean flag = true;

	@FindBy(xpath = "//a[@href='/payrollapp/client/index']")
	WebElement clientmenu;

	// Search Client

	@FindBy(xpath = "//input[@id='clientsearch-client_name")
	WebElement clientname;

	@FindBy(xpath = "//input[@id='clientsearch-id")
	WebElement clientid;

	// Create Client
	@FindBy(xpath = "//a[text()='Create Client']")
	WebElement createclientmenu;

	@FindBy(xpath = "//select[@id='client-branch_id']")
	WebElement clientBranch;

	@FindBy(xpath = "//option[@value ='1']")
	WebElement selectClientBranch;
	
	@FindBy(xpath = "//input[@id='client-your_ref']")
	WebElement yourRef;

	@FindBy(xpath = "//select[@id='client-invoice_order']")
	WebElement invoiceOrder;
	


	public Clients(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement clickClientMenu() {

		return clientmenu;
	}
	public WebElement clickCreateClientMenu() {

		return createclientmenu;
	}

	public WebElement selectClientBranch() {
		clientBranch.click();
		return selectClientBranch;
	}

	public WebElement yourRef() {

		return yourRef;
	}
	public WebElement invoiceOrder() {

		return invoiceOrder;
	}
	public WebElement invoiceOrderSelect() {

		invoiceOrder.click();
		return invoiceOrder;
	}

	public boolean clickCreateClientMenuAssert() {

		WebElement ele = driver.findElement(By.xpath("//h1[text()='Create Client']"));
		flag = act.isDisplayed(driver, ele);
		return flag;

	}
}

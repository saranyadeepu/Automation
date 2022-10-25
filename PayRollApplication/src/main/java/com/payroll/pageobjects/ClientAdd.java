package com.payroll.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;

public class ClientAdd {
	WebDriver driver;
	Action act = new Action();
	
	boolean flag=true;
	
	@FindBy(xpath = "//select[@id='client-branch_id']")
	WebElement clientBranch;
	
	@FindBy(xpath = "//option[@value ='1']")
	WebElement selectClientBranch;
	
	@FindBy(xpath = "//select[@id='client-division_id']")
	WebElement clientDivision;
	
	@FindBy(xpath = "//input[@id='client-client_name']")
	WebElement clientName;
	
	@FindBy(xpath = "//textarea[@id='client-client_address']")
	WebElement clientAddress;
	@FindBy(xpath = "//input[@id='client-postcode']")
	WebElement clientPostCode;
	
	@FindBy(xpath = "//input[@id='client-country']")
	WebElement clientCountry;
	@FindBy(xpath = "//input[@id='client-your_ref']")
	WebElement yourRef;
	
	@FindBy(xpath = "//input[@id='client-invoice_contact']")
	WebElement invoiceContact;
	
	@FindBy(xpath = "//input[@id='client-phone']")
	WebElement clientPhone;
	@FindBy(xpath = "//input[@id='client-fax']")
	WebElement clientFax;
	@FindBy(xpath = "//input[@id='client-email']")
	WebElement clientEmail;
	@FindBy(xpath = "//input[@id='client-company_reg']")
	WebElement clientCompanyReg;
	

	@FindBy(xpath = "//select[@id='client-invoice_order']")
	WebElement clientInvoiceOrder;
	@FindBy(xpath = "//select[@id='client-invoice_delivery_method']")
	WebElement clientDeliveryMethod;
	@FindBy(xpath = "//select[@id='client-master_document']")
	WebElement clientMasterDocument;
	@FindBy(xpath = "//input[@id='client-settilement_days']")
	WebElement clientSettlementDays;
	@FindBy(xpath = "//select[@id='client-vat_rate']")
	WebElement clientVAT;
	@FindBy(xpath = "//input[@id='client-require_po']")
	WebElement requirePO;
	@FindBy(xpath = "//input[@id='client-direct_client']")
	WebElement clientDirect ;
	@FindBy(xpath = "//input[@id='client-uk_public_sector_client']")
	WebElement clientPublicsector;
	@FindBy(xpath = "//input[@id='client-subject_to_payee']")
	WebElement subjtoPayee;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement clientSubmit;
	
	
	public ClientAdd(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clientBranch() {
		return clientBranch;
	}

	public WebElement selectClientBranch() {
		clientBranch.click();
		return selectClientBranch;
	}
	public WebElement clientDivision() {
		return clientDivision;
	}
	public WebElement clientName() {
		return clientName;
	}
	public WebElement clientAddress() {
		return clientAddress;
	}
	public WebElement clientPostCode() {
		return clientPostCode;
	}
	public WebElement clientCountry() {
		return clientCountry;
	}
	public WebElement yourRef() {
		return yourRef;
	}
	public WebElement invoiceContact() {
		return invoiceContact;
	}
	public WebElement clientPhone() {
		return clientPhone;
	}
	public WebElement clientFax() {
		return clientFax;
	}
	public WebElement clientEmail() {
		return clientEmail;
	}
	public WebElement clientCompanyReg() {
		return clientCompanyReg;
	}
	public WebElement clientInvoiceOrder() {
		return clientInvoiceOrder;
	}
	public WebElement clientDeliveryMethod() {
		return clientDeliveryMethod;
	}
	public WebElement clientMasterDocument() {
		return clientMasterDocument;
	}
	
	public WebElement clientSettlementDays() {
		return clientSettlementDays;
	}
	public WebElement clientVAT() {
		return clientVAT;
	}
	public WebElement requirePO() {
		return requirePO;
	}
	public WebElement clientDirect() {
		return clientDirect;
	}
	public WebElement clientPublicsector() {
		return clientPublicsector;
	}
	public WebElement subjtoPayee() {
		return subjtoPayee;
	}
	public WebElement clientSubmit() {
		return clientSubmit;
	}
	
	public  boolean actionCheck()
	{
		WebElement ele =  driver.findElement(By.xpath("//a[text()='Invoice History']"));
	
		boolean flag = act.isDisplayed(driver, ele);
		return flag;
	}
	
}

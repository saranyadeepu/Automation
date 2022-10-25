package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	WebElement userProfile;
	@FindBy(xpath = "//a[@class='logout-btn']")
	WebElement userLogout;
	
	
	
	@FindBy(xpath = "//a[text()= 'Clients']")
	WebElement ClientMenu;
	@FindBy(xpath = "//a[text()= 'Workers']")
	WebElement WorkersMenu;
	@FindBy(xpath = "//a[text()= 'Deduction']")
	WebElement DeductionMenu;
	@FindBy(xpath = "//a[text()= 'TimeSheet']")
	WebElement TimeSheet;
	@FindBy(xpath = "//a[text()= 'Payslip']")
	WebElement Payslip;
	@FindBy(xpath = "//a[text()= 'Invoice']")
	WebElement Invoice;
	@FindBy(xpath = "//a[text()= 'Report']")
	WebElement Report;
	
	
	@FindBy(xpath = "//a[@href='/payrollapp/client']")
	WebElement ClientSubMenu;
	
	@FindBy(xpath = "/html/body/section/div/div/div[1]/ul/li[2]")
	WebElement CreateClient;
	
	@FindBy(id = "clientsearch-client_name")
	WebElement ClientSearchName;
	
	@FindBy(id = "clientsearch-id")
	WebElement ClientSearchID;
	
	@FindBy(xpath = "button[@class ='btn btn-primary']")
	WebElement ClientSearch;
	@FindBy(xpath = "button[@class ='btn btn-default']")
	WebElement ClientSearchReset;
	

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement userProfile() {

		return userProfile;
	}
	public WebElement userLogout() {

		return userLogout;
	}
	
	public WebElement ClientMenu () {

		return ClientMenu;
	}
	public WebElement WorkersMenu() {

		return WorkersMenu;
	}
	public WebElement DeductionMenu() {

		return DeductionMenu;
	}
	public WebElement TimeSheet() {

		return TimeSheet;
	}
	public WebElement Payslip() {

		return Payslip;
	}
	public WebElement Invoice() {

		return Invoice;
	}
	public WebElement Report() {

		return Report;
	}
	public WebElement ClientSubMenu() {

		return ClientSubMenu;
	}
	public WebElement CreateClient() {

		return CreateClient;
	}
	public WebElement ClientSearchName() {

		return ClientSearchName;
	}
	public WebElement ClientSearchID() {

		return ClientSearchID;
	}
	
	public WebElement ClientSearch() {

		return ClientSearch;
	}
	
	public WebElement ClientSearchReset() {

		return ClientSearchReset;
	}
	
	
}

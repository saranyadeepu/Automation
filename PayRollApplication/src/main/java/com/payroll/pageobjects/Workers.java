package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;

public class Workers {
	WebDriver driver;
	Action act = new Action();
	boolean flag;
	@FindBy(xpath = "//a[@href='/payrollapp/worker']")
	WebElement workerMenu;
	@FindBy(xpath = "//a[text()='Create Worker']")
	WebElement workerCreate;
	//Search
	@FindBy(xpath = "//input[@id='workersearch-first_name']")
	WebElement workerSearchFName;
	@FindBy(xpath = "//input[@id='workersearch-last_name']")
	WebElement workerSearchLName;
	@FindBy(xpath = "//input[@id='workersearch-postcode']")
	WebElement workerSearchPCode;
	@FindBy(xpath = "//input[@id='workersearch-ni_number']")
	WebElement workerSearchNiNo;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement workerSearchButton;
	@FindBy(xpath = "//button[@type='reset']")
	WebElement workerSearchReset;
	
	//Create
	@FindBy(xpath = "//select[@id='worker-title']")
	WebElement workerTitle;
	@FindBy(xpath = "//input[@id='worker-first_name']")
	WebElement workerFirstName;
	@FindBy(xpath = "//input[@id='worker-last_name']")
	WebElement workerLastName;
	@FindBy(xpath = "//input[@id='worker-middle_name']")
	WebElement workerMiddleName;
	@FindBy(xpath = "//input[@id='worker-known']")
	WebElement workerKnownName;
	@FindBy(xpath = "//input[@id='worker-phone']")
	WebElement workerPhone;
	@FindBy(xpath = "//input[@id='worker-mobile']")
	WebElement workerMobile;
	@FindBy(xpath = "//input[@id='worker-email']")
	WebElement workerEmail;
	@FindBy(xpath = "//select[@id='worker-gender']")
	WebElement workerGender;
	@FindBy(xpath = "//select[@id='worker-branch_id']")
	WebElement workerBranchID;
	@FindBy(xpath = "//select[@id='worker-division_id']")
	WebElement workerDivisionID;
	@FindBy(xpath = "//input[@id='worker-address1']")
	WebElement workerAddress1;
	@FindBy(xpath = "//input[@id='worker-address2']")
	WebElement workerAddress2;
	@FindBy(xpath = "//input[@id='worker-address3']")
	WebElement workerAddress3;
	@FindBy(xpath = "//input[@id='worker-postcode']")
	WebElement workerPostcode;
	@FindBy(xpath = "//select[@id='worker-employment_type']")
	WebElement workerEmpType;
	@FindBy(xpath = "//select[@id='worker-payslip_method']")
	WebElement workerPayslip;
	@FindBy(xpath = "//select[@id='worker-engage_status']")
	WebElement workerEngage;
	@FindBy(xpath = "//input[@id='worker-ni_number']")
	WebElement workerNiNo;
	@FindBy(xpath = "//input[@id='worker-country']")
	WebElement workerCountry;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement workerNextButton;
	//Bank details
	@FindBy(xpath = "//select[@id='worker-payment_method']")
	WebElement workerPayment;
	@FindBy(xpath = "//select[@id='worker-ac_type']")
	WebElement workerAccountType;
	@FindBy(xpath = "//input[@id='worker-ac_name']")
	WebElement workerAccountName;
	@FindBy(xpath = "//input[@id='worker-ac_no']")
	WebElement workerAccountNo;
	@FindBy(xpath = "//input[@id='worker-sort_code']")
	WebElement workerSortCode;
	@FindBy(xpath = "//input[@id='worker-roll_no']")
	WebElement workerRollNo;
	@FindBy(xpath = "//input[@id='worker-bank_name']")
	WebElement workerBankName;
	@FindBy(xpath = "//input[@id='worker-bank_address']")
	WebElement workerBankAddress;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement workerSubmit;

	
	
	
	
	public Workers(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement workerMenu() {

		return workerMenu;
	}
	public WebElement workerCreate() {

		return workerCreate;
	}
	public WebElement workerSearchFName() {

		return workerSearchFName;
	}
	public WebElement workerSearchLName() {

		return workerSearchLName;
	}
	public WebElement workerSearchPCode() {

		return workerSearchPCode;
	}
	public WebElement workerSearchNiNo() {

		return workerSearchNiNo;
	}
	public WebElement workerSearchButton() {

		return workerSearchButton;
	}
	public WebElement workerSearchReset() {

		return workerSearchReset;
	}
	//create
	public WebElement workerTitle() {

		return workerTitle;
	}
	public WebElement workerFirstName() {

		return workerFirstName;
	}
	public WebElement workerLastName() {

		return workerLastName;
	}
	public WebElement workerMiddleName() {

		return workerMiddleName;
	}
	public WebElement workerKnownName() {

		return workerKnownName;
	}
	public WebElement workerPhone() {

		return workerPhone;
	}
	public WebElement workerMobile() {

		return workerMobile;
	}
	public WebElement workerEmail() {

		return workerEmail;
	}
	public WebElement workerGender() {

		return workerGender;
	}
	public WebElement workerBranchID() {

		return workerBranchID;
	}
	public WebElement workerDivisionID() {

		return workerDivisionID;
	}
	public WebElement workerAddress1() {

		return workerAddress1;
	}
	public WebElement workerAddress2() {

		return workerAddress2;
	}
	public WebElement workerAddress3() {

		return workerAddress3;
	}
	public WebElement workerPostcode() {

		return workerPostcode;
	}
	public WebElement workerEmpType() {

		return workerEmpType;
	}
	public WebElement workerPayslip() {

		return workerPayslip;
	}
	public WebElement workerEngage() {

		return workerEngage;
	}
	public WebElement workerNiNo() {

		return workerNiNo;
	}
	public WebElement workerCountry() {

		return workerCountry;
	}
	public WebElement workerNextButton() {

		return workerNextButton;
	}
	public WebElement workerPayment() {

		return workerPayment;
	}
	
	public WebElement workerAccountType() {

		return workerAccountType;
	}
	public WebElement workerAccountName() {

		return workerAccountName;
	}
	public WebElement workerAccountNo() {

		return workerAccountNo;
	}
	public WebElement workerSortCode() {

		return workerSortCode;
	}
	public WebElement workerRollNo() {

		return workerRollNo;
	}
	public WebElement workerBankName() {

		return workerBankName;
	}
	public WebElement workerBankAddress() {

		return workerBankAddress;
	}
	public WebElement workerSubmit() {

		return workerSubmit;
	}
	public boolean actionCheck() {
		flag = driver.getPageSource().contains("cannot be blank");
		return flag;		
	}

	
}

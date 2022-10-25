package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeSheet {
	WebDriver driver;

	@FindBy(xpath = "//a[text()='Pending Timesheets']")
	WebElement pendingTimesheet;
	@FindBy(xpath = "//a[text()='Approved Timesheets']")
	WebElement approvedTimesheet;
	@FindBy(xpath = "//a[text()='Create Timesheets']")
	WebElement createTimesheet;
	@FindBy(xpath = "//button[@value='playslip']")
	WebElement generatePayslip;
	@FindBy(xpath = "//button[@value='invoice']")
	WebElement generateInvoice;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement approveTimesheet;
	@FindBy(xpath = "//tbody/tr[1]/td[6]/a[1]/span[1]")
	WebElement timesheetEdit;
	
	
	public TimeSheet(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement pendingTimesheet() {

		return pendingTimesheet;
	}
	public WebElement approvedTimesheet() {

		return approvedTimesheet;
	}
	public WebElement createTimesheet() {

		return createTimesheet;
	}
	public WebElement generatePayslip() {

		return generatePayslip;
	}
	public WebElement generateInvoice() {

		return generateInvoice;
	}
	public WebElement approveTimesheet() {

		return approveTimesheet;
	}
	public WebElement timesheetEdit() {

		return timesheetEdit;
	}
	
	
}

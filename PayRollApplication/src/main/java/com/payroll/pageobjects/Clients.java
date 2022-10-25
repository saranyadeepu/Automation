package com.payroll.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;

public class Clients {
	WebDriver driver;
	Action act = new Action();

	boolean flag = true;

	@FindBy(xpath = "(//a[@href='/payrollapp/client/index'])[1]")
	WebElement clientmenu;

	// Search Client

	@FindBy(xpath = "//a[@href='/payrollapp/client']")
	WebElement clientSearch;
	
	@FindBy(xpath = "//input[@id='clientsearch-client_name']")
	WebElement clientname;

	@FindBy(xpath = "//input[@id='clientsearch-id']")
	WebElement clientid;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement clientSearchSubmit;
	
	// Create Client
	@FindBy(xpath = "//a[text()='Create Client']")
	WebElement createclientmenu;

	//constructor
	public Clients(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement clickClientMenu() {

		return clientmenu;
	}
	public WebElement clientSearch() {

		return clientSearch;
	}
	public WebElement clientname() {

		return clientname;
	}
	public WebElement clientid() {

		return clientid;
	}
	public WebElement clientSearchSubmit() {

		return clientSearchSubmit;
	}
		
	public WebElement clickCreateClientMenu() {

		return createclientmenu;
	}

	public boolean clickCreateClientMenuAssert() {

		WebElement ele = driver.findElement(By.xpath("//h1[text()='Create Client']"));
		flag = act.isDisplayed(driver, ele);
		return flag;
	}
	
}

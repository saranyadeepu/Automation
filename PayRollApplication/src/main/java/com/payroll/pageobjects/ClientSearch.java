package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;

public class ClientSearch {
	WebDriver driver;
	Action act = new Action();
	
	boolean flag=true;
	
	@FindBy(xpath = "//th[1]")
	WebElement searchResult;
	
	public ClientSearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean clientSearchAction() {
		
		
		flag =	act.isDisplayed(driver, searchResult);
		return flag;
	}
}

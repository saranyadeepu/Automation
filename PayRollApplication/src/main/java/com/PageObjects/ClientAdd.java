package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ActionDriver.Action;

public class ClientAdd {
	WebDriver driver;
	Action act = new Action();
	
	boolean flag=true;
	
	@FindBy(xpath = "(//div[@class='form-group field-client-branch_id required has-error'])[1]")
	WebElement clientBranch;
	
	public WebElement clientBranch() {
		return clientBranch;
	}
}

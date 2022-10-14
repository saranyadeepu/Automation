package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActionDriver.Action;

public class LoginPage {

	WebDriver driver;
	@FindBy(xpath = "//input[@id='loginform-username']")
	WebElement UserName;

	@FindBy(xpath = "//input[@id='loginform-password']")
	WebElement Password;

	@FindBy(xpath = "//input[@id='loginform-rememberme']")
	WebElement RememberMe;

	@FindBy(xpath = "//span(text() = 'reset it']")
	WebElement ResetIt;

	@FindBy(xpath = "//button[@name='login-button']")
	WebElement Submit;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement UserName() {

		return UserName;
	}

	public WebElement Password() {

		return Password;
	}

	public WebElement RememberMe() {

		return RememberMe;
	}

	public WebElement ResetIt() {

		return ResetIt;
	}

	public WebElement Login() {

		return Submit;
	}
	public void validLogin() {
				
		UserName().sendKeys("carol");
		Password().sendKeys("1q2w3e4r");
		Login().click();;
	}
	
	public  boolean actionCheck()
	{
		WebElement ele =  driver.findElement(By.xpath("//h1[text()='Payroll Application']"));
		Action act = new Action();
		boolean flag = act.isDisplayed(driver, ele);
		return flag;
	}
}

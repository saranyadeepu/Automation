package com.payroll.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;
import com.payroll.utility.Log;


public class LoginPage {
	Action act = new Action();
	WebDriver driver;

	@FindBy(xpath = "//h1[text()='Login']")
	WebElement beforeLoginPage;
	@FindBy(xpath = "//h1[text()='Payroll Application']")
	WebElement afterLoginPage;

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

	public WebElement beforeLoginPage() {

		return beforeLoginPage;
	}
	public WebElement afterLoginPage() {

		return afterLoginPage;
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

	public void validLogin() throws Exception {
		UserName().sendKeys("carol");
		Log.info("Entered Username");
		Password().sendKeys("1q2w3e4r");
		Log.info("Password Entered");
		Login().click();
		
	}
	
	public void validLogin(String Username, String pwd) throws Exception {
		UserName().sendKeys(Username);
		Log.info("Entered Username");
		Password().sendKeys(pwd);
		Log.info("Password Entered");
		Login().click();
		
	}


	public boolean beforeLoginCheck() {

		boolean flag = actionCheck(beforeLoginPage());
		return flag;
	}
	public boolean afterLoginCheck() {

		boolean flag = actionCheck(afterLoginPage());
		return flag;
	}

	public boolean actionCheck(WebElement ele) {
		boolean flag = act.isDisplayed(driver, ele);
		return flag;
	}
}

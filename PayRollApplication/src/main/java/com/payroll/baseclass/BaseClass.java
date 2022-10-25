package com.payroll.baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.payroll.actiondriver.Action;
import com.payroll.utility.ExtentManager;


public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;

	
	@BeforeSuite
	public void log() {
		DOMConfigurator.configure("log4j.xml");
		ExtentManager.setExtent();
	}
	
	// loadConfig method is to load the configuration
	@BeforeTest
	public void loadConfig() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configurations\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void launchApp() {

		String browserName = prop.getProperty("Browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		// Maximize the screen
		driver.manage().window().maximize();
		Action action = new Action();
		
		// Implicit TimeOuts
		action.implicitWait(driver,10);
		
		// PageLoad TimeOuts
		action.pageLoadTimeOut(driver,10);
		driver.get(prop.getProperty("url"));

	}
	
	  @AfterMethod 
		public static void closeBrowser() {
			driver.quit();
		}
	  @AfterSuite
	  public void end() {
		  ExtentManager.endReport();
	  }
	 
}

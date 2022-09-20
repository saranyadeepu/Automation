package com.bookings;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OneWayFlight {
	@Test
	public void oneWayFlightFilter() throws InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();

		driver.get(
				"https://www.booking.com/flights/index.en.html?aid=304142&label=gen173nr-1DCAEoggI46AdIM1gEaGyIAQGYAQm4ARfIAQzYAQPoAQGIAgGoAgO4Apy735cGwAIB0gIkYzcxODE4YzAtYjA2Yi00OWJiLTk0ODAtNjY3ZjJlODA2MTdi2AIE4AIB&sid=7b6fc4fe088f7bf74311a25a083e02aa");

		driver.findElement(By.xpath("//div[@data-testid='searchbox_controller_trip_type_ONEWAY']")).click();
		driver.findElement(By.xpath("//select[@class='css-1k0jlfl']")).click();
		driver.findElement(By.xpath("//option[@value='BUSINESS']")).click();
		driver.findElement(By.xpath("//div[@data-testid='input_occupancy_desktop_passengers_trigger']")).click();
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_modal_adults_increase']")).click();
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_modal_children_increase']")).click();
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_modal_children_increase']")).click();

		Select sel1 = new Select(driver.findElement(By.id("__bui-c1-10")));
		sel1.selectByValue("10");
		Select sel2 = new Select(driver.findElement(By.id("__bui-c1-11")));
		sel2.selectByValue("15");
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_desktop_done']")).click();

		// Destination
		driver.findElement(By.xpath("//input[@class='css-g0pg3f-SearchboxInput']")).click();

		driver.findElement(By.xpath("//input[@data-testid='searchbox_destination_input']")).sendKeys("bang");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> dropdown = driver.findElements(By.xpath("//li[@class='css-qqvbcw']"));
		for (WebElement choice : dropdown) {

			System.out.println(choice.getText());

			if (choice.getText().contains("BLR")) {
				choice.click();
				break;
			}
		}
		// Date Picker
		

		driver.findElement(By.xpath("//div[@data-testid='searchbox_date_picker_desktop_calendar']")).click();//opens the calendar
		Thread.sleep(3000);
		/*
		while(true)
		{
			String monthyear = driver.findElement(By.xpath("//div[@id='__bui-c1-1072022']")).getText();
			System.out.println(monthyear);
			String arr[]=monthyear.split(" ");
			String mon = arr[0];
			String year = arr[1];
			System.out.println(mon);
			System.out.println(year);
			if(mon.equalsIgnoreCase(expectedMonth) && year.equals(expectedYear))
				break;
			else
			{
				driver.findElement(By.xpath("//span[@class='Icon-module__root___DweoM Icon-module__root--size-large___gsdYP']")).click();
			}
		}*/
			//Date Selection
		driver.	findElement(By.xpath("//td[@data-date='2022-08-27']")).click();

		// search
		driver.findElement(By.xpath("//button[@data-testid='searchbox_submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String expected = "Trivandrum – Bangalore - Booking.com";
		String actual = driver.getTitle();
		Assert.assertEquals(expected,actual);
	}
}

//Notes - 02082022

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorIDExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();

	}

}

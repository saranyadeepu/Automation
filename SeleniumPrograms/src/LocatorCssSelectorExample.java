//Notes - 02082022

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorCssSelectorExample {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		// Find UserName
		driver.findElement(By.cssSelector("#user-name")).click();
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		 
		//driver.findElement(By.className("submit-button btn_action")).click();
		 driver.findElement(By.name("login-button")).click();
		 Thread.sleep(5000);
	}

}

//Notes - 02082022

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorClassExample {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.findElement(By.className("form-control")).click();
		driver.findElement(By.className("form-control")).sendKeys("UserName");
		Thread.sleep(3000);
	}

}

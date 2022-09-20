//Notes - 02082022

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorLinkTextExample {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.partialLinkText("Cancel")).click();
		Thread.sleep(3000);
	}

}

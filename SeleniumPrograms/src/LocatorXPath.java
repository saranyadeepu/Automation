import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorXPath{
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		// Load URL
		driver.get("https://www.qabible.in/payrollapp/site/login");
		// Click on Input Menu by tagname	
		driver.findElement(By.tagName("button")).click();
		// Click Reset link using xpath
		driver.findElement(By.xpath("//a[@href='/payrollapp/site/request-password-reset']")).click();
		Thread.sleep(3000);
	}
}

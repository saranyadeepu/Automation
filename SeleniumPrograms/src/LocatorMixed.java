	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LocatorMixed {
		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = WebDriverManager.chromedriver().create();
			driver.manage().window().maximize();
			driver.get("https://www.qabible.in/payrollapp/site/login");
			
			driver.findElement(By.id("loginform-username")).click();
			driver.findElement(By.cssSelector("#loginform-username")).sendKeys("UserName");
			
			driver.findElement(By.name("LoginForm[password]")).click();
			driver.findElement(By.name("LoginForm[password]")).sendKeys("Password");
			
			driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
			driver.findElement(By.linkText("reset it")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.cssSelector("a[href='/payrollapp/site/login']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.tagName("button")).click();
		}

	}

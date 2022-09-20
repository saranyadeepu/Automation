import java.time.Duration;

import org.openqa.selenium.WebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.get("https://www.saucedemo.com");
		
		System.out.println("Title: "+driver.getTitle());
		
		String url = driver.getCurrentUrl();
		System.out.println("Current URL: "+url);
		
		System.out.println("Title: "+driver.getPageSource());
		
		driver.get("https://www.google.com");
		
		driver.navigate().back();//goes back to swaglab
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.navigate().forward();//goes to google
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.navigate().refresh();// refresh google
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
}

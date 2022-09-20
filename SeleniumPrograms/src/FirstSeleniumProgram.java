//import org.openqa.selenium.WebDriver;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\SeleniumPrograms\\Drivers\\chromedriver.exe");
		
		// Creating Instance - Method 1
		ChromeDriver driverC = new ChromeDriver();
		FirefoxDriver driverF = new FirefoxDriver();
		EdgeDriver driverE = new EdgeDriver();
		
		// Creating Instance - Method 2
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		
		//Fetching URL - Method 1- driver.get()
		driverC.get("https://selenium.obsqurazone.com/index.php");
		driverF.get("https://selenium.obsqurazone.com/index.php");
		driverE.get("https://selenium.obsqurazone.com/index.php");
		
		
		driverC.manage().window().maximize();
		driverC.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driverC.close(); //closes current tab
		
		//Fetching URL - Method 2- driver.navigate().to()
		driverC.navigate().to("https://selenium.obsqurazone.com/index.php");
		//driver.quit(); // closes all tabs 
	}

}

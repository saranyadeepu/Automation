import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.core.exec.InitializeSwarmCmdExec;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassExample {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		
		//SelectClassExample s = new SelectClassExample();
		//singleSelect(driver);
		multiSelect(driver);
		}
	
		//Static DropDown
	public static void singleSelect(WebDriver driver) throws InterruptedException {
		Select sel1 = new Select(driver.findElement(By.id("single-input-field")));
		sel1.selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		sel1.selectByValue("Green");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		sel1.selectByVisibleText("Yellow");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public static void multiSelect(WebDriver driver) throws InterruptedException {
		Select sel2 = new Select(driver.findElement(By.id("multi-select-field")));
		sel2.selectByIndex(0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		sel2.selectByValue("Yellow");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		sel2.selectByVisibleText("Green");
		//driver.findElement(By.xpath("//button[@id='button-all']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		sel2.deselectAll();
		Thread.sleep(3000);
	}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectExample {

	public static void main(String[] args) throws InterruptedException {
				WebDriver driver = WebDriverManager.chromedriver().create();
				driver.manage().window().maximize();
				driver.get("https://selenium.obsqurazone.com/select-input.php");
				//Static DropDown
				Select sel1 = new Select(e);
				driver.findElement(By.id("single-input-field"));
				sel1.selectByIndex(1);
				Thread.sleep(3000);
				sel1.selectByValue("Green");
				Thread.sleep(3000);
				sel1.selectByVisibleText("Yellow");
				Thread.sleep(3000);
				
				Select sel2 = new Select(driver.findElement(By.id("multi-select-field")));
				sel2.selectByIndex(1);
				Thread.sleep(3000);
				sel2.selectByValue("Yellow");
				Thread.sleep(3000);
				sel2.selectByVisibleText("Green");
				driver.findElement(By.xpath("//button[@id='button-all']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(null))
				
			}

}


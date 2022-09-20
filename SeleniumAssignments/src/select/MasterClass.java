package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterClass {
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.manage().window().maximize();
	driver.get("https://selenium.obsqurazone.com/select-input.php");
}

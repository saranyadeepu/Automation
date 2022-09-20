import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {


	public static void main(String[] args) throws InterruptedException {
		String s="Mississippi";
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		
		//Finding element using index
		driver.findElement(By.xpath("(//span[@role='textbox'])[1]")).click();
		
		//tagname[@attribute1='value' or @attribute2='value']
		
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("mi");
		
		
	//	List <WebElement> dropdown = driver.findElements(By.xpath("//li[@class='select2-results__option select2-results__option--selectable']" ));
		List <WebElement> dropdown = driver.findElements(By.xpath("//li[@role='option']" ));
		for(WebElement i : dropdown)
		{
		System.out.println(i);
		if(i.getText().equalsIgnoreCase(s))
		{
			i.click();
			break;
		}
		}
		Thread.sleep(3000);
	}
}

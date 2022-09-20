
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentCSSSelector {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		// Load URL
		driver.get("https://selenium.obsqurazone.com/index.php");
		// Click on Input Menu
		driver.findElement(By.cssSelector("a[href='simple-form-demo.php']")).click();

		// Simple Form Demo //Single Input Field
		driver.findElement(By.cssSelector("a[href='simple-form-demo.php']")).click();
		driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("#button-one")).click();
		// Two Input Fields //Combining multiple CSS
		driver.findElement(By.cssSelector("input#value-a[class='form-control']")).sendKeys("10");
		driver.findElement(By.cssSelector("input#value-b[class='form-control']")).sendKeys("20");
		driver.findElement(By.cssSelector("#button-two")).click(); //

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Single Checkbox Demo
		//driver.findElement(By.linkText("Checkbox Demo")).click();
		driver.findElement(By.cssSelector("a[href='check-box-demo.php']")).click();
		driver.findElement(By.cssSelector("input#gridCheck[class='form-check-input']")).click();
		driver.findElement(By.cssSelector("input[value='Select All']")).click();
		
		driver.findElement(By.cssSelector("input[value='Unselect All']")).click();
		
		driver.findElement(By.cssSelector("input#check-box-one[class='check-box-list']")).click();
		driver.findElement(By.cssSelector("input#check-box-two[class='check-box-list']")).click();
		driver.findElement(By.cssSelector("input#check-box-three[class='check-box-list']")).click();
		driver.findElement(By.cssSelector("input#check-box-four[class='check-box-list']")).click();
		
		driver.findElement(By.cssSelector("input#check-box-one[class='check-box-list']")).click();
		driver.findElement(By.cssSelector("input#check-box-two[class='check-box-list']")).click();
		driver.findElement(By.cssSelector("input#check-box-three[class='check-box-list']")).click();
		driver.findElement(By.cssSelector("input#check-box-four[class='check-box-list']")).click();
		
		driver.findElement(By.cssSelector("input[value='Select All']")).click();
		

		// Radio Button Demo
		driver.findElement(By.partialLinkText("Radio Buttons")).click();
		driver.findElement(By.cssSelector("input#inlineRadio2[value='Female']")).click();
		driver.findElement(By.cssSelector("input#inlineRadio1[value='Male']")).click();
		driver.findElement(By.cssSelector("button#button-one")).click();
		
		// Group Radio Buttons Demo
		// Gender
		driver.findElement(By.cssSelector("input#inlineRadio21[value='Female']")).click();
		driver.findElement(By.cssSelector("input#inlineRadio11[value='Male']")).click();
		
		// Age
		driver.findElement(By.cssSelector("input#inlineRadio22[value='1 to 18']")).click();
		driver.findElement(By.cssSelector("button#button-two")).click();
		Thread.sleep(3000);
	}

}

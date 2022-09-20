package assertexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertObsquera {
	public WebDriver initialise() {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.findElement(By.cssSelector("a[href='simple-form-demo.php']")).click();
		return driver;
	}

	@Test
	public void MenuSelection() {
		WebDriver driver = initialise();
		String actual, expected;
		actual = "Obsqura Testing";
		expected = driver.getTitle();
		System.out.println(expected + actual);
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void FirstOption1() {
		// Simple Form Demo //Single Input Field

		// Click on Input Menu
		WebDriver driver = initialise();
		String expected = "Hello";
		driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys(expected);
		driver.findElement(By.cssSelector("#button-one")).click();
		String output = driver.findElement(By.id("message-one")).getText();
		String arr[] = output.split(": ");
		String actual = arr[1];

		Assert.assertEquals(actual, expected);
	}

@Test
public  void FirstOption2() {
		// Simple Form Demo //Single Input Field
		WebDriver driver = initialise();
		// Two Input Fields //Combining multiple CSS
		int a=10, b=20;
		driver.findElement(By.cssSelector("input#value-a[class='form-control']")).sendKeys(String.valueOf(a));
		driver.findElement(By.cssSelector("input#value-b[class='form-control']")).sendKeys(String.valueOf(b));
		driver.findElement(By.cssSelector("#button-two")).click(); //
		String output = driver.findElement(By.id("message-two")).getText();
		int expected=a+b;
		String arr[] = output.split(": ");
		int actual = Integer.parseInt(arr[1]);
		Assert.assertEquals(actual, expected);
}

@Test
public  void SecondOption1() {
	// Single Checkbox Demo
		WebDriver driver = initialise();
		driver.findElement(By.cssSelector("a[href='check-box-demo.php']")).click();
		driver.findElement(By.cssSelector("input#gridCheck[class='form-check-input']")).click();
		String expected = "Success";
		String output = driver.findElement(By.id("message-one")).getText();
		String arr[]= output.split(" -");
		String actual = arr[0];
		Assert.assertEquals(actual, expected);
		SoftAssert soft = new SoftAssert();
		
}
/*@Test
public  void SecondOption1() {
	// Single Checkbox Demo
		WebDriver driver = initialise();
		driver.findElement(By.cssSelector("a[href='check-box-demo.php']")).click();
		driver.findElement(By.cssSelector("input[value='Select All']")).click();
		
		driver.findElement(By.cssSelector("input[value='Unselect All']")).click();
		
		
		

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
		Thread.sleep(3000);*/
}

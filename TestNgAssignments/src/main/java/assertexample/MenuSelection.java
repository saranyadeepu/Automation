package assertexample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuSelection {
	@Test
	public void menuSelection1() {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();

		String actual, expected;
		driver.get("https://selenium.obsqurazone.com/index.php");
		actual = "Obsqura Testing";
		expected= driver.getTitle();
		System.out.println(expected+actual);
		Assert.assertEquals(actual, expected);
}

}

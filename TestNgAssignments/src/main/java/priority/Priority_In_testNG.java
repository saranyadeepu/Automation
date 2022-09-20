package priority;

	import java.time.Duration;

import org.openqa.selenium.By;			
	import org.openqa.selenium.WebDriver;				
	import org.testng.Assert;			
	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;			

	public class Priority_In_testNG {		
	    WebDriver driver;			

		    // Method 1: Open Brower	
		    @Test		
		    public void aopenBrowser() {				
		    	WebDriver driver = WebDriverManager.chromedriver().create();
				driver.manage().window().maximize();		
		    }		

		    // Method 2: Launch Google.com			
		    @Test		
		    public void blaunchGoogle() {				
		        driver.get("http://www.google.co.in");						
		    }		
	        
		    // Method 3: Perform a search using "Facebook"			
		    @Test		
		    public void cperformSeachAndClick1stLink() {				
		        driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");								
		    }		

		    // Method 4: Verify Google search page title.			
		    @Test		
		    public void dFaceBookPageTitleVerification() throws Exception {				
		        driver.findElement(By.xpath(".//*[@value='Search']")).click();						
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);				
		    }		
		}
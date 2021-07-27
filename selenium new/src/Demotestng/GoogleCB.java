package Demotestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleCB {

	@Test
	@Parameters("browser")
	
	public void tc (String browser) throws Exception{

		
		
		WebDriver driver=null;
	
		if(browser.equalsIgnoreCase("chrome")) {
	
		System.setProperty("Webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		driver= new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
		
		System.setProperty("Webdriver.gecko.driver", "./Software/geckodriver.exe");
		 driver=new FirefoxDriver();
	}   else {  
		
			 driver=null;
    }
	
		 driver.get("https://www.google.com/");
		  driver.findElement(By.name("q")).sendKeys("java");
		   Thread.sleep(30000);
		driver.close();
	
	}

}
package Demotestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoMP {

	@Test
	public void tc1() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.close();
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
	
	}
  
	@Test
	public void tc2() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			//driver.close();
			driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		
	}
}
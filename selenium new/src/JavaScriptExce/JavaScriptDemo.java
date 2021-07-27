package JavaScriptExce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
			 WebDriver driver=new ChromeDriver();
		  
			 driver.manage().window().maximize();
			
		     driver.get("https://www.google.com/");
			
			 driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
			  
			  WebElement e = driver.findElement(By.xpath("(//h2/span[contains(.,'Java')])"));
			Thread.sleep(4000);
         	JavascriptExecutor js=(JavascriptExecutor)driver;
              js.executeScript("window.scrollBy(0,1000)");
	
              Thread.sleep(5000);
              
              JavascriptExecutor js1=(JavascriptExecutor)driver;
              js.executeScript("window.scrollBy(0,-500)");
	
	}
	

}

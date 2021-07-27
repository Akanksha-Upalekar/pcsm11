import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class JavaGoogle {

	  public static void main(String[] args) throws AWTException, InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
	  
		 driver.manage().window().maximize();
		
	     driver.get("https://www.google.com/");
		
		 driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		  
		//  WebElement e = driver.findElement(By.xpath("(//h2/span[contains(.,'Java')])"));
		 
		  Thread.sleep(3000);
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		   
		WebElement ele = driver.findElement(By.xpath("//h3[text()='Oracle Java Technologies | Oracle']"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		  
	   /*  	Actions a=new Actions(driver);
		   
		    a.doubleClick(e).perform();
		  
		    Thread.sleep(2000);
	       
		     Robot r=new Robot(); //Robot class for performing keyboard action in browser
	
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_C);
	        Thread.sleep(2000);
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_T);
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      r.keyPress(KeyEvent.VK_ENTER);
	     
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_C);
	      r.keyRelease(KeyEvent.VK_T);
	      r.keyRelease(KeyEvent.VK_V);
	      
	     */ 
	  }

}



package Assignmentpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //launching the browser
		
		driver.get("https://www.bluestone.com/");// url passed
		
		driver.manage().window().maximize();  //maximize the window
		
	    WebElement Ring=driver.findElement(By.xpath("//a[contains(@title,'Rings')]"));
	    Thread.sleep(2000);
      	Actions a=new Actions(driver);//object creation
	     a.moveToElement(Ring).perform();
	      
	     driver.findElement(By.xpath("(//a[contains(@title,'Diamond Rings')])[1]")).click();
	     driver.findElement(By.xpath("(//div[@class='opt-title'])[2]")).click();
	    // driver.findElement(By.xpath(" Price Low to High ")).click();
	     
	}

}

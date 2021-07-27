package Assignment;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
     WebElement menu = driver.findElement(By.xpath("//button[@class='global-menu-button js-global-menu-cta rrmc-primary-nav-cta--gradient-black']"));
	  menu.click();
	 Thread.sleep(2000);
	  
	 WebElement model = driver.findElement(By.xpath("//button[@aria-label='Models']"));  
	   model.click();
	  
	   Actions a=new Actions(driver);
	   
	   List<WebElement> diffcars = driver.findElements(By.xpath("//div[@class='rrmc-scroll-links']"));
	   
	   for(WebElement md:diffcars)
	   {
	     a.moveToElement(menu).build().perform();
	     Thread.sleep(3000);
	     menu.click();
	     Thread.sleep(2000);
	     
	     
	     
	     String name=md.getText();
	     System.out.println(name);
	     Thread.sleep(2000);
	     
	     
	     DemoScreenShot.takepic(driver,name);
	     Thread.sleep(2000);
	} 
	
}
	
}
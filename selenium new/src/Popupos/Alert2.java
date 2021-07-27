package Popupos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		   driver.findElement(By.id("promtButton")).click();
		   
		 Thread.sleep(2000);
		 Alert a=driver.switchTo().alert();
		 a.sendKeys("akanksha");
		 System.out.println(a.getText());
		a.accept();
		WebElement ele = driver.findElement(By.id("promptResult"));
	   System.out.println(ele.getText());
	
	}

}

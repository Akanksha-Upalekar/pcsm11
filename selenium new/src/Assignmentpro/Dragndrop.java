package Assignmentpro;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {

	//slider

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
	  WebElement Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	  driver.switchTo().frame(Frame);
	  WebElement slider=driver.findElement(By.xpath("//div[@id='slider']"));
	  
	  Actions a=new Actions(driver);
	  Thread.sleep(2000);
	  a.dragAndDropBy(slider, 50, 0).perform();
	
	
	}

}

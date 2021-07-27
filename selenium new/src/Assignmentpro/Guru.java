package Assignmentpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		 WebElement ele = driver.findElement(By.xpath("//span[contains(.,'right click me')]"));
		 Actions a=new Actions(driver);
	//	 a.contextClick(ele).perform();  //rightclick action perform
		 
		// driver.findElement(By.xpath(xpathExpression))
		 
	} 

}

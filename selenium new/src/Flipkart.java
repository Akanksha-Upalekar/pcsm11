import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        Thread.sleep(10000);
       WebElement close= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
       close.click();
        
       Actions a=new Actions(driver);//objct creation
    
       List <WebElement>menus=driver.findElements(By.xpath("//div[@class='_37M3Pb']"));
    
       for(WebElement menuname:menus)
    	  
      {
	System.out.println(((WebElement) menuname).getText());
	
	a.moveToElement(menuname).perform(); //calling non staticmethod
	 Thread.sleep(2000);
	}
	

}

}
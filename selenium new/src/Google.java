import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		  driver.findElement(By.name("q")).sendKeys("java");
		   Thread.sleep(30000);
		  
	     List<WebElement> suggs = driver.findElements(By.xpath("//ul[@role='listbox']"));
	     
	     for(WebElement sugg:suggs) {
	    	  System.out.println(sugg.getText());
	      }
	           suggs.get(2).click();
	}

}

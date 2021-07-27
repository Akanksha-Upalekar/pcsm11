import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdemo {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
			 WebDriver driver=new ChromeDriver();
		  
			 driver.manage().window().maximize();
			
		     driver.get("https://www.selenium.dev/");
		  WebElement srch = driver.findElement(By.xpath("//input[@name='search']"));
	                srch.sendKeys("java",Keys.ENTER);
	  
	                driver.navigate().back();
	                
	                driver.findElement(By.xpath(""))
	
	
	}

}

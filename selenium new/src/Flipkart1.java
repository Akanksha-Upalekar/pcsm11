import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	/*js.executeScript("window.scrollBy(200,0)");
	
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(-200,0)");
	
	*/
	
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(-document.body.scrollHeight, 0)");
	}
	
	
	

}

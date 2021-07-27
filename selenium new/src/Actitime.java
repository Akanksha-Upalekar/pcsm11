import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement e =driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		System.out.println(e.getText());
		WebElement e1=driver.findElement(By.xpath("//input[@id='username']"));
		 System.out.println(e1.isDisplayed());
		 System.out.println("is enabled:"+e1.isEnabled());
		e1.sendKeys(e.getText());
	//this changes by me	
	}
	
	

}

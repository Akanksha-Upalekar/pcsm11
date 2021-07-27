import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		WebElement e =driver.findElement(By.xpath("//a[contains(.,'10+1 Monthly Plan')]"));
		e.click();
	WebElement e1=driver.findElement(By.xpath("//input[@id='amount']"));
	  e1.sendKeys("10000",Keys.TAB);
		WebElement e2=driver.findElement(By.xpath("//input[@id='Email']"));
		e2.sendKeys("abc@gmail.com",Keys.TAB);
		
		WebElement e3=driver.findElement(By.xpath("//input[@id='gmsStart']"));
		e3.click();
	}

}

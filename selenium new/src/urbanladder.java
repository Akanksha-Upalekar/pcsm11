import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urbanladder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement e =driver.findElement(By.xpath("//a[contains(.,'Stores')]"));
	       e.click();
	       WebElement e1= driver.findElement(By.xpath("//h3[contains(.,'Hadapsar, Pune')]"));
          System.out.println(e1.getText());// to fetch the text on console
	       e1.click();
	}
}

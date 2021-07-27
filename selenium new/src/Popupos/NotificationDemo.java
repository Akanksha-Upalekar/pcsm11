package Popupos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationDemo {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--disable-notifications");
		    WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.justdial.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}

}

package RobotClasspro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
	  
		 driver.manage().window().maximize();
		
	     driver.get("https://www.google.com/");
		
	}

}

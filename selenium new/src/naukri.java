import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

	public static void main(String[] args) {

       System.setProperty("Webdriver.chrome.driver", "./software/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.navigate().to("https://www.naukri.com/");
       driver.manage().window().maximize();
       String title=driver.getTitle();
       System.out.println(title);
       String url=driver.getCurrentUrl();
       sy
	}

}

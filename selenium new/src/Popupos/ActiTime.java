package Popupos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
	  
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		
	    driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']"));
	    driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
	 WebElement ele = driver.findElement(By.xpath("//span[text()='© 2021 actiTIME Inc. All rights reserved.']"));
	   System.out.println(ele.getText());
	           
	}
	

}

package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAndCssLocators {

	 public static void main(String[] args) {
		  
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://login.salesforce.com/");
		  
		  
		  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test");
		  
		  
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("almas");
		  
		  
		 }
	
}

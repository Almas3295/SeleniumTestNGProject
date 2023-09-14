package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAndCssLocatorsHM {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://login.salesforce.com/");
		  
		  
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test");
		  
		  
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("jsdjk");
		  
		// driver.findElement(By.xpath("//input[@id='Login']")).click();
		  
		   driver.findElement(By.xpath("//input[@id='Login']")).click();
		  
		  //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("jsdjk");
		  
		  driver.findElement(By.xpath("//a[@name=button secondary]")).click();
		  	
		
		
	}

}

package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumLocators {

	// element locating techniques

	 // id
	 // css
	 // xpath
	 // name
	 // classname
	 // linktext
	 // partiallinktext
	 // tagname

	 public static void main(String[] args) {

	  WebDriver driver = new ChromeDriver();

	  driver.get("https://login.salesforce.com/");
	  
	  driver.findElement(By.id("username")).sendKeys("test");
	  
	  driver.findElement(By.name("pw")).sendKeys("123");
	  
	  driver.findElement(By.id("Login")).click();

	 }
	
	
	
}

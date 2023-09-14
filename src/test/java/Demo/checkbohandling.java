package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbohandling {
	public static void main(String[] args) {
		  

		  WebDriver driver=new ChromeDriver(); 
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  
		  // i want to select only one checkbox
		  WebElement a=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		        a.click();
		 
		      // i want to select all checboxex---
		        
		  
		        
		  
		  
		  
		  
		     

		  
		  
		 }

		}


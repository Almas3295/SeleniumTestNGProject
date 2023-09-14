package Demo;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChekboxBoxHandeling1 {
	public static void main(String[] args) {
		  

		  WebDriver driver=new ChromeDriver(); 
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  
		  // i want to select only one checkbox
		  WebElement a=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		        a.click();
		       
		 
		        
		        // diffrent methods of checkbox, button, radiobox--
		        
		  System.out.println(a.isDisplayed()); //true
		  System.out.println(a.isEnabled()); //true
		  System.out.println(a.isSelected()); //true
		        
		        
		        
		        
		      // i want to select all checkboxes--
		        
		        
		       List<WebElement> b= driver.findElements(By.xpath("//input[@type='checkbox']"));
		       System.out.println(b.size());//3
		       // We to apply the loop over the list -
		       
		       // 0 1 2  -All Select --for loop
		       for(int i=0;i<b.size();i++) {

		        b.get(i).click();
		        
		       }
		        
		       // for each loop-- All select
		       
		       for(WebElement k:b) {
		        k.click();
		       }
		        
		       
		  // i want to sleetc only two checkboxes--
		       
		       for(int i=0;i<b.size()-1;i++) {
		        
		        b.get(i).click();
		        
		       }
		       
		       // i want to slect checkbox 1-- 3--- 5-- 7
		       // i want to  select chekboxn -0- 2-- 4 --6
		  
		  
		     
		     
		       // diffrence between findElement and FindElements ---
		       
		       //FindElement --single WebElement   -- if xpath is wrong -- no such element:  throw exception
		       //FindElements  List of WebElemnts -- if xpath is wrong -it will return the size 0  --not exception
		       
		       
		  
		  
		    
		  
		  
		 }

		}


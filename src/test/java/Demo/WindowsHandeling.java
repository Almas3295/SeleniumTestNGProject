package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandeling {

	 public static void main(String[] args) {
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  
		  driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		  
		  System.out.println(driver.getCurrentUrl());
		  
		 
		  Set<String> w= driver.getWindowHandles();
		                  //parent windows child window
		  
		  
		   Iterator<String> it = w.iterator();
		  String parent_window=  it.next();  //parent
		   String child_window=it.next(); //child
		   
		   driver.switchTo().window(child_window);
		   
		   System.out.println(driver.getCurrentUrl());
		   
		  
		 }

		}

		//https://the-internet.herokuapp.com/nested_frames


		//1. we have driver.getWindowHandles()  --method-- will will store available windows
		//2. We have to store that in Set<String>  --
		//3. apply the iterator over the colection--
		//4. then this will give control parent window and child windows using it.next method
		//5. use driver.switch.window()


	


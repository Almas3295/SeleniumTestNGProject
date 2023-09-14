package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertHandeling {
 
 public static void main(String[] args) {
  
  
  WebDriver driver=new ChromeDriver();
  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  
  
  driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
  
  System.out.println(driver.switchTo().alert().getText());
  
  //driver.switchTo().alert().accept(); // This will accept the alert
  
  driver.switchTo().alert().dismiss(); //this will dismiss the alert
  
       
  //driver.switchTo().alert().sendKeys("test"); //IF you want to type something inside the alert
  
  
  
 }

}
package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownCL {
 
 public static void main(String[] args) {
  
  WebDriver driver=new ChromeDriver(); 
  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
  
  
  // handle select dropdown
  
  WebElement a=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
  
  Select s=new Select(a);
  s.selectByIndex(0);
  
  
  
  
 }

}
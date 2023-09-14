package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//ctrl+shift+o
public class basicCommandsCL {
 
 public static void main(String[] args) throws InterruptedException {
  //To launch the browser
  WebDriver driver = new ChromeDriver();
  
  //session id --123
  //To launch  the url-
  driver.get("https://www.amazon.in/");
  
  driver.navigate().refresh();
  
  
  // maximize the windows
  
  driver.manage().window().maximize(); ]
  
  // to print the current url
  String urlName=driver.getCurrentUrl();
  System.out.println(urlName);
  
  // to print the title of the page
  System.out.println(driver.getTitle());
  //to go backward
  
  driver.navigate().back();
  
  Thread.sleep(2000);
  
  // to go forward
  driver.navigate().forward();
  

  
  
     //diffrence between driver.close and driver.quit
  
  // it will close the current opened browser-
  driver.close(); ////invalid session id
  
  WebDriver driver1 = new ChromeDriver();
  driver1.get("https://www.amazon.in/");  ////invalid session id
  
  

  // it will close all opened browser-
   // driver.quit(); //123 --
   //driver.get("https://www.amazon.in/");   //Session ID is null.
  
  
  
  // diffrence between get and navigate--
  
  //navigate will maintain the histiry but get will not maintain
  
  
  
  
 }

}

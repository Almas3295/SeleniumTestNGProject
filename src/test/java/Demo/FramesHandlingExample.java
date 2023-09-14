package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandlingExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testwebsite.com");

        // Switch to a frame by index
        driver.switchTo().frame(0); // Switch to the first frame

        // Now you can interact with elements within the frame
        WebElement frameElement = driver.findElement(By.id("frameElementId"));
        frameElement.sendKeys("Text within the frame");

        // Switch back to the main content
        driver.switchTo().defaultContent(); // Switch out of any frames

        // Switch to a frame by name or ID
        driver.switchTo().frame("frameNameOrId");

        // Interact with elements within the frame
        WebElement anotherFrameElement = driver.findElement(By.id("frameElementId"));
        anotherFrameElement.click();

        // Switch back to the main content
        driver.switchTo().defaultContent();

        driver.quit();
    }
}
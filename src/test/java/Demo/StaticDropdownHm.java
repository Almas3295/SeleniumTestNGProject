package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownHm {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // Locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.id("dropdownId"));

        // Create a Select object
        Select dropdown = new Select(dropdownElement);

        // Select options using different methods
        dropdown.selectByIndex(2);         // Selects the third option (index 2)
        dropdown.selectByValue("value2");  // Selects an option with attribute value "value2"
        dropdown.selectByVisibleText("Option 3"); // Selects an option by visible text

        // Close the browser
        driver.quit();
    }
}
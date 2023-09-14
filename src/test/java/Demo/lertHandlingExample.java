package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lertHandlingExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Click the button that triggers a simple alert
        WebElement simpleAlertButton = driver.findElement(By.id("simpleAlertButton"));
        simpleAlertButton.click();

        // Switch to the simple alert and accept it
        Alert simpleAlert = driver.switchTo().alert();
        String simpleAlertText = simpleAlert.getText();
        System.out.println("Simple Alert Text: " + simpleAlertText);
        simpleAlert.accept();

        // Click the button that triggers a confirmation alert
        WebElement confirmAlertButton = driver.findElement(By.id("confirmAlertButton"));
        confirmAlertButton.click();

        // Switch to the confirmation alert and dismiss it
        Alert confirmAlert = driver.switchTo().alert();
        String confirmAlertText = confirmAlert.getText();
        System.out.println("Confirm Alert Text: " + confirmAlertText);
        confirmAlert.dismiss();

        // Click the button that triggers a prompt alert
        WebElement promptAlertButton = driver.findElement(By.id("promptAlertButton"));
        promptAlertButton.click();

        // Switch to the prompt alert, provide input, and accept it
        Alert promptAlert = driver.switchTo().alert();
        String promptAlertText = promptAlert.getText();
        System.out.println("Prompt Alert Text: " + promptAlertText);
        promptAlert.sendKeys("Selenium");
        promptAlert.accept();

        driver.quit();
    }
}
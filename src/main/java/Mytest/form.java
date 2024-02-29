package Mytest;

import static org.testng.AssertJUnit.assertEquals;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class form {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/a2/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        
        driver.findElement(By.id("first-name")). sendKeys("Joe");
        
        driver.findElement(By.id("last-name")). sendKeys("Williams");
        
       driver.findElement(By.id("job-title")). sendKeys("Manager");
       
       driver.findElement(By.id("radio-button-2")). click();
       
       driver.findElement(By.id("checkbox-2")). click();
       
       driver.findElement(By.cssSelector("option[value='1']")). click();
       
       driver.findElement(By.id("datepicker")).sendKeys ("02/29/2024");
       
       driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
       
       driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
       
       WebDriverWait wait = new WebDriverWait(driver, 10);
       
       WebElement alertElement = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className(("alert")))));
       String alertText = alertElement.getText();
       
       assertEquals ("The form was successfully submitted!", alertText); 
       
       
      // driver.quit();
       
	}
       
} 
       
       
       
       
        
	


package Mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autocomplete {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:/a2/chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://formy-project.herokuapp.com/autocomplete");
	        
	        WebElement autocompletElement = driver.findElement(By.id("autocomplete"));
	        autocompletElement.sendKeys("8 Jean pl, Edison, NJ");
	        
	     //   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       WebDriverWait wait = new WebDriverWait(driver, 10);    
	        //Thread.sleep(1000)
	        	        
	       WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
	        
	        		
	        autocompleteResult.click();
	        
	        
	        

	}

}

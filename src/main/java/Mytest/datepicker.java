package Mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:/a2/chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://formy-project.herokuapp.com/datepicker");
	        
	        WebElement datefield = driver.findElement(By.id("datepicker"));
	        datefield.sendKeys("02/29/2024");
	        datefield.sendKeys(Keys.RETURN);
	        
	        

	}

}

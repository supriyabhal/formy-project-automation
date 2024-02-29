package Mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/a2/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        
        WebElement fileuploadField = driver.findElement(By.id("file-upload-field"));
        fileuploadField.sendKeys("file-to-upload.png");
       // driver.quit();
        
        
	}

}

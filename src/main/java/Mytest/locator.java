package Mytest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/a2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.immecs.app/emu/#/dashboard");	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("i0116")).sendKeys("supriyad@immonline.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id("i0118")).sendKeys("xxxxxx");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id("immInputMemberAccountNumber")).sendKeys("12345");
		
		
		


		


	}

}

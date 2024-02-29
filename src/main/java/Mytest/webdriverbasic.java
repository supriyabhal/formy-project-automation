package Mytest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class webdriverbasic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/a2/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.equals("Google")){
	System.out.println("correct title");
		}
	else {
		System.out.println("in-correct title");
	}
	
	System.out.println(driver.getCurrentUrl());
	
	//System.out.println(driver.getPageSource());
	driver.quit();
	
	
	}
}


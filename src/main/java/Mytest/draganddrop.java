package Mytest;

import java.awt.Button;
import java.sql.Driver;

import javax.swing.text.html.HTML.Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v118.input.Input;
import org.openqa.selenium.interactions.Actions;

import com.google.common.util.concurrent.AbstractExecutionThreadService;

import net.bytebuddy.build.ToStringPlugin.Enhance.Prefix;
import net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ChildFirst;
import net.bytebuddy.implementation.bytecode.Division;

public class draganddrop {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:/a2/chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://formy-project.herokuapp.com/dragdrop");
	        
	        WebElement image = driver.findElement(By.id("image"));
	        
	        WebElement box = driver.findElement(By.id("box"));
	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(image,box).build().perform();
	        
	       // driver.findElement(By.cssSelector('#q'))
	       // driver.findElement(By.cssSelector('.q'))
	       // driver.findElement(By.cssSelector("input{name='q'))
	       // Tag andTag Class<T>
	       //inputClass class=
	     //  "q"' type="text" '
	       // driver.findElement(By.cssSelector("input.q"))
	        //driver.findElement(By.cssSelector("input#q"))
	       // Input typeInput ="radio" value="radio button"
	       // driver.findElement(By.cssSelector("input[type="radio"]"))
	        //driver.findElement(By.cssSelector("input[value='radio button']"))
	        
	        
	        
	        <Button type="button" class ="btn - primary">
	        
	        //driver.findElement(By.cssSelector(".btn.btn-lg.btn-success"))
	        
	       // Prefixex a[id^='id_prefix_']
	        
	      //  Division iDivision="textField"
	        
	       // driver.findElement(By.cssSelector('div[id="textField"]"));
	        
	      //  <Division id="textField_randomid">
	        
	       // driver.findElement(By.cssSelector("div[id$='textField']'));"
	        
	      //  <div id="123_textField_randomid">
	        
	     //   driver.findElement(By.cssSelector("div[id*='textField']"));
	        
	     //   ChildFirst nodeChildFirst
	      //  Division iDivision='parent"'
	     //   <a  id="child" href="/child">ChildFirst</a></div>
	        
	      //  driver.findElement(By.cssSelector("div#parent a"))
	      //  AbstractExecutionThreadService childAbstractExecutionThreadService
	     //   driver.findElement(By.cssSelector("#list li:nth-child(n)))
	        
	        
	        
	        		
	        		
	        		
	        		
	        		
	        
	        
	        
	        
	        
	        
	        
	        

	}

}

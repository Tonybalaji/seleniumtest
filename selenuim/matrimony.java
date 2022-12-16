package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class matrimony {

	public static void main(String[] args) 
	
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://uibank.uipath.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Register For Account")).click();
		
	    driver.findElement(By.id("firstName")).sendKeys("leetzu");
	 	
	   WebElement  title=  driver.findElement(By.id("title"));
	   
	   Select title1 =new Select(title);
	   
	   title1.selectByVisibleText("Mr");         //uibank
	   
	   
	    	
     	driver.findElement(By.id("middleName")).sendKeys("tony");
		
	  	driver.findElement(By.id("lastName")).sendKeys("Balaji");
	  	
        driver.findElement(By.id("age")).sendKeys("(24/04/2002");
	    
	    WebElement dropdownm = driver.findElement(By.id("maritalStatus"));
        
	    Select marage1 =new Select(dropdownm);
	    
	    marage1.selectByVisibleText("Single");
	     
	    driver.findElement(By.id("username")).sendKeys("lee04");
	    
	    driver.findElement(By.id("email")).sendKeys("pbalaji240422@gmail.com");
	    
	    driver.findElement(By.id("password")).sendKeys("tony");

		

	}

}

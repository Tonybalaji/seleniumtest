package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class faceBookXpath

{

	public static void main(String[] args) 
	{
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfdpeT9_-RQQMIqHGVFAUKPYxec8HDhBONqE9n9UvNKQtsdQTxJYazmBnOk5SpGwqBFOnqPA4QzYa3pn8-eKw-MeeU0gQvWivY3rmAV7zYVwPQ&smuh=3304&lh=Ac9Gems2zttTSJW0DTw");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("leetzu");
	
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("tony balaji");
	    
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("pbalaji240422@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("#tony240422");
	    
	    driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("pbalaji240422@gmail.com");
	
	    WebElement date =driver.findElement(By.id("day"));
	    
	    Select date1 =new Select(date);
	    
	    date1.selectByValue("24");
	    
	    WebElement month =driver.findElement(By.id("month"));
	    
	    Select month1 = new Select(month);
	    
	    month1.selectByVisibleText("Apr");
	    
	    WebElement year =driver.findElement(By.id("year"));
	    
	    Select year1=new Select(year);
	    
	    year1.selectByValue("2002");
	    
	    driver.findElement(By.xpath("//label[text()='Male']")).click();
	    
	}
	
	
	
}

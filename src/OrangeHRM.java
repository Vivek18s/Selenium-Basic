import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
//by using xpath		
public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		
		//get url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//maximize the window
		driver.manage().window().maximize();
		
		
		//locator id
	WebElement from = driver.findElement(By.id("app")) ;
	System.out.println(from);
		
		Thread.sleep(1000);
		//Find username element
		
		Thread.sleep(2000);
		
			driver.findElement(By.name("username")).sendKeys("Admin");
		
			
			
		//find password using xpath
			
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");	
			
		driver.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")).click();	 
		Thread.sleep(2000);
		
		// x path functions
		//contains
		driver.findElement(By.xpath("//input[contains(@class, 'oxd-input--active')]")).sendKeys("Leave");	
		
		//text
		driver.findElement(By.xpath("//span[text()='Leave']")).click();
		
		Thread.sleep(2000);
		
		//starts with
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Type')]")).sendKeys("John Doe");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		//driver.close();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class FacebookActions {
//actions
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);		
		WebElement username = driver.findElement(By.id("email"));
		
		Actions actions = new Actions(driver);
		actions.sendKeys("Username").perform();
		actions.sendKeys(Keys.TAB).sendKeys("123456").build().perform();
		
		
		//to perform ctrl + a
		actions.click(username).sendKeys("username")
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		
		//to perform ctrl + c
		actions.keyDown(Keys.CONTROL)
		.sendKeys("c")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		
		//to perform ctrl + v
		actions.sendKeys(Keys.TAB)
		.keyDown(Keys.CONTROL)
		.sendKeys("v")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		
		//Assignmemnt use special charcters and numbers
		
	}

}

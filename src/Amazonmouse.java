import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;



public class Amazonmouse {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement hello = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		//mouse houre
		Actions actions = new Actions(driver);
		actions.moveToElement(hello).perform();
		
		//scroll by element
		WebElement scrollElement = driver.findElement(By.xpath("//a[text()='About Us']"));
		actions.scrollToElement(scrollElement).perform();
		
		
		//Scroll by Amount:
	//	actions.scrollByAmount(0, 1000).perform();
		
		
	//		Right Click:
			WebElement search =
			driver.findElement(By.id("twotabsearchtextbox"));
			actions.contextClick(search).perform();
			
			
			
	}

}

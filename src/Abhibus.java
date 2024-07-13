import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

//by using css selector
public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhi%20bus&utm_content=Brand&gad_source=1&gclid=Cj0KCQjwsaqzBhDdARIsAK2gqnfh5DXPz6cSoUFBzJdNcw5C2zbQerFLZY5F1laYKaVdsXz8KBZtMXIaAnvdEALw_wcB");
		
		
		
		WebElement elementWithId = driver.findElement(By.cssSelector("#flight-link"));
		elementWithId.click();
		
		Thread.sleep(2000);
		WebElement elementsWithClass = driver.findElement(By.cssSelector(".items-center"));
		elementsWithClass.click();
		
		Thread.sleep(2000);
		
		WebElement elementWithAttribute =driver.findElement(By.cssSelector("svg[width='1em']"));
		elementWithAttribute.click();
	
		Thread.sleep(2000);
		
		//select flight offer
		WebElement elementWithId2 = driver.findElement(By.cssSelector(".menu-list-item"));
		elementWithId2.click();
		
		
		//click on flight
		Thread.sleep(2000);
	//	WebElement firstChild =driver.findElement(By.cssSelector("ul a:first-child"));
		//firstChild.getText();
		
		//WebElement lastChild =driver.findElement(By.cssSelector(".menu-list a:last-child"));
		//lastChild.getText();
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement gettext  = driver.findElement(By.xpath("//p[text()='GOI - Goa']"));
		gettext.sendKeys("Mumbai");
		
		
		
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
		}

}

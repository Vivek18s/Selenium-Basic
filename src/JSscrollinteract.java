import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class JSscrollinteract {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		Thread.sleep(2000);
		
		
		WebElement username1 = driver.findElement(By.id("age"));

		
		
		//typecasting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scrolling pixels
	//	js.executeScript("window.scrollBy(0, 1500)");
		Thread.sleep(1000);
	//	js.executeScript("window.scrollBy(0, -1500)");
		
		
		//scrolling till element is visible on viewport
	//	WebElement effect = driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/tooltip/\"]"));
	//	js.executeScript("arguments[0].scrollIntoView();", effect);
		
		//Alternate click operation.
	//	js.executeScript("arguments[0].click();", effect);
		
		//sendkeys
	
	js.executeScript("arguments[0].value = 'username'" , username1);
		
		
		
		
		
		
		
		
	}

}

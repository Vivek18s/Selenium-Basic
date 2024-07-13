import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

//iframe in selenium
public class Jquery {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(2000);

		
		WebElement iframelement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframelement);
		Thread.sleep(1000);
		
		//slider
		WebElement slider =
		driver.findElement(By.xpath("//div[@id='slider']//span"));
		Actions act = new Actions(driver);
		
		Thread.sleep(1000);
		
		
		//sliding action
		act.clickAndHold(slider).moveByOffset(500,
		0).release().build().perform();
		Thread.sleep(1000);
		
		act.clickAndHold(slider).moveByOffset(-200,
		0).release().build().perform();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);

	}

}

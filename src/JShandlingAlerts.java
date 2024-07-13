
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class JShandlingAlerts {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		//confirmButton
		driver.findElement(By.id("alertButton")).click();	
		
		//getText();
		String alterMsg = driver.switchTo().alert().getText();
		System.out.println(alterMsg);
		
		//accepting alert
		driver.switchTo().alert().accept();
		
		
		WebElement confirmButton = driver.findElement(By.id("confirmButton"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", confirmButton);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		WebElement promptButton = driver.findElement(By.id("promtButton"));
		js.executeScript("arguments[0].scrollIntoView();", promptButton);
		js.executeScript("arguments[0].click();", promptButton);
		driver.switchTo().alert().sendKeys("SsquareIT");
		driver.switchTo().alert().accept();
	}

}

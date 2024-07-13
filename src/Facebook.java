import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

//handling dropdowns using select class

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		

		//select create acc
		WebElement elementWithId = driver.findElement(By.cssSelector("div > a[ajaxify=\"/reg/spotlight/\"]"));
		elementWithId.click();
		
		Thread.sleep(2000);
		
		WebElement selectDay = driver.findElement(By.id("day"));
		Select select = new Select(selectDay);
		select.selectByVisibleText("7");
		Thread.sleep(2000);
		
		
		WebElement selectMonth = driver.findElement(By.id("month"));
		Select selectMon = new Select(selectMonth);
		selectMon.selectByIndex(3);
		Thread.sleep(1000);
		
		WebElement selectyear = driver.findElement(By.id("year"));
		Select selectyr = new Select(selectyear);
		selectyr.selectByValue("2022");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
	}

}

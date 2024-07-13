import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


//using all locators
public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		
		
		//WebElement from = driver.findElement(By.id("src")) ;
		WebElement from = driver.findElement(By.className("sc-bxivhb")) ;
		System.out.println(from);
		from.sendKeys("pune");
		Thread.sleep(2000);
		
		
		//driver.findElement(By.id("about_us_footer")).click(); //id is the safest path and easiest way.
		
		
	/*	//handling this exception 
	 //linked text and partial link text.
		try {
			 driver.findElement(By.linkText("https://www.redbus.in/info/aboutus")).click();

		}catch(NoSuchElementException e) {
			System.out.println(e);
		}*/
		
		
		try {
			 driver.findElement(By.partialLinkText("FAQ")).click();

		}catch(NoSuchElementException e) {
			System.out.println("exception is their");
		}
		
		
	Thread.sleep(10000);
		
		
		
		driver.findElement(By.xpath("//li [@text='Help' or @id='help_redcare']")).click();
		
		
		
		
		driver.findElement(By.linkText("Technical Issues")).click();
		
		
		
		Thread.sleep(5000);
		driver.close();
	}

}

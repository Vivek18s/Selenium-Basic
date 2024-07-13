import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		//maximise the window
		driver.manage().window().maximize();
		
		
		
		//get url
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=14654494874606462495&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		Thread.sleep(2000);
		//
		//driver.findElement(By.linkText("https://rukminim2.flixcart.com/flap/80/80/image/22fddf3c7da4c4f4.png?q=100")).click();
				
		//driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("Mobiles");
		
		
		driver.findElement(By.id("nav-search-submit-button")).click() ;
		//driver.findElement(By.id("Mobiles")).click();
		//driver.findElement(By.name("Mobiles")).click();
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
	}

}

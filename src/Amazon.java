
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		
			// Open Flipkart website
            driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=12854021700985023752&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062113&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");

            // Maximize the browser window
            driver.manage().window().maximize();
            Thread.sleep(2000);
         
            //Search  mobile
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
            
            //click on search
            driver.findElement(By.className("nav-search-submit")).click();
            
            //Add to cart
            driver.findElement(By.xpath(" //button[@id=\"a-autoid-1-announce\"]")).click();
           
           
	}

}

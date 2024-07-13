
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Flipkartt {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		
		try {
			// Open Flipkart website
            driver.get("https://www.flipkart.com");

            // Maximize the browser window
            driver.manage().window().maximize();

           

            
            Thread.sleep(2000);
            
            
            
            
            
            
            driver.findElement(By.className("Pke_EE")).sendKeys("Mobiles");
            // Locate the search bar using its name attribute
           // WebElement searchBox = driver.findElement(By.name("q"));
            //System.out.println(searchBox);

            // Enter the product name to search
           // searchBox.sendKeys("laptop");

            // Locate and click the search button using its class name
            WebElement searchButton = driver.findElement(By.className("_2iLD__"));
            searchButton.click();

            Thread.sleep(2000);
            

            WebElement Clickmobile = driver.findElement(By.className("DByuf4"));
            Clickmobile.click();
            
          // WebElement Addmobile = driver.findElement(By.className("QqFHMw"));
           //Addmobile.click();
            
            Thread.sleep(2000);
            
         
           // driver.findElement(By.name("Add to cart"));
            //driver.findElement(By.linkText("ADD TO CART")).click();
           // driver.findElement(By.partialLinkText("ADD TO CART")).click();
         // WebElement add =  driver.findElement(By.cssSelector(".QqFHMw.vslbG+.In9uk2"));
          //add.click();
           WebElement adds = driver.findElement(By.xpath("//button[@type=\'button\']"));
           adds.click();
           Thread.sleep(2000);
           
           
            WebElement from = driver.findElement(By.id("Buy Now")) ;
        	from.click();
            
           WebElement Addmobile1 = driver.findElement(By.className("OGrnIL"));
            Addmobile1.click();  //QqFHMw vslbG+ In9uk2
            
            
        } finally {
            // Close the browser
           //driver.quit();
        
		}

	}

}

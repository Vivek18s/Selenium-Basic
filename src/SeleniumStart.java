import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.openqa.selenium.WebDriver;

//basics
public class SeleniumStart {

	public static void main(String[] args) throws InterruptedException {
		
		   
		//browser invoking
	WebDriver driver = new ChromeDriver(); //we use webdriver combinly for all browsers bcoz chrome also have its sepaarete methods so by using webdriver we can use only universally access methods for all browsers
//	WebDriver driver = new SafariDriver();
	
	
	//get
	driver.get(" https://www.flipkart.com/");
	
	
	//manage
	driver.manage().window().maximize();
	
	
	//title
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
		System.out.println("Test case is passed.");
	}else {
		System.out.println("Test case is failed.");
	}
	
	
	Thread.sleep(1000);
	
	
	
	//url
	String url = driver.getCurrentUrl();
	System.out.println(url);
	if(url.equals("https://www.flipkart.com/")) {
		System.out.println("Test case is passed.");
	}else {
		System.out.println("Test case is failed.");
	}
	
	
	
	driver.close();
	
	}

}


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JShandlingWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		
		
		//print parent window id
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Id: " + parentId);
		
		//open child window
		driver.findElement(By.id("non-users-notice-link")).click();
		
		//get all open windows
		Set<String> allWindowId = driver.getWindowHandles();
		
		
		//print and switch to different windows
		for(String windowId:allWindowId) {
				System.out.println(windowId);
		if(!parentId.equals(windowId)) {
			driver.switchTo().window(windowId);
			}
		}
		
		
		//operations from child window
		String newWindowText = driver.findElement(By.xpath("//span[text()='HelpCentre']")).getText();
		System.out.println(newWindowText);
		
		//switch back to parent window
		driver.switchTo().window(parentId);
		Thread.sleep(1000);
		
		//operations on parent window
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Username");
		
		
		//close all the current instance window
		
		
		
		
		
	}

}

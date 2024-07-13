import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebElement;
public class jquerydropables {

	

		public static void main(String[] args) throws InterruptedException, IOException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/droppable/");
			Thread.sleep(2000);

			WebElement iframe = driver.findElement(By.className("demo-frame"));
			driver.switchTo().frame(iframe);
			Thread.sleep(1000);
			WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
			Actions actions = new Actions(driver);

			// actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
			actions.dragAndDrop(draggable, droppable).perform();
			
			
			Thread.sleep(2000);

			//typecasting taking screenshot************************************************************************************************

			TakesScreenshot ts = (TakesScreenshot) driver;
			// create source file

			File source = ts.getScreenshotAs(OutputType.FILE);

			Thread.sleep(2000);
			// create destination file
			String path = "D:\\Lectures 20 april\\Selenium\\Screenshots\\dragandarop.jpg";

			// ((((OR)))
			// String path = System.getProperty("user.dir") +"\\Screenshots\\draganddrop.jpg";
			
			File file = new File(path);
			
			// copy from source and save to file using fileHandler
			FileHandler.copy(source, file);
		
		
		
		
		driver.close();
		
	}

}

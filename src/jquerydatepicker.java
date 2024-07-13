import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class jquerydatepicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(1000);
		WebElement iframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);
		//click on the datepicker
		driver.findElement(By.id("datepicker")).click();
		String expectedMonthYear = "February 1995";
		//using while loop
		while(true) {
		String monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthYear);
		if(!monthYear.equals(expectedMonthYear)) {
		driver.findElement(By.xpath("//a[@title=\"Prev\"]")).click();
		}else {
		break;
		}
		} driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"]//a[@data-date='14']")).click();
		

		
		
		
		
		
		
		
		
		
		
	}

}

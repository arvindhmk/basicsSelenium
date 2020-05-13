

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String site = "https://book.spicejet.com/";
		driver.get(site);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//a[@value='IXM'])[2]")).click();
		driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-today')]")).click();
		Thread.sleep(1500);
		driver.close();
		
		
	}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Impwait 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.alaskaair.com/hotels/mp/home/en/?utm_source=alaska&utm_medium=partner-page&utm_campaign=alaska-globalnav-bookhotels-Q12019-home-tr");
		WebElement location = driver.findElement(By.name("Location"));
		location.sendKeys("m");
		Thread.sleep(3000);
		location.sendKeys("a");
		Thread.sleep(3000);
		location.sendKeys("n");
		Thread.sleep(3000);
		location.sendKeys("c");
		Thread.sleep(3000);
		location.sendKeys("h");
		Thread.sleep(3000);
		location.sendKeys("e");
		location.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("button.btn.wl-btn-search.search-submit-btn.big")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Hotel Gotham')]")).click();
		driver.close();
	}
	

}


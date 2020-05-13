package practiceseltestscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		
		List<WebElement> listoptions = driver.findElements(By.xpath("//ul[@id='sortable']//li"));
		
		Actions act = new Actions(driver);
		
		WebElement source = listoptions.get(6);
		WebElement destination = listoptions.get(0);
		
		
		act.clickAndHold(source).moveToElement(destination).release(destination).build().perform();	
	}

}

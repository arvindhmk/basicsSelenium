import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Javascripttreedragndrop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		act.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_DOWN).build().perform();//scroll i the screen
		WebElement drag = driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='treeTarget']/ul/li"));
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		Thread.sleep(3000);
		driver.close();
	}

}

package HandlingActions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/ref=nav_logo");
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span[2]"));
		act.moveToElement(ele).build().perform();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		act.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("HELLO").doubleClick().build().perform();
		act.contextClick(ele).build().perform();
		Thread.sleep(4000);
		driver.close();
	}

}

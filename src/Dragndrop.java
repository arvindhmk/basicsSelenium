import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dragndrop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Actions act = new Actions(driver);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		act.doubleClick(drop).build().perform();//double click
		Thread.sleep(3000);
		act.contextClick().build().perform();//right click
		Thread.sleep(3000);
		act.dragAndDrop(drag, drop).build().perform();//drag and drop
		//act.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		Thread.sleep(1000);
		driver.navigate().to("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		act.clickAndHold(resize).moveByOffset(417, 147).release(resize).build().perform();
		//act.dragAndDropBy(resize, 60, 30);
		Thread.sleep(3000);
		driver.navigate().to("https://jqueryui.com/slider/#colorpicker");
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//div[@id='green']/span"));
		act.clickAndHold(slider).moveByOffset(100, 0).release(slider).build().perform();
		//act.dragAndDropBy(slider, 100, 0);
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("https://jqueryui.com/slider/#multiple-vertical");
		driver.switchTo().frame(0);
		WebElement slider1 = driver.findElement(By.xpath("//div[@id='eq']/span[2]/span"));
		wait.until(ExpectedConditions.visibilityOf(slider1));
		act.clickAndHold(slider1).pause(Duration.ofSeconds(5)).moveByOffset(0, 100).release(slider1).build().perform();		
		//act.dragAndDropBy(slider1, 60, 0);
		Thread.sleep(2000);
		driver.close();
	}

}

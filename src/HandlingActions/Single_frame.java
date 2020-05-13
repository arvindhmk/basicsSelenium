package HandlingActions;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Single_frame 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("useAutomationExtension", false);
		option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		option.addArguments("disable-notifications");
		option.addArguments("disable-geolocation");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/iframe");
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.findElement(By.xpath("//div[@id='mceu_29']/div")).click();
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//div[@id='mceu_29']/div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@//*[@id=\"tinymce\"]/p=\"tinymce\"]/p")).sendKeys("Testing");
		driver.switchTo().defaultContent();
		driver.getTitle();
		driver.close();
	}
}

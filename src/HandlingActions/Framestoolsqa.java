package HandlingActions;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Framestoolsqa 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("useAutomationExtension",false);
		option.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.findElement(By.id("cookie_action_close_header")).click();
		driver.findElements(By.tagName("iframe")).size();
		int frames_count = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frames_count);
		driver.switchTo().frame(driver.findElement(By.id("IF1")));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"page\"]/a[1]")).click();
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		driver.switchTo().frame(driver.findElement(By.id("IF2")));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@href='https://demoqa.com/droppable/']"))));
		driver.findElement(By.xpath("//a[@href='https://demoqa.com/droppable/']")).click();
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}

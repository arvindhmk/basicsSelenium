package HandlingActions;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Framespractive {

	public static void main(String[] args) throws InterruptedException {
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
		driver.get("http://hugelearning.com/iframe-practice-page/");
		int frame_count = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frame_count);
		WebElement frame1 = driver.findElement(By.id("IFrame1"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.linkText("LINK TEST2")).click();
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		driver.switchTo().frame("iframe2");
		String text = driver.findElement(By.xpath("//div[@class='entry-content']/h2")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		driver.close();
	}
}

package Misc;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calendar_redbus {

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
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chenn");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Madura");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"monthTitle\").value=;";
		String text = (String) js.executeScript(script);
		System.out.println(text);

			while(!text.equalsIgnoreCase("Dec 2019")) 
			{
				driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//button[contains(text(),'>')]")).click();
				Thread.sleep(3000);
			}
		List<WebElement> day = driver.findElements(By.className("wd day"));
		int count1 = day.size();
		System.out.println(count1);
		for (WebElement dayz : day) {
			String content = dayz.getAttribute("innerhtml");
			if (content.equalsIgnoreCase("3")) {
				dayz.click();
				break;
			}
		}
	}

}

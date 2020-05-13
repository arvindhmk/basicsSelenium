import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				WebElement ele = driver.findElement(By.xpath("//p[@id='demo']"));
if (ele.getAttribute("innerHTML").equalsIgnoreCase("WebDriver")) 
				{
System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));

return ele;

}
				// If condition is not true then it will return null and it will keep checking until condition is not true

				else {
System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));

return null;
				}
}

});
System.out.println("Final visible status is >>>>> " + element.isDisplayed());		
driver.close();
	}

}

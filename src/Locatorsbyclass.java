import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatorsbyclass {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://login.salesforce.com/");
//		driver.findElement(By.id("username")).sendKeys("Arvi");
//		driver.findElement(By.name("pw")).sendKeys("12345");
//		driver.findElement(By.className("button r4 wide primary")).click();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.className("inputtext")).sendKeys("1234");
		Thread.sleep(2000);
		driver.close();
	}

}

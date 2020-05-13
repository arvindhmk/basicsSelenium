import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("arvindh.mk@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("Arvi.222");
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.close();
		
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


//implementing Assertions

public class Handlingcheckbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='Student']")).isSelected());
		Thread.sleep(2500);
		driver.findElement(By.cssSelector("input[id*='Student']")).click();
		Assert.assertTrue((driver.findElement(By.cssSelector("input[id*='Student']")).isSelected()));
		driver.close();
	}

}

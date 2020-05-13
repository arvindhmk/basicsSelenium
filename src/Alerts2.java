import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/");
		//int i=0;
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1500);
		System.out.println(driver.findElement(By.id("hrefDecAdt")).getAttribute("class"));
		if(driver.findElement(By.id("hrefDecAdt")).getAttribute("class").contains("disabled"))
		{
		System.out.println("disabled");
		Assert.assertTrue(true);		
		}
		else
		{
					
			Assert.assertFalse(false);
		}
		//while (i<5)
	//	{
		//	driver.findElement(By.id("hrefIncAdt")).click();	
		//}		
		driver.close();	
	}
}
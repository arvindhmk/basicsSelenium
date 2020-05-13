import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Validateenabledanddisabled 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Website = "https://book.spicejet.com/";
		driver.get(Website);
		//System.out.println(driver.findElement(By.id("custom_date_picker_id_2")).isEnabled());
		System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		if(driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("1"))
		{
			System.out.println("Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		//System.out.println(driver.findElement(By.id("custom_date_picker_id_2")).isEnabled());
		driver.close();
	}
}
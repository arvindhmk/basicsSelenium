import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 
{

//Checkbox
	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String site = "http://qaclickacademy.com/practice.php";
		driver.get(site);
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		Assert.assertFalse(checkbox.isSelected());
		checkbox.click();
		Thread.sleep(2000);
		Assert.assertTrue(checkbox.isSelected());
		checkbox.click();
		Thread.sleep(2000);
		Assert.assertFalse(checkbox.isSelected());
		driver.close();
	}

}

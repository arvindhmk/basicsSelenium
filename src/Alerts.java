import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Implementing Assertion

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		// driver.switchTo().alert().sendKeys("Test");
		String Alerttext = (driver.switchTo().alert().getText());
		Assert.assertEquals(Alerttext, "Are you sure you want to give us the deed to your house?");
		driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();
		driver.close();
	}

}

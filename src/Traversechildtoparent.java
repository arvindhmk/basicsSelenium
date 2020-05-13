import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversechildtoparent 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String str = "http://www.qaclickacademy.com/interview.php";
		driver.get(str);
		//driver.findElement(By.xpath("//*[contains(text(),'Appium is the only open Source Automation tool which works for both Android and IOS Automation.']"))
		driver.findElement(By.xpath("//a[@href='\\index.php\\']/parent::ul")).click();
		
	}

}

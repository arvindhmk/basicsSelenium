import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Multiplewindowassignment 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("disable-infobars");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();	
		Set <String> wh = driver.getWindowHandles();
		Iterator<String> obj = wh.iterator();
		String parentid=obj.next();
		String childid=obj.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		String textchild = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(textchild);
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		String textparent = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(textparent);
		driver.close();
	}

}

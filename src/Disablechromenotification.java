import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disablechromenotification 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.91mobiles.com/latest-mobiles-in-india");
		Thread.sleep(3000);
		driver.close();

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverbrowsermethods {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String str = "http://google.com";
		driver.get(str);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());//validate page title
		System.out.println(driver.getCurrentUrl());//validate landed on correct page/url
		//System.out.println(driver.getPageSource());//print page source
		driver.navigate().to("http://mediinfotec.com");//navigate to new web page
		driver.navigate().back();//navigate back to old page
		Thread.sleep(3000);
		driver.navigate().forward();//forward navigate to new page
		Thread.sleep(3000);
		driver.close();//closes the current window
		//driver.quit();//closes all the window
	}

}

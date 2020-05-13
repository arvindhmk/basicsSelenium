import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Invokeie 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\Downloads\\Compressed\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		String str = "http://google.com";
		driver.get(str);
		System.out.println(driver.getTitle());

}

}
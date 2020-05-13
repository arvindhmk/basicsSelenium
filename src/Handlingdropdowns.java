import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingdropdowns 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		List<WebElement> dd_menu= driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
				for(WebElement ele : dd_menu)
				{
				String innerhtml=ele.getAttribute("innerHTML");
				if(innerhtml.contentEquals("JavaScript"))
				{
				ele.click();
				System.out.println("valur from drop is"+innerhtml);
				break;
				}
				}
	driver.close();
	}
}
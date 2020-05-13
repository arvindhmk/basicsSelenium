package HandlingActions;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingmousehover 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement ele = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();//mouse hover function
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		int count = element.size();
		
		for(int i=0;i<count;i++)
		{
			WebElement ele1 = element.get(i);
			String text = ele1.getAttribute("innerHTML");
			Boolean status = ele1.isEnabled();
			System.out.println("Link text"+text+"and the status is "+ status);
			
			if(text.equalsIgnoreCase("TestNG"))
			{
				ele1.click();
				break;
			}
		}
	driver.close();
	}

}

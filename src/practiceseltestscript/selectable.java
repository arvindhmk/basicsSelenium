package practiceseltestscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class selectable 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectable = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		
		int count = selectable.size();
		
		Actions act = new Actions(driver);
//		for(int i=0;i<count;i++)
//		{
//			if(i!=4 && i!=5)
//			{
//			act.keyDown(Keys.CONTROL).click(selectable.get(i)).build().perform();
//			}
//		}

		act.clickAndHold(selectable.get(0)).build().perform();
		act.clickAndHold(selectable.get(2)).build().perform();
		act.clickAndHold(selectable.get(4)).build().perform();
		act.clickAndHold(selectable.get(6)).build().perform();
		
		
	}

}

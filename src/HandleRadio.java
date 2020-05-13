import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadio 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		int count = driver.findElements(By.xpath("//input[@type='radio' and @name='lang']")).size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement indexValue=driver.findElements(By.xpath("//input[@type='radio' and @name='lang']")).get(i);
			String value=indexValue.getAttribute("Value");
					System.out.println(value);
			if(value.equalsIgnoreCase("PYTHON"))
			{
				indexValue.click();
			}
		}
		
		
	}

}

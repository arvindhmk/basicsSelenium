package practiceseltestscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handleradiobuttons 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement unchecked = driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/following::label[2]/input"));
		unchecked.click();
		WebElement checked = driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/following::label[3]/input"));
	
		if(checked.isSelected())
		{
			System.out.println("default selected");			
		}
		else
		{
			System.out.println("default not selected");
		}
		

		List<WebElement> choiceradiobutton = driver.findElements(By.xpath("//input[@class='myradio' and @name='age']"));
		
		int numofoptions=choiceradiobutton.size();
		
		for(WebElement radio:choiceradiobutton)
		{
			if(radio.isSelected())
			{
				System.out.println("option selected");
				break;
			}
			
		}
		
	}

}

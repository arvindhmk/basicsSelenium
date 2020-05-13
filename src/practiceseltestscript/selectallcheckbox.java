package practiceseltestscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selectallcheckbox 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		
		driver.close();
		
	}

}

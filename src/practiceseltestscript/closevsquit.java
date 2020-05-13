package practiceseltestscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class closevsquit 
{
	
	
	//close -- closes the window in which webdriver has the focus.
	//quit -- closes all the windows opened by webdriver.

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		
		driver.findElement(By.id("home")).click();
		
		//driver.close();
		driver.quit();
	}

}

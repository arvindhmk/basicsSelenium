

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticradiobuttons 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\Compressed\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());//to get the count of radio buttons
		System.out.println(driver.findElements(By.xpath("//input[@name='group2']")).size());//to get the count of radio buttons
	}

}

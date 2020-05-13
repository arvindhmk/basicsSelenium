package practiceseltestscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement dd= driver.findElement(By.id("dropdown1"));
		Select s = new Select(dd);
		s.selectByValue("1");
		
		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select s2= new Select(dd2);
		s2.selectByVisibleText("Appium");
		
		WebElement dd3 = driver.findElement(By.xpath("//section[@class='innerblock']//div[6]/select"));
		Select s3 = new Select(dd3);
		s3.selectByValue("1");
		s3.selectByValue("3");
		s3.selectByValue("4");

		WebElement dd4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		
		 List<WebElement> li = dd4.findElements(By.tagName("option"));
		 int optioncount =li.size();
		 
		 for(int i=0;i<optioncount;i++)
		 {
			  li.get(4).click();
		 }
		 
	}

}

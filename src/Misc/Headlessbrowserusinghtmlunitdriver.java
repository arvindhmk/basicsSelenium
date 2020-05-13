package Misc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Headlessbrowserusinghtmlunitdriver 
{
	@Test
	public void Verifytitle()
	{
		WebDriver driver = new HtmlUnitDriver();
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		//true- start supporting javascript
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Facebook"));
		
	}
	@Test
	public void verifytitlenew()
	{
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		String titlenew = driver.getTitle();
		Assert.assertTrue(titlenew.contains("Selenium"));
	}
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

	}

}

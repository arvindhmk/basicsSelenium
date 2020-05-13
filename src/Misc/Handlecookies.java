package Misc;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Handlecookies 
{
@Test
public void Deletecookie()
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	
	
	Set<Cookie> cookies = driver.manage().getCookies();
	int cookiecount=cookies.size();
	System.out.println(cookiecount);
	
	for(Cookie c : cookies)
	{
		System.out.println("Name : "+c.getName());
		System.out.println("Domain : "+c.getDomain());
		System.out.println("Path : "+c.getPath());
		System.out.println("value : "+c.getValue());
		System.out.println("-----------------------------");
	}
	
	driver.manage().deleteCookieNamed("datr");
	
	
	Set<Cookie> afetrdel = driver.manage().getCookies();
	int cookiecount2 = afetrdel.size();
	
	System.out.println(cookiecount2);
	
}

}

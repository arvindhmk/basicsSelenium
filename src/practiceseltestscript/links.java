package practiceseltestscript;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class links 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Link.html");
		
		//driver.findElement(By.linkText("Go to Home Page")).click();
		
		//driver.findElement(By.xpath("//a[@href='Button.html']")).click();

		List<WebElement> urls = driver.findElements(By.tagName("a"));
		
		int urlcount= urls.size();
		
		System.out.println("count="+urlcount);
		
		for(WebElement links : urls)
		{
			String url = links.getAttribute("href");
			verifylink(url);
		}
	}
		
		public static void verifylink(String linkurl)
		{
			
			try {
				URL u=new URL(linkurl);
				HttpURLConnection connect = (HttpURLConnection)u.openConnection();
				connect.setConnectTimeout(3000);
				connect.connect();
				
				if(connect.getResponseCode()==200)
				{
					System.out.println(linkurl+"=="+connect.getResponseMessage());
				}
				if(connect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
				{
					System.out.println(linkurl+"=="+connect.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND);
				}
			}catch(Exception e)
			{
				
				System.out.println("Exception occured");
			}
		}
		
		
	

}

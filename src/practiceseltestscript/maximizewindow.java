package practiceseltestscript;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class maximizewindow 
{
	//maximize()
	//setsize() -- dimension
	//FirefoxOptions --

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		
		Map<String,Object> pref = new HashMap<String,Object>();
		pref.put("profile.default_content_setting_values.notification", 2);
		
		FirefoxOptions opt = new FirefoxOptions();
		opt.addArguments("--start-Maximized");
		opt.setCapability("pref", pref);
		WebDriver driver =  new FirefoxDriver(opt);
		
		//driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
	
//		Dimension dimen = new Dimension(1200, 700);
//		driver.manage().window().setSize(dimen);
		
	}

}

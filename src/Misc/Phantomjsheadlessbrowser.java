package Misc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Phantomjsheadlessbrowser
{
	@Test
	public void verifyfbtitle() throws IOException
	{

		    
		
		DesiredCapabilities caps = new DesiredCapabilities();
	    ((DesiredCapabilities) caps).setJavascriptEnabled(true);
	    ((DesiredCapabilities) caps).setCapability("takesScreenshot", true);
	    Proxy.extractFrom(caps);
	    File src = new File("C:\\Users\\user\\Downloads\\Compressed\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path",src.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver(caps);
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		Screenshotmethod1.Capturescreen("scr");
		
		
	}
}

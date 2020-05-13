package Misc;


import java.util.Collections;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sslcertificates 
{

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub

		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions options = new ChromeOptions();
		options.merge(dc);
		options.addArguments("incognito");
		options.addArguments("start-maximised");
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		Dimension d = new Dimension(300,1080);
		driver.manage().window().setSize(d);
		driver.manage().deleteCookieNamed("testcookie");
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.close();
	}

}

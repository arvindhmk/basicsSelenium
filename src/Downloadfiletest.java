import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Downloadfiletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		public class fileUpload {


		// TODO Auto-generated method stub

		String downloadPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[contains(text(),'UploadThis.txt')]")).click();
		File f=new File(downloadPath+"/UploadThis.txt");
		if(f.exists())
		{

		Assert.assertTrue(f.exists());

		if(f.delete())

		System.out.println("file deleted");

		}

		}



	}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignmentonexplicitwait 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		WebDriverWait w = new WebDriverWait(driver,15);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("results")));		
		String Text = driver.findElement(By.id("results")).getText();
		System.out.println(Text);
		driver.close();
		
	}

}

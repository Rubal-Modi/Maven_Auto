package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1
{	
	public static WebDriver driver= null;
	public static String url="https://www.spicejet.com/";
	
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrubal\\OneDrive - DXC Production\\Documents\\Mine\\Java\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	public static void setImplicitTime(long time, TimeUnit unit)
	{
		driver.manage().timeouts().implicitlyWait(time, unit);
	}
	public WebElement searchAnything(By by)
	{
		return driver.findElement(by);
	}

	public static void enterText(By by, String s)
	{
		driver.findElement(by).sendKeys(s);
	}
	public String ExpectedText(String ex)
	{
		return ex;
	}

}

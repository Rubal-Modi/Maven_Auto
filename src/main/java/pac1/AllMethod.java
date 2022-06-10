package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AllMethod
{	
	public static WebDriver driver= null;
	//public static String url="https://www.spicejet.com/";
	
	public static void setUp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrubal\\OneDrive - DXC Production\\Documents\\Mine\\Java\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	// set time
	public static void setImplicitTime(long time, TimeUnit unit)
	{
		driver.manage().timeouts().implicitlyWait(time, unit);
	}
	
	// only for search
	public WebElement searchAnything(By by)
	{
		return driver.findElement(by);
	}
	
	// Search any webelement and enter some text
	public void enterTextInLocation(By by,String s)
	{
		searchAnything(by).sendKeys(s);
	}
		// Actual result
	public String actualText(By by)
	{
		return searchAnything(by).getText();
	}
	// expected result
	public String expectedText(String excepcted)
	{
		return excepcted;
	}
	// Click on any web element
	public void click(By by)
	{
		searchAnything(by).click();
	}
	public boolean enableDisplay(By by)
	{
		return searchAnything(by).isDisplayed();
	}
	public boolean isSelected(By by)
	{
		return searchAnything(by).isSelected();
	}
	public boolean isEnabled(By by)
	{
		return searchAnything(by).isEnabled();
	}
	
	public void curser(By by)
	{
		Actions ac= new Actions(driver);
		ac.moveToElement(searchAnything(by)).build().perform();
	}
	
	public void login(By i, String id, By pas, String pass, By cli/*By actualtxt, String expected*/)
	{
		enterTextInLocation(i, id);
		enterTextInLocation(pas, pass);
		click(cli);
		//actualText(actualtxt);
	}
		
	
}

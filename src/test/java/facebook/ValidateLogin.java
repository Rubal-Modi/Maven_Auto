package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pac1.AllMethod;

public class ValidateLogin extends AllMethod
{
	public static WebDriver driver= null;
  @Test
  public void A() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrubal\\OneDrive - DXC Production\\Documents\\Mine\\Java\\chromedriver_win32\\chromedriver.exe");
	  
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  driver= new ChromeDriver(options);
	  driver.navigate().to("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  login(By.id("email"), "8319626121", By.id("pass"), "Mnop@2580", By.cssSelector("#u_0_b"));
	  Assert.assertEquals(actualText(By.cssSelector("#navItem_100054633591293 > a > div")), "Ruhi Singh");
	 
	
  }
  
  @Test
  public void B()
  {
	  setUp("https://www.facebook.com/");
	  login(By.id("email"), "8319626121", By.id("pass"), "Mnop@2345", By.cssSelector("#u_0_b"));
	  Assert.assertEquals(actualText(By.cssSelector("#navItem_100054633591293 > a > div")), "Ruhi Singh");
	  driver.close();
  }
  
  
}

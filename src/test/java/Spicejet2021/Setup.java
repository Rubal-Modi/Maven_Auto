package Spicejet2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup 
{
	public static WebDriver driver= null;
	public static String url= "https://www.spicejet.com/";

	public static void set()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrubal\\OneDrive - DXC Production\\Documents\\Mine\\Java\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}

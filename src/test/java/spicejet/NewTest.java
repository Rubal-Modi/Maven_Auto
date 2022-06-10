package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pac1.AllMethod;

public class NewTest extends AllMethod{
  @Test
  public void f() 
  {
	  setUp("https://artoftesting.com/samplesiteforselenium");
	  Actions ac= new Actions(driver);
	  ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-98\"]/a/span"))).build().perform();
	  driver.findElement(By.xpath("//*[@id=\"menu-item-1005\"]/a")).click();
	  
	  driver.close();
  }
}

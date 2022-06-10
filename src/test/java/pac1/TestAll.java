package pac1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAll extends AllMethod{
  @Test
  public void checkRadioButton() 
  {
	setUp("https://www.spicejet.com/");
	boolean b=searchAnything(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[1]/label")).isEnabled();
	Assert.assertEquals(b, true);
	driver.navigate().refresh();
	boolean c= searchAnything(By.id("ctl00_mainContent_rbtnl_Trip_1")).isDisplayed();
	Assert.assertEquals(c, true);
	
	
	
  }
}

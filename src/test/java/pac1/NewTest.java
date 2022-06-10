package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest extends AllMethod{
  @Test
  public void f() 
  {
	 setUp("https://www.spicejet.com/");
	 Actions ac= new Actions(driver);
	 ac.moveToElement(searchAnything(By.xpath("//*[@id=\"footer-headings\"]/td[3]"))).build().perform();
	 Assert.assertEquals(actualText(By.xpath("//*[@id=\"footer-headings\"]/td[3]")), expectedText("Travel Info"));
	 
  }
}

package pac1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 extends AllMethod{
  @Test
  public void f() 
  {
	  setUp("https://www.spicejet.com/");
	  curser(By.xpath("//*[@id=\"footerTable\"]/tbody/tr[11]/td[3]/a"));
	  Assert.assertEquals(actualText(By.xpath("//*[@id=\"footerTable\"]/tbody/tr[11]/td[3]/a")), expectedText("Track Your Bag"));
  }
}

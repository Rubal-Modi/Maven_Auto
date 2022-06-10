package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DealsMaven extends AllMethod
{
  @Test
  public void test()
  {
	setUp("https://www.spicejet.com/");
	setImplicitTime(30, TimeUnit.SECONDS);
	click(By.xpath("//*[@id=\"header-vacations\"]/a"));
	Assert.assertEquals(actualText(By.xpath("//*[@id=\"contactusBasePanel\"]/div/p")), expectedText("Experience new way of booking celebration"));
 
}
}
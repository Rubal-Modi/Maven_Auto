package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class First extends Class1
{
  @Test
  public void f()
  {
	  First fir= new First();
	  setUp();
	  setImplicitTime(30, TimeUnit.SECONDS);
	  fir.searchAnything(By.xpath("//*[@id=\"Covid19info\"]/span[2]")).click();
	  
  
}
}
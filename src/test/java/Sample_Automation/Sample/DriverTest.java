package Sample_Automation.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DriverTest {
	
	public WebDriver driver;
	
	
	
  @Test
  public void f() {
	  
	  driver.get("http://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new FirefoxDriver();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}

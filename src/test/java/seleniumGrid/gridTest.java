package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class gridTest {
  @Test
  public void chromeGridTest() throws MalformedURLException, InterruptedException {
	  ChromeOptions options=new ChromeOptions();
	  Reporter.log("",true);
	  WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
	  Reporter.log("Driver session Eststablished with server!", true);
	  Thread.sleep(5000);
	  driver.get("https://www.amazon.in");
	  Thread.sleep(10000);
	  System.out.println("The Title is"+driver.getTitle());
	  Reporter.log("Test execution for amazon.in!", true);
	  
	  driver.quit();
	  Reporter.log("Test execution for amazon.in on Chrome completed!", true);
	  
  }
}

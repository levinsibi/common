package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sampleTest {
  @Test(invocationCount=4,threadPoolSize=2)
  public void openWindow() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("sachin");
  }
}

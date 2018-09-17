package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
  @Test(dataProvider="DP")
  public void login(String mail,String pass) {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(mail);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
  }
  @DataProvider(name="DP")
  public static Object[][]getdata()
  {
	  Object[][]data={{"lev@b.com","pass1"},{"tvm@b.com","pass2"}};
	  return data;
	  
  }
}

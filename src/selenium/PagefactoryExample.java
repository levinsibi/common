package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PagefactoryExample {

	@FindBy(how=How.ID,using="email")
	private static WebElement unam;
	@FindBy(how=How.NAME,using="pass")
	private static WebElement pass;
	@Test
	public static void main(String[]args)
	{
		WebDriver driver=new FirefoxDriver();
		PageFactory.initElements(driver, PagefactoryExample.class);
		driver.get("https://www.facebook.com/");
		unam.sendKeys("test");
		pass.sendKeys("test");  
	}
	
}

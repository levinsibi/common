package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class log4j {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Logger logger=Logger.getLogger("log4j");
		PropertyConfigurator.configure("D:\\New folder\\Test\\log\\log4j.properties");
		
	/*System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();*/
	WebDriver driver=new FirefoxDriver();
	 
	 
	 String baseUrl = "http://www.google.com";
	 driver.get(baseUrl);
	 Thread.sleep(9000);

driver.manage().window().maximize();

String actualResult = driver.getTitle();
String expResult = "gosogle";
if(actualResult.equals(expResult))
{
   logger.info("clicked on object");
}
else
{
	logger.debug("This is debug message");
    
    logger.warn("This is warn message");
    logger.fatal("This is fatal message");
    logger.error("This is error message");
} 
System.out.println(System.getProperty("user.dir"));
		
		
	}

}

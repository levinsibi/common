package selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLog4j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=Logger.getLogger("TestLog4j");
		//create a new file in mentioned path with below name and copy properties content
		//http://learn-automation.com/how-to-create-log-files-in-selenium/.-sample content
		PropertyConfigurator.configure("D:\\MY_FW\\FrameWork_v1\\Selenium_Reports\\log\\log4j.properties");
		
	System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/?gws_rd=ssl");
	logger.warn("This is warn message");
    logger.fatal("This is fatal message");
    logger.error("This is error message");
	 
	 
	}

}

package seleniumorverride;

import java.util.List;
import java.util.Set;

import javax.rmi.CORBA.UtilDelegate;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserDriver implements WebDriver,WebElement{

	private WebDriver driver;
	private String browser=null; 
	public BrowserDriver(String browser)
	{
		this.browser=browser;
		this.driver=createDriver(browser);
	}
	public WebDriver createDriver(String s )
	{
		if(s.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(s.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		return driver;
		
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		driver.close();
	}

	@Override
	public WebElement findElement(By locator) {
		// TODO Auto-generated method stub
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);
	}

	@Override
	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return driver.findElements(arg0);
	}

	@Override
	public void get(String arg0) {
		// TODO Auto-generated method stub
		driver.get(arg0);
	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return driver.getPageSource();
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return driver.getWindowHandle();
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return driver.getWindowHandles();
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return driver.manage();
	}
	

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return driver.navigate();
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		driver.quit();
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return driver.switchTo();
	}
	@Override
	public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getCssValue(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Point getLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Rectangle getRect() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Dimension getSize() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTagName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void sendKeys(CharSequence... arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

}

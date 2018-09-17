package testNg;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumTest {

	private static WebDriver driver=null;
	private static JavascriptExecutor jse=null;
	public static int foundflag=1;
	public static String getoption() throws InterruptedException
	{
		String s=JOptionPane.showInputDialog(null, "Entered  Xpath Cant match try new one");
		while(s==null)
		{
			Thread.sleep(1000);
		}
		return s;
	}
	public static void Highlight(String e1)
	{
		try
		{
			WebElement e=driver.findElement(By.xpath(e1));
		jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('style','background:yellow; border: 5px solid red;');", e);
		foundflag=1;
		}
		catch(Exception ex)
		{
			foundflag=0;
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		try
		{
		System.out.println("hello");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@name='w']"));
		driver.findElement(By.xpath("//input[@name='w']")).sendKeys("sachin");
		driver.quit();
		}
		catch(Exception ex)
		{
			String str=getoption();
			Highlight(str);
			
			while(foundflag==0)
			{
				/*try{
					
				}
				catch(Exception e)
				{
					
					Highlight(str);
				}*/
				str=getoption();
				Highlight(str);
			}
			driver.findElement(By.xpath(str)).sendKeys("sachin");
			
		}
		
	}

}

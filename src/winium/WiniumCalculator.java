package winium;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class WiniumCalculator {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.winium.driver.desktop", "D:\\winiumDriver\\Winium.Desktop.Driver.exe");
		Runtime.getRuntime().exec("D:\\winiumDriver\\Winium.Desktop.Driver.exe");
		DesktopOptions options=new DesktopOptions();
		options.setDebugConnectToRunningApp(false);//true-use already opened app ;false-launch app
		options.setApplicationPath("C:/windows/system32/calc.exe");
		//sFile file=new File("E:\\Winium\\Winium\\Winium.Desktop.Driver.exe");
		WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"),options);
		//WebElement calcFrame = driver.findElement(By.name("Calculator"));
		//driver.findElementByName("View").click();
		//driver.findElementByName("Standard").click();
		Thread.sleep(1000);
		driver.findElement(By.name("Eight")).click();
		driver.findElement(By.name("Plus")).click();
		driver.findElement(By.name("Two")).click();
		driver.findElementByName("Equals").click();
		
		
		
		
	}

}

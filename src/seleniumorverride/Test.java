package seleniumorverride;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new BrowserDriver("Chrome");
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(".//*[@name='q']")).sendKeys("hai");
	}

}

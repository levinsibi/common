package angular;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularButtonText;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class AngularTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://juliemr.github.io/protractor-demo/");
		NgWebDriver ngdriver=new NgWebDriver((JavascriptExecutor)driver);
		ngdriver.waitForAngularRequestsToFinish();
		driver.findElement(ByAngular.model("first")).sendKeys("10");
		WebElement e1=driver.findElement(ByAngular.model("operator"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("/");
		driver.findElement(ByAngular.model("second")).sendKeys("2");
		driver.findElement(ByAngular.buttonText("Go!")).click();
		Thread.sleep(5000);
		String st=driver.findElement(ByAngular.repeater("result in memory").row(0)).getText();
		System.out.println(st);
	}

}

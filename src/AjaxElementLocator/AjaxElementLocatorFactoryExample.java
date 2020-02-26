package AjaxElementLocator;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AjaxElementLocatorFactoryExample {
	
	
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			GoogleHome1 d=new GoogleHome1(driver);
			driver.get("https://www.google.co.in/");
			d.seach("Tendulkar");
			
			
		
			
		}
	}

 class GoogleHome1{
	 WebDriver driver;
	 @FindBy(xpath="//input[@name='q']")
		static WebElement search1;
	 GoogleHome1(WebDriver d){
		 this.driver=d;
		 PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	 }
	 public void seach(String input) {
		 search1.sendKeys(input);
	 }
}

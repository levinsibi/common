package sikuli;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class SikuliExample {

	/**
	 * @param args
	 * @throws FindFailed 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws FindFailed, AWTException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Screen s=new Screen();
		
		String img1="D://images//google.png";
		String img2="D://Sikuli//JS.png";
		if(s.find(img1) != null)
		{
			System.out.println("match found");
			//s.click("D://Sikuli//Services.png");
		}
		else
		{
			System.out.println("match NOT found");
			
		}
		/*try
		{
			if(s.find("D://Sikuli//abc.png") != null)
			System.out.println("match abc found");
		}
		catch(Exception ex)
		{
			System.out.println("match NOT found");
			
		}
		
		 
		
		
	//identifying desktop objects
		 
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		robot.keyRelease(KeyEvent.VK_D);
		
		 s.find(img1).doubleClick(); //identify pause button
			
		  Thread.sleep(4000);

		 // s.find("D://Sikuli//Close_Btn.png").click();
		  s.type("lalalallalalalallalalaalalalalalalalala");
		
		//s.dragDrop(img1, img2);
*/	}

}

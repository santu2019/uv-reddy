package Matrimony;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RobotAPI {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\Desktop\\chromedriver.exe");
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	//	Actions a = new Actions(driver);
	//	a.sendKeys("Sowjan").sendKeys(Keys.TAB).sendKeys("hdsnj").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		
		
		

	}

}

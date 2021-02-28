package Matrimony;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CongoReg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		driver.get(" http://automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.id("email")).sendKeys(" jetblue@grr.la");
		driver.findElement(By.id("passwd")).sendKeys(" jetblue");
		driver.findElement(By.className("icon-lock left")).click();	
	}
}

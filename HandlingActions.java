package Matrimony;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\Desktop\\chromedriver.exe");
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		//Mousehover action
		Actions a = new Actions(driver);
		WebElement ele= driver.findElement(By.linkText("MEN"));
		a.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.linkText("T-Shirts"))).click().build().perform();
		//Rightclick action
	//	Actions a = new Actions(driver);
	//	a.moveToElement(driver.findElement(By.id("....."))).contextClick().build().perform();
		//Doubleclick action
	//	Actions a = new Actions(driver);
	//	a.moveToElement(driver.findElement(By.id("....."))).doubleClick().build().perform();
		//Sendkeys through action
	//	Actions a = new Actions(driver);
	//	a.moveToElement(driver.findElement(By.id("....."))).click().sendKeys("abc").build().perform();

		
}
}
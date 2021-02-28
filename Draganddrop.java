
package Matrimony;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","./exe/chromedriver.exe");
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		//a.dragAndDrop(drag, drop).build().perform(); (or)
		a.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		
		

	}

}

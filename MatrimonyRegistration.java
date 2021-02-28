package Matrimony;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MatrimonyRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\Desktop\\chromedriver.exe");
		driver.get("https://www.bharatmatrimony.com/register/registerform.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	/*	Select profile = new Select(driver.findElement(By.id("REGISTERED_BY")));
		profile.selectByVisibleText("Daughter");
		Thread.sleep(2000);
		driver.findElement(By.name("NAME")).sendKeys("Sowjanya");
		Thread.sleep(2000);
		Select Date = new Select(driver.findElement(By.name("DOBDAY")));
		Date.selectByValue("2");
		Thread.sleep(2000);
		Select Month = new Select(driver.findElement(By.name("DOBMONTH")));
		Month.selectByValue("7");
		Thread.sleep(2000);
		Select Year = new Select(driver.findElement(By.name("DOBYEAR")));
		Year.selectByValue("1994");
		Thread.sleep(2000);
		Select Religion = new Select(driver.findElement(By.name("RELIGION")));
		Religion.selectByValue("1");
		Thread.sleep(2000);
	    Select Mothertounge = new Select(driver.findElement(By.name("MOTHERTONGUE")));
		Mothertounge.selectByValue("48");
		Thread.sleep(2000);
		Select Countrycode = new Select(driver.findElement(By.name("M_COUNTRYCODE")));
		Countrycode.selectByValue("98");
		Thread.sleep(2000);
		driver.findElement(By.name("MOBILENO")).sendKeys("9908923463");
		Thread.sleep(2000);
		driver.findElement(By.name("EMAIL")).sendKeys("sowjanya.santu@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("PASSWD1")).sendKeys("sele@123");
		Thread.sleep(2000);
		driver.close();*/
	  Select s = new Select(driver.findElement(By.name("REGISTERED_BY")));
	  List<WebElement>allOptions = s.getOptions();
	  System.out.println("Total no.of options is:" +allOptions.size());
	  for(int j=0;j<allOptions.size();j++) {
		  System.out.println(allOptions.get(j).getText());
	  
	  }
	}
}
	  



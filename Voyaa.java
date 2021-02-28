package Matrimony;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Voyaa {
	public static WebDriver driver;
    public String Testname = "";
    @Test(priority=1)
    public void home() throws Exception {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://web-int.stg.voyaah.com");
        driver.findElement(By.xpath("//p[@class='mr-5 loginCursor']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Email or Mobile Number']")).sendKeys("shaiksardarhussain1996@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sardaRRR@@@1996");
        driver.findElement(By.xpath("//button[@class='text-white save-button-styles mt-2']")).click();
        Thread.sleep(2000);
        boolean ele=driver.findElement(By.xpath("//a[text()='Home']")).isEnabled();
        System.out.println(ele);
        driver.findElement(By.xpath("//a[text()='Home']")).click();
        
        String ActualTitle=driver.getTitle();
        System.out.println(ActualTitle);
        String ExpectedTitle="Voyaah";
        if(ExpectedTitle.equals(ActualTitle)) {
            System.out.println("Home Page is clickable");
        }
        else {
            System.out.println("Home Page is not clickable");
            Assert.assertEquals(ExpectedTitle, ActualTitle);
        }
        
        
    }
    @Test(priority=2)
    public void aboutUs() {
        
        driver.findElement(By.xpath("//a[text()='About Us']")).click();
        String expectedhomeURL="https://web-int.stg.voyaah.com/#/about-us";
        String actualhomeURL=driver.getCurrentUrl();
        if(expectedhomeURL.equals(actualhomeURL)) {
            System.out.println("About Us is clickable");
        }else {
            System.out.println("About Us is not clickable");
          Assert.assertEquals(expectedhomeURL, actualhomeURL);
        }
    }
    @Test(priority=3)
    public void staycation() {
        driver.findElement(By.xpath("//a[text()='Staycations']")).click();
        String expectedhomeURL="https://web-int.stg.voyaah.com/#/staycation";
        String actualhomeURL=driver.getCurrentUrl();
        if(expectedhomeURL.equals(actualhomeURL)) {
            System.out.println("Staycations is clickable");
        }else {
            System.out.println("Staycations is not clickable");
          Assert.assertEquals(expectedhomeURL, actualhomeURL);
        }
    }
    @Test(priority=4)
    public void featuredPackage() {
        Actions act=new Actions(driver);
        WebElement Package=driver.findElement(By.xpath("//div[text()=' East End Munnar, Kerala ']"));
        act.moveToElement(Package);
        act.perform();
        Package.click();
        String expectedhomeURL="https://web-int.stg.voyaah.com/#/staycation/EASTENDMUNNARKERALA354787";
        String actualhomeURL=driver.getCurrentUrl();
        if(expectedhomeURL.equals(actualhomeURL)) {
            System.out.println("Package is clickable");
        }else {
            System.out.println("Package is not clickable");
          Assert.assertEquals(expectedhomeURL, actualhomeURL);
        }
        
    }
    @Test(priority=5)
    public void accommodation() throws Exception {
        driver.findElement(By.linkText("Accommodation")).click();
        Thread.sleep(2000);
        Actions act=new Actions(driver);
        WebElement RA=driver.findElement(By.xpath("//*[text()='Room Amenities']"));
        act.moveToElement(RA);
        act.perform();
        if(RA.isDisplayed()) {
        System.out.println("Room amenties link is displayed so Accommodation is clicked");
        }    
    }
    @Test(priority=6)
    public void location() throws Exception {
        driver.findElement(By.linkText("Location")).click();
        Thread.sleep(2000);
        Actions act=new Actions(driver);
        WebElement Loc=driver.findElement(By.xpath("//h2[text()='Location']"));
        act.moveToElement(Loc);
        act.perform();
        if(Loc.isDisplayed()) {
        System.out.println("Location Title is displayed so Location is clicked");
        }
        
    }
    @Test(priority=7)
    public void gallery() throws Exception {
        driver.findElement(By.linkText("Gallery")).click();
        Thread.sleep(2000);
        Actions act=new Actions(driver);
        WebElement gal=driver.findElement(By.xpath("//h2[text()='Make Your Own Memories']"));
        act.moveToElement(gal);
        act.perform();
        if(gal.isDisplayed()) {
        System.out.println("Make Your Own Memories Title is displayed so Gallery is clicked");
        }
        
    }

 


    @Test(priority=8)
    public void overview() throws Exception {
        driver.findElement(By.linkText("Overview")).click();
        Thread.sleep(2000);
        Actions act=new Actions(driver);
        WebElement gal=driver.findElement(By.xpath("//td[text()='Destination']"));
        act.moveToElement(gal);
        act.perform();
        if(gal.isDisplayed()) {
        System.out.println("Destination field is displayed so Overview is clicked");
        }
        
    }

}

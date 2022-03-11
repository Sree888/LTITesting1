package day5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGExercise2 {
	WebDriver driver;
  @Test(priority=1)
  public void LoginTC() {
	  driver.manage().window().maximize();
		//enter username
		driver.findElement(By.name("userName")).sendKeys("mercury");
		//enter password
		driver.findElement(By.name("password")).sendKeys("mercury");
		//click on submit
		driver.findElement(By.name("submit")).click();
  }
  @Test(priority=2,enabled=false)
  public void FlightSearchTC() throws InterruptedException{
	  driver.findElement(By.linkText("Flights")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@value='oneway']")).click();
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("PRE-REQUISTE");
		//launch chromebrowser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
				 driver=new ChromeDriver();
				//open application
				driver.get("https://demo.guru99.com/test/newtours/");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("POST CONDITION");
		driver.close();
  }

}

package Practice;

import static org.junit.Assert.*;
import static org.testng.Assert.assertTrue;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Scenario1 {
	WebDriver driver;
	
	@Before
	public void before(){
		//launch chromebrowser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
				 driver=new ChromeDriver();
				//open application
				driver.get("https://www.google.com");
	}
	
	@Test
	public void TC1(){
		WebElement a1=driver.findElement(By.name("q"));
		WebElement a2=driver.findElement(By.name("btnK"));
		assertTrue(a1.isEnabled());
		assertTrue(a2.isEnabled());
		
		
	}
	@Test
	public void TC2() throws InterruptedException{
		driver.findElement(By.name("q")).sendKeys("testing");
		Thread.sleep(3000);
		WebElement a3=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]"));
		assertTrue(a3.isEnabled());
	    
		
	}
	@Test
	public void TC3(){
		driver.findElement(By.name("q")).sendKeys(" ");
		driver.findElement(By.name("btnK")).click();
		WebElement a4=driver.findElement(By.name("btnK"));
		assertTrue(a4.isEnabled());
		
	}
	@Test
	public void TC4(){
		WebElement a5=driver.findElement(By.tagName("a"));
		assertTrue(a5.isEnabled());
	}
	
	@After
	public void after(){
		System.out.println("POST CONDITION");
		driver.close();
	}

}

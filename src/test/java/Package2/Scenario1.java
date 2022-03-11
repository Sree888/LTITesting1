package Package2;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	WebDriver webDriver;
	
	@Before
	public void before(){
		//launch chromebrowser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
				webDriver=new ChromeDriver();
				//open application
				webDriver.get("https://www.google.com");
	}
	@Test
	public void TC1(){
		WebElement a1=webDriver.findElement(By.name("q"));
		WebElement a2=webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		assertTrue(a1.isDisplayed());
		assertTrue(a2.isDisplayed());
		
	}
	@Test
	public void TC2() throws InterruptedException{
		webDriver.findElement(By.name("q")).sendKeys("testing");
		Thread.sleep(300);
		WebElement a3=webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]"));
		assertTrue(a3.isDisplayed());
	}
	@Test
	public void TC3(){
		webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		WebElement a4=webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		assertTrue(a4.isDisplayed());
		
	}
	
	@After
	public void after(){
		System.out.println("POST CONDITION");
		webDriver.close();
	}

}

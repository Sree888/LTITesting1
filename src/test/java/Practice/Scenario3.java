package Practice;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;


import static org.junit.Assert.*;
import org.openqa.selenium.*;


public class Scenario3 {
WebDriver webDriver;
	
	@Before
	public void before(){
		//launch chromebrowser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
				webDriver=new ChromeDriver();
				//open application
				webDriver.get("http://demo.guru99.com/insurance/v1/index.php");
	}
	@Test
	public void TC1(){
		webDriver.findElement(By.xpath("/html/body/div[3]/a")).click();
		WebElement a1=webDriver.findElement(By.xpath(""));
		assertTrue(a1.isEnabled());
	}
	
	
	
	@After
	public void after(){
		System.out.println("POST CONDITION");
		webDriver.close();
	}

}

package day5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitExercise2 {
	WebDriver driver;
	
	@Test
	public void Testcase1(){
		//verify whether register and link is available on Home page
		WebElement registerlink=driver.findElement(By.linkText("Register"));
		WebElement loginlink=driver.findElement(By.linkText("Log in"));
		assertTrue(registerlink.isDisplayed());
		assertTrue(loginlink.isDisplayed());
		
	}
	
	@Test
	public void Testcase2(){
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("sree18@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("sr1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//verify login success
		String emailtext=driver.findElement(By.linkText("sree18@gmail.com")).getText();
		assertTrue(emailtext.contains("sree18"));
		assertEquals("sree18@gmail.com",emailtext);
		assertTrue(driver.findElement(By.linkText("sree18@gmail.com")).isEnabled());
	}
	
	@Before
	public void before(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//open application
		driver.get("http://demowebshop.tricentis.com/");
	}
	
	

}

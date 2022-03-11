package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;
import static org.testng.Assert.assertTrue;

import org.junit.*;

public class Scenario2 {
WebDriver driver;
	
	@Before
	public void before(){
		//launch chromebrowser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
				 driver=new ChromeDriver();
				//open application
				driver.get("http://demo.guru99.com/Agile_Project/Agi_V1/index.php");
	}
	/*@Test
	public void TC1(){
		driver.findElement(By.name("btnLogin")).click();
		String b1=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals("User or Password is not valid", b1);
		
	}
	@Test
	public void TC2(){
		driver.findElement(By.name("uid")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("12345");
		WebElement a1 = driver.findElement(By.xpath("/html/body/div[4]/ol"));
		assertTrue(a1.isEnabled()); 
	}  */
	@Test
	public void TC3(){
		driver.findElement(By.name("uid")).sendKeys("1303");
		driver.findElement(By.name("password")).sendKeys("Guru99");
		//WebElement a2 = driver.findElement(By.xpath("/html/body/div[3]/div"));
		//assertTrue(a2.isEnabled());
	}
	
	@After
	public void after(){
		System.out.println("POST CONDITION");
		driver.close();
	}

}

package day4;

import java.io.InterruptedIOException;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scenario5 {
	WebDriver driver;
	
	@Test
	public void Testcase1(){
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Sreejzz");
		driver.findElement(By.id("LastName")).sendKeys("Vzkn");
		driver.findElement(By.id("Email")).sendKeys("sreevl18@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("sr1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("sr1234");
		driver.findElement(By.id("register-button")).click();
		//check whether registration is success
		String actualresult=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
		Assert.assertEquals("Your registration completed", actualresult);
	}
	@Test
	public void Testcase2(){
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("sree18@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("sr1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//check whether login is success
		String actualresult2=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).getText();
		Assert.assertEquals("Log out", actualresult2);
		
	}
	
	@Test
	public void Testcase3(){
		driver.close();
	}
	
	@Before
	public void before(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//open application
		driver.get("http://demowebshop.tricentis.com/");
	}
	
	

}

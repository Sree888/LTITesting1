package Package2;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {
WebDriver webDriver;
	
	@Before
	public void before(){
		//launch chromebrowser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
				webDriver=new ChromeDriver();
				//open application
				webDriver.get("http://demo.guru99.com/Agile_Project/Agi_V1/index.php");
	}
	@Test
	public void TC1(){
		webDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		String a1=webDriver.switchTo().alert().getText();
		webDriver.switchTo().alert().accept();
		Assert.assertEquals("User or Password is not valid",a1);
	}
	@Test
	public void TC2(){
		webDriver.findElement(By.name("uid")).sendKeys("mercury");
		webDriver.findElement(By.name("password")).sendKeys("password123");
		webDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		webDriver.switchTo().alert().accept();
		String a2=webDriver.findElement(By.xpath("/html/body/div[4]/ol/li[1]")).getText();
		Assert.assertEquals("UserID : 1303", a2);
		
		
	}
	@Test
	public void TC3(){
		webDriver.findElement(By.name("uid")).sendKeys("1303");
		webDriver.findElement(By.name("password")).sendKeys("Guru99");
		webDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		String a3=webDriver.findElement(By.xpath("/html/body/div[3]/div/ul/li[1]/a")).getText();
		Assert.assertEquals("Customer", a3);
	}
	
	
	
	@After
	public void after(){
		System.out.println("POST CONDITION");
		webDriver.close();
	}

}

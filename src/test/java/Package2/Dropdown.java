package Package2;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
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
		Select p = new Select(webDriver.findElement(By.name("passCount")));
		p.selectByIndex(3);
	}
	

}

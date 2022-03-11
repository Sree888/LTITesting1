package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch chromebrowser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");
		//to maximize browser
		driver.manage().window().maximize();
		//enter username
		driver.findElement(By.name("userName")).sendKeys("mercury");
		//enter password
		driver.findElement(By.name("password")).sendKeys("mercury");
		//click on submit
		driver.findElement(By.name("submit")).click();
		//click on flights
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(10000);
		//How to work with ads---
		//click on oneway
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		//select passenger value from dropdown
		Select p = new Select(driver.findElement(By.name("passCount")));
		p.selectByIndex(3);
		//any of the below can also used instead of above
		//p.selectByValue("4");
		//p.selectByVisibleText("4");
		
		//select from
		Select d=new Select(driver.findElement(By.name("fromPort")));
		d.selectByVisibleText("London");
		
		//On
		Select e=new Select(driver.findElement(By.name("toMonth")));
		e.selectByVisibleText("August");
		
		Select f=new Select(driver.findElement(By.name("toDay")));
		f.selectByVisibleText("10");
		//select first class
		
		driver.findElement(By.xpath("//input[@value='First']")).click();
		//airline
		Select g=new Select(driver.findElement(By.name("airline")));
		g.selectByVisibleText("Unified Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		
		
	}

}

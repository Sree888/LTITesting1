package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chromebrowser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("http://demowebshop.tricentis.com/");
		//click on login
		driver.findElement(By.linkText("Log in")).click();
		//enter email
		driver.findElement(By.name("Email")).sendKeys("srzewv@gmail.com");
		//enter password
		driver.findElement(By.name("Password")).sendKeys("123456");
		//click login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}

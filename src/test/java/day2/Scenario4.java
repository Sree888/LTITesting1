package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {

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
		//enter in searchbox
		driver.findElement(By.id("small-searchterms")).sendKeys("Build your own cheap computer");
		//click on search button
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		//click on text link
		driver.findElement(By.linkText("Build your own cheap computer")).click();
		//Click Fast processor
		driver.findElement(By.xpath("//input[@value='65']")).click();
		//Click 8 GM RAM
		driver.findElement(By.name("product_attribute_72_6_19")).click();
		//Click 400 GB HDD
		driver.findElement(By.xpath("//input[@value='58']")).click();
		//click on check box
		driver.findElement(By.id("product_attribute_72_8_30_93")).click();
		driver.findElement(By.id("product_attribute_72_8_30_94")).click();
		driver.findElement(By.id("product_attribute_72_8_30_95")).click();
		//Click add to cart button
		driver.findElement(By.id("add-to-cart-button-72")).click();


	}

}

package day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://demo.guru99.com/popup.php");
		//get the window id
		String oldpage = driver.getWindowHandle();
		System.out.println("currently opened page window ID is: "+oldpage);
		
		//click on the 'click here' link
		driver.findElement(By.linkText("Click Here")).click();
		
		//switch from old window to new window
		//to get the window ID of newly opened tab, use below syntax
		
		Set<String> newpage = driver.getWindowHandles();
		for(String name:newpage){
			driver.switchTo().window(name);
		}
		
		//enter e mail id
		driver.findElement(By.name("emailid")).sendKeys("sree@gg.com");
		//click on submit
		driver.findElement(By.name("btnLogin")).click();
		
		//driver.close();  ---close only active tabe
		driver.quit(); //-->forces to close all the tabe opened in browser

	}

}

package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chromebrowser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//open application
				driver.get("http://demowebshop.tricentis.com/");
				driver.findElement(By.name("q")).sendKeys("computer");
				
				//implements action concepts to press down arrow key for 2 times and press enter
				Actions act = new Actions(driver);
				
				act.moveToElement(driver.findElement(By.name("q")))
				.pause(2000)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build().perform();
				
				driver.close();
	}

}

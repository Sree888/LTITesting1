package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chromebrowser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//open application
				driver.get("https://jqueryui.com/droppable/");
				// drag and drop operation
				Actions act=new Actions(driver);
				driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
				act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")))
				.build().perform();
				
				

	}

}

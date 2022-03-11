package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chromebrowser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//open application
				driver.get("http://demo.automationtesting.in/Alerts.html");
				
				//Handle alert with OK
				driver.findElement(By.id("OKTab")).click();
				driver.switchTo().alert().accept();
				
				//handle confirm box
				driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
				driver.findElement(By.id("CancelTab")).click();
				driver.switchTo().alert().dismiss();
				
				//handle promptbox
				driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
				driver.findElement(By.id("Textbox")).click();
				
				//read alert
				String text = driver.switchTo().alert().getText();
				if(text.contains("Please enter your name")){
					driver.switchTo().alert().sendKeys("sreehari");
					driver.switchTo().alert().accept();
				}
				

	}

}

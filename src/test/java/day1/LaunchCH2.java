package day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCH2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
			//launch chromebrowser
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//open application
			driver.get("http://demowebshop.tricentis.com/");
			//clicks on register
			driver.findElement(By.linkText("Register")).click();
			//click on gender radio button as female
			driver.findElement(By.id("gender-female")).click();
			//enter first name
			driver.findElement(By.name("FirstName")).sendKeys("saranya");
			//enter lastname
			driver.findElement(By.name("LastName")).sendKeys("Vzkdn");
			//enter email
			driver.findElement(By.name("Email")).sendKeys("srzewv@gmail.com");
			//password
			driver.findElement(By.name("Password")).sendKeys("123456");
			//confirm pwd
			driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
			//click register
			driver.findElement(By.name("register-button")).click();
			//close
			driver.close();
			

	}

}

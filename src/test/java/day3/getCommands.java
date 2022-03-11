package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		//check title of webpage is equal to demo web shop
		if(title.equals("Demo Web Shop")){
			System.out.println("title is correct");
		}
		//fetch current url
		System.out.println(driver.getCurrentUrl());
		
		//fetch html sourse of page
		System.out.println(driver.getPageSource());
		
		//move back
		driver.navigate().back();
		//move forward
		driver.navigate().forward();
		//refresh
		driver.navigate().refresh();
		driver.close();

	}

}

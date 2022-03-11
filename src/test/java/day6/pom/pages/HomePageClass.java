package day6.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageClass {
	WebDriver driver;
	
	public HomePageClass(WebDriver driver) {
		this.driver=driver;
	}
	
	//locators
	By registerlink=By.linkText("Register");
	By loginlink=By.linkText("Log in");
	By searchbox=By.name("q");
	By searchbutton=By.xpath("//input[@value='Search']");
	By logoutlink=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	
	
	//methods
	public void click_login(){
		driver.findElement(loginlink).click();
	}
	
	public void click_register(){
		driver.findElement(registerlink).click();
	}
	
	public void search_product(String productname){
		driver.findElement(searchbox).sendKeys(productname);
		driver.findElement(searchbutton).click();
	}
	
	public void click_logout(){
		driver.findElement(logoutlink);
	}

}

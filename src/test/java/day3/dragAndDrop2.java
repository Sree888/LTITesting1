package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chromebrowser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		// drag and drop operation
		Actions act=new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[2]/a"));
		WebElement target = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
		act.dragAndDrop(src, target).build().perform();
		
		WebElement src2 = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[5]/a"));
		WebElement target2 = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol/li"));
		act.dragAndDrop(src2, target2).build().perform();//or act.clickAndHold(src).release(target).build().perform();
		
		WebElement src3 = driver.findElement(By.xpath("//*[@id='credit1']/a")); //this inside value is obtained by inspect-->select element--->copy-->copy xpath
		WebElement target3 = driver.findElement(By.xpath("//*[@id='loan']/li"));
		act.dragAndDrop(src3, target3).build().perform();
		
		WebElement src4 = driver.findElement(By.xpath("//*[@id='fourth']/a")); 
		WebElement target4 = driver.findElement(By.xpath("//*[@id='amt8']/li"));
		act.dragAndDrop(src4, target4).build().perform();
		

	}

}

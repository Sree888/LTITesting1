package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;


public class WebTableTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php#");//we can also use this method instead of driver.get
		
		//fetch no of columns
		//xpath-->//*[@id='leftcontainer']/table/thead/tr/th[1]  1 is removed to select all rows
		List<WebElement> col = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("column size is :"+col.size());
		
		//fetch no of rows
		//*[@id='leftcontainer']/table/tbody/tr[1]
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("no of rows is: "+rows.size());
		
		//fetch specific data from cell
		////*[@id='leftcontainer']/table/tbody/tr[1]/td[2]
		String cell = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[2]")).getText();
		if(cell.equals("A")){
			System.out.println("Data validation is Success"); 
		}else{
			System.out.println("Data is incorrect");
			
		}
			
			//check which company is on Top
			
			String toplist=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]")).getText();
			System.out.println("Top company name is: "+toplist); 
			
			//fetch top 5 company list
			for(int i=1;i<=5;i++){
				String list=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]")).getText();
				System.out.println(list);
			
		}
			driver.close();

	}

}

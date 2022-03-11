package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.*;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open app
		driver.get("https://www.google.com/search?q=isl+table&rlz=1C1CHBD_enIN926IN926&oq=isl+table&aqs=chrome..69i57.8615j0j1&sourceid=chrome&ie=UTF-8#sie=lg;/g/11q2m_5yvk;2;/m/0ynr_sq;st;fp;1;;");
		//rows
		List<WebElement>  a1=driver.findElements(By.xpath("//*[@id='liveresults-sports-immersive__league-fullpage']/div/div[2]/div[2]/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div/div/div[1]/div/table/tbody/tr"));
		System.out.println(a1.size());
		
		for(int i=1;i<5;i++){
			String a2=driver.findElement(By.xpath("//*[@id='liveresults-sports-immersive__league-fullpage']/div/div[2]/div[2]/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div/div/div[1]/div/table/tbody/tr["+i+"]")).getText();
			System.out.println(a2);
		}
	}

}

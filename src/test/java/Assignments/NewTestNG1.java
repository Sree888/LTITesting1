package Assignments;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTestNG1 {
	WebDriver driver;
  @Test
  public void Testcase1() throws IOException {
	//Storing the links in a list and traversing through the links
    List<WebElement> links = driver.findElements(By.tagName("a"));
    // This line will print the number of links and the count of links.
    System.out.println("No of links are "+ links.size());
  //checking the links fetched.
    /*  for(int i=0;i<links.size();i++)
    {
        WebElement E1= links.get(i);
        String url= E1.getAttribute("href");
        verifyLinks(url);
    }
    
    
    

  }
  private void verifyLinks(String linkUrl) throws IOException {
	// TODO Auto-generated method stub
	  URL url = new URL(linkUrl);

      //Now we will be creating url connection and getting the response code
      HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
      httpURLConnect.setConnectTimeout(5000);
      httpURLConnect.connect();
      if(httpURLConnect.getResponseCode()>=400)
      {
      	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
      }    
 
      //Fetching and Printing the response code obtained
      else{
          System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
      }*/
}
@BeforeTest
  public void beforeTest() {
	//launch chromebrowser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreehari v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		//open application
		driver.get("http://demowebshop.tricentis.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

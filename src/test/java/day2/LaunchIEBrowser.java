package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\sreehari v\\Downloads\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		WebDriver obj=new InternetExplorerDriver();
		obj.close();

	}

}

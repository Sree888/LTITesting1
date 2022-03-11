package day5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGExercise1 {
  @Test
  public void Testcase1() {
	  System.out.println("Login TC-->Test1");
  }
  @Test
  public void Testcase2(){
	  System.out.println("Search product TC-->Test2");
  }
  @BeforeMethod //Equivalent to @Before in junit
  public void beforeMethod() {
	  System.out.println("chrome browser is launching and open application-->Beforemethod");
  }

  @AfterMethod  //Equivalent to @After in junit
  public void afterMethod() {
	  System.out.println("closing the application-->aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Chrome browser is launching and open application-->beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("closing application-->Execution of afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("chrome browser is launching and open application-->Execution of beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("closing application-->Execution of aftertest");
  }

}

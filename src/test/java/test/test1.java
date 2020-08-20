package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class test1 {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("test case1");
	  driver.get("http://demowebshop.tricentis.com");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
	  driver.close();
  }

}

package com.me.qa.automation.homework.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.me.qa.automation.homework.componenets.MyPropertiesHandler;


public abstract class BaseTest implements IBaseTest {

  public static WebDriver driver;
  
  public BaseTest() {
    driver = MyPropertiesHandler.getHandler().getWebDriver();
  }
  /**
   * Sets up the fixture for all tests.
   */
  @BeforeClass(alwaysRun = true)  
  public void setUp() {
  }   

  /**
   * Tears down the fixture for all tests.
   */
  @AfterMethod(alwaysRun = true)
  public void tearDown() {
      driver.quit();
      System.out.println("Web driver terminated");
  }
  
  
}

package com.me.qa.automation.homework.tests;

import org.testng.annotations.BeforeMethod;

import com.me.qa.automation.homework.componenets.Constants;


public class DriverInitTestBase extends BaseTest {

  @Override
  @BeforeMethod(alwaysRun = true)
  public void setUp() {
    
    driver.manage().window().maximize();
    driver.get(Constants.BASE_URL+Constants.LOGIN );
  }
  
  
}

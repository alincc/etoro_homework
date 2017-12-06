package com.me.qa.automation.homework.tests;

import org.junit.After;
import org.junit.Before;

public interface IBaseTest {
  
  @Before  
  void setUp();
  
  @After
  void tearDown();
  
}

package com.me.qa.automation.homework.componenets;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {

  protected WebDriver driver;
  
  public WebDriver getDriver() {
    return driver;
  }
  
  public String getText(String xpath) {
    return getText(By.xpath(xpath));
  }

  public String getText(By by) {
    String returnValue = "";
      returnValue = findElement(by, 10000).getText();
    return returnValue;
  }

  public WebElement findElement(final By by, int timeout) {
    Wait<WebDriver> wait = new WebDriverWait(driver, timeout);
    return wait.until(new ExpectedCondition<WebElement>() {

      public WebElement apply(WebDriver driver) {
        return ((WebDriver) driver).findElement(by);
      }
    });
  }
  
  public boolean verifyElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      // ok, swallow exception
    }
    return false;
  }

//  public void removeCrazyBunnerIfExists() {
//    try {
//      WebElement thisIsCrazyForTest = driver.findElement(By.className("inmplayer-popover-close-button"));
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      wait.until(ExpectedConditions.visibilityOf(thisIsCrazyForTest));
//      thisIsCrazyForTest.click();
//    } catch (Exception e) {
////      System.out.println("I don't want t o deal with this object now");
//    }
//  }

  public String getUrl () {
    return driver.getCurrentUrl();
  }
}

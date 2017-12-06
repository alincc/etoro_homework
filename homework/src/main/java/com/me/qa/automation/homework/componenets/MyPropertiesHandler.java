package com.me.qa.automation.homework.componenets;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyPropertiesHandler {
  
  
  private static final String CONFIG_FILE = "config.properties";
  private static final String BROWSER_TYPE = "DriverBuilder.browser";
  private static final String HUB_URL_PROPERTY = "DriverBuilder.hubUrl";

  private static MyPropertiesHandler handler = null;
  
  private String browser_type = "chrome";
  private String hubUrl;

  private MyPropertiesHandler() {
    reload();
  }

  public static MyPropertiesHandler getHandler() {
    if (handler == null) {
      handler = new MyPropertiesHandler();
    }
    return handler;
  }
  
  public void reload() {
    try {
      resetToDefault();      
      InputStream in = Thread.currentThread().getContextClassLoader()
          .getResourceAsStream(CONFIG_FILE);
      if (in == null) {
        // If no config file found
        System.out.println(CONFIG_FILE + " could not be found");
        return; 
      }
      Properties properties = new Properties();
      properties.load(in);
      browser_type = properties.getProperty(BROWSER_TYPE);
      hubUrl = properties.getProperty(HUB_URL_PROPERTY);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  
  public WebDriver getWebDriver() { 
    if (Browser.fromString(browser_type) == Browser.CHROME) {
      return getChromeDriver();
    }    
    if (Browser.fromString(browser_type) == Browser.FIREFOX) {
      return getFirefoxDriver();
    }
    // Should never get here
    return null;    
  }  
  private void resetToDefault() {
    browser_type = null;
    hubUrl = null;
  }

  private WebDriver getChromeDriver() {
    URL chromeDriverUrl = Thread.currentThread().getContextClassLoader().getResource(
        Constants.CHROMEDRIVER_EXE_LOCATION);
    if (chromeDriverUrl == null)
      throw new RuntimeException("Could not find chromedriver executable file. "
          + "Make sure file is placed under src/main/resources/chrome");
    System.setProperty(Constants.WEBDRIVER_CHROME_DRIVER, chromeDriverUrl.getPath());
    return new ChromeDriver();
  }

  private WebDriver getFirefoxDriver() {
    URL firefoxDriverUrl = Thread.currentThread().getContextClassLoader().getResource(
        Constants.FIREFOXDRIVER_EXE_LOCATION);
    if (firefoxDriverUrl == null)
      throw new RuntimeException("Could not find geckodriver executable file. "
          + "Make sure file is placed under src/main/resources/firefox");
    System.setProperty(Constants.WEBDRIVER_FIREFOX_DRIVER, firefoxDriverUrl.getPath());
    return new ChromeDriver();
  }
  
  public String getBrowserType() {
    return browser_type;
  }
  
  public String getHubUrl() {
    return hubUrl;
  }
}

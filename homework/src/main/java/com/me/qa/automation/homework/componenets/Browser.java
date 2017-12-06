package com.me.qa.automation.homework.componenets;


public enum Browser {  
  FIREFOX("firefox"), 
  CHROME("chrome");

  private final String browser;
  
  private Browser(String browser) {
    this.browser = browser; 
  }
  
  public String getBrowser() {
    return browser;
  } 
  
  public static Browser fromString(String browserName) {
    if (browserName != null) {
      for (Browser browser : Browser.values()) {
        if (browserName.equalsIgnoreCase(browser.browser)) {
          return browser;
        }
      }      
    }
    return null;
  }
}

package com.me.qa.automation.homework.tests;

import org.testng.annotations.Test;

import com.me.qa.automation.homework.componenets.Constants;
import com.me.qa.automation.homework.pages.EtoroHomePage;
import com.me.qa.automation.homework.pages.EtoroLoginPage;
import com.me.qa.automation.homework.pages.EtoroMarketPage;

public class MyTest extends DriverInitTestBase {


  private static final double STOP_VALUE = 1000.00;
  private static final String BTC = "BTC";

  @Test
  public void testHomework() throws InterruptedException {
    EtoroLoginPage login = new EtoroLoginPage(driver);
    login.setStaySignedIn1PasswordField(Constants.USER_NAME);
    login.setStaySignedIn2PasswordField(Constants.PASSWORD);
    login.submit();
    EtoroHomePage home = new EtoroHomePage(driver);
    home.verifyPageLoaded();
    home.searchMarket(BTC);
    EtoroMarketPage market = new EtoroMarketPage(driver);
    market.clickTradeButton();
    market.clickPlusLinkTillLossLowerThen(STOP_VALUE);
    market.clickMinusLinkTillMinPosMessage();
  }

}

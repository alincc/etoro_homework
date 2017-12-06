package com.me.qa.automation.homework.pages;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.me.qa.automation.homework.componenets.WebDriverHelper;

public class EtoroHomePage extends WebDriverHelper{
  private Map<String, String> data;
  private WebDriver driver;
  private int timeout = 15;

  @FindBy(css = "a.drop-select-box-option.add")
  @CacheLookup
  private WebElement addMarkets;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.drop-select-box a:nth-of-type(1)")
  @CacheLookup
  private WebElement all;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.drop-select-box a:nth-of-type(3)")
  @CacheLookup
  private WebElement commodities;

  @FindBy(css = "a.uncomplete-button.button-standard.button-blue.ng-scope")
  @CacheLookup
  private WebElement completeProfile;

  @FindBy(
      css = "-wrapper.mid-cells-list-view.ng-scope div:nth-of-type(4) div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(3) div..clear-after copy-button.ng-isolate-scope button.ng-binding.button-standard.copy.button-blue")
  @CacheLookup
  private WebElement copy;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(1) div.ng-scope div.a-menu.closed.ng-scope div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(5)")
  @CacheLookup
  private WebElement copyPeople;

  @FindBy(css = "a.drop-select-box-option.pointer.create-new-list.ng-isolate-scope")
  @CacheLookup
  private WebElement createNewList;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.drop-select-box a:nth-of-type(7)")
  @CacheLookup
  private WebElement crypto;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.drop-select-box a:nth-of-type(2)")
  @CacheLookup
  private WebElement currencies;

  @FindBy(css = "a.drop-select-box-option.ng-hide")
  @CacheLookup
  private WebElement deleteWatchlist;

  @FindBy(css = "a.e-btn-big-2.blue.ng-binding")
  @CacheLookup
  private WebElement depositFunds;

  @FindBy(css = "a.table-row.empty.ng-scope")
  @CacheLookup
  private WebElement discoverPeople;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) a:nth-of-type(1)")
  @CacheLookup
  private WebElement done1;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) a:nth-of-type(2)")
  @CacheLookup
  private WebElement done2;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.drop-select-box a:nth-of-type(6)")
  @CacheLookup
  private WebElement etfs;

  @FindBy(css = "a.i-menu-link.pointer.help.ng-scope")
  @CacheLookup
  private WebElement guide;

  @FindBy(css = "a[href='/learn-more']")
  @CacheLookup
  private WebElement help;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.drop-select-box a:nth-of-type(4)")
  @CacheLookup
  private WebElement indices;

  @FindBy(
      css = "-wrapper.mid-cells-list-view.ng-scope div:nth-of-type(4) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(3) div..clear-after copy-button.ng-isolate-scope button.ng-binding.button-standard.copy.button-blue")
  @CacheLookup
  private WebElement invest;

  @FindBy(css = "a[href='/discover/funds']")
  @CacheLookup
  private WebElement investInCopyfundsNew;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(1) div.ng-scope div.a-menu.closed.ng-scope div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(7)")
  @CacheLookup
  private WebElement inviteFriends;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(3) div.drop-select-box a:nth-of-type(4)")
  @CacheLookup
  private WebElement launchProcharts;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(1) div.ng-scope div.a-menu.closed.ng-scope div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(12)")
  @CacheLookup
  private WebElement logout;

  @FindBy(id = "toggle")
  @CacheLookup
  private WebElement menu;

  @FindBy(css = "a[href='/watchlists/c1732792-16b8-48ef-b4f3-8a0b22074452']")
  @CacheLookup
  private WebElement myWatchlist;

  @FindBy(css = "a[href='/feed']")
  @CacheLookup
  private WebElement newsFeed;

  @FindBy(css = "a.drop-select-box-option.pointer.one-click-trading")
  @CacheLookup
  private WebElement oneClickTrading;

  private final String pageLoadedText = "toggleNotificatons($event)\" data-etoro-locale-ns=\"socialNotifications\">";

  private final String pageUrl = "/watchlists";

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.drop-select-box a:nth-of-type(8)")
  @CacheLookup
  private WebElement people;

  @FindBy(css = "a[href='/app/portfolio-page']")
  @CacheLookup
  private WebElement portfolio;

  @FindBy(css = "a.drop-select-box-option.edit.ng-scope")
  @CacheLookup
  private WebElement rearrangeremove;

  @FindBy(css = "a[href='/watchlists/1c5f5ad9-1428-4a64-bce1-c6c75189118e']")
  @CacheLookup
  private WebElement recentlyInvested;

  @FindBy(css = "input.w-search-input.ng-pristine.ng-untouched.ng-valid.ng-isolate-scope.ng-empty")
  @CacheLookup
  private WebElement searchForAMarketsSymbolOr;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(3) div.drop-select-box a:nth-of-type(6)")
  @CacheLookup
  private WebElement setAsDefault;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(3) div.drop-select-box a:nth-of-type(5)")
  @CacheLookup
  private WebElement setPriceAlerts;

  @FindBy(css = "a[href='/settings/general']")
  @CacheLookup
  private WebElement settings;

  @FindBy(css = "a[href='/watchlists/all']")
  @CacheLookup
  private WebElement showAll;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.drop-select-box a:nth-of-type(5)")
  @CacheLookup
  private WebElement stocks;

  @FindBy(css = "a.i-menu-user-username.pointer.ng-binding")
  @CacheLookup
  private WebElement torotested;

  @FindBy(css = "a[href='/discover/markets']")
  @CacheLookup
  private WebElement tradeMarkets;

  @FindBy(css = "a.i-menu-link.active")
  @CacheLookup
  private WebElement watchlist;

  @FindBy(
      css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(1) div.ng-scope div.a-menu.closed.ng-scope div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(10)")
  @CacheLookup
  private WebElement withdrawFunds;

  public EtoroHomePage() {}

  public EtoroHomePage(WebDriver driver) {
    this();
    PageFactory.initElements(driver, this);
    this.driver = driver;
  }

  public EtoroHomePage(WebDriver driver, Map<String, String> data) {
    this(driver);
    PageFactory.initElements(driver, this);
    this.data = data;
  }

  public EtoroHomePage(WebDriver driver, Map<String, String> data, int timeout) {
    this(driver, data);
    PageFactory.initElements(driver, this);
    this.timeout = timeout;
  }

  /**
   * Click on Add Markets Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickAddMarketsLink() {
    addMarkets.click();
    return this;
  }

  /**
   * Click on All Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickAllLink() {
    all.click();
    return this;
  }

  /**
   * Click on Commodities Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickCommoditiesLink() {
    commodities.click();
    return this;
  }

  /**
   * Click on Complete Profile Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickCompleteProfileLink() {
    completeProfile.click();
    return this;
  }

  /**
   * Click on Copy Button.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickCopyButton() {
    copy.click();
    return this;
  }

  /**
   * Click on Copy People Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickCopyPeopleLink() {
    copyPeople.click();
    return this;
  }

  /**
   * Click on Create New List Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickCreateNewListLink() {
    createNewList.click();
    return this;
  }

  /**
   * Click on Crypto Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickCryptoLink() {
    crypto.click();
    return this;
  }

  /**
   * Click on Currencies Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickCurrenciesLink() {
    currencies.click();
    return this;
  }

  /**
   * Click on Delete Watchlist Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickDeleteWatchlistLink() {
    deleteWatchlist.click();
    return this;
  }

  /**
   * Click on Deposit Funds Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickDepositFundsLink() {
    depositFunds.click();
    return this;
  }

  /**
   * Click on Discover People Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickDiscoverPeopleLink() {
    discoverPeople.click();
    return this;
  }

  /**
   * Click on Done Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickDone1Link() {
    done1.click();
    return this;
  }

  /**
   * Click on Done Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickDone2Link() {
    done2.click();
    return this;
  }

  /**
   * Click on Etfs Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickEtfsLink() {
    etfs.click();
    return this;
  }

  /**
   * Click on Guide Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickGuideLink() {
    guide.click();
    return this;
  }

  /**
   * Click on Help Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickHelpLink() {
    help.click();
    return this;
  }

  /**
   * Click on Indices Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickIndicesLink() {
    indices.click();
    return this;
  }

  /**
   * Click on Invest Button.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickInvestButton() {
    invest.click();
    return this;
  }

  /**
   * Click on Invest In Copyfunds New Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickInvestInCopyfundsNewLink() {
    investInCopyfundsNew.click();
    return this;
  }

  /**
   * Click on Invite Friends Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickInviteFriendsLink() {
    inviteFriends.click();
    return this;
  }

  /**
   * Click on Launch Procharts Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickLaunchProchartsLink() {
    launchProcharts.click();
    return this;
  }

  /**
   * Click on Logout Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickLogoutLink() {
    logout.click();
    return this;
  }

  /**
   * Click on Menu Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickMenuLink() {
    menu.click();
    return this;
  }

  /**
   * Click on My Watchlist Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickMyWatchlistLink() {
    myWatchlist.click();
    return this;
  }

  /**
   * Click on News Feed Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickNewsFeedLink() {
    newsFeed.click();
    return this;
  }

  /**
   * Click on One Click Trading Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickOneClickTradingLink() {
    oneClickTrading.click();
    return this;
  }

  /**
   * Click on People Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickPeopleLink() {
    people.click();
    return this;
  }

  /**
   * Click on Portfolio Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickPortfolioLink() {
    portfolio.click();
    return this;
  }

  /**
   * Click on Rearrangeremove Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickRearrangeremoveLink() {
    rearrangeremove.click();
    return this;
  }

  /**
   * Click on Recently Invested Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickRecentlyInvestedLink() {
    recentlyInvested.click();
    return this;
  }

  /**
   * Click on Set As Default Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickSetAsDefaultLink() {
    setAsDefault.click();
    return this;
  }

  /**
   * Click on Set Price Alerts Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickSetPriceAlertsLink() {
    setPriceAlerts.click();
    return this;
  }

  /**
   * Click on Settings Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickSettingsLink() {
    settings.click();
    return this;
  }

  /**
   * Click on Show All Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickShowAllLink() {
    showAll.click();
    return this;
  }

  /**
   * Click on Stocks Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickStocksLink() {
    stocks.click();
    return this;
  }

  /**
   * Click on Torotested Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickTorotestedLink() {
    torotested.click();
    return this;
  }

  /**
   * Click on Trade Markets Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickTradeMarketsLink() {
    tradeMarkets.click();
    return this;
  }

  /**
   * Click on Watchlist Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickWatchlistLink() {
    watchlist.click();
    return this;
  }

  /**
   * Click on Withdraw Funds Link.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage clickWithdrawFundsLink() {
    withdrawFunds.click();
    return this;
  }

  /**
   * Fill every fields in the page.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage fill() {
    setSearchForAMarketsSymbolOrTextField();
    return this;
  }

  /**
   * Fill every fields in the page and submit it to target page.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage fillAndSubmit() {
    fill();
    return submit();
  }

  /**
   * Set default value to Search For A Markets Symbol Or Name Aapl Or Apple Or An Investors Name
   * Text field.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage setSearchForAMarketsSymbolOrTextField() {
    return setSearchForAMarketsSymbolOrTextField(data.get("SEARCH_FOR_A_MARKETS_SYMBOL_OR"));
  }

  /**
   * Set value to Search For A Markets Symbol Or Name Aapl Or Apple Or An Investors Name Text field.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage setSearchForAMarketsSymbolOrTextField(String searchForAMarketsSymbolOrValue) {
    searchForAMarketsSymbolOr.sendKeys(searchForAMarketsSymbolOrValue);
    return this;
  }

  public EtoroHomePage searchMarket(String searchForAMarketsSymbolOrValue) {
//    removeCrazyBunnerIfExists();
    searchForAMarketsSymbolOr.sendKeys(searchForAMarketsSymbolOrValue);
    searchForAMarketsSymbolOr.sendKeys(Keys.RETURN);
//    searchForAMarketsSymbolOr.sendKeys(Keys.ENTER);
    return this;
  }

  /**
   * Submit the form to target page.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage submit() {
    clickInvestButton();
    return this;
  }

  /**
   * Verify that the page loaded completely.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage verifyPageLoaded() {
    (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
      public Boolean apply(WebDriver d) {
        return d.getPageSource().contains(pageLoadedText);
      }
    });
    return this;
  }

  /**
   * Verify that current page URL matches the expected URL.
   *
   * @return the etoroHomePage class instance.
   */
  public EtoroHomePage verifyPageUrl() {
    (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
      public Boolean apply(WebDriver d) {
        return d.getCurrentUrl().contains(pageUrl);
      }
    });
    return this;
  }
}

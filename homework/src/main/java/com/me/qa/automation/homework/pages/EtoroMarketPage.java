package com.me.qa.automation.homework.pages;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.me.qa.automation.homework.componenets.WebDriverHelper;

public class EtoroMarketPage extends WebDriverHelper {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a.drop-select-box-option.pointer.ng-isolate-scope")
    @CacheLookup
    private WebElement addToNewList;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) market.ng-scope.ng-isolate-scope div.p-instrument.market-page.ng-scope div.user-head ui-breadcrumbs.ng-isolate-scope ul.user-head-breadcrumbs li:nth-of-type(3) a.i-i-bc-a")
    @CacheLookup
    private WebElement btc;

    @FindBy(css = "a.i-instrument-navigation-item.e-link.pointer.chart")
    @CacheLookup
    private WebElement chart;

    @FindBy(css = "a.uncomplete-button.button-standard.button-blue.ng-scope")
    @CacheLookup
    private WebElement completeProfile;

    @FindBy(css = "a[href='/discover/people']")
    @CacheLookup
    private WebElement copyPeople;

    @FindBy(xpath = "//*[@id=\"open-position-view\"]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[2]")
    @CacheLookup
    private WebElement plus;
    
    @FindBy(xpath = "//*[@id=\"open-position-view\"]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[1]/span")
    @CacheLookup
    private WebElement minus;
    
    @FindBy(css = "#open-position-view > div.execution-main > div > div.tab-box-wrapper.ng-scope > tabs > div.tab-box.execution-start > div:nth-child(2) > tabstitles > tabtitle:nth-child(1) > a > div.box-tab-value.negative.ng-binding.ng-scope")
    @CacheLookup
    private WebElement stopLossValue;
    
    @FindBy(xpath = "//*[@id=\"open-position-view\"]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/comment()[8]")
    @CacheLookup
    private WebElement minPosSizeMessage;
    
    @FindBy(css = "a[href='/discover/markets/cryptocurrencies']")
    @CacheLookup
    private WebElement crypto;

    @FindBy(css = "a.e-btn-big-2.blue.ng-binding")
    @CacheLookup
    private WebElement depositFunds;

    @FindBy(css = "a.i-instrument-navigation-item.e-link.pointer.feed")
    @CacheLookup
    private WebElement feed;

    @FindBy(css = "a.i-menu-link.pointer.help.ng-scope")
    @CacheLookup
    private WebElement guide;

    @FindBy(css = "a[href='/learn-more']")
    @CacheLookup
    private WebElement help;

    @FindBy(css = "a[href='/discover/funds']")
    @CacheLookup
    private WebElement investInCopyfundsNew;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(1) div.ng-scope div.a-menu.closed.ng-scope div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(7)")
    @CacheLookup
    private WebElement inviteFriends;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(1) div.ng-scope div.a-menu.closed.ng-scope div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(12)")
    @CacheLookup
    private WebElement logout;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(2) market.ng-scope.ng-isolate-scope div.p-instrument.market-page.ng-scope div.user-head ui-breadcrumbs.ng-isolate-scope ul.user-head-breadcrumbs li:nth-of-type(1) a.i-i-bc-a")
    @CacheLookup
    private WebElement markets;

    @FindBy(css = "a.i-stock-chart-info.ng-hide")
    @CacheLookup
    private WebElement myInvestmentIn;

    @FindBy(css = "a.drop-select-box-option.pointer.ng-binding.ng-scope.checked")
    @CacheLookup
    private WebElement myWatchlist;

    @FindBy(css = "a[href='/feed']")
    @CacheLookup
    private WebElement newsFeed;

    private final String pageLoadedText = "0\" class=\"e-notification-bubble ng-binding ng-scope\">1";

    private final String pageUrl = "/markets/btc/stats";

    @FindBy(css = "a[href='/app/portfolio-page']")
    @CacheLookup
    private WebElement portfolio;

    @FindBy(css = "a.drop-select-box-option.pointer.ng-binding.ng-scope.ng-hide")
    @CacheLookup
    private WebElement recentlyInvested;

    @FindBy(css = "a.i-instrument-navigation-item.e-link.pointer.research")
    @CacheLookup
    private WebElement research;

    @FindBy(css = "input.w-search-input.ng-valid.ng-isolate-scope.ng-dirty.ng-touched.ng-empty")
    @CacheLookup
    private WebElement searchForAMarketsSymbolOr;

    @FindBy(css = "a[href='/settings/general']")
    @CacheLookup
    private WebElement settings;

    @FindBy(css = "a.i-instrument-navigation-item.e-link.pointer.stats-list.active")
    @CacheLookup
    private WebElement stats;

    @FindBy(css = "a.i-menu-user-username.pointer.ng-binding")
    @CacheLookup
    private WebElement torotested;

    @FindBy(css = "button.ng-scope.button-standard.button-blue.head-action-button")
    @CacheLookup
    private WebElement trade;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(1) div.ng-scope div.a-menu.closed.ng-scope div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(4)")
    @CacheLookup
    private WebElement tradeMarkets;

    @FindBy(css = "a[href='/watchlists']")
    @CacheLookup
    private WebElement watchlist;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope div:nth-of-type(1) div.ng-scope div.a-menu.closed.ng-scope div:nth-of-type(2) div:nth-of-type(1) a:nth-of-type(10)")
    @CacheLookup
    private WebElement withdrawFunds;

    public EtoroMarketPage() {
    }

    public EtoroMarketPage(WebDriver driver) {
        this();
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public EtoroMarketPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        PageFactory.initElements(driver, this);
        this.data = data;
    }

    public EtoroMarketPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        PageFactory.initElements(driver, this);
        this.timeout = timeout;
    }

    /**
     * Click on Add To New List Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickAddToNewListLink() {
        addToNewList.click();
        return this;
    }

    /**
     * Click on Btc Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickBtcLink() {
        btc.click();
        return this;
    }

    public EtoroMarketPage clickPlusLink() {
//      removeCrazyBunnerIfExists();
      plus.click();
      return this;
    }

    public EtoroMarketPage clickMinusLink() {
//      removeCrazyBunnerIfExists();
      minus.click();
      return this;
    }
    
    public String getStopLossValueLink() {
//      removeCrazyBunnerIfExists();
      return stopLossValue.getText().substring(2);
    }

    public boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      }
    catch (org.openqa.selenium.NoSuchElementException e) {
        return false;
      }
    }
    
    public boolean checkVisibilityOfMinPosMsg() {
//      removeCrazyBunnerIfExists();
//      return minPosSizeMessage.isEnabled();
    String xpath = "//*[@id=\"open-position-view\"]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/comment()[8]";
    return isElementPresent(By.xpath(xpath));
    }
    
    public EtoroMarketPage clickPlusLinkTillLossLowerThen(double stopValue){
      double currentValue = Double.valueOf(getStopLossValueLink());
      while (currentValue>=stopValue){
        clickPlusLink();
        currentValue = Double.valueOf(getStopLossValueLink());
      }
      return this;
    }

    public EtoroMarketPage clickMinusLinkTillMinPosMessage(){

      boolean currentValue = checkVisibilityOfMinPosMsg();
      while (!currentValue){
        clickMinusLink();
        currentValue = checkVisibilityOfMinPosMsg();
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      return this;
    }
    /**
     * Click on Chart Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickChartLink() {
        chart.click();
        return this;
    }

    /**
     * Click on Complete Profile Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickCompleteProfileLink() {
        completeProfile.click();
        return this;
    }

    /**
     * Click on Copy People Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickCopyPeopleLink() {
        copyPeople.click();
        return this;
    }

    /**
     * Click on Crypto Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickCryptoLink() {
        crypto.click();
        return this;
    }

    /**
     * Click on Deposit Funds Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickDepositFundsLink() {
        depositFunds.click();
        return this;
    }

    /**
     * Click on Feed Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickFeedLink() {
        feed.click();
        return this;
    }

    /**
     * Click on Guide Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickGuideLink() {
        guide.click();
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickHelpLink() {
        help.click();
        return this;
    }

    /**
     * Click on Invest In Copyfunds New Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickInvestInCopyfundsNewLink() {
        investInCopyfundsNew.click();
        return this;
    }

    /**
     * Click on Invite Friends Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickInviteFriendsLink() {
        inviteFriends.click();
        return this;
    }

    /**
     * Click on Logout Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickLogoutLink() {
        logout.click();
        return this;
    }

    /**
     * Click on Markets Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickMarketsLink() {
        markets.click();
        return this;
    }

    /**
     * Click on My Investment In Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickMyInvestmentInLink() {
        myInvestmentIn.click();
        return this;
    }

    /**
     * Click on My Watchlist Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickMyWatchlistLink() {
        myWatchlist.click();
        return this;
    }

    /**
     * Click on News Feed Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickNewsFeedLink() {
        newsFeed.click();
        return this;
    }

    /**
     * Click on Portfolio Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickPortfolioLink() {
        portfolio.click();
        return this;
    }

    /**
     * Click on Recently Invested Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickRecentlyInvestedLink() {
        recentlyInvested.click();
        return this;
    }

    /**
     * Click on Research Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickResearchLink() {
        research.click();
        return this;
    }

    /**
     * Click on Settings Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickSettingsLink() {
        settings.click();
        return this;
    }

    /**
     * Click on Stats Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickStatsLink() {
        stats.click();
        return this;
    }

    /**
     * Click on Torotested Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickTorotestedLink() {
        torotested.click();
        return this;
    }

    /**
     * Click on Trade Button.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickTradeButton() {

      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOf(trade));
//      removeCrazyBunnerIfExists();
      try {
          trade.click();
        } catch (Exception e) {
          Actions action = new Actions(driver);
          action.moveToElement(trade).perform();
          action.moveToElement(trade).click().perform();
        }
        return this;
    }

    /**
     * Click on Trade Markets Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickTradeMarketsLink() {
        tradeMarkets.click();
        return this;
    }

    /**
     * Click on Watchlist Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickWatchlistLink() {
        watchlist.click();
        return this;
    }

    /**
     * Click on Withdraw Funds Link.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage clickWithdrawFundsLink() {
        withdrawFunds.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage fill() {
        setSearchForAMarketsSymbolOrTextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Search For A Markets Symbol Or Name Aapl Or Apple Or An Investors Name Text field.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage setSearchForAMarketsSymbolOrTextField() {
        return setSearchForAMarketsSymbolOrTextField(data.get("SEARCH_FOR_A_MARKETS_SYMBOL_OR"));
    }

    /**
     * Set value to Search For A Markets Symbol Or Name Aapl Or Apple Or An Investors Name Text field.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage setSearchForAMarketsSymbolOrTextField(String searchForAMarketsSymbolOrValue) {
        searchForAMarketsSymbolOr.sendKeys(searchForAMarketsSymbolOrValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage submit() {
        clickTradeButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage verifyPageLoaded() {
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
     * @return the etoroMarketPage class instance.
     */
    public EtoroMarketPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

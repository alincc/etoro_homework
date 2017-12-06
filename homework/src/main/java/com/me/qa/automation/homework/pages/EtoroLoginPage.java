package com.me.qa.automation.homework.pages;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EtoroLoginPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope header.a-header.-head-grad div.w-head-buttons-ph language-picker.ng-isolate-scope div.pointer.dropdown-menu div.drop-select-box a:nth-of-type(4)")
    @CacheLookup
    private WebElement deutsch;

    @FindBy(css = "a.w-login-sign-up.e-link")
    @CacheLookup
    private WebElement dontHaveAnAccountSignUp;

    @FindBy(css = "a.e-drop-label")
    @CacheLookup
    private WebElement english1;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope header.a-header.-head-grad div.w-head-buttons-ph language-picker.ng-isolate-scope div.pointer.dropdown-menu div.drop-select-box a:nth-of-type(1)")
    @CacheLookup
    private WebElement english2;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope header.a-header.-head-grad div.w-head-buttons-ph language-picker.ng-isolate-scope div.pointer.dropdown-menu div.drop-select-box a:nth-of-type(2)")
    @CacheLookup
    private WebElement espaol;

    @FindBy(css = "button.sign-up-button.facebook-button.ng-scope")
    @CacheLookup
    private WebElement facebook;

    @FindBy(css = "a[href='/accounts/forgot-password']")
    @CacheLookup
    private WebElement forgotPassword;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope header.a-header.-head-grad div.w-head-buttons-ph language-picker.ng-isolate-scope div.pointer.dropdown-menu div.drop-select-box a:nth-of-type(7)")
    @CacheLookup
    private WebElement franais;

    @FindBy(css = "button.sign-up-button.google-button.ng-scope")
    @CacheLookup
    private WebElement google;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope header.a-header.-head-grad div.w-head-buttons-ph language-picker.ng-isolate-scope div.pointer.dropdown-menu div.drop-select-box a:nth-of-type(3)")
    @CacheLookup
    private WebElement italiano;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope header.a-header.-head-grad div.w-head-buttons-ph language-picker.ng-isolate-scope div.pointer.dropdown-menu div.drop-select-box a:nth-of-type(11)")
    @CacheLookup
    private WebElement nederlands;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope header.a-header.-head-grad div.w-head-buttons-ph language-picker.ng-isolate-scope div.pointer.dropdown-menu div.drop-select-box a:nth-of-type(12)")
    @CacheLookup
    private WebElement norsk;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope header.a-header.-head-grad div.w-head-buttons-ph language-picker.ng-isolate-scope div.pointer.dropdown-menu div.drop-select-box a:nth-of-type(5)")
    @CacheLookup
    private WebElement p;

    private final String pageLoadedText = "";

    private final String pageUrl = "/login";

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope header.a-header.-head-grad div.w-head-buttons-ph language-picker.ng-isolate-scope div.pointer.dropdown-menu div.drop-select-box a:nth-of-type(10)")
    @CacheLookup
    private WebElement polski;

    @FindBy(css = "ui-layout.ng-isolate-scope div.ng-scope div.ng-scope header.a-header.-head-grad div.w-head-buttons-ph language-picker.ng-isolate-scope div.pointer.dropdown-menu div.drop-select-box a:nth-of-type(13)")
    @CacheLookup
    private WebElement portugus;

    @FindBy(css = "button.e-btn-big.wide.dark.pointer")
    @CacheLookup
    private WebElement signIn;

    @FindBy(id = "username")
    @CacheLookup
    private WebElement staySignedIn1;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement staySignedIn2;

    @FindBy(id = "CB")
    @CacheLookup
    private WebElement staySignedIn3;

    public EtoroLoginPage() {
    }

    public EtoroLoginPage(WebDriver driver) {
        this();
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public EtoroLoginPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        PageFactory.initElements(driver, this);
        this.data = data;
    }

    public EtoroLoginPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        PageFactory.initElements(driver, this);
        this.timeout = timeout;
    }

    /**
     * Click on Deutsch Link.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickDeutschLink() {
        deutsch.click();
        return this;
    }

    /**
     * Click on Dont Have An Account Sign Up Now Link.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickDontHaveAnAccountSignUpLink() {
        dontHaveAnAccountSignUp.click();
        return this;
    }

    /**
     * Click on English Link.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickEnglish1Link() {
        english1.click();
        return this;
    }

    /**
     * Click on English Link.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickEnglish2Link() {
        english2.click();
        return this;
    }

    /**
     * Click on Espaol Link.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickEspaolLink() {
        espaol.click();
        return this;
    }

    /**
     * Click on Facebook Button.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickFacebookButton() {
        facebook.click();
        return this;
    }

    /**
     * Click on Forgot Password Link.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickForgotPasswordLink() {
        forgotPassword.click();
        return this;
    }

    /**
     * Click on Franais Link.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickFranaisLink() {
        franais.click();
        return this;
    }

    /**
     * Click on Google Button.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickGoogleButton() {
        google.click();
        return this;
    }

    /**
     * Click on Italiano Link.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickItalianoLink() {
        italiano.click();
        return this;
    }

    /**
     * Click on Nederlands Link.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickNederlandsLink() {
        nederlands.click();
        return this;
    }

    /**
     * Click on Norsk Link.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickNorskLink() {
        norsk.click();
        return this;
    }

    /**
     * Click on P Link.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickPLink() {
        p.click();
        return this;
    }

    /**
     * Click on Polski Link.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickPolskiLink() {
        polski.click();
        return this;
    }

    /**
     * Click on Portugus Link.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickPortugusLink() {
        portugus.click();
        return this;
    }

    /**
     * Click on Sign In Button.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage clickSignInButton() {
        signIn.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage fill() {
        setStaySignedIn1PasswordField();
        setStaySignedIn2PasswordField();
        setStaySignedIn3CheckboxField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Stay Signed In Password field.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage setStaySignedIn1PasswordField() {
        return setStaySignedIn1PasswordField(data.get("STAY_SIGNED_IN_1"));
    }

    /**
     * Set value to Stay Signed In Password field.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage setStaySignedIn1PasswordField(String staySignedIn1Value) {
        staySignedIn1.sendKeys(staySignedIn1Value);
        return this;
    }

    /**
     * Set default value to Stay Signed In Password field.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage setStaySignedIn2PasswordField() {
        return setStaySignedIn2PasswordField(data.get("STAY_SIGNED_IN_2"));
    }

    /**
     * Set value to Stay Signed In Password field.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage setStaySignedIn2PasswordField(String staySignedIn2Value) {
        staySignedIn2.sendKeys(staySignedIn2Value);
        return this;
    }

    /**
     * Set Stay Signed In Checkbox field.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage setStaySignedIn3CheckboxField() {
        if (!staySignedIn3.isSelected()) {
            staySignedIn3.click();
        }
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage submit() {
        clickSignInButton();
        return this;
    }

    /**
     * Unset Stay Signed In Checkbox field.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage unsetStaySignedIn3CheckboxField() {
        if (staySignedIn3.isSelected()) {
            staySignedIn3.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage verifyPageLoaded() {
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
     * @return the etoroLoginPage class instance.
     */
    public EtoroLoginPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

package sportsBetting.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import com.cucumber.listener.Reporter;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.yaml.snakeyaml.scanner.Constant;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class SBCashierPage extends BasePage {

    public SBCashierPage(WebDriver driver) {
        super(driver);
    }

    protected WebElement element = null;

    @FindBy(how = How.ID, using = "closePopup")
    protected WebElement closeAdPopup;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Cashier')]")
    protected WebElement elmtCashierTab;

    @FindBy(how = How.CSS, using = "a.simple-close-button")
    protected WebElement btnExitCashier;


    @FindBy(how = How.XPATH, using = "//a[@id='leave']")
    protected WebElement btnConfirmExitCashier;

    @FindBy(how = How.ID, using = "showDepositMethods")
    protected WebElement lnkViewMoreOptions;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'skrill')]/parent::em/following-sibling::strong[.='Skrill']")
    protected WebElement emntVerifyDepositOptions;

    //@FindBy(how = How.XPATH, using = "//div[@class='cashier-paymentoptions']//span/parent::em/following-sibling::strong")
    @FindBy(how = How.XPATH, using = "//div[@id='btn-circle-wrapper']//strong")
    protected List<WebElement> elmntPaymentOptionsList;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//iframe[@id='cashierFrame']"),
            @FindBy(how = How.XPATH, using = "//iframe[@id='iframeCashier']")

    })
    protected WebElement elmntCashierIFrame;

    @FindBy(how = How.CSS, using = "span.icon-whitepayment-creditcard")
    protected WebElement lnkCreditCard;

    @FindBy(how = How.XPATH, using = "//input[@id='CardExpiry']")
    protected WebElement emntVerifyCreditCardPage;

    @FindBy(how = How.CSS, using = "button.simple-close-button--back")
    protected WebElement elmtBackButtonInCreditCardPage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='Withdrawal']"),
            @FindBy(how = How.XPATH, using = "//div[@id='content-ep']//button[contains(.,'Withdrawal')]")
    })
    protected WebElement lnkWithdrawal;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Withdrawal Request']")
    protected WebElement elmntWithDrawlRequestHeader;

    @FindBy(how = How.XPATH, using = "//form[@id='requestForm']")
    protected WebElement elmntWithDrawalRequestForm;

    @FindBy(how = How.XPATH, using = "//a/strong[.='Request New']")
    protected WebElement elmntRequestNewInWithdrawlOptions;

    @FindBy(how = How.XPATH, using = "//button[.='Deposit']")  //Desktop
    protected WebElement btnDeposit;

    @FindBy(how = How.XPATH, using = "//a[.='Withdrawal']")  //Deposit
    protected WebElement btnWithdrawal;

    @FindBy(how = How.XPATH, using = "//p[contains(., 'SportsBetting Live Help')]")  //Desktop
    protected WebElement lnkSportsBettingLiveHelp;

    @FindBy(how = How.XPATH, using = "//a[contains(., 'Learn More')]")  //Desktop
    protected WebElement lnkClickHereToLearnMore;

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'close-button')]")  //Desktop
    protected WebElement lnkCloseCashier;

    @FindBy(how = How.XPATH, using = "//button[contains(., '?')]")  //Desktop
    protected WebElement btnHelpCashier;

    @FindBy(how = How.XPATH, using = "//strong[.='Bitcoin']/ancestor::a")  //Desktop
    protected WebElement lnkBitcoinTab;

    @FindBy(how = How.XPATH, using = "//strong[.='Credit Card']/ancestor::a")  //Desktop
    protected WebElement lnkCreditCardTab;

    protected String lnkCashierMoreTab = new StringBuilder()  //Desktop
            .append("//strong[.='")
            .append("<<TABNAME>>")
            .append("']/parent::a").toString();

    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'View')]/following::div[2]/descendant::a/descendant::strong")
    //Desktop
    protected List<WebElement> lnkCashirDepositMoreTabs;

    @FindBy(how = How.XPATH, using = "//button[contains(@class, 'depositoptions')]")
    protected List<WebElement> btnBitcoinMoreDepositOptions;

    @FindBy(how = How.XPATH, using = "//h2[.='Bitcoin']")
    protected WebElement txtBitcoinTab;

    @FindBy(how = How.XPATH, using = "//a[contains(text() , 'View')]")
    protected WebElement lnkPromoCodesTab;

    @FindBy(how = How.XPATH, using = "//a[@class='collapsed']/descendant::em")
    protected List<WebElement> lnkPromoCodesVerify;

    @FindBy(how = How.XPATH, using = "(//h5/descendant::a)[1]")
    protected WebElement txtPopUpVerify;

    protected String lnkPopUpOptions = new StringBuilder()
            .append("(//a/strong)[")
            .append("<<intNumber>>")
            .append("]")
            .toString();

    protected String btnSelectBonus = new StringBuilder()
            .append("(//button[contains(@class, 'bonus')])[")
            .append("<<intNumber>>")
            .append("]")
            .toString();

    @FindBy(how = How.XPATH, using = "//input[@id='PromoID']")
    protected WebElement elmntPromoEntered;

    @FindBy(how = How.XPATH, using = "//input[contains(@class, 'otherinput')]")
    protected WebElement elmntEnterPromoField;

    @FindBy(how = How.XPATH, using = "//a/em[.='Enter another code']")
    protected WebElement lnkPromoPopUpAnotherCode;

    @FindBy(how = How.XPATH, using = "//a/em[.='No Bonus. Thank You.']")
    protected WebElement lnkPromoPopUpNoBonusOrClose;

    @FindBy(how = How.XPATH, using = "//a[contains(., 'new')]")
    protected WebElement lnkAreYouNewToTab;

    @FindBy(how = How.XPATH, using = "//input[@id='DepositAmount']")
    protected WebElement elmntBitcoinDeposit;

    @FindBy(how = How.XPATH, using = "//button[normalize-space(.)='Deposit Now']")
    protected WebElement btnDepositCashier;

    @FindBy(how = How.XPATH, using = "//label[@id='copyAddressToClipboard']")
    protected WebElement elmntBitcoinWalletAddress;

    @FindBy(how = How.XPATH, using = "//p[contains(., 'BTC')]")
    protected WebElement txtBitcoinCurrentPrice;

    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Completed My Deposit')]")
    protected WebElement lnkCompletedDeposit;

    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Start Playing!')]")
    protected WebElement lnkStartPlaying;

    @FindBy(how = How.XPATH, using = "//button[contains(@class, 'back')]")
    protected WebElement btnBackButton;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'popup')]/div[@id='contenttitle']")
    protected WebElement elmntExclusivePopup;

    /*@FindBy(how = How.XPATH, using = "//div/b[.='Exclusive Offer!']")
    protected WebElement lblExclusiveOffer;*/

    @FindBy(how = How.CSS, using = "button#closePopup")
    protected WebElement btnCloseIcon;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(), '$')])[1]")
    protected WebElement elmntDollarVerify;

    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Change')]")
    protected WebElement lnkChangePaymentMethod;

    @FindBy(how = How.XPATH, using = "//div[@class='cashier-depositoptions']/button")
    protected List<WebElement> elmntCreditCardOptions;

    @FindBy(how = How.XPATH, using = "//input[@id='CardNumber']")
    protected WebElement elmntCreditCardInsertDigits;

    @FindBy(how = How.XPATH, using = "//input[@id='CardExpiry']")
    protected WebElement elmntCreditCardExpiryDigits;

    @FindBy(how = How.XPATH, using = "//li[.='[New Card Number]']")
    protected WebElement elmntCreditCardNewCardNumber;

    @FindBy(how = How.XPATH, using = "//input[contains(@class, 'identified')]")
    protected WebElement elmntCreditCardEnteredNumber;

    @FindBy(how = How.XPATH, using = "//input[@class='form-control form-cashier-creditcard']")
    protected WebElement elmntCreditCardFreshInput;

    @FindBy(how = How.XPATH, using = "//strong[.='Cryptocurrency']/ancestor::a")  //Desktop
    protected WebElement txtCryptoCurrencyTab;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'wide')]/a/strong")  //Desktop
    protected List<WebElement> elmntListOriginalTabs;

    protected String lnkCryptoCurrencySubTabs = new StringBuilder()
            .append("//div[contains(@class, 'wide')]/a/strong[.='")
            .append("<<SUBTABNAME>>")
            .append("']")
            .toString();

    protected String lnkEthereumPopUpContinue = new StringBuilder()
            .append("//p[contains(text(), '")
            .append("<<TABNAME>>")
            .append("')][1]/following::a[1]")
            .toString();

    @FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Ethereum')]")  //Desktop
    protected WebElement txtEthereumPage;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'options')]/button")  //Desktop
    protected List<WebElement> btnOriginalOptions;

    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Tutorial')]")  //Desktop
    protected WebElement lnkCryptoCurrencyTutorial;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Cryptocurrency?')]")  //Desktop
    protected WebElement txtWhatIsCryptoCurrency;

    @FindBy(how = How.XPATH, using = "//h2[.='Ripple']/following::button[contains(@class, 'small')]")  //Desktop
    protected WebElement btnRipplePage;

    @FindBy(how = How.XPATH, using = "//h2[.='BitcoinCash']/following::button[contains(@class, 'small')]")  //Desktop
    protected WebElement btnBitcoinCashPage;

    @FindBy(how = How.XPATH, using = "(//p[contains(text(), 'Bitcoin Cash')][1]/following::a[1])[2]")  //Desktop
    protected WebElement lnkBitcoinCashContinue;

    @FindBy(how = How.XPATH, using = "//strong[.='Skrill']/ancestor::a")  //Desktop
    protected WebElement lnkSkrillTab;

    @FindBy(how = How.XPATH, using = "//h2[.='Skrill']/following::button[contains(@class, 'small')]")  //Desktop
    protected WebElement btnSkrillPage;

    @FindBy(how = How.XPATH, using = "//a/small[contains(text(), 'Sign')]")  //Desktop
    protected WebElement lnkSkrillSignUpPage;

    @FindBy(how = How.XPATH, using = "//strong[.='Moneygram']/ancestor::a")  //Desktop
    protected WebElement lnkMoneyGramTab;

    protected String lnkMoneyGramOptions = new StringBuilder()
            .append("//a[contains(., '")
            .append("<<KEYWORD>>")
            .append("')]")
            .toString();

    @FindBy(how = How.XPATH, using = "//strong[.='Wire Transfer']/ancestor::a")  //Desktop
    protected WebElement lnkWireTransferTab;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//button[.='Click here to begin']"),
            @FindBy(how = How.XPATH, using = "//select[@class='lp_select_field']")  //Desktop
    })
    protected WebElement selChatPopUp;

    @FindBy(how = How.XPATH, using = "//strong[.='Money Order']/ancestor::a")  //Desktop
    protected WebElement lnkMoneyOrderTab;

    @FindBy(how = How.XPATH, using = "//strong[.='Cashier Check']/ancestor::a")  //Desktop
    protected WebElement lnkCashierCheckTab;

    @FindBy(how = How.XPATH, using = "(//button/descendant::img[contains(@class, 'close')])[2]/parent::div")  //Desktop
    protected WebElement btnCloseChatPopUp;

    @FindBy(how = How.XPATH, using = "//strong[.='EcoPayz']/ancestor::a")  //Desktop
    protected WebElement lnkEcoPayzTab;

    @FindBy(how = How.XPATH, using = "//a[contains(., 'visit')]")  //Desktop
    protected WebElement lnkEcoPayzVisit;

    @FindBy(how = How.XPATH, using = "//h2[.='EcoPayz']/following::button[contains(@class, 'small')]")  //Desktop
    protected WebElement btnEcoPayzPage;

    @FindBy(how = How.XPATH, using = "//strong[.='Skrill 1 Tap']/ancestor::a")  //Desktop
    protected WebElement lnkSkrill1TapTab;

    @FindBy(how = How.XPATH, using = "//span[@class='Skrill1Tap spritepp']/following::button[1]")  //Desktop
    protected WebElement btnSkrill1TapPage;

    @FindBy(how = How.XPATH, using = "//a[contains(., 'account')]")  //Desktop
    protected WebElement lnkSkrill1TapAccount;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Withdrawal Request']")  //Desktop
    protected WebElement txtWithdrawalRequestHeader;

    @FindBy(how = How.XPATH, using = "//button/descendant::strong")  //Desktop
    protected List<WebElement> btnWithdrawalRequestOptions;

    @FindBy(how = How.XPATH, using = "//input[@class='form-control amountPayout']")  //Desktop
    protected WebElement elmntWithdrawalAmount;

    @FindBy(how = How.XPATH, using = "//button[@id='Bitcoin_main_btn']")  //Desktop
    protected WebElement btnBitcoinWithdrawalTab;

    protected String lnkWithdrawalBitcoinOriginalDatas = new StringBuilder()
            .append("//h2[normalize-space(.)='")
            .append("<<KEYWORD>>")
            .append("']/following::a[contains(., 'o')][")
            .append("<<NUMBER>>")
            .append("]")
            .toString();

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Bitcoin']")  //Desktop
    protected WebElement txtWithdrawalBitcoinPage;

    @FindBy(how = How.XPATH, using = "//button[@id='BitcoinCsh_main_btn']")  //Desktop
    protected WebElement btnBitcoinCashWithdrawalTab;

    @FindBy(how = How.XPATH, using = "//button[@id='Ethereum_main_btn']")  //Desktop
    protected WebElement btnEthereumWithdrawalTab;

    @FindBy(how = How.XPATH, using = "//button[@id='Litecoin_main_btn']")  //Desktop
    protected WebElement btnLitecoinWithdrawalTab;

    @FindBy(how = How.XPATH, using = "//button[@id='Ripple_main_btn']")  //Desktop
    protected WebElement btnRippleWithdrawalTab;

    @FindBy(how = How.XPATH, using = "//button[@id='BankWire_main_btn']")  //Desktop
    protected WebElement btnBankWireWithdrawalTab;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Bitcoin Cash']")  //Desktop
    protected WebElement txtWithdrawalBitcoinCashPage;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Ethereum']")  //Desktop
    protected WebElement withdrawalEthereumPage;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Litecoin']")  //Desktop
    protected WebElement txtWithdrawalLitecoinPage;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Ripple']")  //Desktop
    protected WebElement txtWithdrawalRipplePage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank Wire')]/following::div[.='Beneficiary Details']")
    //Desktop
    protected WebElement elmntWithdrawalBankWirePage;

    protected String lnkWithdrawalBankWireOriginalDatas = new StringBuilder()
            .append("//a[normalize-space(.)='")
            .append("<<CHOICE>>")
            .append("']")
            .toString();

    @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='wowowo']")  //Desktop
    protected WebElement lnkCashierCloseIcon;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'exit-modal')]/descendant::a[1]")  //Desktop
    protected WebElement lnkCashierPopUpCloseIcon;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'exit-modal')]/descendant::a")
    protected List<WebElement> lnkCashierClosePopUpOriginalOptions;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Welcome! Thank you for contacting us!')]")
    protected WebElement elmntDepositPageChatPopUp;

    @FindBy(how = How.XPATH, using = "//button[contains(@class, 'lp_menu-top')]")
    protected WebElement elmntDepositPageChatPopUpDropDown;

    @FindBy(how = How.XPATH, using = "(//button[contains(@id, 'EndChatAction')])[1]")
    protected WebElement elmntDepositPageChatPopUpCancel;

    @FindBy(how = How.XPATH, using = "(//h3[normalize-space(.)='Payment Methods'])[1]/following::h2[1]")
    protected WebElement txtClickHereToLearnMoreNewTab;

    @FindBy(how = How.XPATH, using = "//div[.='1-888-843-9027']")
    protected WebElement elmntHelpPopUpContactOption;

    @FindBy(how = How.XPATH, using = "//input[@value='cs@sportsbetting.ag']")
    protected WebElement elmntHelpPopUpEmailOption;

    @FindBy(how = How.XPATH, using = "//a[@id='limenu']")
    protected WebElement lnkLeftNavigator;

    @FindBy(how = How.XPATH, using = "//a[.='Deposit']")
    protected WebElement lnkDepositUnderMenu;

    @FindBy(how = How.XPATH, using = "//a[.='Payout']")
    protected WebElement lnkPayoutUnderMenu;

    public boolean clickCashierTab() {
        waitForSeconds(2);
        waitForElement(closeAdPopup);
        click(closeAdPopup);
        waitForSeconds(2);
        waitForElement(elmtCashierTab);
        return click(elmtCashierTab);
    }

    public void clickExitCashierButton() {
        waitForframeToBeAvailableAndSwitchToIt(driver, elmntCashierIFrame);
        waitForElement(btnExitCashier);
        click(btnExitCashier);
        waitForElement(btnConfirmExitCashier);
        click(btnConfirmExitCashier);
        focusBackToDefaultFrame();
    }

    public void clickViewMoreOptionsLink() {
        waitForframeToBeAvailableAndSwitchToIt(driver, elmntCashierIFrame);
        waitForElement(lnkViewMoreOptions);
        click(lnkViewMoreOptions);
    }

    public boolean verifyDepositOptions() {
        List<String> lstPaymentOptions = new ArrayList<>();
        jsScrollDown();
        jsScrollDown();
        waitForElements(elmntPaymentOptionsList)
                .forEach(i -> lstPaymentOptions.add(getText(i)));
        System.out.println("options" + lstPaymentOptions);
        boolean isVerified = (lstPaymentOptions.equals(TestDataUtil.getListOfValue(Constants.PAYMENT_OPTIONS)));
        waitForElement(emntVerifyDepositOptions);
        return (verifyElement(emntVerifyDepositOptions) && isVerified);
    }

    public void clickCreditCardLink() {
        waitForSeconds(3);
        driver.switchTo().frame(elmntCashierIFrame);
        waitForElement(lnkCreditCard);
        click(lnkCreditCard);
    }

    public boolean verifyCreditCardPage() {
        waitForSeconds(3);
        waitForElement(emntVerifyCreditCardPage);
        return verifyElement(emntVerifyCreditCardPage);
    }

    public boolean clickOnBackButtonInCreditCardPage() {
        waitForSeconds(3);
        waitForElement(elmtBackButtonInCreditCardPage);
        return verifyElement(elmtBackButtonInCreditCardPage);
    }

    public boolean clickOnWithdrawalLink() {
        waitForSeconds(3);
        waitForframeToBeAvailableAndSwitchToIt(driver, elmntCashierIFrame);
        waitForElement(lnkWithdrawal);
        return click(lnkWithdrawal);
    }

    public boolean verifyWithDrawlRequestPage() {
        // waitForframeToBeAvailableAndSwitchToIt(driver, elmntCashierIFrame);
        boolean isVerified = (verifyElement(waitForElement(elmntWithDrawlRequestHeader))
                && verifyElement(waitForElement(elmntWithDrawalRequestForm)));
        focusBackToDefaultFrame();
        return isVerified;
    }

    public void clickRequestNewIconInWithdrawlOptions() {
        takeScreenshot("clickRequestNewIconInWithdrawlOptions");
        click(waitForElement(elmntRequestNewInWithdrawlOptions));
        focusBackToDefaultFrame();
    }

    public void verifyCashierTabs(String tabs) {
        if (tabs.equalsIgnoreCase("Deposit")) {
            waitForSeconds(2);
            jsScrollDown();
            if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
                focusFrame(elmntCashierIFrame);
            }
            verifyElement(waitForElement(btnDeposit));
        } else if (tabs.equalsIgnoreCase("Withdrawal")) {
            if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
                focusFrame(elmntCashierIFrame);
            }
            verifyElement(waitForElement(btnWithdrawal));
        } else if (tabs.equalsIgnoreCase("SportsBetting Live Help")) {
            if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
                focusFrame(elmntCashierIFrame);
            }
            verifyElement(waitForElement(lnkSportsBettingLiveHelp));
        } else if (tabs.equalsIgnoreCase("Click Here to Learn More")) {
            if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
                focusFrame(elmntCashierIFrame);
            }
            verifyElement(waitForElement(lnkClickHereToLearnMore));
        } else if (tabs.equalsIgnoreCase("Close")) {
            if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
                focusFrame(elmntCashierIFrame);
            }
            verifyElement(waitForElement(lnkCloseCashier));
        } else if (tabs.equalsIgnoreCase("Help")) {
            if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
                focusFrame(elmntCashierIFrame);
            }
            verifyElement(waitForElement(btnHelpCashier));
        } else if (tabs.equalsIgnoreCase("Bitcoin")) {
//            focusFrame(elmntCashierIFrame);
            verifyElement(waitForElement(lnkBitcoinTab));
        } else if (tabs.equalsIgnoreCase("Credit Card")) {
//            focusFrame(elmntCashierIFrame);
            verifyElement(waitForElement(lnkCreditCardTab));
        } else {
//            false;
        }
    }

    public void clickCashierSubTab(String depositTab) {
        if (depositTab.equalsIgnoreCase("View More Deposit Options")) {
            click(waitForElement(lnkViewMoreOptions));
        } else if (depositTab.equalsIgnoreCase("Bitcoin")) {
            click(waitForElement(lnkBitcoinTab));
        } else if (depositTab.equalsIgnoreCase("View Promo Codes")) {
            waitForSeconds(2);
            jsClick(waitForElement(lnkPromoCodesTab));
        } else if (depositTab.equalsIgnoreCase("50% Welcome Bonus")) {
            click(waitForElement(By.xpath(lnkPopUpOptions.replace("<<intNumber>>", "1"))));
            click(waitForElement(By.xpath(btnSelectBonus.replace("<<intNumber>>", "1"))));
        } else if (depositTab.equalsIgnoreCase("25% Bonus For Life")) {
            click(waitForElement(By.xpath(lnkPopUpOptions.replace("<<intNumber>>", "1"))));
            waitForSeconds(1);
            click(waitForElement(By.xpath(lnkPopUpOptions.replace("<<intNumber>>", "2"))));
            click(waitForElement(By.xpath(btnSelectBonus.replace("<<intNumber>>", "2"))));
        } else if (depositTab.equalsIgnoreCase("Enter Another Code")) {
            click(waitForElement(By.xpath(lnkPopUpOptions.replace("<<intNumber>>", "2"))));
            waitForSeconds(1);
            click(waitForElement(lnkPromoPopUpAnotherCode));
        } else if (depositTab.equalsIgnoreCase("No Bonus. Thank You. or CLOSE")) {
            click(waitForElement(lnkPromoPopUpAnotherCode));
            waitForSeconds(1);
            click(waitForElement(lnkPromoPopUpNoBonusOrClose));
        } else if (depositTab.equalsIgnoreCase("Are You New To")) {
            jsClick(waitForElement(lnkAreYouNewToTab));
        } else if (depositTab.equalsIgnoreCase("Deposit Now")) {
            click(waitForElement(btnDepositCashier));
        } else if (depositTab.equalsIgnoreCase("I've Completed My Payment")) {
            click(waitForElement(lnkCompletedDeposit));
        } else if (depositTab.equalsIgnoreCase("Start Playing")) {
            click(waitForElement(lnkStartPlaying));
        } else if (depositTab.equalsIgnoreCase("Back(icon)")) {
            click(waitForElement(btnBackButton));
            if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
                focusBackToDefaultFrame();
            }
        } else if (depositTab.equalsIgnoreCase("Change Payment Method")) {
            click(waitForElement(lnkChangePaymentMethod));
            if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
                focusBackToDefaultFrame();
            }
        } else if (depositTab.equalsIgnoreCase("Credit Card")) {
            click(waitForElement(lnkCreditCardTab));
        } else if (depositTab.equalsIgnoreCase("Insert Digits")) {
            click(waitForElement(elmntCreditCardExpiryDigits));
            click(waitForElement(elmntCreditCardInsertDigits));
        } else if (depositTab.equalsIgnoreCase("[New Card Number]")) {
            click(waitForElement(elmntCreditCardNewCardNumber));
        } else if (depositTab.equalsIgnoreCase("100% Bonus For Life")) {
            click(waitForElement(By.xpath(lnkPopUpOptions.replace("<<intNumber>>", "2"))));
            waitForSeconds(1);
            click(waitForElement(By.xpath(lnkPopUpOptions.replace("<<intNumber>>", "3"))));
            click(waitForElement(By.xpath(btnSelectBonus.replace("<<intNumber>>", "3"))));
        } else if (depositTab.equalsIgnoreCase("Credit Card Enter Another Code")) {
            click(waitForElement(By.xpath(lnkPopUpOptions.replace("<<intNumber>>", "3"))));
            waitForSeconds(1);
            click(waitForElement(lnkPromoPopUpAnotherCode));
        } else if (depositTab.equalsIgnoreCase("Cryptocurrency")) {
            click(waitForElement(txtCryptoCurrencyTab));
        } else if (depositTab.equalsIgnoreCase("Ethereum") || depositTab.equalsIgnoreCase("Litecoin") || depositTab.equalsIgnoreCase("Ripple") || depositTab.equalsIgnoreCase("Bitcoin Cash")) {
            click(waitForElement(By.xpath(lnkCryptoCurrencySubTabs.replace("<<SUBTABNAME>>", depositTab))));
        } else if (depositTab.equalsIgnoreCase("Tutorial Video on how to use Cryptocurrencies")) {
            click(waitForElement(lnkCryptoCurrencyTutorial));
        } else if (depositTab.equalsIgnoreCase("Skrill")) {
            click(waitForElement(lnkSkrillTab));
        } else if (depositTab.equalsIgnoreCase("Don't have a Skrill account? Sign Up Here")) {
            jsClick(waitForElement(lnkSkrillSignUpPage));
        } else if (depositTab.equalsIgnoreCase("Moneygram")) {
            click(waitForElement(lnkMoneyGramTab));
        }  else if (depositTab.equalsIgnoreCase("Wire Transfer")) {
            jsScrollDownByCord(200);
            waitForSeconds(5);
            click(waitForElement(lnkWireTransferTab));
        } else if (depositTab.equalsIgnoreCase("Money Order")) {
            jsScrollDownByCord(200);
            waitForSeconds(5);
            click(waitForElement(lnkMoneyOrderTab));
        } else if (depositTab.equalsIgnoreCase("Cashier Check")) {
            jsScrollDownByCord(200);
            waitForSeconds(5);
            click(waitForElement(lnkCashierCheckTab));
        } else if (depositTab.equalsIgnoreCase("EcoPayz")) {
            click(waitForElement(lnkEcoPayzTab));
        } else if (depositTab.equalsIgnoreCase("To Visit ecoPayz. Click Here")) {
            click(waitForElement(lnkEcoPayzVisit));
        } else if (depositTab.equalsIgnoreCase("Skrill 1 Tap")) {
            click(waitForElement(lnkSkrill1TapTab));
        } else if (depositTab.equalsIgnoreCase("Don't have a Skrill 1-Tap account?")) {
            click(waitForElement(lnkSkrill1TapAccount));
        } else if (depositTab.equalsIgnoreCase("Withdrawal")) {
            if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
                focusFrame(elmntCashierIFrame);
            }
            click(waitForElement(btnWithdrawal));
        } else if (depositTab.equalsIgnoreCase("close(icon)")) {
            if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
                focusFrame(elmntCashierIFrame);
            }
            click(waitForElement(lnkCashierCloseIcon));
        } else if (depositTab.equalsIgnoreCase("help (icon)")) {
            click(waitForElement(btnHelpCashier));
        } else if (depositTab.equalsIgnoreCase("No thanks, I don't want free money")) {
            click(waitForElement(lnkCashierClosePopUpOriginalOptions.get(2)));
        } else if (depositTab.equalsIgnoreCase("Deposit & Claim My Bonus or close (icon)")) {
            click(waitForElement(lnkCashierClosePopUpOriginalOptions.get(1)));
        } else if (depositTab.equalsIgnoreCase("SportsBetting Live Help")) {
            verifyElement(waitForElement(lnkSportsBettingLiveHelp));
            waitForSeconds(4);
            click(waitForElement(lnkSportsBettingLiveHelp));
        } else if (depositTab.equalsIgnoreCase("Pop Up Cancel")) {
            click(waitForElement(elmntDepositPageChatPopUpDropDown));
            click(waitForElement(elmntDepositPageChatPopUpCancel));
        } else if (depositTab.equalsIgnoreCase("Click Here to Learn More")) {
            click(waitForElement(lnkClickHereToLearnMore));
        } else if (depositTab.equalsIgnoreCase("Left Navigator")) {
            click(waitForElement(lnkLeftNavigator));
        } else if (depositTab.equalsIgnoreCase("Deposit")) {
            click(waitForElement(lnkDepositUnderMenu));
        } else if (depositTab.equalsIgnoreCase("Payout")) {
            click(waitForElement(lnkPayoutUnderMenu));
        } else {
            System.out.println("Options out of if condition");
        }
    }

    public boolean verifyCashierMoreTabs(DataTable depositTabs) {
        jsScrollDown();
        List<String> depositMoreTabs = depositTabs.asList(String.class);
        waitForElements(lnkCashirDepositMoreTabs);
        return compareList(waitForElements(lnkCashirDepositMoreTabs), depositMoreTabs);
    }

    public boolean verifyBitcoinDepositOptions(DataTable depositTabs) {
        List<String> bitcoinDepositOptions = depositTabs.asList(String.class);
        waitForElements(btnBitcoinMoreDepositOptions);
        return compareList(waitForElements(btnBitcoinMoreDepositOptions), bitcoinDepositOptions);
    }

    public boolean verifyBitcoinPage() {
        click(waitForElement(lnkBitcoinTab));
        return verifyElement(waitForElement(txtBitcoinTab));
    }

    public boolean verifyPromoCodes(DataTable strTabs) {
        List<String> promocodeVerify = strTabs.asList(String.class);
        waitForSeconds(2);
        waitForElements(lnkPromoCodesVerify);
        return compareList(waitForElements(lnkPromoCodesVerify), promocodeVerify);
    }

    public boolean verifyPopUp() {
        return verifyElement(waitForElement(txtPopUpVerify));
    }

    public boolean verifyPromotionEntered(String strTab) {
        return verifyElement(waitForElement(elmntPromoEntered));
    }

    public void enterPromoCode(String strTab) {
        enterValue(waitForElement(elmntEnterPromoField), strTab);
    }

    public boolean submitPopUpPromo(String strNumber) {
        return click(waitForElement(By.xpath(btnSelectBonus.replace("<<intNumber>>", strNumber))));
    }

    public boolean verifyAreYouNewToWindow() {
        waitForSeconds(2);
        if (waitForWindows(2)) {
            focusWindow(2);
            if (driver.getTitle().equals("Bitcoin 101")) {
                driver.close();
            }
            focusWindow(1);
            return true;
        } else {
            takeScreenshot("try");
            return false;
        }
    }

    public void enterBitcoinDeposit(int intAmount, int intAmountBelow, int intAmountAbove) {
        if (intAmount > intAmountBelow && intAmount < intAmountAbove) {
            enterValue(waitForElement(elmntBitcoinDeposit), String.valueOf(intAmount));
        }
    }

    public boolean verifyBitcoinDepositSecondStep() {
        waitForElement(elmntBitcoinWalletAddress);
        jsScrollDown();
        return verifyElement(waitForElement(elmntBitcoinWalletAddress)) && verifyElement(waitForElement(txtBitcoinCurrentPrice));
    }

    public void closeIndexPopUp() {
        if (verifyElement(elmntExclusivePopup)) {
//            waitForElement(lblExclusiveOffer);
            click(btnCloseIcon);
        }
        verifyElement(waitForElement(elmntDollarVerify));
    }

    public boolean bitcoinDepositWalletAddress() {
        waitForElement(elmntBitcoinWalletAddress);
        return verifyElement(waitForElement(elmntBitcoinWalletAddress)) && verifyElement(waitForElement(txtBitcoinCurrentPrice));
    }

    public boolean verifyStartPlaying() {
        return verifyElement(waitForElement(lnkStartPlaying));
    }

    public boolean verifyBitcoinInputPage() {
        if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
            focusFrame(elmntCashierIFrame);
        }
        return verifyElement(waitForElement(elmntBitcoinDeposit));
    }

    public boolean verifyCreditcardOptions(DataTable strOptions) {
        List<String> strCreditCardOptions = strOptions.asList(String.class);
        waitForElements(elmntCreditCardOptions);
        return compareList(waitForElements(elmntCreditCardOptions), strCreditCardOptions);
    }

    public boolean enterCreditCardDigit(String strNumber) {
        enterValue(waitForElement(elmntCreditCardInsertDigits), strNumber);
        return verifyElement(waitForElement(elmntCreditCardEnteredNumber));
    }

    public boolean verifyCreditCardFreshInput() {
        focusBackToDefaultFrame();
        jsScrollUp();
        if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
            focusFrame(elmntCashierIFrame);
        }
        return verifyElement(waitForElement(elmntCreditCardFreshInput));
    }

    public boolean verifyCryptoCurrencySubTabs(DataTable strTabs) {
        List<String> listTabs = strTabs.asList(String.class);
        waitForElements(elmntListOriginalTabs);
        return compareList(waitForElements(elmntListOriginalTabs), listTabs);
    }

    public boolean clickEthereumPopUpContinue(String strTab) {
        if (strTab.equalsIgnoreCase("Bitcoin Cash")) {
            return click(waitForElement(lnkBitcoinCashContinue));
        } else {
            return click(waitForElement(By.xpath(lnkEthereumPopUpContinue.replace("<<TABNAME>>", strTab))));
        }
    }

    public boolean verifyEthereumDotComTitle(String strTitle) {
        if (waitForWindows(2)) {
            focusWindow(2);
            waitForSeconds(4);
            takeScreenshot("try");
            if (driver.getTitle().equalsIgnoreCase(strTitle)) {
                takeScreenshot("try");
                driver.close();
            }
            focusWindow(1);
            if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
                focusFrame(elmntCashierIFrame);
            }
            return true;
        }
        return false;
    }

    public boolean verifyEthereumPage() {
        return verifyElement(waitForElement(txtEthereumPage));
    }

    public boolean verifyLitecoinOptions(DataTable strOptions) {
        List<String> strLitecoinOptions = strOptions.asList(String.class);
        waitForElements(btnOriginalOptions);
        return compareList(waitForElements(btnOriginalOptions), strLitecoinOptions);
    }

    public boolean verifyCryptoCurrencyPage() {
        return waitForElements(elmntListOriginalTabs).size() > 1;
    }

    public boolean verifyCryptoCurrencyPageWithFrame() {
        if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
            focusFrame(elmntCashierIFrame);
        }
        return waitForElements(elmntListOriginalTabs).size() > 1;
    }

    public boolean verifyCryptoCurrencyTutorialPage() {
        if (waitForWindows(2)) {
            focusWindow(2);
            verifyElement(waitForElement(txtWhatIsCryptoCurrency));
            driver.close();
            focusWindow(1);
            if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
                focusFrame(elmntCashierIFrame);
            }
            return true;
        }
        return false;
    }

    public boolean verifyLitecoinPage() {
        return btnOriginalOptions.size() > 1;
    }

    public boolean verifyRippleDepositPage(DataTable strOptions) {
        List<String> strLitecoinOptions = strOptions.asList(String.class);
        waitForElements(btnOriginalOptions);
        return compareList(waitForElements(btnOriginalOptions), strLitecoinOptions);
    }

    public boolean verifyRipplePage() {
        return verifyElement(waitForElement(btnRipplePage));
    }

    public boolean verifyBitcoinCashDepositPage(DataTable strOptions) {
        List<String> strLitecoinOptions = strOptions.asList(String.class);
        waitForElements(btnOriginalOptions);
        return compareList(waitForElements(btnOriginalOptions), strLitecoinOptions);
    }

    public boolean verifyBitcoinCashPage() {
        return verifyElement(waitForElement(btnBitcoinCashPage));
    }

    public boolean verifySkrillDepositPage(DataTable strOptions) {
        waitForSeconds(2);
        List<String> skrillOptions = strOptions.asList(String.class);
        waitForElements(btnOriginalOptions);
        return compareList(waitForElements(btnOriginalOptions), skrillOptions);
    }

    public boolean verifySkrillPage() {
        return verifyElement(waitForElement(btnSkrillPage));
    }

    public boolean verifyMoneygramOptions(DataTable strOptions) {
        waitForSeconds(2);
        boolean strResult = false;
        focusBackToDefaultFrame();
        jsScrollDownByCord(200);
        if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
            focusFrame(elmntCashierIFrame);
        }
        List<String> skrillOptions = strOptions.asList(String.class);
        for (int i = 0; i < 3; i++) {
            strResult = skrillOptions.get(i).equalsIgnoreCase(getTextBy(lnkMoneyGramOptions.replace("<<KEYWORD>>", skrillOptions.get(i))));
        }
        return strResult;
    }

    public boolean verifyChatPopUp() {
        focusBackToDefaultFrame();
        waitForSeconds(4);
        try {
            verifyElement(waitForElement(selChatPopUp));
            return click(waitForElement(btnCloseChatPopUp));
        }
        catch (TimeoutException e){
            Reporter.addStepLog("Popup is not opened");
            return true;

        }
    }

    public boolean verifyEcoPayzPage() {
        return verifyElement(waitForElement(btnEcoPayzPage));
    }

    public boolean verifySkrill1TapPage() {
        return verifyElement(waitForElement(btnSkrill1TapPage));
    }

    public boolean verifyWithdrawalOptions(DataTable strWithdrawalOptions) {
        verifyElement(waitForElement(txtWithdrawalRequestHeader));
        List<String> strWithdrawalLocalOptions = strWithdrawalOptions.asList(String.class);
        if (strWithdrawalLocalOptions.get(0).equalsIgnoreCase("Back(icon)")) {
            verifyElement(waitForElement(btnBackButton));
        }
        if (strWithdrawalLocalOptions.get(1).equalsIgnoreCase("Help(icon)")) {
            verifyElement(waitForElement(btnHelpCashier));
        }
        waitForElements(btnWithdrawalRequestOptions);
        btnWithdrawalRequestOptions.forEach(l -> System.out.println(l.getText()));
        if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
            return compareList(btnWithdrawalRequestOptions, strWithdrawalLocalOptions.subList(2, 8));
        } else {
            return compareList(btnWithdrawalRequestOptions, strWithdrawalLocalOptions.subList(1, 7));
        }
    }

    public boolean verifyWithdrawalOptionsMobile(DataTable strWithdrawalOptions) {
        verifyElement(waitForElement(txtWithdrawalRequestHeader));
        List<String> strWithdrawalLocalOptions = strWithdrawalOptions.asList(String.class);
        if (strWithdrawalLocalOptions.get(0).equalsIgnoreCase("Back(icon)") && strWithdrawalLocalOptions.get(1).equalsIgnoreCase("Help(icon)")) {
            verifyElement(waitForElement(btnBackButton));
            verifyElement(waitForElement(btnHelpCashier));
        }
        waitForElements(btnWithdrawalRequestOptions);
        btnWithdrawalRequestOptions.forEach(l -> System.out.println(l.getText()));
        return compareList(btnWithdrawalRequestOptions, strWithdrawalLocalOptions.subList(2, 8));
    }

    public boolean closePromoPopUp() {
        return click(waitForElement(lnkPromoPopUpNoBonusOrClose));
    }

    public void enterAmountUnderWithdrawalPage(String strAmount) {
        enterValue(waitForElement(elmntWithdrawalAmount), strAmount);
    }

    public boolean clickWithdrawalOption(String strTab) {
        if (strTab.equalsIgnoreCase("Bitcoin")) {
            return click(waitForElement(btnBitcoinWithdrawalTab));
        } else if (strTab.equalsIgnoreCase("Bitcoin Cash")) {
            return click(waitForElement(btnBitcoinCashWithdrawalTab));
        } else if (strTab.equalsIgnoreCase("Ethereum")) {
            return click(waitForElement(btnEthereumWithdrawalTab));
        } else if (strTab.equalsIgnoreCase("Litecoin")) {
            return click(waitForElement(btnLitecoinWithdrawalTab));
        } else if (strTab.equalsIgnoreCase("Ripple")) {
            return click(waitForElement(btnRippleWithdrawalTab));
        } else if (strTab.equalsIgnoreCase("Bank Wire")) {
            return click(waitForElement(btnBankWireWithdrawalTab));
        } else if (strTab.equalsIgnoreCase("Change Payment Method")) {
            return click(waitForElement(lnkChangePaymentMethod));
        } else if (strTab.equalsIgnoreCase("Payout") || strTab.equalsIgnoreCase("Deposit")) {
            waitForSeconds(4);
            return click(waitForElement(By.xpath(lnkWithdrawalBankWireOriginalDatas.replace("<<CHOICE>>", strTab))));
        }
        return false;
    }

    public boolean verifyWithdrawalBitcoinOptions(String strTab, DataTable strDatas) {
        List<String> strWithdrawalBitcoinDatas = strDatas.asList(String.class);
        if (strTab.equalsIgnoreCase("Bitcoin"))
            verifyElement(waitForElement(txtWithdrawalBitcoinPage));
        else if (strTab.equalsIgnoreCase("Bitcoin Cash"))
            verifyElement(waitForElement(txtWithdrawalBitcoinCashPage));
        else if (strTab.equalsIgnoreCase("Ethereum"))
            verifyElement(waitForElement(withdrawalEthereumPage));
        else if (strTab.equalsIgnoreCase("Litecoin"))
            verifyElement(waitForElement(txtWithdrawalLitecoinPage));
        else if (strTab.equalsIgnoreCase("Ripple"))
            verifyElement(waitForElement(txtWithdrawalRipplePage));
        else if (strTab.equalsIgnoreCase("Bank Wire")) {
            int a = 0;
            verifyElement(waitForElement(elmntWithdrawalBankWirePage));
            boolean resultOutput = false;
            for (int i = 0; i < 3; i++) {
                resultOutput = getTextBy(lnkWithdrawalBankWireOriginalDatas.replace("<<CHOICE>>", strWithdrawalBitcoinDatas.get(i))).equalsIgnoreCase(strWithdrawalBitcoinDatas.get(i));
            }
            return resultOutput;
        }
        focusBackToDefaultFrame();
        jsScrollDownByCord(300);
        if (!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
            focusFrame(elmntCashierIFrame);
        }
        boolean resultOutput = false;
        for (int i = 0; i < 2; i++) {
            resultOutput = getTextBy(lnkWithdrawalBitcoinOriginalDatas.replace("<<KEYWORD>>", strTab).replace("<<NUMBER>>", String.valueOf(i + 1))).equalsIgnoreCase(strWithdrawalBitcoinDatas.get(i));
        }
        return resultOutput;

    }

    public boolean verifyBitcoinWithdrawalPage() {
        return verifyElement(waitForElement(txtWithdrawalBitcoinPage));
    }

    public boolean verifyCashierWithdrawalPage() {
        waitForSeconds(3);
        takeScreenshot("Withdrawal page");
        return verifyElement(waitForElement(elmntWithdrawalAmount));
    }

    public boolean verifyBitcoinCashWithdrawalPage() {
        return verifyElement(waitForElement(txtWithdrawalBitcoinCashPage));
    }

    public boolean verifyEthereumWithdrawalPage() {
        return verifyElement(waitForElement(withdrawalEthereumPage));
    }

    public boolean verifyLitecoinWithdrawalPage() {
        return verifyElement(waitForElement(txtWithdrawalLitecoinPage));
    }

    public boolean verifyRippleWithdrawalPage() {
        return verifyElement(waitForElement(txtWithdrawalRipplePage));
    }

    public boolean verifyBankWireWithdrawalPage() {
        waitForSeconds(2);
        return verifyElement(waitForElement(elmntWithdrawalBankWirePage));
    }

    public boolean verifyCashierClosePopUp(DataTable strOptions) {
        List<String> cashierClosePopUpOptions = strOptions.asList(String.class);
        boolean cashierPopUpMatchResult = false;
        if (cashierClosePopUpOptions.get(0).equalsIgnoreCase("close (icon)"))
            cashierPopUpMatchResult = verifyElement(waitForElement(lnkCashierClosePopUpOriginalOptions.get(0)));
        else
            waitForElements(lnkCashierClosePopUpOriginalOptions);
            cashierPopUpMatchResult = compareList(waitForElements(lnkCashierClosePopUpOriginalOptions).subList(1, 3), cashierClosePopUpOptions);
        return cashierPopUpMatchResult;
    }

    public boolean verifyCashierLeavePopUp() {
        return verifyElement(waitForElement(lnkCashierClosePopUpOriginalOptions.get(2)));
    }

    public boolean verifyChatPopUpUnderDeposit() {
        focusBackToDefaultFrame();
        waitForSeconds(2);
        takeScreenshot("try");
        return verifyElement(waitForElement(elmntDepositPageChatPopUp));
    }

    public boolean verifyChatDropDown() {
        return verifyElement(waitForElement(selChatPopUp));
    }

    public boolean verifyClosingOfChatPopUp() {
        waitForSeconds(4);
        if (!verifyElement(elmntDepositPageChatPopUp)) {
            return true;
        }
        return false;
    }

    public boolean verifyClickHereToLearnMoreNewTab() {
        if (waitForWindows(2)) {
            focusWindow(2);
            verifyElement(waitForElement(txtClickHereToLearnMoreNewTab));
            driver.close();
            focusWindow(1);
            return true;
        }
        return false;
    }

    public boolean verifyHelpPopUpChoices(DataTable strChoices) {
        waitForSeconds(2);
        List<String> strHelpPopUpChoices = strChoices.asList(String.class);
        boolean helpPopUpResult = false;
        for (int i = 0; i < 3; i++) {
            System.out.println(lnkMoneyGramOptions.replace("<<KEYWORD>>", strHelpPopUpChoices.get(i)));
            System.out.println(getTextBy(lnkMoneyGramOptions.replace("<<KEYWORD>>", strHelpPopUpChoices.get(i))));
            helpPopUpResult = getTextBy(lnkMoneyGramOptions.replace("<<KEYWORD>>", strHelpPopUpChoices.get(i))).equalsIgnoreCase(strHelpPopUpChoices.get(i));
        }
        return helpPopUpResult;
    }

    public boolean verifyHelpPopUp() {
        return verifyElement(waitForElement(By.xpath(lnkMoneyGramOptions.replace("<<KEYWORD>>", "Speak to SportsBetting"))));
    }

    public boolean clickOnHelpChoices(String strChoice) {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            if(strChoice.contains("Speak")) {
                return verifyElement(waitForElement(By.xpath(lnkMoneyGramOptions.replace("<<KEYWORD>>", strChoice))));
            }
            else {
                waitForSeconds(2);
                return click(waitForElement(By.xpath(lnkMoneyGramOptions.replace("<<KEYWORD>>", strChoice))));
            }
        }
        if(strChoice.contains("Speak")) {
            return click(waitForElement(By.xpath(lnkMoneyGramOptions.replace("<<KEYWORD>>", strChoice))));
        }
        else {
             jsClick(waitForElement(By.xpath(lnkMoneyGramOptions.replace("<<KEYWORD>>", strChoice))));
             return true;
        }
    }

    public boolean verifyHelpPopUpContactOption() {
        return verifyElement(waitForElement(elmntHelpPopUpContactOption));
    }

    public boolean verifyHelpPopUpEmailOption() {
        return click(waitForElement(elmntHelpPopUpEmailOption));
    }

    public boolean verifyClosingOfHelpPopUp() {
        return waitForInvisibilityOfElement(waitForElement(By.xpath(lnkMoneyGramOptions.replace("<<KEYWORD>>", "Email SportsBetting"))));
    }

    public boolean verifyDepositPage() {
        return verifyElement(waitForElement(btnDeposit));
    }
}

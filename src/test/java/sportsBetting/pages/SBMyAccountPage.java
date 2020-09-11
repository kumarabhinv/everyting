package sportsBetting.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import com.cucumber.listener.Reporter;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

public class SBMyAccountPage extends BasePage {

    public SBMyAccountPage(WebDriver driver) {
        super(driver);
    }

    /*@Description: If user send a new message. It will appear New Message label instead of My Account label*/
    @FindBy(how = How.XPATH, using = "//li/a[contains(@id,'option')][not(contains(@style,'display: none') or contains(@style,'display:none'))][contains(text(),'New Messages') or contains(text(),'My Account')]")
    protected WebElement lnkMyAccountforDesktopBrowser;

    //This locator for Mobile & Tablet

    @FindBy(how = How.XPATH, using = "//a[.='My Account']")
    protected WebElement lnkMyAccount;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[.='My Account']/following::div/a[.='Deposit']"),
            @FindBy(how = How.XPATH, using = "//a[contains(.,'Deposit Funds')]"),
    })
    protected WebElement lnkDepositFunds;

    @FindBy(how = How.XPATH, using = "//button[@id='BtnSaved']")
    protected WebElement emntDepositFundsPopup;

    @FindAll({
            @FindBy(how = How.ID, using = "ListReferFriends[0]_FirstName"),
            @FindBy(how = How.ID, using = "FirstName1"),
            @FindBy(how = How.XPATH, using = "//input[@id='ListReferFriends[0]_FirstName']")})
    protected WebElement emntFriendFirstName;

    @FindBy(how = How.XPATH, using = "//a[.='Back to my account']")
    protected WebElement backToMyAccount;

    @FindBy(how = How.XPATH, using = "//button[.='Details']")
    protected WebElement clickDetailsTablet;

    @FindBy(how = How.XPATH, using = "//a[.='Promotions']")
    protected WebElement promotionsTabTablet;

    @FindBy(how = How.XPATH, using = "//span[.='Promotions']")
    protected WebElement promotionsContentTablet;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//input[@id='ListReferFriends[0]_Email']"),
            @FindBy(how = How.ID, using = "Email1")
    })
    protected WebElement emntFriendEmailAddress;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//input[@id='referSend']"),
            @FindBy(how = How.ID, using = "button-referfriend-save")
    })
    protected WebElement btnSubmitInReferFriends;

    @FindBy(how = How.XPATH, using = "//button[.='Deposit']")
    protected WebElement btnDeposit;

    @FindBy(how = How.XPATH, using = "//div[contains(@data-uniquekey,'-1')]/descendant::div[contains(text(),'TestingUser1')]")
    protected WebElement elmntMessage;

    @FindBy(how = How.XPATH, using = "//a[@title='Close']")
    protected WebElement emntCloseDepositFundsPopup;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[contains(text(),'48 hours')]"),
            @FindBy(how = How.XPATH, using = "//span[contains(text(),'Current Week')]")
    })
    protected WebElement elmnt48hours;

//    @FindBy(how = How.ID, using = "myaccount-option")
//    protected WebElement lnkMyAccount;
//
//    @FindBy(how = How.XPATH, using = "//a[contains(.,'Deposit Funds')]")
//    protected WebElement lnkDepositFunds;
//
//    @FindBy(how = How.XPATH, using = "//h2[contains(.,'Credit Card')]")
//    protected WebElement emntDepositFundsPopup;

    @FindBy(how = How.XPATH, using = "//a[@title='Close']")
    protected WebElement elmntCloseIconCreditCardPopup;

    @FindBy(how = How.ID, using = "closePopup")
    protected WebElement closeAdPopup;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//li/parent::ul/descendant::li/following-sibling::li[normalize-space(.)='Profile']"),
            @FindBy(how = How.XPATH, using = "//a[.='Profile']"),
            @FindBy(how = How.XPATH, using = "//a[contains(.,'My Profile')]")
    })
    protected WebElement lnkMyProfile;

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'Pending Wagers')]")
    protected WebElement elmntVerifyPendingWagersPage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[.='First Name']"),
            @FindBy(how = How.XPATH, using = "//div[.='First name:']"),
            @FindBy(how = How.XPATH, using = "//h2[contains(.,'Your SportsBetting Profile')]")
    })
    protected WebElement emntVerifyAccountProfile;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Personal Information')]")
    protected WebElement elmntPersonalInfo;

    @FindBy(how = How.XPATH, using = "//span[normalize-space(.)='Personal Information']")
    protected WebElement elmntPersonalInfoTablet;
    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='Reports']"),
            @FindBy(how = How.XPATH, using = "//span[.='Reports']")
    })
    protected WebElement elmntReport;

//    @FindBy(how = How.XPATH, using = "//span[.='Reports']")
//    protected WebElement elementTabletReport;

    @FindBy(how = How.XPATH, using = "//span[.='Pending Wagers']/parent::a[contains(@class, 'Active')]")
    protected WebElement tabletPendingWagers;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@class='ul-menu-icons-no-sports']/descendant::a/img[contains(@src, 'myaccount')]"),
            @FindBy(how = How.XPATH, using = "//a[@id='limenu']//following::span[@class='ui-icon ui-icon-bars ui-icon-shadow']")
    })
    protected WebElement btnHamburger;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'View My Payout History')]")
    protected WebElement lnkPayoutsHistory;

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'My Payouts History')]")
    protected WebElement emntVerifyPayoutsHistory;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Request a New Payout')]")
    protected WebElement lnkNewPayout;

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'Request A New Payout')]")
    protected WebElement emntVerifyNewPayoutPage;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Payouts')]")
    protected WebElement lnkPayout;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='Pending Wagers']"),
            @FindBy(how = How.XPATH, using = "//div[@id='Navigation']//a[contains(.,'Pending Wagers')]")
    })
    protected WebElement lnkPendingWagers;

//    @FindAll({
//            @FindBy(how = How.XPATH, using = "//span[contains(text(),'Ticket Number:')]"),
//            @FindBy(how = How.XPATH, using = "//span[contains(text(),'Ticket Details:')]"),
//            @FindBy(how = How.XPATH, using = "//span[contains(text(),'/20')]//following::div[contains(text(),'Description:')]")
//    })
//    protected WebElement elmntTicketNumber;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='All Transactions']"),
            @FindBy(how = How.XPATH, using = "//a[contains(.,'Transaction History')]"),
    })
    protected WebElement lnkTransactionHistory;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='Daily Figures']"),
            @FindBy(how = How.XPATH, using = "//a[contains(.,'Daily Figures')]")
    })
    protected WebElement lnkDailyFigures;

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'Pending Wagers')]")
    protected WebElement elmntPendingWagersPage;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Graded Wagers')]")
    protected WebElement lnkGradedWagers;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[.='Graded Wagers']/parent::a[contains(@class, 'Active')]"),
            @FindBy(how = How.XPATH, using = "//h2[contains(.,'Graded Wagers')]")
    })
    protected WebElement emntVerifyGradedWagersPage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[.='All Transactions']/parent::a[contains(@class, 'Active')]"),
            @FindBy(how = How.XPATH, using = "//h2[contains(.,'Transaction History')]")
    })
    protected WebElement emntVerifyTransactionHistoryPage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[.='Daily Figures']/parent::a[contains(@class, 'Active')]"),
            @FindBy(how = How.XPATH, using = "//h2[contains(.,'Current Daily Figures')]")
    })
    protected WebElement emntVerifyDailyFiguresPage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@class='nav nav-tabs nav-stacked main-menu']/descendant::a[.='My Messages']"),
            @FindBy(how = How.XPATH, using = "//a[.='My Messages']"),
            @FindBy(how = How.XPATH, using = "//a[contains(.,'My Messages')]")
    })
    protected WebElement lnkMyMessages;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[.='Compose a new message']"),
            @FindBy(how = How.XPATH, using = "//span[contains(text(),'Compose a new message')]"),
            @FindBy(how = How.XPATH, using = "//h2[contains(.,'Compose a new message')]")
    })
    // @FindBy(how = How.XPATH, using = "//h2[contains(.,'Compose a new message')]")
    protected WebElement elmntComposeANewMessage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[contains(text(),'Your messages History')]"),
            @FindBy(how = How.XPATH, using = "//h2[.='Your messages history']/following-sibling::ul[@id='messageHistory']/li[1]//*[normalize-space(text())='Deposit']")
    })
    protected WebElement lblMessageHistory;

    @FindBy(how = How.ID, using = "freeplay_list_container")
    protected WebElement emntVerifyMyFreeplayPage;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'My Freeplay')]")
    protected WebElement lnkMyFreeplay;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Limits Information')]")
    protected WebElement lnkLimitInformation;

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'Customer Limits')]")
    protected WebElement emntVerifyLimitInformationPage;

    @FindBy(how = How.ID, using = "selectSport")
    protected WebElement emntSelectSportsInLimitInformation;

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'Matchups')]")
    protected WebElement emntVerifyLimitInformationTable;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[.='Refer My Friends']"),
            @FindBy(how = How.XPATH, using = "//a[.='Refer My Friends']"),
            @FindBy(how = How.XPATH, using = "//a[contains(.,'Refer My Friends')]")
    })
    protected WebElement lnkReferMyFriends;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='Refer Friends']"),
            @FindBy(how = How.XPATH, using = "//div[@id='Navigation']//a[contains(.,'Refer a Friend')]")
    })
    protected WebElement lnkReferAFriendSublink;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//p[contains(.,'Nicely done')]/parent::div/ul//a[contains(.,'Refer more friends')]"),
            @FindBy(how = How.XPATH, using = "//p[contains(.,'Thank you')]/parent::div/ul//a[contains(.,'Back to my account')]")
    })
    protected WebElement elmntReferMoreFriend;

//    @FindBy(how = How.XPATH, using = "//a[.='Details']")
//    protected WebElement elmntDetails;

    @FindBy(how = How.XPATH, using = "//div[@id='referrals-group']/child::ul")
    protected WebElement elmntreferrallist;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[contains(.,'View My Referrals')]"),
            @FindBy(how = How.XPATH, using = "//a[contains(.,'View My referrals')]")
    })
    protected WebElement lnkViewMyReferrals;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='referrals-group']"),
            @FindBy(how = How.XPATH, using = "//p[@id='friend'][contains(.,'List of Referred Friends:')]")
    })
    protected WebElement emntVerifyMyReferralTable;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Sports Schedules')]")
    protected WebElement lnkSportsSchedules;

    @FindBy(how = How.XPATH, using = "//h1[contains(.,'SCHEDULES')]")
    protected WebElement emntVerifyGamesSchedulesPage;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'How To Bet Online')]")
    protected WebElement lnkHowToBetOnline;

    @FindBy(how = How.XPATH, using = "//h1[contains(.,'HOW TO BET ONLINE')]")
    protected WebElement emntVerifyHowToBetOnlineInformationPage;

    @FindBy(how = How.XPATH, using = "//div[@id='myaccount_left']//a[contains(.,'Affiliate Program')]")
    protected WebElement lnkAffiliateProgram;

    @FindBy(how = How.CSS, using = "img[alt=CommissionKings][id=logo]")
    protected WebElement elmntComissionKingsAppLogo;

    @FindBy(how = How.XPATH, using = "//input[@id='american']")
    protected WebElement emntEnterAmericanValueInConverter;

    @FindBy(how = How.XPATH, using = "//h1[contains(.,'Online Sports Betting Odds Calculator')]")
    protected WebElement emntVerifyCalculationInOrderToPlaceABet;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Bet Calculator')]")
    protected WebElement elmntCalculatorInMyAccount;

    @FindAll({
            @FindBy(how = How.ID, using = "messages-text"),
            @FindBy(how = How.XPATH, using = "//label[.='Your Message:']/following-sibling::div/textarea[@id='messages-text']"),
            @FindBy(how = How.XPATH, using = "//textarea[@id='text']")})
    protected WebElement txtYourMessageInMyMessage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[contains(text(),'Your messages History')]/preceding::a[.='Send']"),
            @FindBy(how = How.XPATH, using = "//span[contains(text(),'Your messages History')]/preceding::span[.='Send']"),
            @FindBy(how = How.XPATH, using = "//span[contains(.,'Send')]")
    })
    protected WebElement btnSendInMyMessage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//select[@id='subject-select']"),
            @FindBy(how = How.ID, using = "selectedReason")
    })
    protected WebElement selMessagesSubject;

    @FindBy(how = How.XPATH, using = "//p[contains(.,'List of Referred Friends')]")
    protected WebElement lblListOfReferredFriend;

    @FindBy(how = How.ID, using = "quickcashierFrame")
    protected WebElement elmntCreditCardPopupFrame;

    @FindBy(how = How.XPATH, using = "//a[.='My Account']/ancestor::div[@id='myaccount_left']")
    protected WebElement elmntMyAccountLeftPane;

    @FindBy(how = How.XPATH, using = "//div[normalize-space(.)='Welcome to SportsBetting']/following-sibling::div[1]")
    protected WebElement elmntMyAccountPage;

    @FindBy(how = How.XPATH, using = "//legend[.='Personal information']/following-sibling::ul[./li/label[.='First name:']][./li/label[.='Last name:']][./li/label[.='Time Zone:']]")
    protected WebElement elmntPersonal;

    @FindBy(how = How.XPATH, using = "//h1[contains(.,'Refer a Friends Traffic Sources')]")
    protected WebElement lblReferFriendHeader;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//select [@id='Subject']//option[.='Deposit']"),
            @FindBy(how = How.XPATH, using = "//select [@id='subject-select']//option[.='Deposit']")
    })
    protected WebElement chkDepositRadio;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//p[contains(text(),'Your message')]//following::button[contains(text(),'CLOSE')]"),
            @FindBy(how = How.XPATH, using = "//p[contains(text(),'Your message')]//following::span[contains(text(),'CLOSE')]")
    })
    protected WebElement btnClose;
    @FindBy(how = How.XPATH, using = "//a[.='Payouts']/preceding::a[.='Deposit'][1]")
    protected WebElement clickDeposit;

    @FindBy(how = How.XPATH, using = "//button[.='Deposit']/following::a[@class='cashier-paymentoptions-item'][1]")
    protected WebElement depositButton;

    @FindBy(how = How.XPATH, using = "//a[.='Payouts']")
    protected WebElement clickPayout;

    @FindBy(how = How.ID, using = "iframeCashier")
    protected WebElement frameCashier;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Withdrawal Request')]")
    protected WebElement withdrawalText;


    protected WebElement elmntFirstName;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]/ancestor::a")
    protected WebElement elmntNxt;

    protected String strFirstNameInReferredFriendLocator = new StringBuilder()
            .append("//table[contains(@class,'record')]//span[contains(.,'")
            .append("<<FIRSTNAME>>")
            .append("')]").toString();

    protected String strMyAccountSubLinkLocator = new StringBuilder()
            .append("//a[.='My Account']/ancestor::div[@id='myaccount_left']//a[normalize-space(.)='")
            .append("<<SUBTAB>>")
            .append("']").toString();

    protected String strMobFirstNameInReferredFriendLocator = new StringBuilder()
            .append("//div[@class='ui-block-a']/child::div[.='")
            .append("<<FIRSTNAME>>")
            .append("')]").toString();

    //Regression elements

    @FindBy(how = How.XPATH, using = "//a[@id ='myaccount-option']")
    protected WebElement elmntMyAccountTab;

    @FindBy(how = How.XPATH, using = "(//a[text() ='My Account'])[3]")
    protected WebElement elmntFirstHeader;

    @FindBy(how = How.XPATH, using = "(//a[text() ='Useful Links'])")
    protected WebElement elmntSecondHeader;

    @FindBy(how = How.XPATH, using = "(//a[@class='dropdown_parent'])[1]")
    protected WebElement elmntFirstHeader1;

    @FindBy(how = How.XPATH, using = "(//a[@class='dropdown_parent'])[2]")
    protected WebElement elmntFirstHeader2;

    protected String accountTabs = new StringBuilder()
            .append("//a[text()='")
            .append("<<Caps>>")
            .append("']")
            .toString();
    @FindBy(how = How.XPATH, using = "(//a[text()='Refer a Friend'])[2]")
    protected WebElement elmntReferAFriend;

    @FindBy(how = How.XPATH, using = "//a[text()='Deposit Funds']")
    protected WebElement elmntDepositHeader;

    protected String depositTabs = new StringBuilder()
            .append(("//button[text()='"))
            .append("<<Caps>>")
            .append("']")
            .toString();
    @FindBy(how = How.XPATH, using = "//a[text()='Change Payment Method']")
    protected WebElement elmntPaymentTab;

    @FindBy(how = How.XPATH, using = "//iframe[@id ='quickcashierFrame']")
    protected WebElement elmntIframe;

    @FindBy(how = How.XPATH, using = "//input[@id='CardNumber']")
    protected WebElement elmntInsertDigits;

    @FindBy(how = How.XPATH, using = "//input[@id='CardExpiry']")
    protected WebElement txtexpiry;

    @FindBy(how = How.XPATH, using = "//input[@id='CardCVC']")
    protected WebElement txtCvv;

    @FindBy(how = How.ID, using = "convertedamount")
    protected WebElement txtAmount;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-block btn-primary']")
    protected WebElement btnDepositFunction;

    @FindBy(how = How.XPATH, using = "//a[@class ='simple-close-button-new']")
    protected WebElement elmntConformationTab;

    @FindBy(how = How.XPATH, using = "//button[@id ='BtnAdd']")
    protected WebElement btnAddCard;

    @FindBy(how = How.XPATH, using = "//a[text()='Change Payment Method']")
    protected WebElement elmntPaymentChange;

    @FindBy(how = How.XPATH, using = "//button[text() ='Deposit']")
    protected WebElement btnRedirectedPage;

    @FindBy(how = How.XPATH, using = "//h2[text() ='Your SportsBetting Profile']")
    protected WebElement elmntProfilePage;

    @FindBy(how = How.XPATH, using = "//a[text() ='My Profile']")
    protected WebElement elmntProfileClick;

    @FindBy(how = How.XPATH, using = "(//a[@class ='dropdown_parent'])[1]")
    protected WebElement selPayout;

    @FindBy(how = How.XPATH, using = "//a[text() ='View My Payout History']")
    protected WebElement elmntPayoutHistory;

    @FindBy(how = How.XPATH, using = "//button[@type='Submit']")
    protected WebElement btnRefreshButton;

    @FindBy(how = How.XPATH, using = "//p[text()='There are currently no payout requests to show.']")
    protected WebElement elmntPayoutRefreshPage;

    @FindBy(how = How.XPATH, using = "//a[text() ='Request a New Payout']")
    protected WebElement elmntnewPayout;

    @FindBy(how = How.XPATH, using = "//iframe[@id ='payoutFrame']")
    protected WebElement elmntIframe1;

    @FindBy(how = How.XPATH, using = "//button[@class ='dotbutton simple-close-button--back']")
    protected WebElement btnNewPage;

    @FindBy(how = How.XPATH, using = "//a[text() ='Pending Wagers']")
    protected WebElement elmntPendingWager;

    @FindBy(how = How.XPATH, using = "//span[text() ='Ticket']")
    protected WebElement elmntPendingWagerTicket;

    @FindAll({
            @FindBy(how = How.XPATH, using = "(//span)[24]"),
            @FindBy(how = How.XPATH, using = "((//table[@class='record'])[1]//span)[2]")
    })
    protected WebElement elmntTicketNumber;

    @FindBy(how = How.XPATH, using = "//h2[text()='Ticket Wager Detail']")
    protected WebElement elmntTicket;

    @FindBy(how = How.XPATH, using = "(//div[@class='hidden trn_detail wager_detail'])[7]")
    protected WebElement elmntTicketTxt;

    @FindBy(how = How.XPATH, using = "//table[@class ='record']")
    protected WebElement elmntCollapseTicket;

    @FindBy(how = How.XPATH, using = "//a[text() ='Graded Wagers'] ")
    protected WebElement elmntGradedWagers;

    @FindBy(how = How.XPATH, using = "//input[@id='beginDate']")
    protected WebElement selBeginDate;

    @FindBy(how = How.XPATH, using = "//a[@class ='ui-datepicker-prev ui-corner-all']")
    protected WebElement selPreviousMonth;

    @FindBy(how = How.XPATH, using = "//div[@class ='wagers_table_wrapper']")
    protected WebElement elmntGradedWager;

    @FindBy(how = How.XPATH, using = "//input[@id='endDate']")
    protected WebElement selEndDate;

    @FindBy(how = How.XPATH, using = "//select[@id ='PageSize']")
    protected WebElement selPageSize;

    @FindBy(how = How.XPATH, using = "//a[text() ='Transaction History']")
    protected WebElement elmntTransactionHistory;

    @FindBy(how = How.XPATH, using = "//a[text()='11']")
    protected WebElement selStartDate;

    @FindBy(how = How.XPATH, using = "//a[text()='14']")
    protected WebElement elmntEndDateDefault;

    @FindBy(how = How.XPATH, using = "(//option)[1]")
    protected WebElement selShow;

    @FindBy(how = How.XPATH, using = "//span[text()='Refresh']")
    protected WebElement btnRefreshRequest;

    @FindBy(how = How.XPATH, using = "//div[@class ='wagers_table_wrapper']")
    protected WebElement elmntTransactionPage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "(//table[@class='record']//a)[7]")
    })
    protected WebElement elmntDocumentHeader;

    @FindAll({
            @FindBy(how = How.XPATH, using = "(//table[@class='record']//a)[1]")
    })
    protected WebElement elmntDocumentHeaderMobile;

    @FindBy(how = How.XPATH, using = "((//table[@class='record'])[2]//span)[1]")
    protected WebElement elmntDocumentHeader1;

    @FindBy(how = How.XPATH, using = "//span[text()='Doc #']")
    protected WebElement elmntCollapsedHeader;

    @FindBy(how = How.XPATH, using = "//a[@id='message-option']")
    protected WebElement elmntNewMessage;

    @FindBy(how = How.XPATH, using = "//h2[text()='Your messages history']")
    protected WebElement elmntNewMessageHistory;

    @FindBy(how = How.XPATH, using = "//a[text() ='Daily Figures']")
    protected WebElement elmntDailyFigures;

    @FindBy(how = How.XPATH, using = "//h2[text() ='Current Daily Figures']")
    protected WebElement elmntDailyFiguresPage;

    protected String dailyFigures = new StringBuilder()
            .append(("//span[text() ='"))
            .append("<<Caps>>")
            .append("']")
            .toString();

    @FindBy(how = How.XPATH, using = "//a[@class ='figurelink']")
    protected WebElement elmntLinkUnderDailyFigures;

    @FindBy(how = How.XPATH, using = "//div[@class='wagers_table_wrapper']//b[contains(text(),'Ticket Details: #')]")
    protected WebElement elmntLink;

    @FindAll({
            @FindBy(how = How.XPATH, using = "(//a)[52]"),
            @FindBy(how = How.XPATH, using = "//a[contains(text(),'Last')]")
    })
    protected WebElement elmntLastWeek;

    @FindBy(how = How.XPATH, using = "//fieldset[@class='filters']")
    protected WebElement elmntLastWeekFilters;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Current')]")
    protected WebElement elmntCurrentWeek;

    @FindBy(how = How.XPATH, using = "//table[@class ='record']")
    protected WebElement elmntCurrentWeekRecord;

    @FindBy(how = How.XPATH, using = "//a[text()='Limits Information']")
    protected WebElement elmntLimitedInformation;

    @FindBy(how = How.ID, using = "selectSport")
    protected WebElement elmntSport;

    @FindBy(how = How.XPATH, using = "//option[@value='Baseball']")
    protected WebElement selAnyGame;

    @FindBy(how = How.XPATH, using = "(//h4)[2]")
    protected WebElement elmntAnyGames;

    @FindBy(how = How.XPATH, using = "(//a[@class='dropdown_parent'])[2]")
    protected WebElement elmnReferAFriend;

    protected String referfriend = new StringBuilder()
            .append(("//label[text() ='"))
            .append("<<Caps>>")
            .append("']")
            .toString();
    protected String referafriend = new StringBuilder()
            .append(("//a[text() ='"))
            .append("<<Caps>>")
            .append("']")
            .toString();

    @FindBy(how = How.XPATH, using = "(//h3)[5]")
    protected WebElement elmntCopyAndPaste;

    @FindBy(how = How.XPATH, using = "(//h3)[6]")
    protected WebElement elmntSocialMedia;

    @FindBy(how = How.XPATH, using = "(//h3)[7]")
    protected WebElement elmntDetails;

    @FindBy(how = How.XPATH, using = "//strong[@id ='raflink']")
    protected WebElement elmntChoices1;

    @FindBy(how = How.XPATH, using = "(//a[text()='Click here'])[2]")
    protected WebElement elmntClickHere;

    @FindBy(how = How.XPATH, using = "//a[@class ='fbicon']")
    protected WebElement elmntFbIcon;

    @FindBy(how = How.XPATH, using = "//div[@class ='login_form_container']")
    protected WebElement elmntFbIconPage;

    @FindBy(how = How.ID, using = "FirstName1")
    protected WebElement txtFirstName;

    @FindBy(how = How.ID, using = "LastName1")
    protected WebElement txtLastName;

    @FindBy(how = How.ID, using = "Email1")
    protected WebElement txtEmail;

    @FindBy(how = How.ID, using = "button-referfriend-save")
    protected WebElement btnSubmit;

    @FindBy(how = How.XPATH, using = "//a[text() ='Back to my account']")
    protected WebElement elmntReferAFriendUnderMyAccount;

    @FindBy(how = How.CLASS_NAME, using = "cloudsponge-launch")
    protected WebElement elmntAddressBook;

    @FindBy(how = How.XPATH, using = "//li[@data-launcher='uol']")
    protected WebElement elmntAnyChoice;

    @FindBy(how = How.XPATH, using = "//input[@value='Sign in']")
    protected WebElement elmntAddressBookUnderMyAccount;

  @FindBy(how = How.XPATH, using = "(//em[@class='cloudsponge-glyph cross'])[3]")
    protected WebElement iconCloseUnderAddressBookUnderMyAccount;

    @FindBy(how = How.XPATH, using = "//a[text() ='View My Referrals']")
    protected WebElement elmntViewReferrals;

    @FindBy(how = How.XPATH, using = "//p[text() ='List of Referred Friends:']")
    protected WebElement elmntPastReferrals;

    @FindBy(how = How.XPATH, using = "//a[text() ='Bet Calculator']")
    protected WebElement elmntBetCalculator;

    @FindBy(how = How.ID, using = "american")
    protected WebElement txtCalculatorPage;

    protected String seeOptions = new StringBuilder()
            .append(("//li[text() ='"))
            .append("<<Caps>>")
            .append("']")
            .toString();

    @FindBy(how = How.XPATH, using = "//li[text() ='Odds Converter']")
    protected WebElement elmntOddCalculator;

    @FindBy(how = How.ID, using = "decimal")
    protected WebElement elmntDecimal;

    @FindBy(how = How.ID, using = "fractional1")
    protected WebElement elmntFraction1;

    @FindBy(how = How.ID, using = "fractional2")
    protected WebElement elmntFraction2;

    @FindBy(how = How.XPATH, using = "//li[text() ='Win And Risk Calculator']")
    protected WebElement elmntWinAndRisk;

    @FindBy(how = How.ID, using = "americanwinrisk")
    protected WebElement txtOdds;

    @FindBy(how = How.ID, using = "decimalwinrisk")
    protected WebElement elmntDecimalRisk;

    @FindBy(how = How.ID, using = "fractional1winrisk")
    protected WebElement elmntFraction1Risk;

    @FindBy(how = How.ID, using = "fractional2winrisk")
    protected WebElement elmntFraction2Risk;

    @FindBy(how = How.ID, using = "americanrisk")
    protected WebElement txtRisk;

    @FindBy(how = How.ID, using = "americanwin")
    protected WebElement elmntAmericanWin;
    @FindBy(how = How.ID, using = "decimalrisk")
    protected WebElement elmntDecimalRisk1;
    @FindBy(how = How.ID, using = "decimalwin")
    protected WebElement elmntDecimalWin;
    @FindBy(how = How.ID, using = "fractionalrisk")
    protected WebElement elmntFraction2Risk1;
    @FindBy(how = How.ID, using = "fractionalwin")
    protected WebElement elmntFraction1win1;

    @FindBy(how = How.ID, using = "tab-parlay-calculator")
    protected WebElement elmntParlayCalculator;

    @FindBy(how = How.XPATH, using = "(//input[@id ='parlayamerican'])[1]")
    protected WebElement txtValueOnHeaders;

    @FindBy(how = How.XPATH, using = "(//input[@id ='parlayamerican'])[2]")
    protected WebElement txtValueOnHeaders2;

    @FindBy(how = How.XPATH, using = "(//select[@id ='linetype'])[1]")
    protected WebElement selDropDown;

    @FindBy(how = How.XPATH, using = "(//select[@id ='linetype'])[2]")
    protected WebElement selDropDown1;


    @FindBy(how = How.XPATH, using = "(//option[text() ='Spread'])[1]")
    protected WebElement selDropDownSpread;

    @FindBy(how = How.XPATH, using = "(//option[text() ='Spread'])[2]")
    protected WebElement selDropDown1Spread;

    @FindBy(how = How.XPATH, using = "(//select[@id ='sportTypeSelect'])[1]")
    protected WebElement selSportType;

    @FindBy(how = How.XPATH, using = "(//select[@id ='sportTypeSelect'])[2]")
    protected WebElement selSportType1;


    @FindBy(how = How.XPATH, using = "(//option[text() ='MLB'])[1]")
    protected WebElement selSportTypeMLB;

    @FindBy(how = How.XPATH, using = "(//option[text() ='MLB'])[2]")
    protected WebElement selSportType1MLB;

    @FindBy(how = How.ID, using = "bet")
    protected WebElement txtBet;

    @FindBy(how = How.CLASS_NAME, using = "calculate-btn")
    protected WebElement btnCalculate;

    @FindBy(how = How.XPATH, using = "(//input[@class ='risk-value'])[1]")
    protected WebElement elmntWinnings;

    @FindBy(how = How.XPATH, using = "(//button[@class ='reset-btn'])[1]")
    protected WebElement btnReset;

    @FindBy(how = How.XPATH, using = "(//button[@class ='parlay-new-row-btn'])[1]")
    protected WebElement elmntAnotherRow;

    @FindBy(how = How.XPATH, using = "(//input[@name ='parlayamerican'])[8]")
    protected WebElement elmntAddedRow;

    @FindBy(how = How.ID, using = "tab-teaser-calculator")
    protected WebElement elmntTeaserCalculator;

    @FindBy(how = How.ID, using = "Teasergroup")
    protected WebElement elmntGroupType;
    @FindBy(how = How.XPATH, using = "//option[text()='SB 06.5 Point Teaser']")
    protected WebElement elmntGroupTypeTeaser;

    @FindBy(how = How.XPATH, using = "(//input[@name='teaseramerican'])[1]")
    protected WebElement txtValuesOfTeaser;
    @FindBy(how = How.XPATH, using = "(//input[@name='teaseramerican'])[2]")
    protected WebElement txtValues1OfTeaser;


    @FindBy(how = How.XPATH, using = "(//select[@class ='select-linetypeSelectteaser'])[1]")
    protected WebElement elmntTeaserOption;
    @FindBy(how = How.XPATH, using = "(//option[text()='Spread'])[8]")
    protected WebElement elmntTeaser1Option;
    @FindBy(how = How.XPATH, using = "(//select[@class ='select-linetypeSelectteaser'])[2]")
    protected WebElement elmntTeaserOption1;
    @FindBy(how = How.XPATH, using = "(//option[text()='Spread'])[9]")
    protected WebElement elmntTeaser2Option;
    @FindBy(how = How.XPATH, using = "(//select[@name='sporttypeteaser'])[1]")
    protected WebElement selTeaserOption2;
    @FindBy(how = How.XPATH, using = "(//option[text()='NBA'])[1]")
    protected WebElement selTeaser2Option2;
    @FindBy(how = How.XPATH, using = "(//select[@name='sporttypeteaser'])[2]")
    protected WebElement selTeaser1Option1;
    @FindBy(how = How.XPATH, using = "(//option[text()='NBA'])[2]")
    protected WebElement selTeaser2Option1;

    @FindBy(how = How.XPATH, using = "(//input[@name='teaserbyupoint'])[1]")
    protected WebElement elmntNewPoint;

    @FindBy(how = How.XPATH, using = "(//input[@name='teaserbyupoint'])[2]")
    protected WebElement elmntNewPoint1;

    @FindBy(how = How.ID, using = "betteaser")
    protected WebElement txtBetTeaser;

    @FindBy(how = How.CLASS_NAME, using = "calculate-btn-teaser")
    protected WebElement elmntCalculator1;

    @FindBy(how = How.ID, using = "winteaser")
    protected WebElement elmntWinningsUnderTeaser;

    @FindBy(how = How.XPATH, using = "(//button[@class='reset-btn'])[2]")
    protected WebElement btnResetButton;

    @FindBy(how = How.XPATH, using = "(//button[@title ='Append Row'])[2]")
    protected WebElement btnAddRow;

    @FindBy(how = How.XPATH, using = "(//input[@id ='teaseramerican'])[8]")
    protected WebElement elmntAddRow;

    protected String seeHeaders = new StringBuilder()
            .append(("//h2[text() ='"))
            .append("<<Caps>>")
            .append("']")
            .toString();

    @FindBy(how = How.XPATH, using = "//select[@class ='select']")
    protected WebElement elmntChoices;

    @FindBy(how = How.XPATH, using = "(//option)[3]")
    protected WebElement selChoices2;
    @FindBy(how = How.XPATH, using = "(//option)[2]")
    protected WebElement selChoices1;
    @FindBy(how = How.XPATH, using = "(//option)[4]")
    protected WebElement selChoices3;

    @FindBy(how = How.XPATH, using = "//textarea[@id='text']")
    protected WebElement txtWriteNotes;
    @FindBy(how = How.XPATH, using = "(//button)[3]")
    protected WebElement btnSend;
    @FindBy(how = How.XPATH, using = "//p[text()='hello...']")
    protected WebElement elmntMessageHistory;

    @FindBy(how = How.CLASS_NAME, using = "reset")
    protected WebElement btnCancelButton;

    @FindBy(how = How.XPATH, using = "//span[text() ='Message(s) details']")
    protected WebElement elmntMessageDetailsProvided;
    @FindBy(how = How.XPATH, using = "(//div[@class='messageBd']//a)[2]")
    protected WebElement elmntMessageDetails;
    @FindAll({@FindBy(how = How.XPATH, using = "(//li[@class='even user']//em[.='You said…'])[1]")
    })
    protected WebElement elmntMessagesFromAdmin;

    @FindBy(how = How.XPATH, using = "//a[text()='Useful Links']")
    protected WebElement elmntUsefulLinks;
    @FindBy(how = How.XPATH, using = "//a[text()='Sports Schedules']")
    protected WebElement elmntSportsSchedule;

    @FindBy(how = How.XPATH, using = "//h2[text()='When are lines posted?']")
    protected WebElement elmntSportsSchedulePosted;
    @FindBy(how = How.XPATH, using = "//strong[text() ='MLB Futures']")
    protected WebElement elmntSchedule1;
    @FindBy(how = How.XPATH, using = "//strong[text() ='NFL Futures']")
    protected WebElement elmntSchedule2;
    @FindBy(how = How.XPATH, using = "//strong[text() ='NCAA Football Futures']")
    protected WebElement elmntSchedule3;

    @FindBy(how = How.XPATH, using = "//a[text()='How To Bet Online']")
    protected WebElement elmntHowToBetOnline;

    @FindBy(how = How.XPATH, using = "//h2[text()='Spread Betting']")
    protected WebElement elmntHowToBeOnSpreadBetting;
    @FindBy(how = How.XPATH, using = "//h2[text()='Spread Betting']")
    protected WebElement elmntHelpOption1;
    @FindBy(how = How.XPATH, using = "//h2[text()='Moneyline Betting']")
    protected WebElement elmntHelpOption2;

    @FindBy(how = How.XPATH, using = "//h2[text()='Favorites']")
    protected WebElement elmntHelpOption3;

    @FindBy(how = How.XPATH, using = "//h2[text()='Underdogs']")
    protected WebElement elmntHelpOption4;

    @FindBy(how = How.XPATH, using = "(//a[text()='Affiliate Program'])[1]")
    protected WebElement elmntAffiliateProgram;
    @FindBy(how = How.XPATH, using = "(//a[text()='Home'])[1]")
    protected WebElement elmntRedirectedPages;


    //My Account Mobile Elements

    @FindBy(how = How.XPATH, using = "//span[@class ='ui-icon ui-icon-bars ui-icon-shadow']")
    protected WebElement elmntLeftNavigator;

    @FindBy(how = How.XPATH, using = "//a[text() ='My Account']")
    protected WebElement elmntMyAccountMobileTab;

    protected String viewHeaders = new StringBuilder()
            .append(("//a[text() ='"))
            .append("<<Caps>>")
            .append("']")
            .toString();

    protected String viewThreeHeaders = new StringBuilder()
            .append(("//span[text() ='"))
            .append("<<Caps>>")
            .append("']")
            .toString();

    @FindBy(how = How.XPATH, using = "//a[text() ='Customer Service']")
    protected WebElement elmntCustomerLink;

    @FindBy(how = How.XPATH, using = "//a[text()='Profile']")
    protected WebElement elmntProfit;

    @FindBy(how = How.XPATH, using = "//span[@class ='ui-icon ui-icon-plus ui-icon-shadow']")
    protected WebElement elmntInformation;

    @FindBy(how = How.XPATH, using = "(//div[@class='ui-collapsible-content'])[1]")
    protected WebElement elmntInformationHeader;

    @FindBy(how = How.XPATH, using = "//div[text() ='Email address:']")
    protected WebElement elmntInformationDetails;

    @FindBy(how = How.XPATH, using = "(//span[@class ='ui-icon ui-icon-shadow ui-icon-minus'])[1]")
    protected WebElement elmntInformationMinus;

    @FindBy(how = How.XPATH, using = "(//h3[@class='ui-collapsible-heading ui-collapsible-heading-collapsed'])[1]")
    protected WebElement elmntCollapsedProfileInformation;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-icon ui-icon-shadow ui-icon-minus'])[1]")
    protected WebElement elmntTimeZone;

    @FindBy(how = How.XPATH, using = "//span[text()='EST_Eastern']")
    protected WebElement elmntDefaultTimeZone;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[@id='TimeZoneObject']"),
            @FindBy(how = How.XPATH, using = "(//span[@class='ui-icon ui-icon-bars ui-icon-shadow'])[2]")
    })
    protected WebElement elmntChangeTimeZone;
    @FindBy(how = How.XPATH, using = "//a[text()='CST_Central']")
    protected WebElement elmntChoicesOfTimeZone;

    @FindBy(how = How.XPATH, using = "//span[text()='CST_Central']")
    protected WebElement elmntChangedTimeZone;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-icon ui-icon-shadow ui-icon-minus'])[1]")
    protected WebElement elmntMinusUnderTimeZone;

    @FindBy(how = How.XPATH, using = "//span[text()='Time Zone']")
    protected WebElement elmntCollapsedTimeZone;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-icon ui-icon-shadow ui-icon-plus'])[3]")
    protected WebElement elmntOddOnes;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[@id='oddtype']"),
            @FindBy(how = How.XPATH, using = "//span[text()='Decimal']")
    })
    protected WebElement elmntDefaultOddOnes;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[@id='OddTypeObj']"),
            @FindBy(how = How.XPATH, using = "(//span[@class='ui-icon ui-icon-bars ui-icon-shadow'])[3]")
    })
    protected WebElement elmntChangeOddOnes;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[text()='Fractional']"),
            @FindBy(how = How.XPATH, using = "//a[text()='American']")
    })
    protected WebElement elmntChoiceOfOddOnes;

    @FindBy(how = How.XPATH, using = "//span[text()='American']")
    protected WebElement elmntChoiceChanged;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-icon ui-icon-shadow ui-icon-minus'])[2]")
    protected WebElement elmntMinusOddOnes;

    @FindBy(how = How.XPATH, using = "//span[text()='Odds Type']")
    protected WebElement elmntHiddenOddOnes;

    @FindBy(how = How.XPATH, using = "//a[text()='Customer Service']")
    protected WebElement elmntCustomerService;

    @FindBy(how = How.XPATH, using = "(//a[@class='ui-link-inherit'])[1]")
    protected WebElement elmntRedirectedPage;

    @FindBy(how = How.XPATH, using = "//a[text()='Payouts']")
    protected WebElement elmntPayOuts;

    @FindBy(how = How.XPATH, using = "//h2[@class='simple-areaheading']")
    protected WebElement elmntRedirectedPageUnderPayouts;

    protected String viewWithDrawlOptions = new StringBuilder()
            .append(("//strong[text() ='"))
            .append("<<Caps>>")
            .append("']")
            .toString();

    @FindBy(how = How.XPATH, using = "//a[text()='Deposit Funds']")
    protected WebElement elmntDeposit;

    @FindBy(how = How.XPATH, using = "//button[text()='Deposit']")
    protected WebElement elmntRedirectedPageUnderDeposit;

    @FindBy(how = How.XPATH, using = "//a[text()='Refer My Friends']")
    protected WebElement elmntReferMyFriend;

    protected String viewSubTabs = new StringBuilder()
            .append(("//a[text() ='"))
            .append("<<Caps>>")
            .append("']")
            .toString();

    @FindBy(how = How.XPATH, using = "//a[text()='Refer Friends']")
    protected WebElement elmntReferFriend;

    protected String viewReferFriends = new StringBuilder()
            .append(("//label[text() ='"))
            .append("<<Caps>>")
            .append("']")
            .toString();

    @FindBy(how = How.XPATH, using = "(//li)[31]")
    protected WebElement elmntCopyPaste;

    @FindBy(how = How.XPATH, using = "(//li)[32]")
    protected WebElement elmntSocialMedia1;

    @FindBy(how = How.XPATH, using = "(//li)[33]")
    protected WebElement elmntDetailsVision;

    @FindBy(how = How.XPATH, using = "//h3[text()='YOUR INFORMATION']")
    protected WebElement elmntReferralLink;
    @FindBy(how = How.XPATH, using = "//a[text()='Click here']")
    protected WebElement lnkClickHereTab;

    @FindBy(how = How.XPATH, using = "//a[@class='fbicon ui-link']")
    protected WebElement elmntSocialMediaIcon;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='login_top_banner']"),
            @FindBy(how = How.XPATH, using = "//div[@class ='login_form_container']")
    })
    protected WebElement elmntFbIconMobile;

    @FindBy(how = How.ID, using = "ListReferFriends[0]_FirstName")
    protected WebElement txtUserNameUnderReferFriend;

    @FindBy(how = How.ID, using = "ListReferFriends[0]_LastName")
    protected WebElement txtLastNameUnderReferFriend;

    @FindBy(how = How.ID, using = "ListReferFriends[0]_Email")
    protected WebElement txtEmailUnderReferFriend;

    @FindBy(how = How.ID, using = "referSend")
    protected WebElement btnSubmitUnderReferFriend;

    @FindBy(how = How.XPATH, using = "//a[text() ='Back to my account']")
    protected WebElement elmntRedirectedPageUnderReferFriend;

    @FindBy(how = How.XPATH, using = "//a[text()=' Add from Address Book']")
    protected WebElement lnkAddAddressBook;

    @FindBy(how = How.XPATH, using = "(//li)[53]")
    protected WebElement elmntAnyChoiceUnderReferFriend;

    @FindBy(how = How.ID, using = "cloudsponge-loader-text")
    protected WebElement elmntSelectedChoices;

    @FindBy(how = How.XPATH, using = "//a[text()='View My referrals']")
    protected WebElement elmtViewReferralsUnderReferFriend;

    @FindBy(how = How.XPATH, using = "//span[text()='Summary']")
    protected WebElement elmntPastRefferalsUnderReferMyFriend;

    @FindBy(how = How.XPATH, using = "//a[text()='Reports']")
    protected WebElement elmntReportsUnderMyAccount;

    @FindBy(how = How.XPATH, using = "//a[text()='Pending Wagers']")
    protected WebElement elmntPendingWagerUnderReports;

    @FindBy(how = How.XPATH, using = "//span[text() ='Monday (-5) ']")
    protected WebElement elmntMonday;

    @FindBy(how = How.XPATH, using = "//span[text()='Tuesday (-5) ']")
    protected WebElement elmntTuesday;

    protected String viewPendingWager = new StringBuilder()
            .append(("//span[text() ='"))
            .append("<<Caps>>")
            .append("']")
            .toString();

    protected String viewPendingWager1 = new StringBuilder()
            .append(("//span[contains(text(), '"))
            .append("<<Caps>>")
            .append("')]")
            .toString();
    @FindBy(how = How.XPATH, using = "//span[text()='24 hours']")
    protected WebElement elmntTwentyFourHours;

    @FindAll({
            @FindBy(how = How.XPATH, using = "(//span[contains(text(), 'Wager Number')])[1]"),
            @FindBy(how = How.XPATH, using = "(//span[text()='Wager Number: 1 '])[1]")
    })
    protected WebElement elmnt24Hours;

    @FindBy(how = How.XPATH, using = "//span[text()='48 hours']")
    protected WebElement elmntFourtyEightHours;

    @FindBy(how = How.XPATH, using = "//span[text()='All']")
    protected WebElement elmntAllTabUnderReports;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Ticket Number')]"),
            @FindBy(how = How.XPATH, using = "//span[text()='Ticket Number: 476459329 ']")
    })
    protected WebElement elmntAllTabs;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-icon ui-icon-plus ui-icon-shadow'])[1]")
    protected WebElement elmntTicketNumberInMobile;

    @FindBy(how = How.XPATH, using = "(//span[text()='Wager Number: 1 '])[2]")
    protected WebElement elmntTicketNumberExpands;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-icon ui-icon-plus ui-icon-shadow'])[1]")
    protected WebElement elmntWagerTicket;

    @FindBy(how = How.XPATH, using = "(//div[text()='Accepted:'])[2]")
    protected WebElement elmntAllTickets;

    @FindBy(how = How.XPATH, using = "//a[text()='Graded Wagers']")
    protected WebElement elmntGradedWagerInMobile;

    @FindBy(how = How.XPATH, using = "//span[text()='24 hours']")
    protected WebElement elmntTwentyFourHoursUnderGradedWager;

    @FindBy(how = How.XPATH, using = "//span[text()='Select range']")
    protected WebElement elmntSelectRange;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-icon ui-icon-grid ui-icon-shadow'])[1]")
    protected WebElement elmntStartDate;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[contains(@class, 'slidemonth') and contains(@class, 'up-a')]/preceding::div[contains(@class, 'month')][2]"),
            @FindBy(how = How.XPATH, using = "//div[text()='Mar']")
    })
    protected WebElement elmntSelectedDate;

    @FindBy(how = How.XPATH, using = "//span[text()='Set Date']")
    protected WebElement elmntSetStartDate;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-icon ui-icon-grid ui-icon-shadow'])[2]")
    protected WebElement elmntEndDate;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[contains(@class, 'slidemonth') and contains(@class, 'up-a')]/preceding::div[contains(@class, 'month')][1]"),
            @FindBy(how = How.XPATH, using = "//div[text()='Apr']")
    })
    protected WebElement elmntSelectedEndDate;

    @FindBy(how = How.XPATH, using = "//input[@id='range-submit']")
    protected WebElement btnSubmitUnderReports;
    @FindBy(how = How.XPATH, using = "(//span[@class='ui-btn-inner'])[12]")
    protected WebElement elmntLandedGradedWager;

    @FindBy(how = How.XPATH, using = "//span[@class='ui-icon ui-icon-shadow ui-icon-plus']")
    protected WebElement elmntTicketUnderGradedWager;

    @FindBy(how = How.XPATH, using = "(//span[text()='Wager Number: 1 (Win)'])[1]")
    protected WebElement elmntTicketInMobile;

    @FindBy(how = How.XPATH, using = "(//a[@class='ui-collapsible-heading-toggle ui-btn ui-btn-up-a ui-fullsize ui-btn-icon-left'])[2]")
    protected WebElement elmntWagerCollapse;

    @FindBy(how = How.XPATH, using = "//a[text()='All Transactions']")
    protected WebElement elmntAllTransaction;

    @FindBy(how = How.XPATH, using = "//a[text()='Daily Figures']")
    protected WebElement elmntDialyFigures;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-btn-text'])[6]")
    protected WebElement elmntCurrentWeekInMobile;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-icon ui-icon-shadow ui-icon-minus'])[6]")
    protected WebElement elmntCurrentDay;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-btn-text'])[8]")
    protected WebElement elmntRedirectedCurrentWeek;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-btn-text'])[7]")
    protected WebElement elmntLastWeeksUnderDailyReport;

    @FindBy(how = How.XPATH, using = "//a[text()='Promotions']")
    protected WebElement elmntPromotionUnderMyAccount;

    @FindBy(how = How.XPATH, using = "//a[text()='50% Sports Welcome Bonus']")
    protected WebElement elmntFiftyPercent;

    @FindBy(how = How.XPATH, using = "//a[text()='$25 Risk-Free Props Bet']")
    protected WebElement elmntTwentyFiveDollars;

    @FindBy(how = How.XPATH, using = "//li[@id='promo-desc']")
    protected WebElement elmntPromoCode;

    @FindBy(how = How.XPATH, using = "//a[@id='term-promotion']")
    protected WebElement elmntTermsAndConditions;

    @FindBy(how = How.XPATH, using = "//h2[text()='Terms and Conditions']")
    protected WebElement elmntTerms;

    @FindBy(how = How.XPATH, using = "//a[text()='$50 Mobile Betting Free Play']")
    protected WebElement elmntMobileBetting;

    @FindBy(how = How.XPATH, using = "//a[text()='$25 Live In-Game Betting Free Play']")
    protected WebElement elmntLiveInBetting;

    @FindBy(how = How.XPATH, using = "//a[text()='7% Horse Rebate']")
    protected WebElement elmntHorseDebate;

    @FindBy(how = How.XPATH, using = "//a[text()='Refer-a-Friend: 100% up to $100 Plus $25 ']")
    protected WebElement elmntReferAFriendInMobile;

    @FindBy(how = How.XPATH, using = "//a[text()='Refer a Friend Now']")
    protected WebElement elmntReferAFreindUnderPromotions;

    @FindBy(how = How.XPATH, using = "//h3[text()='HOW TO GET YOUR REFER-A-FRIEND BONUS']")
    protected WebElement elmntRedirectedPageUnderReferral;

    @FindBy(how = How.XPATH, using = "//a[text()='REFER NOW']")
    protected WebElement elmntReferNowButtonUnderReferral;

    @FindBy(how = How.XPATH, using = "//h2[text()=' TELL YOUR FRIENDS AND START EARNING! ']")
    protected WebElement elmntRedirectedPageUnderPromotions;

    @FindBy(how = How.XPATH, using = "//a[text()='$100K GUARANTEED']")
    protected WebElement elmntMoneyGuaranteed;

    @FindBy(how = How.XPATH, using = "//a[text()='Learn more']")
    protected WebElement btnLearnMore;

    @FindBy(how = How.XPATH, using = "(//p)[2]")
    protected WebElement elmntPageUnderMoneyGuaranteed;

    @FindBy(how = How.XPATH, using = "(//a[text()='PLAY NOW'])[2]")
    protected WebElement btnPlayNow;

    @FindBy(how = How.XPATH, using = "//canvas")
    protected WebElement elmntPlayNowPage;

    @FindBy(how = How.XPATH, using = "(//a[text()='Terms & Conditions'])[1]")
    protected WebElement btnTermsAndConditionsUnderMoneyGuaranteed;

    @FindBy(how = How.XPATH, using = "//h4")
    protected WebElement elmntTermsAndConditions1;

    @FindBy(how = How.XPATH, using = "//a[text()='$10,000 WEEKLY CASH RACE']")
    protected WebElement elmntWeeklyCash;

    @FindBy(how = How.XPATH, using = "//a[text()='$5,000 WEEKLY SIT AND GO LEADERBOARD']")
    protected WebElement elmntWeeklySitAndLeaderBoard;

    @FindBy(how = How.XPATH, using = "//a[text()='20% MONTHLY RELOAD BONUS']")
    protected WebElement elmntMonthlyReloadBonus;

    @FindBy(how = How.XPATH, using = "//a[text()='10% WEEKLY CASINO REBATE']")
    protected WebElement elmntWeeklyCasinoRebate;

    @FindBy(how = How.XPATH, using = "//a[text()='$100,000 CASINO IRON MAN CONTEST']")
    protected WebElement elmntIronManContest;

    @FindBy(how = How.XPATH, using = "//h4")
    protected WebElement elmntTermsConditions;

    @FindBy(how = How.XPATH, using = "//a[text()='My Messages']")
    protected WebElement elmntMyMessagesTab;

    @FindBy(how = How.XPATH, using = "//span[text()='Compose a new message']")
    protected WebElement elmntComposeMessage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='ui-select']/div"),
            @FindBy(how = How.XPATH, using = "//select")
    })
    protected WebElement elmntDropDownUnderSubject;
    @FindBy(how = How.XPATH, using = "(//span[@class='ui-btn-text'])[12]")
    protected WebElement elmtFourtyFour;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-icon ui-icon-shadow ui-icon-minus'])[2]")
    protected WebElement elmntMinus;

    @FindBy(how = How.XPATH, using = "//a[text()='PLAY NOW']")
    protected WebElement elmntCasinoRebate;

    @FindBy(how = How.XPATH, using = "(//textarea)[1]")
    protected WebElement elmntMessageField;

    protected String viewComposeMessage = new StringBuilder()
            .append(("(//span[text() ='"))
            .append("<<Caps>>")
            .append("'])[1]")
            .toString();
    protected String viewComposeMessage1 = new StringBuilder()
            .append(("(//span[text() ='"))
            .append("<<Caps>>")
            .append("'])[2]")
            .toString();
    protected String viewComposeMessageOption = new StringBuilder()
            .append(("//option[text() ='"))
            .append("<<Caps>>")
            .append("']")
            .toString();

    @FindBy(how = How.XPATH, using = "(//span[text()='Send'])[1]")
    protected WebElement btnSendUnderMyMessage;

//    @FindBy(how = How.XPATH, using = "(//div[text()='hello...'])[1]")
//    protected WebElement elmntSendMessage;

    protected String elmntSendMessage = new StringBuilder()
            .append("(//ul[@id='msgList'])[1]/descendant::div[contains(text(), '")
            .append("<<MESSAGE>>")
            .append("')]")
            .toString();

    @FindBy(how = How.XPATH, using = "(//span[text()='Cancel'])[1]")
    protected WebElement btnCancelUnderMyMessage;

    @FindBy(how = How.XPATH, using = "(//div[text()='TestingUser1...'])[1]")
    protected WebElement elmntDeletedMessages;

    @FindBy(how = How.XPATH, using = "//span[text()='Your messages History']")
    protected WebElement elmntMessageHistoryInMobile;

    @FindBy(how = How.XPATH, using = "(//li[@id='msg-hist-countainer'])[2]")
    protected WebElement elmntAllMessages;

    @FindBy(how = How.XPATH, using = "(//span[@class='ui-icon ui-icon-plus ui-icon-shadow'])[2]")
    protected WebElement elmntMessageDetailsInMobile;

    @FindBy(how = How.XPATH, using = "(//div[@class='ui-block no-shadow label-content-split'])[2]")
    protected WebElement elmntDateAndTime;

    @FindBy(how = How.XPATH, using = "(//a[text()='Reply'])[1]")
    protected WebElement elmntReply;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='ui-collapsible-content']/descendant::textarea[contains(@id, 're')][1]"),
            @FindBy(how = How.ID, using = "19546096reply-text")
    })
    protected WebElement elmntMessageFieldUnderMessage;

    @FindBy(how = How.XPATH, using = "//span[text()='Next']")
    protected WebElement btnClickOnNext;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='history-unit'][4][contains(@style, 'block')]"),
            @FindBy(how = How.XPATH, using = "(//h5[text()='Deposit'])[6]")
    })
    protected WebElement elmntNewMessages;

    @FindBy(how = How.XPATH, using = "//span[text()='Previous']")
    protected WebElement btnPreviousOn;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='history-unit'][1][contains(@style, 'block')]"),
            @FindBy(how = How.XPATH, using = "(//h5[text()='Deposit'])[1]")
    })
    protected WebElement elmntNewMessageInMobile;

    @FindBy(how = How.XPATH, using = "//strong[text()='Bitcoin']")
    protected WebElement elmntDepositOption;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(), 'Description')])[1]")
    protected WebElement elmntAllTranactions;

    @FindBy(how = How.XPATH, using = "//input[@class='landing__widget-submit']")
    protected WebElement btnOptIn;

    @FindBy(how = How.XPATH, using = "//input[@class='landing__widget-input error']")
    protected WebElement txtUserNameUnderIronManContest;

    @FindBy(how = How.XPATH, using = "//h3")
    protected WebElement elmntPage;

    @FindBy(how = How.XPATH, using = "(//a[text()='PLAY NOW'])[1]")
    protected WebElement elmntPlayNowUnderCasinoRebate;

    @FindBy(how = How.XPATH, using = "//img[@id='imgLogoLoggedIn']")
    protected WebElement elmntPageRedirectedUnderCasinoRebate;

    @FindBy(how = How.XPATH, using = "(//img)[11]")
    protected WebElement btnDepositNow;

    @FindBy(how = How.XPATH, using = "//img[@id='imgLogoLoggedIn']")
    protected WebElement elmntPageUnderMonthlyRebate;

    @FindBy(how = How.XPATH, using = "//h3")
    protected WebElement elmntPageUnderWeeklySit;

    @FindBy(how = How.XPATH, using = "(//a[text()='Terms & Conditions'])[1]")
    protected WebElement lnkTermsAndConditions;

    @FindBy(how = How.XPATH, using = "//ul[@class='ui-listview']/descendant::a")
    protected List<WebElement> lnkMyAccountSubTabs;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'No')]")
    protected WebElement txtNoWagers;

    protected boolean boolResult = false;

    @FindBy(how = How.XPATH, using = "//ul[@id='promo-list']/descendant::a[1]")
    protected WebElement lnkPromotionUnderMyAccount;

    @FindBy(how = How.XPATH, using = "(//div[contains(@id, 'reply')])[1]/descendant::a[contains(@class, 'mini')]")
    protected List<WebElement> lnkReplyButtons;

    @FindBy(how = How.XPATH, using = "//div[@id='message-popup']")
    protected WebElement elmntMessagePopUp;

    @FindBy(how = How.XPATH, using = "//input[@id='close-msg-popup']")
    protected WebElement inpCloseMessagePopUp;

    protected String strMessage;


//    public boolean clickMyAccountLnk() {
//        waitForSeconds(2);
//        waitForElement(closeAdPopup);
//        click(closeAdPopup);
//        waitForSeconds(2);
//        waitForElement(lnkMyAccount);
//        return click(lnkMyAccount);    }
//
//    public boolean clickDepositFundsLnk() {
//        waitForSeconds(2);
//        waitForElement(lnkDepositFunds);
//        return click(lnkDepositFunds);
//    }
//
//    public boolean verifyDepositFundsPopup() {
//        waitForSeconds(2);
//        waitForElement(emntDepositFundsPopup);
//        waitForSeconds(10);
//        return click(emntDepositFundsPopup);
//    }

    public void closeDepositFundsPopup() {
        waitForElement(elmntCloseIconCreditCardPopup);
        jsClick(elmntCloseIconCreditCardPopup);
    }

    public boolean clickMyProfile() {
        waitForElement(lnkMyProfile);
        return click(lnkMyProfile);
    }

    public boolean clickPayout() {
        waitForElement(clickPayout);
        return click(clickPayout);
    }

    public boolean verifyPayoutSubmit() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            focusFrame(frameCashier);
        }
        return verifyElement(waitForElement(withdrawalText));
    }

    public boolean clickDeposit() {
        waitForElement(clickDeposit);
        return click(clickDeposit);
    }

    public boolean verifyDepositSubmit() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            focusFrame(frameCashier);
        }
        return verifyElement(waitForElement(depositButton));
    }

    public boolean verifyMyProfilePage() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE)) {
            click(elmntPersonalInfo);
            return verifyElement(emntVerifyAccountProfile);
        } else if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            return verifyElement(elmntPersonalInfoTablet);
        }
        waitForElement(emntVerifyAccountProfile);
        return verifyElement(emntVerifyAccountProfile);
    }

    public boolean clickReviewPayoutsHistory() {
        waitForElement(lnkPayoutsHistory);
        return click(lnkPayoutsHistory);
    }

    public boolean verifyPayoutHistoryPage() {
        waitForSeconds(2);
        waitForElement(emntVerifyPayoutsHistory);
        return click(emntVerifyPayoutsHistory);
    }

    public boolean clickReviewNewPayout() {
        waitForElement(lnkPayout);
        click(lnkPayout);
        waitForElement(lnkNewPayout);
        return click(lnkNewPayout);
    }

    public boolean clickNewPayoutPage() {
        waitForSeconds(2);
        waitForElement(emntVerifyNewPayoutPage);
        return click(emntVerifyNewPayoutPage);
    }

    public boolean clickPendingWagers() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE)) {
            click(elmntReport);

        } else if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            verifyElement(elmntReport);
            return click(lnkPendingWagers);
        }
        waitForElement(lnkPendingWagers);
        return click(lnkPendingWagers);
    }

    public boolean verifyPendingWagersPage() {
        waitForSeconds(2);
        waitForElement(elmntPendingWagersPage);
        return verifyElement(elmntPendingWagersPage);
    }

    public boolean clickGradedWagers() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE)) {
            click(elmntReport);
        } else if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            verifyElement(elmntReport);
            return click(lnkGradedWagers);
        }
        waitForElement(lnkGradedWagers);
        return click(lnkGradedWagers);
    }

    public boolean verifyGradedWagersPage() {
        waitForSeconds(2);
        waitForElement(emntVerifyGradedWagersPage);
        return verifyElement(emntVerifyGradedWagersPage);
    }

    public boolean clickTransactionHistory() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            verifyElement(elmntReport);
            click(elmntReport);
            return click(lnkTransactionHistory);
        }
        waitForElement(lnkTransactionHistory);
        return click(lnkTransactionHistory);
    }

    public boolean verifyTransactionHistoryPage() {
        waitForSeconds(2);
        waitForElement(emntVerifyTransactionHistoryPage);
        return verifyElement(emntVerifyTransactionHistoryPage);
    }

    public boolean clickDailyFigures() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE)) {
            click(elmntReport);
            return click(lnkDailyFigures);
        } else if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            verifyElement(elmntReport);
            return click(lnkDailyFigures);
        }
        waitForElement(lnkDailyFigures);
        return click(lnkDailyFigures);
    }

    public boolean verifyDailyFiguresPage() {
        waitForSeconds(2);
        waitForElement(emntVerifyDailyFiguresPage);
        return verifyElement(emntVerifyDailyFiguresPage);
    }

    public boolean clickMyMessages() {
        waitForElement(lnkMyMessages);
        return click(lnkMyMessages);
    }

    public boolean verifyMyMessagesPage() {
        jsScrollDown();
        waitForElement(elmntComposeANewMessage);
        return click(elmntComposeANewMessage);
    }

    public boolean verifyMessageHistoryPane() {
        waitForSeconds(2);
        waitForElement(lblMessageHistory);
        return verifyElement(lblMessageHistory);
    }

    public boolean clickMyFreeplay() {
        waitForElement(lnkMyFreeplay);
        return click(lnkMyFreeplay);
    }

    public boolean verifyMyFreeplayPage() {
        waitForSeconds(2);
        waitForElement(emntVerifyMyFreeplayPage);
        return verifyElement(emntVerifyMyFreeplayPage);
    }

    public boolean clickLimitInformation() {
        waitForElement(lnkLimitInformation);
        return click(lnkLimitInformation);
    }

    public boolean verifyLimitInformationPage() {
        waitForSeconds(2);
        waitForElement(emntVerifyLimitInformationPage);
        return click(emntVerifyLimitInformationPage);
    }

    public void selectSportsInLimitInformationPage() {
        waitForElement(emntSelectSportsInLimitInformation);
        ElementselectByVisibleString(emntSelectSportsInLimitInformation, "Boxing");
    }

    public boolean verifyLimitInformationTable() {
        waitForSeconds(2);
        waitForElement(emntVerifyLimitInformationTable);
        return click(emntVerifyLimitInformationTable);
    }

    public boolean clickReferMyFriends() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            return verifyElement(lnkReferMyFriends);
        } else {
            waitForElement(lnkReferMyFriends);
            return click(lnkReferMyFriends);
        }
    }

    public boolean clickReferAFriendSublink() {
        waitForElement(lnkReferAFriendSublink);
        return click(lnkReferAFriendSublink);
    }

    public boolean verifyReferAFriendPage() {
        waitForSeconds(2);
        waitForElement(elmntReferMoreFriend);
        return click(elmntReferMoreFriend);
    }

    public boolean clickViewMyReferrals() {
        waitForElement(lnkViewMyReferrals);
        return click(lnkViewMyReferrals);
    }

    public boolean verifyMyReferralTable() {
        waitForSeconds(2);
        waitForElement(emntVerifyMyReferralTable);
        return click(emntVerifyMyReferralTable);
    }

    public boolean clickSportsSchedules() {
        waitForElement(lnkSportsSchedules);
        return click(lnkSportsSchedules);
    }

    public boolean verifyGamesSchedulesPage() {
        waitForSeconds(3);
        waitForElement(emntVerifyGamesSchedulesPage);
        return click(emntVerifyGamesSchedulesPage);
    }

    public boolean clickHowToBetOnline() {
        waitForElement(lnkHowToBetOnline);
        return click(lnkHowToBetOnline);
    }

    public boolean verifyHowToBetOnlineInformationPage() {
        waitForSeconds(2);
        waitForElement(emntVerifyHowToBetOnlineInformationPage);
        return click(emntVerifyHowToBetOnlineInformationPage);
    }

    public boolean clickAffiliateProgram() {
        waitForElement(lnkAffiliateProgram);
        return click(lnkAffiliateProgram);
    }

    public boolean verifyRedirectsToAffiliateProgramsPage() {
        waitForSeconds(4);
        waitForWindow(1);
        takeScreenshot("verifyRedirectsToAffiliateProgramsPage");
        return (verifyElement(waitForElement(elmntComissionKingsAppLogo)) && driver.getCurrentUrl().equals(Constants.URL_AFFILIATE_PROGRAM));
    }

    public boolean clickMyAccountLnk() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE)) {
            click(waitForElement(btnHamburger));
            return click(waitForElement(lnkMyAccount));
        } else if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            {
                return click(waitForElement(btnHamburger));
            }
        }
        waitForElement(lnkMyAccountforDesktopBrowser);
        return click(lnkMyAccountforDesktopBrowser);
    }

    public boolean clickHamburgicon() {
        return click(waitForElement(btnHamburger));

    }

    public boolean clickDepositFundsLnk() {
        waitForSeconds(2);
        waitForElement(lnkDepositFunds);
        return click(lnkDepositFunds);
    }

    public boolean verifyDepositFundsPopup() {
        waitForframeToBeAvailableAndSwitchToIt(driver, elmntCreditCardPopupFrame);
        waitForElement(emntDepositFundsPopup);
        boolean isVerified = verifyElement(emntDepositFundsPopup);
        focusBackToDefaultFrame();
        takeScreenshot("verifyDepositFundsPopup");
        return isVerified;
    }

    public void enterFriendFirstName(String strFirstName) {
        waitForElement(emntFriendFirstName);
        enterValue(emntFriendFirstName, strFirstName);
    }

    public void enterFriendEmailAddress(String strEmailID) {
        waitForElement(emntFriendEmailAddress);
        enterValue(emntFriendEmailAddress, strEmailID.concat(Constants.MAIL_DOMAIN));
    }

    public void clickFriendsDetailsSubmitButton() {
        waitForElement(btnSubmitInReferFriends);
        click(btnSubmitInReferFriends);
        takeScreenshot("clickFriendsDetailsSubmitButton");
    }

    public boolean clickCalculatorInMyAccount() {
        waitForSeconds(2);
        waitForElement(elmntCalculatorInMyAccount);
        return click(elmntCalculatorInMyAccount);
    }

    public void enterAmericanValueInConverter() {
        waitForSeconds(2);
        waitForElement(emntEnterAmericanValueInConverter);
        enterValue(emntEnterAmericanValueInConverter, "10");
    }

    public boolean verifyCalculationInOrderToPlaceABet() {
        waitForSeconds(2);
        waitForElement(emntVerifyCalculationInOrderToPlaceABet);
        return verifyElement(emntVerifyCalculationInOrderToPlaceABet);
    }

    public boolean verifyReferAFriendPageAfterSuccessfulReferral() {
        waitForSeconds(2);
        waitForElement(elmntReferMoreFriend);
        takeScreenshot("verifyReferAFriendPageAfterSuccessfulReferral");
        return click(elmntReferMoreFriend);
    }

    public void selectMessageSubject() {
        waitForSeconds(2);
        waitForElement(selMessagesSubject);
        ElementselectByVisibleString(selMessagesSubject, "Deposit");
    }

    public void enterYourMessageInMyMessage() {
        waitForSeconds(2);
        waitForElement(txtYourMessageInMyMessage);
        enterValue(txtYourMessageInMyMessage, "TestingUser1");
        takeScreenshot("enterYourMessageInMyMessage");
    }

    public void clickSendButtonInMyMessage() {
        waitForSeconds(2);

        waitForElement(btnSendInMyMessage);
        click(btnSendInMyMessage);
    }

    public boolean verifyMyReferredFriendList(String strFirstName) {
        System.out.println(" \n strFirstName :: " + strFirstName);
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE)) {
            click(elmntDetails);
            return verifyElement(elmntreferrallist);
//            while (verifyElement(By.xpath(strMobFirstNameInReferredFriendLocator
//                    .replace("<<FIRSTNAME>>", strFirstName))) != true) {
//                jsScroll();
//                System.out.println("scroll happened ::" + verifyElement(elmntNxt));
//                waitForElement(elmntNxt);
//                click(elmntNxt);
//            }
//            return verifyElement(By.xpath(strMobFirstNameInReferredFriendLocator
//                    .replace("", strFirstName)));
        } else {
            waitForSeconds(2);
            elmntFirstName = waitForElement(By.xpath(strFirstNameInReferredFriendLocator
                    .replace("<<FIRSTNAME>>", strFirstName)));
            System.out.println(" >> elmntFirstName " + verifyElement(elmntFirstName));
            return verifyElement(elmntFirstName);
        }
    }


    public void clickSubLinksInMyAccountPage(String strSubLink) {
        waitForElement(elmntMyAccountLeftPane);
        WebElement elmntSubLink = waitForElement(By.xpath(strMyAccountSubLinkLocator.replace("<<SUBTAB>>", strSubLink)));
        click(elmntSubLink);
    }

    //MobileScripts
    public boolean clickMobileDeposit() {
        waitForSeconds(2);
        verifyElement(waitForElement(btnDeposit));
        return click(btnDeposit);
    }

    public void clickComposeMessage() {
        waitForSeconds(2);
        waitForElement(elmntComposeANewMessage);
        click(elmntComposeANewMessage);
    }

    public void selectSubject() {
        waitForSeconds(2);
        waitForElement(chkDepositRadio);
        click(chkDepositRadio);
    }

    public void clickCloseButtonInPop() {
        waitForElement(btnClose);
        click(btnClose);
    }

    public boolean verifyMessageHistory() {
        waitForSeconds(2);
        String Message = elmntMessage.getText();
        return verifyElement(By.xpath(new StringBuilder().append("//div[.='").append(Message).append("']").toString()));
    }

    public boolean verifyMobWagersPage() {
        waitForSeconds(2);
        waitForElement(elmnt48hours);
        click(elmnt48hours);
        return verifyElement(elmntTicketNumber);
    }

    public boolean verifyTabWagersPage() {
        waitForSeconds(2);
        waitForElement(tabletPendingWagers);
        return verifyElement(tabletPendingWagers);
    }

    public void backToMyAccount() {
        waitForSeconds(2);
        waitForElement(backToMyAccount);
        click(backToMyAccount);
    }

    public boolean clickDetails() {
        waitForSeconds(2);
        waitForElement(clickDetailsTablet);
        return click(clickDetailsTablet);
    }

    public boolean verifyFirstName() {
        waitForSeconds(2);
        Assert.assertTrue(clickDetails());
        return verifyElement(emntVerifyAccountProfile);
    }

    public boolean clickPromotions() {
        waitForSeconds(2);
        waitForElement(promotionsTabTablet);
        return click(promotionsTabTablet);
    }

    public boolean verifyPromotions() {
        waitForSeconds(2);
        waitForElement(promotionsContentTablet);
        return verifyElement(promotionsContentTablet);
    }


    /*@Description: Verify*/

    public boolean verifyHeadersUnderMyAccount(String strHeader) {
        if (strHeader.equalsIgnoreCase("My Account")) {
            waitForElement(elmntFirstHeader);
            return verifyElement(elmntFirstHeader);
        } else {
            waitForElement(elmntSecondHeader);
            return verifyElement(elmntSecondHeader);
        }
    }

    public boolean verifyHeaderUnderMyAccount(String strHeader1) {
        if (strHeader1.equalsIgnoreCase("Payouts")) {
            waitForElement(elmntFirstHeader1);
            return verifyElement(elmntFirstHeader1);

        } else if (strHeader1.equalsIgnoreCase("Refer My Friends")) {
            waitForElement(elmntFirstHeader2);
            return verifyElement(elmntFirstHeader2);

        } else if (strHeader1.equalsIgnoreCase("Refer a Friend")) {

            waitForElement(elmntReferAFriend);
            return verifyElement(elmntReferAFriend);

        } else {
            WebElement subHeader = waitForElement(By.xpath(accountTabs.replace("<<Caps>>", strHeader1)));
            return verifyElement(waitForElement(subHeader));
        }
    }

    public boolean clickDepositUnderMyAccountInMobile() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            waitForElements(lnkMyAccountSubTabs);
            return click(waitForElement(lnkMyAccountSubTabs.get(3)));
        } else {
            waitForElement(elmntDepositHeader);
            return click(elmntDepositHeader);
        }
    }

    public boolean verifyCardOptionsUnderMyAccount(String strUnderHead) {

        if (strUnderHead.equalsIgnoreCase("Change Payment Method")) {
            focusFrame(waitForElement(elmntIframe));
            waitForElement(elmntPaymentTab);
            return verifyElement(elmntPaymentTab);
        } else {
            focusFrame(waitForElement(elmntIframe));
            WebElement paymentTab = waitForElement(By.xpath(depositTabs.replace("<<Caps>>", strUnderHead)));
            return verifyElement(waitForElement(paymentTab));
        }

    }

    public boolean clickInsertUnderMyAccount() {
        focusFrame(waitForElement(elmntIframe));
        waitForElement(elmntInsertDigits);
        return click(elmntInsertDigits);
    }

    public void insertValues(String strcardnumber, String strexpiry, String stramount, String strcvv) {
        focusFrame(waitForElement(elmntIframe));
        waitForElement(elmntInsertDigits);
        enterValue(elmntInsertDigits, strcardnumber);
        waitForElement(txtexpiry);
        enterValue(txtexpiry, strexpiry);
        waitForElement(txtCvv);
        enterValue(txtCvv, strcvv);
        waitForElement(txtAmount);
        enterValue(txtAmount, stramount);
    }


    public boolean clickDepositFunction() {


        waitForInvisibilityOfElement(btnDepositFunction);
        waitForElement(btnDepositFunction);
        return verifyElement(btnDepositFunction);


    }

    public boolean verifyConformationPageUnderMyAccount() {

        waitForElement(elmntConformationTab);
        return verifyElement(elmntConformationTab);
    }


    public boolean verifyNewPageUnderMyAccount() {
        waitForElement(elmntInsertDigits);
        return verifyElement(elmntInsertDigits);
    }

    public boolean clickChangePaymentUnderMyAccount() {
        focusFrame(elmntIframe);
        waitForElementClickable(elmntPaymentChange);

        return click(elmntPaymentChange);
    }

    public boolean verifyRedirectedPageUnderMyAccount() {
        waitForElement(btnRedirectedPage);
        return verifyElement(btnRedirectedPage);
    }

    public boolean verifyProfilePageUnderMyAccount() {
        waitForElementClickable(elmntProfilePage);
        return verifyElement(elmntProfilePage);
    }

    public boolean clickMyProfileUnderMyAccount() {
        waitForElement(elmntProfileClick);
        return click(elmntProfileClick);

    }

    public boolean clickPayoutUnderMyAccount() {
        waitForElement(selPayout);
        return click(selPayout);
    }

    public boolean clickPayoutHistoryUnderMyAccount() {
        waitForElement(elmntPayoutHistory);
        return click(elmntPayoutHistory);
    }

    public boolean clickRefreshButtonUnderPayoutHistory() {
        waitForElement(btnRefreshButton);
        return click(btnRefreshButton);

    }

    public boolean verifyPayoutHistoryUnderMyAccount() {
        waitForElement(elmntPayoutRefreshPage);
        return verifyElement(elmntPayoutRefreshPage);
    }

    public boolean verifyRefreshButtonUnderPayoutHistory() {
        waitForElement(btnRefreshButton);
        return verifyElement(btnRefreshButton);
    }

    public boolean clickNewRequestUnderPayoutHistory() {
        waitForElement(elmntnewPayout);
        return click(elmntnewPayout);
    }

    public boolean verifyNewRequestPageUnderPayoutHistory() {
        focusFrame(elmntIframe1);
        waitForElement(btnNewPage);
        return verifyElement(btnNewPage);
    }

    public boolean clickPendingWagerUnderMyAccount() {
        waitForElement(elmntPendingWager);
        return click(elmntPendingWager);
    }

    public boolean verifyPendingWagerUnderMyAccount() {
        waitForElement(elmntPendingWagerTicket);
        return verifyElement(elmntPendingWagerTicket);

    }

    public boolean clickTicketUnderPendingWager() {
        waitForElement(elmntTicketNumber);
        return click(elmntTicketNumber);
    }

    public boolean verifyTicketUnderPendingWager() {
        waitForElement(elmntTicket);
        return verifyElement(elmntTicket);
    }

    public boolean verifyCollapsePageUnderPendingWager() {
        waitForElement(elmntCollapseTicket);
        return verifyElement(elmntCollapseTicket);
    }

    public boolean clickGradedWagerUnderMyAccount() {
        waitForElement(elmntGradedWagers);
        return click(elmntGradedWagers);

    }

    public boolean verifyRedirectedWagerPageUnderGradedWager() {
        waitForElement(elmntGradedWager);
        return verifyElement(elmntGradedWager);
    }

    public boolean verifyHeadersWagerUnderGradedWager(String strSelectors) {
        if (strSelectors.equalsIgnoreCase("Start Date")) {
            waitForElement(selBeginDate);
            return verifyElement(selBeginDate);

        } else if (strSelectors.equalsIgnoreCase("End Date")) {
            waitForElement(selEndDate);
            return verifyElement(selEndDate);
        } else {
            waitForElement(selPageSize);
            return verifyElement(selPageSize);

        }

    }

    public boolean clickTransactionHistoryUnderGradedWager() {
        waitForElement(elmntTransactionHistory);
        return click(elmntTransactionHistory);
    }

    public boolean selectStartDateUnderTransactionPage() {
        waitForElement(selBeginDate);
        click(selBeginDate);
        waitForElement(selPreviousMonth);
        click(selPreviousMonth);
        waitForElement(selStartDate);
        return click(selStartDate);
    }

    public boolean selectEndDateUnderTransactionPage() {
        waitForElement(selEndDate);
        click(selEndDate);
        waitForElement(selPreviousMonth);
        click(selPreviousMonth);
        waitForElement(elmntEndDateDefault);
        return click(elmntEndDateDefault);
    }

    public boolean clickShowUnderTransactionPage() {
        click(selPageSize);
        waitForElement(selShow);
        return click(selShow);
    }

    public boolean clickRefreshRequestUnderTransactionPage() {
        waitForElement(btnRefreshRequest);
        return click(btnRefreshRequest);
    }

    public boolean verifyTransactionPage() {
        waitForElement(elmntTransactionPage);
        return verifyElement(elmntTransactionPage);
    }

    public void clickDocumentUnderTransactionPage() {
        waitForSeconds(3);
        takeScreenshot("Transactions");
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            waitForElement(elmntDocumentHeaderMobile);
            jsClick(elmntDocumentHeaderMobile);
            waitForElement(elmntDocumentHeader1);
            jsClick(elmntDocumentHeader1);
        } else {
            waitForElement(elmntDocumentHeader);
            jsClick(elmntDocumentHeader);
        }

    }

    public boolean verifyExpandedPageUnderTransactionPage() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            waitForElement(elmntTicket);
            return verifyElement(elmntTicket);
        } else {
            waitForElement(elmntTicketTxt);
            return verifyElement(elmntTicketTxt);
        }
    }

    public boolean clicksDocumentUnderTransactionPage() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            waitForElement(elmntDocumentHeaderMobile);
            return click(elmntDocumentHeaderMobile);
        } else {
            waitForElement(elmntDocumentHeader);
            return click(elmntDocumentHeader);
        }
    }

    public boolean verifyCollapsedPageUnderTransactionPage() {
        waitForElement(elmntCollapsedHeader);
        return verifyElement(elmntCollapsedHeader);
    }


    public boolean clickNewMessageUnderMyAccount() {
        waitForElement(elmntNewMessage);
        return click(elmntNewMessage);
    }

    public boolean verifyNewMessageUnderMyAccount() {
        waitForElement(elmntNewMessage);
        return verifyElement(elmntNewMessage);
    }

    public boolean clickDailyFiguresUnderMyAccount() {
        waitForElement(elmntDailyFigures);
        return click(elmntDailyFigures);
    }

    public boolean verifyDailyFiguresUnderMyAccount() {
        waitForElement(elmntDailyFiguresPage);
        return verifyElement(elmntDailyFiguresPage);
    }

    public boolean verifyHeadersPageUnderMyAccount(String strHeader1) {
        WebElement dailyFiguresTab = waitForElement(By.xpath(dailyFigures.replace("<<Caps>>", strHeader1)));
        return verifyElement(waitForElement(dailyFiguresTab));
    }

    public boolean clickValueUnderDailyFigures() {
        waitForElement(elmntLinkUnderDailyFigures);
        return click(elmntLinkUnderDailyFigures);
    }

    public boolean verifyLinkUnderDailyFigures() {
        waitForElement(elmntLink);
        return verifyElement(elmntLink);

    }

    public boolean clickLastWeekUnderDailyFigures() {
        waitForElement(elmntLastWeek);
        return click(elmntLastWeek);
    }

    public boolean verifyLastWeekUnderDailyFigures() {
        waitForElement(elmntLastWeekFilters);
        return verifyElement(elmntLastWeekFilters);
    }

    public boolean clickCurrentWeekUnderDailyFigures() {
        waitForSeconds(3);
        waitForElement(elmntCurrentWeek);
        return click(elmntCurrentWeek);
    }

    public boolean verifyCurrentWeekUnderDailyFigures() {
        waitForSeconds(3);
        waitForElement(elmntCurrentWeekRecord);
        return verifyElement(elmntCurrentWeekRecord);
    }

    public boolean clickLimitsInformationUnderMyAccount() {
        waitForElement(elmntLimitedInformation);
        return click(elmntLimitedInformation);
    }

    public boolean verifyLimitInformationUnderMyAccount() {
        waitForElement(elmntSport);
        return verifyElement(elmntSport);
    }

    public boolean clickAnyGameUnderLimitInformation() {
        waitForElement(elmntSport);
        click(elmntSport);
        waitForElement(selAnyGame);
        return click(selAnyGame);
    }

    public boolean verifyAnyGameUnderLimitInformation() {
        waitForElement(elmntAnyGames);
        return verifyElement(elmntAnyGames);
    }

    public boolean clickReferAFriendUnderMyAccount() {
        waitForElement(elmnReferAFriend);
        return click(elmnReferAFriend);
    }

    public boolean verifyOptionsUnderReferAFriend(String strOption) {
        if (strOption.equalsIgnoreCase("Refer a Friend")) {

            waitForElement(elmntReferAFriend);
            return verifyElement(elmntReferAFriend);
        } else {
            WebElement subHeader = waitForElement(By.xpath(referafriend.replace("<<Caps>>", strOption)));
            return verifyElement(waitForElement(subHeader));
        }
    }

    public boolean clickReferFriendUnderMyAccount() {
        waitForElement(elmntReferAFriend);
        return click(elmntReferAFriend);
    }

    public boolean verifyChoicesUnderReferAFriend(String strchoices) {
        WebElement choices = waitForElement(By.xpath(referfriend.replace("<<Caps>>", strchoices)));
        return verifyElement(waitForElement(choices));
    }

    public boolean verifySharingOptionsUnderReferAFriend(String strSharingOPtions) {
        if (strSharingOPtions.equalsIgnoreCase("copy & paste")) {
            waitForElement(elmntCopyAndPaste);
            return verifyElement(elmntCopyAndPaste);

        } else if (strSharingOPtions.equalsIgnoreCase("social media ")) {
            waitForElement(elmntSocialMedia);
            return verifyElement(elmntSocialMedia);
        } else {

            waitForElement(elmntDetails);
            return verifyElement(elmntDetails);
        }

    }

    public boolean clickChoicesUnderReferAFriend(String strChoices1) {
        WebElement choices1 = waitForElement(By.xpath(referfriend.replace("<<Caps>>", strChoices1)));
        return click(waitForElement(choices1));
    }

    public boolean verifyChoices1UnderReferAFriend() {
        waitForElement(elmntChoices1);
        return verifyElement(elmntChoices1);
    }

    public boolean clickLinkUnderReferAFriend() {
        waitForElement(elmntClickHere);
        return click(elmntClickHere);

    }

    public boolean verifyPopUpUnderReferAFriend() {
        acceptAlert();
        return true;
    }

    public boolean clickSocialMediaUnderReferAFriend() {
        waitForElement(elmntFbIcon);
        return click(elmntFbIcon);
    }

    public boolean verifySocialMediaPopupUnderReferAFriend() {
        focusWindow(2);
        waitForElement(elmntFbIconPage);
        boolean fbIcon = verifyElement(elmntFbIconPage);
        closeWindow(2);
        focusWindow(1);
        return fbIcon;
    }

    public boolean enterDetailsUnderReferAFriend() {
        waitForElement(txtFirstName).sendKeys("sudharshan");
        click(txtFirstName);
        waitForElement(txtLastName).sendKeys("gambhir");
        click(txtLastName);
        waitForElement(txtEmail).sendKeys("sudharshangambhir1997@gmail.com");
        return click(txtEmail);

    }

    public boolean clickSubmitUnderReferAFriend() {
        waitForElement(btnSubmit);
        return click(btnSubmit);
    }

    public boolean verifyReferAPageUnderReferAFriend() {
        waitForElement(elmntReferAFriendUnderMyAccount);
        return click(elmntReferAFriendUnderMyAccount);
    }

    public void clickAddressBookUnderReferAFriend() {
        waitForSeconds(3);
        waitForElement(elmntAddressBook);
        jsClick(elmntAddressBook);
    }

    public void selectAnyChoiceUnderReferAFriend() {


        waitForElement(elmntAnyChoice);
        jsClick(elmntAnyChoice);
    }

    public boolean verifyAddressBookUnderReferAFriend() {
        waitForElement(elmntAddressBookUnderMyAccount);
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            return verifyElement(elmntAddressBookUnderMyAccount);
        }
        boolean emaliAddress = verifyElement(elmntAddressBookUnderMyAccount);
        click(iconCloseUnderAddressBookUnderMyAccount);
        return emaliAddress;
    }

    public boolean clickViewReferralsUnderMyAccount() {
        waitForElement(elmntViewReferrals);
        return click(elmntViewReferrals);
    }

    public boolean verifyPastReferralsUnderReferAFriend() {
        waitForElement(elmntPastReferrals);
        return click(elmntPastReferrals);
    }

    public boolean clickBetCalculatorUnderMyAccount() {
        waitForElement(elmntBetCalculator);
        return click(elmntBetCalculator);
    }

    public boolean verifyCalculatorPageUnderReferAFriend() {
        waitForElement(txtCalculatorPage);
        return verifyElement(txtCalculatorPage);
    }

    public boolean verifyOptionsUnderBetCalculator(String strSeeOptions) {
        WebElement checkOptions = waitForElement(By.xpath(seeOptions.replace("<<Caps>>", strSeeOptions)));
        return verifyElement(waitForElement(checkOptions));
    }

    public boolean clickOddCalculatorUnderBetCalculator() {
        waitForElement(elmntOddCalculator);
        return click(elmntOddCalculator);
    }

    public boolean enterValueInOddUnderBetCalculator() {
        waitForElement(txtCalculatorPage).sendKeys("4");
        return click(txtCalculatorPage);
    }

    public boolean verifyAllOtherHeaderUnderBetCalculator() {
        waitForElement(elmntDecimal);
        verifyElement(elmntDecimal);
        waitForElement(elmntFraction1);
        verifyElement(elmntFraction1);
        waitForElement(elmntFraction2);
        return verifyElement(elmntFraction2);
    }

    public boolean clickWinAndRiskUnderBetCalculator() {
        waitForElement(elmntWinAndRisk);
        return click(elmntWinAndRisk);
    }

    public boolean enterOddsUnderBetCalculator() {
        waitForElement(txtOdds).sendKeys("4");
        return click(txtOdds);
    }

    public boolean verifyEnteredOddsUnderBetCalculator() {
        waitForElement(elmntDecimalRisk);
        verifyElement(elmntDecimalRisk);
        waitForElement(elmntFraction1Risk);
        verifyElement(elmntFraction1Risk);
        waitForElement(elmntFraction2Risk);
        return verifyElement(elmntFraction2Risk);
    }

    public boolean enterRiskOrWinUnderBetCalculator() {
        waitForElement(txtRisk).sendKeys("4");
        return click(txtRisk);
    }

    public boolean verifyEnteredRiskOrWinUnderBetCalculator() {
        waitForElement(elmntAmericanWin);
        verifyElement(elmntAmericanWin);
        waitForElement(elmntDecimalWin);
        verifyElement(elmntDecimalWin);
        waitForElement(elmntDecimalRisk1);
        verifyElement(elmntDecimalRisk1);
        waitForElement(elmntFraction1win1);
        verifyElement(elmntFraction1win1);

        waitForElement(elmntFraction2Risk1);
        return verifyElement(elmntFraction2Risk1);
    }

    public boolean clickParlayCalculatorUnderMyAccount() {
        waitForElement(elmntParlayCalculator);
        return click(elmntParlayCalculator);
    }

    public boolean enterValuesAmericanHeaderUnderParlayCalculator() {
        waitForElement(txtValueOnHeaders).sendKeys("4");
        click(txtValueOnHeaders);
        waitForElement(txtValueOnHeaders2).sendKeys("5");
        return click(txtValueOnHeaders2);
    }

    public boolean selectOptionUnderParlayCalculator() {
        waitForElement(selDropDown);
        click(selDropDown);
        waitForElement(selDropDown1);
        click(selDropDown1);
        waitForElement(selDropDownSpread);
        click(selDropDownSpread);
        waitForElement(selDropDown1Spread);
        return click(selDropDown1Spread);

    }

    public boolean selectSportTypeUnderParlayCalculator() {
        waitForElement(selSportType);
        click(selSportType);
        waitForElement(selSportType1);
        click(selSportType1);
        waitForElement(selSportTypeMLB);
        click(selSportTypeMLB);
        waitForElement(selSportType1MLB);
        return click(selSportType1MLB);
    }

    public boolean enterBetUnderParlayCalculator() {
        waitForElement(txtBet).sendKeys("5");
        return click(txtBet);
    }

    public boolean clickCalculateUnderParlayCalculator() {
        waitForElement(btnCalculate);
        return click(btnCalculate);
    }

    public boolean verifyWinningsUnderParlayCalculator() {
        waitForElement(elmntWinnings);
        return verifyElement(elmntWinnings);
    }

    public boolean clickResetUnderParlayCalculator() {
        waitForElement(btnReset);
        return click(btnReset);
    }

    public boolean verifyAllFieldsUnderParlayCalculator() {
        waitForElement(txtValueOnHeaders);
        verifyElement(txtValueOnHeaders);
        waitForElement(txtValueOnHeaders2);
        verifyElement(txtValueOnHeaders2);
        waitForElement(selDropDown);
        verifyElement(selDropDown);
        waitForElement(selDropDown1);
        verifyElement(selDropDown1);
        waitForElement(selDropDownSpread);
        verifyElement(selDropDownSpread);
        waitForElement(selDropDown1Spread);
        verifyElement(selDropDown1Spread);
        waitForElement(selSportType);
        verifyElement(selSportType);
        waitForElement(selSportType1);
        verifyElement(selSportType1);
        waitForElement(selSportTypeMLB);
        verifyElement(selSportTypeMLB);
        waitForElement(selSportType1MLB);
        return verifyElement(selSportType1MLB);

    }

    public boolean clickAddAnotherRowUnderParlayCalculator() {
        waitForElement(elmntAnotherRow);
        return click(elmntAnotherRow);
    }

    public boolean verifyAnotherRowUnderParlayCalculator() {
        waitForElement(elmntAddedRow);
        return verifyElement(elmntAddedRow);
    }

    public boolean clickTeaserCalculatorUnderMyAccount() {
        waitForElement(elmntTeaserCalculator);
        return click(elmntTeaserCalculator);
    }

    public boolean clickGroupTypeUnderTeaserCalculator() {
        waitForElement(elmntGroupType);
        click(elmntGroupType);
        waitForElement(elmntGroupTypeTeaser);
        return click(elmntGroupTypeTeaser);
    }

    public boolean clickEnterValuesOfTeaserUnderMyAccount() {
        waitForElement(txtValuesOfTeaser).sendKeys("4");
        click(txtValuesOfTeaser);
        waitForElement(txtValues1OfTeaser).sendKeys("5");
        return click(txtValues1OfTeaser);
    }

    public boolean clickTeaserOptionUnderMyAccount() {
        waitForElement(elmntTeaserOption);
        click(elmntTeaserOption);
        waitForElement(elmntTeaser1Option);
        click(elmntTeaser1Option);
        waitForElement(elmntTeaserOption1);
        click(elmntTeaserOption1);

        waitForElement(elmntTeaser2Option);
        return click(elmntTeaser2Option);


    }

    public boolean verifyNewPointsUnderTeaserCalculator() {
        waitForElement(elmntNewPoint);
        click(elmntNewPoint);
        waitForElement(elmntNewPoint1);
        return click(elmntNewPoint1);
    }

    public boolean clickSportTypeUnderTeaserCalculator() {

        waitForElement(selTeaserOption2);
        click(selTeaserOption2);
        waitForElement(selTeaser2Option2);
        click(selTeaser2Option2);

        waitForElement(selTeaser1Option1);
        click(selTeaser1Option1);
        waitForElement(selTeaser2Option1);
        return click(selTeaser2Option1);
    }

    public boolean clickBetUnderTeaserCalculator() {
        waitForElement(txtBetTeaser).sendKeys("5");
        return click(txtBetTeaser);

    }

    public boolean clickCalculatorUnderparlayCalculator() {
        waitForElement(elmntCalculator1);
        return click(elmntCalculator1);
    }

    public boolean verifyWinningsUnderTeaserCalculator() {
        waitForElement(elmntWinningsUnderTeaser);
        return verifyElement(elmntWinningsUnderTeaser);
    }

    public boolean clickResetButtonUnderTeaserCalculator() {
        waitForElement(btnResetButton);
        return click(btnResetButton);
    }

    public boolean verifyAllFieldsSetUnderTeaserCalculator() {
        waitForElement(txtValuesOfTeaser);
        verifyElement(txtValuesOfTeaser);
        waitForElement(txtValues1OfTeaser);
        return verifyElement(txtValues1OfTeaser);
    }

    public boolean clickAddRowUnderTeaserCalculator() {
        waitForElement(btnAddRow);
        return click(btnAddRow);
    }

    public boolean verifyNewFieldUnderTeaserCalculator() {
        waitForElement(elmntAddRow);
        return verifyElement(elmntAddRow);
    }


    public boolean verifyMyMessagesHeaderUnderTeaserCalculator(String strHeaders) {
        WebElement checkHeaders = waitForElement(By.xpath(seeHeaders.replace("<<Caps>>", strHeaders)));
        return verifyElement(waitForElement(checkHeaders));

    }

    public boolean clickChoicesUnderMyMessages() {
        waitForElement(elmntChoices);
        return click(elmntChoices);

    }

    public boolean clicKANoteUnderMyMessages() { //todo camel
        waitForElement(txtWriteNotes).sendKeys("hello");
        return click(txtWriteNotes);
    }

    public boolean clickSendUnderMyMessages() {
        waitForElement(btnSend);
        return click(btnSend);
    }

    public boolean verifyMessageHistoryUnderMyMessages() {
        waitForElement(elmntMessageHistory);
        return verifyElement(elmntMessageHistory);
    }

    public boolean clickChoicesUnderOptionsMyMessages(String strChoices) {
        if (strChoices.equalsIgnoreCase("Deposit")) {
            waitForElement(selChoices1);
            return click(selChoices1);
        } else if (strChoices.equalsIgnoreCase("Payout")) {
            waitForElement(selChoices2);
            return click(selChoices2);

        } else {
            waitForElement(selChoices3);
            return click(selChoices3);
        }
    }

    public boolean clickCancelButtonMyMessages() {
        waitForElement(btnCancelButton);
        return click(btnCancelButton);
    }

    public void verifyScroolDownUnderMyMessages() {
        jsScrollDown();
    }

    public boolean clickMessageDetailsUnderMyMessages() {
        jsScrollDown();
        waitForElement(elmntMessageDetails);
        return click(elmntMessageDetails);
    }

    public boolean verifyMessageDetailsUnderMyMessages() {
        waitForElement(elmntMessageDetailsProvided);
        return verifyElement(elmntMessageDetailsProvided);
    }


    public boolean verifyMessagesFromAdminUnderMyMessages() {
        waitForElement(elmntMessagesFromAdmin);
        return verifyElement(elmntMessagesFromAdmin);

    }

    public boolean verifyUsefulLinksUnderMyAccount() {
        waitForElement(elmntUsefulLinks);
        return verifyElement(elmntUsefulLinks);
    }

    public boolean verifyUsefulLinkHeadersUnderMyMessages(String strUsefulLink) {
        WebElement subHeader1 = waitForElement(By.xpath(accountTabs.replace("<<Caps>>", strUsefulLink)));
        return verifyElement(waitForElement(subHeader1));
    }

    public boolean clickSportsSchedulesUnderUsefulLinks() {
        waitForElement(elmntSportsSchedule);
        return click(elmntSportsSchedule);
    }

    public boolean verifySportScheduleUnderUsefulLinks() {
        waitForElement(elmntSportsSchedulePosted);
        return verifyElement(elmntSportsSchedulePosted);
    }

    public boolean verifySchedulesUnderUsefulLinks() {
        waitForElement(elmntSchedule1);
        verifyElement(elmntSchedule1);
        //  waitForElement(elmntSchedule2);
        // verifyElement(elmntSchedule2);
        waitForElement(elmntSchedule3);
        return verifyElement(elmntSchedule3);
    }

    public boolean clickHowToBetOnlineUnderUsefulLinks() {
        waitForElement(elmntHowToBetOnline);
        return click(elmntHowToBetOnline);

    }

    public boolean verifyHowToBetOnlineUnderUsefulLinks() {
        waitForElement(elmntHowToBeOnSpreadBetting);
        return verifyElement(elmntHowToBeOnSpreadBetting);
    }

    public boolean verifyHelpOptionsUnderUsefulLinks() {
        waitForElement(elmntHelpOption1);
        verifyElement(elmntHelpOption1);
        waitForElement(elmntHelpOption2);
        verifyElement(elmntHelpOption2);
        waitForElement(elmntHelpOption3);
        verifyElement(elmntHelpOption3);
        waitForElement(elmntHelpOption4);
        return verifyElement(elmntHelpOption4);
    }

    public boolean clickAffiliateProgramUnderUsefulLinks() {
        waitForElement(elmntAffiliateProgram);
        return click(elmntAffiliateProgram);
    }

    public boolean verifyRedirectedPagesUnderUsefulLinks() {
        waitForElement(elmntRedirectedPages);
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            return verifyElement(elmntRedirectedPages);
        }
      return  verifyElement(elmntRedirectedPages);
    }

    //My Account Mobile Methods


    public boolean clickLeftNavigatorUnderHomePage() {
        waitForElement(elmntLeftNavigator);
        return click(elmntLeftNavigator);
    }

    public boolean clickMyAccountTab() {
        waitForElement(elmntMyAccountMobileTab);
        return click(elmntMyAccountMobileTab);
    }

    public boolean clickSubTabsUnderMyAccountMobile(DataTable strTabs) {
//        if (strHeaders.equalsIgnoreCase("Deposit")) {
//            waitForElement(elmntDeposit);
//            return verifyElement(elmntDeposit);
//        }
//
//        WebElement subHeaders = waitForElement(By.xpath(viewHeaders.replace("<<Caps>>", strHeaders)));
//        return verifyElement(waitForElement(subHeaders));

        List<String> lstTabs = strTabs.asList(String.class);
        return compareList(waitForElements(lnkMyAccountSubTabs), lstTabs);
    }

    public boolean clickProfitUnderMyAccountMobile() {
        waitForElement(elmntProfit);
        return click(elmntProfit);
    }

    public boolean verifyThreeHeaders(String strThreeHeaders) {
        WebElement subViewHeaders = waitForElement(By.xpath(viewThreeHeaders.replace("<<Caps>>", strThreeHeaders)));
        return verifyElement(waitForElement(subViewHeaders));
    }

    public boolean verifyCustomerLinkUnderProfile() {
        waitForElement(elmntCustomerLink);
        return verifyElement(elmntCustomerLink);
    }

    public boolean clickInformationUnderProfile() {
        waitForElement(elmntInformation);
        return click(elmntInformation);
    }

    public boolean verifyPersonalInformationHeaderUnderProfile() {
        waitForElement(elmntInformationHeader);
        return verifyElement(elmntInformationHeader);
    }


    public boolean clickInformationMinus() {
        waitForElement(elmntInformationMinus);
        return click(elmntInformationMinus);
    }

    public boolean verifyProfileInformationUnderProfile() {
        waitForElement(elmntInformationDetails);
        return verifyElement(elmntInformationDetails);
    }

    public boolean verifyCollapsedProfileInformation() {
        waitForElement(elmntCollapsedProfileInformation);
        return verifyElement(elmntCollapsedProfileInformation);
    }

    public boolean clickTimeZoneUnderProfile() {
        waitForElement(elmntTimeZone);
        return click(elmntTimeZone);
    }

    public boolean verifyDefaultTimeZoneUnderProfile() {
        waitForElement(elmntDefaultTimeZone);
        return verifyElement(elmntDefaultTimeZone);
    }

    public boolean clickChangeTimeZoneUnderProfile() {
        waitForElement(elmntChangeTimeZone);
        return click(elmntChangeTimeZone);
    }

    public boolean clickChoicesUnderTimeZone() {
        waitForElement(elmntChoicesOfTimeZone);
        return click(elmntChoicesOfTimeZone);
    }

    public boolean verifyTimeZoneUnderProfile() {
        waitForElement(elmntChangedTimeZone);
        return verifyElement(elmntChangedTimeZone);
    }

    public boolean clickMinusUnderTimeZone() {
        waitForElement(elmntMinusUnderTimeZone);
        return click(elmntMinusUnderTimeZone);
    }

    public boolean verifyCollapsedTimeZoneUnderProfile() {
        waitForElement(elmntCollapsedTimeZone);
        return verifyElement(elmntCollapsedTimeZone);
    }

    public boolean clickOddOnesUnderProfile() {
        waitForElement(elmntOddOnes);
        return click(elmntOddOnes);
    }

    public boolean verifyDefaultOddsUnderProfile() {
        waitForElement(elmntDefaultOddOnes);
        return verifyElement(elmntDefaultOddOnes);
    }

    public boolean clickChangeOddOnesUnderProfile() {
        waitForElement(elmntChangeOddOnes);
        return click(elmntChangeOddOnes);
    }

    public boolean clickChoicesUnderOddOnes() {
        waitForElement(elmntChoiceOfOddOnes);
        return click(elmntChoiceOfOddOnes);
    }

    public boolean verifyOdddOnesUnderProfile() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            return getText(waitForElement(elmntDefaultOddOnes)).equals("Fractional");
        }
        waitForElement(elmntChoiceChanged);
        return verifyElement(elmntChoiceChanged);
    }

    public boolean clickMinusUnderOddOnes() {
        waitForElement(elmntMinusOddOnes);
        return click(elmntMinusOddOnes);

    }

    public boolean verifyHiddenOnesUnderProfile() {
        waitForElement(elmntHiddenOddOnes);
        return verifyElement(elmntHiddenOddOnes);
    }

    public boolean clickCustomerServiceUnderProfile() {
        waitForElement(elmntCustomerService);
        return click(elmntCustomerService);
    }

    public boolean verifyRedirectedPage() {
        waitForElement(elmntRedirectedPage);
        return verifyElement(elmntRedirectedPage);
    }

    public boolean clickPayOutsUnderMyAccount() {
        waitForElement(elmntPayOuts);
        return click(elmntPayOuts);
    }

    public boolean verifyRedirectedPageUnderPayouts() {
        waitForElement(elmntRedirectedPageUnderPayouts);
        return verifyElement(elmntRedirectedPageUnderPayouts);
    }

    public boolean verifyWithDrawlOptionsUnderPayouts(String strOptions) {
        WebElement subOptions = waitForElement(By.xpath(viewWithDrawlOptions.replace("<<Caps>>", strOptions)));
        return verifyElement(waitForElement(subOptions));
    }

    public boolean clickDepositUnderMyAccount() {
        waitForElement(elmntDeposit);
        return click(elmntDeposit);
    }

    public boolean verifyRedirectedPageUnderDeposit() {
        waitForElement(elmntRedirectedPageUnderDeposit);
        return verifyElement(elmntRedirectedPageUnderDeposit);
    }


    public boolean clickReferMyFriendsUnderMyAccount() {
        waitForElement(elmntReferMyFriend);
        return click(elmntReferMyFriend);
    }

    public boolean verifySubTabsUnderReferMyFriend(String strSubTabs) {
        WebElement sub1 = waitForElement(By.xpath(viewSubTabs.replace("<<Caps>>", strSubTabs)));
        return verifyElement(waitForElement(sub1));
    }

    public boolean clickRefreshFriendsUnderReferMyFriends() {
        waitForElement(elmntReferFriend);
        return click(elmntReferFriend);
    }

    public boolean verifyChoicesUnderReferFriend(String strOptions1) {
        WebElement sub1 = waitForElement(By.xpath(viewReferFriends.replace("<<Caps>>", strOptions1)));
        return verifyElement(waitForElement(sub1));
    }

    public boolean verifySharingOptionsUnderReferFriend(String strSharingOptions) {
        if (strSharingOptions.equalsIgnoreCase("copy & paste")) {
            waitForElement(elmntCopyPaste);
            return verifyElement(elmntCopyPaste);

        } else if (strSharingOptions.equalsIgnoreCase("social media ")) {
            waitForElement(elmntSocialMedia1);
            return verifyElement(elmntSocialMedia1);
        } else {

            waitForElement(elmntDetailsVision);
            return verifyElement(elmntDetailsVision);
        }

    }

    public boolean verifyReferralLink() {
        waitForElement(elmntReferralLink);
        return verifyElement(elmntReferralLink);
    }

    public boolean clickClickHereUnderReferFriend() {
        waitForElement(lnkClickHereTab);
        return click(lnkClickHereTab);

    }

    public boolean verifyPopUpUnderReferFriend() {
        acceptAlert();
        return true;
    }

    public boolean clickSocialMediaIconUnderReferFriend() {
        waitForElement(elmntSocialMediaIcon);
        return click(elmntSocialMediaIcon);
    }

    public boolean verifyPopUpSocialMediaUnderReferFriend() {
        focusWindow(2);
        waitForElement(elmntFbIconMobile);
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            if (verifyElement(elmntFbIconMobile)) {
                closeWindow(2);
                focusWindow(1);
                return true;
            }
            return false;
        }
      return verifyElement(elmntFbIconMobile);
    }

    public boolean enterValueUnderReferFriend(DataTable strUserPassword) {
        List<String> lstUserPassword = strUserPassword.asList(String.class);
        enterValue(waitForElement(txtUserNameUnderReferFriend), TestDataUtil.getValue(lstUserPassword.get(0)));
        click(txtUserNameUnderReferFriend);
        waitForElement(txtLastNameUnderReferFriend).sendKeys("Codoid");
        click(txtLastNameUnderReferFriend);
        enterValue(waitForElement(txtEmailUnderReferFriend), TestDataUtil.getValue(lstUserPassword.get(1)).concat(Constants.MAIL_DOMAIN));
        return click(txtEmailUnderReferFriend);
    }

    public boolean clickSubmitButtonUnderReferFriend() {
        waitForElement(btnSubmitUnderReferFriend);
        return click(btnSubmitUnderReferFriend);
    }

    public boolean verifyRedirectedPageUnderReferFriend() {
        waitForElement(elmntRedirectedPageUnderReferFriend);
        return verifyElement(elmntRedirectedPageUnderReferFriend);
    }

    public void clickAddressBookUnderReferFriend() {
        waitForSeconds(5);
        waitForElement(lnkAddAddressBook);
        jsClick(lnkAddAddressBook);
    }

    public void clickAnyChoiceUnderReferFriend() {
        waitForElement(elmntAnyChoiceUnderReferFriend);
        jsClick(elmntAnyChoiceUnderReferFriend);
    }

    public boolean verifySelectedChoicesUnderReferFriend() {
        waitForElement(elmntSelectedChoices);
        return verifyElement(elmntSelectedChoices);
    }

    public boolean clickViewReferralsUnderReferFriend() {
        waitForElement(elmtViewReferralsUnderReferFriend);
        return click(elmtViewReferralsUnderReferFriend);
    }

    public boolean verifyPastReferralsUnderReferMyFriend() {
        waitForElement(elmntPastRefferalsUnderReferMyFriend);
        return verifyElement(elmntPastRefferalsUnderReferMyFriend);

    }

    public boolean clickReportsUnderMyAccount() {
        waitForElement(elmntReportsUnderMyAccount);
        return click(elmntReportsUnderMyAccount);
    }

    public boolean verifySubTabsUnderReports(String strReports) {
        WebElement subTabReports = waitForElement(By.xpath(viewSubTabs.replace("<<Caps>>", strReports)));
        return verifyElement(waitForElement(subTabReports));
    }

    public boolean clickPendingWagersUnderReports() {
        waitForElement(elmntPendingWagerUnderReports);
        return click(elmntPendingWagerUnderReports);
    }

    public boolean seeRedirectedPageUnderPendingWager(String strPendingWager) {


        WebElement subTabReports1 = waitForElement(By.xpath(viewPendingWager1.replace("<<Caps>>", strPendingWager)));
        return verifyElement(waitForElement(subTabReports1));
    }



    public boolean seeRedirectedPageUnderPendingWager(DataTable strPendingWager) {
        List<String> lstPendingWagers = strPendingWager.asList(String.class);

        for(int z=0; z < lstPendingWagers.size(); z++) {
            WebElement subTabReports1 = waitForElement(By.xpath(viewPendingWager1.replace("<<Caps>>", lstPendingWagers.get(z))));
            boolResult = verifyElement(waitForElement(subTabReports1));
            if(!boolResult)
            {
                return false;
            }
        }
        return boolResult;
    }

    public boolean clickTwentyFourUnderPendingWager() {
        waitForElement(elmntTwentyFourHours);
        return click(elmntTwentyFourHours);
    }

    public boolean verifyTwentyFourUnderPendingWager() {
        try {
            return verifyElement(waitForElement(txtNoWagers));
        } catch (Exception e) {
            waitForElement(elmnt24Hours);
            return verifyElement(elmnt24Hours);
        }
    }

    public boolean clickFourtyEightUnderPendingWager() {
        waitForElement(elmntFourtyEightHours);
        return click(elmntFourtyEightHours);
    }

    public boolean verifyFourtyEightUnderReports() {
        try {
            return verifyElement(waitForElement(txtNoWagers));
        } catch (Exception e) {
            waitForElement(elmnt24Hours);
            return verifyElement(elmnt24Hours);
        }
    }

    public boolean clickAllUnderReports() {
        waitForElement(elmntAllTabUnderReports);
        return click(elmntAllTabUnderReports);
    }

    public boolean verifyAllTabsUnderReports() {
        waitForElement(elmntAllTabs);
        return verifyElement(elmntAllTabs);
    }

    public boolean clickTicketNumberExpandsUnderPendingWager() {
        try {
            verifyElement(waitForElement(txtNoWagers));
            Reporter.addStepLog("No Tickets");
            return false;
        } catch (Exception e) {
            waitForElement(elmntTicketNumberInMobile);
            return click(elmntTicketNumberInMobile);
        }
    }

    public boolean TicketExpandsUnderPendingWager() {
        waitForElement(elmntTicketNumberExpands);
        return verifyElement(elmntTicketNumberExpands);
    }

    public boolean clickWagerUnderPendingWager() {
        waitForElement(elmntWagerTicket);
        return click(elmntWagerTicket);
    }

    public boolean VerifyAllDetailsUnderTicket() {
        waitForElement(elmntAllTickets);
        return verifyElement(elmntAllTickets);
    }

    public boolean clickGradedWagerUnderReports() {
        waitForElement(elmntGradedWagerInMobile);
        return click(elmntGradedWagerInMobile);
    }

    public boolean clickGradedWagerUnderReports(String strGradedWager) {
        WebElement subTabReports2 = waitForElement(By.xpath(viewPendingWager.replace("<<Caps>>", strGradedWager)));
        return verifyElement(waitForElement(subTabReports2));
    }

    public boolean clickTwentyFourUnderGradedWager() {
        waitForElement(elmntTwentyFourHoursUnderGradedWager);
        return click(elmntTwentyFourHoursUnderGradedWager);
    }

    public boolean selectStartDateAndEndDateUnderGradedWager() {
        waitForElement(elmntStartDate);
        click(elmntStartDate);
        waitForElement(elmntSelectedDate);
        click(elmntSelectedDate);
        waitForElement(elmntSetStartDate);
        click(elmntSetStartDate);
        waitForElement(elmntEndDate);
        click(elmntEndDate);
        waitForElement(elmntSelectedEndDate);
        click(elmntSelectedEndDate);
        waitForElement(elmntSetStartDate);
        return click(elmntSetStartDate);


    }

    public boolean clickSelectRange() {
        waitForElement(elmntSelectRange);
        return click(elmntSelectRange);
    }

    public boolean clickSubmitUnderReports() {
        waitForElement(btnSubmitUnderReports);
        return click(btnSubmitUnderReports);
    }

    public boolean verifyLandedGradedWagerUnderReports() {
        waitForElement(elmntLandedGradedWager);
        return verifyElement(elmntLandedGradedWager);
    }

    public boolean verifyTicketExpandUnderGradedWager() {
        waitForElement(elmntTicketUnderGradedWager);
        return verifyElement(elmntTicketUnderGradedWager);
    }

    public boolean verifyTicketUnderReports() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            waitForElement(elmnt24Hours);
            return verifyElement(elmnt24Hours);
        }
        else {
            waitForElement(elmntTicketInMobile);
            return verifyElement(elmntTicketInMobile);
        }
    }

    public boolean clickWagerUnderReports() {
        waitForElement(elmntWagerCollapse);
        return click(elmntWagerCollapse);
    }

    public boolean clickAllTransactionsUnderReports() {
        waitForElement(elmntAllTransaction);
        return click(elmntAllTransaction);
    }

    public boolean clickDailyFiguresUnderAllTransaction() {
        waitForElement(elmntDialyFigures);
        return click(elmntDialyFigures);
    }

    public boolean clickCurrentWeekUnderReports() {
        waitForElement(elmntCurrentWeekInMobile);
        return click(elmntCurrentWeekInMobile);
    }


    public boolean clickCurrentDayUnderReports() {
        waitForElement(elmntCurrentDay);
        return click(elmntCurrentDay);
    }


    public boolean verifyDailyFiguresUnderCurrentWeek() {
        waitForElement(elmntRedirectedCurrentWeek);
        return verifyElement(elmntRedirectedCurrentWeek);
    }

    public boolean clickLastWeeksUnderDailyReports() {
        waitForElement(elmntLastWeeksUnderDailyReport);
        return click(elmntLastWeeksUnderDailyReport);
    }

    public boolean clickPromotionsUnderMyAccount() {
        waitForElement(elmntPromotionUnderMyAccount);
        return click(elmntPromotionUnderMyAccount);
    }

    public boolean verifyPromotionalOptionsUnderPromotions(String strOptions) {
        WebElement subOptions = waitForElement(By.xpath(viewHeaders.replace("<<Caps>>", strOptions)));
        return verifyElement(waitForElement(subOptions));

    }

    public boolean clickFiftyPercentUnderPromotions() {
        waitForElement(elmntFiftyPercent);
        return click(elmntFiftyPercent);
    }

    public boolean verifyPromoCodesUnderPromotions() {
        waitForElement(elmntPromoCode);
        return verifyElement(elmntPromoCode);
    }


    public boolean clickTermsAndConditionsUnderPromotions() {
        waitForElement(elmntTermsAndConditions);
        return click(elmntTermsAndConditions);
    }

    public boolean verifyTermsAndConditions() {
        waitForElement(elmntTerms);
        return verifyElement(elmntTerms);
    }

    public boolean clickTwentyFiveDollarsUnderPromotion() {
        waitForElement(elmntTwentyFiveDollars);
        return click(elmntTwentyFiveDollars);
    }

    public boolean clickMobileBettingUnderPromotions() {
        waitForElement(elmntMobileBetting);
        return click(elmntMobileBetting);
    }

    public boolean clickLiveInBettingUnderPromotions() {
        waitForElement(elmntLiveInBetting);
        return click(elmntLiveInBetting);
    }

    public boolean clickHorseDebateUnderPromotions() {
        waitForElement(elmntHorseDebate);
        return click(elmntHorseDebate);

    }

    public boolean clickReferAFriendUnderPromotions() {
        waitForElement(elmntReferAFriendInMobile);
        return click(elmntReferAFriendInMobile);
    }

    public boolean verifyReferAFriendUnderPromotions() {
        waitForElement(elmntReferAFreindUnderPromotions);
        return verifyElement(elmntReferAFreindUnderPromotions);
    }

    public boolean clickReferAFriendNowUnderPromotions() {
        waitForElement(elmntReferAFreindUnderPromotions);
        return click(elmntReferAFreindUnderPromotions);
    }

    public boolean verifyRedirectedPageUnderReferral() {
        waitForElement(elmntRedirectedPageUnderReferral);
        return verifyElement(elmntRedirectedPageUnderReferral);
    }

    public boolean verifyReferNowButtonUnderReferral() {
        waitForElement(elmntReferNowButtonUnderReferral);
        return verifyElement(elmntReferNowButtonUnderReferral);
    }

    public boolean clickReferNowUnderPromotions() {
        waitForElement(elmntReferNowButtonUnderReferral);
        return click(elmntReferNowButtonUnderReferral);
    }

    public boolean verifyRedirectedPageUnderPromotions() {
        waitForElement(elmntRedirectedPageUnderPromotions);
        return verifyElement(elmntRedirectedPageUnderPromotions);
    }

    public boolean clickMoneyGuaranteedUnderPromotions() {
        waitForElement(elmntMoneyGuaranteed);
        return click(elmntMoneyGuaranteed);
    }

    public boolean clickLearnMoreUnderPromotions() {
        waitForElement(btnLearnMore);
        return click(btnLearnMore);
    }

    public boolean verifyPageUnderMoneyGuaranteed() {
        waitForElement(elmntPageUnderMoneyGuaranteed);
        return verifyElement(elmntPageUnderMoneyGuaranteed);
    }

    public boolean clickPlayNowUnderMoneyGuaranteed() {
        waitForElement(btnPlayNow);
        return click(btnPlayNow);
    }

    public boolean verifyPlayNowUnderMoneyGuaranteed() {
        waitForElement(btnPlayNow);
        return verifyElement(btnPlayNow);
    }

    public boolean verifyPlayNowPageUnderPromotions() {
        waitForElement(elmntPlayNowPage);
        return verifyElement(elmntPlayNowPage);
    }

    public boolean clickTermsAndConditionsUnderMoneyGuaranteed() {
        waitForElement(btnTermsAndConditionsUnderMoneyGuaranteed);
        return click(btnTermsAndConditionsUnderMoneyGuaranteed);
    }

    public boolean VerifyTermsAndConditionsUnderMoneyGuaranteed() {
        waitForElement(elmntTermsAndConditions1);
        return verifyElement(elmntTermsAndConditions1);
    }

    public boolean clickWeeklyCashRaceUnderPromotions() {
        waitForElement(elmntWeeklyCash);
        return click(elmntWeeklyCash);
    }

    public boolean clickThousandWeeklySitAndGoLeaderBoard() {
        waitForElement(elmntWeeklySitAndLeaderBoard);
        return click(elmntWeeklySitAndLeaderBoard);
    }

    public boolean clickMonthlyReloadBonus() {
        waitForElement(elmntMonthlyReloadBonus);
        return click(elmntMonthlyReloadBonus);
    }

    public boolean clickWeeklyCasinoRebateUnderPromotions() {
        waitForElement(elmntWeeklyCasinoRebate);
        return click(elmntWeeklyCasinoRebate);
    }

    public boolean clickIronManContestUnderPromotions() {
        waitForElement(elmntIronManContest);
        return click(elmntIronManContest);
    }

    public boolean clickMyMessagesUnderMyAccount() {
        waitForElement(elmntMyMessagesTab);
        return click(elmntMyMessagesTab);
    }

    public boolean verifyMyMessageHeaderUnderPromotions(String strMessages) {
        WebElement subTabMessages = waitForElement(By.xpath(viewPendingWager.replace("<<Caps>>", strMessages)));
        return verifyElement(waitForElement(subTabMessages));
    }

    public boolean clickComposeMessageUnderMyMessages() {
        waitForSeconds(2);
        waitForElement(elmntComposeMessage);
        return click(elmntComposeMessage);
    }

    public boolean verifyDropdownAndMessageFieldUnderMyAccount() {
        waitForElement(elmntDropDownUnderSubject);
        verifyElement(elmntDropDownUnderSubject);
        waitForElement(elmntMessageField);
        return verifyElement(elmntMessageField);

    }

    public boolean verifyMessagesButtonUnderMyComposeMessage(String strComposeMessage) {
        WebElement subMessageTab = waitForElement(By.xpath(viewComposeMessage.replace("<<Caps>>", strComposeMessage)));
        return verifyElement(waitForElement(subMessageTab));
    }

    public boolean clickMessageOptionUnderMyMessages(String strComposeMessageOption) {
        WebElement subMessageOptionTab = waitForElement(By.xpath(viewComposeMessageOption.replace("<<Caps>>", strComposeMessageOption)));
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            return click(waitForElement(subMessageOptionTab));
        }
        else {
            return verifyElement(waitForElement(subMessageOptionTab));
        }
    }

    public boolean enterMessageUnderComposeMessage() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            waitForSeconds(2);
            strMessage = "Testing"+TestDataUtil.getValue("New_RANDOM");
        }
        waitForElement(elmntMessageField).sendKeys("hello");
        return click(elmntMessageField);
    }

    public boolean clickSendButtonUnderMyMessages() {
        waitForElement(btnSendUnderMyMessage);
        return click(btnSendUnderMyMessage);
    }

    public boolean verifySendMessageUnderComposeMessage() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            verifyElement(waitForElement(elmntMessagePopUp));
            click(waitForElement(inpCloseMessagePopUp));
        }
        return verifyElement(waitForElement(By.xpath(elmntSendMessage.replace("<<MESSAGE>>", strMessage))));
    }

    public boolean clickCancelButtonUnderComposeMessage() {
        waitForElement(btnCancelUnderMyMessage);
        return click(btnCancelUnderMyMessage);
    }

    public boolean verifyDeletedMessageUnderMyMessage() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            return !verifyElement(elmntDropDownUnderSubject);
        }
        else {
            waitForElement(elmntDeletedMessages);
            return verifyElement(elmntDeletedMessages);
        }
    }

    public boolean verifyFreshFieldUnderMyMessage() {
        waitForElement(elmntMessageField);
        return verifyElement(elmntMessageField);
    }

    public boolean clickMessageHistoryUnderMyMessages() {
        waitForElement(elmntMessageHistoryInMobile);
        return verifyElement(elmntMessageHistoryInMobile);

    }

    public boolean verifyAllMessagesUnderMessageHistory() {
        waitForElement(elmntAllMessages);
        return verifyElement(elmntAllMessages);
    }

    public boolean verifyTwoMessageButtonUnderMyMessages(String strTwoMessageButton) {
        WebElement subTabMessage = waitForElement(By.xpath(viewPendingWager.replace("<<Caps>>", strTwoMessageButton)));
        return verifyElement(waitForElement(subTabMessage));
    }

    public boolean ClickMessageDetailsUnderComposeMessage() {
        waitForElement(elmntMessageDetailsInMobile);
        return click(elmntMessageDetailsInMobile);
    }

    public boolean verifyDateAndTimeOfAdminUnderMessageDetails() {
        waitForElement(elmntDateAndTime);
        return verifyElement(elmntDateAndTime);
    }

    public boolean verifySeeReplyHeaderUnderMessageDetails() {
        waitForElement(elmntReply);
        return verifyElement(elmntReply);
    }

    public boolean clickReplyUnderMyMessages() {
        waitForSeconds(2);
        waitForElement(elmntReply);
        return click(elmntReply);
    }

    public boolean verifyMessageFieldUnderMyMessages() {
        waitForSeconds(2);
        waitForElement(elmntMessageFieldUnderMessage);
        return verifyElement(elmntMessageFieldUnderMessage);
    }

    public boolean clickOnNextUnderMyMessages() {
        waitForElement(btnClickOnNext);
        return click(btnClickOnNext);
    }

    public boolean verifyNewMessageUnderMyMessages() {
        waitForElement(elmntNewMessages);
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            jsScrollDown();
        }
        return verifyElement(elmntNewMessages);
    }

    public boolean clickPreviousUnderMyMessages() {
        waitForElement(btnPreviousOn);
        return click(btnPreviousOn);
    }

    public boolean verifyNewMessageUnderMyMessage() {
        waitForElement(elmntNewMessageInMobile);
        return verifyElement(elmntNewMessageInMobile);

    }

    public boolean verifyDepositOptionsUnderDeposit() {
        waitForElement(elmntDepositOption);
        return verifyElement(elmntDepositOption);
    }

    public boolean verifyTwentyFourUnderAllTransactions() {
        try {
            return verifyElement(waitForElement(txtNoWagers));
        } catch (Exception e) {
            waitForElement(elmntAllTranactions);
            return verifyElement(elmntAllTranactions);
        }
    }

    public boolean verifyRedirectedPageUnderReports(String strPendingWager) {
        if (strPendingWager.equalsIgnoreCase("Current Week's")) {
            waitForElement(elmntCurrentWeekInMobile);
            return verifyElement(elmntCurrentWeekInMobile);
        } else {
            waitForElement(elmntLastWeeksUnderDailyReport);
            return verifyElement(elmntLastWeeksUnderDailyReport);
        }
    }

    public boolean clickOptinUnderIronmanContest() {
        waitForElement(btnOptIn);
        return click(btnOptIn);
    }

    public boolean clickTextFieldAreaUnderIronmanContest() {
        waitForElement(txtUserNameUnderIronManContest).sendKeys("sujay123");
        return click(txtUserNameUnderIronManContest);
    }

    public boolean verifyPlayNowPageUnderIronManContest() {
        waitForElement(elmntPage);
        return verifyElement(elmntPage);
    }

    public boolean clickPlayNowUnderCasinoRebate() {
        waitForElement(elmntPlayNowUnderCasinoRebate);
        return click(elmntPlayNowUnderCasinoRebate);
    }

    public boolean verifyPageUnderCasinoRebate() {
        waitForElement(elmntPageRedirectedUnderCasinoRebate);
        return verifyElement(elmntPageRedirectedUnderCasinoRebate);
    }

    public boolean clickDepositNowUnderPromotions() {
        waitForElement(btnDepositNow);
        return click(btnDepositNow);
    }

    public boolean verifyPageUnderMonthlyRebate() {
        waitForElement(elmntPageUnderMonthlyRebate);
        return verifyElement(elmntPageUnderMonthlyRebate);
    }

    public boolean verifyPageUnderWeeklySit() {
        waitForElement(elmntPageUnderWeeklySit);
        return verifyElement(elmntPageUnderWeeklySit);
    }

    public boolean verifyOtnButtonUnderIronManContest() {
        waitForElement(btnOptIn);
        return verifyElement(btnOptIn);
    }

    public boolean verifyPlayNowUnderCasinoRebate() {
        waitForElement(elmntPlayNowUnderCasinoRebate);
        return verifyElement(elmntPlayNowUnderCasinoRebate);
    }

    public boolean verifyDepositNowUnderMonthlyBonus() {
        waitForElement(btnDepositNow);
        return verifyElement(btnDepositNow);
    }

    public boolean clickTermsAndConditionsUnderWeeklySitAndGo() {
        waitForElement(lnkTermsAndConditions);
        return click(lnkTermsAndConditions);

    }

    public boolean clickSubjectDropDownUnderMyMessages() {
        waitForElement(elmntDropDownUnderSubject);
        return click(elmntDropDownUnderSubject);
    }

    public boolean verifyFourtyFourUnderPendingWager() {
        waitForElement(elmtFourtyFour);
        return verifyElement(elmtFourtyFour);
    }

    public boolean clickMinusUnderReports() {
        waitForElement(elmntMinus);
        return click(elmntMinus);
    }

    public boolean verifyPlayNowUnderCasinoRebate1() {
        waitForElement(elmntCasinoRebate);
        return verifyElement(elmntCasinoRebate);
    }

    public boolean clickIronManContestUnderMyAccount() {
        waitForElement(elmntIronManContest);
        return click(elmntIronManContest);
    }

    public boolean VerifyTermsAndConditionsUnderMoneyGuaranteed1() {
        waitForElement(elmntTermsConditions);
        return verifyElement(elmntTermsConditions);
    }

    public boolean verifyMessagesButtonUnderMyComposeMessage1(String strComposeMessage1) {
        WebElement subMessageTab = waitForElement(By.xpath(viewComposeMessage1.replace("<<Caps>>", strComposeMessage1)));
        return verifyElement(waitForElement(subMessageTab));
    }

    public boolean verifyPromotionsUnderMyAccount() {
        return verifyElement(waitForElement(lnkPromotionUnderMyAccount));
    }

    public boolean verifyMessagesButtonUnderMyReply() {
        waitForSeconds(2);
        waitForElements(lnkReplyButtons);
        return verifyElement(lnkReplyButtons.get(0)) && verifyElement(lnkReplyButtons.get(1));
    }
}


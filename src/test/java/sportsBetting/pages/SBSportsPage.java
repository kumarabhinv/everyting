package sportsBetting.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import com.cucumber.listener.Reporter;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.ArrayList;
import java.util.List;


public class SBSportsPage extends BasePage {

    public SBSportsPage(WebDriver driver) {
        super(driver);
    }

    //PTY
    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@id='HeaderWrapperTop']/div[2]/div"),
            @FindBy(how = How.XPATH, using = "//div[@id]//ul[@class='ulmenu']")
    })
    protected WebElement elmntHeaderTabs;

    @FindBy(how = How.XPATH, using = "//div[@class='tabscontent']")
    protected WebElement elmntGameContent;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='balances']"),
            @FindBy(how = How.XPATH, using = "//span//span/span[.='Featured']"),
    })
    protected WebElement elmntFrameLiveCasinoPage;

    @FindBy(how = How.XPATH, using = "//div[@id='main_tabs']//div[@id='wrapper'] ")
    protected WebElement elmntLiveCasinoPage;

//    @FindBy(how = How.XPATH, using = "//a[.='Blackjack']")
//    protected WebElement elmntRed;
//
//    @FindBy(how = How.XPATH, using = "//div[@id='content-view']")
//    protected WebElement elmntBlack ;

    @FindBy(how = How.ID, using = "tradologicFrame")
    protected WebElement iFrameLivecasino;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='Live']"),
            @FindBy(how = How.CSS, using = "iframe#iframeESports")
    })
    protected WebElement elmntFrameESportsPage;

    @FindBy(how = How.ID, using = "iframeESport")
    protected WebElement iFrameEsport;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//button[.='Deposit']"),
            @FindBy(how = How.XPATH, using = "//div[contains(@id,'tabContainer')]//*[text()='BANKING' or .='DEPOSIT FUNDS']")
    })
    protected WebElement elmntCashierLandingPage;


    @FindBy(how = How.XPATH, using = "//div[@class='mobile-link-blocks']")
    protected WebElement elmntPokerpage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Table games')]")
    protected WebElement elmntClassicCasinopage;

    @FindBy(how = How.ID, using = "iframeCashier")
    protected WebElement iFrameCashier;

    @FindBy(how = How.XPATH, using = "//div[@class='container']//div[@id='feat-games']//div[@class='row']")
    protected List<WebElement> elmntsGamePaneRows;

    @FindBy(how = How.XPATH, using = "//nav[@class='lobby__menu'][.//li/a[.='CONTEST']][.//li/a[.='HOW TO PLAY']]")
    protected WebElement lblContestsAndHowToPlay;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'carousel')]/parent::div[contains(@class,'carousel')]")
    protected WebElement elmntImageCarouselContestsPage;

    @FindBy(how = How.XPATH, using = "//ul[contains(@class,'nav-tabs')]/li/a[.='Deposit' or .='DEPOSITS']")
//    @FindBy(how = How.XPATH, using = "//ul[contains(@class,'nav-tabs')][./li/a[.='Deposit']][./li/a[.='Refer a Friend']]")
    protected WebElement elmntPromotionsSubTabNames;

    protected String strTabNameLocator = new StringBuilder()
            .append("//li[contains(@class,'Active')]/a[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    protected String strSubTabNameLocator = new StringBuilder()
            .append("//li/a[contains(@class,'active')]/span[text()='")
            .append("<<TABNAME>>")
            .append("']").toString();

    @FindBy(how = How.XPATH, using = "//button[.='LIVE CASINO' or .='Live Casino']")
    protected WebElement elmntLiveCasino;


    //Sept 28, 2019
    @FindBy(how = How.XPATH, using = "//table[@class='league'][1]/tbody[@class='event'][1]/tr[1]/td[contains(@class,'rotno')]")
    protected WebElement elmntRotNumber;
    @FindBy(how = How.XPATH, using = "//table[@class='league'][1]/tbody[@class='event'][1]/tr[1]/td[contains(@class,'teamname')]")
    protected WebElement elmntTeamName;
    @FindBy(how = How.XPATH, using = "//table[@class='league'][1]/tbody[@class='event'][1]/tr[1]/td[contains(@class,'check')][2]/input[@class='oddsselection']")
    //todo
    protected WebElement chkSpreadColumnFirstRowField;

    @FindBy(how = How.XPATH, using = "//table[@class='league'][1]/tbody[@class='event'][1]/tr[1]/td[contains(@class,'checkboxes')][2]")
    protected WebElement chkSpreadColumnSecondRowField;

    @FindBy(how = How.XPATH, using = "//table[@class='league'][1]/tbody[@class='event'][2]/tr[1]/td[contains(@class,'check')][3]")
    protected WebElement chkSpreadColumnThirdRowField;


    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[.='Straight Bet']"),
            @FindBy(how = How.XPATH, using = "//table[@id='window-title-table']//td[.='Bet Slip']")
    })
    protected WebElement elmntBetSlipForm;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Straight')][contains(.,'Bet')][not(contains(@class,'hide'))]")
    protected WebElement elmntStraightBetSubTab;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Teaser')][not(contains(@class,'hide'))]")
    protected WebElement elmntTeaserSubTab;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Parlay')][not(contains(@class,'hide'))]")
    protected WebElement elmntParlayBetSubTab;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'IF Bet')][not(contains(@class,'hide'))]")
    protected WebElement elmntIfBetSubTab;

    @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']/table//td/input[@id='showconfirmation']")
    protected WebElement btnShowConfirmationBox;

    @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']")
    protected WebElement elmntBetSlipInformation;


    protected String strBetSlipButtons = new StringBuilder()
            .append("//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//table[@class='betslipbbar']//button[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();


    @FindAll({
            @FindBy(how = How.XPATH, using = "//input[@id='bet']"),
            @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//td[@class='col_wager_amt']/descendant::input[1]")
    })
    protected WebElement txtRiskFieldInBetSlip;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='Place my bet']"),
            @FindBy(how = How.XPATH, using = "//span[@id='placeMyBet']"),
            @FindBy(how = How.XPATH, using = "//input[@id='placeMyBet']"),
            @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//table[@class='betslipbbar']//button[@id][.='Place my bet']")
    })
    protected WebElement btnPlaceMyBet;

    @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//table[@class='betslipbbar']//button[@id][.='Save']")
    protected WebElement btnSaveBet;

    @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//tr[@id='wgrItm_2_tr']/td/div[@class='tooltipdiv']")
    protected WebElement elmntBetSlipTeams;

    @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//div[@class='totalamt']")
    protected WebElement elmntTotalRiskAndPotentialWinAmount;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='Confirm My Bet']"),
            @FindBy(how = How.XPATH, using = "//span[@id='confirmMyBet']"),
            @FindBy(how = How.XPATH, using = "//input[@id='confirmMyBet']"),
            @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//button[.='Confirm Bet']")
    })
    protected WebElement btnConfirmBet;

    @FindBy(how = How.XPATH, using = " //div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//button[.='Back']")
    protected WebElement btnBackBet;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[.='Ticket Number']"),
            @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//div[contains(.,'Ticket Number')]"),
            @FindBy(how = How.XPATH, using = "//div[normalize-space(.)='Ticket Number']/parent::div/child::*[contains(.,'Ticket') or contains(.,'Accepted')]"),
            @FindBy(how = How.XPATH, using = "//div[contains(text(),'Ticket Number')]"),
    })
    protected WebElement lblTicketNumberAccepted;
    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='CLOSE']"),
            @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//button[.='Close']"),
            @FindBy(how = How.XPATH, using = "//div[.='Close']")

    })
    protected WebElement btnCloseInBetSlip;
    @FindBy(how = How.CSS, using = "div#contentArea")
    protected WebElement elmntSportBookPage;

    @FindBy(how = How.CSS, using = "table.league>tbody.event")
    protected WebElement elmntFootBallTeamTableInSportBookPage;

    // Mobile Locators
    @FindBy(how = How.XPATH, using = "//a[.='Football']")
    protected WebElement elmntFootball;
//
//    @FindBy(how = How.XPATH, using = "//a[.='NFL']")
//    protected WebElement elmntNFL;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@id='MiddleScroller']/descendant::span[contains(., '(')][1]"),
            @FindBy(how = How.XPATH, using = "//span[.='NBA Basketball Game']//following::td[1]"),
//            @FindBy(how = How.XPATH, using = "//span[.='NFL Football Game']//following::td[1]")
            @FindBy(how = How.XPATH, using = "(//div[@id='wager-type-navbar']/following::li[@class='Pair']/descendant::td)[2]")
    })
    protected WebElement elmntFirstTeam;


    @FindBy(how = How.XPATH, using = "//span[.='Add More Selections']")
    protected WebElement lnkAddMoreSelection;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@id='MiddleScroller']/descendant::span[contains(., '(')][3]"),
            @FindBy(how = How.XPATH, using = "//span[.='NBA Basketball Game']//following::td[5]"),
//           @FindBy(how = How.XPATH, using = "//span[.='NFL Football Game']//following::td[5]")
            @FindBy(how = How.XPATH, using = "(//div[@id='wager-type-navbar']/following::li[@class='Pair']/descendant::td)[6]")
    })
    protected WebElement elmntNewTeam;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[contains(., 'Check')]"),
            @FindBy(how = How.XPATH, using = "//span[contains(text(),'Check your Bet Slip')]")
    })
    protected WebElement elmntCheckBetSlip;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@id='RightScroller']/descendant::div[@class='betSlipError'][1]/following::div[1]/ul[1]"),
            @FindBy(how = How.XPATH, using = "//span[contains(text(),'Single Bet')]")
    })
    protected WebElement elmntSingleBet;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Action Reverse')]")
    protected WebElement elmntActionReverse;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Action Reverse')]//following::input[@id='rvbet']")
    protected WebElement txtActionReverseBet;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@id='RightScroller']/descendant::div[@class='betSlipError'][1]/following::div[1]/ul[2]"),
            @FindBy(how = How.XPATH, using = "//span[contains(text(),'Parlays')]")
    })
    protected WebElement elmntParlays;

    @FindBy(how = How.XPATH, using = "//input[@id='plbet']")
    protected WebElement txtParlayBet;

    @FindBy(how = How.ID, using = "showDepositMethods")
    protected WebElement lnkViewMoreOptions;

    @FindBy(how = How.XPATH, using = "(//button[@class='close'])[2]/following-sibling::h4")
    protected WebElement emlntTandCPopup;

    @FindBy(how = How.XPATH, using = "(//button[@class='close'])[2]")
    protected WebElement emlntCloseForTandCPopup;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@id='RightScroller']/descendant::div[@class='betSlipError'][1]/following::div[1]/ul[3]"),
            @FindBy(how = How.XPATH, using = "//span[contains(text(),'If Bet')]")
    })
    protected WebElement elmntIfBet;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'If Bet')]/following::input[@id='bet'][1]")
    protected WebElement txtUpIfBet;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'If Bet')]/following::input[@id='bet'][2]")
    protected WebElement txtDownIfBet;

    @FindBy(how = How.XPATH, using = "//input[@id='placeMyBet']")
    protected WebElement elmntPlaceBet;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='Confirm My Bet']"),
            @FindBy(how = How.XPATH, using = "//input[@id='confirmMyBet']")
    })
    protected WebElement elmntConfirmBet;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@id='owl-demo']/descendant::div[.='Basketball'][1]"),
            @FindBy(how = How.XPATH, using = "//a[.='Basketball']")
    })
    protected WebElement elmntGame;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@id='MiddleAllowTags']/descendant::a[9]"),
            //    @FindBy(how = How.XPATH, using = "//a[.='NFL']"),
//            @FindBy(how = How.XPATH, using = "//a[.='NBA]"')
            @FindBy(how = How.XPATH, using = "//ul[@id='all-leagues']/descendant::a[contains(@id, 'NBA')][1]")
    })
    protected WebElement elmntGameType;

    @FindBy(how = How.XPATH, using = "//a[contains(., 'Check')]")
    protected WebElement betslipBar;

    @FindBy(how = How.XPATH, using = "//span[.='Single Bet']/following::input[contains(@id,'bet')][1]")
    protected WebElement betInputStraightBet;

    @FindBy(how = How.XPATH, using = "//span[.='Single Bet']/following::input[contains(@id,'bet')][3]")
    protected WebElement betInputParlaysBet;

    @FindBy(how = How.XPATH, using = "//div[@id='numericInput']/descendant::td[2]")
    protected WebElement numericInput;

    @FindBy(how = How.XPATH, using = "//div[@id='numericInput']/descendant::td[3]")
    protected WebElement numericInput1;

    @FindBy(how = How.XPATH, using = "//div[@id='numericInput']/descendant::td[13]")
    protected WebElement numericInputDone;

    @FindBy(how = How.XPATH, using = "//span[.='Single Bet']/following::input[contains(@id,'bet')][5]")
    protected WebElement betInputIFBetFirst;

    @FindBy(how = How.XPATH, using = "//span[.='Single Bet']/following::input[contains(@id,'bet')][6]")
    protected WebElement betInputIFBetSecond;

    @FindBy(how = How.XPATH, using = "//*[@id='RightScroller']/descendant::div[@class='betSlipError'][1]/following::div[1]/ul[4]")
    protected WebElement elmntActionReverseBet;

    @FindBy(how = How.XPATH, using = "//span[.='Single Bet']/following::input[contains(@id,'bet')][7]")
    protected WebElement betInputActionReverseBet;

    @FindBy(how = How.XPATH, using = "//div[@id='appNavPanel']/descendant::a[normalize-space(.)='Live Odds']")
    protected WebElement elmntFrameLivePage;

    @FindAll({
            @FindBy(how = How.ID, using = "lvFrame"),
            @FindBy(how = How.ID, using = "iframeLive")
    })
    protected WebElement iFrameLive;

    @FindBy(how = How.XPATH, using = "//div[@id='dvBetSlipMobile']")
    protected WebElement elmntFrameRacebookPage;

    @FindBy(how = How.ID, using = "racebook")
    protected WebElement iFrameRacebook;

    @FindBy(how = How.XPATH, using = "//div[@class='flag__image--rev']/descendant::a[normalize-space(.)='quick picks']")
    protected WebElement elmntFramePlayerPropsPage;

    @FindBy(how = How.ID, using = "playerPropsFrame")
    protected WebElement iFramePlayerprops;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[.='Sports']"),
            @FindBy(how = How.XPATH, using = "//a[.='Live Odds']")
    })
    protected WebElement elmntFrameSportsPage;

    @FindBy(how = How.XPATH, using = "//div[@id='container']")
    protected WebElement elmntFrameBlackPage;

    @FindBy(how = How.ID, using = "_hjRemoteVarsFrame")
    protected WebElement iFrameSports;

    @FindBy(how = How.XPATH, using = "//div[@class='row']/descendant::div[@class='promotioncontent']")
    protected WebElement optionsInPromotions;

    @FindBy(how = How.XPATH, using = "//div[@id='leftmenu' and @class='thirteen columns']")
    protected WebElement optionsInGettingStarted;

    @FindBy(how = How.XPATH, using = "//a[contains(@href,'https://www.sportsbetting.ag/join')]/img")
    protected WebElement lnkJoinNowImage;

    @FindBy(how = How.ID, using = "Navigation")
    protected WebElement elmntMyAccPage;

    @FindBy(how = How.XPATH, using = "//h2[.='Favorites']")
    protected WebElement lblInHowToBetOnline;

    @FindBy(how = How.XPATH, using = "//h2[.='Fractions: ']")
    protected WebElement lblInUnderstandingBettingOdds;

    @FindBy(how = How.XPATH, using = "//h1[.='SCHEDULES']")
    protected WebElement lblInUnderSportsSchedules;

    @FindBy(how = How.XPATH, using = "//h2[.='Betting Dictionary']")
    protected WebElement lblInUnderBettingTerms;

    @FindBy(how = How.XPATH, using = "//h1[.='Types of Bets']")
    protected WebElement lblInUnderTypesOfBets;

    @FindBy(how = How.XPATH, using = "//a[.='General Rules']")
    protected WebElement lblInUnderSportsbookRules; //todo

    @FindBy(how = How.XPATH, using = "//div[@id='wrapper']/p/a[.='cs@SportsBetting.ag']")
    protected WebElement linkToSBUnderBettingLimits;

    @FindBy(how = How.XPATH, using = "//div[@id='wrapper']/p/a[.='Click here for Live Chat']")
    protected WebElement linkToLiveChatUnderBettingLimits;

    @FindBy(how = How.XPATH, using = "//div[@id='livePersonSB']/div/div[.='Live Help']")
    protected WebElement btnLiveChatUnderBettingLimits;

    @FindBy(how = How.ID, using = "cashierFrame")
    protected WebElement elmntFrameCashierPage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//button[@data-lp-point='submit_button']"),
            @FindBy(how = How.XPATH, using = "//div[@class='chips-row']")
    })
            protected WebElement elmntLiveChatPopup;

    @FindAll({
    @FindBy(how = How.XPATH, using = "//button[@title='Minimize']"),
    @FindBy(how = How.XPATH, using = "//button[@data-lp-cust-id='top_menu_button']")
    })
    protected WebElement minimizeLiveChatPopup;

    @FindBy(how = How.XPATH, using = "(//div[.='End conversation'])[1]")
    protected WebElement elmntEndConversation;

    @FindBy(how = How.XPATH, using = "//a[@href='/sportsbook/rules']")
    protected WebElement lnkSBGeneralRules;

    @FindBy(how = How.XPATH, using = "//strong[.='Wager Confirmations']")
    protected WebElement verifyRulesForGeneralRules;

    @FindBy(how = How.XPATH, using = "//b[.='Financial Betting Rules']")
    protected WebElement verifyFinancialsRulesInGeneralRules;

    @FindBy(how = How.XPATH, using = "//h2[.='E-sports Rules']")
    protected WebElement verifyESportsRulesInGeneralRules;

    @FindBy(how = How.ID, using = "mobile-article-main-banner")
    protected WebElement lnkSportsNewsBanner;

    @FindBy(how = How.ID, using = "mobile-article-main-banner")
    protected List<WebElement> lnkSample;

    protected String strSubTabInSportsBook = new StringBuilder()
            .append("//div[@class='tabs']//li[contains(.,'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    protected String strSubTabHighlightedInSportsBook = new StringBuilder()
            .append("//li[@class='tabActiveHeader tabActiveHeader']/a[.='")
            .append("<<TABNAME>>")
            .append("']").toString();

    protected String strDepositOption = new StringBuilder()
            .append("(//div/a[contains(.,'")
            .append("<<TABNAME>>")
            .append("')])[1]").toString();

    protected String strSubLinksInGettingStarted = new StringBuilder()
            .append("//div[@id='leftmenu']//li/a[.='")
            .append("<<TABNAME>>")
            .append("']").toString();

    protected String strLiveChatButton = new StringBuilder()
            .append("//div[@id='livePersonSB']/div/div[.='")
            .append("<<TABNAME>>")
            .append("']").toString();

    protected String strGeneralRulesLink = new StringBuilder()
            .append("//a[.='")
            .append("<<TABNAME>>")
            .append("']").toString();

    protected String strRulesLink = new StringBuilder()
            .append("//div[@class='thirteen columns']//a[.='")
            .append("<<TABNAME>>")
            .append("']").toString();

    protected String strverifyRulesLink = new StringBuilder()
            .append("//h2[.='")
            .append("<<TABNAME>>")
            .append("']").toString();

    //ul[@id='ulcategory_1']/li//span[contains(text(),'')]

    protected String strSubtabs = new StringBuilder()
            .append("//ul[@id='ulcategory_1']/li//span[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[@class='container']//li//a[contains(text(),'Live Betting')]")
    protected WebElement btnLive;

    @FindBy(how = How.ID, using = "cashierFrame")
    protected WebElement liveBetFrame;

    @FindBy(how = How.XPATH, using = "//div[@id='viewMenu']//li[@id='btnCalendar']")
    protected WebElement elmntCalendar;

    protected String strCalendardays = new StringBuilder()

            //.append("//div[@id='calTabs']//li='")
            .append("//div[@id='calTabs']//li[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[@id='calPage']/descendant::div[contains(text(),'There are no events scheduled for this date')][1]")
    protected WebElement elmntCalendarText;


    @FindBy(how = How.XPATH, using = "//iframe[@id ='quickcashierFrame']")
    protected WebElement elmntIframe;

    @FindBy(how = How.XPATH, using = "//input[@id='CardNumber']")
    protected WebElement elmntInsertDigits;

    @FindBy(how = How.XPATH, using = "//input[@id='CardExpiry']")
    protected WebElement txtexpiry;

    @FindBy(how = How.XPATH, using = "//input[@id='CardCVC']")
    protected WebElement intCvv;

    @FindBy(how = How.ID, using = "convertedamount")
    protected WebElement intAmount;

    @FindBy(how = How.XPATH, using = "//div[@id ='DepositsLimits']")
    protected WebElement elmntMinMax;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-block btn-primary']")
    protected WebElement elmntDepositFunction;

    @FindBy(how = How.XPATH, using = "//a[@class ='simple-close-button-new']")
    protected WebElement elmntConformationTab;

    @FindBy(how = How.XPATH, using = "//a[text()='Deposit Funds']")
    protected WebElement elmntDepositHeader;

    @FindBy(how = How.XPATH, using = "//a[@id ='myaccount-option']")
    protected WebElement elmntMyAccountTab;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Sports Betting Odds & News')]")
    protected WebElement elmntNewsHeader;

    @FindBy(how = How.XPATH, using = "//div[@id='sbcontent']/p")
    protected WebElement elmntNewsContent;

    @FindBy(how = How.XPATH, using = "//li/a[.='SPORTS' or .='Sports']")
    protected WebElement btnSportsTab;

    @FindBy(how = How.XPATH, using = "//li/a[.='Sports News']")
    protected WebElement btnSportsNewsTab;

    @FindBy(how = How.XPATH, using = "//h2[.='SPORTS BETTING LINES']")
    protected WebElement elmntBettingHeader;

    @FindBy(how = How.XPATH, using = "//h5[.=' UPCOMING GAMES']")
    protected WebElement elmntUpcomingSportsHeader;

    @FindBy(how = How.XPATH, using = "//select[@id='listLeagueAvailable']/option[contains(text(),'Boxing')]")
    protected WebElement elmntSportsDropdown;

    @FindBy(how = How.XPATH, using = "//select[@id='listLeagueAvailable']")
    protected WebElement BtnSportsDropdown;

    @FindBy(how = How.XPATH, using = " //div[@id=\"LineSportsBetting\"]/div[2]/a[contains(text(),' To all Sports Lines ➤ ')]\n")
    protected WebElement BtnAllSports;

    @FindBy(how = How.XPATH, using = "//div[@id='ngbp_lines']/div[@id='LineSportsBetting']")
    protected WebElement elmntGamesInformation;

    @FindBy(how = How.XPATH, using = "//li//a[contains(text(),'SportsBook')]")
    protected WebElement elmntSportsbookpage;

    @FindBy(how = How.XPATH, using = "//h2[.='SPORTS NEWS']")
    protected WebElement elmntSportsNewsHeader;

    @FindBy(how = How.XPATH, using = "//div[@id='ContainerDynamicPageList']/ul/div[1]/li/p/a[contains(text(),'Read More')]")
    protected WebElement btnReadMore;

    @FindBy(how = How.XPATH, using = "//div[@id='Div1']/li/a[contains(text(),'')]")
    protected List<WebElement> btnNumberLinks;

    @FindBy(how = How.XPATH, using = "//span[@class='pageTitle']/strong[contains(text(),'')]")
    protected WebElement elmntSportsNews;

    @FindBy(how = How.XPATH, using = "//li[@id='tabHeader_2']/a[.='Getting Started']")
    protected WebElement btnGettingStarted;


    @FindBy(how = How.XPATH, using = "//div[@id='Div1']/li/a[contains(text(),'2')]")
    protected WebElement elmntNumberLink;

    @FindBy(how = How.XPATH, using = "//span[.='TOP PROMOTIONS']")
    protected WebElement elmntPromotionsHeader;

    @FindBy(how = How.XPATH, using = "//div[@id='ft']//div[@class='top-page'][1]//span[2]/a/img")
    protected WebElement elmntDepositNowLink;

    @FindBy(how = How.XPATH, using = "//a[@class='terms-btn1']")
    protected WebElement btnTermsAndConditions;

    @FindBy(how = How.XPATH, using = "//div[@id='ft']/div[1]//span[2]/a[contains(text(),'See')]")
    protected WebElement btnSeeAllPromotions;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Bonus')]/preceding::img[1]")
    protected WebElement btnPromotionsImage;

    @FindAll({
    @FindBy(how = How.XPATH, using = "//div[@class='landing clearfix']"),
    @FindBy(how = How.XPATH, using = "//ul[@class='nav landing__nav-tabs']")})
    protected WebElement elmntPromotionsContents;

    @FindBy(how = How.XPATH, using = "//h2[@class='simple-stepheading-ep']")
    protected WebElement verifyCashierPage;

    @FindBy(how = How.XPATH, using = "//div[@class='theterms1 theterms']")
    protected WebElement verifyTermsPopup;

    @FindBy(how = How.XPATH, using = "//div[@class='theterms1 theterms']/img")
    protected WebElement closeTermsPopup;

    @FindBy(how = How.ID, using = "cashierFrame")
    protected WebElement CashierFrame;

    @FindBy(how = How.XPATH, using = "//ul[@class='dyn makeLink']/li/a/strong[contains(text(),'NFL')]")
    protected WebElement btnNFLBetting;
    //div[@id="licat_nfl-betting"]/span/span
    @FindBy(how = How.XPATH, using = "//li[@id='licat_nfl-betting']/descendant::span[@class='expanded']")
    protected WebElement btnExpandOption;

    @FindBy(how = How.XPATH, using = "//ul[@id='ulcategory_1']/li//span[contains(text(),'')]")
    protected List<WebElement> elmntNflSubtabs;

    @FindBy(how = How.XPATH, using = "//ul[@id='ulcategory_3']/li//span[contains(text(),'')]")
    protected List<WebElement> elmntNBASubtabs;

    @FindBy(how = How.XPATH, using = "//h2[.='NFL ODDS']")
    protected WebElement elmntNFLOddsHeader;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'NFL')]")
    protected WebElement elmntNFLOddsNewsHeader;

    @FindBy(how = How.XPATH, using = "//h2[.='nfl betting NEWS']")
    protected WebElement elmntNFLBettingNews;

    @FindBy(how = How.XPATH, using = "//ul[@id='ulcategory_1']/li//span[contains(text(),'NFL Betting Trends')]")
    protected WebElement btnNFLBettingTrends;

    @FindBy(how = How.XPATH, using = "//li[@id='licat_boxing-betting-odds']/a/strong[contains(text(),'Boxing Odds')]")
    protected WebElement btnBoxingOdds;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Boxing Betting Odds & News')]")
    protected WebElement elmntNBoxingOddsAndNewsHeader;

    @FindBy(how = How.XPATH, using = "//div[@id='sbcontent']/h1/text()[2]")
    protected WebElement elmntNFLBettingHeader;

    @FindBy(how = How.XPATH, using = "//li[@id='tabHeader_3']/a[.='Promotions']")
    protected WebElement btnPromotions;


    //h2[.='MMA ODDS']
    protected String strOddsHeader2 = new StringBuilder()
            .append("//h2[normalize-space()='")
            .append("<<TABNAME>>")
            .append("']").toString();


    //h1[contains(text(),'MMA Betting Odds & News')]
    protected String strOddsHeader1 = new StringBuilder()
            .append("//h1[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();


    protected String strOddsHeader3 = new StringBuilder()
            .append("//h2[.='")
            .append("<<TABNAME>>")
            .append("']").toString();

    protected String strSportsNewsSubTabs = new StringBuilder()
            .append("//ul[@class='dyn makeLink']//a/strong[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    protected String strMLBSubTabs = new StringBuilder()
            .append("//ul[@class='dyn makeLink']//a/span[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();
    //ul[@class='dyn makeLink']//a/strong[contains(text(),'')]


    @FindBy(how = How.XPATH, using = "//li[@id='licat_mlb-betting']//a//span[contains(text(),'')]")
    protected List<WebElement> elmntMLBsubtabs;


    @FindBy(how = How.XPATH, using = "//h2[text()='BOXING ODDS']")
    protected WebElement elmntBoxingOddsHeader;

    @FindBy(how = How.XPATH, using = "//h2[text()='boxing betting odds NEWS']")
    protected WebElement elmntBoxingNewsHeader;

    @FindBy(how = How.XPATH, using = "//li[@id='licat_mma-betting-odds']/a/strong[contains(text(),'MMA Betting Odds')]")
    protected WebElement btnMMAOdds;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'MMA Betting Odds & News')]")
    protected WebElement elmntMMAOddsAndNews;

    @FindBy(how = How.XPATH, using = "//h2[.='MMA ODDS']")
    protected WebElement elmntMMAOdds;

    @FindBy(how = How.XPATH, using = "//h2[.='mma betting odds NEWS']")
    protected WebElement elmntMMABettingNews;

    @FindBy(how = How.XPATH, using = "//li[@id='licat_ufc-betting-odds']//strong[contains(text(),'UFC Betting Odds')]")
    protected WebElement btnUfcOdds;

    @FindBy(how = How.XPATH, using = "//div[@class='wcmText']/h2[contains(text(),'')]")
    protected List<WebElement> elmntFootballBettingHeaders;

    @FindBy(how = How.XPATH, using = "//h1[@class='titlebar2']")
    protected WebElement elmntBetCalculator;

    @FindBy(how = How.XPATH, using = "//ul[@id='ulcategory_4']//a/span[contains(text(),'March Madness Odds')]")
    protected WebElement elmntMarchMadnessOdds;

    @FindBy(how = How.ID, using = "hrefcat_-college-football-betting-picks")
    protected WebElement btnCollegeFootballBettingPicks;

    @FindBy(how = How.XPATH, using = "//ul[@id='ulcategory_7']/li[contains(text(),'')]")
    protected List<WebElement> elmntGolfBettingHeaders;

    @FindBy(how = How.XPATH, using = "//li[@id='licat_nhl-betting-lines']/a/strong[contains(text(),'')]")
    protected List<WebElement> elmntNHLBettingHeaders;

    @FindBy(how = How.XPATH, using = "//ul[@id='ulcategory_8']/li/a/span[contains(text(),'Stanley Cup Odds')]")
    protected WebElement btnStanleyCupOdds;

    @FindBy(how = How.XPATH, using = "//ul[@id='ulcategory_12']/li/a/span[contains(text(),'')]")
    protected List<WebElement> elmntTennisBettingHeaders;

    @FindBy(how = How.XPATH, using = "//a[@id='hrefcat_-tennis-betting-odds-french-open']/span[contains(text(),'French Open')]")
    protected WebElement BtnFrenchopen;

    @FindBy(how = How.XPATH, using = "//ul[@id='ulcategory_13']/li/a/span[contains(text(),'')]")
    protected List<WebElement> elmntHorseBettingHeaders;

    @FindBy(how = How.ID, using = "lh")
    protected WebElement elmntopSportsImages;

    @FindBy(how = How.XPATH, using = "//div[@id='lh']//a[1]/img")
    protected WebElement btnTopPagesImages;

    @FindBy(how = How.XPATH, using = "//a/span[contains(text(),'Breeders')]")
    protected WebElement btnBreedersCup;

    @FindBy(how = How.XPATH, using = "//a[.='SportsBook']")
    protected WebElement btnSportsBookTab;

    @FindBy(how = How.XPATH, using = "//div[@class='contentHeaderBg']")
    protected WebElement elmntSportsBookHeaders;

    @FindBy(how = How.XPATH, using = "//div[@class='window-titleBar']/table//tr/td[contains(text(),'Bet Slip')]")
    protected List<WebElement> elmntBetSlipHeader;

    @FindBy(how = How.XPATH, using = "//div[@class='window-titleBar2'][contains(text(),'Play Mini Blackjack Now!')]")
    protected List<WebElement> elmntPlayMiniBlackjackHeader;

    @FindBy(how = How.XPATH, using = "//div[@class='window-titleBar2'][contains(text(),'Live Betting Games in Progress')]")
    protected List<WebElement> elmntLiveBettingGamesHeader;

    @FindBy(how = How.XPATH, using = "//div[@class='dynNav']/div[contains(text(),'')]")
    protected List<WebElement> elmntSportsbookGamesTabs;

    @FindBy(how = How.XPATH, using = "//ul[@class='btn']/li/a[@id='tutVidId']")
    protected WebElement elmntLiveBetting;

    @FindBy(how = How.ID, using = "clearSelectedId")
    protected WebElement btnClearAll;

    @FindBy(how = How.ID, using = "viewSelectedId")
    protected WebElement btnViewSelected;

    @FindBy(how = How.ID, using = "cashierFrame")
    protected WebElement LiveBettingFrame;

    @FindBy(how = How.XPATH, using = "//li[@id='tabHeader_1']/a[.='Live Betting']")
    protected WebElement elmntLiveBettingPage;

    @FindBy(how = How.XPATH, using = "//div[@class='dynNav']/descendant::div[@class='topNav'][3]")
    protected WebElement btnTableTennis;

    @FindBy(how = How.XPATH, using = "//div[@class='subNav'][3]//input")
    protected WebElement elmntTableTennisGames;

    @FindBy(how = How.XPATH, using = "//div[@class='subNav'][4]//input")
    protected WebElement elmntTableTennischeckBoxes;

    @FindBy(how = How.XPATH, using = "//div[@id='contentBody']/table[@class='league'][1]//td[@class='bdt']")
    protected WebElement elmntLiveGamesHeader;

    protected String strSportsBookSubTabs = new StringBuilder()
            .append("//div[@class='dynNav']//div/a[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();


    @FindBy(how = How.XPATH, using = "//div[@class='dynNav']//div/a[contains(text(),'MAIN SPORTS')]")
    protected WebElement btnMainSportsGames;

    @FindBy(how = How.XPATH, using = "//div[@class='mainSportsLinks']//a[contains(text(),'')]")
    protected List<WebElement> elmntMainSportsSubtabs;


    @FindBy(how = How.XPATH, using = "//div[@class='mainSportsLinks']")
    protected WebElement elmntMainSportsGames;

    @FindBy(how = How.XPATH, using = "//div[@class='subNav'][3]")
    protected WebElement elmntTableTennisTournaments;

    @FindBy(how = How.XPATH, using = "//div[@class='gamePropsLinks']/child::div[1]")
    protected WebElement elmntGamePropsTournaments;

    @FindBy(how = How.XPATH, using = "//table[@id='contestDetailTable']/tbody[3]/tr[1]/td[4]/input[@class='oddsselection]")
    protected WebElement btnLiveGameCheckBox; //todo

    @FindBy(how = How.XPATH, using = "//table[@id='contestDetailTable']/tbody[3]/tr[2]/td[3]/input[@class='oddsselection]")
    protected WebElement elmntSelectLiveGame; //todo

    @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//div[@class='tooltipdiv']\n")
    protected WebElement elmntStraightBetGameInformation;

    @FindBy(how = How.XPATH, using = "//div[@class='ulHeaderFS']/a[@class='ulHeaderAFS expanded']")
    protected WebElement elmntFutureGames;

    @FindBy(how = How.XPATH, using = "//table[@class='league contest']/child::tbody[3]/tr[1]/td/input")
    protected WebElement elmntLiveGame;

    @FindBy(how = How.XPATH, using = "//div[@class='contests']/div//a[contains(text(),'')]")
    protected List<WebElement> elmntContestsSubTab;

    @FindBy(how = How.XPATH, using = "//a[.='CONTESTS']")
    protected WebElement elmntContests;

    protected String strContestsSubTabs = new StringBuilder()
            .append("//div[@class='contests']/div//a[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//h1[@class='sq_username']")
    protected WebElement elmntContestNickname;

    @FindBy(how = How.XPATH, using = "//ul/li/a[.='CONTEST']")
    protected WebElement btnContest;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='otherSportsLinks']/div[@class='topNav'][3]"),

            @FindBy(how = How.XPATH, using = "//div[@class='otherSportsLinks']/div[@class='topNav'][2]")
    })
    protected WebElement btnOtherSportsGames;

    @FindBy(how = How.XPATH, using = "//div[@class='leftHeadMenu']//a[contains(text(),'')]")
    protected List<WebElement> elmntSquareContestsSubTab;

    @FindBy(how = How.XPATH, using = "//div[@class='usefulLinks']/div/a[contains(text(),'')]")
    protected List<WebElement> elmntUsefulLinksSubTabs;

    @FindBy(how = How.XPATH, using = "//div[@class='dynNav']//div/a[contains(text(),'USEFUL LINKS')]")
    protected WebElement elmntUsefulLinks;

    protected String strUsefulLinksSubTabs = new StringBuilder()
            .append("//div[@class='usefulLinks']/div/a[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//li[@id='tabHeader_2']/a[.='Getting Started']")
    protected WebElement elmntGettingStartedHeader;


    @FindBy(how = How.XPATH, using = "//div[@id='myaccount_left']//li/a[.='My Account']")
    protected WebElement elmntMyAccountHeader;

    @FindBy(how = How.XPATH, using = "//div[@class='dynNav']//div/a[contains(text(),'USEFUL LINKS')]")
    protected WebElement btnUsefulLinks;


    @FindBy(how = How.XPATH, using = "//div[@class='dynNav']//div/a[contains(text(),'MAIN SPORTS')]")
    protected WebElement btnmainSports;

    @FindBy(how = How.XPATH, using = "//h1[.='SPORTSBETTING HELP']")
    protected WebElement elmntSportsBettingHelp;

    @FindBy(how = How.XPATH, using = "//div[@class='ul']/a[.='Betting Limits']")
    protected WebElement btnBettingLimits;

    @FindBy(how = How.XPATH, using = "//div[@class='ul']/a[.='Sportsbook Rules']")
    protected WebElement btnSportsbookRules;

    @FindBy(how = How.XPATH, using = "//div[@class='ul']/a[.='Sportsbook Bonuses']")
    protected WebElement btnSportsbookBonuses;

    @FindBy(how = How.XPATH, using = "//div[@class='ul']/a[.='Sportsbook Help & FAQ']")
    protected WebElement btnSportsbookHelp;

    @FindBy(how = How.XPATH, using = "//div[@id='center']/descendant::div/input[@id='searchInputId']")
    protected WebElement elmntROTSeachBar;

    @FindBy(how = How.XPATH, using = "//div[@id='center']/descendant::div[@class='searchBtnTd']/button[@id='searchBtn']")
    protected WebElement btnSearchBar;

    @FindBy(how = How.XPATH, using = "//div[@id='contentBody']/table[@class='league']//tr/td[@class='bdt']")
    protected WebElement elmntSearchResults;

    @FindBy(how = How.XPATH, using = "//div[@class='oddsFormatDropDownTd']//input[@name='oddsFormatSelect__sexyCombo']")
    protected WebElement elmntOddsDroddown;

    protected String strOddsDropdown = new StringBuilder()
            .append("//div[@class='list-wrapper visible']/ul/li/span[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//table[@class='league'][1]/tbody[@class='event']/tr[1]/td[@class='odds bdevtt moneylineodds displayOdds']")
    protected WebElement elmntOddValues;

    @FindBy(how = How.XPATH, using = "//div[@class='window-titleBar2'][.='Play Mini Blackjack Now!']")
    protected WebElement elmntBlackjackHeader;

    @FindBy(how = How.ID, using = "myDiv")
    protected WebElement elmntBlackJackGame;

    protected String strSearchDropdown = new StringBuilder()
            .append("//div[@class='list-wrapper visible']/ul/li/span[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[@class='lineSortingDropDownTd']//input[@name='linesSortOptionSelect__sexyCombo']")
    protected WebElement elmntSearchBox;

    @FindBy(how = How.XPATH, using = "//div[@class='lineSortingDropDownTd']//td[@class='helpTd']/div[@class='help moveDown tooltipdiv']")
    protected WebElement elmntSortDropdownHelpIcon;

    @FindBy(how = How.XPATH, using = "//div[@class='oddsFormatDropDownTd']//td/div[@class='help moveDown tooltipdiv']")
    protected WebElement elmntSortLinesHelpIcon;

    @FindBy(how = How.XPATH, using = "//div[@id='miniLiveBetting']/div[.='Live Betting Games in Progress']")
    protected WebElement elmntInProgressGames;

    @FindBy(how = How.ID, using = "active")
    protected WebElement elmntLiveGames;

    @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//td/div[@class='ticketno']")
    protected WebElement elmntBetAcceptedMessage;

    @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//tr/td/div[contains(@class,'nbl')]/input")
    protected WebElement elmntParlayRiskFieldInput;

    @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//tr[@id='wgrItm_2_tr'][4]//td[contains(@class,'amt')]/input[1]")
    protected WebElement elmntIFBetRiskFieldInput;

    @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//tr[@id='wgrItm_3_tr'][4]/td[2]/input")
    protected WebElement elmntSecondRowIFBetRiskFieldInput;

    @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//td[contains(@class,'choice')]/select[@class='wagerselectionchoice']")
    protected WebElement elmntIfBetTabDropdown;

    @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//td[contains(@class,'choice')]/select[@class='wagerselectionchoice']/option[text()='Win Only']")
    protected WebElement elmntIfBetTabDropdownChoice1;

    @FindBy(how = How.XPATH, using = "//div[not(contains(@id,'betslipJQoteDiv'))]/div[@id='betslipDiv']//table[@class='betslipbbar']//button[@id][.='Clear All']")
    protected WebElement elmntBetSlipClearAllBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='flag__body']/ul/li[not(contains(@class,'t25'))]/a[contains(@class,'tertiary')]/b[contains(text(),'')]")
    protected List<WebElement> elmntPlayerPropsSubTabs;

    @FindBy(how = How.XPATH, using = "//div[@class='media__body']/descendant::div[@class='game-title']")
    protected WebElement elmntPlayerPropsDropDown;

    @FindBy(how = How.XPATH, using = "//div/ul[contains(@class,'nav--dropdown-form')]/li[4]/a[@class='btn-ns ng-scope']")
    protected WebElement elmntPlayerPropsDropdownValue;

    @FindBy(how = How.XPATH, using = "//span[.='Build Your Bet']")
    protected WebElement elmntBuildYourBetHeader;

    @FindBy(how = How.XPATH, using = "//li[@class='ng-scope']/a/descendant::span[.='AFL']")
    protected WebElement BtnGameLaliga;

    @FindBy(how = How.XPATH, using = "//div[@class='co-dropdown  h-show']/a//span[@class='icon-info']")
    protected WebElement elmntLearnMore;


    @FindBy(how = How.XPATH, using = "//li[@class='ng-scope']/a/descendant::span[.='NFL Sims']")
    protected WebElement BtnNFLSimsGame;

    @FindBy(how = How.XPATH, using = "//iframe[@id='builder']")
    protected WebElement PlayerPropsIFrame;

    @FindBy(how = How.XPATH, using = "//h3[@class='cap ng-scope']/span[@class='ng-scope']")
    protected WebElement elmntPlayerPropsTeam;

    protected String strPlayerPropsTab = new StringBuilder()
            .append("//div[@class='flag__body']/ul/li[not(contains(@class,'t25'))]/a[contains(@class,'tertiary')]/b[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[@class='co-search-predictive']//input[contains(@class,'search')]")
    protected WebElement elmntPlayerPropsSearchField;

    @FindBy(how = How.XPATH, using = "//div[@class='co-search-predictive']/div[@class='markets-wrapper']")
    protected WebElement elmntPlayerPropsDefaultResuts;

    @FindBy(how = How.XPATH, using = "//div[@class='island-large-res  fit']//player-row[1]/div[contains(@class,'table')]")
    protected WebElement elmntPlayerPropsSearchResuts;

    @FindBy(how = How.XPATH, using = "//div[@class='con-pb-criteria  island']//div[@class='flag__body']/div/b/a[@class='epsilon ng-binding']")
    protected WebElement elmntPlayerPropsBetSlip;

    @FindBy(how = How.XPATH, using = "//div[@class='markets-wrapper']/descendant::div[@class='container']")
    protected WebElement elmnQuickPicksButtons;

    @FindBy(how = How.XPATH, using = "//div[@class='markets-wrapper']//section/div/button[text()='Player Stat Doubles']")
    protected WebElement btnPlayerStatDoubles;

    @FindBy(how = How.XPATH, using = "//li[@id=\"tabPd\"]/div/div[1]/div[2]")
    protected WebElement elmntQuickPicksOdds;

    @FindBy(how = How.XPATH, using = "//div[@class='co-psl__panel']/descendant::div/b[.='bet slip']")
    protected WebElement elmntQuickPicksBetSlip;

    @FindBy(how = How.XPATH, using = "//section[@class='layout-wrap ng-scope layout-row']/div/button[contains(text(),'Collapse All')]")
    protected WebElement btnCollapseAll;

    @FindBy(how = How.XPATH, using = "//li[@id='tabGf']/p/span[contains(text(),'Game Markets')]")
    protected WebElement elmntGameMarketsHeader;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//pick-builder/div/div[1]/div[2]/ul/li/a/span/span[contains(text(),'')]")
    protected List<WebElement> btnBuildYourBetHeader;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']/div/descendant::div[3]//bet-slip//div[@class='co-pls__panel__body  island-large-res']/div[@class='flag']//ul/li[1]/a/span[.='clear slip']")
    protected WebElement btnClearSlip;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//pick-builder/div/div[1]/div[2]/ul/li/a/span/span[contains(text(),'stat')]")
    protected WebElement btnStat;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//pick-builder/descendant::div[@class='t-med  t-loud  push-half--bottom  cap']/span[1][contains(text(),'')]")
    protected List<WebElement> elmntBuildYourBetHeaders;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//pick-builder//statistic-picker/descendant::div[@class='ng-scope'][.='select statistic']"),
            @FindBy(how = How.XPATH, using = "(//div[@class='icon-arrow-dropdown  milli  h-lh-btn'])[3]")
    })
            protected WebElement btnSelectStatistic;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//pick-builder/descendant::div[@class='flag__image  hard--right']/span[.='will have']")
    protected WebElement btnWillHave;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//pick-builder/descendant::div[@class='text--right ng-scope']/a/span[.='clear']")
    protected WebElement btnClear;

    @FindBy(how = How.XPATH, using = "//li[@id='searchplayer1']/player-pick/descendant::div[@class='flag__body']/div/b/a[@class='epsilon ng-binding']")
    protected WebElement elmntPlayerPropsTeamName;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//pick-builder//statistic-picker/descendant::div[@class='co-select-box__flyout  cap']/ul/li/a/span[.='Assists']")
    protected WebElement elmntStatisticsOption;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//pick-builder/descendant::div[@class='grid']//ul[contains(@class,'bright')]/li/a[contains(text(),'')]")
    protected List<WebElement> elmntWillHaveOptions;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//statistic-value-picker/descendant::div/ul/li[2]/a[contains(@class,'small')]")
    protected WebElement btnAddScoreIcon;

    //main[@id='betbuilder']//bet-confirm/descendant::div[@class='flag']/div/a[.='add to bet slip']

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//bet-confirm/descendant::div[@class='flag']/div/a/span[text()='add to bet slip']")
    protected WebElement BtnAddToBetSlip;


    @FindBy(how = How.XPATH, using = "//a/span[text()='add to bet slip']")
    protected WebElement btnAddToBetSlip;

    @FindBy(how = How.XPATH, using = "//input[@type='number']")
    protected WebElement btnBetSlipInputField;

    @FindBy(how = How.XPATH, using = "//div[@id='modal_pick-confirm']/following::div[@class='co-modal__body  co-modal__body--single'][2]")
    protected WebElement elmntBetSlipPopUp;

    @FindBy(how = How.XPATH, using = "//div[@id='modal_pick-confirm']/descendant::div/ul/li[2]/a/span[.='confirm']")
    protected WebElement BtnConfirmBet;


    @FindBy(how = How.XPATH, using = "//div[@id='modal_pick-confirm']/descendant::div/ul/li/a/span[.='confirm']")
    protected WebElement btnConfirmBetPlayerProps;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//bet-slip/descendant::ul[1]/li[2]/a/span[@class='cap']")
    protected WebElement btnPlaceMyBetPlayerProps;

    @FindBy(how = How.XPATH, using = "//div[@id='modal_pick-confirm']/descendant::div[@class='t-positive  text--center  push--bottom']/b[@class='ng-scope']")
    protected WebElement elmntBetSlipMessage;

    @FindBy(how = How.XPATH, using = "//div[@id='modal_pick-confirm']//ul[contains(@class,'cozy')]/li/a[.='close']")
    protected WebElement elmntBetSlipCloseBtn;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//bet-confirm/descendant::div[@class='flag']/div/a[1]/span[.='clear']")
    protected WebElement elmntBuildYourBetHeaderClearBtn;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//pick-builder/div[@class='c-base ng-scope']/div[@class='con-pb-criteria  island']")
    protected WebElement elmtBuildYourBetTeams;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//pick-builder//bet-offer/descendant::div/b[contains(@class,'caps')]")
    protected WebElement elmntPlayerPropsOdds;

    protected String strPlayerPropsOddsDropDown = new StringBuilder()
            .append("//main[@id='betbuilder']//pick-builder//bet-offer//div[@class='game-title  cap']/span[.='")
            .append("<<TABNAME>>")
            .append("']").toString();

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//pick-builder//bet-offer/descendant::div[contains(@class,'flag')]/div/input[@type='text']")
    protected WebElement elmntOddValue;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//pick-builder//nav-bet/div[contains(@class,'show')]/descendant::div[.='BETS']"),
            @FindBy(how = How.XPATH, using = "(//span[@class='ui-grid-icon-menu'])[2]")
    })
            protected WebElement btnPlayerPropsBet;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//pick-builder//nav-bet/descendant::div[contains(@class,'dropdown')]/ul/li//div[@class='flag__body  cap'][contains(text(),'')]")
    protected List<WebElement> elmntPlayerPropsBetOptions;

    protected String strPlayerPropsBetOptions = new StringBuilder()
            .append("//main[@id='betbuilder']//pick-builder//nav-bet/descendant::div[contains(@class,'dropdown')]/ul/li//div[@class='flag__body  cap'][contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    protected String strPlayerPropsBetOptions1 = new StringBuilder()
            .append("(//div[@class='flag__body  caps'][contains(text(),'")
            .append("<<TABNAME>>")
            .append("')])[2]").toString();

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//bet-slip/descendant::div/span[.='No bets']")
    protected WebElement elmntNoBetsText;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//bet-slip/descendant::div[@class='flag__image']/a[contains(@class,'close')]")
    protected WebElement btnCloseBetSlip;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']/descendant::div[@class='l-wrap-inner']")
    protected WebElement elmntPlayerPropsHelpPage;

    @FindBy(how = How.XPATH, using = "//div[@id='modal_pick-confirm']//ul[contains(@class,'cozy')][1]/li/a[.='cancel']")
    protected WebElement btnBetSlipCancel;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//bet-slip/descendant::div[@class='flag__image']/a[contains(@class,'close')]")
    protected WebElement elmntCloseIconBetSlip;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//ul[contains(@class,'right')]/li[1]/a/span[1]")
    protected WebElement elmntOpenBets;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']//div[@class='co-tabs-show']/pick-group/div[1]")
    protected WebElement elmntOpenBetsPage;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']/descendant::div[contains(@class,'bets')]/ul[2]/li/a/span[.='past bets']")
    protected WebElement btnPastBets;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']/descendant::div[contains(@class,'my-bets')][1]")
    protected WebElement elmntPastBetsInformation;

    @FindBy(how = How.XPATH, using = "//main[@id='betbuilder']/descendant::div[contains(@class,'bets')]/ul/li/a[.='back']")
    protected WebElement elmntMyBetsBackBtn;

    @FindBy(how = How.XPATH, using = "//div[@id='wrapper']/p[1]/a[.='General Rules']")
    protected WebElement BtnGeneralRulesLink;


    @FindBy(how = How.XPATH, using = "//main//div[contains(@class,'three-fifths')]")
    protected WebElement elmntPlayerPropsPage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'There is no Game open for betting now. Please visit us again later.')]")
    protected WebElement elmntErrorMsg;
    ;
    @FindBy(how = How.XPATH, using = "//span[.='Upcoming Events']")
    protected WebElement elmntPlayerPropsUpcomingEventsHeader;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'con-pb-criteria  island')]")
    protected WebElement elmntPlayerPropsUpcomingGames;

    //-----------------//

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='Parlays']/following::div[@class='betSlipDetailError']"), //tablet
            @FindBy(how = How.XPATH, using = "//span[@style='text-shadow: none;']") //mobile
    })
    protected WebElement betSlipErrorMsg;
    @FindAll({

            @FindBy(how = How.XPATH, using = "//a[.='Delete All']"), //tablet
            @FindBy(how = How.XPATH, using = "//input[@id='remove']") // mobile
    })
    protected WebElement elmntDeleteAllbtn;

    @FindBy(how = How.XPATH, using = "//span[.='Basketball - NBA']")
    protected WebElement elmntBasketBallTeam;

    @FindBy(how = How.XPATH, using = "//div[.='MAIN SPORTS']")
    protected WebElement sportsHeaderVerify;

    @FindBy(how = How.XPATH, using = "//a/descendant::span[contains(., 'Risk')][1]")
    protected WebElement lnkRiskMaxLimit;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'higher')]")
    protected WebElement txtBetSlipError;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[contains(text(),'Single Bet')]/following::a[1]"),
            @FindBy(how = How.XPATH, using = "//div[@id='straightPopup']/a")
    })
    protected WebElement lnkRemoveTeamFromBetSlip;

    @FindAll({
            @FindBy(how = How.XPATH, using = "(//a[contains(., 'NBA')])[1]")
//            @FindBy(how = How.XPATH, using = "(//a[contains(., 'Darts')])[1]")
    })
    protected WebElement lnkTeamPageBackArrow;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'Your bet was not submitted')]")
    protected WebElement txtBetSlipServerError;

    @FindBy(how = How.XPATH, using = "//div[@id='removeIcon']/a/descendant::span[contains(@class, 'iconWhite')]")
    protected List<WebElement> lnkSingleBetCloseIcons;

    @FindBy(how = How.XPATH, using = "//input[@id='addmoreselections']")
    protected WebElement inpAddMoreSelectionsUnderBetSlip;

    @FindBy(how = How.XPATH, using = "(//span[.='Down'])[1]/ancestor::a")
    protected WebElement lnkIfDownArrow;

    @FindBy(how = How.XPATH, using = "(//span[.='Up'])[2]/ancestor::a")
    protected WebElement lnkIfUpArrow;

    @FindBy(how = How.XPATH, using = "((//span[.='Up'])[2]/following::div[@class='teamName'])[1]/span")
    protected WebElement txtTeamName;

    @FindBy(how = How.XPATH, using = "//div[@id='sport-menu']")
    protected WebElement elmntSportsUnderSportsPage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[@class='a-offering-title']"),
            @FindBy(how = How.XPATH, using = "//a[@id='title-button']")
    })
    protected WebElement lnkSportsBackIcon;

    @FindBy(how = How.XPATH, using = "//div[@id='wager-type-navbar']/descendant::button")
    protected List<WebElement> btnWagerTypes;

    @FindBy(how = How.XPATH, using = "(//a[@class='date-Event']/descendant::span[2])[1]")
    protected WebElement elmntTimeUnderSportsTeams;

    @FindBy(how = How.XPATH, using = "//div[@class='titleOrder']")
    protected List<WebElement> elmntSportsHeaders;

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'returnTop')]")
    protected WebElement lnkBackToTop;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, 'box-content')])[1]")
    protected WebElement elmntFirstTeamContainer;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'date-Event ui')]")
    protected WebElement lnkExpandIconWithTimeUnderSportsTeams;

    //--------------------//

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'btn cap')]")
    protected List<WebElement> lnkCurrentAndUpcoming;

    @FindBy(how = How.XPATH, using = "//*[@class='ui-grid-icon-menu']/ancestor::a")
    protected List<WebElement> lnkNavigators;

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'btn cap on') and contains(text(), Current)]")
    protected WebElement lnkCurrentMarkets;

    @FindBy(how = How.XPATH, using = "(//i[contains(@class, 'glyphicon-chevron-down')])[1]")
    protected WebElement elmntCurrentMarketsExpanded;

    @FindBy(how = How.XPATH, using = "(//i[contains(@class, 'glyphicon-chevron-right')])[1]")
    protected WebElement elmntCurrentMarketsCollapsed;

    @FindBy(how = How.XPATH, using = "(//div[@class='marketscroll'])[1]/descendant::button[2]")
    protected WebElement btnOddsUnderCurrentMarkets;

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'minus')]")
    protected WebElement lnkRemoveTeamUnderBetSlip;

    @FindBy(how = How.XPATH, using = "//div[.='BETS']/preceding::span[contains(@class, 'counter')]")
    protected WebElement txtBetSlipCount;

    @FindBy(how = How.XPATH, using = "//span[.='Upcoming Events']/following::div[contains(@class, 'event ng')][1]")
    protected WebElement elmntUpcomingEvents;

    @FindBy(how = How.XPATH, using = "//a[@class='rules_btn']")
    protected WebElement lnkMoreHelpUnderUpcomingEvents;

    @FindBy(how = How.XPATH, using = "//div[@id='faq']/descendant::a[1]")
    protected WebElement lnkCloseUnderMoreHelp;

    @FindBy(how = How.XPATH, using = "//ul/descendant::a/b")
    protected List<WebElement> lnkOddsConverter;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'large-res hard')]/descendant::a[contains(@class, 'on')]")
    protected WebElement lnkLeaguesUnderLeftNavigator;

    @FindBy(how = How.XPATH, using = "//b[.='select league']/following::a[1]")
    protected WebElement lnkCloseLeftNavigator;

    @FindBy(how = How.XPATH, using = "(//div[@class='marketscroll'])[1]/descendant::button[2]/descendant::span[contains(., '.')]")
    protected WebElement txtOddsPatternChangeToDecimal;

    @FindBy(how = How.XPATH, using = "(//ul[contains(@class, 'dropdown')])[1]/descendant::div[contains(@class, 'body')]")
    protected List<WebElement> lnkBetSlipDropDown;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 't-med  ')]/descendant::span[2]")
    protected WebElement elmntBetSlipTeamCount;

    @FindBy(how = How.XPATH, using = "//div[.='bet slip']/following::a[1]")
    protected WebElement lnkCloseUnderBetSlip;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'cf')]/descendant::a[contains(., '')]")
    protected List<WebElement> elmntMyBetsOptions;

    @FindBy(how = How.XPATH, using = "//span[.='open bets']/parent::a[contains(@class, 'on')]")
    protected WebElement lnkOpenBetsSelectedAsDefault;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class, 'add')])[1]")
    protected WebElement lnkPlaceMyBetUnderPlayerProps;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class, 'clear')])[1]")
    protected WebElement lnkClearSlipUnderBetSlip;

    @FindBy(how = How.XPATH, using = "//span[.='confirm']/parent::a")
    protected WebElement lnkConfirmUnderBetSlip;

    @FindBy(how = How.XPATH, using = "//b[contains(text(), 'success')]")
    protected WebElement txtBetSuccessful;

    @FindBy(how = How.XPATH, using = "//a[.='close']")
    protected WebElement btnCloseInBetSlipPlayerPropsMobile;

    @FindBy(how = How.XPATH, using = "//span[.='IMPORTANT MESSAGE - PLEASE READ']")
    protected WebElement txtBetSlipErrorOne;

    //--------------------------------//

    //Player Props Mobile

    //--------------------------------//

    @FindBy(how = How.XPATH, using = "(//i[contains(@class, 'soccer')])[1]/ancestor::a")
    protected WebElement lnkSoccerLeague;

    protected String currentTeamSelected = null;

    @FindBy(how = How.XPATH, using = "//span[.='vs']/following::span[1]")
    protected WebElement txtCurrentTeamSelected;

    @FindBy(how = How.XPATH, using = "//i[contains(@class, 'down')]/ancestor::p")
    protected WebElement elmntCollapseUnderQUICKPICKS;

    @FindBy(how = How.XPATH, using = "//a/b[@class='micro caps']")
    protected List<WebElement> lnkOverUnderOptions;

    @FindBy(how = How.XPATH, using = "//span[.='statistic']")
    protected WebElement txtStatistic;

    @FindBy(how = How.XPATH, using = "//span[.='player']")
    protected WebElement txtPlayers;

    @FindBy(how = How.XPATH, using = "//span[.='Check back soon']")
    protected WebElement txtCheckBackSoon;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, 'fullwidth')][@role='button'])[1]")
    protected WebElement elmntFirstTeamUnderBuild;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'c-base')])[3]/descendant::span[@class='t-med']")
    protected List<WebElement> elmntBuildOptions;

    @FindBy(how = How.XPATH, using = "//span[.='Select Statistic']/following::a[contains(@class, 'player')][1]")
    protected WebElement lnkSubChoicesUnderStats;

    @FindBy(how = How.XPATH, using = "//b[.='Build Your Bet']")
    protected WebElement txtBuildYourBets;

    @FindBy(how = How.XPATH, using = "//span[.='add player']")
    protected WebElement elmntAddPlayerUnderBuildYourBet;

    @FindBy(how = How.XPATH, using = "//a/span[.='RESET']")
    protected WebElement lnkResetUnderBuildYourBet;

    @FindBy(how = How.XPATH, using = "//div[@class='custom-banner']")
    protected WebElement elmntImageBanner;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, 'left  l')])[2]/descendant::a[contains(@class, 'help')]")
    protected WebElement lnkHelpIconUnderSoccer;

    @FindBy(how = How.XPATH, using = "(//a[@class='icon-cross'])[1]")
    protected WebElement lnkIconCross;

    @FindBy(how = How.XPATH, using = "//div[@class='help-dialog']")
    protected WebElement elmntHelpPopUpUnderSoccerPage;

    @FindBy(how = How.XPATH, using = "(//i[contains(@class, 'basketball')])[1]/ancestor::a")
    protected WebElement lnkBasketBallLeague;

    @FindBy(how = How.XPATH, using = "//input[@type='number']")
    protected WebElement BtnBetSlipInputField;

    @FindBy(how = How.XPATH, using = "(//div[.='BETS'])[2]/preceding::span[contains(@class, 'counter')][1]")
    protected WebElement txtBetSlipCountUnderBuildYourBet;


    //Regression Methods

    /*Description: Verify all header tab - Landing page*/

    public boolean verifyLandingPageTablet(String strTabName) {
        String strActualLocator = startsWithCapitalize(strTabName);
        System.out.println("\n >> strTabName: " + strTabName + " \n >>> strActualLocator : " + strActualLocator);
        /*if ((strTabName .toLowerCase().contains("Sports".toLowerCase()))) {
            waitForElement(elmntHeaderTabs);
        }*/

        /*Assert.assertTrue(verifyElement(waitForElement(elmntHeaderTabs)));*/


        if (strTabName.toLowerCase().contains("Deposit".toLowerCase())) {
            focusFrame(iFrameCashier);
            return (verifyElement(waitForElement(elmntCashierLandingPage)));
        }

        if (strTabName.toLowerCase().equalsIgnoreCase("E-SPORTS".toLowerCase())) {
            focusFrame(iFrameEsport);
            return (verifyElement(waitForElement(elmntFrameESportsPage)));
        }

        if (strTabName.toLowerCase().equalsIgnoreCase("Live".toLowerCase())) {
            focusFrame(iFrameLive);
            return (verifyElement(waitForElement(elmntFrameLivePage)));
        }

        if (strTabName.toLowerCase().equalsIgnoreCase("Live Casino".toLowerCase())) {
            focusFrame(iFrameLivecasino);
            return (verifyElement(waitForElement(elmntFrameLiveCasinoPage)));
        }

        if (strTabName.toLowerCase().equalsIgnoreCase("Casino".toLowerCase())) {
            return driver.getTitle().equalsIgnoreCase("Mobile lobby");
        }

        if (strTabName.toLowerCase().contains("Racebook".toLowerCase())) {
            focusFrame(iFrameRacebook);
            return (verifyElement(waitForElement(elmntFrameRacebookPage)));
        }

        if (strTabName.toLowerCase().contains("Player Props".toLowerCase())) {
            focusFrame(iFramePlayerprops);
            return (verifyElement(waitForElement(elmntFramePlayerPropsPage)));
        }

        if (strTabName.toLowerCase().contains("Sports".toLowerCase())) {
//            focusFrame(iFrameSports);
            return (verifyElement(waitForElement(elmntFrameSportsPage)));
        }

        return false;
    }

    /*Description: Verify all header tab - Landing page*/

    public boolean verifyLandingPageMobile(String strTabName) {
        String strActualLocator = startsWithCapitalize(strTabName);
        System.out.println("\n >> strTabName: " + strTabName + " \n >>> strActualLocator : " + strActualLocator);
        /*if ((strTabName .toLowerCase().contains("Sports".toLowerCase()))) {
            waitForElement(elmntHeaderTabs);
        }*/

        /*Assert.assertTrue(verifyElement(waitForElement(elmntHeaderTabs)));*/


        if (strTabName.toLowerCase().contains("Poker".toLowerCase())) {
//            focusFrame(iFrameCashier);
            return (verifyElement(waitForElement(elmntPokerpage)));
        }

        if (strTabName.toLowerCase().equalsIgnoreCase("ESPORTS".toLowerCase())) {
            focusFrame(iFrameEsport);
            return (verifyElement(waitForElement(elmntFrameESportsPage)));
        }

        if (strTabName.toLowerCase().equalsIgnoreCase("Live".toLowerCase())) {
            focusFrame(iFrameLive);
            return (verifyElement(waitForElement(elmntFrameLivePage)));
        }

        if (strTabName.toLowerCase().equalsIgnoreCase("Casino".toLowerCase())) {
//            focusFrame(iFrameLivecasino);
            return (verifyElement(waitForElement(elmntFrameLiveCasinoPage)));
        } else if (strTabName.toLowerCase().equalsIgnoreCase("Red".toLowerCase())) {
//            focusFrame(iFrameLivecasino);
            return (verifyElement(waitForElement(elmntFrameLiveCasinoPage)));
        }

        if (strTabName.toLowerCase().equalsIgnoreCase("Classic Casino".toLowerCase())) {
            return (verifyElement(waitForElement(elmntClassicCasinopage)));

        }

        if (strTabName.toLowerCase().contains("Racebook".toLowerCase())) {
            focusFrame(iFrameRacebook);
            return (verifyElement(waitForElement(elmntFrameRacebookPage)));
        }

        if (strTabName.toLowerCase().contains("Player Props".toLowerCase())) {
            focusFrame(iFramePlayerprops);
            return (verifyElement(waitForElement(elmntFramePlayerPropsPage)));
        }

        if (strTabName.toLowerCase().contains("Sports".toLowerCase())) {
//            focusFrame(iFrameSports);
            return (verifyElement(waitForElement(elmntFrameSportsPage)));
        }

        if (strTabName.toLowerCase().contains("Black".toLowerCase())) {
            return (verifyElement(waitForElement(elmntFrameBlackPage)));
        }

        return false;
    }


    public boolean verifyLandingPage(String strTabName) {
        String strActualLocator = startsWithCapitalize(strTabName);
        System.out.println("\n >> strTabName: " + strTabName + " \n >>> strActualLocator : " + strActualLocator);
        if (!(strTabName.toLowerCase().contains("cashier".toLowerCase()))) {
            System.out.println("entered first if");
            waitForElement(elmntHeaderTabs);
        }

        if (!(strTabName.toLowerCase().contains("ESPORTS".toLowerCase())) && strTabName.toLowerCase().contains("Sports".toLowerCase()) || strTabName.toLowerCase().contains("Live Betting".toLowerCase())
                || strTabName.toLowerCase().contains("Poker".toLowerCase()) || strTabName.toLowerCase().contains("Racebook".toLowerCase())) {
            System.out.println("entered second if");
            WebElement btnHeaderTabName = waitForElement(By.xpath(
                    strTabNameLocator.replace("<<TABNAME>>", strActualLocator)));
            return verifyElement(btnHeaderTabName) && verifyElement(waitForElement(elmntGameContent));
        }

        if (strTabName.toLowerCase().contains("Casino".toLowerCase()) && !(strTabName.toLowerCase().contains("Live".toLowerCase()))) {
            WebElement btnHeaderTabName = waitForElement(By.xpath(strSubTabNameLocator.replace("<<TABNAME>>", "Featured")));
            return (waitForElements(elmntsGamePaneRows).size() >= 1 && verifyElement(btnHeaderTabName));
        }

        if (strTabName.toLowerCase().contains("Red".toLowerCase())) {
            return (verifyElement(waitForElement(elmntLiveCasinoPage)) && verifyElement(waitForElement(elmntLiveCasino)));
        }
        if (strTabName.toLowerCase().contains("Black".toLowerCase())) {
            return (verifyElement(waitForElement(elmntLiveCasinoPage)) && verifyElement(waitForElement(elmntLiveCasino)));


        }


//        if (strTabName.toLowerCase().contains("Live Casino".toLowerCase())) {
//            WebElement btnHeaderTabName = waitForElement(By.xpath(strSubTabNameLocator.replace("<<TABNAME>>", strActualLocator)));
//            return (verifyElement(waitForElement(elmntFrameLiveCasinoPage)) && verifyElement(waitForElement(btnHeaderTabName)));
//
//        }

        if (strTabName.toLowerCase().contains("ESPORTS".toLowerCase())) {
            return (verifyElement(waitForElement(elmntFrameESportsPage)));
        }

        if (strTabName.toLowerCase().contains("cashier".toLowerCase())) {
            return (verifyElement(waitForElement(elmntCashierLandingPage)));
        }

        if (strTabName.toLowerCase().contains("Contests".toLowerCase())) {
            return (verifyElement(waitForElement(lblContestsAndHowToPlay)) && verifyElement(waitForElement(elmntImageCarouselContestsPage)));
        }
        if (strTabName.toLowerCase().contains("promotions".toLowerCase())) {
            jsScrollUp();
            return (verifyElement(waitForElement(elmntPromotionsSubTabNames)) && verifyElement(waitForElement(elmntImageCarouselContestsPage)));
        }

        return false;
    }


    /*Description: */
    public void clickConfirmBet() {
        waitForElement(elmntTotalRiskAndPotentialWinAmount);
        Reporter.addStepLog(waitForElement(elmntTotalRiskAndPotentialWinAmount).getText());
        takeScreenshot("beforeclickConfirmBet");
        click(waitForElement(btnConfirmBet));
    }

    /*Description: */
    public void selectFootBallTeamInSpreadColumn() {
        waitForElement(elmntSportBookPage);
        waitForElement(elmntFootBallTeamTableInSportBookPage);
        waitForElement(elmntTeamName);

        Reporter.addStepLog(" ROT NO: " + waitForElement(elmntRotNumber).getText() + "; Team Name: "
                + waitForElement(elmntTeamName).getText());
        click(waitForElement(chkSpreadColumnFirstRowField));
        takeScreenshot("selectFootBallTeamInSpreadColumn");
    }

    /*Description: */
    public void clickPlaceMyBetInStraightBetForm() {
        waitForElement(elmntBetSlipForm);
        click(waitForElement(elmntStraightBetSubTab));
        mouseClick(waitForElement(txtRiskFieldInBetSlip));
        enterValue(waitForElement(txtRiskFieldInBetSlip), "2");
        takeScreenshot("clickPlaceMyBetInStraightBetForm");
        click(waitForElement(btnPlaceMyBet));
    }

    /*Description: verify Ticket number accepted in Bet Slip form*/
    public boolean verifyTicketNumberAcceptedMessage() {
        waitForElement(lblTicketNumberAccepted);
        Reporter.addStepLog(waitForElement(lblTicketNumberAccepted).getText());
        boolean isVerified = false;
        isVerified = verifyElement(lblTicketNumberAccepted);
        takeScreenshot("verifyTicketNumberAcceptedMessage");
        click(waitForElement(btnCloseInBetSlip));
        return isVerified;
    }

    public void clickPlaceMyBetInMobile() {
        waitForElement(elmntBetSlipForm);
        //mouseClick(waitForElement(txtRiskFieldInBetSlip));
        enterValue(waitForElement(txtRiskFieldInBetSlip), "2");
        takeScreenshot("clickPlaceMyBetInStraightBetForm");
        click(waitForElement(btnPlaceMyBet));
    }

    public void selectATeamForBetting() {
        waitForElement(elmntGame);
        click(elmntGame);
        waitForElement(elmntGameType);
        click(elmntGameType);
        waitForSeconds(2);
        waitForElement(elmntFirstTeam);
        click(elmntFirstTeam);
        takeScreenshot("SelectTeamBetting");
    }

    public void clickMobConfirmBet() {
        waitForElement(btnConfirmBet);
        click(btnConfirmBet);
    }


    public void clickAddMoreSelections() {
        waitForElement(lnkAddMoreSelection);
        click(lnkAddMoreSelection);
        takeScreenshot("lnkAddMoreSelection");
    }

    public void selectNewTeam() {
        waitForElement(elmntNewTeam);
        click(elmntNewTeam);
        takeScreenshot("SelectNewTeam");
    }

    public void clickCheckBetSlip() {
        waitForElement(elmntCheckBetSlip);
        click(elmntCheckBetSlip);
        takeScreenshot("elmntCheckBetSlip");
    }

    public void clickParlays() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            waitForElement(elmntSingleBet);
            click(elmntSingleBet);
            takeScreenshot("BeforeClickParlay");
            waitForElement(elmntParlays);
            click(elmntParlays);
            takeScreenshot("afterClickPArlay");
            click(betInputParlaysBet);
            click(numericInput);
            click(numericInputDone);
            takeScreenshot("AfterenterParlayAmount");
            click(btnPlaceMyBet);
            takeScreenshot("AfterClickelmntPlaceBet");
        } else {
            if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
                waitForElement(elmntSingleBet);
                click(elmntSingleBet);
            }
            takeScreenshot("BeforeClickParlay");
            waitForElement(elmntParlays);
            click(elmntParlays);
            takeScreenshot("afterClickPArlay");
            // mouseClick(waitForElement(txtParlayBet));

            enterValue(waitForElement(txtParlayBet), "5");
            takeScreenshot("AfterenterParlayAmount");
            click(waitForElement(elmntPlaceBet));
            takeScreenshot("AfterClickelmntPlaceBet");
        }
    }

    public void clickBetConfirm() {
        takeScreenshot("elmntConfirmBet");
        waitForElement(elmntConfirmBet);
        takeScreenshot("elmntConfirmBet");
        click(elmntConfirmBet);
        takeScreenshot("elmntConfirmBet");
    }

    public void clickIFBet() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            waitForElement(elmntSingleBet);
            click(elmntSingleBet);
            waitForElement(elmntIfBet);
            click(elmntIfBet);
            takeScreenshot("afterClickIF");
            click(betInputIFBetFirst);
            click(numericInput1);
            click(numericInputDone);
            click(betInputIFBetSecond);
            click(numericInput);
            click(numericInputDone);
            takeScreenshot("AfterenterParlayAmount");
            click(btnPlaceMyBet);
            takeScreenshot("ClickPlaceMyBet");
        } else {
            if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
                waitForElement(elmntSingleBet);
                click(elmntSingleBet);
            }
            waitForElement(elmntIfBet);
            click(elmntIfBet);
            takeScreenshot("selectIFBet");
            mouseClick(waitForElement(txtUpIfBet));
            enterValue(waitForElement(txtUpIfBet), "6");
            mouseClick(waitForElement(txtDownIfBet));
            enterValue(waitForElement(txtDownIfBet), "3");
            takeScreenshot("DownIfBet");
            click(waitForElement(elmntPlaceBet));
            takeScreenshot("ClickPlaceMyBet");
        }

    }

    public void clickPlaceMyBetInTabletForStraight() {
        waitForElement(betslipBar);
        click(betslipBar);
        click(betInputStraightBet);
        click(numericInput);
        click(numericInputDone);
        click(btnPlaceMyBet);
    }

    public void clickActionReverseBet() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            waitForElement(elmntSingleBet);
            click(elmntSingleBet);
            waitForElement(elmntActionReverseBet);
            click(elmntActionReverseBet);
            takeScreenshot("afterClickActionReverseBet");
            click(betInputActionReverseBet);
            click(numericInput);
            click(numericInputDone);
            takeScreenshot("AfterenterActionReverseodds");
            click(btnPlaceMyBet);

            takeScreenshot("ClickPlaceMyBet");
        } else {
            waitForElement(elmntSingleBet);
            click(elmntSingleBet);
            takeScreenshot("BeforeClickActioReverse");
            waitForElement(elmntActionReverse);
            click(elmntActionReverse);
            takeScreenshot("afterClickActionReverse");
            mouseClick(waitForElement(txtActionReverseBet));
            enterValue(waitForElement(txtActionReverseBet), "10");
            takeScreenshot("AfterenterActionReverseAmount");
            waitForSeconds(2);
            jsClick(waitForElement(elmntPlaceBet));
            takeScreenshot("AfterClickelmntPlaceBet");
        }
    }

    public void clickSubTabsInSportsBook(String strSubTabs) {
        WebElement btnHeaderTabTablet = waitForElement(By.xpath(strSubTabInSportsBook.replace("<<TABNAME>>", strSubTabs)));
        System.out.println("The subtabs under the clickSubTabsInSportsBook XPATH =======>>>>>>> " + btnHeaderTabTablet);
        waitForSeconds(2);
        click(btnHeaderTabTablet);
    }

    public boolean verifySubTabsContentInSportsBook(String strSubTab) {
        if (strSubTab.equalsIgnoreCase("Promotions")) {
            waitForElement(elmntPromotionsContents);
            return verifyElement(elmntPromotionsContents);
        } else if (strSubTab.equalsIgnoreCase("Getting Started")) {
            waitForElement(optionsInGettingStarted);
            return verifyElement(optionsInGettingStarted);
        }
        System.out.println("Out of the IF Statements");
        return false;
    }

    public boolean verifySubTabsHighlightedInSportsBook(String strSubTab) {
        if (strSubTab.equalsIgnoreCase("Promotions") || strSubTab.equalsIgnoreCase("Getting Started")) {
            WebElement btnSubHeaderTab = waitForElement(By.xpath(strSubTabHighlightedInSportsBook.replace("<<TABNAME>>", strSubTab)));
            System.out.println(">>>>>  VerifySubTabsHighlightedInSportsBook XPATH =======>>>>>>> " + btnSubHeaderTab);
            waitForSeconds(2);
            return verifyElement(btnSubHeaderTab);
        }
        System.out.println("Out of the IF Statement");
        return false;
    }

    public boolean clickOptionsUnderPromotionsSubTab(String strOptions) {
        WebElement btnHeaderTabTablet = waitForElement(By.xpath(strDepositOption.replace("<<TABNAME>>", strOptions)));
        System.out.println("The options under the clickOptionsUnderPromotionsSubTab XPATH =======>>>>>>> " + btnHeaderTabTablet);
        waitForElement(btnHeaderTabTablet);
        return click(btnHeaderTabTablet);
    }

    public boolean verifyCashierPage(String strTitle) {
        if (strTitle.equalsIgnoreCase("CASHIER")) {
            waitForframeToBeAvailableAndSwitchToIt(driver, elmntFrameCashierPage);
            waitForElement(lnkViewMoreOptions);
            return verifyElement(lnkViewMoreOptions);
        }
        System.out.println("Out of the IF Statement");
        return false;
    }

    public boolean verifyPopupInTermsAndConditions() {
        waitForElement(emlntTandCPopup);
        return verifyElement(emlntTandCPopup);
    }

    public boolean closePopupInTermsAndConditions() {
        return click(emlntCloseForTandCPopup);
    }

    public boolean clickGettingStartedSubLinks(String strSubLinks) {
        WebElement subLink = waitForElement(By.xpath(strSubLinksInGettingStarted.replace("<<TABNAME>>", strSubLinks)));
        System.out.println("clickGettingStartedSubLinks XPATH =======>>>>>>> " + strSubLinks);
        waitForElement(subLink);
        return click(subLink);
    }

    public boolean verifySubLinkContentInGettingStarted(String strSubLink) {
        if (strSubLink.equalsIgnoreCase("How To Bet Online")) {
            waitForElement(lblInHowToBetOnline);
            return verifyElement(lblInHowToBetOnline);
        } else if (strSubLink.equalsIgnoreCase("Understanding Betting Odds")) {
            waitForElement(lblInUnderstandingBettingOdds);
            return verifyElement(lblInUnderstandingBettingOdds);
        } else if (strSubLink.equalsIgnoreCase("Sports Schedules")) {
            waitForElement(lblInUnderSportsSchedules);
            return verifyElement(lblInUnderSportsSchedules);
        } else if (strSubLink.equalsIgnoreCase("Betting Terms")) {
            waitForElement(lblInUnderBettingTerms);
            return verifyElement(lblInUnderBettingTerms);
        } else if (strSubLink.equalsIgnoreCase("Types Of Bets")) {
            waitForElement(lblInUnderTypesOfBets);
            return verifyElement(lblInUnderTypesOfBets);
        } else if (strSubLink.equalsIgnoreCase("Sportsbook Rules")) {
            waitForElement(lblInUnderSportsbookRules);
            return verifyElement(lblInUnderSportsbookRules);
        } else if (strSubLink.equalsIgnoreCase("Betting Limits")) {
            waitForElement(linkToSBUnderBettingLimits);
            verifyElement(linkToSBUnderBettingLimits);
            waitForElement(linkToLiveChatUnderBettingLimits);
            verifyElement(linkToLiveChatUnderBettingLimits);
            waitForElement(btnLiveChatUnderBettingLimits);
            return verifyElement(btnLiveChatUnderBettingLimits);
        }
        System.out.println("Out of the IF Statements");
        return false;
    }

    public boolean clickJoinNowImageLink() {
        waitForElement(lnkJoinNowImage);
        return click(lnkJoinNowImage);
    }

    public boolean verifyMyAccountPage() {
        waitForElement(elmntMyAccPage);
        return verifyElement(elmntMyAccPage);
    }

    public boolean clickLiveChatOption(String strLink) {
        WebElement liveChatBtn = waitForElement(By.xpath(strLiveChatButton.replace("<<TABNAME>>", strLink)));
        System.out.println("clickLiveChatOption XPATH =======>>>>>>> " + strLink);
        waitForElement(liveChatBtn);
        return click(liveChatBtn);
    }

    public boolean verifyLiveChatPopup(String strLink) {
        System.out.println("verifyLiveChatPopup >>>>>> " + strLink);
        waitForElement(elmntLiveChatPopup);
        verifyElement(elmntLiveChatPopup);
        click(minimizeLiveChatPopup);
        return click(elmntEndConversation);
    }

    public boolean clickGeneralRules(String strLink) {
        WebElement lnkGeneralRules = waitForElement(By.xpath(strGeneralRulesLink.replace("<<TABNAME>>", strLink)));
        System.out.println("clickLiveChatOption XPATH =======>>>>>>> " + strLink);
        waitForElement(lnkGeneralRules);
        return click(lnkGeneralRules);
    }

    public boolean verifyGeneralRulesPage() {
        waitForElement(lnkSBGeneralRules);
        return verifyElement(lnkSBGeneralRules);
    }

    public boolean clickRulesLink(String arg1) {
        WebElement lnkRules = waitForElement(By.xpath(strRulesLink.replace("<<TABNAME>>", arg1)));
        System.out.println("clickRulesLink XPATH =======>>>>>>> " + arg1);
        waitForElement(lnkRules);
        return click(lnkRules);
    }

    public boolean verifyRulesLink(String arg1) {
        if (arg1.equalsIgnoreCase("General Rules")) {
            waitForElement(verifyRulesForGeneralRules);
            return verifyElement(verifyRulesForGeneralRules);
        } else if (arg1.equalsIgnoreCase("Financials Rules")) {
            waitForElement(verifyFinancialsRulesInGeneralRules);
            return verifyElement(verifyFinancialsRulesInGeneralRules);
        } else if (arg1.equalsIgnoreCase("E-Sports Rules")) {
            waitForElement(verifyESportsRulesInGeneralRules);
            return verifyElement(verifyESportsRulesInGeneralRules);
        }
        WebElement lnkRules = waitForElement(By.xpath(strverifyRulesLink.replace("<<TABNAME>>", arg1)));
        System.out.println("verifyRulesLink XPATH =======>>>>>>> " + arg1);
        waitForElement(lnkRules);
        return verifyElement(lnkRules);
    }

    public boolean verifySportsNewsPage() {
        waitForElement(lnkSportsNewsBanner);
        return verifyElement(lnkSportsNewsBanner);
    }

    public boolean verifySamplePage(DataTable tb) {
        List<String> DepositAmounts = tb.asList(String.class);
        for (String e : DepositAmounts) {
            System.out.println(e);
        }
        for (WebElement e : lnkSample) {
            System.out.println(e.getText());
        }
        return compareList(lnkSample, DepositAmounts);
    }

    public void clickSportsNewsAndOddsBanner() {
        click(lnkSportsNewsBanner);
    }


    public boolean clickLiveBettingpage() {
        waitForElementClickable(btnLive);
        click(btnLive);
        return verifyElement(btnLive);
    }

    public boolean clickCalendarTab() {
        try {
            focusFrame(liveBetFrame);
            waitForElement(elmntCalendar);
            return click(elmntCalendar);
        } catch (Exception e) {
            waitForElement(elmntCalendar);
            return click(elmntCalendar);
        }
    }

    public void clickCalendardays(String strCalendartabs) {
        WebElement btnCalendarDays = waitForElement(By.xpath(strCalendardays.replace("<<TABNAME>>", strCalendartabs)));
        waitForSeconds(2);
        jsClick(btnCalendarDays);
    }

    public void verifyCalendardays() {
        String CalendarTabs = elmntCalendarText.getText();
        waitForElement(elmntCalendarText);
        if (CalendarTabs.equalsIgnoreCase("There are no events scheduled for this date")) {
            waitForSeconds(3);
            System.out.println("No games available");
        } else {
            System.out.println("LIVE EVENTS ARE PRESENT");
        }
    }

    public boolean ClickInsert() {
        focusFrame(waitForElement(elmntIframe));
        waitForElement(elmntInsertDigits);
        return click(elmntInsertDigits);
    }

    public void insertValues(String strcardnumber, String strexpiry, String stramount, String strcvv) {
//        focusFrame(waitForElement(elmntIframe));
        waitForElement(elmntInsertDigits);
        enterValue(elmntInsertDigits, strcardnumber);
        waitForElement(txtexpiry);
        enterValue(txtexpiry, strexpiry);
        waitForElement(intCvv);
        enterValue(intCvv, strcvv);
        waitForElement(intAmount);
        enterValue(intAmount, stramount);
    }

    public boolean verifyMinMax() {
        //focusFrame(elmntIframe);
        waitForElement(elmntMinMax);
        return verifyElement(elmntMinMax);
    }

    public boolean clickDepositFUnction() {
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(">>>>>>>>> the number of frames is  :" + size);
        driver.switchTo().frame("quickcashierFrame");
        return verifyElement(elmntDepositFunction);
    }

    public void verifyNFLBettingPage() {
        waitForElement(btnNFLBetting);
        verifyElement(btnNFLBetting);
    }

    public boolean verifyConformationPage() {
//        focusFrame(elmntIframe);
        waitForElement(elmntConformationTab);
        return verifyElement(elmntConformationTab);
    }

    public boolean clickMyAccount() {
        waitForElement(elmntMyAccountTab);
        return click(elmntMyAccountTab);
    }

    public boolean clickDeposit() {
        waitForElement(elmntDepositHeader);
        return click(elmntDepositHeader);
    }

    public void scrollToNewsHeader() {
        waitForElement(elmntNewsHeader);
        scrollToElement(elmntNewsHeader);
    }

    public void scrollToSportsNewsHeader() {
        jsScrollDown();
        waitForElement(elmntSportsNewsHeader);
        scrollToElement(elmntSportsNewsHeader);
    }

    public void scrollToPromotionsHeader() {
        waitForElement(elmntPromotionsHeader);
        scrollToElement(elmntPromotionsHeader);
    }


    public boolean verifyNewsAndInformation() {
        waitForElement(elmntNewsContent);
        mouseOver(elmntNewsContent);
        return verifyElement(elmntNewsContent);
    }

    public void clickSportsTab() {
        waitForElement(btnSportsTab);
        click(btnSportsTab);
    }


    public void clickSportsNewsTab() {
        waitForElement(btnSportsNewsTab);
        jsClick(btnSportsNewsTab);
    }

    public void scrollToBettingHeader() {
        waitForElement(elmntBettingHeader);
        scrollToElement(elmntBettingHeader);
    }

    public boolean verifyUpcomingSportsHeader() {
        waitForElement(BtnSportsDropdown);
        return verifyElement(BtnSportsDropdown);
    }

    public void verifyAllSportsBtn() {
        waitForElement(BtnAllSports);
        verifyElement(BtnAllSports);
    }

    public void clickAllSportsBtn() {
        waitForElement(BtnAllSports);
        click(BtnAllSports);
    }

//    public void ChangeDropdownGames(String strtabs) {
//        BtnSportsDropdown.click();
//        WebElement btnOddValues = waitForElement(By.xpath(strSportsDropdown.replace("<<TABNAME>>", strtabs)));
//        click(btnOddValues);
//        btnOddValues.getText();
//        System.out.println(btnOddValues);
//        System.out.println(strtabs);
//        focusBackToDefaultFrame();
//    }

    public void ChangeDropdownGames() {
        waitForElement(BtnSportsDropdown);
        BtnSportsDropdown.click();
        elmntSportsDropdown.click();

    }

    public boolean verifyGamesInformation() {
        waitForElement(elmntGamesInformation);
        System.out.println("scenario 5 passed");
        return verifyElement(elmntGamesInformation);
    }

    public boolean verifySportsbookpage() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            return verifyElement(waitForElement(elmntSportsUnderSportsPage)) && verifyElement(waitForElement(lnkSportsBackIcon));
        }
        waitForElement(elmntSportsbookpage);
        return verifyElement(elmntSportsbookpage);
    }

    public boolean verifyReadMoreLink(DataTable Table) {
        waitForElement(btnReadMore);
        verifyElement(btnReadMore);
        List<String> strNumberLinks = Table.asList(String.class);
        List<String> ListElements = new ArrayList<String>();
        btnNumberLinks.forEach(EleItem -> ListElements.add(EleItem.getText()));
        List<String> ExpectedValues = new ArrayList<String>();
        strNumberLinks.forEach(eleItem -> ExpectedValues.add(eleItem));
        ExpectedValues.remove(0);
        System.out.println(ListElements);
        System.out.println(ExpectedValues);
        return ListElements.equals(ExpectedValues);
    }

    public void clickReadMoreBtn() {
        waitForElement(btnReadMore);
        click(btnReadMore);
    }

    public boolean verifySportsNews() {
        System.out.println(waitForElement(elmntSportsNews).getText());
        return verifyElement(elmntSportsNews);
    }

    public void clickPromotionSubTab() {
        waitForElement(btnPromotions);
        jsClick(btnPromotions);
    }

    public void clickGettingStartedSubTab() {
        waitForElement(btnGettingStarted);
        jsClick(btnGettingStarted);
    }


    public void clickPageNumberLinks() {
        waitForElement(elmntNumberLink);
        scrollToElement(elmntNumberLink);
        click(elmntNumberLink);
    }

    public boolean verifyPromotionsOptions(String strTabs) {
        verifyElement(waitForElement(elmntDepositNowLink));
        if (strTabs.equalsIgnoreCase("Terms and Conditions")) {
            return verifyElement(waitForElement(btnTermsAndConditions));
        } else if (strTabs.equalsIgnoreCase("See All Promotions")) {
            return verifyElement(waitForElement(btnSeeAllPromotions));
        } else {
            return false;
        }

    }

    public void clickPromotionsImage() {
        waitForElement(btnPromotionsImage);
        click(btnPromotionsImage);
    }

    public boolean verifyPromotionsPage() {
        waitForElement(elmntPromotionsContents);
        return verifyElement(elmntPromotionsContents);
    }

    public void clickDepositNowLink() {
        waitForElement(elmntDepositNowLink);
        click(elmntDepositNowLink);
    }

    public boolean verifyCashierPage() {
        waitForframeToBeAvailableAndSwitchToIt(driver, elmntFrameCashierPage);
        waitForElement(lnkViewMoreOptions);
        return verifyElement(lnkViewMoreOptions);
    }

    public void clickTermsAndConditionsOption() {
        waitForElement(btnTermsAndConditions);
        click(btnTermsAndConditions);
    }

    public boolean verifyTermsAndConditionsPopUp() {
        verifyElement(waitForElement(verifyTermsPopup));
        takeScreenshot("Pop-up");
        waitForElement(closeTermsPopup);
        return click(closeTermsPopup);
    }

    public void clickSeeAllPromotionsOption() {
        waitForElement(btnSeeAllPromotions);
        click(btnSeeAllPromotions);
    }

    public void clickExpandIconUnderNFLOption() {
        waitForElement(btnExpandOption);
        mouseOver(btnExpandOption);
        click(btnExpandOption);
    }

    public void clickNFLBetting() {
        waitForElement(btnNFLBetting);
        click(btnNFLBetting);
    }

    public boolean verifyNflSubTabs(DataTable Table) {
        List<String> Headers = Table.asList(String.class);
        for (String e : Headers) {
            System.out.println(e);
        }
        for (WebElement e : elmntNflSubtabs) {
            System.out.println(e.getText());
        }
        return compareList(elmntNflSubtabs, Headers);
    }

    //    List<String> lstdata = Table.asList(String.class);
//        System.out.println(lstdata);
//       return compareList((NflSubtabs),lstdata);
    public boolean verifyNFLPageHeaders() {
        verifyElement(waitForElement(elmntNFLBettingNews));
        verifyElement(waitForElement(elmntNFLOddsHeader));
        return verifyElement(waitForElement(elmntNFLOddsNewsHeader));
    }

    public void clickBoxingOddsOption() {
        waitForElement(btnBoxingOdds);
        click(btnBoxingOdds);
    }

    public boolean verifyBoxingOddsHeader() {
        verifyElement(waitForElement(elmntNBoxingOddsAndNewsHeader));
        verifyElement(waitForElement(elmntBoxingOddsHeader));
        return verifyElement(waitForElement(elmntBoxingNewsHeader));
    }

    public void clickMMAOdds() {
        waitForElement(btnMMAOdds);
        click(btnMMAOdds);
    }

    public boolean verifyMMAOddsHeaders() {
        verifyElement(waitForElement(elmntMMAOddsAndNews));
        verifyElement(waitForElement(elmntMMAOdds));
        return verifyElement(waitForElement(elmntMMABettingNews));
    }

    public void clickUfcOdds() {
        waitForElement(btnUfcOdds);
        click(btnUfcOdds);
    }

    public boolean verifyOddsHeaders(String arg1, String arg2, String arg3) {
        waitForSeconds(3);
        WebElement BetHeader = waitForElement(By.xpath(strOddsHeader1.replace("<<TABNAME>>", arg1)));
        verifyElement(BetHeader);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>Element 1 verified");

        WebElement OddsHeader = waitForElement(By.xpath(strOddsHeader2.replace("<<TABNAME>>", arg2)));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>Entered Element 2");
        verifyElement(OddsHeader);

        WebElement NewsHeader = waitForElement(By.xpath(strOddsHeader3.replace("<<TABNAME>>", arg3)));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>Entered Element 3");
        return verifyElement(NewsHeader);

    }

    public boolean verifyNBAOddsHeaders(String arg2, String arg3) {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
        waitForElement(elmntNFLBettingHeader);
        System.out.println(elmntNFLBettingHeader.getText());
        verifyElement(elmntNFLBettingHeader);
        }
        waitForSeconds(3);

        WebElement OddsHeader = waitForElement(By.xpath(strOddsHeader2.replace("<<TABNAME>>", arg2)));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>Entered Element 2");
        verifyElement(OddsHeader);

        WebElement NewsHeader = waitForElement(By.xpath(strOddsHeader3.replace("<<TABNAME>>", arg3)));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>Entered Element 3");
        return verifyElement(NewsHeader);

    }

    public void clickSubtabs(String strTabs) {
        WebElement Tab = waitForElement(By.xpath(strSubtabs.replace("<<TABNAME>>", strTabs)));
        waitForSeconds(2);
        jsClick(Tab);
    }

    public boolean verifyMLBBettingHeaders(DataTable strTabs) {
        List<String> strTab = strTabs.asList(String.class);
        return compareList(waitForElements(elmntMLBsubtabs), strTab);
    }

    public boolean verifyFootballBettingHeaders(DataTable strTabs) {
        List<String> strTab = strTabs.asList(String.class);
        return compareList(waitForElements(elmntFootballBettingHeaders), strTab);
    }

    public boolean verifyNBASubTabs(DataTable Table) {
        List<String> strTab = Table.asList(String.class);
        return compareList(waitForElements(elmntNBASubtabs), strTab);
    }

    public boolean verifyOddsCalculatorpage() {
        System.out.println(waitForElement(elmntBetCalculator).getText());
        return verifyElement(elmntBetCalculator);
    }

    public void clickSportsNewsSubTabs(String Tabs) {
        WebElement Tab = waitForElement(By.xpath(strSportsNewsSubTabs.replace("<<TABNAME>>", Tabs)));
        waitForSeconds(2);
        click(Tab);
    }


    public void clickMLBSubTabs(String Tabs) {
        WebElement Tab = waitForElement(By.xpath(strMLBSubTabs.replace("<<TABNAME>>", Tabs)));
        waitForSeconds(2);
        click(Tab);
    }

    public void clickGolfSubTabs(String Tabs) {
        WebElement Tab = waitForElement(By.xpath(strMLBSubTabs.replace("<<TABNAME>>", Tabs)));
        waitForSeconds(2);
        click(Tab);
    }

    public void verifyBasketBallLinesHeader() {
        waitForElement(elmntMarchMadnessOdds);
        verifyElement(elmntMarchMadnessOdds);
    }

    public void verifyBtnCollegeFootballBettingPicks() {
        waitForElement(btnCollegeFootballBettingPicks);
        verifyElement(btnCollegeFootballBettingPicks);
    }

    public void clickBtnCollegeFootballBettingPicks() {
        waitForElement(btnCollegeFootballBettingPicks);
        click(btnCollegeFootballBettingPicks);
    }

    public boolean verifyGolfBettingHeaders(DataTable Table) {
        List<String> strTab = Table.asList(String.class);
        return compareList(waitForElements(elmntGolfBettingHeaders), strTab);
    }

    public void verifyNHLSubTabs(DataTable Table) {
        List<String> strTab = Table.asList(String.class);
        compareList(waitForElements(elmntNHLBettingHeaders), strTab);
    }

    public void verifyTennisSubTabs(DataTable Table) {
        List<String> strTab = Table.asList(String.class);
        compareList(waitForElements(elmntTennisBettingHeaders), strTab);
    }

    public void verifyHorsesSubTabs(DataTable Table) {
        List<String> strTab = Table.asList(String.class);
        compareList(waitForElements(elmntHorseBettingHeaders), strTab);
    }

    public void clickStanleyCupOddsHeader() {
        waitForElement(btnStanleyCupOdds);
        click(btnStanleyCupOdds);
    }

    public void clickFrenchOpenTab() {
        waitForElement(BtnFrenchopen);
        click(BtnFrenchopen);
    }

    public void verifyTopPagesHeader(String arg1) {
        WebElement NewsHeader = waitForElement(By.xpath(strOddsHeader3.replace("<<TABNAME>>", arg1)));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>Entered Element 1");
        waitForSeconds(2);
        verifyElement(NewsHeader);
    }

    public void verifyTopPagesImages() {
        waitForElement(elmntopSportsImages);
        verifyElement(elmntopSportsImages);
    }

    public void clickBreedersCupSubTab() {
        waitForElement(btnBreedersCup);
        click(btnBreedersCup);
    }

    public void clickTopPagesImage() {
        waitForElement(btnTopPagesImages);
        click(btnTopPagesImages);
    }

    public void verifyGamesPage() {
        String text = driver.getTitle();
        System.out.println(text);
    }

    public void clickSportsBookTab() {
        waitForElement(btnSportsBookTab);
        click(btnSportsBookTab);
    }

    public void verifySportsBookTab() {
        waitForElement(btnSportsBookTab);
        verifyElement(btnSportsBookTab);
    }

    public boolean verifySportsBookHeaders(DataTable strTabs) {
        waitForElement(elmntSportsBookHeaders);
        verifyElement(elmntSportsBookHeaders);

        List<String> strHeaderTabs = strTabs.asList(String.class);
        System.out.println(elmntBetSlipHeader.size());
        List<String> lstElements = new ArrayList<String>();
        elmntBetSlipHeader.forEach(eleItem -> lstElements.add(eleItem.getText().trim()));
        elmntPlayMiniBlackjackHeader.forEach(eleItem -> lstElements.add(eleItem.getText().trim()));
        elmntLiveBettingGamesHeader.forEach(eleItem -> lstElements.add(eleItem.getText().trim()));
        List<String> lstExpectedValues = new ArrayList<String>();
        strHeaderTabs.forEach(eleItem -> lstExpectedValues.add(eleItem));
        System.out.println(lstExpectedValues);
        return lstElements.equals(lstExpectedValues);
    }

    public boolean verifySportsbookSubtabs(DataTable Table) {
        List<String> strTabs = Table.asList(String.class);
        compareList(waitForElements(elmntSportsbookGamesTabs), strTabs);
        System.out.println(strTabs);
        verifyElement(elmntLiveBetting);
        verifyElement(btnClearAll);
        return verifyElement(btnViewSelected);
    }

    public void clickClearAllOption() {
        waitForElement(btnClearAll);
        verifyElement(btnClearAll);
    }

    public void clickLiveBettingTab() {
        waitForElement(elmntLiveBetting);
        click(elmntLiveBetting);
    }

    public boolean verifyLiveBettingPage() {
        // focusFrame(LiveBettinFrame);
        waitForElement(elmntLiveBettingPage);
        return verifyElement(elmntLiveBettingPage);
    }

    public void clickTableTennisTab() {
        waitForElement(btnTableTennis);
        click(btnTableTennis);
        click(elmntTableTennisGames);
        click(elmntTableTennischeckBoxes);
    }

    public void clickViewSelectedOption() {
        waitForElement(btnViewSelected);
        click(btnViewSelected);
    }

    public boolean verifyLiveGames() {
        System.out.println(waitForElement(elmntLiveGamesHeader).getText());
        return verifyElement(elmntLiveGamesHeader);
    }

    public boolean verifySelectionsRemoved() {
        boolean notselected = true;
        elmntTableTennischeckBoxes.isSelected();
//        click(btnClosePopUp);
        return notselected;
    }

    public void clickSportsBoookSubtabs(String arg1) {
        waitForSeconds(3);
        WebElement NewsHeader = waitForElement(By.xpath(strSportsBookSubTabs.replace("<<TABNAME>>", arg1)));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>Entered Element 1");
        click(NewsHeader);
    }

    public boolean verifyMainSportsSubtabs() {
        waitForElement(elmntMainSportsGames);
        return verifyElement(elmntMainSportsGames);
    }

    public void verifyMainSPortsGames() {
        waitForElement(elmntMainSportsGames);
        verifyElement(elmntMainSportsGames);
    }

    public void selectMainSportsGame() {
        waitForElement(btnTableTennis);
        click(btnTableTennis);
        click(elmntTableTennisTournaments);
    }

    public boolean verifyGamePropsTournaments() {
        jsScrollDown();
        waitForElement(elmntGamePropsTournaments);
        return verifyElement(elmntGamePropsTournaments);
    }

    public void clickGamePropsTournaments() {
        jsScrollDown();
        waitForPresenceOfElement(By.xpath("//div[@class='gamePropsLinks']/child::div[1]"));
        click(elmntGamePropsTournaments);
    }

    public void clickLiveGames() {
        waitForElement(btnLiveGameCheckBox);
        click(btnLiveGameCheckBox);
        waitForElement(elmntSelectLiveGame);
        click(elmntSelectLiveGame);
        click(elmntStraightBetSubTab);
    }

    public boolean verifyStraightBetGame() {
        waitForElement(elmntStraightBetGameInformation);
        mouseOver(elmntStraightBetGameInformation);
        System.out.println(elmntStraightBetGameInformation.getText());
        return verifyElement(elmntStraightBetGameInformation);
    }

    public boolean verifyFuturesTournaments() {
        waitForElement(elmntFutureGames);
        return verifyElement(elmntFutureGames);
    }

    public void clickFutureGame() {
        waitForElement(elmntFutureGames);
        click(elmntFutureGames);
    }

    public void clickLiveGame() {
        waitForElement(elmntLiveGame);
        click(elmntLiveGame);
    }

    public boolean verifyContestsTab(DataTable Table) {
        jsScrollDown();
        List<String> strTab = Table.asList(String.class);
        return compareList(waitForElements(elmntContestsSubTab), strTab);
    }

    public boolean verifySquareContestsSubtab(DataTable Table) {
        List<String> strTab = Table.asList(String.class);
        return compareList(waitForElements(elmntSquareContestsSubTab), strTab);
    }

    public void verifyContestsTab() {
        waitForElement(elmntContests);
        verifyElement(elmntContests);
    }

    public void clickContestsSubTab(String arg1) {
        WebElement NewsHeader = waitForElement(By.xpath(strContestsSubTabs.replace("<<TABNAME>>", arg1)));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>Entered Element 1");
        click(NewsHeader);
    }

    public boolean verifySquaresContestspage() {
        System.out.println(waitForElement(elmntContestNickname).getText());
        return verifyElement(elmntContestNickname);
    }

    public boolean verifyContestTab() {
        waitForElement(btnContest);
        return verifyElement(btnContest);
    }

    public boolean verifyOtherSportsSubTabs() {
        scrollToElement(btnOtherSportsGames);
        waitForElement(btnOtherSportsGames);
        takeScreenshot("OtherSports");
        return verifyElement(btnOtherSportsGames);

    }

    public boolean verifyUsefulLinksSubTab(DataTable Table) {
        List<String> strTab = Table.asList(String.class);
        return compareList(waitForElements(elmntUsefulLinksSubTabs), strTab);
    }

    public void verifyUsefulLinksTab() {
        waitForElement(elmntUsefulLinks);
        verifyElement(elmntUsefulLinks);
    }

    public void clickUsefulLinksSubTab(String arg1) {
        WebElement NewsHeader = waitForElement(By.xpath(strUsefulLinksSubTabs.replace("<<TABNAME>>", arg1)));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>Entered Element 1");
        click(NewsHeader);
    }

    public boolean verifyGettingStartedSubTab() {
        waitForElement(elmntGettingStartedHeader);
        System.out.println(elmntGettingStartedHeader.getText());
        return verifyElement(elmntGettingStartedHeader);
    }

    public boolean verifyBettingOddsCalculatorPage() {
        waitForElement(elmntMyAccountHeader);
        return verifyElement(elmntMyAccountHeader);
    }

    public void clickUsefulLinksTab() {
       click(waitForElement(btnmainSports));
        waitForElementClickable(btnUsefulLinks);
        jsClick(btnUsefulLinks);
    }

    public boolean verifyPromotionsTab() {
        waitForElement(btnPromotions);
        return verifyElement(btnPromotions);
    }

    public boolean verifySportsBookHelpPage() {
        System.out.println(waitForElement(elmntSportsBettingHelp).getText());
        return verifyElement(elmntSportsBettingHelp);
    }

    public void clickBettingLimits() {
        click(btnMainSportsGames);
        waitForSeconds(3);
        waitForElement(btnBettingLimits);
        jsClick(btnBettingLimits);
    }

    public void clickSportsbookRulesTab() {
        click(btnMainSportsGames);
        waitForSeconds(3);
        waitForElement(btnSportsbookRules);
        jsClick(btnSportsbookRules);
    }

    public void clickSportsbookBonuses() {
        click(btnMainSportsGames);
        waitForSeconds(3);
        waitForElement(btnSportsbookBonuses);
        jsClick(btnSportsbookBonuses);
    }

    public void clickSportsbookHelp$FAQ() {
        click(btnMainSportsGames);
        waitForSeconds(3);
        waitForElement(btnSportsbookHelp);
        jsClick(btnSportsbookHelp);
    }

    public void enterRotationalNumberInSearchBar() {
        waitForElement(elmntROTSeachBar);
        enterValue(elmntROTSeachBar, "503");
    }

    public void clickSearchBar() {
        waitForElement(btnSearchBar);
        click(btnSearchBar);
    }

    public void verifySearchResults() {
        if (verifyElement(elmntErrorMsg)) {
            Reporter.addStepLog("Bet Cannot be Placed");
        } else {
            waitForElement(elmntSearchResults);
            System.out.println(elmntSearchResults.getText());
            verifyElement(elmntSearchResults);
        }

    }

    public void selectOddsValues(String Odds) {
        waitForElement(elmntOddsDroddown);
        click(elmntOddsDroddown);
        WebElement OddsHeader = waitForElement(By.xpath(strOddsDropdown.replace("<<TABNAME>>", Odds)));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>entered elmnt 1 ");
        click(OddsHeader);
    }

//    public boolean verifyOddValues() {
//        waitForElement(elmntOddValues);
//        System.out.println(elmntOddValues.getText());
//        return verifyElement(elmntOddValues);
//    }

    public void ScrolltoBlackjackHeader() {
        waitForElement(elmntBlackjackHeader);
        scrollToElement(elmntBlackjackHeader);
    }

    public boolean verifyBlackJackGame() {
        waitForElement(elmntBlackJackGame);
        return verifyElement(elmntBlackJackGame);
    }

    public void selectDropdownValues(String Odds) {
        waitForElement(elmntSearchBox);
        click(elmntSearchBox);
        WebElement OddsHeader = waitForElement(By.xpath(strSearchDropdown.replace("<<TABNAME>>", Odds)));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>entered elmnt 1 ");
        click(OddsHeader);
        takeScreenshot("OddsDropdown Options");
    }

    public boolean verifyRotationalNumberResults() {
        if (verifyElement(elmntErrorMsg)) {
            Reporter.addStepLog("Bet Cannot be Placed");
            return true;
        } else {
            verifyElement(waitForElement(elmntRotNumber));
       return      verifyElement(waitForElement(elmntTeamName));
//            verifyElement(waitForElement((elmntTeamName)));
        }
    }

    public void verifyOddValues() {
        if (verifyElement(elmntErrorMsg)) {
            Reporter.addStepLog("Bet Cannot be Placed");
        } else {
            System.out.println(waitForElement(elmntOddValues).getText());
            verifyElement(elmntOddValues);
        }
    }

    public void MouseHoverSortDropdownHelpicon(String arg1) {
        waitForElement(elmntSearchBox);
        click(elmntSearchBox);
        WebElement SortDropdown1 = waitForElement(By.xpath(strSearchDropdown.replace("<<TABNAME>>", arg1)));
        click(SortDropdown1);
        mouseOver(elmntSortDropdownHelpIcon);
        takeScreenshot("try1");
    }

    public boolean verifyPopupDescription() {
        mouseOver(elmntSortDropdownHelpIcon);
        waitForElement(elmntSortDropdownHelpIcon);
        return verifyElement(elmntSortDropdownHelpIcon);
    }

    public void MouseHoverSortLinesDropdown(String Odds) {
        waitForElement(elmntOddsDroddown);
        click(elmntOddsDroddown);
        WebElement OddsHeader = waitForElement(By.xpath(strSearchDropdown.replace("<<TABNAME>>", Odds)));
        click(OddsHeader);
        mouseOver(elmntSortLinesHelpIcon);
        takeScreenshot("HelpIcon");
    }

    public void scrolltoInProgressGames() {
        waitForElement(elmntInProgressGames);
        scrollToElement(elmntInProgressGames);
    }

    public boolean verifyInProgressGames() {
        waitForElement(elmntLiveGames);
        mouseOver(elmntLiveGames);
        return verifyElement(elmntLiveGames);
    }

    public void verifyBetTabs() {
        verifyElement(waitForElement(elmntStraightBetSubTab));
        waitForElement(elmntParlayBetSubTab);
        verifyElement(waitForElement(elmntParlayBetSubTab));
        waitForElement(elmntIfBetSubTab);
        verifyElement(waitForElement(elmntIfBetSubTab));
        waitForElement(elmntTeaserSubTab);
        verifyElement(waitForElement(elmntTeaserSubTab));
    }

    public boolean verifyBetButtons(String strTabName) {
        WebElement NewsHeader = waitForElement(By.xpath(strBetSlipButtons.replace("<<TABNAME>>", strTabName)));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>Entered Element 3");
        return verifyElement(NewsHeader);
    }

    public boolean verifyConfirmationBox() {
        waitForElement(btnShowConfirmationBox);
        return verifyElement(btnShowConfirmationBox);
    }

    public void clickStraightBet() {
        waitForElement(elmntStraightBetSubTab);
        click(elmntStraightBetSubTab);
    }

    public boolean verifyRiskFieldInput() {
        waitForElement(txtRiskFieldInBetSlip);
        return verifyElement(txtRiskFieldInBetSlip);
    }

    public void selectLiveGame() {
        waitForElement(chkSpreadColumnFirstRowField);
        click(chkSpreadColumnFirstRowField);
    }

    public void clickRiskInputField() {
        waitForElement(txtRiskFieldInBetSlip);
        enterValue(txtRiskFieldInBetSlip, "5");
    }

    public void clickPlaceMyBetBtn() {
        waitForElement(btnPlaceMyBet);
        click(btnPlaceMyBet);
    }

    public boolean ConfirmationMessage() {
        System.out.println(waitForElement(btnConfirmBet).getText());
        verifyElement(btnConfirmBet);
        waitForElement(btnBackBet);
        System.out.println(btnBackBet.getText());
        return verifyElement(btnBackBet);
    }

    public boolean verifyBetPlacedMessage() {
        System.out.println(waitForElement(elmntBetAcceptedMessage).getText());
        verifyElement(elmntBetAcceptedMessage);
        waitForSeconds(2);
        return click(btnCloseInBetSlip);
    }

    public void clickBackInBetSlip() {
        waitForElement(btnBackBet);
        click(btnBackBet);
    }

    public void clickMultipleTeams() {
        waitForElement(chkSpreadColumnSecondRowField);
        click(chkSpreadColumnSecondRowField);
        waitForElement(chkSpreadColumnThirdRowField);
        click(chkSpreadColumnThirdRowField);
    }

    public boolean verifyParlayBetTabHighlighted() {
        boolean verify = false;
        waitForElement(elmntParlayBetSubTab);
        verify = elmntParlayBetSubTab.isSelected();
        return verify;
    }

    public void clickParlayBetTab() {
        waitForElement(elmntParlayBetSubTab);
        click(elmntParlayBetSubTab);
    }

    public boolean verifyParlayRiskInputField() {
        waitForElement(elmntParlayRiskFieldInput);
        return verifyElement(elmntParlayRiskFieldInput);
    }

    public void enterRiskInParlayTab() {
        waitForElement(elmntParlayRiskFieldInput);
        enterValue(elmntParlayRiskFieldInput, "5");
    }

    public void clickIfBetTab() {
        waitForElement(elmntIfBetSubTab);
        click(elmntIfBetSubTab);
    }

    public boolean verifyIfBetRiskInputField() {
        waitForElement(elmntIFBetRiskFieldInput);
        return verifyElement(elmntIFBetRiskFieldInput);
    }

    public void enterRiskInIfBetTab() {
        waitForElement(elmntIFBetRiskFieldInput);
        enterValue(elmntIFBetRiskFieldInput, "5");
        enterValue(elmntSecondRowIFBetRiskFieldInput, "2");
    }

    public void clickIfBetTabDropdown() {
        waitForElement(elmntIfBetTabDropdown);
        click(elmntIfBetTabDropdown);
        click(elmntIfBetTabDropdownChoice1);
    }

    public void unCheckBetSlipConfirmationBox() {
        waitForElement(btnShowConfirmationBox);
        click(btnShowConfirmationBox);
    }

    public void clickClearAllButton() {
        waitForElement(elmntBetSlipClearAllBtn);
        click(elmntBetSlipClearAllBtn);
    }

    public boolean verifyBetSlipTeamsRemoved() {
        waitForElement(elmntBetSlipInformation);
        return verifyElement(elmntBetSlipInformation);

    }

    public void clickSaveButton() {
        waitForElement(btnSaveBet);
        click(btnSaveBet);
    }

    public boolean verifyBetSlipTeams() {
        System.out.println(waitForElement(elmntBetSlipTeams).getText());
        return verifyElement(elmntBetSlipTeams);
    }

    public boolean clickPlayerPropsNFLSims() {
        waitForSeconds(3);
       // waitForElementClickable(BtnNFLSimsGame);
        waitForElement(PlayerPropsIFrame);
        focusFrame(PlayerPropsIFrame);
        waitForElement(BtnNFLSimsGame);
        return click(BtnNFLSimsGame);

    }

    public void clickPlayerPropsGames() {
        waitForSeconds(4);
        waitForElement(PlayerPropsIFrame);
        focusFrame(PlayerPropsIFrame);
        waitForElement(BtnGameLaliga);
        jsClick(BtnGameLaliga);

    }


    public boolean verifyPlayerPropsSubTab(DataTable Table) {
    //    focusFrame(PlayerPropsIFrame);
        List<String> SubTabs = Table.asList(String.class);
        List<String> ListElements = new ArrayList<String>();
        elmntPlayerPropsSubTabs.forEach(EleItem -> ListElements.add(EleItem.getText()));
        ListElements.remove(3);
        System.out.println(ListElements);
        System.out.println(SubTabs);
        return (ListElements.equals(SubTabs));
    }

    public void clickPlayerPropsDropDown() {
        waitForElement(elmntPlayerPropsDropDown);
        click(elmntPlayerPropsDropDown);
        takeScreenshot("dropdown options");
        click(elmntPlayerPropsDropdownValue);
    }

    public void clickDropDown() {
        waitForElement(PlayerPropsIFrame);
        focusFrame(PlayerPropsIFrame);
        System.out.println(">>>>>>>>>>>>>>>>>entered Frame");
        waitForElement(elmntPlayerPropsDropDown);
        click(elmntPlayerPropsDropDown);
        takeScreenshot("dropdown options");
        click(elmntPlayerPropsDropDown);
    }

    public boolean verifyPlayerPropsHeaders(String strHeaders) {
        if (strHeaders.equalsIgnoreCase("Build Your Bet")) {
            System.out.println(waitForElement(elmntBuildYourBetHeader).getText());
            return verifyElement(elmntBuildYourBetHeader);
        } else {
            return false;
        }
    }

    public void verifyPlayerPropsPage() {
        waitForElement(elmntPlayerPropsDropDown);
        verifyElement(elmntPlayerPropsDropDown);
    }

    public boolean verifyPlayerPropsTeams() {
        waitForElement(elmntPlayerPropsTeam);
        verifyElement(elmntPlayerPropsTeam);
        return focusBackToDefaultFrame();
    }

    public void clickPlayerPropsSubTab(String strSubTabs) {
//        System.out.println(">>>>>>>>>>>>>>>entered method");
//        waitForElement(PlayerPropsIFrame);
//        focusFrame(PlayerPropsIFrame);
//        System.out.println(">>>>>>>>>>>>>>>>>entered Frame");
//        waitForSeconds(5);
        WebElement btnSubTab = waitForElement(By.xpath(strPlayerPropsTab.replace("<<TABNAME>>", strSubTabs)));
        waitForSeconds(2);
        jsClick(btnSubTab);
    }

    public boolean verifyBuildSubTabOptions() {
        waitForElement(elmntPlayerPropsDropDown);
        mouseOver(elmntPlayerPropsDropDown);
        waitForElement(elmntPlayerPropsSearchField);
        return verifyElement(elmntPlayerPropsSearchField);
    }

    public void verifyDefaultResults() {
        waitForElement(elmntPlayerPropsDefaultResuts);
        verifyElement(elmntPlayerPropsDefaultResuts);
    }

    public void selectDropdownValue() {
        waitForElement(elmntPlayerPropsDropDown);
        click(elmntPlayerPropsDropdownValue);
    }

    public boolean verifyBuildTabResults() {
        waitForElement(elmntPlayerPropsSearchResuts);
        return verifyElement(elmntPlayerPropsSearchResuts);
    }

    public void clickPlayerPropsSearchResults() {
        waitForElement(elmntPlayerPropsSearchResuts);
        click(elmntPlayerPropsSearchResuts);
    }

    public boolean verifyTeamsSelectedUnderPlayerProps() {
        waitForElement(elmntPlayerPropsSearchResuts);
        return verifyElement(elmntPlayerPropsSearchResuts);
    }

    public boolean verifyTeamsUnderBuildYourBetHeader() {
        System.out.println(elmntPlayerPropsBetSlip.getText());
        verifyElement(elmntPlayerPropsBetSlip);
        return focusBackToDefaultFrame();
    }

    public boolean verifyQuickPicksButtons() {
        waitForElement(elmnQuickPicksButtons);
        return verifyElement(elmnQuickPicksButtons);
    }

    public void clickQuickPicksButtons() {
        waitForElement(btnPlayerStatDoubles);
        click(btnPlayerStatDoubles);
    }

    public void clickQuickPicksOdds() {
        waitForElement(elmntQuickPicksOdds);
        click(elmntQuickPicksOdds);
    }

    public boolean verifyQuickPicksBetSlip() {
        System.out.println(waitForElement(elmntQuickPicksBetSlip).getText());
        verifyElement(elmntQuickPicksBetSlip);
        return click(btnClearSlip);
    }

    public void clickCollapseAllBtn() {
        waitForElement(btnCollapseAll);
        click(btnCollapseAll);
    }

    public boolean verifyGameMarketHeaderCollapesed() {
        boolean isVerified = true;
        waitForElement(elmntGameMarketsHeader);
        return isVerified;
    }

    public boolean verifyAnchorTags(DataTable Table) {
        List<String> SubTabs = Table.asList(String.class);
        List<String> ListElements = new ArrayList<String>();
        btnBuildYourBetHeader.forEach(EleItem -> ListElements.add(EleItem.getText()));
        System.out.println(ListElements);
        compareList(waitForElements(btnBuildYourBetHeader), SubTabs);
        return focusBackToDefaultFrame();
    }

    public void clickStatBtn() {
        waitForElement(btnStat);
        click(btnStat);
    }

    public boolean verifyBuildOptions(DataTable Table) {
        List<String> SubTabs = Table.asList(String.class);
        List<String> ListElements = new ArrayList<String>();
        elmntBuildYourBetHeaders.forEach(EleItem -> ListElements.add(EleItem.getText()));
        System.out.println(ListElements);
        compareList(waitForElements(elmntBuildYourBetHeaders), SubTabs);
        verifyElement(waitForElement(btnSelectStatistic));
        verifyElement(waitForElement(btnWillHave));
        return verifyElement(waitForElement(btnClear));
    }

    public boolean verifyPlayerPropsContent() {
        waitForElement(elmntPlayerPropsPage);
        verifyElement(elmntPlayerPropsPage);
        return focusBackToDefaultFrame();
    }

    public void verifyOptionsBuildYourBetHeader() {
        verifyElement(waitForElement(btnSelectStatistic));
        verifyElement(waitForElement(btnWillHave));
    }

    public boolean verifyTeamUnderBuildYourBetHeader() {
        System.out.println(waitForElement(elmntPlayerPropsTeamName).getText());
        return verifyElement(elmntPlayerPropsTeamName);
    }

    public void selectStatisticChoices() {
        waitForElement(btnSelectStatistic);
        click(btnSelectStatistic);
        click(elmntStatisticsOption);
    }

    public void verifyWillHaveOptions(DataTable Table) {
        List<String> strTab = Table.asList(String.class);
        compareList(elmntWillHaveOptions, strTab);
    }

    public void clickAddScoreIcon() {
        waitForElement(btnAddScoreIcon);
        click(btnAddScoreIcon);
    }

    public void clickAddToBetSlipBtn() {
        System.out.println(waitForElement(btnAddToBetSlip).getText());
        waitForSeconds(2);
        click(btnAddToBetSlip);
    }

    public void verifyBetSlip() {
        waitForElement(elmntQuickPicksBetSlip);
        System.out.println(elmntQuickPicksBetSlip.getText());
        verifyElement(elmntQuickPicksBetSlip);
    }

    public void enterValueInBetSlip() {
        waitForElementClickable(btnBetSlipInputField);
        enterValue(btnBetSlipInputField, "2");
    }

    public boolean ConfirmBetslipPopUp() {
//        waitForPresenceOfElement(By.xpath("//div[@id='modal_pick-confirm']/descendant::div/ul/li[2]/a/span[.='confirm']"));
//        waitForElementClickable(btnConfirmBetPlayerProps);
        System.out.println(waitForElement(btnConfirmBetPlayerProps).getText());
        waitForSeconds(2);
        return  click(btnConfirmBetPlayerProps);

    }

    public void clickPlaceMyBet() {
        waitForElement(btnPlaceMyBetPlayerProps);
        click(btnPlaceMyBetPlayerProps);
    }

    public boolean verifySuccessfulBetMessage() {
        waitForElement(elmntBetSlipMessage);
        System.out.println(elmntBetSlipMessage.getText());
        verifyElement(elmntBetSlipMessage);
        click(elmntBetSlipCloseBtn);
        return click(elmntCloseIconBetSlip);
    }

    public void clickClearBtn() {
        waitForElement(elmntBuildYourBetHeaderClearBtn);
        click(elmntBuildYourBetHeaderClearBtn);
    }

    public boolean verifyTeamsRemovedFromBetSlip() {
        boolean TeamsDisplayed = true;
        elmtBuildYourBetTeams.isDisplayed();
        return TeamsDisplayed;
    }

    public void clickOddsDropdown(String Odds) {
        waitForElement(elmntPlayerPropsOdds);
        click(elmntPlayerPropsOdds);
        WebElement OddsHeader = waitForElement(By.xpath(strPlayerPropsOddsDropDown.replace("<<TABNAME>>", Odds)));
        jsClick(OddsHeader);
        takeScreenshot("Odd  values");
    }

    public boolean verifyPlayerPropsOddChanges() {
        waitForElement(elmntOddValue);
        System.out.println(elmntOddValue.getText());
        click(btnClear);
        return verifyElement(elmntOddValue);
    }

    public void clickPlayerPropsBetBtn() {
        waitForElement(btnPlayerPropsBet);
        click(btnPlayerPropsBet);
    }

    public boolean verifyPlayerPropsBetOptions(DataTable Table) {
        List<String> SubTabs = Table.asList(String.class);
        List<String> ListElements = new ArrayList<String>();
        elmntPlayerPropsBetOptions.forEach(EleItem -> ListElements.add(EleItem.getText()));
        System.out.println(ListElements);
        return compareList(waitForElements(elmntPlayerPropsBetOptions), SubTabs);
    }

    public void clickPlayerPropsBetSlip(String Odds) {
        if(Odds.contains("Betslip"))
        {
            waitForElement(btnPlayerPropsBet);
            WebElement OddsHeader1 = waitForElement(By.xpath(strPlayerPropsBetOptions1.replace("<<TABNAME>>", Odds)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>entered elmnt 1 ");
            click(OddsHeader1);

        }
        else {
            waitForElement(btnPlayerPropsBet);
            click(btnPlayerPropsBet);
            WebElement OddsHeader = waitForElement(By.xpath(strPlayerPropsBetOptions.replace("<<TABNAME>>", Odds)));
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>entered elmnt 1 ");
            click(OddsHeader);
        }
    }

    public void verifyBetsHeader() {
        waitForElement(btnPlayerPropsBet);
        verifyElement(btnPlayerPropsBet);
    }

    public boolean verifyNoBetsMessage() {
        System.out.println(waitForElement(elmntNoBetsText).getText());
        verifyElement(elmntNoBetsText);
        return focusBackToDefaultFrame();
    }

    public void clickCloseBetSlipBtn() {
        waitForElement(btnCloseBetSlip);
        click(btnCloseBetSlip);
    }

    public boolean verifyPlayerPropsBetsIcon() {
        waitForElement(btnPlayerPropsBet);
        return verifyElement(btnPlayerPropsBet);
    }

    public boolean PlayerPropsHelpPage() {
        waitForElement(elmntPlayerPropsHelpPage);
        return verifyElement(elmntPlayerPropsHelpPage);
    }

    public boolean clickCancelBtn() {
        waitForElement(btnBetSlipCancel);
        return click(btnBetSlipCancel);
    }

    public void verifyPlaceBetsBtn() {
        waitForElement(btnPlaceMyBetPlayerProps);
        verifyElement(btnPlaceMyBetPlayerProps);
    }

    public boolean verifyPlayerPropsOpenBets() {
        System.out.println(waitForElement(elmntOpenBets).getText());
        return verifyElement(elmntOpenBets);
    }

    public boolean verifyOpenBetsPage() {
        waitForElement(elmntOpenBetsPage);
        return verifyElement(elmntOpenBetsPage);
    }

    public boolean ClickPastBets() {
        waitForElement(btnPastBets);
        return verifyElement(btnPastBets);
    }

    public boolean verifyPastBetsInformation() {
        if (verifyElement(elmntPastBetsInformation)) {
            return true;
        } else {
            System.out.println("No Bets");
        }
        return verifyElement(btnPastBets);
    }

    public void clickMyBetsBackBtn() {
        waitForElement(elmntMyBetsBackBtn);
        click(elmntMyBetsBackBtn);
    }

    public void clickGeneralRulesLink() {
        waitForElement(BtnGeneralRulesLink);
        click(BtnGeneralRulesLink);
    }

    public boolean verifyPlayerPropsUpComingGames() {
        takeScreenshot("Playerpros");
        verifyElement(waitForElement(elmntPlayerPropsUpcomingEventsHeader));
        verifyElement(waitForElement(elmntPlayerPropsUpcomingGames));
        return focusBackToDefaultFrame();
    }

    //----------------//

    public boolean verifyStraightBetPopUp() {
        return verifyElement(waitForElement(elmntBetSlipForm));
    }

    public boolean clickRiskMaxLimit() {
        return click(waitForElement(lnkRiskMaxLimit));
    }

    public boolean verifyAmountUnderBetField() {
        while (waitForElement(txtRiskFieldInBetSlip).getAttribute("value").isEmpty()) {
            this.verifyAmountUnderBetField();
        }
        return !(waitForElement(txtRiskFieldInBetSlip).getAttribute("value").isEmpty());
    }

    public boolean verifyErrorMessageUnderBetSlip() {
        waitForSeconds(2);
        if (verifyElement(txtBetSlipError)) {
            Reporter.addStepLog(getText(txtBetSlipError));
            try {
                if (verifyElement(lnkRemoveTeamFromBetSlip)) {
                    click(waitForElement(lnkRemoveTeamFromBetSlip));
                }
            } catch (Throwable e) {
                this.clickCloseIconInBetSlip();
            }
            return false;
        } else if (verifyElement(txtBetSlipServerError)) {
            Reporter.addStepLog(getText(txtBetSlipServerError));
            return false;
        }
        return true;
    }

    public boolean clickBetSlipClose() {
        return click(waitForElement(lnkRemoveTeamFromBetSlip));
    }

    public boolean verifySportsTeamPage() {
        waitForSeconds(2);
        return verifyElement(waitForElement(lnkTeamPageBackArrow));
    }

    public boolean verifyCheckMyBetSlip() {
        return verifyElement(waitForElement(elmntCheckBetSlip));
    }

    public boolean verifyBetSlipPage(DataTable strDatas) {
        List<String> lstDatas = strDatas.asList(String.class);
        boolean boolSingleBetResult, boolIfbetResult = false;
        boolean boolParlaysResult = false;
        boolSingleBetResult = lstDatas.get(0).equalsIgnoreCase(getText(waitForElement(elmntSingleBet)));
        try {
            boolParlaysResult = lstDatas.get(1).equalsIgnoreCase(getText(waitForElement(elmntParlays)));
        } catch (Throwable e) {
            Reporter.addStepLog("Parlay Bet Not Available");
        }
        try {
            boolIfbetResult = lstDatas.get(2).equalsIgnoreCase(getText(waitForElement(elmntIfBet)));
        } catch (Throwable t) {
            Reporter.addStepLog("If Bet Not Available");
        }
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            try {
                boolean boolActionRevBetResult = lstDatas.get(3).equalsIgnoreCase(getText(waitForElement(elmntActionReverse)).trim());
                return boolSingleBetResult && boolParlaysResult && boolIfbetResult && boolActionRevBetResult;
            } catch (Throwable t) {
                Reporter.addStepLog("Action Reverse Not Available");
            }
        }
        return boolSingleBetResult && boolParlaysResult && boolIfbetResult;
    }

    public boolean verifyBetSlipMobile() {
        return verifyElement(waitForElement(elmntSingleBet));
    }

    public boolean verifyEmptyBetSlip() {
        return verifyElement(waitForElement(elmntBetSlipForm));
    }

    public boolean clickPlaceBet() {
        enterValue(waitForElement(txtRiskFieldInBetSlip), "2");
        takeScreenshot("clickPlaceMyBetInStraightBetForm");
        return click(waitForElement(btnPlaceMyBet));
    }

    public void clickCloseIconInBetSlip() {
        List<WebElement> lstCloseIcon = waitForElements(lnkSingleBetCloseIcons);
        for (int z = 0; z < lstCloseIcon.size(); z++) {
            click(lstCloseIcon.get(z));
        }
    }

    public boolean clickDeleteAllUnderBetSlip() {
        click(waitForElement(elmntCheckBetSlip));
        click(waitForElement(elmntSingleBet));
        return click(waitForElement(elmntDeleteAllbtn));
    }

    public boolean clickAddMoreSelectionsUnderBetSlip() {
        click(waitForElement(elmntSingleBet));
        return click(waitForElement(inpAddMoreSelectionsUnderBetSlip));
    }

    public boolean clickIfBetUnderBetSlip() {
        waitForSeconds(2);
        click(waitForElement(elmntSingleBet));
        if (verifyElement(elmntIfBet)) {
            return click(elmntIfBet);
        }
        Reporter.addStepLog("If Bet not available");
        return false;
    }

    public boolean verifyActionButtonsUnderIfBet() {
        boolean boolUpResult = false;
        boolean boolDownResult = false;
        boolUpResult = verifyElement(waitForElement(lnkIfUpArrow));
        boolDownResult = verifyElement(waitForElement(lnkIfDownArrow));
        return boolUpResult && boolDownResult;
    }

    public boolean clickUpUnderIfBet() {
        String strTeamName = getText(waitForElement(txtTeamName));
        click(waitForElement(lnkIfUpArrow));
        waitForSeconds(2);
        return !getText(waitForElement(txtTeamName)).equalsIgnoreCase(strTeamName);
    }

    public boolean verifySecondTeamPresentInBetSlip() {
        return verifyElement(waitForElement(txtRiskFieldInBetSlip));
    }

    public boolean clickSingleUnderBetSlip() {
        if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            click(waitForElement(elmntIfBet));
        }
        return click(waitForElement(elmntSingleBet));
    }

    public boolean clickGameUnderSportsPage() {
        return click(waitForElement(elmntGame));
    }

    public boolean verifySubGameUnderSportsPage() {
        return verifyElement(waitForElement(elmntGameType));
    }

    public boolean clickSubGameUnderSportsPage() {
        return click(waitForElement(elmntGameType));
    }

    public boolean verifyWagerTypesUnderSportsPage(DataTable strDatas) {
        List<String> lstDatas = strDatas.asList(String.class);
        return compareList(waitForElements(btnWagerTypes), lstDatas);
    }

    public boolean verifyTeamOddsAndTime() {
        return verifyElement(waitForElement(elmntFirstTeam)) && verifyElement(waitForElement(elmntTimeUnderSportsTeams));
    }

    public boolean scrollDownToBackToTop() {
        ScrollRightAction(waitForElement(lnkBackToTop));
        return verifyElement(waitForElement(lnkBackToTop));
    }

    public boolean clickBackToTop() {
        return click(waitForElement(lnkBackToTop));
    }

    public boolean clickBackIconUnderSportsPage() {
        return click(waitForElement(lnkSportsBackIcon));
    }

    public boolean clickDateWithCollapseIconUnderSportsPage() {
        return click(waitForElement(elmntTimeUnderSportsTeams));
    }

    public boolean waitForInvisibilityOfFirstTeamContainer() {
        return waitForInvisibilityOfElement(elmntFirstTeamContainer);
    }

    public boolean clickDateWithExpandIconUnderSportsPage() {
        return click(waitForElement(lnkExpandIconWithTimeUnderSportsTeams));
    }

    public boolean waitForVisibilityOfFirstTeamContainer() {
        return verifyElement(waitForElement(elmntFirstTeamContainer));
    }

//    public boolean verifyPlayerPropsMobilePage(DataTable strTabs) {
//        List<String> lstTabs = strTabs.asList(String.class);
//        return compareList(waitForElements(lnkCurrentAndUpcoming), lstTabs);
//    }

    public boolean verifyErrorMessageUnderSportsBetSlip() {
        waitForSeconds(2);
        if (verifyElement(txtBetSlipErrorOne)) {
            takeScreenshot("Bet Slip Error");
            Reporter.addStepLog(getText(txtBetSlipErrorOne));
            click(waitForElement(elmntDeleteAllbtn));
            return false;
        }
        return true;
    }

    //---------------------------------//

    //Player Props Mobile

    //---------------------------------//

    public boolean verifyPlayerPropsMobilePage(DataTable strTabs) {
        List<String> lstTabs = strTabs.asList(String.class);
        if (lstTabs.contains("BUILD")) {
            waitForSeconds(4);
            waitForElements(lnkCurrentAndUpcoming.subList(0, 3));
//            List<WebElement> lnkBuild = waitForElements(lnkCurrentAndUpcoming).subList(0, 3);
            return compareList(waitForElements(lnkCurrentAndUpcoming.subList(0, 3)), lstTabs);
        } else {
            return compareList(waitForElements(lnkCurrentAndUpcoming), lstTabs);
        }
    }

    public boolean verifyPlayerPropsNavigators() {
        focusFrame(waitForElement(iFramePlayerprops));
        waitForElements(lnkNavigators);
        return verifyElement(lnkNavigators.get(0)) && verifyElement(lnkNavigators.get(1));
    }

    public boolean verifyCurrentMarketsSelectedAsDefault() {
        return verifyElement(waitForElement(lnkCurrentMarkets));
    }

    public boolean clickGamesUnderCurrentMarkets() {
        waitForSeconds(2);
        if (verifyElement(txtCheckBackSoon)) {
            Reporter.addStepLog("Current Markets Not Available");
            return false;
        } else {
            verifyElement(waitForElement(elmntImageBanner));
            if (!verifyElement(elmntCurrentMarketsExpanded)) {
                click(waitForElement(elmntCurrentMarketsCollapsed));
            }
            return verifyElement(waitForElement(btnOddsUnderCurrentMarkets));
        }
    }

    public boolean verifyOddsUnderCurrentMarkets() {
        if (verifyElement(txtCheckBackSoon)) {
            Reporter.addStepLog("Current Markets Not Available");
            return false;
        } else {
            return verifyElement(waitForElement(btnOddsUnderCurrentMarkets));
        }
    }

    public boolean clickOddsUnderCurrentMarkets() {
        return click(waitForElement(btnOddsUnderCurrentMarkets));
    }

    public boolean verifyBetSlupWithRTNValue() {
        return verifyElement(waitForElement(BtnBetSlipInputField));
    }

    public boolean clickRemoveTeamUnderBetSlip() {
        click(waitForElement(lnkRemoveTeamUnderBetSlip));
        if (verifyElement(txtBuildYourBets)) {
            return getText(waitForElement(txtBetSlipCountUnderBuildYourBet)).equalsIgnoreCase("0");
        } else {
            return getText(waitForElement(txtBetSlipCount)).equalsIgnoreCase("0");
        }
    }

    public boolean clickUpcomingEventsUnderPlayerPropsPage() {
        return click(waitForElement(lnkCurrentAndUpcoming.get(1)));
    }

    public boolean verifyUpcomingEvents() {
        waitForSeconds(2);
        return verifyElement(waitForElement(elmntUpcomingEvents));
    }

    public boolean verifyMoreHelpUnderUpcomingEvents() {
        return verifyElement(waitForElement(lnkMoreHelpUnderUpcomingEvents));
    }

    public boolean clickMoreHelpUnderUpcomingEvents() {
        waitForSeconds(2);
        return click(waitForElement(lnkMoreHelpUnderUpcomingEvents));
    }

    public boolean verifyMoreHelpPage() {
        return verifyElement(waitForElement(lnkCloseUnderMoreHelp));
    }

    public boolean clickCloseUnderMoreHelpPage() {
        return click(waitForElement(lnkCloseUnderMoreHelp));
    }

    public boolean verifyLeftNavigatorUnderPlayerPropsPage() {
        return verifyElement(waitForElement(lnkNavigators.get(0)));
    }

    public boolean verifyOddsConverter(DataTable strDatas) {
        jsClick(waitForElement(lnkNavigators.get(0)));
        List<String> lstDatas = strDatas.asList(String.class);
        return compareList(waitForElements(lnkOddsConverter), lstDatas);
    }

    public boolean verifyLeaguesUnderLeftNavigator() {
        return verifyElement(waitForElement(lnkLeaguesUnderLeftNavigator));
    }

    public boolean clickOddsConverter() {
        return click(waitForElement(lnkOddsConverter.get(1)));
    }

    public boolean verifyOddsPatternChange() {
        click(waitForElement(lnkCloseLeftNavigator));
        if (verifyElement(txtCheckBackSoon)) {
            Reporter.addStepLog("Current Market Not Available");
            return false;
        }
        if (!verifyElement(elmntCurrentMarketsExpanded)) {
            click(waitForElement(elmntCurrentMarketsCollapsed));
        }
        return verifyElement(waitForElement(txtOddsPatternChangeToDecimal));
    }

    public boolean verifyRightNavigatorUnderPlayerProps() {
        return verifyElement(waitForElement(lnkNavigators.get(1)));
    }

    public boolean clickRightNavigator() {
        return click(waitForElement(lnkNavigators.get(1)));
    }

    public boolean verifyBetSlipDropDown(DataTable strTabs) {
        List<String> lstTabs = strTabs.asList(String.class);
        return compareList(waitForElements(lnkBetSlipDropDown), lstTabs);
    }

    public boolean clickBetSlipFromDropDown() {
        return click(waitForElement(lnkBetSlipDropDown.get(0)));
    }

    public boolean verifyEmptyBetSlipUnderPlayerProps() {
        return verifyElement(waitForElement(elmntBetSlipTeamCount));
    }

    public boolean clickCloseUnderBetSlip() {
        return click(waitForElement(lnkCloseUnderBetSlip));
    }

    public boolean clickMyBetsUnderDropDown() {
        return click(waitForElement(lnkBetSlipDropDown.get(1)));
    }

    public boolean verifyMyBetsOptions(DataTable strDatas) {
        List<String> lstDatas = strDatas.asList(String.class);
        waitForElements(elmntMyBetsOptions).forEach(z -> System.out.println(z.getText()));
        boolean boolResult = false;
        for (int z = 0; z < lstDatas.size(); z++) {
            boolResult = getText(elmntMyBetsOptions.get(z)).contains(lstDatas.get(z));
            if (!boolResult) {
                return false;
            }
        }
        return boolResult;
    }

    public boolean verifyOpenBetsSelectedAsDefault() {
        return verifyElement(waitForElement(lnkOpenBetsSelectedAsDefault));
    }

    public boolean clickPastBetsUnderMyBets() {
        return click(waitForElement(elmntMyBetsOptions.get(2)));
    }

    public boolean clickBackUnderMyBets() {
        return click(waitForElement(elmntMyBetsOptions.get(0)));
    }

    public boolean clickHelpUnderDropDown() {
        return click(waitForElement(lnkBetSlipDropDown.get(2)));
    }

    public boolean enterRTNValueUnderBetSlip() {
        enterValue(waitForElement(BtnBetSlipInputField), "2");
        return BtnBetSlipInputField.getAttribute("value").equals("2");
    }

    public boolean clickPlaceBetUnderPlayerProps() {
        click(waitForElement(lnkPlaceMyBetUnderPlayerProps));
        return click(waitForElement(lnkConfirmUnderBetSlip));
    }

    public boolean verifyEmptyBetSlipPlayerProps() {
        return getText(waitForElement(txtBetSlipCount)).equalsIgnoreCase("0");
    }

    public boolean clickClearSlipUnderBetSlip() {
        return click(waitForElement(lnkClearSlipUnderBetSlip));
    }

    public boolean verifyBetSuccessMessage() {
        verifyElement(waitForElement(txtBetSuccessful));
        return click(waitForElement(btnCloseInBetSlipPlayerPropsMobile));
    }

    public boolean clickAnyLeagueWithSoccerIconUnderLeftNavigator() {
        waitForSeconds(2);
        return click(waitForElement(lnkSoccerLeague));
    }

    public boolean clickBUILDUnderPlayerPropsPage() {
        return click(waitForElement(lnkCurrentAndUpcoming.get(0)));
    }

    public boolean clickQuickPicksUnderPlayerProps() {
        return click(waitForElement(lnkCurrentAndUpcoming.get(1)));
    }

    public boolean clickCollapseOnTheExpanded() {
        return click(waitForElement(elmntCollapseUnderQUICKPICKS));
    }

    public boolean clickOverUnderUnderPlayerProps() {
        return click(waitForElement(lnkCurrentAndUpcoming.get(2)));
    }

    public boolean verifyOverUnderOptions(DataTable strDatas) {
        List<String> lstDatas = strDatas.asList(String.class);
        return compareList(waitForElements(lnkOverUnderOptions), lstDatas);
    }

    public boolean clickPlayersUnderOverUnder() {
        return click(waitForElement(lnkOverUnderOptions.get(0)));
    }

    public boolean clickStatsUnderOverUnder() {
        return click(waitForElement(lnkOverUnderOptions.get(1)));
    }

    public boolean verifyPlayersContents() {
        waitForSeconds(2);
        if (verifyElement(txtCheckBackSoon)) {
            Reporter.addStepLog("O/U Markets will be available shortly");
            return true;
        }
        return verifyElement(waitForElement(txtStatistic));
    }

    public boolean verifyStatsContents() {
        waitForSeconds(2);
        if (verifyElement(txtCheckBackSoon)) {
            Reporter.addStepLog("O/U Markets will be available shortly");
            return true;
        }
        return verifyElement(waitForElement(txtPlayers));
    }

    public boolean clickAnyTeamUnderBuild() {
        waitForSeconds(2);
        return click(waitForElement(elmntFirstTeamUnderBuild));
    }

    public boolean verifyBuildOptionsMobile(DataTable strTabs) {
        List<String> lstTabs = strTabs.asList(String.class);
        return compareList(waitForElements(elmntBuildOptions), lstTabs);
    }

    public boolean clickSubChoicesUnderStats() {
        return click(waitForElement(lnkSubChoicesUnderStats));
    }

    public boolean clickPlaceBetUnderBetSlip() {
        return click(waitForElement(lnkPlaceMyBetUnderPlayerProps));
    }

    public boolean verifyEmptyBuildYourBet() {
        return verifyElement(waitForElement(elmntAddPlayerUnderBuildYourBet));
    }

    public boolean clickResetUnderBuildYourBet() {
        return click(waitForElement(lnkResetUnderBuildYourBet));
    }

    public boolean clickHelpIconNearRightNavigator() {
        return click(waitForElement(lnkHelpIconUnderSoccer));
    }

    public boolean verifyHelpPopUpUnderSoccerPage() {
        return verifyElement(waitForElement(elmntHelpPopUpUnderSoccerPage));
    }

    public boolean clickCrossOnHelpPop() {
        waitForSeconds(2);
        return click(waitForElement(lnkIconCross));
    }

    public boolean clickLeagueWithBasketBallIcon() {
        waitForSeconds(2);
        return click(waitForElement(lnkBasketBallLeague));
    }

}



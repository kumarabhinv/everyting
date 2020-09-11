package sportsBetting.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import com.cucumber.listener.Reporter;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SBLiveBettingPage extends BasePage {


    public SBLiveBettingPage(WebDriver driver) {
        super(driver);
    }

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='all-content']//div[@class='tabs']//li[1]/a[@href='/live-betting']"),
            @FindBy(how = How.XPATH, using = "//div[@id='all-content']//div[@class='tabs']//li[2]/a[@class='link-pointer']")
    })
    protected List<WebElement> elmntlivesubtabs;

    @FindAll({
            @FindBy(how = How.ID, using = "lvFrame"),
            @FindBy(how = How.ID, using = "cashierFrame")
    })
    protected WebElement liveBetFrame;

    @FindBy(how = How.ID, using = "//div[@class='container']//div[@class='col-xs-9 col-sm-9 col-md-9']/descendant::div[@id='mvSlot1']")
    protected WebElement elmntLiveMatches;

    @FindBy(how = How.XPATH, using = "//div[@id='viewMenu']//li/a[contains(text(),'')]")
    protected List<WebElement> elmntLiveBettingTabs;

    @FindBy(how = How.XPATH, using = "//div[@class='container']//li//a[contains(text(),'Live Betting')]")
    protected WebElement btnLive;

    @FindBy(how = How.XPATH, using = "//div[@id='viewMenu']//li[@id='btnGameView']")
    protected WebElement btnEventView;
    @FindBy(how = How.XPATH, using = "//div[@id='listHeadActive']/div[@class='expGlyph active-expGlyph']")
    protected WebElement btnNowLive;

    @FindBy(how = How.XPATH, using = "//div[@id='listHeadPending']/descendant::div[@class='expGlyph pending-expGlyph']")
    protected WebElement btnUpComingGame;

    @FindBy(how = How.XPATH, using = "//div[@id='active']")
    protected WebElement elmntLiveGames;

    @FindBy(how = How.XPATH, using = "//div[@id='active']//ul[@class='league league-show']")
    protected WebElement elmntLiveSport;

    @FindBy(how = How.XPATH, using = "//div[@id='gvGame']/descendant::div[@id='gvGameFixed']")
    protected WebElement elmntLiveSportDetails;

    @FindBy(how = How.XPATH, using = "//div[@id='pending']/ul[@class='sport']/li[@class='sport sport-show']")
    protected WebElement elmntUpComingGames;

    @FindBy(how = How.XPATH, using = "//div[@id='divoffcanvas1']")
    protected WebElement btnMinimize;

    @FindBy(how = How.XPATH, using = "//div[@id='divoffcanvas2']")
    protected WebElement btnExpand;

    @FindBy(how = How.XPATH, using = "//div[@id='viewMenu']//li[@id='btnMultiView']")
    protected WebElement btnMultiview;

    @FindBy(how = How.XPATH, using = "//div[@class='col-xs-9 col-sm-9 col-md-9']/descendant::div[@id='mvSlot3']/child::div[@class='mvGameList']/child::div[@class='mvGameListScrolling']/descendant::div[@class='expGlyph'][1]")
    protected WebElement elmntMultiViewGames;

    @FindBy(how = How.XPATH, using = "//div[@id='viewMenu']//li[@id='btnCalendar']")
    protected WebElement elmntCalendar;

    @FindBy(how = How.XPATH, using = "//div[@id='viewMenu']//li[@id='btnRules']")
    protected WebElement elmntRules;

    @FindBy(how = How.XPATH, using = "//div[@id='rulesFrame']")
    protected WebElement elmntRulesInformation;

    @FindBy(how = How.XPATH, using = "//div[@id='calTabs']")
    protected WebElement elmntCalendarEvents;

    @FindBy(how = How.XPATH, using = "//div[@id='calTabs']//ul//li")
    protected List<WebElement> elmntCalendardays;

    @FindBy(how = How.XPATH, using = "//div[@id='calPage']/descendant::div[contains(text(),'There are no events scheduled for this date')][1]")
    protected WebElement elmntCalendarText;

    @FindBy(how = How.XPATH, using = "//div[@id='viewMenu']//li[@id='btnMyWagers']")
    protected WebElement btnMyWagers;

    @FindBy(how = How.XPATH, using = "//div[@id='myWagersMenu']")
    protected WebElement elmntMyWagersInformation;

    @FindBy(how = How.XPATH, using = "//span[@class='popup-opcrm-close']")
    protected WebElement elmntPopup;

    @FindBy(how = How.XPATH, using = "//div[@id='myWagersContent']//table//tr/th[1]")
    protected List<WebElement> elmntWagersDetails;

    @FindBy(how = How.XPATH, using = "//div[@id='myWagersContent']//table//tr/th")
    protected WebElement elmntWagers;

    @FindBy(how = How.XPATH, using = "//div[@id=\'myWagersContent\']//table/tbody/tr[1]//div[@class=\'prop\']")
    protected WebElement elmntTodayWagers;

    @FindBy(how = How.XPATH, using = "//div[@id='myWagersContainer']//div[@class='noWagers'][contains(text(),'No wagers match the selected filter')]")
    protected WebElement elmntWagersText;

    @FindBy(how = How.XPATH, using = "//div[@id='myWagersMenu']/ul/li[@id='btnMWToday']")
    protected WebElement btnToday;

    protected String strOddsDropdown = new StringBuilder()
            .append("//div[@id='divOddsFormat']/select[@name='ctl05$selectOddFormat']/option[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[@id='myWagersMenu']//li[@id='btnMWWeek']")
    protected WebElement btnThisWeek;

    @FindBy(how = How.XPATH, using = "//div[@id='myWagersMenu']//li[@id='btnMWPending']")
    protected WebElement btnUnDecidedWagers;

    @FindBy(how = How.XPATH, using = "//div[@id='myWagersContainer']/descendant::div[@class='outcome'][contains(text(),'Pending')][1]")
    protected WebElement elmntPendingWagers;

    @FindBy(how = How.XPATH, using = "//div[@id='myWagersContainer']/descendant::div[@class='paidAmt'][1]")
    protected WebElement elmntAmountPaid;

    @FindBy(how = How.XPATH, using = "//div[@id='calTabs']/descendant::div[@class='input-append btn-group']/select[@id='chooseSport']")
    protected WebElement btnDropdown;

    @FindBy(how = How.XPATH, using = "//div[@id='calTabs']/descendant::div[@class='input-append btn-group']/select[@id='chooseSport']/option[2]")
    protected WebElement elmntDropdownValue;

    @FindBy(how = How.XPATH, using = "//div[@id='appContentPanel']")
    protected WebElement elmntSoccerDetails;

    @FindBy(how = How.XPATH, using = "//div[@id='divOddsFormat']/select[@id='ctl05_selectOddFormat']")
    protected WebElement elmntOddsDropdown;

    @FindBy(how = How.XPATH, using = "//div[@id='tabContainer']//div[@class='tabs']//ul//li[2]/a[contains(text(),'How To Bet Live')]")
    protected WebElement btnBetLivetab;

    @FindBy(how = How.XPATH, using = "//div[@class='staticPage']/descendant::div[@class='black']/h1[contains(text(),'How to Bet Live')]")
    protected WebElement elmntBetLiveinformation;

    @FindBy(how = How.XPATH, using = "//div[@id='active']/descendant::div[@class='divGameTitle']/a/span[@class='gameTitle']")
    protected WebElement elmntNowLiveEvent;

    @FindBy(how = How.XPATH, using = "//div[@id='gvPropContainer']/descendant::div[@id='leftMarket']/form[@class='form-horizontal dontSplit'][1]")
    protected WebElement elmntLiveTeam;

    @FindBy(how = How.XPATH, using = "//div[@id='leftMarket']//form[contains(@class,'form-horizontal')][1]//ul//li[1]")
    protected WebElement clickTeamName;

    @FindBy(how = How.XPATH, using = "//div[@id='bsBet']/div[@class='betAmtFrm']//div[@id='dropbetamount']/input[@id='BetAmtInput']")
    protected WebElement elmntBetAmount;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//input[@class='txtBetAmt']"),
            @FindBy(how = How.ID, using = "BetAmtInput")
    })
    protected WebElement txtBetAmtFieldInBetSlip;

    @FindBy(how = How.ID, using = "btnPostBS")
    protected WebElement btnPlaceMyBet;

    @FindBy(how = How.XPATH, using = "//div[@class='dlgButtons']/button[@id='btnClose']")
    protected WebElement btnClosePopup;

    @FindBy(how = How.XPATH, using = "//div[@id='bsContent']/descendant::div[@id='chQuickBet']/label/input[@id='switchQuickBet']")
    protected WebElement btnQuickBet;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//button[@id='btnAcceptChgBS']"),
            @FindBy(how = How.XPATH, using = "//div[@id='myModal']//div[@class='modal-footer']/button[contains(text(),'Accept')]")
    })
    protected WebElement btnAccept;

    @FindBy(how = How.XPATH, using = "//div[@class='postedBet']//h3[contains(text(),'Bet Posted!')]")
    protected WebElement elmntBetPostedResults;

    @FindBy(how = How.XPATH, using = "//div[@id='postResultsDlg']//div[@class='dlgButtons']/button[contains(text(),'Close')]")
    protected WebElement btnCloseBetSlipPopup;

    @FindBy(how = How.XPATH, using = "//div[@id='leftMarket']//div[@class='gvProp form-group-lg ']//li[1]//div[@class='odds']")
    protected WebElement elmntOddValues;

    @FindBy(how = How.XPATH, using = "//div[@id='divOddsFormat']/select[@id='ctl05_selectOddFormat']")
    protected WebElement btnOddsDropdown;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='betSlip']"),
            @FindBy(how = How.XPATH, using = "//div[@id='betSlip']/descendant::div[@id='bsContent']//li/a[contains(text(),'Bet Slip')]")
    })
    protected WebElement elmntBetslip;

    protected String strBetSlipTabs = new StringBuilder()
            .append("//div[@id='betSlip']/descendant::div[@id='bsContent']//ul[@class='nav nav-tabs']/li/a[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[@id='betSlip']/descendant::div[@id='bsContent']//ul[@class='nav nav-tabs']/li[@class='rules']")
    protected WebElement btnBetSlipRules;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='ContentBL']/descendant::div[@class='BL-widget']//div[contains(text(),'MARKET TIPS')]"),
            @FindBy(how = How.XPATH, using = "(//div[@class='BL-sportsCarousel flickity-enabled is-draggable']/div//a)[3]")
    })
    protected WebElement elmntMarketTips;

    @FindBy(how = How.XPATH, using = "(//div[@class='BL-sportsCarousel flickity-enabled is-draggable']/div//a)[3]")
    protected WebElement btnMarketTips;

    @FindBy(how = How.XPATH, using = "//div[@id='ContentBL']/descendant::div[@class='BL-erroMsgBox']")
    protected WebElement MarketTipsMessage;

    @FindBy(how = How.XPATH, using = "//div[@id='calTabs']//li[contains(text(),'Today')]")
    protected WebElement elmntCalenderToday;
    @FindBy(how = How.XPATH, using = "//div[@id='calTabs']//li[contains(text(),'Fri')]")
    protected WebElement elmntCalenderday2;
    @FindBy(how = How.XPATH, using = "//div[@id='calTabs']//li[contains(text(),'Sat')]")
    protected WebElement elmntCalenderday3;
    @FindBy(how = How.XPATH, using = "//div[@id='calTabs']//li[contains(text(),'Sun')]")
    protected WebElement elmntCalenderday4;
    @FindBy(how = How.XPATH, using = "//div[@id='calTabs']//li[contains(text(),'Mon')]")
    protected WebElement elmntCalenderday5;
    @FindBy(how = How.XPATH, using = "//div[@id='calTabs']//li[contains(text(),'Tue')]")
    protected WebElement elmntCalenderday6;
    @FindBy(how = How.XPATH, using = "//div[@id='calTabs']//li[contains(text(),'Wed')]")
    protected WebElement elmntCalenderday7;
    @FindBy(how = How.XPATH, using = "//div[@id='calTabs']//li[contains(text(),'Thu')]")
    protected WebElement elmntCalenderday8;

    @FindBy(how = How.XPATH, using = "//div[@id='bsContent']//li[2]//a[contains(text(),'My Bets')]")
    protected WebElement btnMyBets;

    @FindBy(how = How.XPATH, using = "//div[@id='MyBetsDetail']//tr[@class='header']")
    protected WebElement elmntMyBetsInoformation;

    @FindBy(how = How.XPATH, using = "//div[@id='bsBet']/descendant::div[@class='closeWinButton']")
    protected WebElement elmntCloseTeamUnderBetSlip;

    @FindBy(how = How.XPATH, using = "//div[@id='bsContent']//div[@class='bsEmpty']")
    protected WebElement EmptyBetslip;

    @FindBy(how = How.XPATH, using = "//div[@id='gvGameFixed']/div[@class='gameHead']/button[@id='btnMyBets']")
    protected WebElement btnMyBetsonGame;

    @FindBy(how = How.XPATH, using = "//div[@class='linkToGV']")
    protected WebElement btnGameNavigator;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Hide')]")
    protected List<WebElement> lnkHideMenus;

    @FindBy(how = How.XPATH, using = "(//div[@class='startTime'])[1]")
    protected WebElement elmntLiveBettingMatchStartTime;

    @FindBy(how = How.XPATH, using = "//center")
    protected List<WebElement> elmntHideTopContents;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Show')]")
    protected List<WebElement> lnkShowMenus;

    @FindBy(how = How.XPATH, using = "//li[@class='toggleItem']/descendant::a/span")
    protected List<WebElement> elmntLiveMenuContents;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'list')]")
    protected List<WebElement> elmntLiveOddsContents;

    @FindBy(how = How.XPATH, using = "(//div[normalize-space(.)='No event selected'])[2]")
    protected WebElement txtNoEventSelected;

    @FindBy(how = How.XPATH, using = "(//div[contains(.,'In Progress')]/following::a/span[@class='gameTitle'])[1]")
    protected WebElement lnkTeamsUnderInProgress;

    @FindBy(how = How.XPATH, using = "(//div[contains(.,'In Progress')]/following::a/span[@class='gameTitle'])[2]")
    protected WebElement lnkTeamsUnderInProgressAnotherTeam;

    @FindBy(how = How.XPATH, using = "(//div[contains(.,'Upcoming')]/following::a/span[@class='gameTitle'])[1]")
    protected WebElement lnkTeamsUnderUpcoming;

    @FindBy(how = How.XPATH, using = "(//span[@class='gameStartTime'])[1]")
    protected WebElement elmntStartTimeUnderUpcoming;

    @FindBy(how = How.XPATH, using = "//div[@class='gvProp'][1]/descendant::div[@class='odds'][1]")
    protected WebElement elmntOddsOfTeamSelectedUnderLiveOdds;

    @FindBy(how = How.XPATH, using = "(//button[@id='btnMyBets'])[1]")
    protected WebElement btnMyBetsOnThisUnderTeam;

    @FindBy(how = How.XPATH, using = "//div[@class='dlgTitle']")
    protected WebElement elmntBetPostedPopUp;

    @FindBy(how = How.XPATH, using = "//div[@id='betSlip']/descendant::h2/descendant::span")
    protected WebElement elmntBetSlipCount;

    @FindBy(how = How.XPATH, using = "//li[@id='btnMyWagers'][contains(@class, 'selected')]")
    protected WebElement elmntMyWagersAutoSelected;

    @FindBy(how = How.XPATH, using = "//div[@id='myWagersFrame']")
    protected WebElement elmntMyWagersContents;

    @FindBy(how = How.XPATH, using = "//div[@class='gvProp'][1]/descendant::div[@class='selStatus frozen']")
    protected WebElement elmntOddsFrozen;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(), 'Select')]")
    protected WebElement elmntMultiViewMessage;

    @FindBy(how = How.XPATH, using = "(//a[@class='title'])[1]")
    protected WebElement lnkTeamUnderMultiView;

    @FindBy(how = How.XPATH, using = "//div[@class='mvGame']/descendant::div[@class='odds'][1]")
    protected WebElement elmntOddsUnderMultiViewTeam;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='gvGameNoProps']"),
            @FindBy(how = How.XPATH, using = "//div[@class='mvNoProps']")
    })
    protected WebElement elmntNoActiveProportion;

    @FindBy(how = How.XPATH, using = "//button[@class='btnAddGame']")
    protected WebElement btnAddAnEvent;

    @FindBy(how = How.XPATH, using = "//li[.='TODAY'][contains(@class, 'selected')]")
    protected WebElement elmntTodaySelectedAsDefault;

    @FindBy(how = How.XPATH, using = "//li[@id='calTab1']")
    protected WebElement elmntDateUnderCalendar;

    @FindBy(how = How.XPATH, using = "//div[@class='calEmpty']")
    protected WebElement elmntNoEvents;

    @FindBy(how = How.XPATH, using = "//div[@id='calGameList1']")
    protected WebElement elmntDateSelectedContent;

    @FindBy(how = How.XPATH, using = "//li[contains(@id, 'btnMW')]")
    protected List<WebElement> elmntMyWagersSubTabs;

    @FindBy(how = How.XPATH, using = "//select/descendant::option[@selected]")
    protected WebElement selAcceptFavourablePriceChange;

    @FindBy(how = How.XPATH, using = "//button[@id='btnClearBS']")
    protected WebElement btnClearBetSlip;

    //Regression methods
    public boolean verifysubtabs(String strtabs) {
        System.out.println("" + TestDataUtil.getListOfValue(strtabs));
        List<String> subtabslist = new ArrayList<>();
        waitForElements(elmntlivesubtabs)
                .forEach(i -> subtabslist.add(i.getText()));
        System.out.println("subtabs" + subtabslist);
        boolean isVerified = (subtabslist.equals(TestDataUtil.getListOfValue(Constants.LIVEBETTING_SUBTABS)));
        waitForElements(elmntlivesubtabs);
        return isVerified;

    }

    public boolean verifyMenuTypes(DataTable Table) {
        focusFrame(waitForElement(liveBetFrame));
        List<String> lstdata = Table.asList(String.class);
        compareList(waitForElements(elmntLiveBettingTabs), lstdata);
        return focusBackToDefaultFrame();
    }


    public boolean clickLiveBettingpage() {
        waitForSeconds(3);
        waitForElementClickable(btnLive);
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            click(btnLive);
            return verifyElement(btnLive);
        }
        return click(btnLive);

    }

    public boolean clickEventView() {
        focusFrame(liveBetFrame);
        waitForElement(btnEventView);
        verifyElement(btnEventView);
        return focusBackToDefaultFrame();
    }

    public boolean clickMultiView() {
        focusFrame(liveBetFrame);
        waitForElement(btnMultiview);
        click(btnMultiview);
        return focusBackToDefaultFrame();

    }

    public boolean verifyGameList(String strtabs) {
        if (strtabs.equalsIgnoreCase("UpComing")) {
            focusFrame(liveBetFrame);
            waitForElement(btnUpComingGame);
            driver.getWindowHandle();
            verifyElement(btnUpComingGame);
            return focusBackToDefaultFrame();

        } else if (strtabs.equalsIgnoreCase("Now Live")) {
            focusFrame(liveBetFrame);
            waitForElement(btnNowLive);
            click(btnNowLive);
            verifyElement(btnNowLive);
            driver.getWindowHandle();
            return focusBackToDefaultFrame();
        } else {
            return false;
        }

    }

    public boolean verifyNowLiveOption() {
        focusFrame(liveBetFrame);
        waitForElement(btnNowLive);
        click(btnNowLive);
        return focusBackToDefaultFrame();
    }

    public boolean verifyUpcomingGames() {
        try {
            focusFrame(liveBetFrame);
            click(btnUpComingGame);
            verifyElement(btnUpComingGame);
            return focusBackToDefaultFrame();
        } catch (Exception e) {
            click(btnUpComingGame);
            return verifyElement(btnUpComingGame);
        }

    }

    public boolean verifyLiveGames() {
        focusFrame(liveBetFrame);
        waitForElement(elmntLiveGames);
        verifyElement(elmntLiveGames);
        return focusBackToDefaultFrame();
    }

    public boolean selectlivegames() {
        focusFrame(liveBetFrame);
        click(btnNowLive);
        System.out.println("clicked NowLive icon");
        waitForElement(elmntLiveSport);
        click(elmntLiveSport);
        System.out.println("clicked Live game");
        return focusBackToDefaultFrame();
    }

    public boolean verifyLiveMatchSummary() {
        focusFrame(liveBetFrame);
        waitForElement(elmntLiveSportDetails);
        click(elmntLiveSportDetails);
        return focusBackToDefaultFrame();

    }

    public boolean verifyFutureGames() {
        focusFrame(liveBetFrame);
        waitForElement(elmntUpComingGames);
        verifyElement(elmntUpComingGames);
        return focusBackToDefaultFrame();

    }

    public boolean verifyLiveTab(String strTabName) {
        String strActualLocator = startsWithCapitalize(strTabName);
        System.out.println("\n >> strTabName: " + strTabName + " \n >>> strActualLocator : " + strActualLocator);
        if (!(strTabName.toLowerCase().contains("\"Live Betting\"".toLowerCase()))) {
        }
        waitForElement(btnLive);
        return verifyElement(btnLive);
    }

    public boolean verifyMinimizeicon() {
        focusFrame(liveBetFrame);
        waitForElement(btnMinimize);
        verifyElement(btnMinimize);
        return focusBackToDefaultFrame();
    }

    public boolean clickMinimizeicon() {
        focusFrame(liveBetFrame);
        waitForElement(btnMinimize);
        click(btnMinimize);
        return focusBackToDefaultFrame();
    }

    public boolean verifyMaximize() {
        focusFrame(liveBetFrame);
        waitForElement(btnExpand);
        verifyElement(btnExpand);
        return focusBackToDefaultFrame();
    }

    public boolean verifyMultiviewtabs() {
        focusFrame(liveBetFrame);
        waitForElement(elmntMultiViewGames);
        verifyElement(elmntMultiViewGames);
        return focusBackToDefaultFrame();
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

    public boolean verifyCalendarEvents() {
        try {
            focusFrame(liveBetFrame);
            waitForElement(elmntCalendarEvents);
            return verifyElement(elmntCalendarEvents);

        } catch (Exception e) {
            verifyElement(waitForElement(elmntCalendarEvents));
        }
        return focusBackToDefaultFrame();
    }

    public void verifyCalendardays() {
        String CalendarTabs = elmntCalendarText.getText();
        System.out.println(CalendarTabs + ">>>>>>>>>>>>>>>>>>>");
        try {
            focusFrame(liveBetFrame);
            waitForElement(elmntCalendarText);
            if (CalendarTabs.equalsIgnoreCase("There are no events scheduled for this date")) {
                waitForSeconds(3);
                System.out.println("No games available");
            } else {
                System.out.println("LIVE EVENTS ARE PRESENT");
            }
            focusBackToDefaultFrame();
        } catch (Exception e) {
            System.out.println("The exception is " + e);
        }

        waitForElement(elmntCalendarText);
        if (CalendarTabs.equalsIgnoreCase("There are no events scheduled for this date")) {
            waitForSeconds(3);
            System.out.println("No games available");
        } else {
            System.out.println("LIVE EVENTS ARE PRESENT");
        }
    }

    public boolean verifyLiveGameMessage(String StrMessage) {
        if (StrMessage.equalsIgnoreCase("There are no events scheduled for this date"))
            waitForElement(elmntCalendarText);
        return verifyElement(elmntCalendarText);
    }

    public boolean verifyMultiViewtab() {
        focusFrame(liveBetFrame);
        waitForElement(elmntMultiViewGames);
        verifyElement(elmntMultiViewGames);
        return focusBackToDefaultFrame();
    }

    public boolean clickMultiviewEvents() {
        focusFrame(liveBetFrame);
        waitForElement(elmntMultiViewGames);
        click(elmntMultiViewGames);
        return focusBackToDefaultFrame();
    }

    public boolean verifyLiveMatches() {
        focusFrame(liveBetFrame);
        waitForElement(elmntMultiViewGames);
        verifyElement(elmntMultiViewGames);
        return focusBackToDefaultFrame();
    }

    public boolean clickMyWagers() {
        focusFrame(liveBetFrame);
        waitForElement(btnMyWagers);
        click(btnMyWagers);
        return focusBackToDefaultFrame();
    }

    public boolean clickPopUp() {
        waitForElement(elmntPopup);
        return click(elmntPopup);
    }

    public boolean verifyWagersDetails(DataTable Table) {
        focusFrame(liveBetFrame);
        List<String> WagersDetails = Table.asList(String.class);
        compareList(waitForElements(elmntWagersDetails), WagersDetails);
        System.out.println(WagersDetails);

        if (elmntWagersText.isDisplayed()) {
            verifyElement(elmntWagersText);
        } else {
            verifyElement(elmntWagers);
        }
        return focusBackToDefaultFrame();
    }


    public boolean clickTodayButton() {
        focusFrame(liveBetFrame);
        waitForElement(btnToday);
        return click(btnToday);
    }

    public boolean verifyTodayWagers() {
        focusFrame(liveBetFrame);
        if (elmntWagers.isDisplayed()) {
            verifyElement(elmntWagers);
            elmntWagers.getText();
        } else {
            verifyElement(elmntWagersText);
        }

        return focusBackToDefaultFrame();
    }

    public boolean verifyWagers() {
        if (elmntWagersText.isDisplayed()) {
            verifyElement(elmntWagersText);
            String text = elmntWagers.getText();
            System.out.println(text);
        } else {
            verifyElement(elmntTodayWagers);
        }
        return focusBackToDefaultFrame();
    }

    public boolean clickThisWeekBtn() {
        try {
            focusFrame(liveBetFrame);
            waitForElement(btnThisWeek);
            click(btnThisWeek);
            return focusBackToDefaultFrame();
        } catch (Exception e) {
            waitForElement(btnThisWeek);
            click(btnThisWeek);
            return focusBackToDefaultFrame();
        }
    }

    public boolean verifyThisWeekWagers() {
        focusFrame(liveBetFrame);
        if (elmntWagers.isDisplayed()) {
            verifyElement(elmntWagers);
            String text = elmntWagers.getText();
            System.out.println(text);
        } else {
            verifyElement(elmntWagersText);
            String text = elmntWagersText.getText();
            System.out.println(text);
        }
        driver.navigate().refresh();
        return focusBackToDefaultFrame();
    }


    public void verifyMyWagersPage() {
        try {
            focusFrame(liveBetFrame);
            if (elmntWagers.isDisplayed()) {
                verifyElement(elmntWagers);
                String text = elmntWagers.getText();
                System.out.println(text);
            } else {
                verifyElement(elmntWagersText);
                System.out.println("No wagers match the selected filter");
            }
            focusBackToDefaultFrame();
        } catch (Exception e) {
            if (elmntWagers.isDisplayed()) {
                verifyElement(elmntWagers);
                elmntWagers.getText();
            } else {
                verifyElement(elmntWagersText);
            }
        }
    }

    public boolean clickUndecidedBtn() {
        try {
            focusFrame(liveBetFrame);
            waitForElement(btnUnDecidedWagers);
            click(btnUnDecidedWagers);
            return focusBackToDefaultFrame();
        } catch (Exception e) {
            waitForElement(btnUnDecidedWagers);
            return click(btnUnDecidedWagers);
        }
    }

    public boolean verifyUndecidedWagers() {
        try {
            focusFrame(liveBetFrame);
            waitForElement(elmntWagersText);
            String text = elmntWagersText.getText();
            System.out.println(text);
            verifyElement(elmntWagersText);
            return focusBackToDefaultFrame();
        } catch (Exception e) {
            waitForElement(elmntWagersText);
            System.out.println(elmntWagersText);
            return verifyElement(elmntWagersText);
        }
    }

    public void verifyPendingWagers() {
        try {
            focusFrame(liveBetFrame);
            if (elmntWagersText.isDisplayed()) {
                String text = elmntWagersText.getText();
                System.out.println(text);
            } else {
                waitForElement(elmntPendingWagers);
                verifyElement(elmntPendingWagers);
            }
            focusBackToDefaultFrame();
        } catch (Exception e) {
            if (elmntWagersText.isDisplayed()) {
                String text = elmntWagersText.getText();
                System.out.println(text);
            } else {
                waitForElement(elmntPendingWagers);
                verifyElement(elmntPendingWagers);
            }
        }

    }

    public boolean verifyAmountPaid() {
        focusFrame(liveBetFrame);
        try {
            waitForElement(elmntAmountPaid);
            elmntAmountPaid.getText();
            verifyElement(elmntAmountPaid);
        } catch (Exception e) {
            waitForElement(elmntWagersText);
            String text = elmntWagers.getText();
            System.out.println(text);
            verifyElement(elmntWagersText);
        }
        return focusBackToDefaultFrame();
    }

    public void clickDropdown() {
        try {
            waitForElement(btnDropdown);
            click(btnDropdown);
            btnDropdown.getText();
            Select dropdown = new Select(driver.findElement(By.id("chooseSport")));
            dropdown.selectByIndex(1);
            verifyElement(elmntDropdownValue);
            String DropdownValue = elmntDropdownValue.getText();
            System.out.println(DropdownValue);
            takeScreenshot(" game schedule");

        } catch (Exception e) {
            String DropdownValue = elmntDropdownValue.getText();
            System.out.println(DropdownValue);
            verifyElement(elmntDropdownValue);
            takeScreenshot("game schedule");
        }
    }


    public boolean verifySports() {
        waitForElement(elmntSoccerDetails);
        verifyElement(elmntSoccerDetails);
        return focusBackToDefaultFrame();
    }

    public void clickRules() {
        waitForSeconds(3);
        waitForElement(liveBetFrame);
        focusFrame(liveBetFrame);
        waitForElement(elmntRules);
        click(elmntRules);
        focusBackToDefaultFrame();
    }

    public void verifyRulesInformation() {
        focusFrame(liveBetFrame);
        waitForElement(elmntRulesInformation);
        verifyElement(elmntRulesInformation);
        focusBackToDefaultFrame();
    }


    public void clickHowToBetLivetab() {
        waitForElement(btnBetLivetab);
        click(btnBetLivetab);
        focusBackToDefaultFrame();
    }

    public boolean verifyLiveBetInformation() {
        verifyElement(elmntBetLiveinformation);
        return focusBackToDefaultFrame();
    }

    public boolean clickLiveEvent() {
        focusFrame(liveBetFrame);
        if (elmntNowLiveEvent.isDisplayed()) {
            waitForElement(elmntNowLiveEvent);
            return click(elmntNowLiveEvent);
        } else {
            waitForElement(elmntNowLiveEvent);
            click(elmntNowLiveEvent);
        }

        return focusBackToDefaultFrame();
    }

    public void clickTeams() {
        try {
            focusFrame(liveBetFrame);
            Coordinates coordinate = ((Locatable) clickTeamName).getCoordinates();
            coordinate.inViewPort();
            if (clickTeamName.isDisplayed()) {
                waitForElement(clickTeamName);
                click(clickTeamName);
            } else {
                System.out.println("No Live games available");
                System.out.println("This event has no active propositions");
            }
            focusBackToDefaultFrame();
            takeScreenshot("Live game Team clicked");
        } catch (Exception e) {
            Coordinates coordinate = ((Locatable) clickTeamName).getCoordinates();
            coordinate.inViewPort();
            if (clickTeamName.isDisplayed()) {
                waitForElement(clickTeamName);
                click(clickTeamName);
            } else {
                System.out.println("No Live games available");
                System.out.println("This event has no active propositions");
                takeScreenshot("Live game Team clicked");
            }

        }
    }

    public boolean enterBetAmount() {
        enterValue(waitForElement(txtBetAmtFieldInBetSlip), "2");
        return takeScreenshot("clickPlaceMyBetInStraightBetForm");

    }

    public boolean clickPlaceMyBet() {
        waitForElement(btnPlaceMyBet);
        return click(btnPlaceMyBet);
    }

    public boolean clickClosePopup() {
        focusFrame(btnClosePopup);
        waitForElement(btnClosePopup);
        click(btnClosePopup);
        return focusBackToDefaultFrame();
    }

    public boolean clickQuickBetbtn() {
        waitForSeconds(3);
        focusFrame(liveBetFrame);
        waitForElement(btnQuickBet);
        click(btnQuickBet);
        return focusBackToDefaultFrame();
    }

    public boolean verifyPopupInfo() {
        focusFrame(liveBetFrame);
        waitForElement(btnAccept);
        verifyElement(btnAccept);
        takeScreenshot("Popup");
        click(btnAccept);
        return focusBackToDefaultFrame();

    }

    public boolean verifyBetInformation() {
        waitForElement(elmntBetPostedResults);
        verifyElement(elmntBetPostedResults);
        return click(btnCloseBetSlipPopup);
    }

    public void ChangeOddsFormat(String Oddvalues) {
        focusFrame(liveBetFrame);
        btnOddsDropdown.click();
        WebElement btnOddValues = waitForElement(By.xpath(strOddsDropdown.replace("<<TABNAME>>", Oddvalues)));
        click(btnOddValues);
        btnOddValues.getText();
        System.out.println(btnOddValues);
        System.out.println(elmntOddValues);
        focusBackToDefaultFrame();
    }

    public boolean verifyOddsChanges() {
        focusFrame(liveBetFrame);
        verifyElement(elmntOddValues);
        String elementinfo = elmntOddValues.getText();
        System.out.println(elementinfo);
        return focusBackToDefaultFrame();
    }

    public boolean verifyBetSlip() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            focusFrame(waitForElement(liveBetFrame));
            return verifyElement(waitForElement(elmntBetslip));
        }
        focusFrame(liveBetFrame);
        verifyElement(elmntBetslip);
        String betslip = elmntBetslip.getText();
        System.out.println(betslip);
        return verifyElement(elmntBetslip);

    }


    public boolean verifyBetSlipTabs(String strtabs) {
        WebElement btnBetslipTabs = waitForElement(By.xpath(strBetSlipTabs.replace("<<TABNAME>>", strtabs)));
        takeScreenshot("Betslip Tabs");
        if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            boolean betSlipTabs = verifyElement(btnBetslipTabs);
            focusBackToDefaultFrame();
            return betSlipTabs;
        } else {
            return focusBackToDefaultFrame();
        }
    }

    public boolean clickBetSlipRulesbtn() {
        focusFrame(liveBetFrame);
        waitForElement(btnBetSlipRules);
        click(btnBetSlipRules);
        return focusBackToDefaultFrame();
    }

    public boolean verifyMarketTips() {
        waitForElement(elmntMarketTips);
        elmntMarketTips.getText();
        System.out.println(elmntMarketTips);
        verifyElement(elmntMarketTips);
        return focusBackToDefaultFrame();
    }

    public void clickMarketTipsGames() {
        scrollToElement(btnMarketTips);
        waitForElement(btnMarketTips);
        jsClick(btnMarketTips);
        btnMarketTips.getText();
        System.out.println(btnMarketTips);
    }

    public boolean verifyMarketTipsMessage() {
        waitForSeconds(3);
        waitForElement(MarketTipsMessage);
        MarketTipsMessage.getText();
        waitForSeconds(3);
        System.out.println(MarketTipsMessage);
        return verifyElement(MarketTipsMessage);
    }

    public boolean clickMyBetsTab() {
        waitForElement(btnMyBets);
        click(btnMyBets);
        waitForElement(elmntMyBetsInoformation);
        String text = elmntMyBetsInoformation.getText();
        System.out.println(text);
        return verifyElement(elmntMyBetsInoformation);
    }

    public boolean verifyBetslip() {

        String text = elmntBetslip.getText();
        System.out.println(text);
        return verifyElement(elmntBetslip);
    }

    public void clickCloseBtn() {
        waitForElement(elmntCloseTeamUnderBetSlip);
        click(elmntCloseTeamUnderBetSlip);
    }

    public boolean verifyEmptyBetslip() {
        waitForElement(EmptyBetslip);
        String Bet = EmptyBetslip.getText();
        System.out.println(EmptyBetslip);
        return verifyElement(EmptyBetslip);
    }

    public void clickMyBetsButton() {
        waitForElement(btnMyBetsonGame);
        click(btnMyBetsonGame);
    }

    public boolean clickCalendardays() {
        WebElement Calenderdays = null;
        for (int i = 1; i <= 8; i++) {
            Calenderdays = waitForElement(By.xpath("//div[@id='calTabs']//li[" + i + "]"));
            waitForElement(Calenderdays);
            jsClick(Calenderdays);
            waitForSeconds(5);
            String CalendarTabs = elmntCalendarText.getText();
            System.out.println(CalendarTabs + ">>>>>>>>>>>>>>>>>>>");
            try {
                if (CalendarTabs.equalsIgnoreCase("There are no events scheduled for this date")) {
                    waitForSeconds(3);
                    System.out.println("No games available");
                } else {
                    System.out.println("LIVE EVENTS ARE PRESENT");
                }
            } catch (Exception e) {
                System.out.println("The exception is " + e);
                waitForElement(elmntCalendarText);
                if (CalendarTabs.equalsIgnoreCase("There are no events scheduled for this date")) {
                    waitForSeconds(3);
                    System.out.println("No games available");
                } else {
                    System.out.println("LIVE EVENTS ARE PRESENT");
                }
            }
        }
        return verifyElement(Calenderdays);
    }

    public void clickLiveGameBtn() {

        if (btnGameNavigator.isDisplayed()) {
            click(btnGameNavigator);
        } else {
            System.out.println("No live games are present");
        }
    }

    public boolean verifyLiveEvents() {
        waitForElement(elmntLiveSportDetails);
        return verifyElement(elmntLiveSportDetails);
    }

    public boolean verifyLivePage(DataTable strTabs) {
        List<String> lstTabs = strTabs.asList(String.class);
        boolean boolResult = false;
        boolResult = getText(waitForElement(lnkHideMenus.get(0))).equalsIgnoreCase(lstTabs.get(1));
        focusFrame(waitForElement(liveBetFrame));
        boolResult = boolResult && getText(waitForElement(lnkHideMenus.get(0))).equalsIgnoreCase(lstTabs.get(2));
        takeScreenshot("try");
        return verifyElement(waitForElement(elmntBetslip)) && boolResult;
    }

    public boolean verifyStartTime() {
        return verifyElement(waitForElement(elmntLiveBettingMatchStartTime));
    }

    public boolean verifyLivePageMobile() {
        focusFrame(waitForElement(liveBetFrame));
        takeScreenshot("try");
        return verifyElement(waitForElement(elmntBetslip));
    }

    public boolean verifyHideTopContents(DataTable strTabs) {
        focusBackToDefaultFrame();
        List<String> lstTabs = strTabs.asList(String.class);
        boolean boolResult = false;
        for (int z = 0; z < lstTabs.size(); z++) {
            ScrollRightAction(elmntHideTopContents.get(0));
            if (z >= 4) {
                takeScreenshot("try");
                ScrollRightAction(elmntHideTopContents.get(9));
            }
            if (!getText(waitForElement(elmntHideTopContents.get(z))).equalsIgnoreCase(lstTabs.get(z))) {
                boolResult = false;
                takeScreenshot("try");
                break;
            } else {
                boolResult = true;
                takeScreenshot("try");
            }
        }
        return boolResult;
    }

    public boolean clickHideToMenu() {
        return click(waitForElement(lnkHideMenus.get(0)));
    }

    public boolean verifyShowToMenu() {
        return waitForInvisibilityOfElement(lnkHideMenus.get(0)) && verifyElement(waitForElement(lnkShowMenus.get(0)));
    }

    public boolean clickShowTopMenu() {
        focusBackToDefaultFrame();
        return click(waitForElement(lnkShowMenus.get(0)));
    }

    public boolean verifyHideLiveMenu(DataTable strTabs) {
        List<String> lstTabs = strTabs.asList(String.class);
        waitForSeconds(2);
        takeScreenshot("try");
        return verifyElement(waitForElement(lnkHideMenus.get(0))) && compareList(waitForElements(elmntLiveMenuContents), lstTabs);
    }

    public boolean clickHideLiveMenu() {
        return click(waitForElement(lnkHideMenus.get(0)));
    }

    public boolean verifyShowLiveMenu() {
        waitForSeconds(3);
        takeScreenshot("try");
        return verifyElement(waitForElement(lnkShowMenus.get(0)));
    }

    public boolean clickShowLiveMenu() {
        return click(waitForElement(lnkShowMenus.get(0)));
    }

    public void clickLivePageMenus(String strTab) {
        takeScreenshot("try");
        waitForElements(elmntLiveMenuContents).forEach(z -> {
            if (getText(z).equalsIgnoreCase(strTab)) {
                z.click();
            }
        });
    }

    public boolean verifyLiveOddsContents(DataTable strTabs) {
        List<String> lstTabs = strTabs.asList(String.class);
        boolean boolResults = false;
        waitForElements(elmntLiveOddsContents).forEach(z -> System.out.println(z.getText()));
        for (int z = 0; z < lstTabs.size(); z++) {
            if (!getText(waitForElement(elmntLiveOddsContents.get(z))).contains(lstTabs.get(z))) {
                takeScreenshot("try");
                boolResults = false;
            } else {
                takeScreenshot("try");
                boolResults = true;
            }
        }
        takeScreenshot("try");
        return boolResults && verifyElement(waitForElement(elmntBetslip));
    }

    public boolean verifyNoEventSelectedUnderLiveOdds() {
        return verifyElement(waitForElement(txtNoEventSelected));
    }

    public boolean verifyLiveMenuPages(String strTabs) {
        if (strTabs.equalsIgnoreCase("Live Odds")) {
            takeScreenshot("try");
            return verifyElement(waitForElement(elmntLiveOddsContents.get(0)));
        } else {
            takeScreenshot("try");
            return false;
        }
    }

    public boolean clickInProgressUnderLiveOdds() {
        waitForSeconds(2);
        takeScreenshot("try");
        return click(waitForElement(elmntLiveOddsContents.get(0)));
    }

    public boolean verifyInProgressTeams() {
        if (verifyElement(waitForElement(lnkTeamsUnderInProgress))) {
            takeScreenshot("try");
            return true;
        } else {
            Reporter.addStepLog("No Teams Under In Progress");
            takeScreenshot("try");
            return false;
        }
    }

    public boolean verifyUpcomingTeams() {
        if (verifyElement(waitForElement(lnkTeamsUnderUpcoming)) && verifyElement(waitForElement(elmntStartTimeUnderUpcoming))) {
            takeScreenshot("try");
            return true;
        } else {
            Reporter.addStepLog("No Teams Under Upcoming");
            takeScreenshot("try");
            return false;
        }
    }

    public boolean clickUpcomingUnderLiveOdds() {
        waitForSeconds(2);
        click(waitForElement(elmntLiveOddsContents.get(0)));
        takeScreenshot("try");
        return click(waitForElement(elmntLiveOddsContents.get(1)));
    }

    public boolean clickLiveOddsTeam() {
        return click(waitForElement(lnkTeamsUnderInProgress));
    }

    public boolean verifyOddsOfTeamSelectedFromUnderLiveOdds() {
        waitForSeconds(2);
        if (verifyElement(elmntNoActiveProportion)) {
            Reporter.addStepLog("No Active Proportion");
            takeScreenshot("try");
            if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
                return false;
            }
        }
        takeScreenshot("try");
        return verifyElement(waitForElement(elmntOddsOfTeamSelectedUnderLiveOdds));
    }

    public boolean verifyMyBetsOnThisUnderSelectedTeam() {
        if (verifyElement(elmntNoActiveProportion)) {
            Reporter.addStepLog("No Active Proportion");
            takeScreenshot("try");
            return false;
        }
        takeScreenshot("try");
        return verifyElement(waitForElement(btnMyBetsOnThisUnderTeam));
    }

    public boolean clickOddsUnderSelectedTeam() {
        waitForSeconds(2);
        if (verifyElement(elmntOddsFrozen)) {
            return this.clickAnotherTeam();
        } else if (verifyElement(elmntNoActiveProportion)) {
            return this.clickAnotherTeam();
        }
        takeScreenshot("try");
        return click(waitForElement(elmntOddsOfTeamSelectedUnderLiveOdds));
    }

    private boolean clickAnotherTeam() {
        clickInProgressUnderLiveOdds();
        click(waitForElement(lnkTeamsUnderInProgressAnotherTeam));
        waitForSeconds(2);
        if (verifyElement(elmntOddsFrozen)) {
            Reporter.addStepLog("Odds Are Frozen");
            takeScreenshot("try");
            return false;
        } else if (verifyElement(elmntNoActiveProportion)) {
            Reporter.addStepLog("No Active Proportion");
            takeScreenshot("try");
            return false;
        }
        takeScreenshot("try");
        return click(waitForElement(elmntOddsOfTeamSelectedUnderLiveOdds));
    }

    public boolean verifyBetPostedPopUp() {
        waitForSeconds(2);
        return verifyElement(waitForElement(elmntBetPostedPopUp));
    }

    public boolean verifyBetAddedToBetSlip() {
        waitForSeconds(2);
        return Integer.valueOf(getText(waitForElement(elmntBetSlipCount))) > 0;
    }

    public boolean clickMyBetsOnThisGame() {
        return click(waitForElement(btnMyBetsOnThisUnderTeam));
    }

    public boolean verifyMyWagersAutoSelected() {
        return verifyElement(waitForElement(elmntMyWagersAutoSelected));
    }

    public boolean verifyWagersContents() {
        return verifyElement(waitForElement(elmntMyWagersContents));
    }

    public boolean verifyMultiViewPage() {
        return verifyElement(waitForElement(elmntMultiViewMessage));
    }

    public boolean clickTeamUnderMultiView() {
        return click(waitForElement(lnkTeamUnderMultiView));
    }

    public boolean clickOddsUnderSelectedTeamMultiView() {
        waitForSeconds(2);
        if (verifyElement(elmntOddsFrozen)) {
            Reporter.addStepLog("Odds Are Frozen");
            takeScreenshot("try");
            return false;
        } else if (verifyElement(elmntNoActiveProportion)) {
            Reporter.addStepLog("No Active Proportion");
            takeScreenshot("try");
            return false;
        }
        takeScreenshot("try");
        return click(waitForElement(elmntOddsUnderMultiViewTeam));
    }

    public boolean clickAddAnEvent() {
        if (verifyElement(elmntBetPostedPopUp)) {
            waitForSeconds(4);
        }
        if (verifyElement(btnAddAnEvent)) {
            takeScreenshot("try");
            return click(waitForElement(btnAddAnEvent));
        } else {
            Reporter.addStepLog("No Add Event Button Displayed");
            takeScreenshot("try");
            return true;
        }
    }

    public boolean verifyTodaySelectedAsDefault() {
        return verifyElement(waitForElement(elmntTodaySelectedAsDefault));
    }

    public boolean verifyTodayScheduledMatch() {
        return verifyElement(waitForElement(elmntCalendarEvents));
    }

    public boolean clickAnyDateUnderCalender() {
        return click(waitForElement(elmntDateUnderCalendar));
    }

    public boolean verifyDateSelectedContents() {
        waitForSeconds(2);
        if (verifyElement(elmntNoEvents)) {
            Reporter.addStepLog("No Event Available");
            takeScreenshot("try");
            return false;
        }
        takeScreenshot("try");
        return verifyElement(waitForElement(elmntDateSelectedContent));
    }

    public boolean verifyMyWagersSubTabs(DataTable strTabs) {
        waitForSeconds(2);
        List<String> lstTabs = strTabs.asList(String.class);
        takeScreenshot("try");
        return compareList(waitForElements(elmntMyWagersSubTabs).subList(0, 3), lstTabs);
    }

    public boolean clickAnySubTabUnderMyWagers() {
        return click(waitForElement(elmntMyWagersSubTabs.get(0)));
    }

    public boolean verifyMyWagersSelectedSubTabContent() {
        return verifyElement(waitForElement(elmntWagersText));
    }

    public boolean verifyRulesPage() {
        return verifyElement(waitForElement(elmntRulesInformation));
    }

    public boolean clickBetSlipUnderLive() {
        waitForSeconds(2);
        takeScreenshot("try");
        return click(waitForElement(elmntBetslip));
    }

    public boolean verifyAcceptFavourablePriceChangeDropDown() {
        return verifyElement(waitForElement(selAcceptFavourablePriceChange));
    }

    public boolean verifyBetAmountField() {
        return verifyElement(waitForElement(txtBetAmtFieldInBetSlip));
    }

    public boolean verifyClearAndCloseButtonUnderBetSlip() {
        takeScreenshot("try");
        return verifyElement(waitForElement(btnClearBetSlip)) && verifyElement(waitForElement(elmntCloseTeamUnderBetSlip));
    }

    public boolean clickAcceptChanges() {
        waitForSeconds(2);
        if (verifyElement(btnAccept)) {
            takeScreenshot("try");
            return click(btnAccept);
        }
        takeScreenshot("try");
        Reporter.addStepLog("No Accept Changes Button Displayed Under Bet Slip");
        return true;
    }

    public boolean verifyPostBetButton() {
        return verifyElement(waitForElement(btnPlaceMyBet));
    }

    public boolean verifyBetPostingStatus() {
        verifyElement(waitForElement(elmntBetPostedPopUp));
        takeScreenshot("try");
        return click(waitForElement(btnCloseBetSlipPopup));
    }

    public boolean clickClearUnderBetSlip() {
        waitForSeconds(2);
        return click(waitForElement(btnClearBetSlip));
    }

    public boolean clickCloseUnderBetSlip() {
        return click(waitForElement(elmntCloseTeamUnderBetSlip));
    }
}
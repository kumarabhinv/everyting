package sportsBetting.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.DateUtil;
import com.cucumber.listener.Reporter;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.awt.event.KeyEvent;
import java.util.List;

public class SBEsportsPage extends BasePage {

    public SBEsportsPage(WebDriver driver) {
        super(driver);
    }

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[.='E-Sports']"),
            @FindBy(how = How.XPATH, using = "//div[@id='scrolling']/ul/li/center[starts-with(.,'ESPORTS')]/parent::li")
    })
    protected WebElement lblEsportsTabInMobile;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::span[.='1X2'][1]/following::button[2]"),
            @FindBy(how = How.XPATH, using = "//div[2][contains(.,'Money Line')]/div[2]/div[4]/a/div/span[1]/following::button[1]")
    })
    protected WebElement elmntChoosingEsportsMatchInMobile;

    @FindBy(how = How.XPATH, using = "//div/button[1]/span[1][contains(.,'All Markets')]/parent::button/parent::div/following-sibling::div/div[2]/button[1]")
    protected WebElement elmntChoosingEsportsTeamInMobile;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//button[@class='_3dBxy']"),
            @FindBy(how = How.XPATH, using = "//div/span[contains(.,'Esports')]/parent::div/following-sibling::div/button")
    })
    protected WebElement lblBetSlipLogoInEsportsPage;

    @FindBy(how = How.XPATH, using = "//input[@type='number']")
    protected WebElement txtStakeAmountInBetSlip;

    @FindBy(how = How.XPATH, using = "//input[@type='number']")
    protected List<WebElement> txtStakeAmountsInBetSlip;

    @FindBy(how = How.XPATH, using = "//button/span[contains(.,'Place Bet')]")
    protected WebElement btnPlaceBitInBetSlip;

    @FindBy(how = How.ID, using = "iframeESport")
    protected WebElement iFrameEsport;

    @FindBy(how = How.XPATH, using = "//a[.='Early Markets']")
    protected WebElement elmntEsportsEarlyMarkets;

    @FindBy(how = How.XPATH, using = "//a/span[.='Early Markets']")
    protected WebElement txtEsportsEarlyMarkets;

    @FindBy(how = How.XPATH, using = "//a[.='Outright']")
    protected WebElement elmntEsportsOutright;

    @FindBy(how = How.XPATH, using = "//div[@class='_1fjyA']/span")
    protected WebElement ticketNumberEsportsBet;

    //Regression Elements

    @FindBy(how = How.XPATH, using = "//span[.='Favorites']")
    protected WebElement elmntFavouritesEsports;

    @FindBy(how = How.XPATH, using = "//span[.='No favorites']")
    protected WebElement txtNoFavouriteEsports;

    @FindBy(how = How.XPATH, using = "//span[.='Today']")
    protected WebElement elmntTodayEsports;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::div[@class='_2Ma4o'][1]/button[@class='_2n7f0 _1NZPH _28xnS']")
    protected WebElement elmntFavouriteIconAfterClicked;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::div[@class='_2Ma4o'][1]/button")
    protected WebElement elmntFavouriteIcon;

    @FindBy(how = How.XPATH, using = "//span[.='Live']/following::span[@class='_3xz9N']")
    protected WebElement txtFavouriteEsports;

    @FindBy(how = How.XPATH, using = "//span[.='中文繁體']")
    protected WebElement elmntChineseLanguage;

    @FindBy(how = How.XPATH, using = "//span[.='English']")
    protected WebElement elmntEnglishLanguage;

    @FindBy(how = How.XPATH, using = "//span[.='Bet History']")
    protected WebElement elmntBetHistory;

    @FindBy(how = How.XPATH, using = "//div[@class='_356Qs']//span[.='History']")
    protected WebElement elmntHistoryMyBets;

    @FindBy(how = How.XPATH, using = "//span[.='Pending Bets']/following::span[.='Bet History']")
    protected WebElement elmntBetBetHistory;

    @FindBy(how = How.XPATH, using = "//span[.='Pending Bets']")
    protected WebElement elmntPendingtHistory;

    @FindBy(how = How.XPATH, using = "//div[@class='_356Qs']//span[.='Pending']")
    protected WebElement elmntPendingMyBets;

    @FindBy(how = How.XPATH, using = "//span[.='Live']")
    protected WebElement elmntLiveEsports;

    protected String strHeaderTabLocator = new StringBuilder()
            .append("//span[.='")
            .append("<<TABNAME>>")
            .append("']").toString();

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::span[.='1X2'][1]/following::button[2]")
    protected WebElement elmntUnder1x2HeaderEsportDesktop;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::span[.='1X2'][3]/following::button[2]")
    protected WebElement elmntUnderSecond1x2HeaderEsportDesktop;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::span[.='1X2'][3]/following::button[2]")
    protected WebElement elmntUnderThird1x2HeaderEsportDesktop;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::span[.='HDP'][1]/following::button[4]")
    protected WebElement elmntUnderHdpHeaderEsportDesktop;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::span[.='HDP'][2]/following::button[4]")
    protected WebElement elmntUnderSecondHdpHeaderEsportDesktop;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::span[.='Map 1'][1]/following::button[6]")
    protected WebElement elmntUnderMap1HeaderEsportDesktop;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::span[.='Map 1'][2]/following::button[6]")
    protected WebElement elmntUnderSecondMap1HeaderEsportDesktop;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::span[.='Map 2'][1]/following::button[8]")
    protected WebElement elmntUnderMap2HeaderEsportDesktop;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::span[.='Map 2'][2]/following::button[8]")
    protected WebElement elmntUnderSecondMap2HeaderEsportDesktop;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::span[.='Map 3'][1]/following::button[10]")
    protected WebElement elmntUnderMap3HeaderEsportDesktop;

    @FindAll({
            @FindBy(how = How.CSS, using = "iframe#iframeESport"),
            @FindBy(how = How.CSS, using = "iframe#iframeESports")
    })
    protected WebElement elmntFrameESportsPage;

    @FindBy(how = How.XPATH, using = "//div[@class='CtE4o']//following::span[.='1X2'][1]")
    protected WebElement txt1x2Header;
    @FindBy(how = How.XPATH, using = "//div[@class='CtE4o']//following::span[.='HDP'][1]")
    protected WebElement txtHdpHeader;
    @FindBy(how = How.XPATH, using = "//div[@class='CtE4o']//following::span[.='Map 1'][1]")
    protected WebElement txtMap1Header;
    @FindBy(how = How.XPATH, using = "//div[@class='CtE4o']//following::span[.='Map 2'][1]")
    protected WebElement txtMap2Header;
    @FindBy(how = How.XPATH, using = "//div[@class='CtE4o']//following::span[.='Map 3'][1]")
    protected WebElement txtMap3Header;

    @FindBy(how = How.XPATH, using = "//div[@class='CtE4o']//following::div[@class='_1iHHy'][1]")
    protected WebElement iconLiveVideo; //todo

    @FindBy(how = How.XPATH, using = "//span[.='Accept']")
    protected WebElement btnAcceptBetslipEsport;

    @FindBy(how = How.XPATH, using = "//div[@class='_2DW8i']//span[.='Ticket ID']")
    protected WebElement txtTicketIdPendingBetsEsports;

    @FindBy(how = How.XPATH, using = "//div[@clas='_2ZJKL']//following::span[.='Ticket ID:']")
    protected WebElement txtTicketIdPendingMyBets;

    @FindBy(how = How.XPATH, using = "//div[@class='_2-cMW']//following::input[1]")
    protected WebElement txtFromDateBetHistoryEsports;

    @FindBy(how = How.XPATH, using = "//div[@class='_2-cMW']//following::input[2]")
    protected WebElement txtToDateBetHistoryEsports;

    @FindBy(how = How.XPATH, using = "//button[@class='_2dZEA btn btn-default']")
    protected WebElement btnShowBetHistory;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']//following::span[.='1X2'][1]//following::div[@class='_3YXvb'][1]/span[contains(text(),'')][1]")
    protected WebElement elmntTeamNameEsports;

    @FindBy(how = How.XPATH, using = "//div[@class='_2ARMc']/span[.='1X2'][1]//following::div[@class='_3YXvb'][1]/span[contains(text(),'')]")
    protected List<WebElement> elmntTeamNameInSeachBox;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//button[@class='player-button qa-pause-play-button']"),
            @FindBy(how = How.XPATH, using = "(//button[@aria-label='Play'])[2]")
    })
    protected WebElement elmntPauseGameWindowEsports;

    @FindBy(how = How.XPATH, using = "//div[@class='_1frOG']/span")
    protected WebElement txtTeamNamesEsports;

    @FindBy(how = How.XPATH, using = "(//div[@class='_1frOG']/span)[1]")
    protected WebElement txtTeamNamesEsportsMobile;

    @FindBy(how = How.XPATH, using = "//div[@class='_12F6b']")
    protected WebElement lblBetSlipTeam;

    @FindBy(how = How.XPATH, using = "//div[@class='_3U8KD']/preceding::div[@class='_9iRa4']")
    protected WebElement lblOutrightEsports;

    @FindBy(how = How.XPATH, using = "//div[@class='_9iRa4']/following::button[1]")
    protected WebElement elmntchoosingOutrightEsports;

    @FindBy(how = How.XPATH, using = "//div[@class='_1dhkm']/following::div[@class='_12elm'][1]/span")
    protected List<WebElement> txtBetTypeHeaderEsports;

    @FindBy(how = How.XPATH, using = "//span[.='Results']")
    protected WebElement elmntResultEsports;

    @FindBy(how = How.XPATH, using = "//div[@class='_2wqAp OAMdM']/child::span[.='Prematch' or .='All categories']")
    protected List<WebElement> elmntCategoriesResults;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::a[1]/child::span"),
            @FindBy(how = How.XPATH, using = "((//div[@class='LiUZu'])/a[@class='twRYg']/span)[1]")
    })
    protected WebElement elmntMarkeValuetResult;

    @FindBy(how = How.XPATH, using = "//div[@class='_2hae4']/button[2]")
    protected WebElement elmntDateRangeSelector;

    @FindBy(how = How.XPATH, using = "//div[@class='_2hae4']/button[1]")
    protected WebElement elmntDateRangeSelector1;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::div[@class='_2wqAp OAMdM']/following::span[.='Live']")
    protected WebElement elmntLiveResultsEsports;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']/following::div[@class='ywpOm'][1]/span[2]")
    protected WebElement txtTeamNameResultsEsports;

    @FindBy(how = How.XPATH, using = "//div[@class='CtE4o']/following::div[@class='_1GNU5 _1Oike'][2]/child::div/span[1]")
    protected WebElement elmntPrematchResults;

    @FindBy(how = How.XPATH, using = "//div[@class='CtE4o']/following::div[@class='_1GNU5 _1Oike'][3]")
    protected WebElement elmntAllCategoriesResults;

    @FindBy(how = How.XPATH, using = "//a[.='ESPORTS']")
    protected WebElement elmntEsportsTab;

    @FindBy(how = How.XPATH, using = "//div[@class='_2wqAp OAMdM']/child::span[.='All categories']//following::span[3]")
    protected WebElement elmntCategoriesOptionResults;

    @FindBy(how = How.XPATH, using = "//*[@class='CtE4o']")
    protected List<WebElement> elmntsEsportsSubTabs;

    @FindBy(how = How.XPATH, using = "//span[.='Odds']")
    protected WebElement elmntOddsEsports;

    @FindBy(how = How.XPATH, using = "//div[@class='_1BW7a _3jHnq _1McJX']/div[2]")
    protected WebElement elmntOddsOptionsEsports;

    @FindBy(how = How.XPATH, using = "//span[.='Time']")
    protected WebElement elmntTimeEsports;

    @FindBy(how = How.XPATH, using = "//span[.='Time']//following::span[4]")
    protected WebElement elmntTimeGstEsports;

    @FindBy(how = How.XPATH, using = "//span[.='Odds or status of selection/s have changed! Accept changes?']")
    protected WebElement txtOddChangesBetSlip;

    @FindBy(how = How.XPATH, using = "//span[.='Accept']")
    protected WebElement elmntAcceptOddChangesInBetSlip;

    @FindBy(how = How.XPATH, using = "//div[@class='_1r-HI']/following::div[@class='_1wuDB']/span")
    protected List<WebElement> txtMultipleTeamsNamesOnBetSlip;

    @FindBy(how = How.XPATH, using = "//div[@class='_1r-HI']/following::div[.='✖'][1]")
    protected WebElement elmntCloseIconInBetslip;

    @FindBy(how = How.XPATH, using = "//div[@class='_1wuDB']/span[1]")
    protected List<WebElement> elmntTotalTeamNameInBetslip;

    @FindBy(how = How.XPATH, using = "//span[.='Delete All']")
    protected WebElement btnDeleteAllBetSlip;

    @FindBy(how = How.XPATH, using = "//span[.='Select events to place bets!']")
    protected WebElement txtEmptyBetSlip;

    @FindBy(how = How.XPATH, using = "//span[.='My Bets']")
    protected WebElement elmntMyBetSlip;

    @FindBy(how = How.XPATH, using = "//span[.='Odd/Price Change Settings']")
    protected WebElement elmntOddChangeSettingBetslip;

    @FindBy(how = How.XPATH, using = "//div[@class='_3MCD0']/span")
    protected List<WebElement> elmntOddChangeOptionsBetslip;

    @FindBy(how = How.XPATH, using = "//div[@class='_3MCD0']/span[.='Automatically accept all odds/prices changes']")
    protected WebElement elmntOddChangeFirstOptionBetSlip;

    @FindBy(how = How.XPATH, using = "//div[@class='_3MCD0']/span[.='Accept only better odds/prices']")
    protected WebElement elmntOddChangeSecondOptionBetSlip;

    @FindBy(how = How.XPATH, using = "//span[.='Bet not accepted. Reason: Betting service is offline!']")
    protected WebElement txtBettingServiceOfflineBetSlip;

    @FindBy(how = How.XPATH, using = "//span[.='Ticket ID: ']")
    protected WebElement txtTicketIdInMyBets;

    @FindBy(how = How.XPATH, using = "//input[@type='text']")
    protected WebElement elmntTeamSearchTxtBox;

    @FindBy(how = How.XPATH, using = "//div[@class='hS-Yr']//child::span")
    protected WebElement iconTeamSearch; //todo

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Bet Max')]")
    protected WebElement elmntBetMax;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Straight')]")
    protected WebElement elmntStraightOptionBetSlip;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Parlay')]")
    protected WebElement elmntParlayOptionBetSlip;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Ok')]")
    protected WebElement btnAlertMessagePopup;

    @FindBy(how = How.XPATH, using = "//div[@class='_336HH']")
    protected WebElement popUpAlertMessage; //todo

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Attempted')]/following::button")
    protected WebElement elmntMultipleTeamsError;

    protected String elmntESportsOptions = new StringBuilder()
            .append("//div/span[.='")
            .append("<<OPTIONNAME>>")
            .append("']").toString();

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'JVJUN')]")
    protected List<WebElement> elmntESportsSubTabs;

    @FindBy(how = How.XPATH, using = "//button[@class='_19XC4'][1]")
    protected WebElement elmntEsportsLeftNavigator;

    @FindBy(how = How.XPATH, using = "//button[@class='_3dBxy']")
    protected WebElement elmntEsportsRightNavigator;

    @FindBy(how = How.XPATH, using = "//div[@class='hS-Yr']/parent::div/descendant::div[contains(@class,'u')]")
    protected List<WebElement> elmntLeftNavigatorOptions;

    @FindBy(how = How.XPATH, using = "//span[.='Betslip']/parent::button")
    protected WebElement elmntESportsBetSlip;

    @FindBy(how = How.XPATH, using = "//div[@class='X2acy']/descendant::button[contains(number(), '')][1]")
    protected WebElement elmntEsportsBetSlipTeamCount;

    @FindBy(how = How.XPATH, using = "//span[.='Bet History']/ancestor::a")
    protected WebElement elmntBetHistoryInsideLeftNavigator;

    @FindBy(how = How.XPATH, using = "//span[.='Pending Bets']/parent::a")
    protected WebElement elmntPendingHistoryMobile;

    @FindBy(how = How.XPATH, using = "(//span[.='Bet History']/ancestor::a)[2]")
    protected WebElement elmntBetHistoryMobile;

    protected String elmntEsportsCountries = new StringBuilder()
            .append("//span[.='")
            .append("<<COUNTRYNAME>>")
            .append("']")
            .toString();

    @FindBy(how = How.XPATH, using = "(//span[.='電競'])[2]")
    protected WebElement elmntEsportsChinesePage;

    @FindBy(how = How.XPATH, using = "(//span[.='Esports'])[2]")
    protected WebElement elmntEsportsEnglishPage;

    @FindBy(how = How.XPATH, using = "(//button[contains(., '.')])[1]")
    protected WebElement btnTeamFirst;

    @FindBy(how = How.XPATH, using = "(//button[contains(., '.')])[4]")
    protected WebElement btnTeamSecond;

    @FindBy(how = How.XPATH, using = "//button[@class='_3dBxy _3nw1c']")
    protected WebElement btnCloseRightNavigator;

    @FindBy(how = How.XPATH, using = "//div/span[contains(text(), 'not accepted')]")
    protected WebElement txtEsportsBetNotAccepted;

    @FindBy(how = How.XPATH, using = "//div/span[contains(text(), 'Processing bet...')]")
    protected WebElement txtEsportsBetInProgress;

    @FindBy(how = How.XPATH, using = "//div/span[.='Internal server error!']")
    protected WebElement txtEsportsInternalServerError;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'incompatible')]")
    protected WebElement elmntParlayError;

    @FindBy(how = How.XPATH, using = "//input[@type='number'][contains(@value, '')]")
    protected WebElement inpBetMaxValue;

    protected boolean pauseGame = false;

    public boolean clickEsportsTab() {
        waitForSeconds(2);
        ScrollRightAction(lblEsportsTabInMobile);
        waitForElement(lblEsportsTabInMobile);
        return click(lblEsportsTabInMobile);
    }

    public boolean clickEsportsEarlyMarkets() {
        focusFrame(iFrameEsport);
        waitForElement(elmntEsportsEarlyMarkets);
        return click(elmntEsportsEarlyMarkets);
    }

    public boolean clickEsportsTeam() {

        waitForElement(elmntChoosingEsportsMatchInMobile);
        return click(elmntChoosingEsportsMatchInMobile);

    }

    public boolean clickOnBetSlipInEsports() {
        waitForElement(lblBetSlipLogoInEsportsPage);
        return click(lblBetSlipLogoInEsportsPage);
    }

    public void enterBetAmountOnBetSlip() {
//        waitForSeconds(2);
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            click(waitForElement(elmntEsportsRightNavigator));
        }
        mouseOver(waitForElement(txtStakeAmountInBetSlip));
        enterValue(txtStakeAmountInBetSlip, "2");
    }

    public boolean clickOnPlaceBetInBetSlip() {
        if (verifyElement(txtOddChangesBetSlip)) {
            jsClick(waitForElement(elmntAcceptOddChangesInBetSlip));
        }
        waitForElement(btnPlaceBitInBetSlip);
        takeScreenshot("try");
        mouseOver(btnPlaceBitInBetSlip);
//            jsScrollDown();
        return click(btnPlaceBitInBetSlip);
    }


    public boolean verifyTicketNumberEsports() {
        waitForSeconds(2);
        if(verifyElement(txtEsportsBetInProgress))
        {
            if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
            {
                waitForSeconds(4);
            }
            else {
                waitForInvisibilityOfElement(txtEsportsBetInProgress);
            }
        }
        if(verifyElement(txtEsportsInternalServerError))
        {
            Reporter.addStepLog("Internal Server Error");
            return false;
        }
        takeScreenshot("eSportsTicket");
        if (verifyElement(txtBettingServiceOfflineBetSlip)) {
            scrollToElement(elmntAcceptOddChangesInBetSlip);
            System.out.println(txtBettingServiceOfflineBetSlip.getText());
            takeScreenshot("eSportsTicket");
            return true;
        } else if (verifyElement(txtEsportsBetNotAccepted)) {
            Reporter.addStepLog("Your bet was not accepted");
            takeScreenshot("eSportsTicket");
            return false;
        }
            else {
                waitForSeconds(30);
            verifyElement(waitForElement(ticketNumberEsportsBet));
            takeScreenshot("eSportsTicket");
            return focusBackToDefaultFrame();
        }
    }

    //Regression Methods

    // @Verifying Esports Page


    public boolean verifyEsports() {
        focusFrame(waitForElement(elmntFrameESportsPage));
        waitForElement(elmntEsportsEarlyMarkets);
        return verifyElement(elmntEsportsEarlyMarkets);
    }


    //@Clicking On Favourites Tab
    public void clickOnFavourites() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            click(waitForElement(elmntEsportsLeftNavigator));
        }
        waitForElement(elmntFavouritesEsports);
        click(elmntFavouritesEsports);

    }

    //@Verifying No Favourites in Favourites Tab
    public boolean verifyNoFavourites() {
        boolean noFavourite = verifyElement(waitForElement(txtNoFavouriteEsports));
        focusBackToDefaultFrame();
        return noFavourite;
    }

    //@Clicking On Today Tab
    public boolean clickOnTodayEsports() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            takeScreenshot("try");
            return click(waitForElement(elmntESportsSubTabs.get(1)));
        } else {
            waitForElement(elmntTodayEsports);
            return click(elmntTodayEsports);
        }
    }

    //@Clicking on Favourite Icon
    public void clickOnFavouriteIcon() {
        waitForElement(elmntFavouriteIcon);
        click(elmntFavouriteIcon);
    }

    //Verifying Team Added To Favourites
    public boolean verifyFavouriteAdded() {
        waitForSeconds(2);
        boolean favouriteAdded = verifyElement(waitForElement(elmntFavouriteIconAfterClicked));
        focusBackToDefaultFrame();
        return favouriteAdded;
    }


    //Clicking Chinese Language
    public void clickOnEnglishseLanuguage() {
        waitForElement(elmntEnglishLanguage);
        click(elmntEnglishLanguage);
    }

    //Clicking Chinese Language
    public void clickOnChineseLanuguage() {
        waitForElement(elmntChineseLanguage);
        click(elmntChineseLanguage);
    }

    public void clickOnBetHistory() {
        waitForSeconds(2);
        waitForElement(elmntBetHistory);
        click(elmntBetHistory);
        System.out.println("Clicked >>>>>> Bet Hsitory");
    }

    public boolean verifyBetHistoryOptions(String strOptions) {
        System.out.println(strOptions);
        if (strOptions.contains("PENDING BETS")) {
            System.out.println("entered If");
            waitForElement(elmntPendingtHistory);
            verifyElement(elmntPendingtHistory);
            return focusBackToDefaultFrame();
        } else if (strOptions.contains("Bet History")) {
            System.out.println("entered If Else");
            waitForElement(elmntBetBetHistory);
            click(elmntBetBetHistory);
            verifyElement(elmntBetBetHistory);
            return focusBackToDefaultFrame();
        } else {
            return false;
        }
    }

    public boolean clickLiveEsports() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            return click(waitForElement(elmntESportsSubTabs.get(0)));
        } else {
            waitForElement(elmntLiveEsports);
            return click(elmntLiveEsports);
        }
    }

    //@choosing a odd under live tab
    public void clickElmntChoosingEsports() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            System.out.println(elmntEsportsBetSlipTeamCount.getText());
            takeScreenshot("try");
            if (Integer.valueOf(elmntEsportsBetSlipTeamCount.getText()) > 0) {
                click(waitForElement(elmntEsportsRightNavigator));
                takeScreenshot("try");
                click(waitForElement(btnDeleteAllBetSlip));
            }
        }
        else {
            if (verifyElement(btnDeleteAllBetSlip)) {
                click(waitForElement(btnDeleteAllBetSlip));
            }
        }
            waitForSeconds(2);
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            click(waitForElement(btnTeamFirst));
            takeScreenshot("try");
        }
        else {
            waitForElement(elmntUnder1x2HeaderEsportDesktop);
            if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_BROWSER)) {
                click(elmntUnder1x2HeaderEsportDesktop);
            }
            click(elmntUnderSecondMap2HeaderEsportDesktop);
    }
    }

    public void clickElmntChoosing1Esports() {
        try {
            if (verifyElement(btnDeleteAllBetSlip)) {
                click(btnDeleteAllBetSlip);
            }
            waitForSeconds(2);
            waitForElement(elmntUnder1x2HeaderEsportDesktop);
            click(elmntUnder1x2HeaderEsportDesktop);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (verifyElement(btnDeleteAllBetSlip)) {
                click(btnDeleteAllBetSlip);
            }
            waitForSeconds(2);
            scrollToElement(elmntchoosingOutrightEsports);
            waitForElement(elmntchoosingOutrightEsports);
            click(elmntchoosingOutrightEsports);
        }
    }

    //@Clicking on pending bets inside BetHistory
    public void clickPendingBets() {
        waitForElement(elmntPendingtHistory);
        click(elmntPendingtHistory);
    }

    public boolean verifyTicketIdBetHistoryEsports() {
        verifyElement(waitForElement(txtTicketIdPendingBetsEsports));
        return focusBackToDefaultFrame();

    }

    public void clickBetBetHistoryEsports() {
        waitForElement(elmntBetBetHistory);
        click(elmntBetBetHistory);
    }

    public void enterFromDateInBetHistory() {
        waitForElement(txtFromDateBetHistoryEsports);
        enterValue(txtFromDateBetHistoryEsports, "12/12/2019");
    }

    public void enterToDateInBetHistory() {
        waitForElement(txtToDateBetHistoryEsports);
        enterValue(txtToDateBetHistoryEsports, DateUtil.getCurrentDate("dd/MM/yyyy"));

    }

    public void clickShowBetHistory() {
        waitForElement(btnShowBetHistory);
        click(btnShowBetHistory);
    }

    public void clickVideoIcon() {
        waitForElement(iconLiveVideo);
        click(iconLiveVideo);
    }

    public boolean verifyLiveMatchEsports() {

        waitForWindow(2);
        waitForSeconds(3);
        focusWindow(2);
        waitForSeconds(3);
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            pauseGame = click(elmntPauseGameWindowEsports);
        }
        else {
            robotKey(KeyEvent.VK_SPACE);
            pauseGame = verifyElement(elmntPauseGameWindowEsports);
        }
        waitForSeconds(3);
        closeWindow(2);
        focusWindow(1);
        focusBackToDefaultFrame();
        return pauseGame;

    }

    public void clickTeamNameEsports() {
        waitForElement(elmntTeamNameEsports);
        click(elmntTeamNameEsports);
    }

    public boolean verifyTeamNameEsports() {
        waitForElement(elmntTeamNameEsports);
        System.out.println(elmntTeamNameEsports.getText());
        return verifyElement(elmntTeamNameEsports);
    }

    public boolean verifyTeamNamesEsports() {
        waitForSeconds(2);
//        System.out.println("TeamNames>>>>>>>>>>" + txtTeamNamesEsports.getText());
        boolean teamName = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            teamName = verifyElement(waitForElement(txtTeamNamesEsportsMobile));
        } else {
            teamName = verifyElement(waitForElement(txtTeamNamesEsports));
        }
        focusBackToDefaultFrame();
        return teamName;
    }

    public boolean verifyTeamAddedUnderBetSlip() {
        waitForSeconds(2);
        return verifyElement(waitForElement(lblBetSlipTeam));

    }

    public void clickOddValueUnderHdpEsports() {
        if (verifyElement(btnDeleteAllBetSlip)) {
            click(btnDeleteAllBetSlip);
        }
        waitForElement(elmntUnderHdpHeaderEsportDesktop);
        click(elmntUnderHdpHeaderEsportDesktop);
    }

    public void clickOddValueUnderMap1Esports() {
        if (verifyElement(btnDeleteAllBetSlip)) {
            click(btnDeleteAllBetSlip);
        }
        waitForElement(elmntUnderMap1HeaderEsportDesktop);
        click(elmntUnderMap1HeaderEsportDesktop);
    }

    public void clickOddValueUnderMap2Esports() {
        if (verifyElement(btnDeleteAllBetSlip)) {
            click(btnDeleteAllBetSlip);
        }
        waitForElement(elmntUnderMap2HeaderEsportDesktop);
        click(elmntUnderMap2HeaderEsportDesktop);
    }

    public void clickOddValueUnderMap3Esports() {
        if (verifyElement(btnDeleteAllBetSlip)) {
            click(btnDeleteAllBetSlip);
        }
        waitForElement(elmntUnderMap3HeaderEsportDesktop);
        click(elmntUnderMap3HeaderEsportDesktop);
    }

    public void clickOnEarlyMarketsEsports() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            takeScreenshot("try");
            click(waitForElement(elmntESportsSubTabs.get(2)));
        } else {
            waitForSeconds(3);
            waitForElement(elmntEsportsEarlyMarkets);
            click(elmntEsportsEarlyMarkets);
        }
    }

    public void clickOnOutrightsEsports() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            takeScreenshot("try");
            click(waitForElement(elmntESportsSubTabs.get(3)));
        } else {
            waitForElement(elmntEsportsOutright);
            click(elmntEsportsOutright);
        }
    }

    public boolean verifyOutrightEsport() {
        waitForElement(lblOutrightEsports);
        return verifyElement(lblOutrightEsports);
    }


    public void clickOnOddsOutrightEsports() {
        scrollToElement(elmntchoosingOutrightEsports);
        waitForElement(elmntchoosingOutrightEsports);
        click(elmntchoosingOutrightEsports);
    }

    public boolean verifyEspotrsBetTypeHeaders(DataTable tableBetTypeHeader) {
        List<String> BetTypeHeader = tableBetTypeHeader.asList(String.class);
        System.out.println(txtBetTypeHeaderEsports);
        return compareList(waitForElements(txtBetTypeHeaderEsports), BetTypeHeader);
    }

    public void clickResultsTab() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            takeScreenshot("try");
            click(waitForElement(elmntESportsSubTabs.get(4)));
        } else {
            waitForElement(elmntResultEsports);
            click(elmntResultEsports);
        }
    }

    public boolean verifyResultSelectorsEsports(DataTable tableResults) {
        List<String> resultChoiceOptions = tableResults.asList(String.class);
        System.out.println("entered execution");
        return compareList(waitForElements(elmntCategoriesResults), resultChoiceOptions);
    }

    public boolean verifyResultsMarketEsports() {

        waitForElement(elmntMarkeValuetResult);
        verifyElement(elmntMarkeValuetResult);
        return focusBackToDefaultFrame();

    }

    public boolean verifyDateSelectorResultsEsports() {
        waitForElement(elmntDateRangeSelector);
        return verifyElement(elmntDateRangeSelector);
    }

    public void clickDateSelectorResultsEsports() {
        waitForSeconds(4);
        click(waitForElement(elmntDateRangeSelector));
        click(waitForElement(elmntDateRangeSelector1));
    }

    public void clickLiveResultsEsports() {
        waitForSeconds(3);
        scrollToElement(elmntPrematchResults);
        click(elmntPrematchResults);
        click(waitForElement(elmntLiveResultsEsports));
    }

    public boolean verifyTeamNameResultsEsports() {
        waitForElement(txtTeamNameResultsEsports);
        System.out.println("TeamName>>>>>>>>" + txtTeamNameResultsEsports.getText());
        return verifyElement(txtTeamNameResultsEsports);

    }

    public void clickMarketValueResult() {
        waitForSeconds(3);
        click(waitForElement(elmntMarkeValuetResult));
    }

    public void clickSportsBettingEsportsTab() {
        waitForSeconds(5);
        click(waitForElement(elmntEsportsTab));
        focusFrame(elmntFrameESportsPage);
    }

    public void clickCategoriesOptionResults() {
        waitForSeconds(3);
        click(elmntAllCategoriesResults);
        click(waitForElement(elmntCategoriesOptionResults));
    }

    public void clickSubTabsEsports(String subTabsEsports) {
        {
            waitForElements(elmntsEsportsSubTabs);
            WebElement esportsSutTab = waitForElement(By.xpath(strHeaderTabLocator.replace("<<TABNAME>>", subTabsEsports)));
            waitForSeconds(2);
            click(esportsSutTab);
            System.out.println("Clicked tab====>" + esportsSutTab);


        }

    }

    public void choosingOddsEsports(String OddsTypes) {
        waitForSeconds(2);
        click(waitForElement(elmntOddsEsports));
        WebElement oddsTypeselector = waitForElement(By.xpath(strHeaderTabLocator.replace("<<TABNAME>>", OddsTypes)));
        click(oddsTypeselector);
        System.out.println("Clicked tab====>" + oddsTypeselector);

    }

    public void verifyOddTypesValue() {
        System.out.println("Odds Value>>>>>>>" + waitForElement(elmntUnder1x2HeaderEsportDesktop).getText());
        focusBackToDefaultFrame();
    }

    public void choosingTimeUnderEsports() {

        waitForSeconds(2);
        click(elmntTimeEsports);
        click(elmntTimeGstEsports);

    }

    public boolean choosingMultipleTeams() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            waitForElement(btnTeamFirst);
            System.out.println(getText(waitForElement(elmntEsportsBetSlipTeamCount)));
            if (Integer.valueOf(getText(waitForElement(elmntEsportsBetSlipTeamCount))) > 0) {
                click(waitForElement(elmntEsportsBetSlipTeamCount));
                verifyElement(waitForElement(elmntESportsBetSlip));
                click(btnDeleteAllBetSlip);
            }
            click(waitForElement(btnTeamFirst));
//            click(waitForElement(btnTeamSecond)); // Parlay bet not available
            waitForSeconds(2);
            if(verifyElement(elmntParlayError))
            {
                Reporter.addStepLog("Incompatible selection");
                return false;
            }
            return true;
        }
        else
        {
            if (verifyElement(btnDeleteAllBetSlip)) {
                click(btnDeleteAllBetSlip);
            }
            waitForSeconds(3);
            click(waitForElement(elmntUnder1x2HeaderEsportDesktop));
            return click(waitForElement(elmntUnderSecond1x2HeaderEsportDesktop));
        }

    }

    public boolean verifymultipleTeamNamesBetslip() {
        try {
            click(waitForElement(elmntMultipleTeamsError));
            Reporter.addStepLog("Multiple teams selection not allowed.");
            return false;
        } catch (Throwable e) {
            int totalTeamName = waitForElements(elmntTotalTeamNameInBetslip).size();
            if (totalTeamName > 1) {
                int i = totalTeamName;
                for (WebElement teamNames : elmntTotalTeamNameInBetslip)
                    System.out.println(teamNames.getText());
                i++;
                scrollToElement(elmntMyBetSlip);
                takeScreenshot("Totalteams");
                return true;
            }
            return false;
        }


    }

    public void closingTeamInBetSlip() {

        waitForSeconds(2);
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            click(waitForElement(elmntEsportsRightNavigator));
            waitForSeconds(1);
            click(waitForElement(elmntCloseIconInBetslip));
        }
        else {
            int total = elmntTotalTeamNameInBetslip.size();
            System.out.println(total);
            click(elmntCloseIconInBetslip);
            scrollToElement(elmntMyBetSlip);
            takeScreenshot("One Team Less");
        }
    }

    public void verifyDeletedTeams() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            waitForSeconds(2);
            jsClick(waitForElement(elmntEsportsBetSlipTeamCount));
            waitForSeconds(2);
            if(Integer.valueOf(getText(waitForElement(elmntEsportsBetSlipTeamCount))) == 0)
            {
                System.out.println("Deleted");
            }
            else {
                System.out.println("Not Deleted");
            }
        }
        else {
            int total1 = elmntTotalTeamNameInBetslip.size();
            System.out.println(total1);
        }
    }//todo

    public void clickDeleteall() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            click(waitForElement(elmntEsportsRightNavigator));
        }
        verifyElement(btnDeleteAllBetSlip);
        click(btnDeleteAllBetSlip);

    }

    public boolean verifyNoTeamsInBetSlip() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            waitForSeconds(1);
//            click(waitForElement(btnCloseRightNavigator));
            System.out.println(Integer.valueOf(getText(waitForElement(elmntEsportsBetSlipTeamCount))) == 0);
            System.out.println("here");
            return Integer.valueOf(getText(waitForElement(elmntEsportsBetSlipTeamCount))) == 0;
        }
        else {
            scrollToElement(elmntMyBetSlip);
            waitForElement(txtEmptyBetSlip);
            return verifyElement(txtEmptyBetSlip);
        }
    }

    public void clickOddChangeSetting() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            click(waitForElement(elmntEsportsRightNavigator));
        }
        click(waitForElement(elmntOddChangeSettingBetslip));

    }

    public void verifyOddChangeOptions(String strBetOddChangeOptions) {
        if (strBetOddChangeOptions.contains("Automatically accept all odds/prices changes")) {
            verifyElement(waitForElement(elmntOddChangeFirstOptionBetSlip));
            scrollToElement(elmntOddChangeFirstOptionBetSlip);
            click(waitForElement(elmntOddChangeFirstOptionBetSlip));
            takeScreenshot("oddsChanges");
            click(waitForElement(elmntOddChangeSettingBetslip));
        } else {
            verifyElement(waitForElement(elmntOddChangeSecondOptionBetSlip));
            scrollToElement(elmntOddChangeFirstOptionBetSlip);
            takeScreenshot("oddsChanges");
            click(waitForElement(elmntOddChangeSecondOptionBetSlip));
        }

    }


    public void clickingOnMyBets() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            click(waitForElement(elmntEsportsRightNavigator));
        }
        click(waitForElement(elmntMyBetSlip));
    }

    public boolean verifyMyBetsOptions(String strMyBetsOptions) {

        if (strMyBetsOptions.contains("Pending")) {
            return verifyElement(waitForElement(elmntPendingMyBets));
        } else {
            return verifyElement(waitForElement(elmntHistoryMyBets));

        }
    }

    public void clickPendingInMyBets() {

        click(waitForElement(elmntPendingMyBets));

    }

    public void clickHistoryInMyBets() {

        click(waitForElement(elmntHistoryMyBets));

    }

    public boolean verifyPendingBetsInMyBets() {
        boolean ticketIDInMyBets = verifyElement(waitForElement(txtTicketIdInMyBets));
        focusBackToDefaultFrame();
        return ticketIDInMyBets;

    }

    public boolean verifyBetTicketsInMyBets() {
        waitForSeconds(10);
        boolean ticketIDInBetMyBets = verifyElement(waitForElement(txtTicketIdInMyBets));
        focusBackToDefaultFrame();
        return ticketIDInBetMyBets;
    }

    public void enterTeamNameInSearchBox() {
        verifyElement(waitForElement(elmntTeamSearchTxtBox));
        enterValue(elmntTeamSearchTxtBox, "TEAM");

    }

    public void clickSearchIcon() {
        takeScreenshot("SearchIcon");
        click(waitForElement(iconTeamSearch));
    }

    public boolean verifyTeamNameWithSearchBox() {
        waitForSeconds(6);
        for (WebElement teamNamesAfterSearch : elmntTeamNameInSeachBox)
            if (waitForElement(teamNamesAfterSearch).getText().contains("Team")) {
                focusBackToDefaultFrame();
                return true;
            }
        return false;
    }

    public void clickBetMaxOption() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            click(waitForElement(elmntEsportsRightNavigator));
        }
        click(waitForElement(elmntBetMax));
    }


    public void clickStraightOptionInBetSlip() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            click(waitForElement(elmntEsportsRightNavigator));
        }
        click(waitForElement(elmntStraightOptionBetSlip));
    }

    public void enteringBetAmounts() {
        int noOfStakeField = txtStakeAmountsInBetSlip.size();
        for (int i = 1; i <= noOfStakeField; i++) {
            WebElement stakeAmountField = waitForElement(By.xpath("//div[@class='_1yL54']/following::input[@type='number'][" + i + "]"));
            enterValue(stakeAmountField, "2");
        }
    }


    public void clickingParlayOption() {
        click(waitForElement(elmntParlayOptionBetSlip));
    }

    public boolean verifyEnglishLanguage() {
        if (txtEsportsEarlyMarkets.getText().contains("Early Markets")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifySportsBettingNavTabs(DataTable strDatas) {
        List<String> lstData = strDatas.asList(String.class);

        boolean boolResults = false;
        for (int i = 0; i < lstData.size(); i++) {
            boolResults = lstData.get(i).equalsIgnoreCase(getTextBy(elmntESportsOptions.replace("<<OPTIONNAME>>", lstData.get(i))));
        }
        return boolResults;
    }

    public boolean verifyEsportsPage() {
        return verifyElement(waitForElement(elmntEsportsEarlyMarkets));
    }

    public boolean clickLeftNavigator() {
        return click(waitForElement(elmntEsportsLeftNavigator));
    }

    public boolean clickRightNavigator() {
        return click(waitForElement(elmntEsportsRightNavigator));
    }

    public boolean verifyOptionsUnderLeftNavigator(DataTable strDatas) {
        waitForSeconds(2);
        takeScreenshot("try");
        List<String> lstDatas = strDatas.asList(String.class);
        boolean boolResult = false;
        boolean boolResult0 = false;
        boolResult = compareList(waitForElements(elmntLeftNavigatorOptions), lstDatas.subList(0, 3));
        boolResult0 = verifyElement(waitForElement(elmntTeamSearchTxtBox));
        return boolResult && boolResult0;

    }

    public boolean verifyOptionsUnderRightNavigator() {
        return verifyElement(waitForElement(elmntMyBetSlip)) && verifyElement(waitForElement(elmntESportsBetSlip));
    }

    public boolean verifyEsportsTeamAddedToBetSlip() {
        waitForElement(btnTeamFirst);
        System.out.println(getText(waitForElement(elmntEsportsBetSlipTeamCount)));
        if (Integer.valueOf(getText(waitForElement(elmntEsportsBetSlipTeamCount))) > 0) {
            click(waitForElement(elmntEsportsBetSlipTeamCount));
            return verifyElement(waitForElement(elmntESportsBetSlip));
        }
        Reporter.addStepLog("Team not added");
        return false;
    }

    public boolean clickEsportsYourBetUnderLeftNavigator() {
        return click(waitForElement(elmntLeftNavigatorOptions.get(2)));
    }

    public boolean verifyEsportsBetHistoryInsideLeftNavigator() {
        return verifyElement(waitForElement(elmntBetHistoryInsideLeftNavigator));
    }

    public boolean clickBetHistoryInsideLeftNavigator() {
        return click(waitForElement(elmntBetHistoryInsideLeftNavigator));
    }

    public boolean verifyEsportsBetHistory() {
        return verifyElement(waitForElement(elmntPendingHistoryMobile)) && verifyElement(waitForElement(elmntBetHistoryMobile));
    }

    public boolean clickEsportsCountryInsideLeftNavigator() {
        return click(waitForElement(elmntLeftNavigatorOptions.get(1)));
    }

    public boolean verifyEsportsCountriesInsideLeftNavigator(DataTable strDatas) {
        List<String> lstDatas = strDatas.asList(String.class);
        boolean boolResult = false;
        for (int i = 0; i < lstDatas.size(); i++) {
            boolResult = getTextBy(elmntEsportsCountries.replace("<<COUNTRYNAME>>", lstDatas.get(i))).equalsIgnoreCase(lstDatas.get(i));
        }
        return boolResult;
    }

    public boolean clickEsportsChineseCountry(String strCountry) {
        return click(waitForElement(By.xpath(elmntEsportsCountries.replace("<<COUNTRYNAME>>", strCountry))));
    }

    public boolean verifyEsportsChinesePage() {
        return verifyElement(waitForElement(elmntEsportsChinesePage));
    }

    public boolean verifyEsportsEnglishPage() {
        return verifyElement(waitForElement(elmntEsportsEnglishPage));
    }

    public void verifyEsportsBetMaxValue() {
        waitForSeconds(2);
        Reporter.addStepLog("Stake value " + waitForElement(inpBetMaxValue).getAttribute("value"));
        if (waitForElement(inpBetMaxValue).getAttribute("value") != null) {
            System.out.println("Stake value " + waitForElement(inpBetMaxValue).getAttribute("value"));
        }
        else
        {
            Reporter.addStepLog("Bet Max not clicked");
        }
    }
}
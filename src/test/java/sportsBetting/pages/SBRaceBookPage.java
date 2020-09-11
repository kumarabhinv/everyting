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


public class SBRaceBookPage extends BasePage {

    public SBRaceBookPage(WebDriver driver) {
        super(driver);
    }

    protected String txtTicketNumber = null;

    protected String lnkRacebookTabs = new StringBuilder()
            .append("//li[contains(@id, 'tab')]/a[.='")
            .append("<<TABNAME>>")
            .append("']")
            .toString();

    protected String txtRacebookSubTabs = new StringBuilder()
            .append("(//span[contains(., '")
            .append("<<TABNAME>>")
            .append("')])[1]")
            .toString();

    @FindBy(how = How.XPATH, using = "//h1[contains(., 'The Racebook at SportsBetting')]")
    protected WebElement txtRacebookSubTabText;

    @FindBy(how = How.XPATH, using = "//iframe[@id='racebook']")
    protected WebElement elmntFrameRacebookPage;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'Maximize')]")
    protected WebElement elmntSearchCollapsed;

    @FindBy(how = How.XPATH, using = "(//input[@class='sInpSearchTrack'])[1]")
    protected WebElement elmntSearchBox;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'Search results')]/following::div[@class='sDvSearchState']")
    protected WebElement elmntSearchNoResult;

    protected String elmntSearchResult = "//div[contains(@id, 'dvMenu')]/a[contains(@style, 'table')]";

    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Advanced search')]")
    protected WebElement elmntAdvancedSearch;

    @FindBy(how = How.XPATH, using = "//div[@id='dvSearchMenuTab']/descendant::div/div[contains(text(), 'c')]")
    protected List<WebElement> elmntAdvancedSearchOptions;

    @FindBy(how = How.XPATH, using = "//div[@id='dvSearchMenuTab']/descendant::div/div[contains(text(), 'c')]")
    protected WebElement elmntAdvancedSearchOptionsVerify;

    @FindBy(how = How.XPATH, using = "//input[@name='inpSearchRunnerNameJockey']")
    protected WebElement elmntAdvancedSearchInput;

    protected String elmntAdvancedSearchResult = "//div[@class='sDvSearchResult']/descendant::a";

    @FindBy(how = How.XPATH, using = "//div[@id='dvNextSearch']")
    protected WebElement elmntPlusIcon;

    @FindBy(how = How.XPATH, using = "//div[@id='dvLastSearch']")
    protected WebElement elmntMinusIcon;

    @FindBy(how = How.XPATH, using = "//div[@id='dvSearchTabTrack']")
    protected WebElement elmntTrackOnAdvancedSearch;

    @FindBy(how = How.XPATH, using = "//div[@id='dvCloseAdvancedSearch']")
    protected WebElement elmntCloseAdvancedSearch;

    @FindAll({
            @FindBy(how = How.XPATH, using = "(//div[@class='sDvCarBetMenuMyAccount'])[1]"),
            @FindBy(how = How.XPATH, using = "//span[@id='ucBetSlip_lblBetSlipMyAccount']")
    })
            protected WebElement elmntMyAccountUnderRacebook;

    @FindBy(how = How.XPATH, using = "//div[@id='dvPopupMyAccount']/descendant::span[contains(text(), 't')]")
    protected List<WebElement> elmntMyAccountHoverList;

    @FindBy(how = How.XPATH, using = "//div[@class='sDvMyAccountReports']/descendant::div[contains(text(), 't')]")
    protected List<WebElement> elmntMyAccountList;

    @FindBy(how = How.XPATH, using = "//div[@id='dvPopupMyAccount']/descendant::span[contains(text(), 'View active bets')]")
    protected WebElement elmntActiveBets;

    @FindBy(how = How.XPATH, using = "//div[@id='dvPopupMyAccount']/descendant::span[contains(text(), 'View final bets')]")
    protected WebElement elmntFinalBets;

    @FindBy(how = How.XPATH, using = "//div[@id='dvPopupMyAccount']/descendant::span[contains(text(), 'View race result')]")
    protected WebElement elmntRaceResults;

    @FindBy(how = How.XPATH, using = "(//div[@class='labMenuHistory'][contains(., 'Active bets')])[2]")
    protected WebElement elmntActiveBetsVerify;

    @FindBy(how = How.XPATH, using = "(//div[@class='labMenuHistory'][contains(., 'Final bets')])[2]")
    protected WebElement elmntFinalBetsVerify;

    @FindBy(how = How.XPATH, using = "//span[.='Race results ']/following::div[@class='sDvVerticalPositionResult']")
    protected WebElement elmntRaceResultsVerify;

    @FindBy(how = How.XPATH, using = "//td[contains(@class, 'today')]")
    protected WebElement txtCurrentDate;

    @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='Prev']")
    protected WebElement lnkPreviousMonth;

    @FindBy(how = How.XPATH, using = "//td[normalize-space(.)='29']")
    protected WebElement lnkPreviousMonthDateSelector;

    @FindBy(how = How.XPATH, using = "//div[@id='dvElementSelected_resultOpion']")
    protected WebElement elmntDateSelector;

    @FindBy(how = How.XPATH, using = "//td[contains(@class, 'today')]/preceding::td[1]")
    protected WebElement selDatesRaceResults;

    @FindBy(how = How.XPATH, using = "//div[@id='dvMyAccount']/descendant::div[contains(text(), 'View')]")
    protected List<WebElement> elmntMyAccountTabs;

    @FindBy(how = How.XPATH, using = "(//span[.='Thoroughbred'])[1]/following::div[@class='sDvTracksColumnTrackName'][1]")
    protected WebElement elmntThoroughBredFirstTeam;

    @FindBy(how = How.XPATH, using = "(//td[contains(@class, 'Wi')]/input)[1]")
    protected WebElement elmntThoroughBredOdds;

    @FindBy(how = How.XPATH, using = "(//span[@class='sSpAddBetCart'])[2]/ancestor::a")
    protected WebElement lnkThoroughBredAddToBetSlip;

    @FindBy(how = How.XPATH, using = "(//span[@class='spCountBets'])[2]")
    protected WebElement elmntBetSlipWithOdds;

    @FindBy(how = How.XPATH, using = "//div/span[.='Remove all bets']")
    protected WebElement elmntRemoveAllBets;

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'ja')][.='Yes']")
    protected WebElement lnkYesOnPopUp;

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'ja')][.='No']")
    protected WebElement lnkNoOnPopUp;

    @FindBy(how = How.XPATH, using = "(//div/span[.='Submit all bets'])[1]")
    protected WebElement elmntSubmitBet;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(), 'success')])[1]")
    protected WebElement elmntSubmitMessage;

    @FindBy(how = How.XPATH, using = "//span[@class='ReadBackTicket']")
    protected WebElement elmntTicketNumber;

   @FindAll({
    @FindBy(how = How.XPATH, using = "//span[@class='SectionHeaderLevel2']") ,
    @FindBy(how = How.XPATH, using = "(//span[@class='ReadBackTicket'])[1]")})
    protected WebElement elmntNewWindowTicketNumber;

    @FindBy(how = How.XPATH, using = "//div[contains(@id, 'dvBetSlipBetDeleteIndex')]")
    protected WebElement elmntCloseUnderBetSlip;

    @FindBy(how = How.XPATH, using = "(//div[@class='sDvTracksUpcomingFeaturedTrackName'])[1]")
    protected WebElement elmntUpcomingRaces;

    @FindBy(how = How.XPATH, using = "(//*[contains(@class, 'sTdBtnMinimize') and contains(@id, 'THB')])[1]")
    protected WebElement elmntMinusIconThoroughbred;

    @FindBy(how = How.XPATH, using = "(//*[contains(@class, 'sTdBtnMaximize') and contains(@id, 'THB')])[1]")
    protected WebElement elmntMaximizeIconThoroughbred;

    @FindBy(how = How.XPATH, using = "//span[.='Races']/following::td[.='1' and contains(@class, 'Clicked')]")
    protected WebElement elmntRacesUnderThoroughbred;

    @FindBy(how = How.XPATH, using = "//div/span[.='Show race details']")
    protected WebElement elmntShowRaceDetailsIcon;

    @FindBy(how = How.XPATH, using = "//div[@class='sTdMainRaceInfomation']")
    protected WebElement elmntRacesDetailsExpanded;

    @FindBy(how = How.XPATH, using = "//div/label[.='Straight']")
    protected WebElement elmntStraightUnderThoroughbred;

    @FindBy(how = How.XPATH, using = "//a[contains(., 'check')]")
    protected WebElement lnkTheRacebookAtSportsBetting;

    protected String elmntOriginalTabs = new StringBuilder()
            .append("(//tr[contains(@class, 'Header')]/descendant::td)[")
            .append("<<num>>")
            .append("]").toString();

    @FindBy(how = How.XPATH, using = "//a[.='Sports News']")
    protected WebElement lnkSportsNews;

    @FindBy(how = How.XPATH, using = "//div[@class='vNavigation']/descendant::a")
    protected List<WebElement> lnkTabsRacebookInfo;

    @FindBy(how = How.XPATH, using = "//a[.='Racebook Info']")
    protected WebElement lnkRacebookInfo;

    protected String lnkTabRacebookInfo = new StringBuilder()
            .append("(//div[@class='vNavigation']/descendant::a[.='")
            .append("<<TABNAME>>")
            .append("'])[1]").toString();

    @FindBy(how = How.XPATH, using = "//h1[.='HOW TO BET HORSES']")
    protected WebElement txtHowToBetHorses;

    @FindBy(how = How.XPATH, using = "//h1[.='TRACK LIMITS']")
    protected WebElement txtTrackLimits;

    @FindBy(how = How.XPATH, using = "//h1[.='PAYOFF ODDS']")
    protected WebElement txtPayOffOdds;

    @FindBy(how = How.XPATH, using = "//h1[.='RACEBOOK RULES']")
    protected WebElement txtRacebookRules;

    @FindBy(how = How.XPATH, using = "//h1[.='SPORTSBETTING HELP']")
    protected WebElement txtRacebookFaqs;

    @FindBy(how = How.XPATH, using = "//a[.='Promotions']")
    protected WebElement lnkPromotions;

    @FindBy(how = How.XPATH, using = "//div[@class='row minmargin']/descendant::a[1]")
    protected WebElement lnkTermsAndConditions;

    @FindBy(how = How.XPATH, using = "//div[@class='row minmargin']/descendant::a[2]")
    protected WebElement lnkDepositNow;

    @FindBy(how = How.XPATH, using = "//div[@class='row minmargin']/descendant::a[2]")
    protected WebElement lnkVerifyTermsAndConditions;

    @FindBy(how = How.ID, using = "quickcashierFrame")
    protected WebElement elmntQuickCashierFrameUnderPromotionsTab;

    @FindBy(how = How.XPATH, using = "//h2[@class='simple-stepheading']")
    protected WebElement txtCashierPage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'No matches found')]")
    protected WebElement elmntNoResultFound;

    @FindBy(how = How.XPATH, using = "//div[@id='dvTblBetSplipCartMobile']")
    protected WebElement elmntRacebookBetSlip;

    @FindBy(how = How.XPATH, using = "//div[@class='sDvMyAccountReports']/descendant::div[contains(text(), 'View active bets')]")
    protected WebElement elmntActiveBetsMobile;

    @FindBy(how = How.XPATH, using = "//div[@class='sDvMyAccountReports']/descendant::div[contains(text(), 'View final bets')]")
    protected WebElement elmntFinalBetsMobile;

    @FindBy(how = How.XPATH, using = "//div[@class='sDvMyAccountReports']/descendant::div[contains(text(), 'View race result')]")
    protected WebElement elmntRaceResultsMobile;

    @FindBy(how = How.XPATH, using = "//a/div[.='Race 1']")
    protected WebElement elmntThoroughBredRace;

    @FindBy(how = How.XPATH, using = "(//span[@class='spCountBets'])[1]")
    protected WebElement elmntBetSlipWithOddsMobile;

    @FindBy(how = How.XPATH, using = "(//div/span[.='Submit all bets'])[2]")
    protected WebElement elmntSubmitBetMobile;

    @FindBy(how = How.XPATH, using = "//div[@id='dvMenuContentListTT_UPCC_UPC']/descendant::a[1]")
    protected WebElement elmntUpcomingRacesMobile;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, 'Selected')][contains(.,'Race 1')])[1]")
    protected WebElement selRacesUnderThoroughbredMobile;

    @FindBy(how = How.XPATH, using = "//div[contains(@id, 'Streaming')]/descendant::span")
    protected WebElement elmntStreamingVideo;

    @FindBy(how = How.XPATH, using = "//a[@id='aCallSendBetTopMobile']")
    protected WebElement lnkThoroughBredAddToBetSlipMobile;

    @FindBy(how = How.XPATH, using = "//div[@id='dvBetSlipButtonCloseMobile']")
    protected WebElement elmntCloseMyAccountVisibility;

    @FindBy(how = How.XPATH, using = "(//*[contains(@class, 'sTdBtnMinimize') and contains(@id, 'UPCC')])[1]")
    protected WebElement elmntMinusUnderUpcoming;


    public void clickRacebookSubTab(String depositTab) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            focusFrame(elmntFrameRacebookPage);
        } else {
            if (depositTab.equalsIgnoreCase("Racebook")) {
                focusFrame(elmntFrameRacebookPage);
            } else if (depositTab.equalsIgnoreCase("Racebook Info")) {
                click(waitForElement(lnkRacebookInfo));
            } else if (depositTab.equalsIgnoreCase("Promotions")) {
                click(waitForElement(lnkPromotions));
            } else {
                System.out.println("try");
            }
        }
    }

    public boolean verifyRacebookTabs(String strTabs) {
        WebElement strTab = waitForElement(By.xpath(lnkRacebookTabs.replace("<<TABNAME>>", strTabs)));
        return verifyElement(waitForElement(strTab));
    }

    public boolean clickRacebookTab(String strTabs) {
        WebElement strTab = waitForElement(By.xpath(lnkRacebookTabs.replace("<<TABNAME>>", strTabs)));
        return click(waitForElement(strTab));
    }

    public boolean verifyTabsList(String strTabs) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            if (strTabs.equalsIgnoreCase("Bet Slip")) {
                return verifyElement(waitForElement(elmntRacebookBetSlip));
            } else if (strTabs.equalsIgnoreCase("My Account")) {
                return verifyElement(waitForElement(elmntMyAccountUnderRacebook));
            }
        }
        if (strTabs.equalsIgnoreCase("Upcoming Races")) {
            waitForSeconds(2);
            if (verifyElement(By.xpath(txtRacebookSubTabs.replace("<<TABNAME>>", strTabs)))) {
                return true;
            } else {
                System.out.println("Upcoming Races Not Available");
                return true;
            }
        } else {
            return verifyElement(waitForElement(By.xpath(txtRacebookSubTabs.replace("<<TABNAME>>", strTabs))));
        }
    }

    public boolean verifySearchBoxExpanded() {
        focusFrame(elmntFrameRacebookPage);
        if (verifyElement(elmntSearchCollapsed)) {
            click(elmntSearchCollapsed);
        }
        takeScreenshot("try");
        return verifyElement(waitForElement(elmntSearchBox));
    }

    public void enterTextSearch() {
        if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            jsScrollDown();
        }
        enterValue(waitForElement(elmntSearchBox), "Lov");
    }

    public boolean verifySearchResult() {
        takeScreenshot("try1");
        try {
            numberOfElementsToBeMoreThan(By.xpath(elmntSearchResult), 0);
            return true;
        } catch (Throwable tE) {
            Reporter.addStepLog("No Result Found");
            return verifyElement(waitForElement(elmntSearchNoResult));
        }
    }

    public boolean clickAdvancedSearch() {
        return click(waitForElement(elmntAdvancedSearch));
    }

    public boolean verifyAdvancedSearchOptions(DataTable strTabs) {
        jsScrollDown();
        List<String> strTab = strTabs.asList(String.class);
        takeScreenshot("try2");
        return compareList(waitForElements(elmntAdvancedSearchOptions), strTab);
    }

    public boolean verifyAdvancedSearch() {
        takeScreenshot("try2");
        return verifyElement(waitForElement(elmntAdvancedSearchOptionsVerify));
    }

    public boolean enterRunnerOrJockeyName() {
        enterValue(waitForElement(elmntAdvancedSearchInput), "har");
        return true;
    }

    public boolean verifyAdvancedSearchResult() {
        waitForSeconds(1);
        if (verifyElement(By.xpath(elmntAdvancedSearchResult))) {
            numberOfElementsToBeMoreThan(By.xpath(elmntAdvancedSearchResult), -1);
            Reporter.addStepLog("Runner or Jockey count more than one");
            return true;
        } else {
            Reporter.addStepLog("Runner or Jockey count zero");
            return verifyElement(waitForElement(elmntNoResultFound));
        }
    }

    public boolean clickAdvancedSearchPlusIcon() {
        focusBackToDefaultFrame();
        jsScrollDownByCord(200);
        focusFrame(elmntFrameRacebookPage);
        try {
            numberOfElementsToBeMoreThan(By.xpath(elmntAdvancedSearchResult), 4);
            return click(waitForElement(elmntPlusIcon));
        } catch (Exception e) {
            System.out.println("1 of 1");
            return true;
        }
    }

    public boolean clickAdvancedSearchMinusIcon() {
        try {
            waitForSeconds(2);
            numberOfElementsToBeMoreThan(By.xpath(elmntAdvancedSearchResult), 1);
            return click(waitForElement(elmntMinusIcon));
        } catch (Exception e) {
            System.out.println("1 of 1");
            return true;
        }
    }

    public boolean clickTrackOnAdvancedSearch() {
        return click(waitForElement(elmntTrackOnAdvancedSearch));
    }

    public boolean clickCloseOnAdvanced() {
        return click(waitForElement(elmntCloseAdvancedSearch));
    }

    public boolean verifyRacebookSubTab() {
        return verifyElement(waitForElement(elmntSearchBox));
    }

    public void mouseOverMyAccount() {
        jsScrollDown();
        focusFrame(elmntFrameRacebookPage);
        mouseOver(waitForElement(elmntMyAccountUnderRacebook));
    }

    public boolean verifyMouseOveredItems(DataTable strTabs) {
        waitForSeconds(2);
        List<String> strMyAccountItems = strTabs.asList(String.class);
        List<String> lstElements = new ArrayList<String>();
        elmntMyAccountHoverList.forEach(eleItem -> lstElements.add(getText(eleItem).trim()));
        lstElements.remove(3);
        return lstElements.equals(strMyAccountItems);
    }

    public boolean clickViewActiveBets() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile"))
         {
            waitForSeconds(2);
            return click(waitForElement(elmntActiveBetsMobile));
        }
        else {
            waitForSeconds(2);
            takeScreenshot("Active Bets");
            return click(waitForElement(elmntActiveBets));

        }
    }

    public void verifyActiveBets() {
        takeScreenshot("Active bets");
        focusWindow(2);
        takeScreenshot("Active bets");
        verifyElement(waitForElement(elmntActiveBetsVerify));
        driver.close();
        focusWindow(1);
    }

    public boolean clickViewFinalBets() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            return click(waitForElement(elmntFinalBetsMobile));
        }
        return click(waitForElement(elmntFinalBets));
    }

    public void verifyFinalBets() {
        focusWindow(2);
        verifyElement(waitForElement(elmntFinalBetsVerify));
        driver.close();
        focusWindow(1);
    }

    public boolean clickViewRaceResults() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            return click(waitForElement(elmntRaceResultsMobile));
        }
        return click(waitForElement(elmntRaceResults));
    }

    public void verifyResults() {
        verifyElement(waitForElement(elmntRaceResultsVerify));
    }

    public boolean selectDateRaceResults() {
        click(waitForElement(elmntDateSelector));
        if (getText(txtCurrentDate).equals("1")) {
            click(waitForElement(lnkPreviousMonth));
            return click(waitForElement(lnkPreviousMonthDateSelector));
        }
        return click(waitForElement(selDatesRaceResults));
    }

    public void clickMyAccountView() {
        focusFrame(elmntFrameRacebookPage);
        waitForSeconds(2);
        click(waitForElement(elmntMyAccountUnderRacebook));
        click(waitForElement(elmntCloseMyAccountVisibility));
        takeScreenshot("try");
        waitForSeconds(2);
         click(waitForElement(elmntMyAccountUnderRacebook));
    }

    public boolean verifyClickedMyAccountTabs(DataTable strTabs) {
        List<String> strTabsMyAccount = strTabs.asList(String.class);
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            takeScreenshot("try");
            waitForSeconds(2);
            return compareList(elmntMyAccountList.subList(0, 3), strTabsMyAccount);
        }
        return compareList(elmntMyAccountTabs.subList(1, 4), strTabsMyAccount);
    }

    public boolean clickRunnerOrJockeyOdds() {
        focusFrame(waitForElement(elmntFrameRacebookPage));
        click(waitForElement(elmntThoroughBredFirstTeam));
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            waitForSeconds(2);
            try {
                click(waitForElement(elmntThoroughBredRace));
                takeScreenshot("try");
            } catch (Throwable e) {
                Reporter.addStepLog("Race with numbers not available");
            }
            takeScreenshot("try");
            verifyElement(waitForElement(selRacesUnderThoroughbredMobile));
        }
        enterValue(waitForElement(elmntThoroughBredOdds), "5");
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            takeScreenshot("try");
            return click(waitForElement(lnkThoroughBredAddToBetSlipMobile));
        }
        return click(waitForElement(lnkThoroughBredAddToBetSlip));
    }

    public boolean verifyAddedOddsToBetSlip() {
        waitForSeconds(2);
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            if (Integer.valueOf(getText(elmntBetSlipWithOddsMobile)) > 0) {
                takeScreenshot("try");
                Reporter.addStepLog("Odds added");
                return true;
            }
        } else {
            if (Integer.valueOf(getText(elmntBetSlipWithOdds)) > 0) {
                Reporter.addStepLog("Odds added");
                return true;
            }
        }
        Reporter.addStepLog("Odds not added");
        return false;
    }

    public boolean clickRemoveAllBetsBet() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            click(waitForElement(elmntRacebookBetSlip));
            takeScreenshot("try");
        }
        return click(waitForElement(elmntRemoveAllBets));
    }

    public boolean clickYesOnPopUp() {
        return click(waitForElement(lnkYesOnPopUp));
    }

    public boolean verifyDeletedBetsOnBetSlip() {
        if (Integer.valueOf(getText(elmntBetSlipWithOdds)) == 0) {
            return true;
        }
        return false;
    }

    public boolean clickNoOnPopUp() {
        return click(waitForElement(lnkNoOnPopUp));
    }

    public boolean clickSubmitBet() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            takeScreenshot("try");
            return click(waitForElement(elmntSubmitBetMobile));
        }
        return click(waitForElement(elmntSubmitBet));
    }

    public boolean verifySubmitMessage() {
        txtTicketNumber = getText(waitForElement(elmntTicketNumber));
        takeScreenshot("try");
        return verifyElement(waitForElement(elmntSubmitMessage));
    }

    public boolean verifyTicketNumberOnNewWindow() {
        if (getText(waitForElement(elmntNewWindowTicketNumber)).equals(txtTicketNumber)) {
            takeScreenshot("try");
            driver.close();
            focusWindow(1);
            return true;
        }

        driver.close();
        focusWindow(1);
        return false;
    }

    public boolean hoverMyAccount() {
     //   mouseOver(waitForElement(elmntMyAccountUnderRacebook));
        return click(elmntActiveBets);
    }

    public void verifyActiveBetsAndVerifyTicket() {
        waitForSeconds(2);
        focusWindow(2);
        verifyElement(waitForElement(elmntActiveBetsVerify));
        takeScreenshot("try");
    }

    public boolean clickCloseUnderBetSlip() {
        return click(waitForElement(elmntCloseUnderBetSlip));
    }

    public boolean verifyGamesUnderUpcomingRaces() {
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
                takeScreenshot("try");
                return verifyElement(waitForElement(elmntUpcomingRacesMobile));
            }
            return verifyElement(waitForElement(elmntUpcomingRaces));
        } catch (Throwable e) {
            Reporter.addStepLog("Upcoming Races not available");
            return true;
        }
    }

    public boolean clickUpcomingRace() {
        try {
            //        focusFrame(elmntFrameRacebookPage);
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
                click(waitForElement(elmntUpcomingRacesMobile));
                takeScreenshot("try");
            } else {
                click(waitForElement(elmntUpcomingRaces));
            }
            enterValue(waitForElement(elmntThoroughBredOdds), "5");
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
                takeScreenshot("try");
                return click(waitForElement(lnkThoroughBredAddToBetSlipMobile));
            }
            return click(waitForElement(lnkThoroughBredAddToBetSlip));
        } catch (Throwable e) {
            Reporter.addStepLog("Upcoming Races not available");
            return true;
        }
    }

    public boolean verifyThoroughbreds() {
        focusFrame(elmntFrameRacebookPage);
        takeScreenshot("try");
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            click(waitForElement(elmntMinusUnderUpcoming));
        }
        return verifyElement(waitForElement(elmntThoroughBredFirstTeam));
    }

    public boolean clickMinusUnderThoroughbred() {
        return click(waitForElement(elmntMinusIconThoroughbred));
    }

    public boolean verifyMaximizeUnderThoroughbred() {
        verifyElement(waitForElement(elmntMaximizeIconThoroughbred));
        return waitForInvisibilityOfElement(elmntThoroughBredFirstTeam);
    }

    public boolean verifyMaximizeIconUnderThoroughbred() {
        return verifyElement(waitForElement(elmntMaximizeIconThoroughbred));
    }

    public boolean clickMaximizeUnderThproughbred() {
        return click(waitForElement(elmntMaximizeIconThoroughbred));
    }

    public boolean verifyFirstTeamUnderThoroughbred() {
        return verifyElement(waitForElement(elmntThoroughBredFirstTeam));
    }

    public boolean verifyThoroughbredTeams() {
        return verifyElement(waitForElement(elmntThoroughBredFirstTeam));
    }

    public boolean clickFirstRacerOrJockeyUnderThoroughbred() {
        return click(waitForElement(elmntThoroughBredFirstTeam));
    }

    public boolean verifyRacesUnderUpcomingRaces() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            waitForSeconds(2);
            try {
                    click(waitForElement(elmntThoroughBredRace));
                    takeScreenshot("try");
            } catch (Throwable e) {
                Reporter.addStepLog("Race with numbers not available");
            }
            takeScreenshot("try");
            return verifyElement(waitForElement(selRacesUnderThoroughbredMobile));
        }
        return verifyElement(waitForElement(elmntRacesUnderThoroughbred));
    }

    public boolean verifyShowRaceDetails() {
        return verifyElement(waitForElement(elmntShowRaceDetailsIcon));
    }

    public boolean verifyButtonBetSlip() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            takeScreenshot("try");
            return verifyElement(waitForElement(lnkThoroughBredAddToBetSlipMobile));
        }
        return verifyElement(waitForElement(lnkThoroughBredAddToBetSlip));
    }

    public boolean clickRacesDetails() {
        return click(waitForElement(elmntShowRaceDetailsIcon));
    }

    public boolean verifyShowRaceDetailsExpanded() {
        return verifyElement(waitForElement(elmntRacesDetailsExpanded));
    }

    public boolean verifyStraight() {
        return verifyElement(waitForElement(elmntStraightUnderThoroughbred));
    }

    public boolean verifyWinPlaceShow(DataTable strTabs) {
        List<String> strListTabs = strTabs.asList(String.class);
        boolean booleanResult = false;

        for (int i = 1; i < 4; i++) {
            booleanResult = strListTabs.get(i - 1).equalsIgnoreCase(getTextBy(elmntOriginalTabs.replace("<<num>>", String.valueOf(i))));
        }
        return booleanResult;

    }

    public boolean verifyWinPlace(DataTable strTabs) {
        List<String> strListTabs = strTabs.asList(String.class);
        boolean booleanResult = false;

        for (int i = 1; i < 3; i++) {
            booleanResult = strListTabs.get(i - 1).equalsIgnoreCase(getTextBy(elmntOriginalTabs.replace("<<num>>", String.valueOf(i))));
        }
        return booleanResult;

    }

    public void enterWin() {
        enterValue(waitForElement(elmntThoroughBredOdds), "5");
    }

    public boolean clickAddToBet() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            takeScreenshot("try");
            return click(waitForElement(lnkThoroughBredAddToBetSlipMobile));
        }
        return click(waitForElement(lnkThoroughBredAddToBetSlip));
    }

    public void moveToContent() {
        jsScroll();
    }

    public boolean verifyContents(String strHeader) {
        return verifyElement(waitForElement(lnkTheRacebookAtSportsBetting));
    }

    public boolean verifyContentsTheRacebookAtSportsBetting() {
        return verifyElement(waitForElement(lnkTheRacebookAtSportsBetting));
    }

    public boolean clickContentsTheRacebookAtSportsBetting() {
        waitForElementClickable(lnkTheRacebookAtSportsBetting);
        return click(waitForElement(lnkTheRacebookAtSportsBetting));
    }

    public boolean verifySportsNews() {
        waitForVisibilityOfElement(lnkSportsNews);
        return verifyElement(waitForElement(lnkSportsNews));
    }

    public boolean verifySubTabsUnderRacebookInfo(DataTable strTabs) {
        List<String> strTabsLocal = strTabs.asList(String.class);
        List<String> lstElements = new ArrayList<String>();
        waitForElements(lnkTabsRacebookInfo).forEach(eleItem -> lstElements.add(getText(eleItem)));
        lstElements.remove(0);
        return lstElements.equals(strTabsLocal);
    }

    public boolean clickRacebookInfoTabs(String strTabs) {
        WebElement strTab = waitForElement(By.xpath(lnkTabRacebookInfo.replace("<<TABNAME>>", strTabs)));
        return click(waitForElement(strTab));
    }

    public boolean verifyRacebookInfoTabs(String strTabs) {
        if (strTabs.equalsIgnoreCase("How to Bet Horses")) {
            return verifyElement(waitForElement(txtHowToBetHorses));
        } else if (strTabs.equalsIgnoreCase("Track Limits")) {
            return verifyElement(waitForElement(txtTrackLimits));
        } else if (strTabs.equalsIgnoreCase("Payoff Odds")) {
            return verifyElement(waitForElement(txtPayOffOdds));
        } else if (strTabs.equalsIgnoreCase("Racebook Rules")) {
            return verifyElement(waitForElement(txtRacebookRules));
        } else if (strTabs.equalsIgnoreCase("Wagering Types")) {
            return verifyElement(waitForElement(txtHowToBetHorses));
        } else if (strTabs.equalsIgnoreCase("Wagering Terms")) {
            return verifyElement(waitForElement(txtHowToBetHorses));
        } else if (strTabs.equalsIgnoreCase("Racebook FAQs")) {
            return verifyElement(waitForElement(txtRacebookFaqs));
        } else {
            return false;
        }
    }

    public boolean verifyPromotionsLink() {
        return verifyElement(waitForElement(lnkTermsAndConditions)) && verifyElement(waitForElement(lnkDepositNow));
    }

    public boolean clickTermsAndConditions() {
        return click(waitForElement(lnkTermsAndConditions));
    }

    public boolean verifyTermsAndConditions() {
        return verifyElement(waitForElement(lnkVerifyTermsAndConditions));
    }

    public boolean clickDepositNow() {
        return click(waitForElement(lnkDepositNow));
    }

    public boolean verifyDepositNow() {
        focusFrame(elmntQuickCashierFrameUnderPromotionsTab);
        takeScreenshot("try");
        return verifyElement(waitForElement(txtCashierPage));
    }

    public boolean verifyRacebookStreamingVideoUnderThoroughbed() {
        takeScreenshot("try");
        return verifyElement(waitForElement(elmntStreamingVideo));
    }

    public boolean clickMyAccountViewWithoutFrame() {
        click(waitForElement(elmntMyAccountUnderRacebook));
        takeScreenshot("try");
        click(waitForElement(elmntCloseMyAccountVisibility));
        takeScreenshot("try");
        return click(waitForElement(elmntMyAccountUnderRacebook));
    }
}
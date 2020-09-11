package sportsBetting.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SBPromotionsPage extends BasePage {

    public SBPromotionsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//ul[@class='nav landing__nav-tabs']/li")
    protected List<WebElement> elmntPromotionTabs;

    @FindBy(how = How.XPATH, using = "//li/a[.='Deposit']")
    protected WebElement elmntDepositInPromotions;

    @FindBy(how = How.XPATH, using = "//li/a[.='Promotions']")
    protected WebElement elmntPromotionsTab;

    @FindBy(how = How.XPATH, using = "//li/a[.='Deposit']//following::a[.='Deposit Now'][1]")
    protected WebElement btnDepositDepositInPromotions;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='Sports']/following::a[.='Deposit Now'][6]"),
            @FindBy(how = How.XPATH, using = "(//h3[.='$25 RISK-FREE PLAYER PROPS BET']/following::a[.='Deposit Now'])[1]")
    })
            protected WebElement btnDepositInPromotionsSports;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='Sports']/following::a[.='Deposit Now'][9]"),
            @FindBy(how = How.XPATH, using = "//h3[.='$25 Horse Free Play']/following::a[.='Deposit Now'][1]")
    })
            protected WebElement btnDepositInPromotionsRacebook;

    @FindAll({
    @FindBy(how = How.XPATH, using = "//a[.='Sports']/following::a[.='Deposit Now'][11]"),
    @FindBy(how = How.XPATH, using = "(//h3[.='$15,000 BTC Deposit Leaderboard']/following::a[.='Deposit Now'])[1]")
    })
            protected WebElement btnDepositInPromotionsCasino;


    @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[normalize-space(.)='Terms & Conditions'][4]")
    protected WebElement elmntTermsAndConditionsInPromotions;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[normalize-space(.)='Terms & Conditions'][10]"),
            @FindBy(how = How.XPATH, using = "(//h3[.='$25 Horse Free Play']/following::a[normalize-space(.)='Terms & Conditions'])[1]")
    })
            protected WebElement elmntTermsAndConditionsInPromotionsRacebook;


    @FindAll({
    @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[normalize-space(.)='Terms & Conditions'][7]"),
    @FindBy(how = How.XPATH, using = "(//h3[.='$25 RISK-FREE PLAYER PROPS BET']/following::a[normalize-space(.)='Terms & Conditions'])[1]")
    })
            protected WebElement elmntTermsAndConditionsInPromotionsSports;

            @FindAll({
    @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[normalize-space(.)='Terms & Conditions'][12]"),
    @FindBy(how = How.XPATH, using = "(//h3[.='$15,000 BTC Deposit Leaderboard']//following::a[normalize-space(.)='Terms & Conditions'])[1]")
            })
                    protected WebElement elmntTermsAndConditionsInPromotionsCasino;

    @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[.='Play Now'][1]")
    protected WebElement btnPlayNowInPromotions;

    @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[.='Opt-In Now'][3]")
    protected WebElement btnOptInNowInPromotionsCasino;

    @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[.='Opt-In Now'][4]")
    protected WebElement btnOptInNowInPromotionsPoker;

    @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[.='Opt-In Now'][1]")
    protected WebElement btnOptInNowInPromotionsDeposit;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[@class='landing__item-btn btn btn-play' and .='Learn More'][3]"),
            @FindBy(how = How.XPATH, using = "(//h3[.='$40,000 Weekly Cash Race Leaderboard']//following::a[.='Learn More'])[1]")
    })
            protected WebElement btnLearnMoreInPromotionsPoker;

    @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[@class='landing__item-btn btn btn-play' and .='Learn More'][1]")
    protected WebElement btnLearnMoreInPromotionsSports;

    @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[@class='landing__item-btn btn btn-play' and .='Play Now'][4]")
    protected WebElement btnPlayNowInPromotionsPoker;

    @FindBy(how = How.XPATH, using = "//input[@value='OPT-IN NOW']")
    protected WebElement btnOptInNowInOptPgae;

    @FindBy(how = How.XPATH, using = "//input[@name='user_data']")
    protected WebElement txtBoxOptInNowInOptPgae;

    @FindBy(how = How.XPATH, using = "//div/p[normalize-space(.)='Congratulations, You have been registered.']")
    protected WebElement txtSuccessMessageInOptPgae;


    //cashier*
    @FindAll({
            @FindBy(how = How.XPATH, using = "//iframe[@id='cashierFrame']"),
            @FindBy(how = How.XPATH, using = "//iframe[@id='iframeCashier']")

    })
    protected WebElement elmntCashierIFrame;


    @FindBy(how = How.ID, using = "showDepositMethods")
    protected WebElement lnkViewMoreOptions;

    //*cashier

    @FindBy(how = How.XPATH, using = "(//h4[.='Terms and Conditions'])[4]/following::a[1]")
    protected WebElement elmntGeneralRules;

    @FindBy(how = How.XPATH, using = "//*[@class='nav landing__nav-tabs']/following::h4[@class='modal-title'][1]/following::div[@class='modal-body'][3]")
    protected WebElement elmntTermsAndConditionsPopup;

    @FindBy(how = How.XPATH, using = "//div[@id='modal-25-bonus-for-life']//button[.='Close']")
    protected WebElement closeIconInTermsAndConditionPopUp;

    //    casino*
    @FindBy(how = How.XPATH, using = "//div[@class='sub-menu-slice']//ul")
    protected WebElement elmntCasinoTabs;

    //*casino

    //    contest*
    @FindBy(how = How.XPATH, using = "//nav[@class='lobby__menu']")
    protected WebElement elmntContestoptions;

    //*contest

    //    Poker*
    @FindBy(how = How.XPATH, using = "//dv[@class='tabs']")
    protected WebElement elmntPokerpage;

    //*Poker

    //    REFER A FRIEND*
    @FindBy(how = How.ID, using = "refer_3col")
    protected WebElement elmntReferFriendTable;

    //*REFER A FRIEND


    @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[.='Refer Now'][2]")
    protected WebElement btnReferNow;

    @FindBy(how = How.XPATH, using = "//table[@class='popup-opcrm-table']")
    protected WebElement promotionBetPopup;

    @FindBy(how = How.ID, using = "checkModalPopup")
    protected WebElement btnRadiopromotionBetPopup;

    @FindBy(how = How.XPATH, using = "//span[@class='popup-opcrm-close']/button")
    protected WebElement btnClosepromotionBetPopup;

    @FindBy(how = How.XPATH, using = "//*[@id=\"contests\"]/div[3]/div[1]/div/div/a[1]")
    protected WebElement btnClosedpromotionContest;

    @FindBy(how = How.XPATH, using = "//ul[@class='nav landing__nav-tabs']//li/a[.='Casino']")
    protected WebElement elmntPromotionCasino;

    @FindBy(how = How.XPATH, using = "//ul[@class='nav landing__nav-tabs']//li/a[.='Poker']")
    protected WebElement elmntPromotionPoker;

    @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[@class='landing__item-btn btn btn-play' and .='Deposit Now'][6]")
    protected WebElement btnDepositNowPromotionSports;

    @FindBy(how = How.XPATH, using = "//ul[@class='ulmenu']/following::a[@class='landing__item-btn btn btn-play' and .='Deposit Now'][8]")
    protected WebElement btnDepositNowPromotionRacebook;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[.='PLAY NOW' or .='Play Now'][1]"),
            @FindBy(how = How.XPATH, using = "//a[.='BET ON ESPORTS'][1]"),
            @FindBy(how = How.XPATH, using = "//a[.='PLAY NOW' or .='BET NOW'][1]")

            })
    protected WebElement btnPlayNowInPokerLearnMorePage;
//Poker*
    @FindBy(how = How.XPATH, using = "//div[@class='tabs']")
    protected WebElement elmntTabsPokerPage;
    //*Poker


    protected String strHeaderTabLocator1 = new StringBuilder()
            .append("//li/a[normalize-space(.)='")
            .append("<<TABNAME>>")
            .append("' or .='").append("<<CAPS>>").append("']").toString();


    public boolean verifyPromotionsPage(DataTable tableTabs) {
        List<String> resultChoiceOptions = tableTabs.asList(String.class);
        System.out.println("entered execution");
        return compareList(waitForElements(elmntPromotionTabs), resultChoiceOptions);
    }

    public boolean verifyPromotions() {
        return verifyElement(waitForElement(elmntDepositInPromotions));
    }

    public void clickPromotionTabsNavigation(String strTabsPromotions) {
        WebElement promotionTabs = waitForElement(By.xpath(strHeaderTabLocator1.replace("<<CAPS>>", startsWithCapitalize(strTabsPromotions)).replace("<<TABNAME>>", strTabsPromotions)));
        waitForSeconds(2);
        click(promotionTabs);
        System.out.println("Clicked tab====>" + strTabsPromotions);
    }

    public boolean verifyDepositPagePromotions() {
        verifyElement(waitForElement(btnDepositDepositInPromotions));
        return verifyElement(waitForElement(elmntTermsAndConditionsInPromotions));

    }

    public boolean verifySportsPagePromotions() {
        verifyElement(waitForElement(btnDepositInPromotionsSports));
        return verifyElement(waitForElement(elmntTermsAndConditionsInPromotionsSports));

    }

    public boolean verifyRacebookPagePromotions() {
        verifyElement(waitForElement(btnDepositInPromotionsRacebook));
        return verifyElement(waitForElement(elmntTermsAndConditionsInPromotionsRacebook));
    }

    public boolean verifyCasinoPagePromotions() {
        verifyElement(waitForElement(btnDepositInPromotionsCasino));
        return verifyElement(waitForElement(elmntTermsAndConditionsInPromotionsCasino));

    }

    public boolean closePromotionsBetPopup() {
        waitForSeconds(3);
        verifyElement(promotionBetPopup);
        click(btnRadiopromotionBetPopup);
        return click(btnClosepromotionBetPopup);
    }

    public boolean clickDepositNowBtnPagePromotions() {
        waitForSeconds(3);
        jsScrollDown();
        takeScreenshot("Deposit Now button");
        return click(waitForElement(btnDepositDepositInPromotions));


    }
//cashier*

    //verifying cashier page
    public boolean verifyViewMoreOptionsLink() {
        waitForframeToBeAvailableAndSwitchToIt(driver, elmntCashierIFrame);
        waitForElement(lnkViewMoreOptions);
       return verifyElement(lnkViewMoreOptions);
    }
    //*cashier


    //clicking terms and conditions in deposit sub-tab
    public boolean clickTermsAndConditions() {
        return click(waitForElement(elmntTermsAndConditionsInPromotions));

    }

    public boolean verifyGeneralRulesInTermsAndConditionsPopUp() {
        waitForSeconds(2);
        jsClick(elmntGeneralRules);
        return waitForWindows(2);
    }

    public boolean verifyTermsAndConditionsPopUp() {
        return waitForWindows(2);
    }


    public void clickOnCloseIconInTermsAndConditionsPopUp() {
        jsClick(closeIconInTermsAndConditionPopUp);

    }

    public void clickOnPlayNow() {
        click(waitForElement(btnPlayNowInPromotions));

    }

    public void clickOnPromoitonsTab() {
        click(waitForElement(elmntPromotionsTab));

    }

    public boolean verifyCasinoPage() {
        return verifyElement(waitForElement(elmntCasinoTabs));
    }


    public boolean verifyReferNowOption() {
        scrollToElement(btnReferNow);
        return verifyElement(btnReferNow);
    }

    public boolean clickReferNowOption() {
        scrollToElement(btnReferNow);
        return click(btnReferNow);
    }

    public boolean verifyReferFriendPage() {
        waitForSeconds(3);
        scrollToElement(elmntReferFriendTable);
        return verifyElement(waitForElement(elmntReferFriendTable));
    }

    public boolean verifyContestPromotionPage() {
        scrollToElement(btnClosedpromotionContest);
        return verifyElement(btnClosedpromotionContest);
    }


    public boolean clickClosedContestPage() {
        scrollToElement(btnClosedpromotionContest);
        return click(btnClosedpromotionContest);
    }

    public boolean verifyContestPage() {
        waitForSeconds(4);
        scrollToElement(elmntContestoptions);
        return verifyElement(waitForElement(elmntContestoptions));
    }
//
//    public boolean verifyPokerPage() {
//        scrollToElement(elmntPokerpage);
//        return verifyElement(elmntPokerpage);
//    }

    public boolean clickOptInNowbtnInCasino() {
        scrollToElement(btnOptInNowInPromotionsCasino);
        return click(waitForElement(btnOptInNowInPromotionsCasino));
    }

    public boolean clickOptInNowbtnInPoker() {
        scrollToElement(btnOptInNowInPromotionsPoker);
        return click(waitForElement(btnOptInNowInPromotionsPoker));
    }

    public boolean clickOptInNowbtnInDeposit() {
        scrollToElement(btnOptInNowInPromotionsDeposit);
        return click(waitForElement(btnOptInNowInPromotionsDeposit));
    }
    public boolean verifyOptInNow() {

        scrollToElement(btnOptInNowInOptPgae);
        return verifyElement(waitForElement(btnOptInNowInOptPgae));
    }

    public void enteringMailIdInOptIn(String strEmailId){
        waitForElement(txtBoxOptInNowInOptPgae);
        enterValue(waitForElement(txtBoxOptInNowInOptPgae), TestDataUtil.getValue(strEmailId).concat(Constants.MAIL_DOMAIN));
    }

    public void enteringMailIdInCasinoOptIn(String strEmailId){
        waitForElement(txtBoxOptInNowInOptPgae);
        enterValue(waitForElement(txtBoxOptInNowInOptPgae), TestDataUtil.getValue(strEmailId).concat("a").concat(Constants.MAIL_DOMAIN));
    }

    public void enteringMailIdInPokerOptIn(String strEmailId){
        waitForElement(txtBoxOptInNowInOptPgae);
        enterValue(waitForElement(txtBoxOptInNowInOptPgae), TestDataUtil.getValue(strEmailId).concat("b").concat(Constants.MAIL_DOMAIN));
    }

    public boolean verifySuccessMessage(){
      return verifyElement(waitForElement(txtSuccessMessageInOptPgae));

    }

    public void clickOptInOptionInOptPage(){
        waitForElement(btnOptInNowInOptPgae);
        click(btnOptInNowInOptPgae);
    }

    public void clickCasinoPromotion(){
        waitForElement(elmntPromotionCasino);
        click(elmntPromotionCasino);
    }

    public void clickPokerPromotion(){
        waitForElement(elmntPromotionPoker);
        click(elmntPromotionPoker);
    }

    public void clickLearnMoreInPoker(){
        waitForElement(btnLearnMoreInPromotionsPoker);
        click(btnLearnMoreInPromotionsPoker);
    }

    public boolean verifyPokerPromotionPage(){
        waitForElement(btnLearnMoreInPromotionsPoker);
        return verifyElement(btnLearnMoreInPromotionsPoker);
    }

  public void clickLearnMoreInSports(){
        waitForElement(btnLearnMoreInPromotionsSports);
        click(btnLearnMoreInPromotionsSports);
    }

    public void clickPlayNowInPoker(){
        waitForElement(btnPlayNowInPromotionsPoker);
        click(btnPlayNowInPromotionsPoker);
    }

    public boolean verifyLearnMorePokerPage(){
     return    verifyElement(waitForElement(btnPlayNowInPokerLearnMorePage));
    }

    public void clickPlayNowInsidePromotion(){
        waitForElement(btnPlayNowInPokerLearnMorePage);
         click(waitForElement(btnPlayNowInPokerLearnMorePage));
    }

    public void clickDepositNowInSportsPromotion(){
        waitForElement(btnDepositNowPromotionSports);
         click(waitForElement(btnDepositNowPromotionSports));
    }

    public void clickDepositNowInRacebookPromotion(){
        waitForElement(btnDepositNowPromotionRacebook);
         click(waitForElement(btnDepositNowPromotionRacebook));
    }

    public boolean  verifyPokerPromotionInPokerpage() {
     return  verifyElement(waitForElement(elmntTabsPokerPage));
    }
}

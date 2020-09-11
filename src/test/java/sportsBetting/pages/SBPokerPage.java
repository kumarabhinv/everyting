package sportsBetting.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SBPokerPage<options> extends BasePage {


    public SBPokerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Terms & Conditions')])[1]")
    protected WebElement BtnTermsandConditions;

    @FindBy(how = How.XPATH, using = "//div[@class='atitle']/h2[contains(text(),'FAVORITE TOURNAMENTS')]")
    protected WebElement elmntTournamentsHeader;

    @FindBy(how = How.XPATH, using = "//div[@id='poker index']/descendant::div[@id='tabContainer']//li/a[contains(text(),'')]")
    protected List<WebElement> strPokerTabs;

    @FindBy(how = How.XPATH, using = "//div[@id='tabContainer']//li[contains(text(),'Poker')]")
    protected WebElement strPokerSubTab;

    @FindBy(how = How.XPATH, using = "//div[@class='popup-opcrm-modal-content']//button[@id='closePopup']")
    protected WebElement btnClosePopup;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='cont']//a/img[contains(@title,'')]"),
            @FindBy(how = How.XPATH, using = "(//div[@class='cont'])[1]//a/img[contains(@title,'')]")
    })
    protected List<WebElement> elmntDownloadOptions;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='container']//li/a[contains(text(),'Poker')]"),
            @FindBy(how = How.XPATH, using = "//div[@class='container']//li/a[contains(text(),'POKER')]")
    })
    protected WebElement BtnPokerTab;

    @FindBy(how = How.XPATH, using = "//div[@class='container']//li/a[contains(text(),'Promotions')]")
    protected WebElement BtnPromotionsTab;

    @FindBy(how = How.ID, using = "myIframe")
    protected WebElement PokeriFrame;

    protected String strHeaders = new StringBuilder()
            //div[@class='atitle'][contains(text(),'')]
            .append("//div[@class='atitle']/h2[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();


    @FindBy(how = How.XPATH, using = "//div[@class='cont']//a/img[contains(@title,'Bad Beat Jackpot')]")
    protected WebElement elmntImageLink;

    @FindBy(how = How.XPATH, using = "//div[@class='odometer-inside']/span")
    protected List<WebElement> elmntOdoMeter1;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='layout__landing-odometer-box static js-odometer-box mb']/descendant::div[@class='odometer-inside']"),
            @FindBy(how = How.XPATH, using = "//div[@class='odometer-inside']/span")
    })
    protected WebElement elmntOdoMeter;

    @FindBy(how = How.XPATH, using = "//div[@class='landing__banner-box']/a/img[@class='img-responsive']")
    protected WebElement Carousels;

    @FindBy(how = How.XPATH, using = "//div[@class='table-responsive mb']//tr[@class='header']")
    protected WebElement elmntWinnerDetails;

    @FindBy(how = How.XPATH, using = "//div[@class='text-center mb']//a[normalize-space(text()='Terms&Conditions')]")
    protected WebElement elmntTermsandCondtns;

    @FindBy(how = How.ID, using = "myModalLabel")
    protected WebElement elmntPopup;

    @FindBy(how = How.XPATH, using = "//div[@class='modal-header']/button[@class='close']")
    protected WebElement CloseBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='cms_content_container jackpot-ticker']/div[contains(text(),'')]")
    protected WebElement elmntiframetext;

    @FindBy(how = How.XPATH, using = "//div[@class='cont']//a/img[contains(@title,'Play Online No')]")
    protected WebElement BtnPlayOnline;

    @FindBy(how = How.XPATH, using = "//div[@class='cont']//a/img[contains(@title,'Download PC')]")
    protected WebElement BtnDownloadForPc;

    @FindBy(how = How.XPATH, using = "//div[@class='cont']//a/img[contains(@title,'Download MAC')]")
    protected WebElement BtnDownloadForMac;

    @FindBy(how = How.XPATH, using = "//div[@class='tabscontent']//a[@href='https://promotions.sportsbetting.ag/poker-tournaments']/img[@id='G2C__HREF__22_IMG_1']")
    protected WebElement elmntTournamentSchedule;

    @FindBy(how = How.XPATH, using = "//div[@class='poker-tournaments__submenu-top col-xs-12']")
    protected WebElement elmntTournaments;

    @FindBy(how = How.XPATH, using = "//div[@class='tabscontent']//a[@href='https://www.surveymonkey.com/r/SB-POKERFEEDBACK']/img")
    protected WebElement elmntPokerSchedule;

    @FindBy(how = How.XPATH, using = "//div[@class=' question-fieldset question-legend']")
    protected WebElement surveypage;

    @FindBy(how = How.XPATH, using = "//div/h2[.='POPULAR PROMOTIONS']//following::a[1]/img[@title='100%  first deposit poker bonus']")
    protected WebElement elmntpromotions;

    @FindBy(how = How.XPATH, using = "//div[@class='atitle']/h2[contains(text(),'POPULAR PROMOTIONS')]")
    protected WebElement elmntPokerPromotions;

    @FindBy(how = How.XPATH, using = "//div[@class='upt-cont']/a[@href='https://www.sportsbetting.ag/poker/100depositbonus']/img[contains(@title,'100%  first deposit poker bonus')]")
    protected WebElement elmntPokercontests;

    @FindBy(how = How.XPATH, using = "//div[@class='cont'][3]")
    protected WebElement elmntFavoriteTournaments;

    @FindBy(how = How.XPATH, using = "//div[@class='upt-cont']/a[@href='https://promotions.sportsbetting.ag/poker-tournaments']/img[contains(@title,'SnG schedule')]")
    protected WebElement elmntSundayMajors;

    @FindBy(how = How.XPATH, using = "(//div[@class='cont'][3]//child::a)[1]")
    protected WebElement elmntPromotionUnderFavourites;

    @FindBy(how = How.XPATH, using = "//div[@class='upt-cont']/a[@href='https://promotions.sportsbetting.ag/sb-sng-schedule']/img[contains(@title,'SnG schedule')]")
    protected WebElement elmntSitandGoTournament;

    @FindBy(how = How.XPATH, using = "//div[@class='atitle']/h2[contains(text(),'LEADERBOARDS')]")
    protected WebElement elmntLeaderBoards;


    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='cont']//div[@class='upt-cont']/a[@href='https://promotions.sportsbetting.ag/poker-iron-man']/img[contains(@title,'100%  first deposit poker bonus')]"),
            @FindBy(how = How.XPATH, using = "//div[@class='cont']/div[@class='upt-cont']/a[@href='https://promotions.sportsbetting.ag/high-hand-weekly-leaderboard']/img[contains(@title,'100%  first deposit poker bonus')]"),
            @FindBy(how = How.XPATH, using = "//div/h2[.='LEADERBOARDS']//following::a[1]")
    })
    protected WebElement elmntLeaderBoardLinks;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='landing__banner-box']//img[@class='img-responsive hidden-xs hidden-sm']"),
            @FindBy(how = How.XPATH, using = "//div[@class='landing__banner-box']//img[@class='img-responsive']")

    })
    protected WebElement elmntLeaderBoardPage;


    @FindBy(how = How.XPATH, using = "(//div[@class='landing__item-info col-xs-12 col-sm-6']//div[@class='landing__btn-box']/a[1][contains(text(),'Learn More')])[1]")
    protected WebElement BtnLearnmore;

    @FindBy(how = How.XPATH, using = "//div[@class='landing__btn-box'][1]/a[1][@href='https://promotions.sportsbetting.ag/jackpot-sit-and-go'][@class='landing__item-btn btn btn-play'][contains(text(),'Play Now')][1]")

    protected WebElement BtnPlayNow;

    @FindBy(how = How.XPATH, using = "//div[@class='landing__item-info col-xs-12 col-sm-6']/h3[contains(text(),'Get a 100% bonus on your first deposit')]")
    protected WebElement BtnClickhere;


    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@id=\"inner-page\"]/div/div[3]/div[1]/div/div/div[2]/article/div[2]/a[1][contains(text(),'PLAY NOW')]"),
            @FindBy(how = How.XPATH, using = "(//div[@class='text-center mb']/a[.='PLAY NOW'])[1]")
    })
    protected WebElement BtnPlayOption;

    @FindBy(how = How.XPATH, using = "//div[@class='landing__banner-box']")
    protected WebElement elmntcontests;

    @FindBy(how = How.XPATH, using = "//div[@class='modal-content']/div[@class='modal-header']/h4[@id='myModalLabel']")
    protected WebElement elmntTerms;

    @FindBy(how = How.XPATH, using = "//div[@class='modal-content']/div[@class='modal-header']/button[@class='close']")
    protected WebElement BtnClosePopUp;

    @FindBy(how = How.XPATH, using = "//div[@class='container']//li/a[contains(text(),'Mobile')]")
    protected WebElement BtnMobile;

    @FindBy(how = How.ID, using = "wrapper")
    protected WebElement elmntMobilecontent;

    @FindBy(how = How.XPATH, using = "//div[@class='table-responsive mb']//thead/tr[1]")
    protected WebElement strPokerContests;

    @FindBy(how = How.XPATH, using = "//button[@class='webpush-swal2-close']")
    protected WebElement btnPokerClosePopUp;

    @FindBy(how = How.XPATH, using = "//img[contains(@src, 'play')]")
    protected WebElement lnkPokerPlayNow;

    @FindBy(how = How.XPATH, using = "//img[contains(@src, 'download')]")
    protected WebElement lnkPokerDownloadNow;

    @FindBy(how = How.XPATH, using = "//canvas")
    protected WebElement elmntPlayNowPageCanvas;

    @FindBy(how = How.XPATH, using = "//div[@id='qrcodeIOS']")
    protected WebElement elmntQRForApple;

    @FindBy(how = How.XPATH, using = "//div[@id='qrcodeAndroid']")
    protected WebElement elmntQRForAndroid;

    @FindBy(how = How.XPATH, using = "//div[@class='webpush-swal2-header']//button")
    protected WebElement elmntPokerPromotionPopup;

    @FindBy(how = How.XPATH, using = "(//a[.='PLAY NOW'])[1]")
    protected WebElement elmntPlayInsideFavouriteTournament;

    @FindBy(how = How.XPATH, using = "//title[.='SportsBetting']")
    protected WebElement elmntTitleOnLogInPage;


    //Regression Methods

    public boolean verifyPokerSubtabs() {
        verifyElement(waitForElement(BtnPokerTab));
        verifyElement(waitForElement(BtnMobile));
        return verifyElement(waitForElement(BtnPromotionsTab));
    }


    public boolean clickPokerTab() {
        waitForSeconds(3);
        waitForElement(BtnPokerTab);
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            return click(BtnPokerTab);
        } else {
            boolean pokerTab = click(BtnPokerTab);
            if (verifyElement(elmntPokerPromotionPopup)) {
                jsClick(elmntPokerPromotionPopup);
            }
            return pokerTab;
        }
    }

    public boolean verifyDownloadOptions(DataTable Table) {
        waitForSeconds(3);
        verifyElement(BtnDownloadForPc);
        verifyElement(BtnDownloadForMac);
        return verifyElement(BtnPlayOnline);
////        List<String> lstdata = Table.asList(String.class);
////        List<String> ListElements = new ArrayList<String>();
////        elmntDownloadOptions.forEach(EleItem -> ListElements.add(EleItem.getText()));
////        System.out.println(ListElements);
////        System.out.println(lstdata);
////        return ListElements.equals(lstdata);
//////        verifyElement(strPokerSubTab);
//////        return verifyElement(PokeriFrame);

    }

    public void verifyPokerTabHeaders(String headers) {
        if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            if (verifyElement(elmntPokerPromotionPopup)) {
                click(elmntPokerPromotionPopup);
            }
        }
        WebElement HeaderLocators = waitForElement(By.xpath(strHeaders.replace("<<TABNAME>>", headers)));
        HeaderLocators.getText();
        System.out.println(HeaderLocators);
    }


    public void clickImage() {
        waitForElement(elmntImageLink);
        jsClick(elmntImageLink);
    }

    public boolean verifyGamepage(String strelmnts) {
        waitForElement(Carousels);
        verifyElement(Carousels);
        String text = elmntWinnerDetails.getText();
        System.out.println(text);
        waitForElement(elmntOdoMeter);
        verifyElement(elmntOdoMeter);
        waitForElement(elmntTermsandCondtns);
        strelmnts.equals("Terms&Conditions");
        return verifyElement(elmntTermsandCondtns);

    }

    public boolean verifyCarousels() {
        waitForSeconds(3);
        waitForElement(Carousels);
        return verifyElement(Carousels);
    }

    public void clickTermsandCondtns() {
        waitForElement(elmntTermsandCondtns);
        click(elmntTermsandCondtns);
    }

    public boolean closePopup() {
        waitForElement(CloseBtn);
        return click(CloseBtn);
    }

    public void clickCarousels() {
        waitForElement(Carousels);
        verifyElement(Carousels);
        click(Carousels);
    }

    public void scrolltoelement() {
        waitForSeconds(2);
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            scrollToElement(elmntOdoMeter);
        } else {
            verifyElement(waitForElement(elmntOdoMeter));
        }
    }

    public boolean verifyWagersChange() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            String text = elmntOdoMeter.getText();
            System.out.println(text);
            waitForSeconds(60);
            System.out.println("count changed to:");
            System.out.println(text);
            return verifyElement(elmntOdoMeter);
        }
        waitForSeconds(3);
        List<String> ListElements = new ArrayList<String>();
        elmntOdoMeter1.forEach(count -> ListElements.add(count.getText()));
        System.out.print(ListElements);
        waitForSeconds(60);
        refreshPage();
        List<String> ListElements1 = new ArrayList<String>();
        elmntOdoMeter1.forEach(count1 -> ListElements1.add(count1.getText()));
        System.out.print("count changed to:");
        System.out.print(ListElements1);
        return ListElements != ListElements1;


    }

    public void scrolltoframe() {
        focusFrame(PokeriFrame);
        scrollToElement(elmntiframetext);
    }

    public boolean verifyCountChange() {
        waitForSeconds(4);
        elmntiframetext.getText();
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            waitForSeconds(20);
        }
        return focusBackToDefaultFrame();
    }

    public void verifyPlayOnlinePage() {
        waitForSeconds(3);
        focusWindow(2);
        String text = driver.getTitle();
        System.out.println(text);
        closeWindow(2);
        focusWindow(1);
//       return text.contains("https://poker.sportsbetting.ag/desktoppoker/index.htm");

    }

    public void verifyPlayOnlinePageSecond() {
        waitForSeconds(3);
//        // focusWindow(2);
        String text = driver.getTitle();
        System.out.println(text);
//         text.contains("https://poker.sportsbetting.ag/desktoppoker/index.htm");


    }

    public void clickDownloadBtn() {
        waitForElement(BtnDownloadForPc);
        click(BtnDownloadForPc);
    }

    public void clickDownloadForMAC() {
        waitForElement(BtnDownloadForMac);
        click(BtnDownloadForMac);
    }

    public void verifyWindowsFileDownloadLocation() {
//        File objFile=new File("Z:/Regression-SportsBetting/config");
//        return objFile.exists();
        waitForSeconds(3);
        robotKey(KeyEvent.VK_ENTER);
    }

    public void verifyMacFilesDownloadLocation() {
//            File objFile=new File("Z:/Regression-SportsBetting/config");
//            return objFile.exists();
        waitForSeconds(3);
        robotKey(KeyEvent.VK_ENTER);

    }


    public void clickTournamentlink() {
        waitForElement(elmntTournamentSchedule);
        click(elmntTournamentSchedule);
    }

    public boolean verifyPokerTournaments() {
        waitForElement(elmntTournaments);
        String text = elmntTournaments.getText();
        System.out.println(text);
        return verifyElement(elmntTournaments);

    }

    public void clickGameBtn() {
        waitForElement(elmntPokerSchedule);
        click(elmntPokerSchedule);
    }

    public boolean verifySurveyPage(String link) {
        surveypage.isDisplayed();
        String text = driver.getCurrentUrl();
        if (text.equalsIgnoreCase(link))
            System.out.println(text);
        return verifyElement(surveypage);
    }

    public void NavigatePromotions() {
        waitForElement(elmntPokerPromotions);
        scrollToElement(elmntPokerPromotions);
        System.out.println(elmntPokerPromotions.getText());
    }

    public boolean verifyPokerPromotions() {
        waitForElement(elmntpromotions);
        System.out.println((elmntpromotions.getText()));
        waitForElement(elmntImageLink);
        System.out.println((elmntImageLink.getText()));
        waitForElement(elmntPokercontests);
        System.out.println((elmntPokercontests.getText()));
        return verifyElement(elmntImageLink);
    }

    public void VerifyPageLink() {
        String text = driver.getCurrentUrl();
        System.out.println(text);
    }

    public void naviagatetoElement() {
        waitForElement(elmntTournamentsHeader);
        scrollToElement(elmntTournamentsHeader);
    }

    public boolean verifyTournaments() {
        waitForElement(elmntFavoriteTournaments);
        return verifyElement(elmntFavoriteTournaments);
    }

    public boolean clickFavoriteTournaments() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            waitForElement(elmntSundayMajors);
            return click(elmntSundayMajors);
        }
        waitForElement(elmntPromotionUnderFavourites);
        return click(elmntPromotionUnderFavourites);
    }

    public void VerifyTorunamentPageLink() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            String text = driver.getCurrentUrl();
            System.out.println(text);
        }
        waitForElement(elmntPlayInsideFavouriteTournament);
        verifyElement(elmntPlayInsideFavouriteTournament);
    }

    public boolean verifyLeaderboardHeader() {
        waitForElement(elmntLeaderBoards);
        scrollToElement(elmntLeaderBoards);
        return verifyElement(elmntLeaderBoards);
    }

    public boolean verifyLeaderBoardLinks() {
        waitForElement(elmntLeaderBoardLinks);
        return verifyElement(elmntLeaderBoardLinks);
    }

    public void selectLeaderboardOptions() {
        waitForElement(elmntLeaderBoardLinks);
        click(elmntLeaderBoardLinks);
    }

    public boolean verifyLeaderBoardpage() {
        waitForSeconds(2);
        waitForElement(elmntLeaderBoardPage);
        return verifyElement(elmntLeaderBoardPage);
    }

    public void verifyLeaderboardPageurl() {
        String text = driver.getCurrentUrl();
        System.out.println(text);
    }

    public void clickPromotionsTab() {
        waitForElement(BtnPromotionsTab);
        click(BtnPromotionsTab);
    }

    public boolean verifyPromtionOptions() {
        verifyElement(waitForElement(BtnLearnmore));
        verifyElement(waitForElement(BtnPlayNow));
        return verifyElement(waitForElement(BtnClickhere));
    }

    public void verifyTabHighlighted() {
        waitForElement(BtnPromotionsTab);
        if (BtnPromotionsTab.isSelected()) {
            verifyElement(BtnPromotionsTab);
        }
    }

    public void selectPromotions() {
        waitForElement(BtnLearnmore);
        click(BtnLearnmore);
    }

    public boolean verifyPokerOptions() {
        waitForSeconds(3);
        waitForElement(BtnPlayOption);
        scrollToElement(BtnPlayOption);
        String text = BtnPlayOption.getText();
        System.out.println(text);
        String value = BtnTermsandConditions.getText();
        System.out.println(value);
        System.out.println(text);
        verifyElement(BtnPlayOption);
        return verifyElement(BtnTermsandConditions);
    }

    public boolean verifyContestsPage() {
        waitForElement(elmntcontests);
        return verifyElement(elmntcontests);
    }

    public void clickPlayNow() {
        jsClick(BtnPlayOption);
    }

    public void clickTermsandConditions() {
        waitForElement(BtnTermsandConditions);
        jsClick(BtnTermsandConditions);
    }

    public boolean verifyPopup() {
        waitForElement(elmntTerms);
        verifyElement(elmntTerms);
        waitForSeconds(5);
        return click(BtnClosePopUp);
    }

    public boolean clickMobileTab() {
        waitForElement(BtnMobile);
        return click(BtnMobile);
    }

    public boolean verifyMobileContent() {
        waitForElement(elmntMobilecontent);
        return verifyElement(elmntMobilecontent);
    }

    public void verifyTabHighlight() {
        waitForElement(BtnMobile);
        if ((BtnMobile.isSelected())) {
            verifyElement(BtnMobile);
        }
    }

    public boolean closeTermsPopup() {
        waitForElement(BtnClosePopUp);
        return click(BtnClosePopUp);
    }

    public boolean verifyPromotionDetails() {
        waitForElement(strPokerContests);
        return verifyElement(strPokerContests);
    }

    public boolean PopupClosed() {
        if (!BtnClosePopUp.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean clickPlayOnlinebtn() {
        waitForElement(BtnPlayOnline);
        return click(BtnPlayOnline);
    }

    public boolean verifyPokerPageButtons() {
        waitForSeconds(2);
        if (verifyElement(btnPokerClosePopUp)) {
            click(waitForElement(btnPokerClosePopUp));
        }
        return verifyElement(waitForElement(lnkPokerPlayNow)) && verifyElement(waitForElement(lnkPokerDownloadNow));
    }

    public boolean clickPlayNowMobile() {
        return click(waitForElement(lnkPokerPlayNow));
    }

    public boolean verifyPlayNowPage() {
        return verifyElement(waitForElement(elmntPlayNowPageCanvas));
    }

    public boolean verifyPokerQRForApple() {
        return verifyElement(waitForElement(elmntQRForApple));
    }

    public boolean verifyDownloadNowMobile() {
        return verifyElement(waitForElement(lnkPokerDownloadNow));
    }

    public boolean verifyPokerQRForAndroid() {
        return verifyElement(waitForElement(elmntQRForAndroid));
    }
}



















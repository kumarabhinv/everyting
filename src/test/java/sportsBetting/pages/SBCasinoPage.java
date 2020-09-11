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

import java.util.List;

public class SBCasinoPage extends BasePage {

    public SBCasinoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "(//button[text() ='Live Casino'])[2]")
    protected WebElement elmntLiveCasino;

    @FindBy(how = How.XPATH, using = "//a[text()='CASINO']")
    protected WebElement elmntCasino;

    protected String casinoTabs = new StringBuilder()
            .append("//div[@class ='lmm style']//span[text() = '")
            .append("<<TABNAME>>")
            .append("']")
            .toString();

    protected String slotTabs = new StringBuilder()
            .append("//h2[text() ='")
            .append("<<Caps>>")
            .append("']/following::img[1]")

            .toString();

    @FindBy(how = How.XPATH, using = "(//div[@class='row'])[1]/descendant::a[1]")
    protected WebElement elmntGameTab;

    @FindBy(how = How.XPATH, using = "(//span[@class ='box ng-binding'])[5]")
    protected WebElement elmntLiveCasinoRedTab;

    @FindBy(how = How.XPATH, using = "(//span[@class ='selected-limit'])[1]")
    protected WebElement elmntLiveCasinoBlackTab;


    @FindBy(how = How.XPATH, using = "//span[.='American Roulette']")
    protected WebElement elmntBlackAllGames;


    @FindBy(how = How.XPATH, using = "(//h2)[1]")
    protected WebElement elmntBonusTab;

    @FindBy(how = How.XPATH, using = "(//img[@class='img-responsive game-image'])[1]")
    protected WebElement elmntSubTabUnderFeaturedTab;

    @FindBy(how = How.XPATH, using = "(//div[@class='row'])[2]/descendant::a[1]")
    protected WebElement elmntSubsTabUnderFeaturedTab;

    @FindBy(how = How.XPATH, using = "//div[@id ='playNowbtn']")
    protected WebElement btnPlayGameTab;

    @FindBy(how = How.XPATH, using = "//div[@class='jsPanel-content jsPanel-content-nofooter']")
    protected WebElement elmntGamesUnderCasinoTab;

    @FindBy(how = How.XPATH, using = "//span[@class='jsglyph jsglyph-close']")
    protected WebElement iconCloseInGameTab;

    @FindBy(how = How.XPATH, using = "//iframe[@class='financialsBettingFrame']")
    protected WebElement elmntFocusFrame;

    @FindAll({@FindBy(how = How.XPATH, using = "//iframe[@class='financialsBettingFrame']"),
            @FindBy(how = How.XPATH, using = "//div[@class='featured-games']/iframe[@id='tradologicFrame']")
    })
    protected WebElement LiveCasinoIframe;

    @FindBy(how = How.ID, using = "menu-nav-view")
    protected WebElement elmntSubTabsUnderBlack;

    @FindBy(how = How.XPATH, using = "(//div[@class ='container ng-scope'])[2]")
    protected WebElement elmntSubTabs1UnderRed;

    @FindBy(how = How.XPATH, using = "//a[text() ='DEPOSIT']")
    protected WebElement btnDepositButton;

    @FindBy(how = How.XPATH, using = "//a[text()='Withdrawal']")
    protected WebElement elmntCheckCashierMenu;

    @FindBy(how = How.ID, using = "cashierFrame")
    protected WebElement elmntCashierMenu;

    @FindBy(how = How.XPATH, using = "//img[@class ='gameClose']")
    protected WebElement btnCloseMenu;

    @FindBy(how = How.XPATH, using = "(//div[@class ='col-md-12'])[1]")
    protected WebElement elmntGameModalClosed;

    @FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[2]")
    protected WebElement elmntCloseFavoriteClosed;

    @FindBy(how = How.XPATH, using = "(//button[@class = 'close'])[3]")
    protected WebElement btnButtonClose;

    @FindBy(how = How.XPATH, using = "(//td)[6]")
    protected WebElement elmntInformation;

    @FindBy(how = How.XPATH, using = "//p[text() ='Changes saved successfully']")
    protected WebElement elmntPopUp;

    @FindBy(how = How.XPATH, using = "(//h2)[2]/following::img[1]")
    protected WebElement elmntCrap;

    @FindBy(how = How.XPATH, using = "(//a[text() ='Deposit Now'])[1]")
    protected WebElement elmntPromotionPage;

    @FindBy(how = How.XPATH, using = "//button[text() ='Deposit']")
    protected WebElement elmntDepositOption;

    @FindBy(how = How.ID, using = "cashierFrame")
    protected WebElement elmntDepositFrame;

    @FindBy(how = How.XPATH, using = "//h3[text() ='100% CASINO BONUS TIMES 3']//following::a[text() ='Click here'][1]")
    protected WebElement elmntBonusPromotionsTab;

    @FindBy(how = How.XPATH, using = "//a[text() ='Play Now']")
    protected WebElement elmntPokerTab;

    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Terms')])[5] ")
    protected WebElement elmntTermsConditions;

    @FindBy(how = How.XPATH, using = "(//h4[@class='modal-title'])[3]")
    protected WebElement elmntConditions;

    @FindBy(how = How.XPATH, using = "//img[@class='img-responsive game-image']")
    protected WebElement elmntGames;

    @FindBy(how = How.XPATH, using = "//h2[text()='Speciality Games']")
    protected WebElement elmntGamesUnderSpecialityGames;

    @FindBy(how = How.XPATH, using = "(//p)[3]")
    protected WebElement elmntBonusPage;

    @FindBy(how = How.XPATH, using = "(//a[text()='Click here'])[5]")
    protected WebElement elmntClickHereUnderPromotion;

    @FindAll({
            @FindBy(how = How.ID, using = "main-view"),
            @FindBy(how = How.ID, using = "main-screen")})
    protected WebElement elmntGameWindow;

    //mobile elements


    protected String lnkClassicCasinoSubTabs = new StringBuilder()
            .append("//a[contains(., '")
            .append("<<SUBTAB>>")
            .append("')]")
            .toString();

    @FindBy(how = How.XPATH, using = "(//header/descendant::button)[1]")
    protected WebElement btnClassicCasinoLeftNavigator;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[.='Table games']/ancestor::a[contains(@class, '159')]"),
            @FindBy(how = How.XPATH, using = "//span[.='Table games']/ancestor::a[contains(@aria-selected, 'true')]")
    })
    protected WebElement lnkClassicCasinoTableGames;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Balance:')]")
    protected WebElement txtClassicCasinoBalanceAmount;

    @FindBy(how = How.XPATH, using = "//h3[.='American']")
    protected WebElement txtGamesUnderTableGames;

    @FindBy(how = How.XPATH, using = "//div[@class='accept']")
    protected WebElement elmntTableGameConsole;

    @FindBy(how = How.XPATH, using = "//h3[.='Jacks or Better']")
    protected WebElement txtGamesUnderVideoPoker;

    @FindBy(how = How.XPATH, using = "//h3[.='Critters']")
    protected WebElement txtGamesUnderSlotGames;

    @FindBy(how = How.XPATH, using = "//h3[.='Baccarat']")
    protected WebElement txtGamesUnderFeaturedGames;

    @FindBy(how = How.XPATH, using = "//h3[.='Keno Cannon']")
    protected WebElement txtGamesUnderOtherGames;

    @FindBy(how = How.XPATH, using = "//button[contains(., 'Exit')]")
    protected WebElement btnExitClassicCasino;

    @FindBy(how = How.XPATH, using = "//button[contains(., 'Exit')]/following::button[1]")
    protected WebElement btnCloseClassicCasinoLeftNavigator;

    protected String elmntOptionsLeftNavigator = new StringBuilder()
            .append("//span[contains(., '")
            .append("<<OPTIONNAME>>")
            .append("')]")
            .toString();

    protected String txtClassicCasinoLanguages = new StringBuilder()
            .append("//li[contains(., '")
            .append("<<LANGUAGESNAME>>")
            .append("')]")
            .toString();

    //Casino Mobile Elements


    @FindBy(how = How.XPATH, using = "(//img[@class='img_scroll'])[3]")
    protected WebElement elmntCasinoUnderCasinoMobile;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='ui-select']"),
            @FindBy(how = How.XPATH, using = "//span[@class ='ui-icon ui-icon-arrow-d ui-icon-shadow']")
    })
    protected WebElement elmntDropDownUnderCasinoTab;

    @FindBy(how = How.XPATH, using = "//span[text()='Featured']")
    protected WebElement elmntDefaultTab;

    @FindBy(how = How.XPATH, using = "(//span[@class ='ui-btn-inner'])[6]")
    protected WebElement elmntGamesUnderFeatured;

    protected String viewDropDown = new StringBuilder()
            .append(("//a[text() ='"))
            .append("<<Caps>>")
            .append("']")
            .toString();

    @FindBy(how = How.XPATH, using = "(//span[@class ='ui-btn-inner'])[6]")
    protected WebElement elmntAnyGame;

    @FindBy(how = How.XPATH, using = "//canvas")
    protected WebElement elmntAnyGamePage;

    @FindBy(how = How.XPATH, using = "//a[text()='Table Games']")
    protected WebElement elmntTableGames;

    @FindBy(how = How.XPATH, using = "(//div[@id='subTitleCategories'])[1]")
    protected WebElement elmntBaccarat;

    @FindBy(how = How.XPATH, using = "(//div[@id='subTitleCategories'])[2]")
    protected WebElement elmntBlackjack;

    @FindBy(how = How.XPATH, using = "(//div[@id='subTitleCategories'])[3]")
    protected WebElement elmntCrapsAndRoulette;

    @FindBy(how = How.XPATH, using = "(//div[@id='subTitleCategories'])[4]")
    protected WebElement elmntTablePoker;

    @FindAll({
            @FindBy(how = How.XPATH, using = "(//a[contains(@class, 'game')])[1]"),
            @FindBy(how = How.XPATH, using = "(//span[@class='ui-btn-inner'])[6]")
    })
    protected WebElement elmntAnyGameUnderTableGames;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='game-bg']"),
            @FindBy(how = How.XPATH, using = "(//span[@class='ui-btn-inner'])[6]")
    })
    protected WebElement elmntAnyGamePageUnderTableGames;

    @FindBy(how = How.XPATH, using = "//a[text()='Video Poker']")
    protected WebElement elmntVideoPoker;

    @FindBy(how = How.XPATH, using = "//a[text()='Slots']")
    protected WebElement elmntSlots;

    @FindBy(how = How.XPATH, using = "//a[text()='Live Casino Black']")
    protected WebElement elmntLiveCasinoBlack;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[contains(text(), 'USD')]"),
            @FindBy(how = How.XPATH, using = "//div[@id='thumb-labels-overlay-182']")
    })
    protected WebElement elmntRedirectedPage;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//iframe[@id='HTML5IFrame']"),
            @FindBy(how = How.XPATH, using = "//div[@id='game-content']")
    })
    protected WebElement elmntVideoPokerGame;

    @FindBy(how = How.XPATH, using = "//div[@id='floating-video-foreground']")
    protected WebElement elmntGamePageUnderBlack;

    @FindBy(how = How.XPATH, using = "//a[text()='Live Casino Red']")
    protected WebElement elmntLiveCasinoRed;

    @FindBy(how = How.ID, using = "tradologicFrame")
    protected WebElement elmntIframe;

    @FindAll({
            @FindBy(how = How.XPATH, using = "(//span[@class='box ng-binding'])[1]/parent::a"),
            @FindBy(how = How.XPATH, using = "(//span[@class='box ng-binding'])[1]")
    })
    protected WebElement elmntAnyGameUnderRed;

    @FindBy(how = How.XPATH, using = "//input[@id ='screen-name-input']")
    protected WebElement elmntGameTabRed;

    @FindBy(how = How.XPATH, using = "//a[text()='Speciality Games']")
    protected WebElement elmntSpecialityGames;

    @FindBy(how = How.XPATH, using = "//a[text()='Bonuses & Free Spins']")
    protected WebElement elmntBonusAndSpins;

    @FindBy(how = How.XPATH, using = "//div[text()='You currently have no available bonuses!']")
    protected WebElement elmntSpins;

    @FindBy(how = How.XPATH, using = "//div[@id='game-container']")
    protected WebElement elmntRedirectedPageUnderSlots;

    @FindBy(how = How.XPATH, using = "//img[@class='media-object']")
    protected WebElement elmntCasinoPage;

    @FindBy(how = How.XPATH, using = "//div[@id='casino-content']")
    protected WebElement elmntCasinoPageRed;


    public boolean verifyCasinoPage(String strTabName) {
        WebElement verifyCasinoTabs = waitForElement(By.xpath(casinoTabs.replace("<<TABNAME>>", strTabName)));
        return click(waitForElement(verifyCasinoTabs));
    }


    public boolean clickSubTabUnderCasinoTab(String strTab) {
        WebElement featuredTab = waitForElement(By.xpath(casinoTabs.replace("<<TABNAME>>", strTab)));
        takeScreenshot("Favourites");
        return click(waitForElement(featuredTab));
    }

    public boolean verifyFeaturedTabsUnderCasino() {
        waitForElement(elmntSubTabUnderFeaturedTab);
        takeScreenshot("FeaturedTabs");
        return verifyElement(elmntSubsTabUnderFeaturedTab);
    }

    public boolean clickCasinoTab() {
        waitForElement(elmntCasino);
        return click(elmntCasino);

    }

    public boolean clickSubTabsUnderCasinoTab(String strTabs) {
        if (strTabs.toLowerCase().equalsIgnoreCase("Black".toLowerCase()) || strTabs.toLowerCase().equalsIgnoreCase("Red".toLowerCase())) {
            System.out.println("Before clicking live casino");
            waitForElement(elmntLiveCasino);
            System.out.println("Before hovering");
            mouseOver(elmntLiveCasino);
            System.out.println("After hovering");
            System.out.println("xpath black=====:" + casinoTabs.replace("<<TABNAME>>", strTabs));
            WebElement subTabs = waitForElement(By.xpath(casinoTabs.replace("<<TABNAME>>", strTabs)));
            return click(waitForElement(subTabs));
        } else {
            WebElement subTabs = waitForElement(By.xpath(casinoTabs.replace("<<TABNAME>>", strTabs)));
            return click(waitForElement(subTabs));

        }
    }


    public boolean clickGamesUnderCasinoTab(String strGameTab) {
        if (strGameTab.equalsIgnoreCase("Black")) {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
                focusFrame(waitForElement(elmntFocusFrame));
                return click(waitForElement(elmntLiveCasinoBlackTab));
            } else {
                focusFrame(waitForElement(LiveCasinoIframe));
                boolean blackGame = click(waitForElement(elmntBlackAllGames));
                focusBackToDefaultFrame();
                return blackGame;
            }

        } else if (strGameTab.equalsIgnoreCase("Red")) {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
                focusFrame(waitForElement(elmntFocusFrame));
                waitForSeconds(3);
                return click(waitForElement(elmntLiveCasinoRedTab));
            } else {
                focusFrame(waitForElement(LiveCasinoIframe));
                waitForSeconds(3);
                boolean redGame = click(waitForElement(elmntLiveCasinoRedTab));
                focusBackToDefaultFrame();
                return redGame;
            }
        } else if (strGameTab.equalsIgnoreCase("Featured")) {
            return click(waitForElement(elmntSubsTabUnderFeaturedTab));
        } else if (strGameTab.equalsIgnoreCase("Slots")) {
            return click(waitForElement(elmntSubTabUnderFeaturedTab));
        } else if (strGameTab.equalsIgnoreCase("Bonus")) {
            return true;
        } else {
            return click(waitForElement(elmntGameTab));
        }

    }

    public boolean clickGameTabsUnderCasinoTab(String strSubGames) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            if (strSubGames.equalsIgnoreCase("Bonus")) {
                return verifyElement(waitForElement(elmntBonusTab));
            } else if (strSubGames.equalsIgnoreCase("Red")) {

                focusWindow(3);
                String title = driver.getTitle();
                System.out.println(title + "title");
                if (!title.equals("Blackjacktitle")) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }

            } else if (strSubGames.equalsIgnoreCase("Black")) {
                focusWindow(2);
                String title = driver.getTitle();
                System.out.println(title + "title");

                if (!title.equals("Xtdtitle")) {
                    System.out.println("TRUE");
                } else {
                    System.out.println("FALSE");
                }
            } else {
                waitForSeconds(1);
                waitForElement(btnPlayGameTab);
                return click(waitForElement(btnPlayGameTab));
            }
            return true;
        } else {
            if (strSubGames.equalsIgnoreCase("Bonus")) {
                return verifyElement(waitForElement(elmntBonusTab));
            } else if (strSubGames.contains("Featured") || strSubGames.contains("Slots") || strSubGames.contains("Video Poker") || strSubGames.contains("Speciality Games")) {
                waitForSeconds(1);
                waitForElement(btnPlayGameTab);
                return click(waitForElement(btnPlayGameTab));
            } else {
                return true;
            }
        }


    }


    public boolean verifyGameTabsUnderDifferentTabs(String strSubGamesVerify) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            if (strSubGamesVerify.equalsIgnoreCase("Bonus")) {
                return verifyElement(waitForElement(elmntBonusTab));
            } else if (strSubGamesVerify.equalsIgnoreCase("Black")) {

                waitForElement(elmntGameWindow);
                return verifyElement(waitForElement(elmntGameWindow));
            } else if (strSubGamesVerify.equalsIgnoreCase("Red")) {
                waitForElement(elmntGameWindow);
                return verifyElement(elmntGameWindow);

            } else {
                waitForElement(elmntGamesUnderCasinoTab);
                return verifyElement(waitForElement(elmntGamesUnderCasinoTab));
            }
        } else {
            if (strSubGamesVerify.equalsIgnoreCase("Bonus")) {
                return verifyElement(waitForElement(elmntBonusTab));
            } else if (strSubGamesVerify.equalsIgnoreCase("Black")) {
                focusWindow(2);
                waitForElement(elmntGameWindow);
                boolean gameTab = verifyElement(waitForElement(elmntGameWindow));
                takeScreenshot("GameWindow");
                closeWindow(2);
                focusWindow(1);
                return gameTab;
            } else if (strSubGamesVerify.equalsIgnoreCase("Red")) {
                focusWindow(2);
                waitForElement(elmntGameWindow);
                boolean gameTab = verifyElement(elmntGameWindow);
                takeScreenshot("GameWindow");
                closeWindow(2);
                focusWindow(1);
                return gameTab;

            } else {
                waitForElement(elmntGamesUnderCasinoTab);
                verifyElement(waitForElement(elmntGamesUnderCasinoTab));
                return click(iconCloseInGameTab);

            }
        }
    }

    public boolean clickDepositUnderCasino() {
        waitForElement(btnDepositButton);
        return click(waitForElement(btnDepositButton));
    }

    public boolean verifyCashierMenuUnderCasino() {
        focusFrame(waitForElement(elmntCashierMenu));
        waitForElement(elmntCheckCashierMenu);
        return click(waitForElement(elmntCheckCashierMenu));
    }

    public boolean clickCloseIconUnderFeaturedTabs() {
        waitForElement(btnCloseMenu);
        return click(waitForElement(btnCloseMenu));
    }

    public boolean verifyGameModalClosedUnderFeatured() {
        waitForElement(elmntGameModalClosed);
        return verifyElement(elmntGameModalClosed);
    }

    public boolean closeFavoriteOptionUnderFeatured() {
        waitForSeconds(3);
        waitForElement(elmntCloseFavoriteClosed);
        takeScreenshot("GamePopup");
        return click(elmntCloseFavoriteClosed);
    }

    public boolean verifyInformationPageUnderFeatured() {
        waitForElement(elmntInformation);
        return verifyElement(elmntInformation);
    }

    public boolean ClickCloseButtonUnderFeaturedTab() {
        waitForElement(btnButtonClose);
        return click(btnButtonClose);
    }

    public boolean verifyPopUpOfFeaturedTab() {
        waitForSeconds(3);
        waitForElement(elmntPopUp);
        return click(elmntPopUp);
    }


    public boolean verifyTableGamesSubTab() {
        waitForElement(elmntCrap);
        return verifyElement(elmntCrap);
    }

    public boolean verifySlotsUnderCasino(String strAll) {
        WebElement subTabs = waitForElement(By.xpath(slotTabs.replace("<<Caps>>", strAll)));
        return verifyElement(waitForElement(subTabs));

    }

    public boolean verifyVideoPokerUnderCasino(String strPoker) {
        WebElement subPoker = waitForElement(By.xpath(slotTabs.replace("<<Caps>>", strPoker)));
        return verifyElement(waitForElement(subPoker));
    }

    public boolean verifyPromotionPageUnderCasino() {
        waitForElement(elmntPromotionPage);
        return verifyElement(elmntPromotionPage);
    }

    public boolean verifyDepositUnderPromotions() {
        focusFrame(elmntDepositFrame);
        waitForElement(elmntDepositOption);
        return verifyElement(elmntDepositOption);
    }

    public boolean verifyPromotionsPageUnderCasino() {
        waitForElement(elmntPromotionPage);
        return click(elmntPromotionPage);
    }

    public boolean verifyBonusUnderPromotion() {
        waitForElement(elmntBonusPromotionsTab);
        return click(elmntBonusPromotionsTab);
    }

    public boolean verifyPokerTabUnderPromotions() {
        waitForElement(elmntPokerTab);
        return verifyElement(elmntPokerTab);
    }

    public boolean verifyTermsUnderPromotionTab() {
        waitForElement(elmntTermsConditions);
        return click(elmntTermsConditions);
    }

    public boolean verifyConditionsUnderPromotionTab() {
        waitForElement(elmntConditions);
        return verifyElement(elmntConditions);
    }

    public boolean verifyGamesUnderFavoritesTab() {
        waitForElement(elmntGames);
        takeScreenshot("Games");
        return verifyElement(elmntGames);
    }

    public boolean verifyGamesUnderSpecialityGames() {
        waitForElement(elmntGamesUnderSpecialityGames);
        return verifyElement(elmntGamesUnderSpecialityGames);
    }

    public boolean verifyBonusUnderPromotionS() {
        waitForElement(elmntBonusPage);
        return verifyElement(elmntBonusPage);
    }

    public boolean verifyClickHereUnderPromotions() {
        waitForElement(elmntClickHereUnderPromotion);
        return click(elmntClickHereUnderPromotion);
    }

    //mobile methods


    public boolean verifyCasinoSubTabs(DataTable strTabs) {
        List<String> lstTabs = strTabs.asList(String.class);
        boolean boolResult = false;
        for (int z = 0; z < lstTabs.size(); z++) {
            if (!getTextBy(lnkClassicCasinoSubTabs.replace("<<SUBTAB>>", lstTabs.get(z))).equalsIgnoreCase(lstTabs.get(z))) {
                boolResult = false;
                break;
            } else {
                boolResult = true;
            }
        }
        return boolResult && verifyElement(waitForElement(btnClassicCasinoLeftNavigator));
    }

    public boolean verifyTableGameSelectedDefault() {
        return verifyElement(waitForElement(lnkClassicCasinoTableGames));
    }

    public boolean verifyClassicCasinoBalanceAmount() {
        return verifyElement(waitForElement(txtClassicCasinoBalanceAmount));
    }

    public boolean verifyGamesUnderTableGames() {
        return verifyElement(waitForElement(txtGamesUnderTableGames));
    }

    public boolean clickGamesUnderTableGames() {
        return click(waitForElement(txtGamesUnderTableGames));
    }

    public boolean verifyGamesConsoleForTableGameSelected() {
        return verifyElement(waitForElement(elmntTableGameConsole));
    }

    public boolean clickVideoPokerUnderClassicCasino(String strTab) {
        return click(waitForElement(By.xpath(lnkClassicCasinoSubTabs.replace("<<SUBTAB>>", strTab))));
    }

    public boolean verifyGameUnderVideoPoker() {
        return verifyElement(waitForElement(txtGamesUnderVideoPoker));
    }

    public boolean clickGamesUnderVideoPoker() {
        return click(waitForElement(txtGamesUnderVideoPoker));
    }

    public boolean verifyGamesUnderSlotGames() {
        return verifyElement(waitForElement(txtGamesUnderSlotGames));
    }

    public boolean clickGamesUnderSlotGames() {
        return click(waitForElement(txtGamesUnderSlotGames));
    }

    public boolean verifyGamesUnderFeaturedGames() {
        return verifyElement(waitForElement(txtGamesUnderFeaturedGames));
    }

    public boolean clickGamesUnderFeaturedGames() {
        return click(waitForElement(txtGamesUnderFeaturedGames));
    }

    public boolean verifyGamesUnderOtherGames() {
        return verifyElement(waitForElement(txtGamesUnderOtherGames));
    }

    public boolean clickGamesUnderOtherGames() {
        return click(waitForElement(txtGamesUnderOtherGames));
    }

    public boolean clickClassicCasinoLeftNavigator() {
        return click(waitForElement(btnClassicCasinoLeftNavigator));
    }

    public boolean verifyOptionsUnderLeftNavigator(DataTable strTabs) {
        List<String> lstTabs = strTabs.asList(String.class);

        boolean boolResult = false;
        for (int z = 2; z < 4; z++) {
            boolResult = verifyElement(waitForElement(By.xpath(elmntOptionsLeftNavigator.replace("<<OPTIONNAME>>", lstTabs.get(z)))));
        }

        return verifyElement(waitForElement(btnExitClassicCasino)) && verifyElement(waitForElement(btnCloseClassicCasinoLeftNavigator)) && boolResult;
    }

    public boolean clickExitClassicCasino() {
        return click(waitForElement(btnExitClassicCasino));
    }

    public boolean clickCloseClassicCasinoLeftNavigator() {
        return click(waitForElement(btnCloseClassicCasinoLeftNavigator));
    }

    public boolean clickClassicCasinoLanguages() {
        return click(waitForElement(By.xpath(elmntOptionsLeftNavigator.replace("<<OPTIONNAME>>", "Languages"))));
    }

    public boolean verifyClassicCasinoLanguagesAvailable(DataTable strLanguages) {
        List<String> lstLanguages = strLanguages.asList(String.class);

        boolean boolResult = false;
        for (int z = 0; z < lstLanguages.size(); z++) {
            if (!getText(waitForElement(By.xpath(txtClassicCasinoLanguages.replace("<<LANGUAGESNAME>>", lstLanguages.get(z))))).equalsIgnoreCase(lstLanguages.get(z))) {
                boolResult = false;
                break;
            } else {
                boolResult = true;
            }
        }
        return boolResult;
    }

    //Casino Mobile Methods

    public boolean clickCasinoTabUnderCasinoMobile() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            waitForElement(elmntCasinoUnderCasinoMobile);
            click(elmntCasinoUnderCasinoMobile);
            takeScreenshot("try");
            return verifyElement(waitForElement(elmntCasinoPage));
        } else {
            waitForElement(elmntCasinoUnderCasinoMobile);
            return click(elmntCasinoUnderCasinoMobile);
        }
    }

    public boolean clickDropDownUnderCasino() {
        waitForElement(elmntDropDownUnderCasinoTab);
        return click(elmntDropDownUnderCasinoTab);
    }

    public boolean verifyDropDownUnderCasino(String strDropDown) {
        WebElement subHeaders = waitForElement(By.xpath(viewDropDown.replace("<<Caps>>", strDropDown)));
        return verifyElement(waitForElement(subHeaders));

    }

    public boolean verifyDefaultFeaturedUnderCasino() {
        waitForElement(elmntDefaultTab);
        return verifyElement(elmntDefaultTab);
    }

    public boolean verifyDifferentGamesUnderFeatured() {
        waitForElement(elmntGamesUnderFeatured);
        return verifyElement(elmntGamesUnderFeatured);
    }

    public boolean clickGameUnderFeaturedTab() {
        waitForElement(elmntAnyGame);
        return click(elmntAnyGame);
    }

    public boolean verifyRedirectedGamePageUnderFeaturedTab() {
        waitForElement(elmntAnyGamePage);
        return verifyElement(elmntAnyGamePage);
    }

    public boolean clickTableGamesUnderCasinoTab() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            verifyElement(waitForElement(elmntCasinoPage));
        }
        waitForElement(elmntTableGames);
        return click(elmntTableGames);
    }

    public boolean verifyTableGmeHeadersUnderTableGames(String strTableHeaders) {
        if (strTableHeaders.equalsIgnoreCase("Baccarat")) {

            return verifyElement(waitForElement(elmntBaccarat));


        } else if (strTableHeaders.equalsIgnoreCase("Blackjack")) {

            return verifyElement(waitForElement(elmntBlackjack));
        } else if (strTableHeaders.equalsIgnoreCase("Craps and Roulette")) {
            return verifyElement(waitForElement(elmntCrapsAndRoulette));

        } else {
            return verifyElement(waitForElement(elmntTablePoker));
        }

    }

    public boolean clickAnyGameUnderTableGames() {
        waitForElement(elmntAnyGameUnderTableGames);
        return click(elmntAnyGameUnderTableGames);
    }

    public boolean verifyGamePageUnderTableGames() {
        waitForElement(elmntAnyGamePageUnderTableGames);
        return verifyElement(elmntAnyGamePageUnderTableGames);
    }

    public boolean clickVideoPokerUnderCasinoTab() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            verifyElement(waitForElement(elmntCasinoPage));
        }
        waitForElement(elmntVideoPoker);
        return click(elmntVideoPoker);
    }

    public boolean verifyGameHeaderUnderVideoPoker(String strHeaders) {
        if (strHeaders.equalsIgnoreCase("Multi-Hand")) {
            return verifyElement(waitForElement(elmntBaccarat));
        } else {
            return verifyElement(waitForElement(elmntBlackjack));
        }
    }

    public boolean clickAnyGameUnderVideoPoker() {
        waitForElement(elmntAnyGameUnderTableGames);
        return click(elmntAnyGameUnderTableGames);
    }

    public boolean clickSlotsUnderCasino() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            verifyElement(waitForElement(elmntCasinoPage));
        }
        waitForElement(elmntSlots);
        return click(elmntSlots);
    }

    public boolean verifySlotsGamesUnderCasino() {
        waitForElement(elmntAnyGameUnderTableGames);
        return verifyElement(elmntAnyGameUnderTableGames);
    }

    public boolean clickLiveCasinoBlackUnderCasino() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            verifyElement(waitForElement(elmntCasinoPage));
        }
        waitForElement(elmntLiveCasinoBlack);
        return click(elmntLiveCasinoBlack);
    }

    public boolean verifyLiveCasinoBlackUnderCasino() {
        waitForElement(elmntRedirectedPage);
        return verifyElement(elmntRedirectedPage);
    }

    public boolean verifyRedirectedPageUnderVideoPoker() {
        waitForElement(elmntVideoPokerGame);
        return verifyElement(elmntVideoPokerGame);

    }

    public void clickAnyGameUnderBlack() {
        waitForElement(elmntRedirectedPage);
        jsClick(elmntRedirectedPage);
    }

    public boolean verifyGamePageUnderBlack() {
        waitForElement(elmntGamePageUnderBlack);
        return verifyElement(elmntGamePageUnderBlack);

    }

    public boolean clickLiveCasinoRed() {
        waitForElement(elmntLiveCasinoRed);
        return click(elmntLiveCasinoRed);
    }

    public boolean verifyLiveCasinoUnderCasino() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            waitForElement(elmntCasinoPageRed);
        }
        focusFrame(elmntIframe);
        waitForElement(elmntAnyGameUnderRed);
        return verifyElement(elmntAnyGameUnderRed);
    }

    public void clickLiveCasinoRedGame() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            waitForElement(elmntAnyGameUnderRed);
            jsClick(elmntAnyGameUnderRed);
        }
        else {
            focusFrame(elmntIframe);
            waitForElement(elmntAnyGameUnderRed);
            click(elmntAnyGameUnderRed);
        }
    }

    public boolean verifyRedirectedPageUnderLiveCasinored() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            if(waitForWindows(2)) {
                focusWindow(2);
                String title = driver.getTitle();
                takeScreenshot("2");
                if (title.equals("Blackjack Early Payout")) {
                    closeWindow(2);
                    focusWindow(1);
                    return true;
                } else {
                    closeWindow(2);
                    focusWindow(1);
                    return false;
                }
            }
            else
            {
                Reporter.addStepLog("Error");
                takeScreenshot("2");
                return false;
            }
        }
        else {
            focusWindow(2);
            String title = driver.getTitle();
            System.out.println(title + "title");
            if (!title.equals("Blackjacktitle")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            waitForElement(elmntGameTabRed);
            return verifyElement(elmntGameTabRed);
        }
    }

    public boolean clickSpecialityGamesUnderCasino() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            verifyElement(waitForElement(elmntCasinoPage));
        }
        waitForElement(elmntSpecialityGames);
        return click(elmntSpecialityGames);
    }

    public boolean clickBonusAndSpinsUnderCasino() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            verifyElement(waitForElement(elmntCasinoPage));
        }
        waitForElement(elmntBonusAndSpins);
        return click(elmntBonusAndSpins);
    }

    public boolean verifyBonusAndSpinsUnderCasino() {
        waitForElement(elmntSpins);
        return verifyElement(elmntSpins);
    }

    public boolean verifyRedirectedGamePageSlotsTab() {
        waitForElement(elmntRedirectedPageUnderSlots);
        return verifyElement(elmntRedirectedPageUnderSlots);
    }

    public boolean verifyGamePageUnderSpecialityGames() {
        return verifyElement(waitForElement(elmntCasinoPage));
    }


}

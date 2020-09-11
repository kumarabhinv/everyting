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

public class SBLiveCasinoPage extends BasePage {

    public SBLiveCasinoPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//div[@class='dropdown-casino']/button[.='LIVE CASINO' or .='Live Casino']")
    protected WebElement BtnLiveCasino;

    @FindBy(how = How.XPATH, using = "//div[@id='main_tabs']//div[@id='wrapper'] ")
    protected WebElement BtnLiveCasinoPage;

    @FindBy(how = How.XPATH, using = "//div[@class='dropdown-casino']//span[contains(text(),'Black')]")
    protected WebElement BtnBlackTab;

    @FindBy(how = How.XPATH, using = "//div[@class='dropdown-casino']//span[contains(text(),'Red')]")
    protected WebElement BtnRedTab;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//iframe[@class='financialsBettingFrame']"),
            @FindBy(how = How.XPATH, using = "//div[@class='featured-games']/iframe[@id='tradologicFrame']")
    })
    protected WebElement LiveCasinoIframe;

    @FindBy(how = How.XPATH, using = "//iframe[@id='tradologicFrame']")
    protected WebElement CasinoFrame;

    @FindBy(how = How.XPATH, using = "(//div[@class='menu controller'])[2]")
    protected WebElement elmntBlackCasinoTabs;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='menu-nav-view']//ul/li/span[contains(text(),'Slots')]"),
            @FindBy(how = How.XPATH, using = "((//div[@class='menu controller'])[2]//div)[1]")
    })
    protected WebElement elmntSlotsInBlack;

    @FindBy(how = How.XPATH, using = "//div[@id='menu-nav-view']//ul/li/span[contains(text(),'Table Games')]")
    protected WebElement elmntTableGames;

    @FindBy(how = How.XPATH, using = "//div[@id='menu-nav-view']//ul/li/span[contains(text(),'Live Dealer')]")
    protected WebElement elmntLiveDealer;

    @FindBy(how = How.XPATH, using = "//div[@id='menu-nav-view']//ul/li/span[contains(text(),'Featured')]")
    protected WebElement BtnFeaturedGame;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='menu-nav-view']/descendant::li[@id='menu-nav-allgames']"),
            @FindBy(how = How.ID, using = "lobby-all-button")
    })
    protected WebElement elmntAllTabInBlack;

    @FindBy(how = How.XPATH, using = "//div[@id='desktop-view']/div[@id='header-view']")
    protected WebElement elmntBlackTab;

    @FindBy(how = How.XPATH, using = "//nav/div[@class='container ng-scope']")
    protected WebElement elmntRedTab;

    @FindAll({
            @FindBy(how = How.XPATH, using = "(//div[@id='wrapper']//div[@class='col ng-scope'])[1]"),
            @FindBy(how = How.XPATH, using = "//div[@id='content-view']/descendant::div[@id='container']")
    })
    protected WebElement elmntSlotsGames;

    @FindBy(how = How.XPATH, using = "//div[@id='content-view']/descendant::div[@id='container']")
    protected WebElement elmntTableGame;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='thumb-labels-overlay-1005']"),
            @FindBy(how = How.XPATH, using = "//div[@id='game-grid']/div[1]")
    })
    protected WebElement elmntGamesInBlackSlots;

    @FindBy(how = How.ID, using = "thumb-labels-overlay-255")
    protected WebElement getelmntTableGame;

    @FindBy(how = How.ID, using = "container")
    protected WebElement elmntLiveDealerGames;

    @FindBy(how = How.XPATH, using = "//div[@id='table-name-182'][contains(text(),'Roulette American')]")
    protected WebElement elmntLiveDealerGame;

    @FindBy(how = How.ID, using = "container")
    protected WebElement BtnFeaturedGameGames;

    @FindBy(how = How.XPATH, using = "//div[@class='container ng-scope']/li/a[contains(text(),'')]")
    protected List<WebElement> elmntRedSubTabs;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//html[@class='ng-scope']//nav/div[@class='container ng-scope']/li/a[contains(text(),'Blackjack')]"),
            @FindBy(how = How.XPATH, using = "//div[@id='lobby-blackjack-button']")})
    protected WebElement BtnBlackjack;

    @FindBy(how = How.XPATH, using = "//div[@id='lobby-holdem-button']")
    protected WebElement BtnHoldem;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='gradient']"),
            @FindBy(how = How.ID, using = "blackjack-grid-item-18")})
    protected WebElement elmntBlackjackGames;

    @FindBy(how = How.ID, using = "table-picture-vivoHoldem255")
    protected WebElement elmntHoldemGames;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='game blackjackep']/preceding::div[@class='game blackjackep']/p[1][@class='limit ng-binding']/a/span[contains(text(),'$ 5 - $ 100')]"),
            @FindBy(how = How.XPATH, using = "//div[@class='game blackjackep']/preceding::div[@class='game blackjackep']/p[1][@class='limit ng-binding']/a/span[contains(text(),'$ 250 - $ 5000')]"),
            @FindBy(how = How.XPATH, using = "//div[@class='game blackjackep']/preceding::div[@class='game blackjackep']/p[1][@class='limit ng-binding']/a/span[contains(text(),'$ 5 - $ 100')]")
    })
    protected WebElement btnCasinoTableLimits;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[@class='ng-scope']/span[contains(text(),'$ 25 - $ 2500')]"),
            @FindBy(how = How.XPATH, using = "//a[@class='ng-scope']/span[contains(text(),'$ 10 - $ 500')]")
    })
    protected WebElement elmntExclusiveGamesTableLimits;

    @FindBy(how = How.XPATH, using = "//div[@class='rows clearfix']/descendant::div[4]/table//tr/th[contains(text(),'')]")
    protected List<WebElement> elmntCasinoLeaderBoards;

    protected String strHeaderDesktop = new StringBuilder()
            .append("//div[@class='container ng-scope']/li/a[contains(text(),'")
            .append("<<TABNAME>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[@class='rows clearfix']/child::div[1]/div/div/img[@class='dealer']")
    protected WebElement elmntCasinoDealerImage;

    @FindAll({
//            @FindBy(how = How.ID, using = "wrapper"),
            @FindBy(how = How.ID, using = "games"),
            @FindBy(how = How.ID, using = "roulette-grid-item-182")})
    protected WebElement elmntRouletteInformation;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='container ng-scope']/li/a[contains(text(),'Roulette')]"),
            @FindBy(how = How.XPATH, using = "(//div[@class='menu controller'])[2]//div[@id='lobby-roulette-button']")})
    protected WebElement btnRoulette;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='container ng-scope']/li/a[contains(text(),'Baccarat')]"),
            @FindBy(how = How.XPATH, using = "((//div[@class='menu controller'])[2]//div)[7]")
    })
    protected WebElement btnBaccarat;

    @FindBy(how = How.XPATH, using = "//div[@class='container ng-scope']/li/a[contains(text(),'Super6')]")
    protected WebElement btnSuper6;

    @FindBy(how = How.XPATH, using = "//div[@class='container ng-scope']/li/a[contains(text(),'Slots')]")
    protected WebElement btnSlots;

    @FindBy(how = How.XPATH, using = "//div[@class='container ng-scope']/li/a[contains(text(),'Bingo')]")
    protected WebElement btnBingo;

    @FindBy(how = How.XPATH, using = "//div[@class='container ng-scope']/li/a[contains(text(),'Tables')]")
    protected WebElement btnTableGames;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='ng-scope']/div[@id='games']"),
            @FindBy(how = How.XPATH, using = "(//div[@class='slot-item'])[1]")})
    protected WebElement elmntCasinoGames;

    @FindBy(how = How.XPATH, using = "//div[@class='rows clearfix']/div[1][@class='col ng-scope']")
    protected WebElement elmntRoulette;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@class='rows clearfix']/descendant::div[1]//span[contains(text(),'$ 1 - $ 100')]"),
            @FindBy(how = How.XPATH, using = "(//div[@class='background'])[1]")})
    protected WebElement BtnRouletteLimits;

    @FindBy(how = How.XPATH, using = "//div[@class='rows clearfix']/descendant::a[1]/span[contains(text(),'$ 5 - $ 100')]")
    protected WebElement btnTableLimits;

    @FindBy(how = How.XPATH, using = "//div[@class='col ng-scope'][1]//a[contains(text(),'Play')]")
    protected WebElement btnSlotsGames;

    @FindBy(how = How.XPATH, using = "//button[@id='lobbyBtn']")
    protected WebElement elmntBlackSlotsGamesPage;

    @FindBy(how = How.XPATH, using = "//span[.='American Roulette']")
    protected WebElement elmntBlackAllGames;

    @FindBy(how = How.XPATH, using = "(//div[@class='background'])[1]")
    protected WebElement elmntBlackBaccaratGames;

    @FindBy(how = How.XPATH, using = "//title[.='Baccarat VIP']")
    protected WebElement elmntBlackBaccaratGamePage;

    //-------------------------------------------------------------------//

    @FindBy(how = How.XPATH, using = "//div[@class='rows clearfix']/div[@class='col ng-scope'][1]")
    protected WebElement elmntRelatedGame;

    @FindBy(how = How.XPATH, using = "//span[normalize-space(.)='LIVE CASINO']") //Desktop
    protected WebElement elmntlivecasino;

    @FindBy(how = How.XPATH, using = "//ul[@class='sub-menu-link-content']//span[contains(text(),'RED')]")
    protected WebElement elmntsubtabRed;

    @FindBy(how = How.ID, using = "tradologicFrame")
    protected WebElement elmntframe;

    @FindBy(how = How.XPATH, using = "//a[@id='toggleNav']")
    protected WebElement elmntLiveCasinoRedPage;

    @FindBy(how = How.XPATH, using = "//div[@class='ui-panel-inner']/descendant::a[contains(text(), 'Red')]")
    protected WebElement elmntsubtabRedunderHam;

    @FindBy(how = How.XPATH, using = "//a[.='Live Casino']")
    protected WebElement elmntlivecasinomobile;

    @FindBy(how = How.XPATH, using = "//nav//div[@class='container ng-scope']/li")

    protected List<WebElement> livecasinotabs;


    @FindBy(how = How.XPATH, using = "//header//a[@id='toggleNav']")
    protected WebElement toggleNav;

    protected String tabs = new StringBuilder()
            .append("//nav//div[@class='container ng-scope']")
            .append("//li[").append("normalize-space(.)='").append("<<TABNAME>>").append("']").toString();

    @FindBy(how = How.ID, using = "tradologicFrame")

    protected WebElement live_frame;

    @FindBy(how = How.XPATH, using = "//div[@class='container ng-scope']//a[normalize-space(.)='Blackjack']")
    protected WebElement elmntBlackjack;

    @FindBy(how = How.XPATH, using = "//div[@id=\"games\"]/div/div[1]//div/img")
    protected WebElement elmntMouseHoverBlackjackGames;


    @FindBy(how = How.XPATH, using = "(//span[@class='box ng-binding'])[1]")
    protected WebElement clcktablelimits;

    @FindBy(how = How.XPATH, using = "(//div[@class='game blackjack']//descendant::span[.='$ 10 - $ 500'])[1]")
    protected WebElement clckNonExclusiveTableLimits;

    @FindBy(how = How.XPATH, using = "//span[.='$ 10 - $ 1000']")
    protected WebElement clckExclusiveTableLimits;

    @FindBy(how = How.XPATH, using = "//table[@id='lbtable']")
    protected WebElement elmntLeaderBoard;

    @FindBy(how = How.XPATH, using = "//a[.='Roulette']")
    protected WebElement elmntRouletteTab;

    @FindBy(how = How.XPATH, using = "(//div[@id='games']//div[@class='col ng-scope'])[1]")
    protected WebElement elmntRouletteGames;

    @FindBy(how = How.XPATH, using = "(//div[@class='game roulette']//span[.='$ 1 - $ 100'])[1]")
    protected WebElement elmntRouletteTableLimits;

    //    @FindBy(how = How.XPATH, using = "//input[@id='screen-name-input']")
    @FindBy(how = How.XPATH, using = "//canvas[@id='pixi']")
    protected WebElement elmntTableLimits;

    @FindBy(how = How.XPATH, using = "//div[@class='container ng-scope']//a[normalize-space(.)='Slots']")
    protected WebElement elmntSlotsTab;

    @FindBy(how = How.XPATH, using = "(//div[@class='overlay clearfix']/a[normalize-space(.)='Play'])[1]")
    protected WebElement elmntPlay;


    @FindBy(how = How.XPATH, using = "//div[@class='container ng-scope']//a[normalize-space(.)='Baccarat']")
    protected WebElement elmntBaccaratTab;

    @FindBy(how = How.XPATH, using = "//div[@class='col ng-scope'][1]//a[1]/child::span[1]")
    protected WebElement elmntTableLimit;


    @FindBy(how = How.XPATH, using = "//div[@class='container ng-scope']//a[normalize-space(.)='Super6']")
    protected WebElement elmntSuper6Tab;

    @FindBy(how = How.XPATH, using = "//div[@class='container ng-scope']//a[normalize-space(.)='Tables']")
    protected WebElement elmntTablesTab;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'col ng-scope')][1]/descendant::a[2]")
    protected WebElement elmntPlayBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='container ng-scope']//a[normalize-space(.)='Bingo']")
    protected WebElement elmntBingoTab;


    @FindBy(how = How.XPATH, using = "//ul[@class='sub-menu-link-content']//following::span[.='BLACK']")
    protected WebElement elmntBlackUnderLiveCasino;

    @FindBy(how = How.XPATH, using = "//ul[@class='sub-menu-link-content']//following::span[.='RED']")
    protected WebElement elmntRedUnderLiveCasino;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='lobby']"),
            @FindBy(how = How.XPATH, using = "//div[@id='account-view']")
    })
    protected WebElement elmntContentsForLivecasinoBlack;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Slots')]")
    protected WebElement elmntSlotsUnderLiveLobbyPage;

    //    @FindBy(how = How.XPATH, using = "//div[@id='thumb-labels-overlay-1005']")
    @FindBy(how = How.XPATH, using = "//div[@id='game-grid']/descendant::div[1]")
    protected WebElement elmntSlotRelatedGames;

    //    @FindBy(how = How.XPATH, using = "//div[@id='thumb-labels-overlay-1005']")
    @FindBy(how = How.XPATH, using = "//div[@id='game-grid']/descendant::div[1]")
    protected WebElement elmntAnyGameUnderSlotsLiveLobby;

    @FindBy(how = How.XPATH, using = "//div[@id='brim-main']")
    protected WebElement elmntLiveGamesStarted;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//div[@id='lobby-blackjack-button']"),
            @FindBy(how = How.XPATH, using = "//li[@id='menu-nav-blackjack']")
    })
    protected WebElement elmntBlackjackUnderLiveLobbyPage;

    //    @FindBy(how = How.XPATH, using = "(//div[contains(@id, 'thumb-labels-overlay')])[1]")
    @FindBy(how = How.XPATH, using = "//div[@id='game-grid']/descendant::div[@id='picture'][1]")
    protected WebElement elmntBlackjackRelatedGames;

    //    @FindBy(how = How.XPATH, using = "//div[@id='table-view-18']")
    @FindBy(how = How.XPATH, using = "//div[@id='game-grid']/descendant::div[@id='picture'][1]")
    protected WebElement elmntAnyGameUnderBlackJackLiveLobby;

    @FindBy(how = How.XPATH, using = "//div[@id='content']")
    protected WebElement elmntLiveGamesStartedUnderBlackJack;

    @FindBy(how = How.XPATH, using = "//li[@id='menu-nav-dealer']")
    protected WebElement elmntLiveDealerUnderLiveLobbyPage;

    @FindBy(how = How.XPATH, using = "//div[@id='game-grid']/descendant::div[@class='picture'][1]")
    protected WebElement elmntLiveDealerRelatedGames;

    @FindBy(how = How.XPATH, using = "//div[@id='main-view']")
    protected WebElement elmntLiveGamesStartedUnderLiveDealer;

    @FindBy(how = How.XPATH, using = "//li[@id='menu-nav-featured']")
    protected WebElement elmntFeaturedUnderLiveLobbyPage;

    @FindBy(how = How.XPATH, using = "//div[@id='lobby-all-button']")
    protected WebElement elmntAllOptionUnderLiveLobbyPage;

    @FindBy(how = How.XPATH, using = "//div[@id='toolbar-option-fullscreen']")
    protected WebElement elmntFullScreenIcon;

    @FindBy(how = How.XPATH, using = "//div[@id='toolbar-option-settings']")
    protected WebElement elmntSettingIcon;

    @FindBy(how = How.XPATH, using = "//div[@class='setting-row text-heading-3'][2]")
    protected WebElement elmntCurrentVersion;

    @FindBy(how = How.XPATH, using = "(//div[@class='close-icon released'])[2]")
    protected WebElement elmntCloseIcon;

    @FindBy(how = How.XPATH, using = "//div[@id='toolbar-home-button']")
    protected WebElement elmntHomeIcon;

    @FindBy(how = How.XPATH, using = "//img[@class='brand']")
    protected WebElement imgBanner;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'USD')]")
    protected WebElement elmntLiveLobbyPageHeader;

    @FindBy(how = How.XPATH, using = "//div[@id='lobby-baccarat-button']")
    protected WebElement elmntBaccaratUnderBlack;

    @FindBy(how = How.XPATH, using = "//div[@id='lobby-roulette-button']")
    protected WebElement elmntRouletteUnderBlack;

    @FindBy(how = How.XPATH, using = "//div[@id='lobby-holdem-button']")
    protected WebElement elmntHoldemUnderBlack;

    @FindBy(how = How.XPATH, using = "//div[@id='game-grid']/descendant::div[@class='picture'][1]")
    protected WebElement elmntGameUnderBaccRoulettAndHoldem;

    @FindBy(how = How.XPATH, using = "//div[@id='main']")
    protected WebElement elmntLiveGamesStartedUnderBaccarat;

    @FindBy(how = How.XPATH, using = "//div[@id='main-view']")
    protected WebElement elmntLiveGamesStartedUnderRoulette;

    @FindBy(how = How.XPATH, using = "//div[@id='toolbar-language-button']")
    protected WebElement elmntLanguagesUnderLiveCasinoBlack;

    @FindBy(how = How.XPATH, using = "//ul[@id='language-list']/descendant::li[@lang='en']")
    protected WebElement elmntLanguagesList;


    //Regression Methods
    public void mouseHoverLiveCasino() {
        waitForElement(BtnLiveCasino);
        mouseOver(BtnLiveCasino);
    }

    public boolean verifyLiveCasinoSubTabs(String strTabName) {
        if (strTabName.toLowerCase().contains("Red".toLowerCase())) {
            return (verifyElement(waitForElement(BtnRedTab)));
        } else if (strTabName.toLowerCase().contains("Black".toLowerCase())) {
            return (verifyElement(waitForElement(BtnBlackTab)));
        } else {
            return false;
        }

    }

    public void ClickBlackTab() {
        waitForElement(BtnBlackTab);
        click(BtnBlackTab);

    }

    public void clickRedTab() {
        waitForElement(BtnRedTab);
        click(BtnRedTab);
        focusBackToDefaultFrame();
        focusFrame(LiveCasinoIframe);
    }

    public boolean verifyLiveCasinoTabs() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            focusFrame(waitForElement(LiveCasinoIframe));
            verifyElement(waitForElement(elmntSlotsInBlack));
            verifyElement(waitForElement(elmntTableGames));
            verifyElement(waitForElement(elmntLiveDealer));
            verifyElement(waitForElement(BtnFeaturedGame));
            verifyElement(waitForElement(elmntAllTabInBlack));
            return focusBackToDefaultFrame();
        } else {
            focusFrame(waitForElement(LiveCasinoIframe));
            boolean blackCasinotTabs = verifyElement(waitForElement(elmntBlackCasinoTabs));
            focusBackToDefaultFrame();
            return blackCasinotTabs;
        }
    }


    public boolean verifyBlackTab() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            focusFrame(LiveCasinoIframe);
            waitForElement(elmntBlackTab);
            return verifyElement(elmntBlackTab);
        } else {
            focusBackToDefaultFrame();
            focusFrame(LiveCasinoIframe);
            waitForElement(elmntBlackCasinoTabs);
            return verifyElement(elmntBlackCasinoTabs);
        }
    }

    public boolean verifyRedTab() {
        if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            focusBackToDefaultFrame();
        }
        focusFrame(CasinoFrame);
        waitForElement(elmntRedTab);
        return verifyElement(elmntRedTab);
    }

    public void clickSlotsTabInBlack() {
        waitForElement(elmntSlotsInBlack);
        jsClick(elmntSlotsInBlack);
    }

    public boolean verifySlotsGames() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            waitForElement(elmntSlotsGames);
            verifyElement(elmntSlotsGames);
        } else {
            waitForElement(elmntGamesInBlackSlots);
            verifyElement(elmntGamesInBlackSlots);
        }
        return focusBackToDefaultFrame();
    }

    public void clickSlotsGamesInBlack() {
        verifyElement(waitForElement(elmntGamesInBlackSlots));
        click(elmntGamesInBlackSlots);
        focusBackToDefaultFrame();
    }

    public void clickSlotsGames() {
        waitForElement(elmntGamesInBlackSlots);
        click(elmntGamesInBlackSlots);
    }

    public void verifyGamepage() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            String text = driver.getTitle();
            System.out.println(text);
            waitForSeconds(5);
            text.equalsIgnoreCase("Live Dealer Casino - Play Live Blackjack, Roulette & Baccarat");
            driver.close();
            focusBackToDefaultFrame();
        } else {
            focusWindow(2);
            //     boolean slotsGame = verifyElement(waitForElement(elmntBlackSlotsGamesPage));
            takeScreenshot("Game");
            String gameTilte = driver.getTitle();
            System.out.println("GameName>>>>>>>>>>" + gameTilte);
            closeWindow(2);
            focusWindow(1);
        }
    }

    public void verifyBlackGamespage() {
        waitForSeconds(3);
        focusWindow(2);
        //     boolean slotsGame = verifyElement(waitForElement(elmntBlackSlotsGamesPage));
        takeScreenshot("Game");
        String gameTilte = driver.getTitle();
        System.out.println("GameName>>>>>>>>>>" + gameTilte);
        closeWindow(2);
        focusWindow(1);

    }

    public void clickTableGamesInBlack() {
        waitForElement(elmntTableGames);
        click(elmntTableGames);
    }

    public void clickTableGames() {
        waitForElement(elmntTableGames);
        click(elmntTableGames);
    }

    public boolean verifyTableGames() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            waitForSeconds(4);
            waitForElement(elmntRelatedGame);
            takeScreenshot("TableGames Verified");
            return verifyElement(elmntRelatedGame);
        }
        waitForElement(elmntTableGame);
        verifyElement(elmntTableGame);
        return focusBackToDefaultFrame();
    }

    public void clickTableGame() {
        waitForElement(getelmntTableGame);
        click(getelmntTableGame);
    }

    public boolean verifyTableGamepage() {
        waitForSeconds(5);
        String text = driver.getTitle();
        System.out.println(text);
        text.equalsIgnoreCase("Live Dealer Casino - Play Live Blackjack, Roulette & Baccarat");
        driver.close();
        return focusBackToDefaultFrame();
    }

    public void clickLiveDealer() {
        waitForElement(elmntLiveDealer);
        click(elmntLiveDealer);
    }

    public void clickLiveDealerGames() {
        waitForElement(elmntLiveDealerGame);
        click(elmntLiveDealerGame);
    }

    public boolean verifyLiveDealerGamePage() {
        waitForSeconds(5);
        String text = driver.getTitle();
        System.out.println(text);
        text.equalsIgnoreCase("Live Dealer Casino - Play Live Blackjack, Roulette & Baccarat");
        driver.close();
        return focusBackToDefaultFrame();
    }

    public void clickFeaturedTabInLiveCasino() {
        waitForElement(BtnFeaturedGame);
        click(BtnFeaturedGame);
    }

    public boolean verifyLiveDealerGames() {
        waitForElement(elmntLiveDealerGames);
        verifyElement(elmntLiveDealerGames);
        return focusBackToDefaultFrame();
    }

    public void clickGameInFeaturedPage() {
        waitForElement(elmntLiveDealerGame);
        click(elmntLiveDealerGame);
    }

    public boolean verifyFeaturedGamesInLiveCasino() {
        waitForElement(BtnFeaturedGameGames);
        verifyElement(BtnFeaturedGameGames);
        return focusBackToDefaultFrame();
    }

    public void clickAllTabInLiveCasino() {
        waitForElement(elmntAllTabInBlack);
        click(elmntAllTabInBlack);
    }

    public boolean verifyGamesInAllTab() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            verifyElement(waitForElement(BtnFeaturedGameGames));
        } else {
            verifyElement(waitForElement(elmntBlackAllGames));
        }
        return focusBackToDefaultFrame();
    }

    public boolean verifyRedGamesInLiveCasino(DataTable Table) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            focusFrame(waitForElement(CasinoFrame));
        } else {
            waitForSeconds(3);
            focusBackToDefaultFrame();
            focusFrame(LiveCasinoIframe);
        }
        List<String> lstdata = Table.asList(String.class);
        compareList(waitForElements(elmntRedSubTabs), lstdata);
        System.out.println(lstdata);
        return focusBackToDefaultFrame();
    }

    public void verifyCasinoBlackjackGames() {
        waitForElement(BtnBlackjack);
        verifyElement(BtnBlackjack);
    }

    public void clickBlackjackTabInLiveCasino() {
        if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            focusBackToDefaultFrame();
            focusFrame(LiveCasinoIframe);
        }
        waitForSeconds(5);
        waitForElement(BtnBlackjack);
        click(BtnBlackjack);
    }

    public void clickHoldemInLiveCasinoBlack() {
        focusBackToDefaultFrame();
        focusFrame(LiveCasinoIframe);
        waitForSeconds(5);
        waitForElement(BtnHoldem);
        click(BtnHoldem);
    }

    public boolean verifyBlackJackGamesInLiveCasino() {
        waitForSeconds(5);
        waitForElement(elmntBlackjackGames);
        return verifyElement(elmntBlackjackGames);
    }

    public boolean verifyHoldemGamesInLiveCasino() {
        waitForSeconds(5);
        waitForElement(elmntHoldemGames);
        return verifyElement(elmntHoldemGames);
    }

    public void clickLiveCasinoTableLimits() {
        waitForElement(btnCasinoTableLimits);
        String text = btnCasinoTableLimits.getText();
        System.out.println(text);
        click(btnCasinoTableLimits);
    }

    public void clickRouletteableLimits() {
        waitForElement(BtnRouletteLimits);
        String text = BtnRouletteLimits.getText();
        System.out.println(text);
        click(BtnRouletteLimits);
    }

    public boolean clickBlackJackTableLimits() {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            waitForElement(clcktablelimits);
            return click(clcktablelimits);
        }
        waitForElement(BtnRouletteLimits);
        String text = BtnRouletteLimits.getText();
        System.out.println(text);
        return click(BtnRouletteLimits);
    }

    public void clickHoldemTableLimits() {
        waitForElement(BtnRouletteLimits);
        String text = BtnRouletteLimits.getText();
        System.out.println(text);
        click(BtnRouletteLimits);
    }


    public void verifyLiveCasinoGamepage() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            driver.getWindowHandles();
            String newTitle = driver.getTitle();
            System.out.println(newTitle);
            focusBackToDefaultFrame();
        } else {
            focusWindow(2);
            //     boolean slotsGame = verifyElement(waitForElement(elmntBlackSlotsGamesPage));
            takeScreenshot("Game");
            String gameTilte = driver.getTitle();
            System.out.println("GameName>>>>>>>>>>" + gameTilte);
            closeWindow(2);
            focusWindow(1);
        }

    }

    public void clickCasinoExclusiveTableLimits() {
        waitForElement(elmntExclusiveGamesTableLimits);
        String text = elmntExclusiveGamesTableLimits.getText();
        System.out.println(text);
        click(elmntExclusiveGamesTableLimits);
    }

    public void clickCasinoGames(String strtabs) {
        focusFrame(waitForElement(CasinoFrame));
        WebElement btnHeaderTab1 = waitForElement(By.xpath(strHeaderDesktop.replace("<<CAPS>>", startsWithCapitalize(strtabs)).replace("<<TABNAME>>", strtabs)));
        waitForSeconds(2);
        click(btnHeaderTab1);
    }

    public void mouseHoverCasinoDealerNames() {
        waitForSeconds(5);
        waitForElement(elmntCasinoDealerImage);
        mouseOver(elmntCasinoDealerImage);
    }

    public boolean verifyCasinoLeaderBoardStats(DataTable Table) {
        List<String> lstdata = Table.asList(String.class);
        compareList(waitForElements(elmntCasinoLeaderBoards), lstdata);
        return focusBackToDefaultFrame();
    }

    public void clickRouletteOption() {
        focusFrame(waitForElement(CasinoFrame));
        waitForElement(btnRoulette);
        click(btnRoulette);
    }

    public void verifyRoulettePage() {
        if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            focusBackToDefaultFrame();
            focusFrame(LiveCasinoIframe);
        }
        waitForElement(btnRoulette);
        click(btnRoulette);
    }

    public boolean verifyRouletteGames() {
        waitForElement(elmntRouletteInformation);
        return verifyElement(elmntRouletteInformation);
    }

    public void clickBaccarat() {
        if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            focusBackToDefaultFrame();
            focusFrame(LiveCasinoIframe);
        }
        waitForElement(btnBaccarat);
        jsClick(btnBaccarat);
    }


    public boolean clickSuper6Tab() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).contains(Constants.ENV_VARIABLE_MOBILE)) {
            waitForframeToBeAvailableAndSwitchToIt(driver, live_frame);
            click(waitForElement(toggleNav));
            waitForElement(elmntSuper6Tab);
            return click(elmntSuper6Tab);
        } else {
            focusBackToDefaultFrame();
            focusFrame(waitForElement(CasinoFrame));
            waitForElement(btnSuper6);
            return click(btnSuper6);
        }
    }


    public boolean verifyBaccaratGames() {
        waitForElement(elmntCasinoGames);
        boolean games = verifyElement(elmntCasinoGames);
        focusBackToDefaultFrame();
        return games;
    }

    public boolean verifyBlackjackInformation() {
        waitForElement(elmntCasinoGames);
        return verifyElement(elmntCasinoGames);
    }

    public boolean verifyCasinoGames() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            waitForSeconds(4);
            waitForElement(elmntRelatedGame);
            takeScreenshot("TableGames Verified");
            return verifyElement(elmntRelatedGame);
        }
        waitForElement(elmntCasinoGames);
        return verifyElement(elmntCasinoGames);
    }


    public boolean clickRouletteTab() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            focusFrame(waitForElement(live_frame));
            click(waitForElement(toggleNav));
            waitForElement(elmntRouletteTab);
            return click(elmntRouletteTab);
        } else {
            focusBackToDefaultFrame();
            focusFrame(waitForElement(LiveCasinoIframe));
        }
        waitForElement(btnRoulette);
        return click(btnRoulette);
    }

    public void verifyBaccaratPage() {
        waitForElement(btnBaccarat);
        click(btnBaccarat);
    }

    public void clickCasinoTableLimits() {
        waitForElement(btnTableLimits);
        click(btnTableLimits);
    }

    public void verifySuper6Tab() {
        waitForElement(btnSuper6);
        click(btnSuper6);
    }

    public void verifyLiveCasinoRedSlotspage() {
        waitForElement(btnSlots);
        click(btnSlots);
    }

    public void verifyLiveCasinoRedTablespage() {
        waitForElement(btnTableGames);
        click(btnTableGames);
    }

    public void verifyBingoGamesPage() {
        waitForElement(btnBingo);
        click(btnBingo);
    }

    public void clickCasinoRedSlotsTab() {
        if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            focusBackToDefaultFrame();
        }
        focusFrame(waitForElement(CasinoFrame));
        waitForElement(btnSlots);
        click(btnSlots);
    }

    public void clickCasinoRedTablesTab() {
        if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            focusBackToDefaultFrame();
        }
        focusFrame(waitForElement(CasinoFrame));
        waitForElement(btnTableGames);
        click(btnTableGames);
    }

    public void clickRedSlotsPlayBtn() {
        waitForElement(btnSlotsGames);
        click(btnSlotsGames);
    }

    public void clickBingoGames() {
        if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            focusBackToDefaultFrame();
        }
        focusFrame(waitForElement(CasinoFrame));
        waitForElement(btnBingo);
        click(btnBingo);
    }

    public void clickBaccaratGame() {
        verifyElement(waitForElement(elmntBlackBaccaratGames));
        click(elmntBlackBaccaratGames);
        focusBackToDefaultFrame();
    }

    public boolean verifyBaccaratGamePage() {
        focusWindow(2);
        boolean baccaratGame = verifyElement(waitForElement(elmntBlackBaccaratGamePage));
        closeWindow(2);
        focusWindow(1);
        return baccaratGame;

    }

    //----------------------------------------------------------//

    public boolean clickLiveCasino() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).contains(Constants.ENV_VARIABLE_MOBILE)) {
            waitForSeconds(4);
            waitForElement(elmntlivecasino);
            return click(elmntlivecasino);
        } else {
            mouseOver(elmntlivecasino);
            waitForElement(elmntlivecasino);
            return click(elmntlivecasino);
        }
    }

    public boolean clickSubTabRed() {
        waitForSeconds(2);
        waitForElement(elmntsubtabRed);
        return click(elmntsubtabRed);

    }


    public boolean verifyLiveCasinoRedPage() {
        focusFrame(waitForElement(elmntframe));
        return verifyElement(waitForElement(elmntLiveCasinoRedPage));
    }

    public boolean clickSubTabRedunderHam() {
        waitForElement(elmntsubtabRedunderHam);
        return click(elmntsubtabRedunderHam);
    }

    public boolean clickLiveCasinounderHam() {
        waitForElement(elmntlivecasinomobile);
        return click(elmntlivecasinomobile);
    }


    public boolean verifygametypes(DataTable Table) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).contains(Constants.ENV_VARIABLE_MOBILE)) {
            focusFrame(waitForElement(live_frame));
            List<String> lstdata = Table.asList(String.class);
            click(waitForElement(toggleNav));
            compareList(waitForElements(livecasinotabs), lstdata);
            return focusBackToDefaultFrame();
        } else {
            focusFrame(waitForElement(live_frame));
            List<String> lstdata = Table.asList(String.class);
            compareList(waitForElements(livecasinotabs), lstdata);
            return focusBackToDefaultFrame();

        }
    }

    public boolean clickBlackJackTab() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).contains(Constants.ENV_VARIABLE_MOBILE)) {
            focusFrame(waitForElement(live_frame));
            verifyElement(waitForElement(imgBanner));
            jsClick(waitForElement(toggleNav));
            waitForElement(elmntBlackjack);
            return click(elmntBlackjack);
        } else {
            focusFrame(waitForElement(live_frame));
            waitForElement(elmntBlackjack);
            return click(elmntBlackjack);
        }
    }

    public boolean verifyBlackJackPage() {
        return verifyElement(waitForElement(elmntBlackjackGames));
    }

    public void verifyNewTabUnderLiveCasino() {
        if (waitForWindows(2)) {
            focusWindow(2);
            takeScreenshot("tablelimitnewwindow");
            verifyElement(waitForElement(elmntTableLimits));
            closeWindow(2);
            focusWindow(1);
        } else {
            Reporter.addStepLog("New Tab not opened");
        }
    }

    public boolean clickNonExclusiveTableLimits() {
        jsScrollDown();
        waitForElement(clckNonExclusiveTableLimits);
        return click(clckNonExclusiveTableLimits);
    }

    public boolean clickExclusiveTableLimits() {
        waitForElement(clckExclusiveTableLimits);
        return click(clckExclusiveTableLimits);
    }

    public void MouseHoverLivecasinoGames() {
        mouseOver(elmntMouseHoverBlackjackGames);
    }

    public boolean verifyLeaderBoard() {
        return verifyElement(waitForElement(elmntLeaderBoard));
    }

    public boolean verifyRoulettegames() {
        return verifyElement(waitForElement(elmntRouletteGames));
    }

    public boolean clickRouletteTableLimits() {
        waitForElement(elmntRouletteTableLimits);
        return click(elmntRouletteTableLimits);
    }

    public boolean clickSlotsTab() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).contains(Constants.ENV_VARIABLE_MOBILE)) {
            focusFrame(waitForElement(live_frame));
            click(waitForElement(toggleNav));
            waitForElement(elmntSlotsTab);
            return click(elmntSlotsTab);
        } else {
            focusFrame(waitForElement(live_frame));
            waitForElement(elmntSlotsTab);
            return click(elmntSlotsTab);
        }
    }

    public boolean verifySlotgames() {
        waitForSeconds(4);
        return verifyElement(waitForElement(elmntSlotsGames));

    }

    public boolean clickPlayOption() {
        jsScrollDown();
        waitForSeconds(6);
        waitForElement(elmntPlay);
        return click(elmntPlay);
    }

    public void verifyNewTabGames() {
        waitForSeconds(4);
        focusWindow(2);
        takeScreenshot("tablelimitnewwindow");
        //  verifyElement(waitForElement(elmntNewTabGames));
        closeWindow(2);
        focusWindow(1);
    }


//    @FindBy(how = How.XPATH, using = "//nav//div[@class='container ng-scope']/li")
//
//    protected List<WebElement> livecasinotabs;


    // Regression Scenarios
    public boolean clickBaccaratTab() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).contains(Constants.ENV_VARIABLE_MOBILE)) {
            waitForframeToBeAvailableAndSwitchToIt(driver, live_frame);    // Its Yasin Fixed
//        focusFrame(waitForElement(live_frame));  // It's my method
            click(waitForElement(toggleNav));
            waitForElement(elmntBaccaratTab);
            return click(elmntBaccaratTab);
        } else {
            waitForframeToBeAvailableAndSwitchToIt(driver, live_frame);    // Its Yasin Fixed
//        focusFrame(waitForElement(live_frame));  // It's my method
            waitForElement(elmntBaccaratTab);
            return click(elmntBaccaratTab);
        }
    }

    public boolean verifyBaccaratGame() {
        waitForElement(elmntRelatedGame);
        takeScreenshot("BaccaratGames Verified");
        return verifyElement(elmntRelatedGame);
    }


    public boolean clickTableLimits() {
        waitForElement(elmntTableLimit);
        return click(elmntTableLimit);
    }

    public boolean verifySuper6Games() {
        waitForElement(elmntRelatedGame);
        takeScreenshot("Super6 Games Verified");
        return verifyElement(elmntRelatedGame);
    }

    public boolean clickTablesTab() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).contains(Constants.ENV_VARIABLE_MOBILE)) {
            waitForframeToBeAvailableAndSwitchToIt(driver, live_frame);
            click(waitForElement(toggleNav));
            waitForElement(elmntTablesTab);
            return click(elmntTablesTab);
        } else {
            waitForframeToBeAvailableAndSwitchToIt(driver, live_frame);
            waitForElement(elmntTablesTab);
            return click(elmntTablesTab);
        }
    }


//    public boolean clickPlaybtn() {
//        waitForElement(elmntPlayBtn);
//        return click(elmntPlayBtn);
//    }

    public boolean clickBingoTab() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).contains(Constants.ENV_VARIABLE_MOBILE)) {
            waitForframeToBeAvailableAndSwitchToIt(driver, live_frame);
            click(waitForElement(toggleNav));
            waitForElement(elmntBingoTab);
            return click(elmntBingoTab);
        } else {
            waitForframeToBeAvailableAndSwitchToIt(driver, live_frame);
            waitForElement(elmntBingoTab);
            return click(elmntBingoTab);
        }
    }

    public boolean verifyBingoGames() {
        waitForSeconds(4);
        waitForElement(elmntRelatedGame);
        takeScreenshot("BingoGames Verified");
        return verifyElement(elmntRelatedGame);

    }

    public boolean verifyLiveCasinoOptions(String strTabName) {
        if (strTabName.equalsIgnoreCase("RED")) {
            waitForSeconds(4);
            return click(waitForElement(elmntRedUnderLiveCasino));
        } else {
            waitForSeconds(4);
            return click(waitForElement(elmntBlackUnderLiveCasino));
        }
    }


    public boolean clickBlackUnderLiveCasino() {
        waitForSeconds(6);
        return click(waitForElement(elmntBlackUnderLiveCasino));
    }

    public boolean verifyContentsForLivecasinoBlack() {
        waitForSeconds(6);
        takeScreenshot("verifyContentsForLivecasinoBlack");
        return verifyElement(waitForElement(elmntContentsForLivecasinoBlack));
    }

    public boolean clickSlotsUnderLiveLobbyPage() {
//        waitForSeconds(4);
        verifyElement(waitForElement(elmntLiveLobbyPageHeader));
        return click(waitForElement(elmntSlotsUnderLiveLobbyPage));
    }


    public boolean verifySlotRelatedGames() {
        return verifyElement(waitForElement(elmntSlotRelatedGames));
    }

    public boolean clickAnyGameUnderSlotsLiveLobby() {
        waitForSeconds(4);
        return click(waitForElement(elmntAnyGameUnderSlotsLiveLobby));
    }

    public boolean verifyLiveGamesStarted() {
        if (waitForWindows(2)) {
            focusWindow(2);
            verifyElement(waitForElement(elmntLiveGamesStarted));
            closeWindow(2);
            focusWindow(1);
            return true;
        } else {
            Reporter.addStepLog("Game console not visible");
            return false;
        }
    }

    public boolean clickBlackjackUnderLiveLobbyPage() {
//        waitForSeconds(4);
        verifyElement(waitForElement(elmntLiveLobbyPageHeader));
        return click(elmntBlackjackUnderLiveLobbyPage);
    }


    public boolean verifyBlackjackRelatedGames() {
        return verifyElement(waitForElement(elmntBlackjackRelatedGames));
    }

    public boolean clickAnyGameUnderBlackJackLiveLobby() {
//        waitForSeconds(4);
        return click(waitForElement(elmntAnyGameUnderBlackJackLiveLobby));
    }


    public boolean verifyLiveGamesStartedUnderBlackJack() {
        if(waitForWindows(2)) {
            focusWindow(2);
            verifyElement(waitForElement(elmntLiveGamesStartedUnderBlackJack));
            closeWindow(2);
            focusWindow(1);
            return true;
        }
        return false;
    }


    public boolean clickLiveDealerUnderLiveLobbyPage() {
//        waitForSeconds(4);
        return click(waitForElement(elmntLiveDealerUnderLiveLobbyPage));
    }

    public boolean verifyLiveDealerRelatedGames() {
        return verifyElement(waitForElement(elmntLiveDealerRelatedGames));
    }

    public boolean clickAnyGameUnderLiveDealerLiveLobby() {
        waitForSeconds(4);
        return click(waitForElement(elmntLiveDealerRelatedGames));
    }

    public boolean verifyLiveGamesStartedUnderLiveDealer() {
        waitForSeconds(6);
        return verifyElement(waitForElement(elmntLiveGamesStartedUnderLiveDealer));
    }

    public boolean clickFeaturedUnderLiveLobbyPage() {
        waitForSeconds(4);
        return click(waitForElement(elmntFeaturedUnderLiveLobbyPage));
    }

    public boolean verifyFeaturedRelatedGames() {
        return verifyElement(waitForElement(elmntLiveDealerRelatedGames));
    }

    public boolean clickAnyGameUnderFeaturedLiveLobby() {
        waitForSeconds(4);
        return click(waitForElement(elmntLiveDealerRelatedGames));
    }

    public boolean verifyLiveGamesStartedUnderFeatured() {
        waitForSeconds(6);
        return verifyElement(waitForElement(elmntLiveGamesStartedUnderLiveDealer));
    }

    public boolean clickAllOptionUnderLiveLobbyPage() {
//        waitForSeconds(4);
        verifyElement(waitForElement(elmntLiveLobbyPageHeader));
        return click(waitForElement(elmntAllOptionUnderLiveLobbyPage));
    }

    public boolean verifyAllOptionsRelatedGames() {
        return verifyElement(waitForElement(elmntLiveDealerRelatedGames));
    }


    public boolean clickAnyGameUnderAlloptionsLiveLobby() {
//        waitForSeconds(4);
        return click(waitForElement(elmntLiveDealerRelatedGames));
    }

    public boolean verifyLiveGamesStartedUnderAllOptions() {
        if(waitForWindows(2)) {
            focusWindow(2);
            verifyElement(waitForElement(elmntLiveGamesStartedUnderLiveDealer));
            closeWindow(2);
            focusWindow(1);
            return true;
        }
        return false;
    }

    public boolean clickFullScreenIcon() {
        waitForSeconds(2);
        return click(waitForElement(elmntFullScreenIcon));
    }

    public boolean verifyExpandedFullScreenIcon() {
        return verifyElement(waitForElement(elmntFullScreenIcon));
    }

    public boolean verifyFullScreenIcon() {
        return verifyElement(waitForElement(elmntFullScreenIcon));
    }

    public boolean clickSettingIcon() {
        return click(waitForElement(elmntSettingIcon));
    }

    public boolean verifyCurrentVersion() {
        return verifyElement(waitForElement(elmntCurrentVersion));
    }

    public boolean clickCloseIcon() {
        return click(waitForElement(elmntCloseIcon));
    }

    public boolean verifyPopUpGetsDisappears() {
        return verifyElement(waitForElement(elmntSettingIcon));
    }

    public boolean clickHomeIcon() {
        return click(waitForElement(elmntHomeIcon));
    }


    public boolean clickLeftNavigator() {
        return click(waitForElement(toggleNav));
    }


    public boolean clickBaccaratUnderBlack() {
        verifyElement(waitForElement(elmntLiveLobbyPageHeader));
        return click(waitForElement(elmntBaccaratUnderBlack));
    }

    public boolean clickRouletteUnderBlack() {
        verifyElement(waitForElement(elmntLiveLobbyPageHeader));
        return click(waitForElement(elmntRouletteUnderBlack));
    }

    public boolean clickHoldemUnderBlack() {
        verifyElement(waitForElement(elmntLiveLobbyPageHeader));
        return click(waitForElement(elmntHoldemUnderBlack));
    }

    public boolean verifyBaccaratRelatedGames() {
        return verifyElement(waitForElement(elmntGameUnderBaccRoulettAndHoldem));
    }

    public boolean verifyRouletteRelatedGames() {
        return verifyElement(waitForElement(elmntGameUnderBaccRoulettAndHoldem));
    }

    public boolean verifyHoldemRelatedGames() {
        return verifyElement(waitForElement(elmntGameUnderBaccRoulettAndHoldem));
    }

    public boolean clickAnyGameUnderBaccarat() {
        return click(waitForElement(elmntGameUnderBaccRoulettAndHoldem));
    }

    public boolean clickAnyGameUnderRoulette() {
        return click(waitForElement(elmntGameUnderBaccRoulettAndHoldem));
    }

    public boolean clickAnyGameUnderHoldem() {
        return click(waitForElement(elmntGameUnderBaccRoulettAndHoldem));
    }

    public boolean verifyLiveGameBaccarat() {
        if(waitForWindows(2)) {
            focusWindow(2);
            verifyElement(waitForElement(elmntLiveGamesStartedUnderBaccarat));
            closeWindow(2);
            focusWindow(1);
            return true;
        }
        return false;
    }

    public boolean verifyLiveGameRoulette() {

        if(waitForWindows(2)) {
            focusWindow(2);
            verifyElement(waitForElement(elmntLiveGamesStartedUnderRoulette));
            closeWindow(2);
            focusWindow(1);
            return true;
        }
        return false;
    }

    public boolean verifyLiveGameHoldem() {
        if(waitForWindows(2)) {
            focusWindow(2);
            verifyElement(waitForElement(elmntLiveGamesStartedUnderBaccarat));
            closeWindow(2);
            focusWindow(1);
            return true;
        }
        return false;
    }

    public boolean clickLanguagesUnderLiveCasinoBlack() {
        return click(waitForElement(elmntLanguagesUnderLiveCasinoBlack));
    }

    public boolean verifyLanguagesList() {
        verifyElement(waitForElement(elmntLanguagesList));
        return click(waitForElement(elmntLanguagesList));
    }


}

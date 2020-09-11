package sportsBetting.stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SportsBettingLiveCasinoSteps {


    private sportsBetting.SportsBettingPageContainer SportsBettingPageContainer;
    private WebDriver driver;

    public SportsBettingLiveCasinoSteps(sportsBetting.SportsBettingPageContainer SportsBettingPageContainer) {
        this.SportsBettingPageContainer = SportsBettingPageContainer;
    }

    @When("^I Mouse hover LIVE CASINO tab$")
    public void iMouseHoverLIVECASINOTab() {
        SportsBettingPageContainer.sblivecasinopage.mouseHoverLiveCasino();
    }

    @Then("^I should see (.*) under the LIVE CASINO tab$")
    public void iShouldSeeSubTabsUnderTheLIVECASINOTab(String strTabName) {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveCasinoSubTabs(strTabName));
    }

    @Given("^as a user, I am Mouse Hover Live Casino$")
    public void asAUserIAmMouseHoverLiveCasino() {
        SportsBettingPageContainer.sblivecasinopage.mouseHoverLiveCasino();
    }

    @When("^I click Black$")
    public void iClickBlack() {
        SportsBettingPageContainer.sblivecasinopage.ClickBlackTab();
    }

    @Then("^I see some Game Types$")
    public void iSeeSomeGameTypes() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveCasinoTabs());
    }

    @Given("^I am on Black sub-tab$")
    public void iAmOnBlackSubTab() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyBlackTab());
    }

    @When("^I click Slots in Black$")
    public void iClickSlotsTab() {
        SportsBettingPageContainer.sblivecasinopage.clickSlotsTabInBlack();
    }

    @Then("^I see games related to the Slots$")
    public void iSeeGamesRelatedToTheSlots() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifySlotsGames());
    }

    @When("^I click on any game in Slots$")
    public void iClickAnyGameInSlots() {
        SportsBettingPageContainer.sblivecasinopage.clickSlotsGamesInBlack();
    }

    @Given("^as a user,I am already under Slots game type$")
    public void asAUserIAmAlreadyUnderSlotsGameType() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifySlotsGames());
    }

    @Then("^I see page redirected to game page$")
    public void iSeePageRedirectedToGamePage() {
      SportsBettingPageContainer.sblivecasinopage.verifyGamepage();
    }

    @When("^I click Table Games$")
    public void iClickTableGames() {
        SportsBettingPageContainer.sblivecasinopage.clickTableGamesInBlack();
    }

    @Then("^I see games related to the Table Games$")
    public void iSeeGamesRelatedToTheTableGames() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyTableGames());
    }

    @When("^I click any game in Table Games$")
    public void iClickAnyGameInTableGames() {
        SportsBettingPageContainer.sblivecasinopage.clickTableGame();
    }

    @Then("^I see page redirected to particular game page$")
    public void iSeePageRedirectedToParticularGamePage() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyTableGamepage());
    }

    @When("^I click Live Dealer$")
    public void iClickLiveDealer() {
        SportsBettingPageContainer.sblivecasinopage.clickLiveDealer();
    }

    @Then("^I see games related to the Live Dealer$")
    public void iSeeGamesRelaedToTheLiveDealer() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveDealerGames());
    }

    @When("^I click any game in Live Dealer$")
    public void iClickAnyGameInLiveDealer() {
        SportsBettingPageContainer.sblivecasinopage.clickLiveDealerGames();
    }

    @Then("^I see page redirected to Live game$")
    public void iSeePageRedirectedToLiveGame() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveDealerGamePage());
    }

    @When("^I click Featured$")
    public void iClickFeatured() {
        SportsBettingPageContainer.sblivecasinopage.clickFeaturedTabInLiveCasino();
    }

    @Then("^I see games related to the Featured$")
    public void iSeeGamesRelatedToTheFeatured() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyFeaturedGamesInLiveCasino());
    }

    @When("^I click any game in Featured$")
    public void iClickAnyGameInFeatured() {
        SportsBettingPageContainer.sblivecasinopage.clickGameInFeaturedPage();
    }

    @Then("^I see page redirected to particular Featured Game$")
    public void iSeePageRedirectedToParticularFeaturedGame() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveDealerGamePage());
    }

    @When("^I click All$")
    public void iClickAll() {
        SportsBettingPageContainer.sblivecasinopage.clickAllTabInLiveCasino();
    }

    @Then("^I see all available games in All game type$")
    public void iSeeAllAvailableGamesInAllGameType() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyGamesInAllTab());
    }

    @Then("^I see several Red Games$")
    public void iSeeSeveralRedGames(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyRedGamesInLiveCasino(Table));
    }

    @Given("^as a user, I am on Red sub-tab$")
    public void asAUserIAmOnRedSubTab() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyRedTab());
    }

    @Then("^I should see games related to the Blackjack$")
    public void iShouldSeeGamesRelatedToTheBlackjack() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyBlackJackGamesInLiveCasino());
    }

    @Given("^as a user,I am already under BLACKJACK EARLY PAYOUT header$")
    public void asAUserIAmAlreadyUnderBLACKJACKEARLYPAYOUTHeader() {
        SportsBettingPageContainer.sblivecasinopage.verifyCasinoBlackjackGames();
    }

    @When("^I select Table Limits present in the BLACKJACK EARLY PAYOUT$")
    public void iSelectTableLimitsPresentInTheBLACKJACKEARLYPAYOUT() {
        SportsBettingPageContainer.sblivecasinopage.clickLiveCasinoTableLimits();
    }

    @Then("^I see page redirected to new tab with Live game in Red$")
    public void iSeePageRedirectedToNewTabWithLiveGame() {
       SportsBettingPageContainer.sblivecasinopage.verifyLiveCasinoGamepage();
    }

    @Given("^as a user,I am already under 'BLACKJACK sub-tab$")
    public void asAUserIAmAlreadyUnderBLACKJACKSubTab() {
        SportsBettingPageContainer.sblivecasinopage.verifyCasinoBlackjackGames();
    }

    @When("^I select Table Limits present in the Exclusive games$")
    public void iSelectTableLimitsPresentInTheExclusiveGames() {
        SportsBettingPageContainer.sblivecasinopage.clickCasinoExclusiveTableLimits();
    }


    @Then("^I should see LeaderBoard with following details$")
    public void iShouldSeeLeaderBoardWithFollowingDetails(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyCasinoLeaderBoardStats(Table));
    }

    @When("^I mouse hover on Dealer name$")
    public void iMouseHoverOnDealerName() {
        SportsBettingPageContainer.sblivecasinopage.mouseHoverCasinoDealerNames();
    }

    @When("^I click Roulette in Live Casino$")
    public void iClickRoulette() {
        SportsBettingPageContainer.sblivecasinopage.clickRouletteTab();
    }

    @Then("^I should see games related to the Roulette$")
    public void iShouldSeeGamesRelatedToTheRoulette() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyRouletteGames());
    }

    @Given("^as a user,I am already under Roulette game type$")
    public void asAUserIAmAlreadyUnderRouletteGameType(){
        SportsBettingPageContainer.sblivecasinopage.verifyRoulettePage();
    }

    @When("^I click Table Limits present in the Roulette game type$")
    public void iClickTableLimitsPresentInTheRouletteGameType() {
        SportsBettingPageContainer.sblivecasinopage.clickRouletteableLimits();
    }

    @When("^I click Baccarat$")
    public void iClickBaccarat() {
        SportsBettingPageContainer.sblivecasinopage.clickBaccarat();
    }

    @Then("^I should see games related to the Baccarat$")
    public void iShouldSeeGamesRelatedToTheBaccarat() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyBaccaratGames());
    }

    @Given("^I am on Roulette game type page$")
    public void iAmOnRouletteGameTypePage() {
        SportsBettingPageContainer.sblivecasinopage.clickRouletteOption();
    }

    @Given("^as a user,I am already under Baccarat game type$")
    public void asAUserIAmAlreadyUnderBaccaratGameType() {
        SportsBettingPageContainer.sblivecasinopage.verifyBaccaratPage();
    }

    @When("^I click Table Limits present in the Baccarat game type in black$")
    public void iClickTableLimitsPresentInTheBaccaratGameType() {
        SportsBettingPageContainer.sblivecasinopage.clickCasinoTableLimits();
    }

    @When("^I click Super(\\d+) in Red$")
    public void iClickSuper(int arg0) {
        SportsBettingPageContainer.sblivecasinopage.clickSuper6Tab();
    }

    @Then("^I should see games related to the Super(\\d+)$")
    public void iShouldSeeGamesRelatedToTheSuper(int arg0) {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyCasinoGames());
    }

    @Given("^as a user,I am already under Super(\\d+) game type$")
    public void asAUserIAmAlreadyUnderSuperGameType(int arg0) {
        SportsBettingPageContainer.sblivecasinopage.verifySuper6Tab();
    }

    @When("^I click Table Limits present in the Super(\\d+) game type in Red$")
    public void iClickTableLimitsPresentInTheSuperGameType(int arg0) {
        SportsBettingPageContainer.sblivecasinopage.clickCasinoTableLimits();
    }

    @When("^I click Slots in Red$")
    public void iClickSlots(){
        SportsBettingPageContainer.sblivecasinopage.clickCasinoRedSlotsTab();
    }

    @Then("^I see games related to the Live Casino Red Slots$")
    public void iSeeGamesRelatedToTheLiveCasinoRedSlots() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyCasinoGames());
    }

    @When("^I click any slot game$")
    public void iClickAnySlotGame() {
        SportsBettingPageContainer.sblivecasinopage.clickRedSlotsPlayBtn();
    }

    @Given("^as a user,I am already under Live Casino Red Slots game type$")
    public void asAUserIAmAlreadyUnderLiveCasinoRedSlotsGameType() {
        SportsBettingPageContainer.sblivecasinopage.verifyLiveCasinoRedSlotspage();
    }

    @Then("^I see games related to the Tables$")
    public void iSeeGamesRelatedToTheTables() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyCasinoGames());
    }

    @And("^I click Red Tab in Live Casino$")
    public void iClickRedTabInLiveCasino() {
        SportsBettingPageContainer.sblivecasinopage.clickRedTab();
    }

    @When("^I click on Tables$")
    public void iClickOnTables() {
        SportsBettingPageContainer.sblivecasinopage.clickCasinoRedTablesTab();
    }

    @Given("^as a user,I am already on Table Games page$")
    public void asAUserIAmAlreadyOnTableGamesPage() {
        SportsBettingPageContainer.sblivecasinopage.verifyLiveCasinoRedTablespage();
    }

    @When("^I click any Table game$")
    public void iClickAnyTableGame() {
        SportsBettingPageContainer.sblivecasinopage.clickRedSlotsPlayBtn();
    }

    @Given("^as a user,I am already on Red games page$")
    public void asAUserIAmAlreadyOnRedGamesPage() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        SportsBettingPageContainer.sblivecasinopage.mouseHoverLiveCasino();
        SportsBettingPageContainer.sblivecasinopage.clickRedTab();
    }

    @When("^I click Bingo in Red$")
    public void iClickBingo(){
        SportsBettingPageContainer.sblivecasinopage.clickBingoGames();
    }

    @Then("^I see games related to Bingo$")
    public void iSeeGamesRelatedToBingo() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyCasinoGames());
    }

    @Given("^as a user,I am already under Bingo Game type$")
    public void asAUserIAmAlreadyUnderBingoGameType() {
        SportsBettingPageContainer.sblivecasinopage.verifyBingoGamesPage();
    }

    @When("^I click any Bingo game$")
    public void iClickAnyBingoGame() {
        SportsBettingPageContainer.sblivecasinopage.clickRedSlotsPlayBtn();
    }

    @When("^I click Blackjack in Live Casino$")
    public void iClickBlackjack(){
            SportsBettingPageContainer.sblivecasinopage.clickBlackjackTabInLiveCasino();
        }

    @And("^I will click casino (.*)$")//todo fixed fo ambigious
    public void iWillClickGameTypes(String strtabs) {
        SportsBettingPageContainer.sblivecasinopage.clickCasinoGames(strtabs);
    }


    @Then("^I see page redirected to selected game page$")
    public void iSeePageRedirectedToSlotsGamePage() {
       SportsBettingPageContainer.sblivecasinopage.verifyBlackGamespage();
    }

    @When("^I click on any game in Baccarat Games$")
    public void iClickOnAnyGameInBaccaratGames() {
        SportsBettingPageContainer.sblivecasinopage.clickBaccaratGame();
    }

    @Then("^I see page redirected to Baccarat game page$")
    public void iSeePageRedirectedToBaccaratGamePage() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyBaccaratGamePage());
    }

    @When("^I click Table Limits present in the Blackjack game type$")
    public void iClickTableLimitsPresentInTheBlackjackGameType() {
        SportsBettingPageContainer.sblivecasinopage.clickBlackJackTableLimits();
    }

    @When("^I click Holdem in Live Casino$")
    public void iClickHoldemInLiveCasino() {
       SportsBettingPageContainer.sblivecasinopage.clickHoldemInLiveCasinoBlack();
    }

    @Then("^I should see games related to the Holdem$")
    public void iShouldSeeGamesRelatedToTheHoldem() {
        SportsBettingPageContainer.sblivecasinopage.verifyHoldemGamesInLiveCasino();
    }

    @When("^I click Table Limits present in the Holdem game type$")
    public void iClickTableLimitsPresentInTheHoldemGameType() {
        SportsBettingPageContainer.sblivecasinopage.clickHoldemTableLimits();
    }

    //-----------------//

        @Then("^I should see multiple sub-tabs under Left Navigator$")
        public void iShouldSeeMultipleSubTabsUnderLeftNavigator(DataTable strtabs) {
//Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickLeftNavigator());
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifygametypes(strtabs));
        }

        @When("^I select Live Casino tab in Hamburger Icon$")
        public void iSelectLiveCasinoTabInHamburgerIcon() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickSubTabRedunderHam());
        }


        @Given("^I select Live casino sub-tab$")
        public void IselectLivecasinosubtab() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickLiveCasino());
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickSubTabRed());
        }

        @When("^I select Blackjack$")
        public void iSelectBlackjack() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickBlackJackTab());
        }

        @Then("^I see all games related to the Blackjack$")
        public void iSeeAllGamesRelatedToTheBlackjack() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyBlackJackPage());
        }


        @When("^I select any Table Limits present in the BLACKJACK EARLY PAYOUT$")
        public void iSelectAnyTableLimitsPresentInTheBLACKJACKEARLYPAYOUT() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickBlackJackTableLimits());
        }

        @Then("^I see redirected page to new tab with Live game$")
        public void iSeeRedirectedPageToNewTabWithLiveGame() {
            SportsBettingPageContainer.sblivecasinopage.verifyNewTabUnderLiveCasino();
        }

        @When("^I select any Table Limits present in the Non-Exclusive games$")
        public void iSelectAnyTableLimitsPresentInTheNonExclusiveGames() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickNonExclusiveTableLimits());
        }


        @When("^I select any Table Limits present in the Exclusive games$")
        public void iSelectAnyTableLimitsPresentInTheExclusiveGames() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickExclusiveTableLimits());
        }

        @When("^I mouse hover on any available game$")
        public void iMouseHoverOnAnyAvailableGame() {
            SportsBettingPageContainer.sblivecasinopage.MouseHoverLivecasinoGames();
        }

        @Then("^I see LeaderBoard details$")
        public void iSeeLeaderBoardDetails() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLeaderBoard());
        }

        @Given("^as a user, I am on Blackjack tab$")
        public void asAUserIAmOnBlackjackTab() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickBlackJackTab());
        }

        @Given("^as a user, I am on Live casino page$")
        public void asAUserIAmOnLiveCasinoPage() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickLiveCasino());
        }

        @When("^I select Roulette$")
        public void iSelectRoulette() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickRouletteTab());
        }

        @Then("^I see all games related to the Roulette$")
        public void iSeeAllGamesRelatedToTheRoulette() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyRoulettegames());
        }

        @Given("^I see sportsBetting Roulette Tab$")
        public void iSeeSportsBettingRoulettetab() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickRouletteTab());
        }

        @When("^I select any Table Limits present in the Roulette$")
        public void iSelectAnyTableLimitsPresentInTheRoulette() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickRouletteTableLimits());
        }

        @When("^I select Slots$")
        public void iSelectSlots() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickSlotsTab());
        }

        @Then("^I see all available games$")
        public void iSeeAllAvailableGames() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifySlotgames());
        }

        @Given("^as a user,I am on Slots sub-tab$")
        public void asAUserIAmOnSlotsSubTab() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifySlotgames());
        }

        @When("^I select Play$")
        public void iSelectPlay() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickPlayOption());
        }

        @Then("^I see page redirected to new tab with game$")
        public void iSeePageRedirectedToNewTabWithGame() {
            SportsBettingPageContainer.sblivecasinopage.verifyNewTabGames();
        }

//    @When("^I select LIVE CASINO Sub-Tab$")
//    public void IselectLivecasinosubtab() {
//        System.out.println("Here");
//        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickLiveCasino());
//    }

        @When("^I select Baccarat$")
        public void iSelectBaccarat() {

            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickBaccaratTab());
        }


        @Then("^I see games related to the Baccarat$")
        public void iSeeGamesRelatedToTheBaccarat() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyBaccaratGame());
        }

        @Given("^as a user, I am on sportsBetting Baccarat Game sub-tab$")
        public void asAUserIAmOnSportsBettingBaccaratGameSubTab() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyBaccaratGame());
        }

        @When("^I select Table Limits present in the Baccarat game type$")
        public void iSelectTableLimitsPresentInTheBaccaratGameType() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickTableLimits());
        }





        @When("^I select Super6$")
        public void iSelectSuper6() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickSuper6Tab());
        }

        @Then("^I see games related to the Super6$")
        public void iSeeGamesRelatedToTheSuper6() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifySuper6Games());
        }

        @Given("^as a user,I am on Super6$")
        public void asAUserIAmOnSuper6() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifySuper6Games());
        }

        @When("^I select Table Limits present in the Super6 game type$")
        public void iSelectTableLimitsPresentInTheSuper6GameType() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickTableLimits());
        }

        @When("^I select Tables$")
        public void iSelectTables() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickTablesTab());
        }

        @Given("^as a user, I am on TABLES sub-tab$")
        public void asAUserIAmOnTABLESSubTab() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyTableGames());
        }



        @When("^I select Bingo$")
        public void iSelectBingo() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickBingoTab());

        }

        @Then("^I see games related to the Bingo$")
        public void iSeeGamesRelatedToTheBingo() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyBingoGames());

        }

        @Given("^as a user,I am on BINGO sub-tab$")
        public void asAUserIAmOnBINGOSubTab() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyBingoGames());
        }


        @When("^I click LIVE CASINO tab$")
        public void iClickLIVECASINOTab() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickLiveCasino());
        }


        @Then("^I see (.*) under Live Casino$")
        public void iSeeLiveCasinoOptionsUnderLiveCasino(String strTabs) {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveCasinoOptions(strTabs));

        }

        @Given("^as a User, I have already selected the Livecasino tab$")
        public void asAUserIHaveAlreadySelectedTheLivecasinoTab() {
            SportsBettingPageContainer.signUpPage.launchPTYURL();
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickLiveCasino());
        }

        @When("^I select BLACK$")
        public void iSelectBLACK() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickBlackUnderLiveCasino());
        }

        @Then("^I see Live Lobby open with related CONTENTS and different games$")
        public void iSeeLiveLobbyOpenWithRelatedCONTENTSAndDifferentGames() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyContentsForLivecasinoBlack());
        }

        @Given("^as a User, I am already in SportsBetting Live Lobby page$")
        public void asAUserIAmAlreadyInSportsBettingLiveLobbyPage() {
            SportsBettingPageContainer.signUpPage.launchPTYURL();
            Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifySportsBettingUserLandingPage());
            SportsBettingPageContainer.signUpPage.clickHeaderTab("BLACK");
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyContentsForLivecasinoBlack());
        }

        @And("^I select SLOT$")
        public void iSelectSLOT() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickSlotsUnderLiveLobbyPage());
        }

        @And("^I see SLOT related games$")
        public void iSeeSLOTRelatedGames() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifySlotRelatedGames());
        }

        @When("^I select any game under Slot$")
        public void iSelectAnyGameUnderSlot() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickAnyGameUnderSlotsLiveLobby());
        }


        @Then("^I see respective live games started under slots$")
        public void iSeeRespectiveLiveGamesStartedUnderSlots() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveGamesStarted());
        }

        @And("^I select BLACKJACK$")
        public void iSelectBLACKJACK() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickBlackjackUnderLiveLobbyPage());
        }

        @And("^I see sportsBetting BLACKJACK related games$")
        public void iSeeSportsBettingBLACKJACKRelatedGames() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyBlackjackRelatedGames());
        }


        @When("^I select any game under BlackJack$")
        public void iSelectAnyGameUnderBlackJack() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickAnyGameUnderBlackJackLiveLobby());
        }

        @Then("^I see respective live games started under BlackJack$")
        public void iSeeRespectiveLiveGamesStartedUnderBlackJack() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveGamesStartedUnderBlackJack());
        }

        @And("^I select LIVE DEALER$")
        public void iSelectLIVEDEALER() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickLiveDealerUnderLiveLobbyPage());
        }

        @And("^I see LIVE DEALER related games$")
        public void iSeeLIVEDEALERRelatedGames() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveDealerRelatedGames());
        }

        @When("^I select any game under Live Dealer$")
        public void iSelectAnyGameUnderLiveDealer() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickAnyGameUnderLiveDealerLiveLobby());
        }

        @Then("^I see respective live games started under Live Dealer$")
        public void iSeeRespectiveLiveGamesStartedUnderLiveDealer() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveGamesStartedUnderLiveDealer());
        }

        @And("^I select FEATURED$")
        public void iSelectFEATURED() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickFeaturedUnderLiveLobbyPage());
        }

        @And("^I see FEATURED related games$")
        public void iSeeFEATUREDRelatedGames() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyFeaturedRelatedGames());
        }

        @When("^I select any game under Featured$")
        public void iSelectAnyGameUnderFeatured() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickAnyGameUnderFeaturedLiveLobby());
        }

        @Then("^I see respective live games started under Featured$")
        public void iSeeRespectiveLiveGamesStartedUnderFeatured() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveGamesStartedUnderFeatured());
        }

        @And("^I select ALL option Under live Lobby page$")
        public void iSelectALLOptionUnderLiveLobbyPage() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickAllOptionUnderLiveLobbyPage());
        }

        @And("^I see all the games are appeared in the All option under Live Casino Black$")
        public void iSeeAllTheGamesAreAppearedInTheAllOptionUnderLiveCasinoBlack() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyAllOptionsRelatedGames());
        }


        @When("^I select any game under All options$")
        public void iSelectAnyGameUnderAllOptions() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickAnyGameUnderAlloptionsLiveLobby());
        }

        @Then("^I see respective live games started under All options$")
        public void iSeeRespectiveLiveGamesStartedUnderAllOptions() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveGamesStartedUnderAllOptions());
        }

        @When("^I select Full Screen icon$")
        public void iSelectFullScreenIcon() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickFullScreenIcon());
        }

        @Then("^I see page expanded user can see the full view of the page$")
        public void iSeePageExpandedUserCanSeeTheFullViewOfThePage() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyExpandedFullScreenIcon());
        }

        @When("^I again select Full Screen icon$")
        public void iAgainSelectFullScreenIcon() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickFullScreenIcon());
        }

        @Then("^I see the full screen view get back to normal view$")
        public void iSeeTheFullScreenViewGetBackToNormalView() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyFullScreenIcon());
        }

        @When("^I select Setting icon$")
        public void iSelectSettingIcon() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickSettingIcon());
        }

        @Then("^I see the Setting pop-up the current Version and X icon$")
        public void iSeeTheSettingPopUpTheCurrentVersionAndXIcon() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyCurrentVersion());
        }

        @Given("^as a User, I can see the setting pop-up in top of the page$")
        public void asAUserICanSeeTheSettingPopUpInTopOfThePage() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyCurrentVersion());
        }

        @When("^I close the pop-up$")
        public void iCloseThePopUp() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickCloseIcon());
        }

        @Then("^I see the setting pop-up gets disappears$")
        public void iSeeTheSettingPopUpGetsDisappears() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyPopUpGetsDisappears());
        }

        @When("^I select Home icon$")
        public void iSelectHomeIcon() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickHomeIcon());

        }

        @Then("^I see page redirect to SportsBetting Homepage$")
        public void iSeePageRedirectToSportsBettingHomepage() {
            Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        }

        @Given("^as a User, I already in Live Lobby page$")
        public void asAUserIAlreadyInLiveLobbyPage() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyContentsForLivecasinoBlack());
        }

        @When("^I select RED$")
        public void iSelectRED() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickSubTabRed());
        }

        @Then("^I see different Game Types in LiveCasino RED tab with Hamburger Icon$")
        public void iSeeDifferentGameTypesInLiveCasinoREDTabWithHamburgerIcon() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveCasinoRedPage());
        }

        @And("^I select Baccarat under Black$")
        public void iSelectBaccaratUnderBlack() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickBaccaratUnderBlack());
        }

        @And("^I select Roulette under Black$")
        public void iSelectRouletteUnderBlack() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickRouletteUnderBlack());
        }

        @And("^I select Holdem under Black$")
        public void iSelectHoldemUnderBlack() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickHoldemUnderBlack());
        }

        @And("^I see Baccarat related games$")
        public void iSeeBaccaratRelatedGames() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyBaccaratRelatedGames());
        }

        @And("^I see Roulette related games$")
        public void iSeeRouletteRelatedGames() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyRouletteRelatedGames());
        }

        @And("^I see Holdem related games$")
        public void iSeeHoldemRelatedGames() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyHoldemRelatedGames());
        }

        @When("^I select any game under Baccarat$")
        public void iSelectAnyGameUnderBaccarat() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickAnyGameUnderBaccarat());
        }

        @When("^I select any game under Roulette$")
        public void iSelectAnyGameUnderRoulette() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickAnyGameUnderRoulette());
        }

        @When("^I select any game under Holdem$")
        public void iSelectAnyGameUnderHoldem() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickAnyGameUnderHoldem());
        }

        @Then("^I see respective live games started under Baccarat$")
        public void iSeeRespectiveLiveGamesStartedUnderBaccarat() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveGameBaccarat());
        }

        @Then("^I see respective live games started under Roulette$")
        public void iSeeRespectiveLiveGamesStartedUnderRoulette() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveGameRoulette());
        }

        @Then("^I see respective live games started under Holdem$")
        public void iSeeRespectiveLiveGamesStartedUnderHoldem() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLiveGameHoldem());
        }

        @Given("^as a User, I am already in Live Lobby page under SportsBetting$")
        public void asAUserIAmAlreadyInLiveLobbyPageUnderSportsBetting() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyContentsForLivecasinoBlack());
        }

        @When("^I select Language icon$")
        public void iSelectLanguageIcon() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.clickLanguagesUnderLiveCasinoBlack());
        }

        @Then("^I should see several languages under Live Casino Black$")
        public void iShouldSeeSeveralLanguagesUnderLiveCasinoBlack() {
            Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyLanguagesList());
        }


}
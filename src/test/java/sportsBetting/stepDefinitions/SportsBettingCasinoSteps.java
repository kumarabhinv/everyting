package sportsBetting.stepDefinitions;

import cap.helpers.Constants;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SportsBettingCasinoSteps {
    private sportsBetting.SportsBettingPageContainer SportsBettingPageContainer;
    private WebDriver driver;

    public SportsBettingCasinoSteps(sportsBetting.SportsBettingPageContainer SportsBettingPageContainer) {
        this.SportsBettingPageContainer = SportsBettingPageContainer;
    }


    @Then("^I should see (.*)under the CASINO tab$")
    public void iShouldSeeSubTabUnderTheCASINOTab(String strTabName) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyCasinoPage(strTabName));
    }

    @Given("^As a user, I am on CASINO Tab$")
    public void asAUserIAmOnCASINOTab() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCasinoTab());
    }


    @When("^select (.*)$")
    public void Select(String strSubTab) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickSubTabUnderCasinoTab(strSubTab));
    }


    @Then("^I should see casino games under Featured$")
    public void iShouldSeeCasinoGamesUnderFeatured() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyFeaturedTabsUnderCasino());
    }


    @Given("^As a user,I am on (.*)$")
    public void asAUserIAmOnFeatureTab(String strSubTab1) {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            SportsBettingPageContainer.signUpPage.launchPTYURL();
            Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCasinoTab());
        }
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickSubTabUnderCasinoTab(strSubTab1));
    }

    @When("^I click a game from (.*)$")
    public void iClickAGameFromSubTabs(String strSubTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickSubTabsUnderCasinoTab(strSubTabs));
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickGamesUnderCasinoTab(strSubTabs));
    }

    @Then("^I should see a game modal under (.*)$")
    public void iShouldSeeAGameModalUnderSubtabs(String strSubGames) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickGameTabsUnderCasinoTab(strSubGames));
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGameTabsUnderDifferentTabs(strSubGames));

    }


    @Then("^I should get navigated to Cashier menu$")
    public void iShouldGetNavigatedToCashierMenu() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyCashierMenuUnderCasino());
    }


    @And("^I will click a game from (.*)$")
    public void iWillClickAGameFromSubTab(String strSubGames1) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickGamesUnderCasinoTab(strSubGames1));
    }

    @When("^I click Casino Deposit button$")
    public void iClickCasinoDepositButton() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDepositUnderCasino());
    }



    @Given("^As a user, I see (.*)$")
    public void asAUserISeeSubTab(String strSubTab2) {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCasinoTab());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickSubTabsUnderCasinoTab(strSubTab2));
    }

    @And("^I choose the remove the favorite game option$")
    public void iChooseTheRemoveTheFavoriteGameOption() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.closeFavoriteOptionUnderFeatured());
    }



    @Then("^I should see All (.*)$")
    public void iShouldSeeAllSlotsGame(String strAll) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifySlotsUnderCasino(strAll));
    }


    @Then("^I should see every (.*)$")
    public void iShouldSeeVideoPokerGames(String strPoker) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyVideoPokerUnderCasino(strPoker));
    }


    @When("^I click Bonus related promotion$")
    public void iClickBonusRelatedPromotion() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyBonusUnderPromotion());
    }


    @When("^I click Click here link from any promotion$")
    public void iClickClickHereLinkFromAnyPromotion() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyClickHereUnderPromotions());
    }


    @When("^I click Terms and Conditions link from any promotion$")
    public void iClickTermsAndConditionsLinkFromAnyPromotion() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyTermsUnderPromotionTab());
    }

    @Then("^I should see Terms and condition for the selected promotion")
    public void iShouldSeeTermsAndConditionForTheSelectedPromotion() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyConditionsUnderPromotionTab());
    }

    @Then("^I should see More information about the selected promotion$")
    public void iShouldSeeMoreInformationAboutTheSelectedPromotion() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyPokerTabUnderPromotions());
    }


    @Then("^I will gather page redirects to the Poker tab\\.$")
    public void iWillGatherPageRedirectsToThePokerTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyBonusUnderPromotionS());
    }

    @Then("^I should see page redirects to the Cashiers tab\\.$")
    public void iShouldSeePageRedirectsToTheCashiersTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyDepositUnderPromotions());
    }

    @When("^I want to click Deposit related promotion$")
    public void iWantToClickDepositRelatedPromotion() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyPromotionsPageUnderCasino());
    }




    @Then("^I should see the game modal closed under the subTabs$")
    public void iShouldSeeTheGameModalClosedUnderTheSubTabs() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGameModalClosedUnderFeatured());
    }

    @When("^I choose the Add to the Favorites game option$")
    public void iChooseTheAddToTheFavoritesGameOption() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.closeFavoriteOptionUnderFeatured());
    }


    @Then("^i should see the game under favorites$")
    public void iShouldSeeTheGameUnderFavorites() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamesUnderFavoritesTab());
    }

    @Then("^I should see a games under speciality games$")
    public void iShouldSeeAGamesUnderSubTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamesUnderSpecialityGames());
    }

    @When("^I click Close icon$")
    public void iClickCloseIcon() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCloseIconUnderFeaturedTabs());
    }

    @Then("^I should get craps And Roulette under Table Games$")
    public void iShouldGetCrapsAndRouletteUnderTableGames() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyTableGamesSubTab());
    }

    @Then("^I should watch Promotions under Promotions$")
    public void iShouldWatchPromotionsUnderPromotions() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyPromotionPageUnderCasino());
    }

    @Then("^I should gather Welcome to your own favorites page, just select the Add to Favorites check box on up to  of your favorite games to add them to this page$")
    public void iShouldGatherWelcomeToYourOwnFavoritesPageJustSelectTheAddToFavoritesCheckBoxOnUpToOfYourFavoriteGamesToAddThemToThisPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyInformationPageUnderFeatured());
    }

    @Then("^I want to see Changes saved successfully$")
    public void iWantToSeeChangesSavedSuccessfully() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyPopUpOfFeaturedTab());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.ClickCloseButtonUnderFeaturedTab());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCloseIconUnderFeaturedTabs());
    }


    @And("^I should see a LEFT NAVIGATOR and few sub-tabs$")
    public void iShouldSeeALEFTNAVIGATORAndFewSubTabs(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyCasinoSubTabs(strTabs));
    }

    @When("^I see TABLE GAMES sub-tab selected as default$")
    public void iSeeTABLEGAMESSubTabSelectedAsDefault() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyTableGameSelectedDefault());
    }

    @Then("^I see Balance\\(amount\\) available$")
    public void iSeeBalanceAmountAvailable() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyClassicCasinoBalanceAmount());
    }

    @Given("^as a user, I see Classic Casino page$")
    public void asAUserISeeClassicCasinoPage() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        SportsBettingPageContainer.signUpPage.clickHeaderTab("CLASSIC CASINO");
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyClassicCasinoBalanceAmount());
    }

    @When("^I see TABLE GAMES already selected$")
    public void iSeeTABLEGAMESAlreadySelected() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyTableGameSelectedDefault());
    }

    @Then("^I should see various games under the Table Games displayed page$")
    public void iShouldSeeVariousGamesUnderTheTableGamesDisplayedPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamesUnderTableGames());
    }

    @Given("^as a user, I already see all the games under TABLE GAMES$")
    public void asAUserIAlreadySeeAllTheGamesUnderTABLEGAMES() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamesUnderTableGames());
    }

    @When("^I select any game from the list of Table Games available$")
    public void iSelectAnyGameFromTheListOfTableGamesAvailable() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickGamesUnderTableGames());
    }

    @Then("^I see page gets redirected to the selected game console for playing$")
    public void iSeePageGetsRedirectedToTheSelectedGameConsoleForPlaying() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamesConsoleForTableGameSelected());
    }

    @When("^I select Classic Casino (.*) sub-tab$")
    public void iSelectVIDEOPOKERSubTab(String strTab) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickVideoPokerUnderClassicCasino(strTab));
    }

    @Then("^I should see various games under the Video Poker displayed page$")
    public void iShouldSeeVariousGamesUnderTheVideoPokerDisplayedPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGameUnderVideoPoker());
    }

    @Given("^as a user, I already see all the games under VIDEO POKER$")
    public void asAUserIAlreadySeeAllTheGamesUnderVIDEOPOKER() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGameUnderVideoPoker());
    }

    @When("^I select any game from the list of Video Poker games available$")
    public void iSelectAnyGameFromTheListOfVideoPokerGamesAvailable() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickGamesUnderVideoPoker());
    }

    @Then("^I should see various games under the Slots games displayed page$")
    public void iShouldSeeVariousGamesUnderTheSlotsGamesDisplayedPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamesUnderSlotGames());
    }

    @Given("^as a user, I already see all the games under SLOT GAMES$")
    public void asAUserIAlreadySeeAllTheGamesUnderSLOTGAMES() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamesUnderSlotGames());
    }

    @When("^I select any game from the list of Slot Games available$")
    public void iSelectAnyGameFromTheListOfSlotGamesAvailable() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickGamesUnderSlotGames());
    }

    @Then("^I should see various games under the Featured Games displayed page$")
    public void iShouldSeeVariousGamesUnderTheFeaturedGamesDisplayedPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamesUnderFeaturedGames());
    }

    @Given("^as a user, I already see all the games under Featured Games$")
    public void asAUserIAlreadySeeAllTheGamesUnderFeaturedGames() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamesUnderFeaturedGames());
    }

    @When("^I select any game from the list of Featured Games available$")
    public void iSelectAnyGameFromTheListOfFeaturedGamesAvailable() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickGamesUnderFeaturedGames());
    }

    @Then("^I should see various games under the Other Games displayed page$")
    public void iShouldSeeVariousGamesUnderTheOtherGamesDisplayedPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamesUnderOtherGames());
    }

    @Given("^as a user, I already see all the games under Other Games$")
    public void asAUserIAlreadySeeAllTheGamesUnderOtherGames() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamesUnderOtherGames());
    }

    @When("^I select any game from the list of Other Games available$")
    public void iSelectAnyGameFromTheListOfOtherGamesAvailable() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickGamesUnderOtherGames());
    }

    @When("^I click Classic Casino LEFT NAVIGATOR$")
    public void iClickClassicCasinoLEFTNAVIGATOR() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickClassicCasinoLeftNavigator());
    }

    @Then("^I see few Classic Casino options under LEFT NAVIGATOR$")
    public void iSeeFewClassicCasinoOptionsUnderLEFTNAVIGATOR(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyOptionsUnderLeftNavigator(strTabs));
    }

    @When("^I click on Classic Casino EXIT CASINO$")
    public void iClickOnClassicCasinoEXITCASINO() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickExitClassicCasino());
    }

    @When("^I click on Classic Casino Close \\(Icon\\)$")
    public void iClickOnClassicCasinoCloseIcon() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCloseClassicCasinoLeftNavigator());
    }

    @Then("^I see CLASIC CASINO page$")
    public void iSeeCLASICCASINOPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyClassicCasinoBalanceAmount());
    }

    @When("^I select Classic Casino Languages$")
    public void iSelectClassicCasinoLanguages() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickClassicCasinoLanguages());
    }

    @Then("^I see few Classic Casino languages as dropdown list$")
    public void iSeeFewLanguagesAsDropdownList(DataTable strLanguages) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyClassicCasinoLanguagesAvailable(strLanguages));
    }
    
    //Casino Mobile Steps


    @Given("^as a user, I am on the homepage$")
    public void asAUserIAmOnTheHomepage() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());

    }

    @When("^I click CASINO tab Under SportBetting$")
    public void iClickCASINOTabUnderSportBetting() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCasinoTabUnderCasinoMobile());
    }

    @Then("^I had to watch out (.*) under the CASINO tab$")
    public void iHadToWatchOutDropdownUnderTheCASINOTab(String strDropDown) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyDropDownUnderCasino(strDropDown));
    }

    @And("^I see Featured selected as default under the dropdown$")
    public void iSeeFeaturedSelectedAsDefaultUnderTheDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyDefaultFeaturedUnderCasino());
    }

    @Given("^as a user, I have already clicked on CASINO tab under homepage$")
    public void asAUserIHaveAlreadyClickedOnCASINOTabUnderHomepage() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCasinoTabUnderCasinoMobile());
    }

    @When("^I see Featured already selected from under dropdown$")
    public void iSeeFeaturedAlreadySelectedFromUnderDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyDefaultFeaturedUnderCasino());
    }

    @Then("^I should see various games under the displayed page$")
    public void iShouldSeeVariousGamesUnderTheDisplayedPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyDifferentGamesUnderFeatured());
    }

    @Given("^as a user, I already see all the games under Featured option$")
    public void asAUserIAlreadySeeAllTheGamesUnderFeaturedOption() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCasinoTabUnderCasinoMobile());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyDifferentGamesUnderFeatured());
    }

    @When("^I select any game from the list of games available$")
    public void iSelectAnyGameFromTheListOfGamesAvailable() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickGameUnderFeaturedTab());
    }

    @Then("^I see page redirected to the selected game console for playing in mobile$")
    public void iSeePageGetsRedirectedToTheSelectedGameConsoleForPlayingInMobile() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyRedirectedGamePageUnderFeaturedTab());
    }

    @When("^I select Table Games from under dropdown$")
    public void iSelectTableGamesFromUnderDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickTableGamesUnderCasinoTab());
    }

    @Then("^I should see various (.*) under the displayed page$")
    public void iShouldSeeVariousHeadersUnderTheDisplayedPage(String strTableHeaders) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyTableGmeHeadersUnderTableGames(strTableHeaders));
    }

    @Given("^as a user, I already see all the games under Table Games option$")
    public void asAUserIAlreadySeeAllTheGamesUnderTableGamesOption() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCasinoTabUnderCasinoMobile());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickTableGamesUnderCasinoTab());
    }

    @When("^I select any game from the list of games available under any header$")
    public void iSelectAnyGameFromTheListOfGamesAvailableUnderAnyHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickAnyGameUnderTableGames());
    }

    @Then("^I see page gets redirected to the selected game console for playing under TableGames$")
    public void iSeePageGetsRedirectedToTheSelectedGameConsoleForPlayingUnderTableGames() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamePageUnderTableGames());
    }

    @When("^I select Video Poker from under dropdown$")
    public void iSelectVideoPokerFromUnderDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickVideoPokerUnderCasinoTab());
    }

    @Then("^I should see few (.*) under the displayed page under$")
    public void iShouldSeeFewHeadersUnderTheDisplayedPageUnder(String  strHeaders) {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGameHeaderUnderVideoPoker(strHeaders));

    }

    @Given("^as a user, I already see all the games under Video Poker option$")
    public void asAUserIAlreadySeeAllTheGamesUnderVideoPokerOption() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCasinoTabUnderCasinoMobile());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickVideoPokerUnderCasinoTab());
    }

    @When("^I select any game from the list of games available under any header under video poker$")
    public void iSelectAnyGameFromTheListOfGamesAvailableUnderAnyHeaderUnderVideoPoker() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickAnyGameUnderVideoPoker());
    }

    @When("^I select Slots from under dropdown$")
    public void iSelectSlotsFromUnderDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickSlotsUnderCasino());
    }

    @Then("^I should see various games under the displayed page under Slots header$")
    public void iShouldSeeVariousGamesUnderTheDisplayedPageUnderSlotsHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifySlotsGamesUnderCasino());
    }

    @Given("^as a user, I already see all the games under Slots option$")
    public void asAUserIAlreadySeeAllTheGamesUnderSlotsOption() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCasinoTabUnderCasinoMobile());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickSlotsUnderCasino());
    }


    @When("^I select any game from the list of games available under slots$")
    public void iSelectAnyGameFromTheListOfGamesAvailableUnderSlots() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickAnyGameUnderVideoPoker());
    }

    @Then("^I see page gets redirected to the selected game console for playing under slots$")
    public void iSeePageGetsRedirectedToTheSelectedGameConsoleForPlayingUnderSlots() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyRedirectedGamePageUnderFeaturedTab());}

    @When("^I select Live Casino Black from under dropdown$")
    public void iSelectLiveCasinoBlackFromUnderDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickLiveCasinoBlackUnderCasino());
    }

    @Then("^I see page gets redirected to the page under Live Casino Black tab$")
    public void iSeePageGetsRedirectedToThePageUnderLiveCasinoBlackTab() {
        Assert.assertTrue(SportsBettingPageContainer.sblivecasinopage.verifyContentsForLivecasinoBlack());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyLiveCasinoBlackUnderCasino());
    }

    @Then("^I see page gets redirected to the selected game console for playing under video poker$")
    public void iSeePageGetsRedirectedToTheSelectedGameConsoleForPlayingUnderVideoPoker() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyRedirectedPageUnderVideoPoker());
    }



    @Given("^as a user, I already see all the games under Live Casino Black Option option$")
    public void asAUserIAlreadySeeAllTheGamesUnderLiveCasinoBlackOptionOption() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCasinoTabUnderCasinoMobile());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickLiveCasinoBlackUnderCasino());
    }

    @When("^I select any game from the list of games available under Live Casino Black$")
    public void iSelectAnyGameFromTheListOfGamesAvailableUnderLiveCasinoBlack() {
        SportsBettingPageContainer.sbcasinopage.clickAnyGameUnderBlack();
    }

    @Then("^I see page gets redirected to the selected game console for playing under live Casino Black$")
    public void iSeePageGetsRedirectedToTheSelectedGameConsoleForPlayingUnderLiveCasinoBlack() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamePageUnderBlack());
    }


    @When("^I select Live Casino Red from under dropdown$")
    public void iSelectLiveCasinoRedFromUnderDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickLiveCasinoRed());
//        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickLiveCasinoBlack());
    }
    @When("^I select any game from the list of games available under Live Casino Red$")
    public void iSelectAnyGameFromTheListOfGamesAvailableUnderLiveCasinoRed() {
        SportsBettingPageContainer.sbcasinopage.clickLiveCasinoRedGame();
    }


    @Then("^I see page gets redirected to the page under Live Casino Red tab$")
    public void iSeePageGetsRedirectedToThePageUnderLiveCasinoRedTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyLiveCasinoUnderCasino());
    }

    @Given("^as a user, I already see all the games under Live Casino Red Option option$")
    public void asAUserIAlreadySeeAllTheGamesUnderLiveCasinoRedOptionOption() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCasinoTabUnderCasinoMobile());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickLiveCasinoRed());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyLiveCasinoUnderCasino());
    }

    @Then("^I see page gets redirected to the selected game console for playing under live Casino Red$")
    public void iSeePageGetsRedirectedToTheSelectedGameConsoleForPlayingUnderLiveCasinoRed() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyRedirectedPageUnderLiveCasinored());
    }

    @When("^I select Speciality Games from under dropdown$")
    public void iSelectSpecialityGamesFromUnderDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickSpecialityGamesUnderCasino());
    }

    @Then("^I should see various games under the displayed page under Speciality Games header$")
    public void iShouldSeeVariousGamesUnderTheDisplayedPageUnderSpecialityGamesHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyGamePageUnderSpecialityGames());
    }

    @Given("^as a user, I already see all the games under Speciality Games option$")
    public void asAUserIAlreadySeeAllTheGamesUnderSpecialityGamesOption() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickCasinoTabUnderCasinoMobile());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickSpecialityGamesUnderCasino());
    }

    @When("^I select any game from the list of games available in speciality Games$")
    public void iSelectAnyGameFromTheListOfGamesAvailableInSpecialityGames() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickGameUnderFeaturedTab());
    }

    @Then("^I see page gets redirected to the selected game console for playing IN Speciality Games$")
    public void iSeePageGetsRedirectedToTheSelectedGameConsoleForPlayingINSpecialityGames() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyRedirectedGamePageUnderFeaturedTab());
    }

    @When("^I select Bonus&spins from under dropdown$")
    public void iSelectBonusSpinsFromUnderDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickDropDownUnderCasino());
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.clickBonusAndSpinsUnderCasino());
    }

    @Then("^I see page reloads and displays all the Bonuses available \\(If any\\)$")
    public void iSeePageReloadsAndDisplaysAllTheBonusesAvailableIfAny() {
        Assert.assertTrue(SportsBettingPageContainer.sbcasinopage.verifyBonusAndSpinsUnderCasino());
    }
    
    
}







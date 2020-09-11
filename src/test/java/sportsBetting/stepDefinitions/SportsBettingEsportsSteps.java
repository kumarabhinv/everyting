package sportsBetting.stepDefinitions;

import cap.helpers.Constants;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SportsBettingEsportsSteps {

    private sportsBetting.SportsBettingPageContainer SportsBettingPageContainer;
    private WebDriver driver;

    public SportsBettingEsportsSteps(sportsBetting.SportsBettingPageContainer SportsBettingPageContainer) {
        this.SportsBettingPageContainer = SportsBettingPageContainer;
    }

    @And("^I click Esports tab$")
    public void iClickEsportsTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickEsportsTab());
    }

    @And("^I click on Early Markets$")
    public void iClickOnEarlyMarkets() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickEsportsEarlyMarkets());
    }

    @And("^I choose the team$")
    public void iChooseTheTeam() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickEsportsTeam());
    }

    @When("^I place the bet$")
    public void iPlaceTheBet() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickOnBetSlipInEsports());
        SportsBettingPageContainer.sbesportspage.enterBetAmountOnBetSlip();
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickOnPlaceBetInBetSlip());
    }

    @Then("^I should see the bet is placed$")
    public void iShouldSeeTheBetIsPlaced() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyTicketNumberEsports());
    }

   // Regression - Methods


//    @When("^I click on ESPORTS$")
//    public void iClickOnESPORTS() {
//        SportsBettingPageContainer.sbesportspage.clickOnEsports();
//    }
//
//    @Then("^I see different sub-tabs under Esports tab$")
//    public void iSeeDifferentSubTabsUnderEsportsTab() {
//        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifySubTabEsports());
//    }

   @Given("^as a User, I move to Esports page$")
    public void asAUserIMoveToEsportsPage() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
       SportsBettingPageContainer.signUpPage.clickHeaderTab("ESPORTS");
       Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyEsports());
    }

    @When("^I click on Favorite sub-tab$")
    public void iClickOnFavoriteSubTab() {
        SportsBettingPageContainer.sbesportspage.clickOnFavourites();

    }

    @Then("^User see No favorites message$")
    public void iSeeNoFavoritesMessage() {
       Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyNoFavourites());
    }

    @And("^I click on Today sub-tab$")
    public void iClickOnTodaySubTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickOnTodayEsports());
    }

    @And("^I click on Star \\(Icon\\) of any team$")
    public void iClickOnStarIconOfAnyTeam() {
        SportsBettingPageContainer.sbesportspage.clickOnFavouriteIcon();
    }

    @Then("^verify team added to Favorite$")
    public void iSeeTeamAddedToFavorite() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyFavouriteAdded());
    }


    @When("^I click on 中文繁體$")
    public void iClickOn中文繁體() {
        SportsBettingPageContainer.sbesportspage.clickOnChineseLanuguage();
    }

    @Then("^all text changing from English to Chinese\\(中文繁體\\)$")
    public void iSeeAllTextChangingFromEnglishToChinese中文繁體() {

    }

    @When("^I click on BET HISTORY$")
    public void iClickOnBETHISTORY() {
        SportsBettingPageContainer.sbesportspage.clickOnBetHistory();

    }


    @Then("^I see betHistory(.*)$")
    public void iSeeOptions(String strOptions) {
       Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyBetHistoryOptions(strOptions));
    }

    @When("^I click on Pending Bets$")
    public void iClickOnPendingBets() {
        SportsBettingPageContainer.sbesportspage.clickPendingBets();

    }

    @And("^I click on Esports LIVE$")
    public void iClickOnEsportsLIVE() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickLiveEsports());

    }

    @And("^I choose a team or multiple teams under any header$")
    public void iChooseATeamOrMultipleTeamsUnderAnyHeader() {
        SportsBettingPageContainer.sbesportspage.clickElmntChoosingEsports();

    }

    @And("^I place a bet$")
    public void iPlaceABet() {
        SportsBettingPageContainer.sbesportspage.enterBetAmountOnBetSlip();
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickOnPlaceBetInBetSlip());

    }

    @And("^I place a max bet$")
    public void iPlaceAMaxBet() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickOnPlaceBetInBetSlip());

    }

    @Then("^I should see all the Bets that are pending$")
    public void iShouldSeeAllTheBetsThatArePending() {
       Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyTicketIdBetHistoryEsports());

    }


    @When("^I click on Bet History inside BET HISTORY$")
    public void iClickOnBetHistory() {
        SportsBettingPageContainer.sbesportspage.clickBetBetHistoryEsports();
    }

    @Then("^I enter From date$")
    public void iEnterFromAndTillDate() {
        SportsBettingPageContainer.sbesportspage.enterFromDateInBetHistory();

    }

    @And("^I enter To date$")
    public void iEnterToDate() {
        SportsBettingPageContainer.sbesportspage.enterToDateInBetHistory();

    }

    @And("^I click SHOW$")
    public void iClickSHOW() {
        SportsBettingPageContainer.sbesportspage.clickShowBetHistory();

    }


    @And("^I see all the Betting history$")
    public void iSeeAllTheBettingHistory() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyTicketIdBetHistoryEsports());

    }

    @When("^I click on Video \\(Icon\\) available under any one team$")
    public void iClickOnVideoIconAvailableUnderAnyOneTeam() {
        SportsBettingPageContainer.sbesportspage.clickVideoIcon();

    }

    @Then("^I see new window opened with Live Video playing in it$")
    public void iSeeNewWindowOpenedWithLiveVideoPlayingInIt() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyLiveMatchEsports());
    }

    @When("^I click on any team name$")
    public void iClickOnAnyTeamName() {
        SportsBettingPageContainer.sbesportspage.clickTeamNameEsports();

    }

    @Then("^I see all the details related to that team with betting options$")
    public void iSeeAllTheDetailsRelatedToThatTeamWithBettingOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyTeamNamesEsports());

    }

    @And("^I click on any team or multiple team's value under 1X2 header in any sub-tab$")
    public void iClickOnAnyTeamOrMultipleTeamSValueUnderXHeaderInAnySubTab() {
        SportsBettingPageContainer.sbesportspage.clickElmntChoosingEsports();
    }

    @When("^I see that team/teams under BETSLIP$")
    public void iSeeThatTeamTeamsUnderBETSLIP() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyTeamAddedUnderBetSlip());

    }

    @Then("^I enter any value under STAKE of BETSLIP$")
    public void iEnterAnyValueUnderSTAKEOfBETSLIP() {
        SportsBettingPageContainer.sbesportspage.enterBetAmountOnBetSlip();
    }

    @And("^I click on PLACE BET$")
    public void iClickOnPLACEBET() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickOnPlaceBetInBetSlip());

    }

    @And("^I click on any team or multiple team's value under HDP header in any sub-tab$")
    public void iClickOnAnyTeamOrMultipleTeamSValueUnderHDPHeaderInAnySubTab() {
        SportsBettingPageContainer.sbesportspage.clickOddValueUnderHdpEsports();
    }

    @And("^I click on any team or multiple team's value under Map 1 header in any sub-tab$")
    public void iClickOnAnyTeamOrMultipleTeamSValueUnderMap1HeaderInAnySubTab() {
        SportsBettingPageContainer.sbesportspage.clickOddValueUnderMap1Esports();
    }

    @And("^I click on any team or multiple team's value under Map 2 header in any sub-tab$")
    public void iClickOnAnyTeamOrMultipleTeamSValueUnderMap2HeaderInAnySubTab() {
        SportsBettingPageContainer.sbesportspage.clickOddValueUnderMap2Esports();
    }

    @And("^I click on any team or multiple team's value under Map 3 header in any sub-tab$")
    public void iClickOnAnyTeamOrMultipleTeamSValueUnderMap3HeaderInAnySubTab() {
        SportsBettingPageContainer.sbesportspage.clickOddValueUnderMap3Esports();
    }

    @And("^I click on Early Markets sub-tab$")
    public void iClickOnEarlyMarketsSubTab() {
        SportsBettingPageContainer.sbesportspage.clickOnEarlyMarketsEsports();
    }

    @And("^I click on Outright sub-tab$")
    public void iClickOnOutrightSubTab() {
        SportsBettingPageContainer.sbesportspage.clickOnOutrightsEsports();


    }

    @And("^I see all the teams that are present$")
    public void iSeeAllTheTeamsThatArePresent() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyOutrightEsport());

    }

    @When("^I choose a contest$")
    public void iChooseAContest() {
        SportsBettingPageContainer.sbesportspage.clickOnOddsOutrightEsports();

    }

//datatables
    @Then("^I see all teams that are live with bet type$")
    public void iSeeAllTeamsThatAreLiveWithBetType(DataTable tableBetTypeHeader) {
        if(!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
            Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyEspotrsBetTypeHeaders(tableBetTypeHeader));
        }
    }

    @When("^I click on Results sub-tab$")
    public void iClickOnResultsSubTab() {
        SportsBettingPageContainer.sbesportspage.clickResultsTab();

    }

    @Then("^I see all the teams that are present with date range selector$")
    public void iSeeAllTheTeamsThatArePresentWithDateRangeSelector() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyDateSelectorResultsEsports());
    }

    @And("^I sholud see selectors and Markets options$")
    public void iSholudSeeSelectorsAndOptions(DataTable tableResults) {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyResultSelectorsEsports(tableResults));
       Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyResultsMarketEsports());
    }

    @When("^I click on any date from the range of dates given$")
    public void iClickOnAnyDateFromTheRangeOfDatesGiven() {
        SportsBettingPageContainer.sbesportspage.clickDateSelectorResultsEsports();

    }

    @Then("^I select either Prematch or Live from the selector$")
    public void iSelectEitherPrematchOrLiveFromTheSelector() {
        SportsBettingPageContainer.sbesportspage.clickLiveResultsEsports();
    }

    @And("^I sholud see all the teams falling under the selector and date$")
    public void iSholudSeeAllTheTeamsFallingUnderTheSelectorAndDate() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyTeamNameResultsEsports());
    }

    @Then("^I select any one choice below Markets header$")
    public void iSelectAnyOneChoiceBelowMarketsHeader() {
        SportsBettingPageContainer.sbesportspage.clickMarketValueResult();

    }

    @And("^I see all the information related to the choice \\(Markets\\) choosed$")
    public void iSeeAllTheInformationRelatedToTheChoiceMarketsChoosed() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyTeamNamesEsports());
    }

    @Then("^I select any one option from the selector \\(Category\\)$")
    public void iSelectAnyOneOptionFromTheSelectorCategory() {
        SportsBettingPageContainer.sbesportspage.clickCategoriesOptionResults();
    }

    @And("^I click on Esports tab$")
    public void iClickOnEsportsTab() {
        SportsBettingPageContainer.sbesportspage.clickSportsBettingEsportsTab();

    }

    @And("^I sholud see all the teams falling under the Category and Date$")
    public void iSholudSeeAllTheTeamsFallingUnderTheCategoryAndDate() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyTeamNameResultsEsports());
    }

    @And("^I click on Esports (.*) sub-tab$")
    public void iClickOnAnyOfSubTabExceptResultsSubTab(String subTabsEsports) {
        SportsBettingPageContainer.sbesportspage.clickSubTabsEsports(subTabsEsports);
    }

    @When("^I select any (.*) under Odds selector$")
    public void iSelectAnyOptionUnderOddsSelector(String oddsTypes) {
        SportsBettingPageContainer.sbesportspage.choosingOddsEsports(oddsTypes);
    }

    @Then("^I see all the values under sub-tab selected change accordingly$")
    public void iSeeAllTheValuesUnderSubTabSelectedChangeAccordingly() {
        SportsBettingPageContainer.sbesportspage.verifyOddTypesValue();


    }


    @When("^I select any time zone under Time selector$")
    public void iSelectAnyTimeZoneUnderTimeSelector() {
        SportsBettingPageContainer.sbesportspage.choosingTimeUnderEsports();
    }

    @Then("^I see all the games displayed for selected Time zone$")
    public void iSeeAllTheGamesDisplayedForSelectedTimeZone() {
       Assert.assertTrue( SportsBettingPageContainer.sbesportspage.verifyTeamNameEsports());
    }

    @And("^I click on any of Esports (.*)$")
    public void iClickOnAnyOfEsportsSubTab(String subTabsEsports) {
        SportsBettingPageContainer.sbesportspage.clickSubTabsEsports(subTabsEsports);
    }

    @And("^I choose a team$")
    public void iChooseATeam() {
        SportsBettingPageContainer.sbesportspage.clickElmntChoosing1Esports();

    }

    @And("^I click on any value under any header present of any or multiple teams$")
    public void iClickOnAnyValueUnderAnyHeaderPresentOfAnyOrMultipleTeams() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.choosingMultipleTeams());
    }

    @When("^I see all the selected values along with team added to Bet Slip$")
    public void iSeeAllTheSelectedValuesAlongWithTeamAddedToBetSlip() {
       Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifymultipleTeamNamesBetslip());
    }

    @Then("^I click on Cancel \\(icon\\) of the particluar team I want to remove among the selected teams$")
    public void iClickOnCancelIconOfTheParticluarTeamIWantToRemoveAmongTheSelectedTeams() {
        SportsBettingPageContainer.sbesportspage.closingTeamInBetSlip();

    }

    @And("^I see all the team \\(I chose to remove\\) under Bet Slip gets removed$")
    public void iSeeAllTheTeamIChoseToRemoveUnderBetSlipGetsRemoved() {
        SportsBettingPageContainer.sbesportspage.verifyDeletedTeams();

    }

    @Then("^I click on Delete All$")
        public void iClickOnDeleteAll() {
        SportsBettingPageContainer.sbesportspage.clickDeleteall();

    }

    @And("^I see all the selections under Bet Slip gets removed$")
    public void iSeeAllTheSelectionsUnderBetSlipGetsRemoved() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyNoTeamsInBetSlip());

    }

    @When("^I click on Odd/Price Change Settings under Bet Slip$")
    public void iClickOnOddPriceChangeSettingsUnderBetSlip() {
        SportsBettingPageContainer.sbesportspage.clickOddChangeSetting();

    }

    @Then("^I select Odd/Price Change (.*)$")
    public void iAmShownWithTwoOptions(String strBetOddChangeOptions) {
        SportsBettingPageContainer.sbesportspage.verifyOddChangeOptions(strBetOddChangeOptions);

    }

    @When("^I click on My Bets$")
    public void iClickOnMyBets() {
        SportsBettingPageContainer.sbesportspage.clickingOnMyBets();

    }

    @Then("^I see My Bets (.*)$")
    public void iSeeMyBetsOptions(String strMyBetsOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyMyBetsOptions(strMyBetsOptions));

    }

    @When("^I click on History$")
    public void iClickOnHistory() {
        SportsBettingPageContainer.sbesportspage.clickHistoryInMyBets();
    }

    @Then("^I should see all the Bets that are pending in MyBets$")
    public void iShouldSeeAllTheBetsThatArePendingInMyBets() {
        SportsBettingPageContainer.sbesportspage.verifyPendingBetsInMyBets();

    }

    @When("^I click on Pending Bets in My Bets$")
    public void iClickOnPendingBetsInMyBets() {
        SportsBettingPageContainer.sbesportspage.clickPendingInMyBets();
    }

    @Then("^I see all the Betting history in My Bets$")
    public void iSeeAllTheBettingHistoryInMyBets() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyBetTicketsInMyBets());
    }

    @And("^I enter any name in the Team Search input field with not less than three alphabets$")
    public void iEnterAnyNameInTheTeamSearchInputFieldWithNotLessThanThreeAlphabets() {
        SportsBettingPageContainer.sbesportspage.enterTeamNameInSearchBox();
    }

    @When("^I click search Icon$")
    public void iHitEnter() {
        SportsBettingPageContainer.sbesportspage.clickSearchIcon();
    }

    @Then("^I see all the team\\(s\\) following under the searched keyword$")
    public void iSeeAllTheTeamSFollowingUnderTheSearchedKeyword() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyTeamNameWithSearchBox());

    }

    @When("^I click on Clear \\(icon\\) inside Team Search$")
    public void iClickOnClearIconInsideTeamSearch() {
        SportsBettingPageContainer.sbesportspage.clickSearchIcon();
    }

    @Then("^specific results gets removed and all the teams available gets displayed$")
    public void specificResultsGetsRemovedAndAllTheTeamsAvailableGetsDisplayed() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyTeamNameEsports());
    }

    @And("^I click on Bet Max choice below Stake column$")
    public void iClickOnBetMaxChoiceBelowStakeColumn() {
       SportsBettingPageContainer.sbesportspage.clickBetMaxOption();
    }

    @When("^I click on Straight choice under Bet Slip$")
    public void iClickOnStraightChoiceUnderBetSlip() {
        SportsBettingPageContainer.sbesportspage.clickStraightOptionInBetSlip();
    }

    @Then("^I enter Stake for each selection individually if more than one teams available and click place bet$")
    public void iEnterStakeForEachSelectionIndividuallyIfMoreThanOneTeamsAvailable() {
        SportsBettingPageContainer.sbesportspage.enteringBetAmounts();
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickOnPlaceBetInBetSlip());


    }

    @When("^I click on Parlay choice under Bet Slip$")
    public void iClickOnParlayChoiceUnderBetSlip() {
        SportsBettingPageContainer.sbesportspage.clickingParlayOption();
    }

    @When("^I click on ENGLISH$")
    public void iClickOnENGLISH() {
        SportsBettingPageContainer.sbesportspage.clickOnEnglishseLanuguage();
    }

    @Then("^I have see all text changing from Chinese to English$")
    public void iHaveSeeAllTextChangingFromChineseToEnglish() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyEnglishLanguage());
    }

    @Then("^I see different options under ESports$")
    public void iSeeDifferentOptionsUnderESports(DataTable strDatas) {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifySportsBettingNavTabs(strDatas));
    }

    @Given("^as a User, I see the ESports page$")
    public void asAUserISeeTheESportsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyEsportsPage());
    }

    @When("^I click on Esports Left Navigator$")
    public void iClickOnEsportsLeftNavigator() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickLeftNavigator());
    }

    @When("^I click on Esports Right Navigator$")
    public void iClickOnEsportsRightNavigator() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickRightNavigator());
    }

    @Then("^I see different Esports options under Left Navigator$")
    public void iSeeDifferentEsportsOptionsUnderLeftNavigator(DataTable strDatas) {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyOptionsUnderLeftNavigator(strDatas));
    }

    @Then("^I see BET SLIP and MY BETS inside the right navigator$")
    public void iSeeBETSLIPAndMYBETSInsideTheRightNavigator() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyOptionsUnderRightNavigator());
    }

    @And("^I see all the selected values along with team added to Bet Slip inside Right Navigator$")
    public void iSeeAllTheSelectedValuesAlongWithTeamAddedToBetSlipInsideRightNavigator() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyEsportsTeamAddedToBetSlip());
    }

    @When("^I click on YOUR BETS under Left Navigator$")
    public void iClickOnYOURBETSUnderLeftNavigator() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickEsportsYourBetUnderLeftNavigator());
    }

    @Then("^I see BET HISTORY option inside YOUR BETS$")
    public void iSeeBETHISTORYOptionInsideYOURBETS() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyEsportsBetHistoryInsideLeftNavigator());
    }

    @Given("^as a User, I have already clicked on YOUR BETS$")
    public void asAUserIHaveAlreadyClickedOnYOURBETS() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyEsportsBetHistoryInsideLeftNavigator());
    }

    @When("^I click on BET HISTORY inside YOUR BETS$")
    public void iClickOnBETHISTORYInsideYOURBETS() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickBetHistoryInsideLeftNavigator());
    }

    @Then("^I see Pending and History under MY BETS inside RIGHT NAVIGATOR with same results$")
    public void iSeePendingAndHistoryUnderMYBETSInsideRIGHTNAVIGATORWithSameResults() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyEsportsBetHistory());
    }

    @When("^I click on Esports COUNTRY under Left Navigator$")
    public void iClickOnEsportsCOUNTRYUnderLeftNavigator() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickEsportsCountryInsideLeftNavigator());
    }

    @Then("^I see countries inside Country$")
    public void iSeeCountriesInsideCountry(DataTable strDatas) {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyEsportsCountriesInsideLeftNavigator(strDatas));
    }

    @When("^I click on Esports Country (.*)$")
    public void iClickOnEsportsCountry(String strCountry) {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.clickEsportsChineseCountry(strCountry));
    }

    @Then("^I see all text changing from English to Chinese$")
    public void iSeeAllTextChangingFromEnglishToChinese() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyEsportsChinesePage());
    }

    @Given("^as a User, I have already clicked Chinese inside COUNTRY inside LEFT NAVIGATOR$")
    public void asAUserIHaveAlreadyClickedChineseInsideCOUNTRYInsideLEFTNAVIGATOR() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyEsportsChinesePage());
    }

    @Then("^I see all text changing from Chinese to English$")
    public void iSeeAllTextChangingFromChineseToEnglish() {
        Assert.assertTrue(SportsBettingPageContainer.sbesportspage.verifyEsportsEnglishPage());
    }

    @Then("^I should see max bet amount in the stake column$")
    public void iShouldSeeMaxBetAmountInTheStakeColumn() {
        SportsBettingPageContainer.sbesportspage.verifyEsportsBetMaxValue();
    }
}

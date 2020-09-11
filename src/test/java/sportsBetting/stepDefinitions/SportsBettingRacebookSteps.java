package sportsBetting.stepDefinitions;

import cap.helpers.Constants;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SportsBettingRacebookSteps {

    private sportsBetting.SportsBettingPageContainer SportsBettingPageContainer;
    private WebDriver driver;

    public SportsBettingRacebookSteps(sportsBetting.SportsBettingPageContainer SportsBettingPageContainer) {
        this.SportsBettingPageContainer = SportsBettingPageContainer;
    }

    @When("^I click on Racebook sub-tab (.*)$")
    public void iClickOnRacebookSubTab(String depositTab) {
        SportsBettingPageContainer.sbracebookpage.clickRacebookSubTab(depositTab);
    }

    @Then("^I see different (.*) under the Racebook page$")
    public void iSeeDifferentSubTabsUnderTheRacebookPage(String strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyRacebookTabs(strTabs));
    }

    @Given("^as a User, I am on sportsbetting (.*) page$")
    public void asAUserIAmOnPage(String strTabs) {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        SportsBettingPageContainer.signUpPage.clickHeaderTab("RACEBOOK");
        if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            if (!System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
                Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickRacebookTab(strTabs));
            }
        }
    }

    @Then("^I see different (.*) under the Racebook sub-tab page$")
    public void iSeeDifferentOPtionsUnderTheRacebookSubTabPage(String strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyTabsList(strTabs));
    }

    @And("^I click on EXPAND if SEARCH box is in Collapsed state$")
    public void iClickOnEXPANDIfSEARCHBoxIsInCollapsedState() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifySearchBoxExpanded());
    }

    @When("^I enter anything inside SEARCH$")
    public void iEnterAnythingInsideSEARCH() {
        SportsBettingPageContainer.sbracebookpage.enterTextSearch();
    }

    @Then("^I see results matching to entered keyword below the SEARCH box$")
    public void iSeeResultsMatchingToEnteredKeywordBelowTheSEARCHBox() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifySearchResult());
    }

    @When("^I click on ADVANCE option$")
    public void iClickOnADVANCEOption() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickAdvancedSearch());
    }

    @Then("^I see a search pop-up with options$")
    public void iSeeASearchPopUpWithOptions(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyAdvancedSearchOptions(strTabs));
    }

    @Given("^as a User, I am on the ADVANCE search pop-up$")
    public void asAUserIAmOnTheAdvancedSearchPopUp() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyAdvancedSearch());
    }

    @When("^I enter anything inside SEARCH in Runner or Jockey option with words not less than two$")
    public void iEnterAnythingInsideSEARCHInRunnerOrJockeyOptionWithWordsNotLessThanTwo() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.enterRunnerOrJockeyName());
    }

    @Then("^I see results matching to entered keyword below the Runner or Jockey$")
    public void iSeeResultsMatchingToEnteredKeywordBelowTheRunnerOrJockey() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyAdvancedSearchResult());
    }

    @And("^if result fetched comes to be more than 5, I click on plus to see next page$")
    public void ifResultFetchedComesToBeMoreThanIClickOnPlusToSeeNextPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickAdvancedSearchPlusIcon());
    }

    @And("^if on next result section, to return I click on minus to see previous page$")
    public void ifOnNextResultSectionToReturnIClickOnMinusToSeePreviousPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickAdvancedSearchMinusIcon());
    }

    @When("^I enter anything inside SEARCH in Track option with words not less than two$")
    public void iEnterAnythingInsideSEARCHInTrackOptionWithWordsNotLessThanTwo() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickTrackOnAdvancedSearch());
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.enterRunnerOrJockeyName());
    }

    @When("^I click on Close$")
    public void iClickOnClose() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickCloseOnAdvanced());
    }

    @Then("^I can see the Racebook sub-tab page$")
    public void iCanSeeTheRacebookSubTabPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyRacebookSubTab());
    }


    @When("^I hover over My Account$")
    public void iHoverOverMyAccount() {
        SportsBettingPageContainer.sbracebookpage.mouseOverMyAccount();
    }

    @Then("^I should see options$")
    public void iShouldSeeOptions(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyMouseOveredItems(strTabs));
    }

    @When("^I click on View active bets$")
    public void iClickOnViewActiveBets() {
       Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickViewActiveBets());
    }

    @Then("^I see all the acive bets under a new window$")
    public void iSeeAllTheAciveBetsUnderANewWindow() {
        SportsBettingPageContainer.sbracebookpage.verifyActiveBets();
    }

    @When("^I click on View final bets$")
    public void iClickOnViewFinalBets() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickViewFinalBets());
    }

    @Then("^I see all the final bets under a new window$")
    public void iSeeAllTheFinalBetsUnderANewWindow() {
        SportsBettingPageContainer.sbracebookpage.verifyFinalBets();
    }

    @When("^I click on View race results$")
    public void iClickOnViewRaceResults() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickViewRaceResults());
    }

    @Then("^I see all the final race results below Upcoming races$")
    public void iSeeAllTheFinalRaceResultsBelowUpcomingRaces() {
        SportsBettingPageContainer.sbracebookpage.verifyResults();
    }

    @Given("^as a User, I am see race results page$")
    public void asAUserIAmSeeRaceResultsPage() {
        SportsBettingPageContainer.sbracebookpage.verifyResults();
    }

    @When("^I click any date from date selector$")
    public void iClickAnyDateFromDateSelector() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.selectDateRaceResults());
    }

    @Then("^I see all the final race results below Upcoming races for that date chosen$")
    public void iSeeAllTheFinalRaceResultsBelowUpcomingRacesForThatDateChosen() {
        SportsBettingPageContainer.sbracebookpage.verifyResults();
    }

    @When("^I click over My Account$")
    public void iClickOverMyAccount() {
        SportsBettingPageContainer.sbracebookpage.clickMyAccountView();
    }

    @Then("^I should see options1$")
    public void iShouldSeeOptions1(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyClickedMyAccountTabs(strTabs));
    }

    @When("^I click any jockey or runner to bet$")
    public void iClickAnyJockeyOrRunnerToBet() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickRunnerOrJockeyOdds());
    }

    @Then("^I should see selected Jockey or Runner to be displayed for betting under Bet Slip$")
    public void iShouldSeeSelectedJockeyOrRunnerToBeDisplayedForBettingUnderBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyAddedOddsToBetSlip());
    }

    @And("^I click on Remove all bets under Bet Slip$")
    public void iClickOnRemoveAllBetsUnderBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickRemoveAllBetsBet());
    }

    @When("^I accept the pop-up by clicking on Yes$")
    public void iAcceptThePopUpByClickingOnYes() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickYesOnPopUp());
    }

    @Then("^I should see all the items removed and Bet Slip should be empty$")
    public void iShouldSeeAllTheItemsRemovedAndBetSlipShouldBeEmpty() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyDeletedBetsOnBetSlip());
    }

    @When("^I reject the pop-up by click on No$")
    public void iRejectThePopUpByClickOnNo() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickNoOnPopUp());
    }

    @Then("^I should see no item removed and Bet Slip should be intact$")
    public void iShouldSeeNoItemRemovedAndBetSlipShouldBeIntact() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyAddedOddsToBetSlip());
    }

    @When("^I click on Submit all bets$")
    public void iClickOnSubmitAllBets() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickSubmitBet());
    }

    @Then("^I should be shown either confirmation message or failure message$")
    public void iShouldBeShownEitherConfirmationMessageOrFailureMessage() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifySubmitMessage());
    }

    @And("^the bet placed should be shown in Active Bets under Transactions History$")
    public void theBetPlacedShouldBeShownInActiveBetsUnderTransactionsHistory() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase("mobile")) {
            Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickMyAccountViewWithoutFrame());
        } else {
            Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.hoverMyAccount());
        }
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickViewActiveBets());
        SportsBettingPageContainer.sbracebookpage.verifyActiveBetsAndVerifyTicket();
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyTicketNumberOnNewWindow());
    }

    @And("^I click on Close under Bet Slip$")
    public void iClickOnCloseUnderBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickCloseUnderBetSlip());
    }

    @When("^I accept pop-up by clicking Yes$")
    public void iAcceptPopUpByClickingYes() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickYesOnPopUp());
    }

    @Then("^I should see that bet should be removed from Bet Slip$")
    public void iShouldSeeThatBetShouldBeRemovedFromBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyDeletedBetsOnBetSlip());
    }

    @When("^I reject pop-up by clicking No$")
    public void iRejectPopUpByClickingNo() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickNoOnPopUp());
    }

    @Then("^I should see that bet should not be removed from Bet Slip$")
    public void iShouldSeeThatBetShouldNotBeRemovedFromBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyAddedOddsToBetSlip());
    }

    @Then("^I should be shown with all the races under Upcoming races header$")
    public void iShouldBeShownWithAllTheRacesUnderUpcomingRacesHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyGamesUnderUpcomingRaces());
    }

    @Given("^as a User, I see all the upcoming races$")
    public void asAUserISeeAllTheUpcomingRaces() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyGamesUnderUpcomingRaces());
    }

    @When("^I click on any upcoming race$")
    public void iClickOnAnyUpcomingRace() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickUpcomingRace());
    }

    @Then("^I should be shown with all the racers or jockey under THOROUGHBRED\\(s\\) header$")
    public void iShouldBeShownWithAllTheRacersOrJockeyUnderTHOROUGHBREDSHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyThoroughbreds());
    }

    @Then("^I click on Minus \\(-\\) icon present in THOROUGHBRED\\(s\\)$")
    public void iClickOnMinusIconPresentInTHOROUGHBREDS() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickMinusUnderThoroughbred());
    }

    @And("^I see THOROUGHBRED\\(s\\) header collapses and items went hidden$")
    public void iSeeTHOROUGHBREDSHeaderCollapsesAndItemsWentHidden() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyMaximizeUnderThoroughbred());
    }

    @Given("^I see collapsed \\(\\+\\) THOROUGHBRED\\(s\\) header$")
    public void iSeeCollapsedTHOROUGHBREDSHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyMaximizeIconUnderThoroughbred());
    }

    @When("^I click on Plus \\(\\+\\) icon present in collapsed THOROUGHBRED\\(s\\)$")
    public void iClickOnPlusIconPresentInCollapsedTHOROUGHBREDS() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickMaximizeUnderThproughbred());
    }

    @Then("^I am shown with all the racers or jockey under THOROUGHBRED\\(s\\) header$")
    public void iAmShownWithAllTheRacersOrJockeyUnderTHOROUGHBREDSHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyFirstTeamUnderThoroughbred());
    }

    @Given("^as a User, I already see racers or jockeys under THOROUGHBRED\\(s\\) header$")
    public void asAUserIAlreadySeeRacersOrJockeysUnderTHOROUGHBREDSHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyThoroughbredTeams());
    }

    @When("^I click on any racer or jockey$")
    public void iClickOnAnyRacerOrJockey() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickFirstRacerOrJockeyUnderThoroughbred());
    }

    @Then("^I see Races with numbers, 1 selected as default$")
    public void iSeeRacesWithNumbersSelectedAsDefault() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyRacesUnderUpcomingRaces());
    }

    @And("^I see Show race details$")
    public void iSeeShowRaceDetails() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyShowRaceDetails());
    }

    @And("^I see Add to bet slip button$")
    public void iSeeAddToBetSlipButton() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyButtonBetSlip());
    }

    @Given("^as a User, I have already selected any racer or jockey from under THOROUGHBRED\\(s\\)$")
    public void asAUserIHaveAlreadySelectedAnyRacerOrJockeyFromUnderTHOROUGHBREDS() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyRacesUnderUpcomingRaces());
    }

    @When("^I click on Show race details$")
    public void iClickOnShowRaceDetails() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickRacesDetails());
    }

    @Then("^I am shown all details related to racer or jockey in expand view$")
    public void iAmShownAllDetailsRelatedToRacerOrJockeyInExpandView() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyShowRaceDetailsExpanded());
    }

    @When("^I see Straight selected as default$")
    public void iSeeStraightSelectedAsDefault() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyStraight());
    }

    @Then("^I see options$")
    public void iSeeOptions(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyWinPlaceShow(strTabs));
    }

    @When("^I enter any value under either Win or Place or Show$")
    public void iEnterAnyValueUnderEitherWinOrPlaceOrShow() {
        SportsBettingPageContainer.sbracebookpage.enterWin();
    }

    @Then("^I click on Add to bet slip$")
    public void iClickOnAddToBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickAddToBet());
    }

    @And("^I see particular selection is added to the Bet Slip$")
    public void iSeeParticularSelectionIsAddedToTheBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyAddedOddsToBetSlip());
    }

    @When("^I scroll down to The Racebook at SportsBetting header$")
    public void iScrollDownToTheRacebookAtSportsBettingHeader() {
        SportsBettingPageContainer.sbracebookpage.moveToContent();
    }

    @Then("^I should be shown with all the contents under The Racebook at SportsBetting header with (.*)$")
    public void iShouldBeShownWithAllTheContentsUnderTheRacebookAtSportsBettingHeaderWithLink(String strHeader) {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyContents(strHeader));
    }

    @Given("^as a User, I already see contents under The Racebook at SportsBetting header$")
    public void asAUserIAlreadySeeContentsUnderTheRacebookAtSportsBettingHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyContentsTheRacebookAtSportsBetting());
    }

    @When("^I click on check out the horse-betting section of the sport categories link$")
    public void iClickOnCheckOutTheHorseBettingSectionOfTheSportCategoriesLink() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickContentsTheRacebookAtSportsBetting());
    }

    @Then("^I should be redirected to the SPORTS page$")
    public void iShouldBeRedirectedToTheSPORTSPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifySportsNews());
    }

    @Then("^I should see different sub-tabs under Racebook Info sub-tab$")
    public void iShouldSeeDifferentSubTabsUnderRacebookInfoSubTab(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifySubTabsUnderRacebookInfo(strTabs));
    }

    @Then("^I should see all contents under (.*) sub-tab$")
    public void iShouldSeeAllContentsUnderSubTab(String strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyRacebookInfoTabs(strTabs));
    }

    @When("^I click Racebook Info sub-tab (.*)$")
    public void iClickRacebookInfoSubTabHowToBetHorses(String strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickRacebookInfoTabs(strTabs));
    }

    @Then("^I should see all the available promotions with options$")
    public void iShouldSeeAllTheAvailablePromotionsWithOptions(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyPromotionsLink());

    }

    @Given("^as a User, I have already clicked on Promotions sub-tab$")
    public void asAUserIHaveAlreadyClickedOnPromotionsSubTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyPromotionsLink());
    }

    @When("^I click on Terms & Conditions under any promotion available$")
    public void iClickOnTermsConditionsUnderAnyPromotionAvailable() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickTermsAndConditions());
    }

    @Then("^I should see a pop-up with all the Terms & Conditions$")
    public void iShouldSeeAPopUpWithAllTheTermsConditions() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyTermsAndConditions());
    }

    @When("^I click on Deposit Now under any promotion available$")
    public void iClickOnDepositNowUnderAnyPromotionAvailable() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.clickDepositNow());
    }

    @Then("^I should see a quick pop-up for credit card details same as in Cashier tab with Change Payment Method$")
    public void iShouldSeeAQuickPopUpForCreditCardDetailsSameAsInCashierTabWithChangePaymentMethod() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyDepositNow());
    }

    @And("^I see Streaming video header$")
    public void iSeeStreamingVideoHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyRacebookStreamingVideoUnderThoroughbed());
    }

    @Then("^I see options for Mobile$")
    public void iSeeOptionsForMobile(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbracebookpage.verifyWinPlace(strTabs));
    }
}

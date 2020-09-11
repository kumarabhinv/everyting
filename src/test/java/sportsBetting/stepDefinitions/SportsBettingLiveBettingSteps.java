package sportsBetting.stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SportsBettingLiveBettingSteps {


    private sportsBetting.SportsBettingPageContainer SportsBettingPageContainer;
    private WebDriver driver;

    public SportsBettingLiveBettingSteps(sportsBetting.SportsBettingPageContainer SportsBettingPageContainer) {
        this.SportsBettingPageContainer = SportsBettingPageContainer;
    }

    @Then("^I should see (.*) under the Live Betting tab$")
    public void iShouldSeeSubTabUnderTheLiveBettingTab(String strtabs) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifysubtabs(strtabs));
    }

    @Then("^I see MenuTypes under Live Betting sub tab\\.$")
    public void iSeeMenuTypesUnderLiveBettingSubTab(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMenuTypes(Table));
    }


    @Given("^as a user, I am on Live Betting tab$")
    public void asAUserIAmOnLiveBettingTab() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickLiveBettingpage());
    }

    @When("^I click Event View$")
    public void iClickEventView() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickEventView());
    }

    @Then("^I should see the (.*) with Expand & Collapse icon$")
    public void iShouldSeeTheGameListWithExpandCollapseIcon(String strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyGameList(strTabs));
    }

    @Then("^I should see (.*) with appropirate icon & location$")
    public void iShouldSeeNowLiveWithAppropirateIconLocation(String strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyGameList(strTabs));
    }

    @And("^I click Now Live$")
    public void iClickNowLive() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyNowLiveOption());
    }

    @Then("^I should see all the live events displaying in Now Live$")
    public void iShouldSeeAllTheLiveEventsDisplayingInNowLive() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyNowLiveOption());
    }

    @Then("^I should see all Upcoming games with appropriate icon & location$")
    public void iShouldSeeAllUpcomingGamesWithAppropriateIconLocation() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyUpcomingGames());
    }

    @And("^I see live game events under Now Live$")
    public void iSeeLiveGameEventsUnderNowLive() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyLiveGames());
    }

    @When("^I click any of the live event$")
    public void iClickAnyOfTheLiveEvent() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.selectlivegames());
    }

    @Then("^I should see Live Match Summary details for the appropirate event$")
    public void iShouldSeeLiveMatchSummaryDetailsForTheAppropirateEvent() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyLiveMatchSummary());
    }

    @When("^I click Upcoming Collapse icon$")
    public void iClickUpcomingCollapseIcon() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyUpcomingGames());
    }

    @Then("^I should see all the Upcoming events count displaying in Upcoming games$")
    public void iShouldSeeAllTheUpcomingEventsCountDisplayingInUpcomingGames() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyFutureGames());
    }


    @Given("^as a user, I am on <tab>$")
    public void asAUserIAmOnTab(String strTabName) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyLiveTab(strTabName));
    }

    @And("^I see event view in maximize mode$")
    public void iSeeEventViewInMaximizeMode() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMinimizeicon());
    }


    @When("^I click minimize icon$")
    public void iClickMinimizeIcon() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickMinimizeicon());

    }

    @Then("^I should see all the Events minimized$")
    public void iShouldSeeAllTheEventsMinimized() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMaximize());
    }

    @When("^I click Multi View$")
    public void iClickMultiView() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickMultiView());
    }

    @Then("^I should see all the Live events splitted as four slots with Expand & Collapse icon$")
    public void iShouldSeeAllTheLiveEventsSplittedAsFourSlotsWithExpandCollapseIcon() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMultiviewtabs());

    }

    @When("^I click Calender$")
    public void iClickCalender() {
       Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickCalendarTab());
    }

    @Then("^I should see calender view for all the live and upcoming events$")
    public void iShouldSeeCalenderViewForAllTheLiveAndUpcomingEvents() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyCalendarEvents());
    }

    @Given("^as a user,I am on Multi View games page$")
    public void asAUserIAmOnMultiViewGamesPage() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMultiViewtab());
    }

    @And("^I see all the live events in splitted screens$")
    public void iSeeAllTheLiveEventsInSplittedScreens() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMultiviewtabs());
    }


    @And("^I click live events in all the splitted screens$")
    public void iClickLiveEventsInAllTheSplittedScreens() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickMultiviewEvents());
    }

    @And("^I see Match Summary Details open in all the splitted screens$")
    public void iSeeMatchSummaryDetailsOpenInAllTheSplittedScreens() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyLiveMatches());
    }


    @When("^I click close icon in any the splitted screens$")
    public void iClickCloseIconInAnyTheSplittedScreens() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickMultiviewEvents());
    }

    @Then("^I should see Match Summary Details will closed particular screens\\.$")
    public void iShouldSeeMatchSummaryDetailsWillClosedParticularScreens() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickMultiviewEvents());

    }

    @When("^I click My Wagers$")
    public void iClickMyWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickMyWagers());
    }

    @And("^i verify pop-up$")
    public void iVerifyPopUp() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickPopUp());
    }

    @Then("^I should see Wagers Details$")
    public void iShouldSeeWagersDetails(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyWagersDetails(Table));
    }

    @When("^I click Today tab under My Wagers menu type$")
    public void iClickTodayTabUnderMyWagersMenuType() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickTodayButton());
    }

    @Then("^I should see My wagers details according to the Today's Bet$")
    public void iShouldSeeMyWagersDetailsAccordingToTheTodaySBet() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyWagers());
    }

    @When("^I click This Week tab under My Wagers menu type$")
    public void iClickThisWeekTabUnderMyWagersMenuType() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickThisWeekBtn());
    }

    @Then("^I should see My wagers details according to the This weeks Bet\\.$")
    public void iShouldSeeMyWagersDetailsAccordingToTheThisWeeksBet() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyThisWeekWagers());
    }

    @Given("^as a user, I am on My Wagers page$")
    public void asAUserIAmOnMyWagersPage() {

        SportsBettingPageContainer.sblivebettingpage.verifyMyWagersPage();
    }

    @When("^I click All Undecided tab under My Wagers menu type$")
    public void iClickAllUndecidedTabUnderMyWagersMenuType() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickUndecidedBtn());
    }

    @Then("^I should see My wagers details according to the All undecided Bet$")
    public void iShouldSeeMyWagersDetailsAccordingToTheAllUndecidedBet() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyTodayWagers());
    }


    @Then("^I should see outcome bets are removed from the All Undecided tab$")
    public void iShouldSeeOutcomeBetsAreRemovedFromTheAllUndecidedTab() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyUndecidedWagers());
    }

    @Then("^I should see outcome results with Amount Paid$")
    public void iShouldSeeOutcomeResultsWithAmountPaid() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyAmountPaid());
    }

    @Given("^as a user, I am on Calendar page$")
    public void asAUserIAmOnCalendarPage() {
       Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickCalendarTab());
    }

    @Then("^user should see Message$")
    public void userShouldSeeMessage() {
        SportsBettingPageContainer.sblivebettingpage.verifyCalendardays();
    }

    @Then("^I click days where no live events are scheduled on Calendar$")
    public void iClickDaysWhereNoLiveEventsAreScheduledOnCalendar() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickCalendardays());
    }


    @Then("^I should see calender view changed according to the selected sport type$")
    public void iShouldSeeCalenderViewChangedAccordingToTheSelectedSportType() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifySports());
    }

    @When("^I click Rules in Live Betting page$")
    public void iClickRulesInLiveBettingPage() {
        SportsBettingPageContainer.sblivebettingpage.clickRules();
    }

    @Then("^I should see Rules Content for all the sports$")
    public void iShouldSeeRulesContentForAllTheSports() {
        SportsBettingPageContainer.sblivebettingpage.verifyRulesInformation();
    }

    @When("^I Change (.*) from drop down$")
    public void iChangeOddsFormatFromDropDown(String Oddvalues) {
        SportsBettingPageContainer.sblivebettingpage.ChangeOddsFormat(Oddvalues);
    }

    @Then("^I should see instructions for How to Bet Live$")
    public void iShouldSeeInstructionsForHowToBetLive() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyLiveBetInformation());
    }

    @When("^I click How To Bet Live tab$")
    public void iClickHowToBetLiveTab() {
        SportsBettingPageContainer.sblivebettingpage.clickHowToBetLivetab();
    }

    @And("^I choose the team under live game$")
    public void iChooseTheTeamUnderLiveGame() {
        SportsBettingPageContainer.sblivebettingpage.clickTeams();
    }

    @And("^i enter Bet Amount in betslip$")
    public void iEnterBetAmountInBetslip() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.enterBetAmount());
    }

    @When("^I click Place Bet button on Bet Slip$")
    public void iClickPlaceBetButtonOnBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickPlaceMyBet());
    }

    @Then("^I should see successfully Bet Posted popup$")
    public void iShouldSeeSuccessfullyBetPostedPopup() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickClosePopup());
    }

    @When("^I select any game from dropdown$")
    public void iSelectHockeyFromDropdown() {
        SportsBettingPageContainer.sblivebettingpage.clickDropdown();
    }

    @Then("^I should see placed bets are in Pending status$")
    public void iShouldSeePlacedBetsAreInPendingStatus() {
        SportsBettingPageContainer.sblivebettingpage.verifyPendingWagers();
    }

    @And("^I click any live game$")
    public void iClickAnyLiveGame() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickLiveEvent());
    }

    @When("^I check Quick Bet on check box in bet slip$")
    public void iCheckQuickBetOnCheckBoxInBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickQuickBetbtn());
    }

    @Then("^I should see Alert popup$")
    public void iShouldSeeAlertPopup() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyPopupInfo());
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickQuickBetbtn());
    }

    @When("^I click on odds$")
    public void iClickOnOdds() {
        SportsBettingPageContainer.sblivebettingpage.clickTeams();
    }

    @Then("^I should see successfully BetPosted$")
    public void iShouldSeeSuccessfullyBetPosted() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyBetInformation());
    }

    @And("^I click Quick Bet on check box in bet slip$")
    public void iClickQuickBetOnCheckBoxInBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyPopupInfo());
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickQuickBetbtn());
    }

    @Then("^I should see Odds changed according to the selected OddsFormat$")
    public void iShouldSeeOddsChangedAccordingToTheSelectedOddsFormat() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyOddsChanges());
    }

    @And("^I see Bet slip$")
    public void iSeeBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyBetSlip());
    }

    @Then("^I should see following (.*)$")
    public void iShouldSeeFollowingBetSlipTabs(String strtabs) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyBetSlipTabs(strtabs));
    }

    @When("^I click on Rules tab in Bet slip$")
    public void iClickOnRulesTabInBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickBetSlipRulesbtn());
    }

    @Then("^I should see page navigates to the Rules subtab under Live Betting$")
    public void iShouldSeePageNavigatesToTheRulesSubtabUnderLiveBetting() {
        SportsBettingPageContainer.sblivebettingpage.verifyRulesInformation();
    }

    @Then("^I should see Market Tips for available sports$")
    public void iShouldSeeMarketTipsForAvailableSports() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMarketTips());
    }

    @When("^I click the no market tips available sport$")
    public void iClickTheNoMarketTipsAvailableSport() {
        SportsBettingPageContainer.sblivebettingpage.clickMarketTipsGames();
    }

    @Then("^I should see Currently there are no market tips available Message$")
    public void iShouldSeeCurrentlyThereAreNoMarketTipsAvailableMessage() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMarketTipsMessage());
    }

    @When("^I successfully Place the bets$")
    public void iSuccessfullyPlaceTheBets() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyBetInformation());
    }

    @Then("^I should see All the placed bet slip in My Bets tab$")
    public void iShouldSeeAllThePlacedBetSlipInMyBetsTab() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickMyBetsTab());
    }

    @And("^I see Betslip$")
    public void iSeeBetslip() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyBetslip());
    }

    @When("^I click close icon in betslip$")
    public void iClickCloseIconInBetslip() {
        SportsBettingPageContainer.sblivebettingpage.clickCloseBtn();

    }

    @Then("^I should see bet slip is removed$")
    public void iShouldSeeBetSlipIsRemoved() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyEmptyBetslip());
    }

    @When("^I click on My Bets on This Game button$")
    public void iClickOnMyBetsOnThisGameButton() {

        SportsBettingPageContainer.sblivebettingpage.clickMyBetsButton();
    }

    @Then("^I should see page navigates to the My Wagers tab$")
    public void iShouldSeePageNavigatesToTheMyWagersTab() {
        SportsBettingPageContainer.sblivebettingpage.verifyMyWagersPage();
    }

    @And("^I see bet details displaying as tab with team name$")
    public void iSeeBetDetailsDisplayingAsTabWithTeamName() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyTodayWagers());
    }

    @When("^I click live event from the Today tab$")
    public void iClickLiveEventFromTheTodayTab() {
        SportsBettingPageContainer.sblivebettingpage.clickLiveGameBtn();
    }

    @Then("^I should see user navigates to the appropriate live event summary page$")
    public void iShouldSeeUserNavigatesToTheAppropriateLiveEventSummaryPage() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyLiveEvents());
    }

    @Then("^I see redirected page with following sub-tabs$")
    public void iSeeRedirectedPageWithFollowingSubTabs(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyLivePage(strTabs));
    }

    @And("^I see few games with their respective Start timing displayed under their respective headers$")
    public void iSeeFewGamesWithTheirRespectiveStartTimingDisplayedUnderTheirRespectiveHeaders() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyStartTime());
    }

    @Given("^as a User, I am already on the Live page$")
    public void asAUserIAmAlreadyOnTheLivePage() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        SportsBettingPageContainer.signUpPage.clickHeaderTab("LIVE");
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyLivePageMobile());
    }

    @And("^I see Hide Top Menu containing home-tabs$")
    public void iSeeHideTopMenuContainingHomeTabs(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyHideTopContents(strTabs));
    }

    @When("^I click on Live Page Hide Top Menu$")
    public void iClickOnLivePageHideTopMenu() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickHideToMenu());
    }

    @Then("^I see Hide Top Menu changes to Show Top Menu$")
    public void iSeeHideTopMenuChangesToShowTopMenu() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyShowToMenu());
    }

    @When("^I click Live Page Show Top Menu$")
    public void iClickLivePageShowTopMenu() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickShowTopMenu());
    }

    @Then("^I see Show Top Menu is changed to Hide Top Menu showing all the home-tabs again$")
    public void iSeeShowTopMenuIsChangedToHideTopMenuShowingAllTheHomeTabsAgain(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyHideTopContents(strTabs));
    }

    @Given("^as a User, I see Live Page Show Top Menu$")
    public void asAUserISeeLivePageShowTopMenu() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyShowToMenu());
    }

    @And("^I see Hide Live Menu containing live-tabs$")
    public void iSeeHideLiveMenuContainingLiveTabs(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyHideLiveMenu(strTabs));
    }

    @When("^I click on Live Page Hide Live Menu$")
    public void iClickOnLivePageHideLiveMenu() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickHideLiveMenu());
    }

    @Then("^I see Hide Live Menu changes to Show Live Menu$")
    public void iSeeHideLiveMenuChangesToShowLiveMenu() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyShowLiveMenu());
    }

    @Given("^as a User, I see Live Page Show Live Menu$")
    public void asAUserISeeLivePageShowLiveMenu() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyShowLiveMenu());
    }

    @When("^I click on Live Page Show Live Menu$")
    public void iClickOnLivePageShowLiveMenu() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickShowLiveMenu());
    }

    @Then("^I see Show Live Menu is changed to Hide Live Menu showing all the live-tabs again$")
    public void iSeeShowLiveMenuIsChangedToHideLiveMenuShowingAllTheLiveTabsAgain(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyHideLiveMenu(strTabs));
    }

    @When("^I click on Live Page (.*) Under Live Menu$")
    public void iClickOnLivePageUnderLiveMenu(String strTab) {
        SportsBettingPageContainer.sblivebettingpage.clickLivePageMenus(strTab);
    }

    @Then("^I see a refreshed page displaying two headers and a Bet Slip$")
    public void iSeeARefreshedPageDisplayingTwoHeadersAndABetSlip(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyLiveOddsContents(strTabs));
    }

    @And("^I see a bar stating No Events Selected$")
    public void iSeeABarStatingNoEventsSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyNoEventSelectedUnderLiveOdds());
    }

    @Given("^as a User, I am already on the (.*) under Live Menu$")
    public void asAUserIAmAlreadyOnTheUnderLiveMenu(String strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyLiveMenuPages(strTabs));
    }

    @When("^I click on In Progress \\(displaying count of all the games in progress\\)$")
    public void iClickOnInProgressDisplayingCountOfAllTheGamesInProgress() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickInProgressUnderLiveOdds());
    }

    @Then("^I see all the games which are in progress and up for betting \\(If any\\)$")
    public void iSeeAllTheGamesWhichAreInProgressAndUpForBettingIfAny() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyInProgressTeams());
    }

    @When("^I click on Upcoming \\(displaying count of all the games upcoming in future\\)$")
    public void iClickOnUpcomingDisplayingCountOfAllTheGamesUpcomingInFuture() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickUpcomingUnderLiveOdds());
    }

    @Then("^I see all the games which are to start with their start time$")
    public void iSeeAllTheGamesWhichAreToStartWithTheirStartTime() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyUpcomingTeams());
    }

    @When("^I select any team under Live odds under Live Menu$")
    public void iSelectAnyTeamUnderLiveOddsUnderLiveMenu() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickLiveOddsTeam());
    }

    @Then("^I see all the games selected is displayed on the place of No Events Selected bar$")
    public void iSeeAllTheGamesSelectedIsDisplayedOnThePlaceOfNoEventsSelectedBar() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyOddsOfTeamSelectedFromUnderLiveOdds());
    }

    @And("^I see a My Bets on This Game button being displayed along with team selected$")
    public void iSeeAMyBetsOnThisGameButtonBeingDisplayedAlongWithTeamSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMyBetsOnThisUnderSelectedTeam());
    }

    @When("^I select any odds from under team selected under Live Odds$")
    public void iSelectAnyOddsFromUnderTeamSelectedUnderLiveOdds() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickOddsUnderSelectedTeam());
    }

    @Then("^I see a pop-up roughly stating Bet has been added$")
    public void iSeeAPopUpRoughlyStatingBetHasBeenAdded() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyBetPostedPopUp());
    }

    @And("^I see odds with respective team gets added to Bet Slip$")
    public void iSeeOddsWithRespectiveTeamGetsAddedToBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyBetAddedToBetSlip());
    }

    @When("^I click My Bets on This Game under Live Odds Team selected$")
    public void iClickMyBetsOnThisGameUnderLiveOddsTeamSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickMyBetsOnThisGame());
    }

    @Then("^I see My Wagers gets auto-selected$")
    public void iSeeMyWagersGetsAutoSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMyWagersAutoSelected());
    }

    @And("^I see all the wagers related details$")
    public void iSeeAllTheWagersRelatedDetails() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyWagersContents());
    }

    @Then("^I see list of games under there respective headers stating Select a game for this slot$")
    public void iSeeListOfGamesUnderThereRespectiveHeadersStatingSelectAGameForThisSlot() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMultiViewPage());
    }

    @Then("^I click on any team under Multi View$")
    public void iClickOnAnyTeamUnderMultiView() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickTeamUnderMultiView());
    }

    @And("^I see MY BETS on the header of individual games$")
    public void iSeeMYBETSOnTheHeaderOfIndividualGames() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMyBetsOnThisUnderSelectedTeam());
    }

    @And("^I click on any available game odds value under both Select a game for this slot header$")
    public void iClickOnAnyAvailableGameOddsValueUnderBothSelectAGameForThisSlotHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickOddsUnderSelectedTeamMultiView());
    }

    @And("^I click on Add an Event under Multi View$")
    public void iClickOnAddAnEventUnderMultiView() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickAddAnEvent());
    }

    @When("^I see Today is selected by default$")
    public void iSeeTodayIsSelectedByDefault() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyTodaySelectedAsDefault());
    }

    @Then("^I see toady's date with all the scheduled matches$")
    public void iSeeToadySDateWithAllTheScheduledMatches() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyTodayScheduledMatch());
    }

    @When("^I select any week-tab under Calendar$")
    public void iSelectAnyWeekTabUnderCalendar() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickAnyDateUnderCalender());
    }

    @Then("^I see that particular day's date being displayed along with all the scheduled matches$")
    public void iSeeThatParticularDaySDateBeingDisplayedAlongWithAllTheScheduledMatches() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyDateSelectedContents());
    }

    @Then("^I see a refreshed page displaying wagers-tab$")
    public void iSeeARefreshedPageDisplayingWagersTab(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMyWagersSubTabs(strTabs));
    }

    @When("^I select any of the wagers-tabs or team$")
    public void iSelectAnyOfTheWagersTabsOrTeam() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickAnySubTabUnderMyWagers());
    }

    @Then("^I see all the details being displayed under selected week-tabs$")
    public void iSeeAllTheDetailsBeingDisplayedUnderSelectedWeekTabs() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyMyWagersSelectedSubTabContent());
    }

    @Then("^I see refreshed page with all the rules related to games$")
    public void iSeeRefreshedPageWithAllTheRulesRelatedToGames() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyRulesPage());
    }

    @When("^I click on BET SLIP under Live Menu$")
    public void iClickOnBETSLIPUnderLiveMenu() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickBetSlipUnderLive());
    }

    @Then("^I see a text stating Your bet slip is empty$")
    public void iSeeATextStatingYourBetSlipIsEmpty() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyEmptyBetslip());
    }

    @And("^I see a dropdown with odds-options displaying Accept favourable price change$")
    public void iSeeADropdownWithOddsOptionsDisplayingAcceptFavourablePriceChange() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyAcceptFavourablePriceChangeDropDown());
    }

    @Then("^I see all the teams added with input field for Bet Amount$")
    public void iSeeAllTheTeamsAddedWithInputFieldForBetAmount() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyBetAmountField());
    }

    @And("^I see CLEAR button and Close \\(Icon\\)$")
    public void iSeeCLEARButtonAndCloseIcon() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyClearAndCloseButtonUnderBetSlip());
    }

    @When("^I click on ACCEPT CHANGES if appeared$")
    public void iClickOnACCEPTCHANGESIfAppeared() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickAcceptChanges());
    }

    @Then("^I see POST button to place bet$")
    public void iSeePOSTButtonToPlaceBet() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyPostBetButton());
    }

    @Then("^I see a pop-up either confirming bet placed or showing an error$")
    public void iSeeAPopUpEitherConfirmingBetPlacedOrShowingAnError() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyBetPostingStatus());
    }

    @When("^I click on CLEAR button under Bet Slip$")
    public void iClickOnCLEARButtonUnderBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickClearUnderBetSlip());
    }

    @When("^I click on Close \\(Icon\\) under Bet Slip$")
    public void iClickOnCloseIconUnderBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.clickCloseUnderBetSlip());
    }

    //------------------------//

    @And("^I should see few games with their respective Start timing displayed under their respective headers$")
    public void iShouldSeeFewGamesWithTheirRespectiveStartTimingDisplayedUnderTheirRespectiveHeaders(){
        Assert.assertTrue(SportsBettingPageContainer.sblivebettingpage.verifyStartTime());
    }
}


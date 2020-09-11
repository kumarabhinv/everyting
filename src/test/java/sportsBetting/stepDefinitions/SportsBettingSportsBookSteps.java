package sportsBetting.stepDefinitions;

import cap.helpers.Constants;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Da;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import sun.security.x509.X400Address;

import javax.xml.crypto.Data;
import java.util.List;

public class SportsBettingSportsBookSteps {


    private sportsBetting.SportsBettingPageContainer SportsBettingPageContainer;
    private WebDriver driver;

    public SportsBettingSportsBookSteps(sportsBetting.SportsBettingPageContainer SportsBettingPageContainer) {
        this.SportsBettingPageContainer = SportsBettingPageContainer;
    }

    @Given("^as a User, I click on Promotions sub-tab in Sports page$")
    public void asAUserIClickOnPromotionsSubTabInSportsPage() {
        SportsBettingPageContainer.sbsportspage.clickPromotionSubTab();
    }

    @And("^I choose a team in SportsBook page$")
    public void iChooseATeamInSportsBookPage() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            SportsBettingPageContainer.sbsportspage.selectATeamForBetting();
        } else {
            SportsBettingPageContainer.sbsportspage.selectFootBallTeamInSpreadColumn();
        }

    }

    @And("^I click Place My Bet in Straight Bet form$")
    public void iClickPlaceMyBetInStraightBetForm() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE)) {
            SportsBettingPageContainer.sbsportspage.clickPlaceMyBetInMobile();
        } else if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            SportsBettingPageContainer.sbsportspage.clickPlaceMyBetInTabletForStraight();
        } else {
            SportsBettingPageContainer.sbsportspage.clickPlaceMyBetInStraightBetForm();
        }
    }

    @When("^I confirm my straight bet$")
    public void iConfirmMyStraightBet() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            SportsBettingPageContainer.sbsportspage.clickMobConfirmBet();
        } else {
            SportsBettingPageContainer.sbsportspage.clickConfirmBet();
        }
    }

    @Then("^I should see my \"([^\"]*)\"$")
    public void iShouldSeeMy(String strTicketNumber) {
        SportsBettingPageContainer.sbsportspage.verifyTicketNumberAcceptedMessage();
    }

    @And("^I click Add More Selections in Straight Bet form$")
    public void iClickAddMoreSelectionsInStraightBetForm() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
        } else {
            SportsBettingPageContainer.sbsportspage.clickAddMoreSelections();
        }

    }

    @And("^I choose a team from different match$")
    public void iChooseATeamFromDifferentMatch() {
        SportsBettingPageContainer.sbsportspage.selectNewTeam();

    }
    @And("^I check my Bet Slip$")
    public void iCheckMyBetSlip() {
        SportsBettingPageContainer.sbsportspage.clickCheckBetSlip();

    }
    @And("^I place a Parlay Bet$")
    public void iPlaceAParlayBet() {
        SportsBettingPageContainer.sbsportspage.clickParlays();

    }

    @When("^I confirm my bet$")
    public void iConfirmMyBet() {
        SportsBettingPageContainer.sbsportspage.clickBetConfirm();

    }

    @And("^I place a If bet$")
    public void iPlaceAIfBet() {
        SportsBettingPageContainer.sbsportspage.clickIFBet();

    }

    @And("^I place an Action Reverse bet$")
    public void iPlaceAnActionReverseBet() {
        SportsBettingPageContainer.sbsportspage.clickActionReverseBet();
    }


    @When("^User click on (.*) tab$")
    public void userClickOnTab(String strTabs) {
        SportsBettingPageContainer.signUpPage.clickHeaderTab(strTabs);
//        SportsBettingPageContainer.signUpPage.clickSportsTab(strTabs);
    }

    @Then("^User should see following sub-tabs$")
    public void userShouldSeeFollowingSubTabs() {
//       SportsBettingPageContainer.sbsportspage.verifySubTabsInSportsBook();
    }


    @Given("^as a User, I have already clicked on \"([^\"]*)\" tab$")
    public void asAUserIHaveAlreadyClickedOnTab(String strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLandingPage(strTabs));
    }

    @When("^I click on \"([^\"]*)\" sub-tab$")
    public void iClickOnSubTab(String strSubTab) {
        SportsBettingPageContainer.sbsportspage.clickSubTabsInSportsBook(strSubTab);
    }

    @Then("^I see contents for \"([^\"]*)\"$")
    public void iSeeContentsFor(String strSubTab) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySubTabsContentInSportsBook(strSubTab));
    }

    @And("^\"([^\"]*)\" sub-tab should be highlighted$")
    public void subTabShouldBeHighlighted(String strSubTab) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySubTabsHighlightedInSportsBook(strSubTab));
    }

    @Given("^as a User, I have already clicked on \"([^\"]*)\" sub-tab$")
    public void asAUserIHaveAlreadyClickedOnSubTab(String strSubTab) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySubTabsContentInSportsBook(strSubTab));
    }

    @When("^User clicks on any promotion available with \"([^\"]*)\" button$")
    public void userClicksOnAnyPromotionAvailableWithButton(String strDO) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickOptionsUnderPromotionsSubTab(strDO));
    }

    @Then("^User should be redirected to the \"([^\"]*)\" tab$")
    public void userShouldBeRedirectedToTheTab(String strTitle) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyCashierPage(strTitle));
    }

    @When("^I click on \"([^\"]*)\" under the Promotions$")
    public void iClickOnUnderThePromotions(String strTC) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickOptionsUnderPromotionsSubTab(strTC));
    }

    @Then("^I should be shown with a pop-up listing all the Terms & Conditions for that particular promotion$")
    public void iShouldBeShownWithAPopUpListingAllTheTermsConditionsForThatParticularPromotion() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPopupInTermsAndConditions());
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.closePopupInTermsAndConditions());
    }


    @When("^User clicks on \"([^\"]*)\"$")
    public void userClicksOn(String strSubLinks) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickGettingStartedSubLinks(strSubLinks));
    }


    @Then("^User should be shown all the related contents under \"([^\"]*)\" along with Image Banner$")
    public void userShouldBeShownAllTheRelatedContentsUnderAlongWithImageBanner(String strSubLink) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySubLinkContentInGettingStarted(strSubLink));
    }

    @Then("^User should be shown all the related contents under Understanding Betting Odds along with Image Banner$")
    public void userShouldBeShownAllTheRelatedContentsUnderUnderstandingBettingOddsAlongWithImageBanner(String strSubLink) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySubLinkContentInGettingStarted(strSubLink));
    }

    @Given("^as a User, I have already clicked on \"([^\"]*)\"$")
    public void asAUserIHaveAlreadyClickedOn(String strSubLink) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySubLinkContentInGettingStarted(strSubLink));
    }

    @When("^user click on Image Banner$")
    public void userClickOnImageBanner() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickJoinNowImageLink());
    }

    @Then("^I see page redirects to MY ACCOUNT page along with related options$")
    public void iSeePageRedirectsToMYACCOUNTPageAlongWithRelatedOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyMyAccountPage());
    }

    @Given("^as a User, I have already clicked on the \"([^\"]*)\"$")
    public void asAUserIHaveAlreadyClickedOnThe(String strSubLink) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySubLinkContentInGettingStarted(strSubLink));
    }

    @When("^I click sportsbetting \"([^\"]*)\" button$")
    public void iClickTheButton(String strLink) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickLiveChatOption(strLink));
    }

    @Then("^I see Live chat \"([^\"]*)\" pop-up open along with options$")
    public void iSeeLiveChatPopUpOpenAlongWithOptions(String strLink) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLiveChatPopup(strLink));
    }

    @When("^I click on \"([^\"]*)\" link$")
    public void iClickOnLink(String strLink) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickGeneralRules(strLink));
    }

    @Then("^I see page redirects to \"([^\"]*)\" page with related contents$")
    public void iSeePageRedirectsToPageWithRelatedContents(String strLink) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyGeneralRulesPage());
    }


    @Given("^as a User, I am already on Rules page$")
    public void asAUserIAmAlreadyOnRulesPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyGeneralRulesPage());
    }

    @When("^I should click sports (.*)$")
    public void iShouldClickRulesOptions(String arg1) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickRulesLink(arg1));
    }

    @Then("^I see page scroll to the corresponding header (.*) with contents$")
    public void iSeePageScrollToTheCorrespondingHeaderRulesOptionsWithContents(String arg1) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyRulesLink(arg1));
    }

    @Then("^I see the Sports News page content$")
    public void iSeeTheSportsNewsPageContent() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySportsNewsPage());
    }

    @Then("^I see all the team\\(s\\) under saved$")
    public void iSeeAllTheTeamSUnderSaved(DataTable tb) {
        System.out.println(">> in the statement >>>");
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySamplePage(tb));
    }

    @And("^I see \"Home Betting > Odds and News\" as auto selected and displayed$")
    public void iSeeAsAutoSelectedAndDisplayed() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySportsNewsPage());
    }

    @When("^I click Home Betting > Odds and News$")
    public void iClickHomeBettingOddsAndNews() {
        SportsBettingPageContainer.sbsportspage.clickSportsNewsAndOddsBanner();
    }

    @Then("^I am redirected to the \"My Account\" page$")
    public void iAmRedirectedToThePage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyMyAccountPage());
    }

    @Given("^as a User, I have already clicked on Sports News$")
    public void asAUserIHaveAlreadyClickedOnSportsNews() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySportsNewsPage());
    }

    @When("^I click (.*) where no live events are scheduled on Calendar$")
    public void iClickDaysWhereNoLiveEventsAreScheduledOnCalendar(String strCalendartabs) {
        SportsBettingPageContainer.sbsportspage.clickCalendardays(strCalendartabs);
    }

//    @Then("^user should see Message$")
//    public void userShouldSeeMessage() {
//        SportsBettingPageContainer.sbsportspage.verifyCalendardays();
//    }

    @Given("^as a User, I am on Deposit Funds pop-up page$")
    public void asAUserIAmOnDepositFundsPopUpPage() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickDeposit());
    }

    @And("^I click on Insert Digits$")
    public void iClickOnInsertDigits() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.ClickInsert());
    }

    @When("^I click Deposit$")
    public void iClickDeposit() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickDepositFUnction());
    }

    @Then("^user is redirected to the Confirmation Page$")
    public void userIsRedirectedToTheConfirmationPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyConformationPage());
    }

    @And("^I enter Card Number as (.*), Expiry as (.*), CVV as(.*) and amount as (.*) not less than (.*) and not more than (.*)$")
    public void iEnterCardNumberAsCardNumberExpiryAsExpiryCVVAsCvvAndAmountAsAmountNotLessThanAmountLessAndNotMoreThanAmountMore(String strcardnumber, String strexpiry, String strcvv, String stramount) {
        SportsBettingPageContainer.sbsportspage.insertValues(strcardnumber, strexpiry, stramount, strcvv);
    }

    @And("^I enter Card Number$")
    public void iEnterCardNumber() {
        SportsBettingPageContainer.sbsportspage.insertValues("545454564654", "0758", "222", "200");
    }

    @Then("^I see all information related to the contents$")
    public void iSeeAllInformationRelatedToTheContents() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyNewsAndInformation());
    }

    @Given("^as a User, I have already clicked on SPORTS tab$")
    public void asAUserIHaveAlreadyClickedOnSPORTSTab() {
        SportsBettingPageContainer.sbsportspage.clickSportsTab();
    }


    @When("^I will click Sports News sub-tab$")
    public void iWillClickSportsNewsSubTab() {
        SportsBettingPageContainer.sbsportspage.clickSportsNewsTab();
    }

    @And("^I will click on Sports News tab$")
    public void iWillClickOnSportsNewsTab() {
        SportsBettingPageContainer.sbsportspage.clickSportsNewsTab();
    }

    @When("^I scroll down to SPORTS BETTING LINES header$")
    public void iScrollDownToSPORTSBETTINGLINESHeader() {
        SportsBettingPageContainer.sbsportspage.scrollToBettingHeader();
    }

    @Then("^I should see UPCOMING GAMES containing Choose Sport dropdown list$")
    public void iShouldSeeUPCOMINGGAMESContainingChooseSportDropdownList() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyUpcomingSportsHeader());
    }

    @And("^I should see To all Sports Lines at the end of header content$")
    public void iShouldSeeToAllSportsLinesAtTheEndOfHeaderContent() {
        SportsBettingPageContainer.sbsportspage.verifyAllSportsBtn();
    }

    @Given("^as a User, I have already scrolled down to SPORTS BETTING LINES header$")
    public void asAUserIHaveAlreadyScrolledDownToSPORTSBETTINGLINESHeader() {
        SportsBettingPageContainer.sbsportspage.scrollToBettingHeader();
    }

    @Then("^I should see UPCOMING GAMES header contents change accorging to the game selected$")
    public void iShouldSeeUPCOMINGGAMESHeaderContentsChangeAccorgingToTheGameSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyGamesInformation());
    }

    @When("^I click any games from the dropdown$")
    public void iClickAnyGamesFromTheDropdown() {
        SportsBettingPageContainer.sbsportspage.ChangeDropdownGames();
    }

    @When("^I click To all Sports Lines$")
    public void iClickToAllSportsLines() {
        SportsBettingPageContainer.sbsportspage.clickAllSportsBtn();
    }

    @Then("^I should be redirected to the SportsBook sub-tab page under SPORTS tab$")
    public void iShouldBeRedirectedToTheSportsBookSubTabPageUnderSPORTSTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySportsbookpage());
    }

    @When("^I scroll down to SPORTS NEWS header$")
    public void iScrollDownToSPORTSNEWSHeader() {
        SportsBettingPageContainer.sbsportspage.scrollToSportsNewsHeader();
    }

    @Then("^I see several contents with Read More and number links$")
    public void iSeeSeveralContentsWithReadMoreAndNumberLinks(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyReadMoreLink(Table));
    }

    @Given("^as a User, I have already scrolled down to SPORTS NEWS header$")
    public void asAUserIHaveAlreadyScrolledDownToSPORTSNEWSHeader() {
        SportsBettingPageContainer.sbsportspage.clickSportsNewsTab();
        SportsBettingPageContainer.sbsportspage.scrollToSportsNewsHeader();
    }

    @When("^I click either any content header or Read More present in that content$")//todo
    public void iClickEitherAnyContentHeaderOrReadMorePresentInThatContent() {
        SportsBettingPageContainer.sbsportspage.clickReadMoreBtn();
    }

    @Then("^I should be redirected to the selected content page$")
    public void iShouldBeRedirectedToTheSelectedContentPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySportsNews());
    }

    @Given("^as a User, I have already clicked on Sports News tab$")
    public void asAUserIHaveAlreadyClickedOnSportsNewsTab() {
        SportsBettingPageContainer.sbsportspage.clickSportsNewsTab();
    }
    @Then("^I should see, page gets reloaded and contents should change as per the number selected$")
    public void iShouldSeePageGetsReloadedAndContentsShouldChangeAsPerTheNumberSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyNewsAndInformation());
    }

    @When("^I scroll down to TOP PROMOTIONS$")
    public void iScrollDownToTOPPROMOTIONS() {
        SportsBettingPageContainer.sbsportspage.scrollToPromotionsHeader();
    }

    @Then("^I see several promotions available with Deposit Now link and (.*)$")
    public void iSeeSeveralPromotionsAvailableWithDepositNowLinkAndTOPPROMOTIONSOptions(String strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPromotionsOptions(strTabs));
    }

    @Then("^I should be redirected to the PROMOTIONS tab$")
    public void iShouldBeRedirectedToThePROMOTIONSTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPromotionsPage());
    }

    @Then("^I should be redirected to the CASHIER tab$")
    public void iShouldBeRedirectedToTheCASHIERTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyCashierPage());
    }

    @Then("^I should see a pop-up with all the related Terms & Conditions$")
    public void iShouldSeeAPopUpWithAllTheRelatedTermsConditions() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyTermsAndConditionsPopUp());
    }

    @And("^I scroll down to TOP PROMOTIONS header$")
    public void iScrollDownToTOPPROMOTIONSHeader() {
        SportsBettingPageContainer.sbsportspage.scrollToPromotionsHeader();
    }

    @Given("^as a User, I have already scrolled down to TOP PROMOTIONS header$")
    public void asAUserIHaveAlreadyScrolledDownToTOPPROMOTIONSHeader() {
        SportsBettingPageContainer.sbsportspage.scrollToPromotionsHeader();
    }

//    @And("^i click on SPORTS tab$")
//    public void iClickOnSPORTSTab() {
//        SportsBettingPageContainer.sbsportspage.clickSportsTab();
//        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
//    }

    @Given("^as a User, I scroll down to TOP PROMOTIONS header$")
    public void asAUserIScrollDownToTOPPROMOTIONSHeader() {
        SportsBettingPageContainer.sbsportspage.scrollToPromotionsHeader();
    }

    @When("^I select NFL Betting$")
    public void iSelectNFLBetting() {
        SportsBettingPageContainer.sbsportspage.clickNFLBetting();
    }

    @Then("^I see several contents under NFL Betting sub-tabs$")
    public void iSeeSeveralContentsUnderNFLBettingSubTabs(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyNflSubTabs(Table));
    }

    @And("^I click on Expand icon$")
    public void iClickOnExpandIcon() {
        SportsBettingPageContainer.sbsportspage.clickExpandIconUnderNFLOption();
    }

    @Then("^I should see several NFL Betting sub-tabs$")
    public void iShouldSeeSeveralNFLBettingSubTabs() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyNFLPageHeaders());
    }

    @When("^I click Boxing Odds$")
    public void iClickBoxingOdds() {
        SportsBettingPageContainer.sbsportspage.clickBoxingOddsOption();
    }

    @Then("^I see several contents under Boxing odds sub-tabs$")
    public void iSeeSeveralContentsUnderBoxingOddsSubTabs() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBoxingOddsHeader());
    }

    @Then("^I see several contents under MMA Betting Odds headers$")
    public void iSeeSeveralContentsUnderMMABettingOddsHeaders() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyMMAOddsHeaders());
    }

    @Then("^I see several contents under (.*),(.*),(.*)$")
    public void iSeeSeveralContentsUnderUFCBettingOddsHeaders(String arg1, String arg2, String arg3) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyOddsHeaders(arg1, arg2, arg3));
    }

    @Given("^I am on NFL Betting page$")
    public void iAmOnNFLBettingPage() {
        SportsBettingPageContainer.sbsportspage.verifyNFLBettingPage();
    }

    @When("^user click on Betting (.*)$")
    public void userClickOnNFLBettingTab(String strTabs) {
        SportsBettingPageContainer.sbsportspage.clickSubtabs(strTabs);
    }

    @Given("^as a User, I have already clicked on NFL Betting$")
    public void asAUserIHaveAlreadyClickedOnNFLBetting() {
        SportsBettingPageContainer.sbsportspage.clickNFLBetting();
    }

    @Then("^I see several contents under Football Betting headers$")
    public void iSeeSeveralContentsUnderFootballBettingHeaders(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyFootballBettingHeaders(strTabs));
    }

    @Then("^I see it redirects to Bet Calculator under My Account$")
    public void iSeeItRedirectsToBetCalculatorUnderMyAccount() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyOddsCalculatorpage());
    }

//    @When("^I click (.*)$")
//    public void iClickTab(String Tabs) {
//        SportsBettingPageContainer.sbsportspage.clickSportsNewsSubTabs(Tabs);
//    }

    @Given("^I am on Sports News page$")
    public void iAmOnSportsNewsPage() {
        SportsBettingPageContainer.sbsportspage.verifyNFLBettingPage();
    }


    @Then("^I see several contents under NBA Betting sub-tabs$")
    public void iSeeSeveralContentsUnderNBABettingSubTabs(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyNBASubTabs(Table));
    }

    @Then("^I see several contents under MLB Betting sub-tabs$")
    public void iSeeSeveralContentsUnderMLBBettingSubTabs(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyMLBBettingHeaders(strTabs));
    }

    @When("^I select MLB (.*)$")
    public void iSelectMLBTab(String Tabs) {
        SportsBettingPageContainer.sbsportspage.clickMLBSubTabs(Tabs);
    }

    @When("^I select NBA (.*)$")
    public void iSelectNBATab(String Tabs) {
        SportsBettingPageContainer.sbsportspage.clickMLBSubTabs(Tabs);
    }

//    @And("^I see header displayed under the sub-tab$")
//    public void iSeeHeaderDisplayedUnderTheSubTab() {
//
//    }


    @When("^I select Basketball Lines (.*)$")
    public void iSelectBasketballLinesSubTab(String Tabs) {
        SportsBettingPageContainer.sbsportspage.clickMLBSubTabs(Tabs);
    }

    @And("^I see March Madness Odds tab displayed under the sub-tab$")
    public void iSeeMarchMadnessOddsTabDisplayedUnderTheSubTab() {
        SportsBettingPageContainer.sbsportspage.verifyBasketBallLinesHeader();
    }

    @And("^I see College Football Betting Picks tab displayed under the sub-tab$")
    public void iSeeCollegeFootballBettingPicksTabDisplayedUnderTheSubTab() {
        SportsBettingPageContainer.sbsportspage.verifyBtnCollegeFootballBettingPicks();
    }

    @When("^I select College Football Betting Picks tab$")
    public void iSelectCollegeFootballBettingPicksTab() {
        SportsBettingPageContainer.sbsportspage.clickBtnCollegeFootballBettingPicks();
    }

    @And("^I see several sub-tabs present under the Golf Betting Odds$")
    public void iSeeSeveralSubTabsPresentUnderTheGolfBettingOdds(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyGolfBettingHeaders(Table));
    }

    @When("^I select Golf Betting Odds (.*)$")
    public void iSelectGolfBettingOddsSubTab(String Tabs) {
        SportsBettingPageContainer.sbsportspage.clickGolfSubTabs(Tabs);
    }

    @And("^I see a sub-tab present under the NHL Betting Odds$")
    public void iSeeASubTabPresentUnderTheNHLBettingOdds(DataTable Table) {
        SportsBettingPageContainer.sbsportspage.verifyNHLSubTabs(Table);
    }

    @Given("^as a User, I have already clicked on NHL Betting Lines$")
    public void asAUserIHaveAlreadyClickedOnNHLBettingLines() {
        SportsBettingPageContainer.sbsportspage.verifyNFLBettingPage();
    }

    @When("^I select NHL Betting Odds subtab$")
    public void iSelectNHLBettingOddsSubTab() {
        SportsBettingPageContainer.sbsportspage.clickStanleyCupOddsHeader();
    }

    @When("^I select MMA Betting Odds$")
    public void iSelectMMABettingOdds() {
        SportsBettingPageContainer.sbsportspage.clickMMAOdds();
    }

    @When("^I select UFC Betting Odds$")
    public void iSelectUFCBettingOdds() {
        SportsBettingPageContainer.sbsportspage.clickUfcOdds();
    }

    @And("^I see a sub-tab present under the Tennis Betting Odds$")
    public void iSeeASubTabPresentUnderTheTennisBettingOdds(DataTable Table) {
        SportsBettingPageContainer.sbsportspage.verifyTennisSubTabs(Table);
    }

    @Given("^as a User, I have already clicked on Tennis Betting Odds$")
    public void asAUserIHaveAlreadyClickedOnTennisBettingOdds() {
        SportsBettingPageContainer.sbsportspage.verifyNFLBettingPage();
    }

    @When("^I select French Open tab$")
    public void iSelectFrenchOpenTab() {
        SportsBettingPageContainer.sbsportspage.clickFrenchOpenTab();
    }

    @And("^I see several sub-tabs under Horse Racing Odds tab$")
    public void iSeeSeveralSubTabsUnderHorseRacingOddsTab(DataTable Table) {
        SportsBettingPageContainer.sbsportspage.verifyHorsesSubTabs(Table);
    }

    @Given("^as a User, Iam on Horse Racing Odds page$")
    public void asAUserIamOnHorseRacingOddsPage() {
        SportsBettingPageContainer.sbsportspage.verifyNFLBettingPage();
    }

    @When("^I select Horse Racing (.*)$")
    public void iSelectHorseRacingTab(String Tabs) {
        SportsBettingPageContainer.sbsportspage.clickGolfSubTabs(Tabs);

    }

    @And("^I will scroll down to (.*)$")
    public void iWillScrollDownToTab(String arg1) {
        SportsBettingPageContainer.sbsportspage.verifyTopPagesHeader(arg1);
    }

    @When("^I see several contents displayed as images$")
    public void iSeeSeveralContentsDisplayedAsImages() {
        SportsBettingPageContainer.sbsportspage.verifyTopPagesImages();
    }

    @Then("^I select any one image form the available images$")
    public void iSelectAnyOneImageFormTheAvailableImages() {
        SportsBettingPageContainer.sbsportspage.clickTopPagesImage();
    }

    @And("^page will be redirected to the concerned pages$")
    public void pageWillBeRedirectedToTheConcernedPages() {
        SportsBettingPageContainer.sbsportspage.verifyGamesPage();
    }

    @When("^I select Breeders Cup sub-tab$")
    public void iSelectBreedersCupSubTab() {
        SportsBettingPageContainer.sbsportspage.clickBreedersCupSubTab();
    }

    @When("^I select Sportsbook tab$")
    public void iSelectSportsbookTab() {
        SportsBettingPageContainer.sbsportspage.clickSportsBookTab();
    }

    @Then("^I see few contents under header, a search bar, refresh lines button and selectors$")
    public void iSeeFewContentsUnderHeaderASearchBarRefreshLinesButtonAndSelectors(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySportsBookHeaders(strTabs));
    }

    @And("^I see several sub-tabs,Live Betting icon,View Selected and Clear All options$")
    public void iSeeSeveralSubTabsLiveBettingIconViewSelectedAndClearAllOptions(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySportsbookSubtabs(Table));
    }

    @Given("^as a User, I have already clicked on SportsBook$")
    public void asAUserIHaveAlreadyClickedOnSportsBook() {
        SportsBettingPageContainer.sbsportspage.verifySportsBookTab();
    }

    @When("^I see click on LIVE BETTING$")
    public void iSeeClickOnLIVEBETTING() {
        SportsBettingPageContainer.sbsportspage.clickLiveBettingTab();
    }

    @Then("^I am redirected to LIVE BETTING tab under homepage$")
    public void iAmRedirectedToLIVEBETTINGTabUnderHomepage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLiveBettingPage());
    }

    @And("^I select any or many choices from under SportsBook page sub-tabs but only those with checkbox$")
    public void iSelectAnyOrManyChoicesFromUnderSportsBookPageSubTabsButOnlyThoseWithCheckbox() {
        SportsBettingPageContainer.sbsportspage.clickTableTennisTab();
    }

    @When("^I select View Selected option$")
    public void iSelectViewSelectedOption() {
        SportsBettingPageContainer.sbsportspage.clickViewSelectedOption();
    }

    @Then("^I see all the selected choices show up for betting$")
    public void iSeeAllTheSelectedChoicesShowUpForBetting() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLiveGames());
    }

    @Given("^as a User, I have already see all the selected contents$")
    public void asAUserIHaveAlreadySeeAllTheSelectedContents() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLiveGames());
    }

    @When("^I see click on Clear All$")
    public void iSeeClickOnClearAll() {
        SportsBettingPageContainer.sbsportspage.clickClearAllOption();
    }

    @Then("^I see all the checkboxes selected gets un-checked$")
    public void iSeeAllTheCheckboxesSelectedGetsUnChecked() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySelectionsRemoved());
    }

    @When("^I select the (.*)$")
    public void iSelectTheTab(String arg1) {
        SportsBettingPageContainer.sbsportspage.clickSportsBoookSubtabs(arg1);
    }

    @Then("^I see several Main Sports contents under MAIN SPORTS$")
    public void iSeeSeveralMainSportsContentsUnderMAINSPORTS() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyMainSportsSubtabs());
    }

    @Given("^as a User, I can already see all the choices under MAIN SPORTS$")
    public void asAUserICanAlreadySeeAllTheChoicesUnderMAINSPORTS() {
        SportsBettingPageContainer.sbsportspage.verifyMainSPortsGames();
    }

    @When("^I select any choice with no checkbox only one at a time$")
    public void iSelectAnyChoiceWithNoCheckboxOnlyOneAtATime() {
        SportsBettingPageContainer.sbsportspage.selectMainSportsGame();
    }

    @Then("^I see selected choices show up for betting$")
    public void iSeeSelectedChoicesShowUpForBetting() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLiveGames());
    }

    @Then("^I see several Game props contents under GAME PROPS$")
    public void iSeeSeveralGamePropsContentsUnderGAMEPROPS() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyGamePropsTournaments());
    }

    @And("^I select any choice from under the GAME PROPS$")
    public void iSelectAnyChoiceFromUnderTheGAMEPROPS() {
        SportsBettingPageContainer.sbsportspage.clickGamePropsTournaments();
    }

    @When("^I select one or many from the displayed results after selection of a choice under GAME PROPS$")
    public void iSelectOneOrManyFromTheDisplayedResultsAfterSelectionOfAChoiceUnderGAMEPROPS() {
        SportsBettingPageContainer.sbsportspage.clickLiveGames();
    }

    @Then("^I see all the teams selected gets added to the Bet Slip$")
    public void iSeeAllTheTeamsSelectedGetsAddedToTheBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyStraightBetGame());
    }

    @Then("^I see several Futures contents under FUTURES$")
    public void iSeeSeveralFuturesContentsUnderFUTURES() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyFuturesTournaments());
    }

    @Given("^as a User, I have already clicked on FUTURES$")
    public void asAUserIHaveAlreadyClickedOnFUTURES() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyFuturesTournaments());
    }

    @And("^I select any choice from under the FUTURES$")
    public void iSelectAnyChoiceFromUnderTheFUTURES() {
        SportsBettingPageContainer.sbsportspage.clickFutureGame();
    }

    @When("^I select one/many from the displayed results after selection of a choice under FUTURES$")
    public void iSelectOneManyFromTheDisplayedResultsAfterSelectionOfAChoiceUnderFUTURES() {
        SportsBettingPageContainer.sbsportspage.clickLiveGame();
    }

    @Then("^I see several Contest choices under CONTESTS$")
    public void iSeeSeveralContestChoicesUnderCONTESTS(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyContestsTab(Table));
    }

    @Given("^as a User, I have already clicked on CONTESTS$")
    public void asAUserIHaveAlreadyClickedOnCONTESTS() {
        SportsBettingPageContainer.sbsportspage.verifyContestsTab();
    }

    @When("^I select (.*) from under the CONTESTS$")
    public void iSelectTabFromUnderTheCONTESTS(String arg1) {
        SportsBettingPageContainer.sbsportspage.clickContestsSubTab(arg1);
    }

    @Then("^I am redirected to Squares Contest page displaying Username$")
    public void iAmRedirectedToSquaresContestPageDisplayingUsername() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySquaresContestspage());

    }

    @And("^I see Contest options$")
    public void iSeeContestOptions(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySquareContestsSubtab(Table));
    }

    @Then("^I am redirected to CONTEST tab page under homepage$")
    public void iAmRedirectedToCONTESTTabPageUnderHomepage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyContestTab());
    }

    @Then("^I see OTHER SPORTS options$")
    public void iSeeOTHERSPORTSOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyOtherSportsSubTabs());
    }

    @Then("^I see Useful Links options$")
    public void iSeeUsefulLinksOptions(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyUsefulLinksSubTab(Table));
    }

    @Given("^as a User, I have already clicked on USEFUL LINKS$")
    public void asAUserIHaveAlreadyClickedOnUSEFULLINKS() {
        SportsBettingPageContainer.sbsportspage.verifyUsefulLinksTab();
    }

    @When("^user click over (.*)$")
    public void userClickOverTab(String arg1) {
        SportsBettingPageContainer.sbsportspage.clickUsefulLinksSubTab(arg1);
    }

    @Then("^user able to see page redirected to Getting Started sub-tab$")
    public void userAbleToSeePageRedirectedToGettingStartedSubTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyGettingStartedSubTab());
    }

    @Then("^I see page redirected to My Account present under homepage$")
    public void iSeePageRedirectedToMyAccountPresentUnderHomepage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBettingOddsCalculatorPage());
    }

    @Given("^as a User,I click on SPORTS tab$")
    public void asAUserIClickOnSPORTSTab() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        SportsBettingPageContainer.sbsportspage.clickSportsTab();
    }

    @And("^user clicks on USEFUL LINKS$")
    public void userClicksOnUSEFULLINKS() {
        SportsBettingPageContainer.sbsportspage.clickUsefulLinksTab();
    }

    @Then("^I see page redirected to Promotions sub-tab$")
    public void iSeePageRedirectedToPromotionsSubTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPromotionsTab());
    }

    @Then("^I see page redirected to SportsBook Help page with Live Chat and Frequently Asked Questions$")
    public void iSeePageRedirectedToSportsBookHelpPageWithLiveChatAndFrequentlyAskedQuestions() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySportsBookHelpPage());
    }

    @When("^user clicks on Betting Limits tab$")
    public void userClicksOnBettingLimitsTab() {
        SportsBettingPageContainer.sbsportspage.clickBettingLimits();
    }

    @When("^user clicks on Sportsbook Rules$")
    public void userClicksOnSportsbookRules() {
        SportsBettingPageContainer.sbsportspage.clickSportsbookRulesTab();
    }

    @When("^user clicks on Sportsbook Bonuses$")
    public void userClicksOnSportsbookBonuses() {
        SportsBettingPageContainer.sbsportspage.clickSportsbookBonuses();
    }

    @And("^user clicks on Sportsbook Help & FAQ$")
    public void userClicksOnSportsbookHelpFAQ() {
        SportsBettingPageContainer.sbsportspage.clickSportsbookHelp$FAQ();
    }

    @And("^I enter any rotational number only digits in the search bar new Rot#$")
    public void iEnterAnyRotationalNumberOnlyDigitsInTheSearchBarNewRot() {
        SportsBettingPageContainer.sbsportspage.enterRotationalNumberInSearchBar();
    }

    @When("^user click on search button$")
    public void userClickOnSearchButton() {
        SportsBettingPageContainer.sbsportspage.clickSearchBar();
    }

    @Then("^I see all the search results displayed related to the Rotational Number entered$")
    public void iSeeAllTheSearchResultsDisplayedRelatedToTheRotationalNumberEntered() {
       SportsBettingPageContainer.sbsportspage.verifySearchResults();
    }

    @Given("^as a User,I am already shown results after performing search operation under Rot#$")
    public void asAUserIAmAlreadyShownResultsAfterPerformingSearchOperationUnderRot() {
        SportsBettingPageContainer.sbsportspage.verifySearchResults();
    }

    @When("^I select any (.*) from within Odds Format Selector dropdown$")
    public void iSelectAnyOddOptionsFromWithinOddsFormatSelectorDropdown(String Odds) {
        SportsBettingPageContainer.sbsportspage.selectOddsValues(Odds);
    }

    @Then("^I see all the search results displayed formatted according to the selected choice$")
    public void iSeeAllTheSearchResultsDisplayedFormattedAccordingToTheSelectedChoice() {
      SportsBettingPageContainer.sbsportspage.verifyOddValues();
    }

    @When("^user scroll down to Play Mini Blackjack Now!$")
    public void userScrollDownToPlayMiniBlackjackNow() {
        SportsBettingPageContainer.sbsportspage.ScrolltoBlackjackHeader();
    }

    @Then("^I see Mini Blackjack game loaded to play$")
    public void iSeeMiniBlackjackGameLoadedToPlay() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBlackJackGame());
    }

    @When("^I select any (.*) from within Sort Lines By dropdown$")
    public void iSelectAnyOddsSelectionsFromWithinSortLinesByDropdown(String Odds) {
        SportsBettingPageContainer.sbsportspage.selectDropdownValues(Odds);
    }

    @Then("^I see all the search results displayed sorted according to the selected choice$")
    public void iSeeAllTheSearchResultsDisplayedSortedAccordingToTheSelectedChoice() {
       Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyRotationalNumberResults());
    }

    @Then("^I see hint or description of the choice selected from under Sort Lines By dropdown$")
    public void iSeeHintOrDescriptionOfTheChoiceSelectedFromUnderSortLinesByDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPopupDescription());
    }

    @And("^I select (.*) and hover on help icon next to Sort Lines By dropdown$")
    public void iSelectChoiceChoiceChoiceAndHoverOnHelpIconNextToSortLinesByDropdown(String arg1) {
        SportsBettingPageContainer.sbsportspage.MouseHoverSortDropdownHelpicon(arg1);
    }

    @When("^user click on (.*) and hover on help icon next to Sort Lines By dropdown$")
    public void userClickOnChoiceChoiceAndHoverOnHelpIconNextToSortLinesByDropdown(String Odds) {
        SportsBettingPageContainer.sbsportspage.MouseHoverSortLinesDropdown(Odds);
    }

    @Then("^I see hint or description of the choice selected from under Odds Format Selector dropdown$")
    public void iSeeHintOrDescriptionOfTheChoiceSelectedFromUnderOddsFormatSelectorDropdown() {
        SportsBettingPageContainer.sbsportspage.verifyOddValues();
    }

    @When("^user scroll down to Live Betting Games in Progress$")
    public void userScrollDownToLiveBettingGamesInProgress() {
        SportsBettingPageContainer.sbsportspage.scrolltoInProgressGames();
    }

    @Then("^I see all the games in progress if any$")
    public void iSeeAllTheGamesInProgressIfAny() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyInProgressGames());
    }

    @And("^user see bet-tabs under Bet Slip$")
    public void UserSeeBetTabsUnderBetSlip() {
        SportsBettingPageContainer.sbsportspage.verifyBetTabs();
    }

    @Then("^user should see (.*) under Bet Slip$")
    public void UserShouldSeeBetButtonsUnderBetSlip(String strTabName) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBetButtons(strTabName));
    }

    @And("^I see Show Confirmation Checkbox already selected$")
    public void iSeeShowConfirmationCheckboxAlreadySelected() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyConfirmationBox());
    }

    @And("^user click on Straight Bet$")
    public void userClickOnStraightBet() {
        SportsBettingPageContainer.sbsportspage.clickStraightBet();
    }

    @Then("^I see all the teams selected with Risk to be entered$")
    public void iSeeAllTheTeamsSelectedWithRiskToBeEntered() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyRiskFieldInput());
    }

    @And("^I choose a team in the SportsBook page$")
    public void iChooseATeamInTheSportsBookPage() {
        SportsBettingPageContainer.sbsportspage.selectLiveGame();
    }

    @And("^I enter Risk amount$")
    public void iEnterRiskAmount() {
        SportsBettingPageContainer.sbsportspage.clickRiskInputField();
    }

    @When("^user click on Place my bet$")
    public void userClickOnPlaceMyBet() {
        SportsBettingPageContainer.sbsportspage.clickPlaceMyBetBtn();
    }

    @Then("^I see a confirmation message with Back and Confirm button$")
    public void iSeeAConfirmationMessageWithBackAndConfirmButton() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.ConfirmationMessage());
    }

    @Given("^as a User, I already see a confirmation message with Back and Confirm button$")
    public void asAUserIAlreadySeeAConfirmationMessageWithBackAndConfirmButton() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.ConfirmationMessage());
    }

    @When("^user click on Confirm$")
    public void userClickOnConfirm() {
        SportsBettingPageContainer.sbsportspage.clickConfirmBet();
    }

    @Then("^I see a success or failure message$")
    public void iSeeASuccessOrFailureMessage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBetPlacedMessage());
    }

    @When("^user click on Back$")
    public void userClickOnBack() {
        SportsBettingPageContainer.sbsportspage.clickBackInBetSlip();
    }

    @Then("^I see all the teams back again with Risk amount$")
    public void iSeeAllTheTeamsBackAgainWithRiskAmount() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.ConfirmationMessage());
    }

    @And("^I select any/multiple teams odds value$")
    public void iSelectAnyMultipleTeamsOddsValue() {
        SportsBettingPageContainer.sbsportspage.clickMultipleTeams();
    }

    @And("^I see Parlay & Robin under Bet Slip highlighted$")
    public void iSeeParlayRobinUnderBetSlipHighlighted() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyParlayBetTabHighlighted());
    }

    @When("^user click on Parlay & Robin$")
    public void userClickOnParlayRobin() {
        SportsBettingPageContainer.sbsportspage.clickParlayBetTab();
    }

    @Then("^I see all the teams selected with Risk to be entered in Parlay tab$")
    public void i_see_all_the_teams_selected_with_Risk_to_be_entered_in_Parlay_tab() throws Throwable {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyParlayRiskInputField());
    }

    @Given("^as a User, I already see added teams under Parlay$")
    public void asAUserIAlreadySeeAddedTeamsUnderParlay() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyParlayRiskInputField());
    }

    @And("^I enter Risk amount in parlay tab$")
    public void iEnterRiskAmountInParlayTab() {
        SportsBettingPageContainer.sbsportspage.enterRiskInParlayTab();
    }

    @When("^user click on If Bet & Reverse$")
    public void userClickOnIfBetReverse() {
        SportsBettingPageContainer.sbsportspage.clickIfBetTab();
    }

    @Then("^I see all the teams selected with Amount to be entered$")
    public void iSeeAllTheTeamsSelectedWithAmountToBeEntered() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyIfBetRiskInputField());
    }

    @Given("^as a User,I already see added teams under If Bet & Reverse$")
    public void asAUserIAlreadySeeAddedTeamsUnderIfBetReverse() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyIfBetRiskInputField());
    }

    @And("^I enter Risk amount in IfBet Tab$")
    public void iEnterRiskAmountInIfBetTab() {
        SportsBettingPageContainer.sbsportspage.enterRiskInIfBetTab();
    }

    @And("^I select either Win Only or Win or Push from the dropdown$")
    public void iSelectEitherWinOnlyOrWinOrPushFromTheDropdown() {
        SportsBettingPageContainer.sbsportspage.clickIfBetTabDropdown();
    }

    @Given("^as a User,I have already added teams to the Bet Slip$")
    public void asAUserIHaveAlreadyAddedTeamsToTheBetSlip() {
        SportsBettingPageContainer.sbsportspage.clickMultipleTeams();
    }

    @And("^I uncheck the Show Confirmation Checkbox$")
    public void iUncheckTheShowConfirmationCheckbox() {
        SportsBettingPageContainer.sbsportspage.unCheckBetSlipConfirmationBox();
    }

    @When("^user click on the Clear All button$")
    public void userClickOnTheClearAllButton() {
        SportsBettingPageContainer.sbsportspage.clickClearAllButton();
    }

    @Then("^I see all the teams from Bet Slip is removed$")
    public void iSeeAllTheTeamsFromBetSlipIsRemoved() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBetSlipTeamsRemoved());
    }

    @When("^user click on Save button$")
    public void userClickOnSaveButton() {
        SportsBettingPageContainer.sbsportspage.clickSaveButton();
    }

    @Then("^I see all the teams under Bet Slip saved$")
    public void iSeeAllTheTeamsUnderBetSlipSaved() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBetSlipTeams());
    }

    @And("^I have already added teams to the Bet Slip$")
    public void iHaveAlreadyAddedTeamsToTheBetSlip() {
        SportsBettingPageContainer.sbsportspage.clickMultipleTeams();
    }

    @Then("^I see few sub-tabs on the page displayed on clicking PLAYER PROPS$")
    public void iSeeFewSubTabsOnThePageDisplayedOnClickingPLAYERPROPS(DataTable Table) {
     SportsBettingPageContainer.sbsportspage.clickPlayerPropsGames();
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPlayerPropsSubTab(Table));
    }

    @And("^I see a dropdown displaying all teams available to select form$")
    public void iSeeADropdownDisplayingAllTeamsAvailableToSelectForm() {
        SportsBettingPageContainer.sbsportspage.clickPlayerPropsDropDown();
    }


    @And("^I see a (.*) and an Learn More anchor$")
    public void iSeeAPlayerPropsHeaderAndAnLearnMoreAnchor(String strHeaders) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPlayerPropsHeaders(strHeaders));
    }

    @Given("^as a User, I have already clicked on PLAYER PROPS$")
    public void asAUserIHaveAlreadyClickedOnPLAYERPROPS() {
        SportsBettingPageContainer.sbsportspage.verifyPlayerPropsPage();
    }

    @When("^I select any choice from dropdown displaying all teams available$")
    public void iSelectAnyChoiceFromDropdownDisplayingAllTeamsAvailable() {
        SportsBettingPageContainer.sbsportspage.clickPlayerPropsDropDown();
    }

    @Then("^I see all the displayed teams changes according to the selected choice$")
    public void iSeeAllTheDisplayedTeamsChangesAccordingToTheSelectedChoice() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPlayerPropsTeams());
    }

//    @And("^I have selected from the dropdown displaying all teams available$")
//    public void iHaveSelectedFromTheDropdownDisplayingAllTeamsAvailable() {
//        SportsBettingPageContainer.sbsportspage.clickDropDown();
    @Then("^I see few a search box and dropdown displaying upcoming games on the page displayed on clicking BUILD$")
    public void iSeeFewASearchBoxAndDropdownDisplayingUpcomingGamesOnThePageDisplayedOnClickingBUILD() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBuildSubTabOptions());
    }

    @And("^I see few default results to select from$")
    public void iSeeFewDefaultResultsToSelectFrom() {
        SportsBettingPageContainer.sbsportspage.verifyDefaultResults();
    }

    @When("^user select (.*)$")
    public void userSelectPlayerPropsTab(String strSubTabs) {
        SportsBettingPageContainer.sbsportspage.clickPlayerPropsGames();
        SportsBettingPageContainer.sbsportspage.clickPlayerPropsSubTab(strSubTabs);
    }

    @Given("^as a User, I have already clicked on BUILD$")
    public void asAUserIHaveAlreadyClickedOnBUILD() {
        SportsBettingPageContainer.sbsportspage.verifyDefaultResults();
    }

    @When("^I choose from the available options under dropdown displaying upcoming games$")
    public void iChooseFromTheAvailableOptionsUnderDropdownDisplayingUpcomingGames() {
        SportsBettingPageContainer.sbsportspage.selectDropdownValue();
    }

    @Then("^I see all the related results getting displayed under BUILD$")
    public void iSeeAllTheRelatedResultsGettingDisplayedUnderBUILD() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBuildTabResults());
    }

    @Given("^as a User,I have already see few results under BUILD$")
    public void asAUserIHaveAlreadySeeFewResultsUnderBUILD() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBuildTabResults());
    }

    @Given("^as a User, I select teams under Build$")
    public void asAUserISelectTeamsUnderBuild() {
        SportsBettingPageContainer.sbsportspage.clickPlayerPropsSearchResults();
    }

    @Then("^I see all the selected teams get added under the Build Your Bet header$")
    public void iSeeAllTheSelectedTeamsGetAddedUnderTheBuildYourBetHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyTeamsUnderBuildYourBetHeader());
    }

    @When("^I select from the dropdown displaying upcoming games on the page displayed on clicking QUICK PICKS$")
    public void iSelectFromTheDropdownDisplayingUpcomingGamesOnThePageDisplayedOnClickingQUICKPICKS() {
        SportsBettingPageContainer.sbsportspage.selectDropdownValue();
    }

    @And("^I see few buttons to select from$")
    public void iSeeFewButtonsToSelectFrom() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyQuickPicksButtons());
    }

    @Given("^as a User, I have already selected from dropdown displaying upcoming games from under QUICK PICKS$")
    public void asAUserIHaveAlreadySelectedFromDropdownDisplayingUpcomingGamesFromUnderQUICKPICKS() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyQuickPicksButtons());
    }

    @And("^user click on any button available under teams names$")
    public void userClickOnAnyButtonAvailableUnderTeamsNames() {
        SportsBettingPageContainer.sbsportspage.clickQuickPicksButtons();
    }
    @When("^I select any items anchor after clicking button$")
    public void iSelectAnyItemsAnchorAfterClickingButton() {
        SportsBettingPageContainer.sbsportspage.clickQuickPicksOdds();
    }

    @Then("^I see selected choices gets added to Bet Slip present under Build Your Bet$")
    public void iSeeSelectedChoicesGetsAddedToBetSlipPresentUnderBuildYourBet() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyQuickPicksBetSlip());
    }

    @When("^I scroll down to SPORTS BETTING ODDS & NEWS header$")
    public void iScrollDownToSPORTSBETTINGODDSNEWSHeader() {
        SportsBettingPageContainer.sbsportspage.scrollToNewsHeader();
    }

    @When("^I click any number link$")
    public void iClickAnyNumberLink() {
        SportsBettingPageContainer.sbsportspage.clickPageNumberLinks();
    }

    @When("^I select any image present in that page$")
    public void iSelectAnyImagePresentInThatPage() {
        SportsBettingPageContainer.sbsportspage.clickPromotionsImage();
    }

    @When("^I click Deposit Now$")
    public void iClickDepositNow() {
        SportsBettingPageContainer.sbsportspage.clickDepositNowLink();
    }
    @When("^user click Terms and Conditions$")
    public void userClickTermsAndConditions() {
        SportsBettingPageContainer.sbsportspage.clickTermsAndConditionsOption();
    }

    @When("^user click on See All Promotions$")
    public void userClickOnSeeAllPromotions() {
        SportsBettingPageContainer.sbsportspage.clickSeeAllPromotionsOption();
    }

    @Then("^I should see several contents under (.*),(.*)$")
    public void iShouldSeeSeveralContentsUnderBettingOddsBETTINGNEWS(String arg2, String arg3) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyNBAOddsHeaders(arg2, arg3));
    }

    @And("^I have selected from the dropdown displaying all teams available$")
    public void iHaveSelectedFromTheDropdownDisplayingAllTeamsAvailable() {
        SportsBettingPageContainer.sbsportspage.selectDropdownValue();
    }

    @When("^I select Collapse All$")
    public void iSelectCollapseAll() {
        SportsBettingPageContainer.sbsportspage.clickCollapseAllBtn();
    }

    @Then("^I see all the displayed results gets collapsed under there headers$")
    public void iSeeAllTheDisplayedResultsGetsCollapsedUnderThereHeaders() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyGameMarketHeaderCollapesed());
    }

    @Then("^I see (.*) choices and one dropdown namely BETS$")
    public void iSeeAnchorTagsChoicesAndOneDropdownNamelyBETS(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyAnchorTags(Table));
    }

    @And("^I select any anchor choices$")
    public void iSelectAnyAnchorChoices() {
        SportsBettingPageContainer.sbsportspage.clickStatBtn();
    }

    @Then("^I see teams selected displayed under choice of anchor selected with Build options$")
    public void iSeeTeamsSelectedDisplayedUnderChoiceOfAnchorSelectedWithBuildOptions(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBuildOptions(Table));
    }

    @Given("^as a User, I already see Build Your Bet$")
    public void asAUserIAlreadySeeBuildYourBet() {
        SportsBettingPageContainer.sbsportspage.verifyOptionsBuildYourBetHeader();
    }

    @And("^I select any choice from select statistics dropdown$")
    public void iSelectAnyChoiceFromSelectStatisticsDropdown() {
        SportsBettingPageContainer.sbsportspage.selectStatisticChoices();
    }

    @And("^I see any will have option from under will have header only for STAT$")
    public void iSeeAnyWillHaveOptionFromUnderWillHaveHeaderOnlyForSTAT(DataTable Table) {
        SportsBettingPageContainer.sbsportspage.verifyWillHaveOptions(Table);
    }

    @And("^I enter value in Number in between range$")
    public void iEnterValueInNumberInBetweenRange() {
        SportsBettingPageContainer.sbsportspage.clickAddScoreIcon();
    }

    @And("^user click Add To Bet Slip$")
    public void userClickAddToBetSlip() {
        SportsBettingPageContainer.sbsportspage.clickAddToBetSlipBtn();
    }

    @And("^I see Bet Slip with teams added to place bet$")
    public void iSeeBetSlipWithTeamsAddedToPlaceBet() {
        SportsBettingPageContainer.sbsportspage.verifyBetSlip();
    }

    @And("^I enter value in bet input field$")
    public void iEnterValueInBetInputField() {
        SportsBettingPageContainer.sbsportspage.enterValueInBetSlip();
    }

    @Then("^I confirm the confirmation pop-up shown$")
    public void iConfirmTheConfirmationPopUpShown() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.ConfirmBetslipPopUp());
    }

    @When("^user click Place My Bets$")
    public void userClickPlaceMyBets() {
        SportsBettingPageContainer.sbsportspage.clickPlaceMyBet();
    }

    @And("^I see Your bet was successfully submitted message on the pop-up$")
    public void iSeeYourBetWasSuccessfullySubmittedMessageOnThePopUp() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySuccessfulBetMessage());
    }

    @And("^I select any <will have option> from under will have header only for STAT$")
    public void iSelectAnyWillHaveOptionFromUnderWillHaveHeaderOnlyForSTAT() {

    }

    @Given("^as a User, I have already added teams from under BUILD$")
    public void asAUserIHaveAlreadyAddedTeamsFromUnderBUILD() {
        SportsBettingPageContainer.sbsportspage.verifyOptionsBuildYourBetHeader();
        SportsBettingPageContainer.sbsportspage.clickPlayerPropsSearchResults();
        SportsBettingPageContainer.sbsportspage.selectStatisticChoices();
        SportsBettingPageContainer.sbsportspage.clickAddScoreIcon();
    }

    @When("^I click clear$")
    public void iClickClear() {
        SportsBettingPageContainer.sbsportspage.clickClearBtn();
    }

    @Then("^I see all the added teams gets removed and Build Your Bet gets empty$")
    public void iSeeAllTheAddedTeamsGetsRemovedAndBuildYourBetGetsEmpty() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyTeamsRemovedFromBetSlip());
    }

    @When("^I select any (.*) from under Odds$")
    public void iSelectAnyOddOptionsFromUnderOdds(String Odds) {
        SportsBettingPageContainer.sbsportspage.clickOddsDropdown(Odds);
    }

    @Then("^I see value under Odds changes accordingly$")
    public void iSeeValueUnderOddsChangesAccordingly() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPlayerPropsOddChanges());
    }

    @When("^I click over BETS$")
    public void iClickOverBETS() {
        SportsBettingPageContainer.sbsportspage.clickPlayerPropsBetBtn();
    }

    @Then("^I see choices being displayed$")
    public void iSeeChoicesBeingDisplayed(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPlayerPropsBetOptions(Table));
    }

    @Given("^as a User, I add teams from under Build$")
    public void asAUserIAddTeamsFromUnderBuild() {
        SportsBettingPageContainer.sbsportspage.verifyOptionsBuildYourBetHeader();
        SportsBettingPageContainer.sbsportspage.clickPlayerPropsSearchResults();
        SportsBettingPageContainer.sbsportspage.selectStatisticChoices();
        SportsBettingPageContainer.sbsportspage.clickAddScoreIcon();
    }

    @When("^I click the (.*)$")
    public void iClickTheOption(String Odds) {
        SportsBettingPageContainer.sbsportspage.clickPlayerPropsBetSlip(Odds);
    }

    @Given("^as a User, I have no added any team for betting$")
    public void asAUserIHaveNoAddedAnyTeamForBetting() {
        SportsBettingPageContainer.sbsportspage.verifyBetsHeader();
    }

    @Then("^I see a div page displaying No Bets$")
    public void iSeeADivPageDisplayingNoBets() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyNoBetsMessage());
    }

    @When("^I click over close icon$")
    public void iClickOverCloseIcon() {
        SportsBettingPageContainer.sbsportspage.clickCloseBetSlipBtn();
    }

    @Then("^I see Betslip page gets closed$")
    public void iSeeBetslipPageGetsClosed() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPlayerPropsBetsIcon());
    }

    @Given("^as a User, I already see Betslip page$")
    public void asAUserIAlreadySeeBetslipPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyNoBetsMessage());
    }

    @Then("^I am redirected to a help page$")
    public void iAmRedirectedToAHelpPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.PlayerPropsHelpPage());
    }


    @Given("^as a User,I have already selected teams$")
    public void asAUserIHaveAlreadySelectedTeams() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyTeamsSelectedUnderPlayerProps());
    }


    @Then("^I click cancel on the confirmation pop-up shown$")
    public void iClickCancelOnTheConfirmationPopUpShown() {
       Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickCancelBtn());
    }

    @And("^I see confirmation pop-up goes away$")
    public void iSeeConfirmationPopUpGoesAway() {
        SportsBettingPageContainer.sbsportspage.verifyPlaceBetsBtn();
    }


    @When("^I select from the choices available$")
    public void iSelectFromTheChoicesAvailable() {
        SportsBettingPageContainer.sbsportspage.clickPlayerPropsSearchResults();
    }



    @Then("^I see a page displaying all the bets placed under Open Bets$")
    public void iSeeAPageDisplayingAllTheBetsPlacedUnderOpenBets() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPlayerPropsOpenBets());
    }

    @Given("^as a User, I have not placed any bet yet$")
    public void asAUserIHaveNotPlacedAnyBetYet() {
        SportsBettingPageContainer.sbsportspage.verifyBetsHeader();
    }

    @Then("^I see a page displaying No Bets under Open Bets$")
    public void iSeeAPageDisplayingNoBetsUnderOpenBets() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyOpenBetsPage());
    }

    @Given("^as a User, I already see My Bets page$")
    public void asAUserIAlreadySeeMyBetsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyOpenBetsPage());
    }

    @When("^I click Past Bets$")
    public void iClickPastBets() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.ClickPastBets());
    }

    @Then("^I see a page displaying No Bets under Past Bets or bets placed earlier$")
    public void iSeeAPageDisplayingNoBetsUnderPastBetsOrBetsPlacedEarlier() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPastBetsInformation());
    }

    @When("^I click back in Past Bets page$")
    public void iClickBackInPastBetsPage() {
        SportsBettingPageContainer.sbsportspage.clickMyBetsBackBtn();
    }

    @Then("^I see all teams back again under Quick Picks$")
    public void iSeeAllTeamsBackAgainUnderQuickPicks() {
        SportsBettingPageContainer.sbsportspage.verifyOptionsBuildYourBetHeader();
    }

    @Then("^I see user redirected back to PlayerProps page$")
    public void iSeeUserRedirectedBackToPlayerPropsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPlayerPropsContent());
    }


    @When("^I click on Promotions sub-tab$")
    public void iClickOnPromotionsSubTab() {
        SportsBettingPageContainer.sbsportspage.clickPromotionSubTab();
    }

    @When("^I click on Getting Started sub-tab$")
    public void iClickOnGettingStartedSubTab() {
        SportsBettingPageContainer.sbsportspage.clickGettingStartedSubTab();
    }

    @When("^I click on Terms & Conditions under the Promotions$")
    public void iClickOnTermsConditionsUnderThePromotions() {
        SportsBettingPageContainer.sbsportspage.clickTermsAndConditionsOption();
    }


    @When("^I will click over General rules link$")
    public void iWillClickOverGeneralRulesLink() {
        SportsBettingPageContainer.sbsportspage.clickGeneralRulesLink();
    }

    @When("^user click Betting (.*)$")
    public void userClickBettingSubTab(String Tabs ) {
        SportsBettingPageContainer.sbsportspage.clickMLBSubTabs(Tabs);
    }

    @When("^user move to (.*)$")
    public void userMoveToTab(String Tabs) {
        SportsBettingPageContainer.sbsportspage.clickSportsNewsSubTabs(Tabs);
    }

    @And("^I click on SPORTS tab$")
    public void iClickOnSPORTSTab() {
        SportsBettingPageContainer.sbsportspage.clickSportsTab();
    }


    @Then("^I see games present under Upcoming Events Header$")
    public void iSeeGamesPresentUnderUpcomingEventsHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickPlayerPropsNFLSims());
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPlayerPropsUpComingGames());
    }

    //--------------------//

    @Then("^I see Check your Bet Slip as a bar showing number of bets added$")
    public void iSeeCheckYourBetSlipAsABarShowingNumberOfBetsAdded() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyCheckMyBetSlip());
    }

    @Given("^as a User, I already see Check your Bet Slip bar with number of selections being displayed$")
    public void asAUserIAlreadySeeCheckYourBetSlipBarWithNumberOfSelectionsBeingDisplayed() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyCheckMyBetSlip());
    }

    @When("^I click on Check your Bet Slip$")
    public void iClickOnCheckYourBetSlip() {
        this.iCheckMyBetSlip();
    }

    @Then("^I see page is redirected to Bet Slip page with headers$")
    public void iSeePageIsRedirectedToBetSlipPageWithHeaders(DataTable strDatas) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBetSlipPage(strDatas));
    }

    @Given("^as a User, I see Bet Slip with Single Bet$")
    public void asAUserISeeBetSlipWithSingleBet() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBetSlipMobile());
    }

    @Then("^I see that particular team is removed$")
    public void iSeeThatParticularTeamIsRemoved() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyEmptyBetSlip());
    }

    @And("^I click Place My Bet in Single Bet form$")
    public void iClickPlaceMyBetInSingleBetForm() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickPlaceBet());
    }

    @When("^I click on bet slip Close \\(Icon\\)$")
    public void iClickOnBetSlipCloseIcon() {
        SportsBettingPageContainer.sbsportspage.clickCloseIconInBetSlip();
    }

    @When("^I click Delete All under bet slip$")
    public void iClickDeleteAllUnderBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickDeleteAllUnderBetSlip());
    }

    @When("^I click ADD MORE SELECTIONS under bet slip$")
    public void iClickADDMORESELECTIONSUnderBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickAddMoreSelectionsUnderBetSlip());
    }

    @When("^I select If Bet \\(If in collapsed state\\)$")
    public void iSelectIfBetIfInCollapsedState() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickIfBetUnderBetSlip());
    }

    @Then("^I see one dropdown and two action-buttons$")
    public void iSeeOneDropdownAndTwoActionButtons(DataTable strDatas) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyActionButtonsUnderIfBet());
    }

    @When("^I click on Down or Up and see position of team changes$")
    public void iClickOnDownOrUpAndSeePositionOfTeamChanges() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickUpUnderIfBet());
    }

    @Then("^I see that particular team is removed and other team is present$")
    public void iSeeThatParticularTeamIsRemovedAndOtherTeamIsPresent() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySecondTeamPresentInBetSlip());
    }

    @And("^I click on single bet under Bet Slip$")
    public void iClickOnSingleBetUnderBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickSingleUnderBetSlip());
    }

    @Then("^I see QR available for ANDROID DEVICES$")
    public void iSeeQRAvailableForANDROIDDEVICES() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyPokerQRForAndroid());
    }


    @Then("^User should see games and one back \\(icon\\)$")
    public void userShouldSeeGamesAndOneBackIcon() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySportsbookpage());
    }

    @Given("^as a User, I see all the games under SPORTS page$")
    public void asAUserISeeAllTheGamesUnderSPORTSPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySportsbookpage());
    }

    @When("^I click on any game available under Sports page$")
    public void iClickOnAnyGameAvailableUnderSportsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickGameUnderSportsPage());
    }

    @Then("^I see sub-games available under selected game$")
    public void iSeeSubGamesAvailableUnderSelectedGame() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySubGameUnderSportsPage());
    }

    @When("^I click on any sub-game available under Sports page$")
    public void iClickOnAnySubGameAvailableUnderSportsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickSubGameUnderSportsPage());
    }

    @Then("^I see various wager types available$")
    public void iSeeVariousWagerTypesAvailable(DataTable strDatas) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyWagerTypesUnderSportsPage(strDatas));
    }

    @And("^I see several teams with odds and date$")
    public void iSeeSeveralTeamsWithOddsAndDate() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyTeamOddsAndTime());
    }

    @And("^I scroll down to end of page and see BACK TO TOP$")
    public void iScrollDownToEndOfPageAndSeeBACKTOTOP() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.scrollDownToBackToTop());
    }

    @When("^I click on BACK TO TOP under Sports page$")
    public void iClickOnBACKTOTOPUnderSportsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickBackToTop());
    }

    @When("^I click on sub-game name with back arrow$")
    public void iClickOnSubGameNameWithBackArrow() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickBackIconUnderSportsPage());
    }

    @When("^I click on game name with back arrow$")
    public void iClickOnGameNameWithBackArrow() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickBackIconUnderSportsPage());
    }

    @When("^I click on collapse icon containing date$")
    public void iClickOnCollapseIconContainingDate() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickDateWithCollapseIconUnderSportsPage());
    }

    @Then("^I see teams under the collapsed bar gets hidden$")
    public void iSeeTeamsUnderTheCollapsedBarGetsHidden() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.waitForInvisibilityOfFirstTeamContainer());
    }

    @When("^I click on expand icon for the collapsed date$")
    public void iClickOnExpandIconForTheCollapsedDate() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickDateWithExpandIconUnderSportsPage());
    }

    @Then("^I see all the teams under expanded bar gets visible$")
    public void iSeeAllTheTeamsUnderExpandedBarGetsVisible() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.waitForVisibilityOfFirstTeamContainer());
    }

    @And("^If no error is visible$")
    public void ifNoErrorIsVisible() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyErrorMessageUnderSportsBetSlip());
    }

    //--------------------------//

    //Player Props Mobile

    //--------------------------//

    @Then("^I see under Player Props page two navigators$")
    public void iSeeUnderPlayerPropsPageTwoNavigators() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPlayerPropsNavigators());
    }

    @And("^I see Current Markets selected as default under Player Props page$")
    public void iSeeCurrentMarketsSelectedAsDefaultUnderPlayerPropsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyCurrentMarketsSelectedAsDefault());
    }

    @When("^I click any game available under Current Markets$")
    public void iClickAnyGameAvailableUnderCurrentMarkets() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickGamesUnderCurrentMarkets());
    }

    @Then("^I see a dropdown under Current Markets team selected showing odds$")
    public void iSeeADropdownUnderCurrentMarketsTeamSelectedShowingOdds() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyOddsUnderCurrentMarkets());
    }

    @When("^I click on any odds under team selected$")
    public void iClickOnAnyOddsUnderTeamSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickOddsUnderCurrentMarkets());
    }

    @Then("^I see Bet Slip with team and RTN value$")
    public void iSeeBetSlipWithTeamAndRTNValue() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBetSlupWithRTNValue());
    }

    @And("^I remove team from Bet Slip$")
    public void iRemoveTeamFromBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickRemoveTeamUnderBetSlip());
    }

    @When("^I click Upcoming Events under Player Props page$")
    public void iClickUpcomingEventsUnderPlayerPropsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickUpcomingEventsUnderPlayerPropsPage());
    }

    @Then("^I see few upcoming games with Date and Time$")
    public void iSeeFewUpcomingGamesWithDateAndTime() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyUpcomingEvents());
    }

    @And("^I see More Help, FAQ, Rules$")
    public void iSeeMoreHelpFAQRules() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyMoreHelpUnderUpcomingEvents());
    }

    @When("^I click More Help, FAQ, Rules$")
    public void iClickMoreHelpFAQRules() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickMoreHelpUnderUpcomingEvents());
    }

    @Then("^I see help topics and one close button$")
    public void iSeeHelpTopicsAndOneCloseButton() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyMoreHelpPage());
    }

    @When("^I click close under More Help, FAQ, Rules pop up$")
    public void iClickCloseUnderMoreHelpFAQRulesPopUp() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickCloseUnderMoreHelpPage());
    }

    @Then("^I see help topics gets closed and current markets gets selected$")
    public void iSeeHelpTopicsGetsClosedAndCurrentMarketsGetsSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyCurrentMarketsSelectedAsDefault());
    }

    @And("^I see Left Navigator under Player Props page$")
    public void iSeeLeftNavigatorUnderPlayerPropsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLeftNavigatorUnderPlayerPropsPage());
    }

    @When("^I click on Left Navigator and I see three odds converters$")
    public void iClickOnLeftNavigatorAndISeeThreeOddsConverters(DataTable strDatas) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyOddsConverter(strDatas));
    }

    @Then("^I see few leagues under Left Navigator$")
    public void iSeeFewLeaguesUnderLeftNavigator() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLeaguesUnderLeftNavigator());
    }

    @When("^I click on any odds converter$")
    public void iClickOnAnyOddsConverter() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickOddsConverter());
    }

    @Then("^I see the odds value changes accordingly$")
    public void iSeeTheOddsValueChangesAccordingly() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyOddsPatternChange());
    }

    @And("^I see Right Navigator under Player Props page$")
    public void iSeeRightNavigatorUnderPlayerPropsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyRightNavigatorUnderPlayerProps());
    }

    @When("^I click on Right Navigator$")
    public void iClickOnRightNavigator() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickRightNavigator());
    }

    @Then("^I see a dropdown under Right Navigator with options$")
    public void iSeeADropdownUnderRightNavigatorWithOptions(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBetSlipDropDown(strTabs));
    }

    @And("^I click on Betslip under the dropdown$")
    public void iClickOnBetslipUnderTheDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickBetSlipFromDropDown());
    }

    @When("^I see Bet Slip stating No bets$")
    public void iSeeBetSlipStatingNoBets() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyEmptyBetSlipUnderPlayerProps());
    }

    @Then("^I close Bet Slip under Player Props$")
    public void iCloseBetSlipUnderPlayerProps() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickCloseUnderBetSlip());
    }

    @And("^I click on My Bets under the dropdown$")
    public void iClickOnMyBetsUnderTheDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickMyBetsUnderDropDown());
    }

    @Then("^I see three options under My Bets$")
    public void iSeeThreeOptionsUnderMyBets(DataTable strDatas) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyMyBetsOptions(strDatas));
    }

    @When("^I see open bets selected as default$")
    public void iSeeOpenBetsSelectedAsDefault() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyOpenBetsSelectedAsDefault());
    }

    @Then("^I see any bets placed under open bets or empty open bets$")
    public void iSeeAnyBetsPlacedUnderOpenBetsOrEmptyOpenBets() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyOpenBetsPage());
    }

    @When("^I click past bets under My Bets$")
    public void iClickPastBetsUnderMyBets() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickPastBetsUnderMyBets());
    }

    @Then("^I see any bets present under past bets or empty past bets$")
    public void iSeeAnyBetsPresentUnderPastBetsOrEmptyPastBets() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPastBetsInformation());
    }

    @When("^I click back button under My Bets$")
    public void iClickBackButtonUnderMyBets() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickBackUnderMyBets());
    }

    @Then("^I see page redirects to Player props with Current Markets selected as default$")
    public void iSeePageRedirectsToPlayerPropsWithCurrentMarketsSelectedAsDefault() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyCurrentMarketsSelectedAsDefault());
    }

    @And("^I click on Help under the dropdown$")
    public void iClickOnHelpUnderTheDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickHelpUnderDropDown());
    }

    @And("^I enter RTN value under corresponding field$")
    public void iEnterRTNValueUnderCorrespondingField() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.enterRTNValueUnderBetSlip());
    }

    @When("^I click on place bets under Player Props Bet Slip$")
    public void iClickOnPlaceBetsUnderPlayerPropsBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickPlaceBetUnderPlayerProps());
    }

    @When("^I click on clear slip under Player Props Bet Slip$")
    public void iClickOnClearSlipUnderPlayerPropsBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickClearSlipUnderBetSlip());
    }

    @Then("^I should see Bet Slip closed and Bet Slip team count to be 0$")
    public void iShouldSeeBetSlipClosedAndBetSlipTeamCountToBe0() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyEmptyBetSlipPlayerProps());
    }

    @Then("^I should see bet successful message$")
    public void iShouldSeeBetSuccessfulMessage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyBetSuccessMessage());
    }

    @When("^I click on any league active with soccer icon$")
    public void iClickOnAnyLeagueActiveWithSoccerIcon() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickAnyLeagueWithSoccerIconUnderLeftNavigator());
    }

    @When("^I click on BUILD under Player Props page$")
    public void iClickOnBUILDUnderPlayerPropsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickBUILDUnderPlayerPropsPage());
    }

    @And("^I click on QUICK PICKS under Player Props$")
    public void iClickOnQUICKPICKSUnderPlayerProps() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickQuickPicksUnderPlayerProps());
    }

    @When("^I click on OVER / UNDER under Player Props$")
    public void iClickOnOVERUNDERUnderPlayerProps() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickOverUnderUnderPlayerProps());
    }

    @When("^I click on collapse dropdown icon on the team that I expanded$")
    public void iClickOnCollapseDropdownIconOnTheTeamThatIExpanded() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickCollapseOnTheExpanded());
    }

    @Then("^I see two options on the page displayed on clicking OVER / UNDER$")
    public void iSeeTwoOptionsOnThePageDisplayedOnClickingOVERUNDER(DataTable strDatas) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyOverUnderOptions(strDatas));
    }

    @When("^I click Players option under OVER / UNDER$")
    public void iClickPlayersOptionUnderOVERUNDER() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickPlayersUnderOverUnder());
    }

    @When("^I click Stats option under OVER / UNDER$")
    public void iClickStatsOptionUnderOVERUNDER() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickStatsUnderOverUnder());
    }

    @Then("^I see all the displayed results as per Players selection$")
    public void iSeeAllTheDisplayedResultsAsPerPlayersSelection() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPlayersContents());
    }

    @Then("^I see all the displayed results as per Stats selection$")
    public void iSeeAllTheDisplayedResultsAsPerStatsSelection() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyStatsContents());
    }

    @When("^I select any player\\(s\\) from under BUILD$")
    public void iSelectAnyPlayerSFromUnderBUILD() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickAnyTeamUnderBuild());
    }

    @When("^I select from the choices available under anchors$")
    public void iSelectFromTheChoicesAvailableUnderAnchors() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickSubChoicesUnderStats());
    }

    @When("^I click on place bets under Player Props Bet Slip under Bet Slip$")
    public void iClickOnPlaceBetsUnderPlayerPropsBetSlipUnderBetSlip() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickPlaceBetUnderBetSlip());
    }

    @Then("^I see all the added teams gets removed under Build Your Bet$")
    public void iSeeAllTheAddedTeamsGetsRemovedUnderBuildYourBet() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyEmptyBuildYourBet());
    }

    @When("^I click on RESET under Build Your Bet$")
    public void iClickOnRESETUnderBuildYourBet() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickResetUnderBuildYourBet());
    }

    @Then("^I see BUILD YOUR BET dissapears and options available$")
    public void iSeeBUILDYOURBETDissapearsAndOptionsAvailable(DataTable strTabs) {
        this.iSeeFewSubTabsOnThePageDisplayedOnClickingPLAYERPROPS(strTabs);
    }

    @And("^I click on help icon near Right Navigator$")
    public void iClickOnHelpIconNearRightNavigator() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickHelpIconNearRightNavigator());
    }

    @When("^I see help pop-up$")
    public void iSeeHelpPopUp() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyHelpPopUpUnderSoccerPage());
    }

    @Then("^I click on cross button on the help pop up$")
    public void iClickOnCrossButtonOnTheHelpPopUp() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickCrossOnHelpPop());
    }

    @And("^I see help pop-up dissapears and options available$")
    public void iSeeHelpPopUpDissapearsAndOptionsAvailable(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyPlayerPropsMobilePage(strTabs));
    }

    @When("^I click on any league active with football or basketball icon$")
    public void iClickOnAnyLeagueActiveWithFootballOrBasketballIcon() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickLeagueWithBasketBallIcon());
    }

    
}





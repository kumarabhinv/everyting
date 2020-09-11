package sportsBetting.stepDefinitions;

import cap.helpers.Constants;
import com.cucumber.listener.Reporter;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SportsBettingPokerSteps {

    private sportsBetting.SportsBettingPageContainer SportsBettingPageContainer;
    private WebDriver driver;

    public SportsBettingPokerSteps(sportsBetting.SportsBettingPageContainer SportsBettingPageContainer) {
        this.SportsBettingPageContainer = SportsBettingPageContainer;
    }

    @Then("^I see different choices available with options$")
    public void iSeeDifferentChoicesAvailableWithOptions( ) {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyPokerSubtabs());
    }

    @Given("^as a User, I am on Sportsbetting application$")
    public void asAUserIAmOnSportsbettingApplication() {
        Reporter.addStepLog(" URL: " + Constants.SPORTSBETTING_LIVE_URL);
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifySportsBettingUserLandingPage());
    }

    @When("^I click on Poker sub-tab$")
    public void iClickOnPokerSubTab() {
        SportsBettingPageContainer.sbpokerpage.clickPokerTab();
    }

    @Then("^I see different images available with different text and an iframe$")
    public void iSeeDifferentImagesAvailableWithDifferentTextAndAnIframe(DataTable Table) {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyDownloadOptions(Table));
    }

    @And("^I see several (.*) Poker sub-tab should be highlighted$")
    public void iSeeSeveralHeadersPokerSubTabShouldBeHighlighted(String headers) {
        SportsBettingPageContainer.sbpokerpage.verifyPokerTabHeaders(headers);
    }

    @When("^I click on BAD BEAT JACKPOT image$")
    public void iClickOnBADBEATJACKPOTImage() {
        SportsBettingPageContainer.sbpokerpage.clickImage();
    }

    @Then("^I should be redirected to BAD BEAT JACKPOT page$")
    public void iShouldBeRedirectedToBADBEATJACKPOTPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyCarousels());
    }


    @And("^I see div-class along with an image with carousel, headers displaying contestants winning prizes and (.*)$")
    public void iSeeDivClassAlongWithAnImageWithCarouselHeadersDisplayingContestantsWinningPrizesAndTC(String strelmnts) {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyGamepage(strelmnts));
    }

    @Given("^as a User, I am on the Poker sub-tab page$")
    public void asAUserIAmOnThePokerSubTabPage() {
        SportsBettingPageContainer.sbpokerpage.clickPokerTab();
    }

    @Given("^as a User, I am on the redirected page after clicking BAD BEAT JACKPOT image in Poker sub-tab$")
    public void asAUserIAmOnTheRedirectedPageAfterClickingBADBEATJACKPOTImageInPokerSubTab() {
        SportsBettingPageContainer.sbpokerpage.verifyCarousels();
    }

    @When("^I click Terms &Condition$")
    public void iClickTermsCondition()
    {
        SportsBettingPageContainer.sbpokerpage.clickTermsandCondtns();
    }


    @Then("^I should see a pop-up with all the terms and conditions$")
    public void iShouldSeeAPopUpWithAllTheTermsAndConditions() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.closePopup());
    }

    @When("^I click image displaying BAD BEAT JACKPOT with alt as banner$")
    public void iClickImageDisplayingBADBEATJACKPOTWithAltAsBanner() {
        SportsBettingPageContainer.sbpokerpage.clickCarousels();
    }

    @Then("^I should be redirected back to the Poker sub-tab page$")
    public void iShouldBeRedirectedBackToThePokerSubTabPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.clickPokerTab());
    }

    @When("^I scroll down to div element with class as layout__landing-odometer-content$")
    public void iScrollDownToDivElementWithClassAsLayout__landingOdometerContent() {
        SportsBettingPageContainer.sbpokerpage.scrolltoelement();
    }

    @Then("^I should be shown count figure which should keep updating in every 1 minute$")
    public void iShouldBeShownCountFigureWhichShouldKeepUpdatingInEveryMinute() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyWagersChange());
    }

    @Then("^I should be shown count figure which should keep updating within 15 seconds$")
    public void iShouldBeShownCountFigureWhichShouldKeepUpdatingWithinSeconds() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyCountChange());
    }

    @When("^I scroll down to iframe with id as myIframe$")
    public void iScrollDownToIframeWithIdAsMyIframe() {
        SportsBettingPageContainer.sbpokerpage.scrolltoframe();
    }

    @When("^I click on image displaying PLAY ONLINE NOW$")
    public void iClickOnImageDisplayingPLAYONLINENOW() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.clickPlayOnlinebtn());
    }

    @Then("^I should see a new tab with login credentials option for login$")
    public void iShouldSeeANewTabWithLoginCredentialsOptionForLogin() {
       SportsBettingPageContainer.sbpokerpage.verifyPlayOnlinePage();
    }
 @Then("^I should see a new tab with login credentials option$")
    public void iShouldSeeANewTabWithLoginCredentialsOption() {
       SportsBettingPageContainer.sbpokerpage.verifyPlayOnlinePageSecond();
    }

    @When("^I click on image displaying DOWNLOAD FOR PC containing link$")
    public void iClickOnImageDisplayingDOWNLOADFORPCContainingLink() {
        SportsBettingPageContainer.sbpokerpage.clickDownloadBtn();
    }
    @Then("^I should be given windows pop-up to save the file$")
    public void iShouldBeGivenWindowsPopUpToSaveTheFile() {
    SportsBettingPageContainer.sbpokerpage.verifyWindowsFileDownloadLocation();
    }

    @Then("^I should be given windows pop-up to save file$")
    public void iShouldBeGivenWindowsPopUpToSaveFile() {
        SportsBettingPageContainer.sbpokerpage.verifyMacFilesDownloadLocation();
    }

    @When("^I click on image displaying POKER TOURNAMENT SCHEDULE$")
    public void iClickOnImageDisplayingPOKERTOURNAMENTSCHEDULE() {
        SportsBettingPageContainer.sbpokerpage.clickTournamentlink();
    }

    @Then("^User should be redirected to Poker tournaments page$")
    public void userShouldBeRedirectedToPokerTournamentsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyPokerTournaments());

    }

    @When("^I click on image displaying POKER FEEDBACK$")
    public void iClickOnImageDisplayingPOKERFEEDBACK()  {
        SportsBettingPageContainer.sbpokerpage.clickGameBtn();
    }

    @When("^I scroll down to POPULAR PROMOTIONS header$")
    public void iScrollDownToPOPULARPROMOTIONSHeader() {
        SportsBettingPageContainer.sbpokerpage.NavigatePromotions();
    }


    @Then("^User should be shown different promotional options$")
    public void userShouldBeShownDifferentPromotionalOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyPokerPromotions());
    }

    @Given("^as a User, I see all the options available under POPULAR PROMOTIONS header$")
    public void asAUserISeeAllTheOptionsAvailableUnderPOPULARPROMOTIONSHeader() {
        SportsBettingPageContainer.sbpokerpage.NavigatePromotions();
    }

    @When("^I select any option from the available options$")
    public void iSelectAnyOptionFromTheAvailableOptions(){
        SportsBettingPageContainer.sbpokerpage.clickImage();
    }

    @Then("^I should be redirected to that particular selection page$")
    public void iShouldBeRedirectedToThatParticularSelectionPage() {
        SportsBettingPageContainer.sbpokerpage.VerifyPageLink();
    }

    @And("^I should see all promotional details for the selection$")
    public void iShouldSeeAllPromotionalDetailsForTheSelection() {
        SportsBettingPageContainer.sbpokerpage.verifyCarousels();
    }

    @When("^I scroll down to Favourite Tournaments header$")
    public void iScrollDownToFavouriteTournamentsHeader() {
        SportsBettingPageContainer.sbpokerpage.naviagatetoElement();
    }

    @Then("^User should be shown different tournaments available$")
    public void userShouldBeShownDifferentTournamentsAvailable() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyTournaments());
    }

    @Given("^as a User, I see all the options available under Favourite Tournaments header$")
    public void asAUserISeeAllTheOptionsAvailableUnderFavouriteTournamentsHeader() {
        SportsBettingPageContainer.sbpokerpage.naviagatetoElement();
    }

    @When("^I select any option under Favorite Tournaments header$")
    public void iSelectAnyOptionUnderFavoriteTournamentsHeader(){
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.clickFavoriteTournaments());
    }

    @Then("^User gets redirected to (.*)$")
    public void userGetsRedirectedToLink(String link) {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifySurveyPage(link));
    }

    @Then("^I should be redirected to that particular tournament page$")
    public void iShouldBeRedirectedToThatParticularTournamentPage() {
        SportsBettingPageContainer.sbpokerpage.VerifyTorunamentPageLink();

    }

    @And("^I should see all promotional details for that particular selection$")
    public void iShouldSeeAllPromotionalDetailsForThatParticularSelection(){
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyPokerTournaments());;
    }

    @And("^I see all the options available under Favourite Tournaments header$")
    public void iSeeAllTheOptionsAvailableUnderFavouriteTournamentsHeader() {
        SportsBettingPageContainer.sbpokerpage.naviagatetoElement();
    }

    @When("^I scroll down to LEADERBOARD header$")
    public void iScrollDownToLEADERBOARDHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyLeaderboardHeader());
    }


    @Then("^User should be shown different results available$")
    public void userShouldBeShownDifferentResultsAvailable(){
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyLeaderBoardLinks());
    }

    @And("^I see all the options available under Leaderboards header$")
    public void iSeeAllTheOptionsAvailableUnderLeaderboardsHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyLeaderboardHeader());
    }

    @When("^I select any option under the Leaderboards Header$")
    public void iSelectAnyOptionUnderTheLeaderboardsHeader() {
        SportsBettingPageContainer.sbpokerpage.selectLeaderboardOptions();
    }

    @Then("^I should be redirected to that particular page$")
    public void iShouldBeRedirectedToThatParticularPage() {
        SportsBettingPageContainer.sbpokerpage.verifyLeaderboardPageurl();
    }

    @And("^I should see all leaderboard details for that particular selection$")
    public void iShouldSeeAllLeaderboardDetailsForThatParticularSelection() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyLeaderBoardpage());
    }

    @When("^I click on Promotions sub-tab in poker$")
    public void iClickOnPromotionsSubTab(){
        SportsBettingPageContainer.sbpokerpage.clickPromotionsTab();
    }

    @And("^Promotions sub-tab should be highlighted$")
    public void promotionsSubTabShouldBeHighlighted(){
        SportsBettingPageContainer.sbpokerpage.verifyTabHighlighted();
    }

    @When("^I click on any available option from the available options$")
    public void iClickOnAnyAvailableOptionFromTheAvailableOptions() {
        SportsBettingPageContainer.sbpokerpage.selectPromotions();
    }

    @Given("^as a User, I have already clicked on Promotions tab$")
    public void asAUserIHaveAlreadyClickedOnPromotionsTab() {
        SportsBettingPageContainer.sbpokerpage.clickPromotionsTab();
    }
    @Then("^I should be redirected to that particular selection page with options$")
    public void iShouldBeRedirectedToThatParticularSelectionPageWithOptions( ){
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyPokerOptions());
    }
    @Given("^as a User, I have already selected any option from under Promotions sub-tab$")
    public void asAUserIHaveAlreadySelectedAnyOptionFromUnderPromotionsSubTab(){
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyContestsPage());
    }

    @When("^I click on PLAY NOW in poker$")
    public void iClickOnPLAYNOW() {
        SportsBettingPageContainer.sbpokerpage.clickPlayNow();
    }

    @Then("^I should be redirected to Poker sub-tab under POKER tab$")
    public void iShouldBeRedirectedToPokerSubTabUnderPOKERTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.clickPokerTab());
    }
//    @When("^I click on Terms & Conditions$")
//    public void iClickOnTermsConditions(){
//        SportsBettingPageContainer.sbpokerpage.clickTermsandConditions();
//    }

    @Then("^I should be shown with a pop-up listing all the Terms & Conditions$")
    public void iShouldBeShownWithAPopUpListingAllTheTermsConditions() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyPopup());
    }
    @When("^I click on Mobile sub-tab$")
    public void iClickOnMobileSubTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.clickMobileTab());
    }
    @Then("^I see an image and two QR codes$")
    public void iSeeAnImageAndTwoQRCodes(){
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyMobileContent());
    }
    @And("^Mobile sub-tab should be highlighted$")
    public void mobileSubTabShouldBeHighlighted(){
        SportsBettingPageContainer.sbpokerpage.verifyTabHighlight();
    }
    @Then("^I see different promotional options$")
    public void iSeeDifferentPromotionalOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyPromtionOptions());
    }

    @Given("^as a User, I can see a pop-up with all the Terms & Conditions$")
    public void asAUserICanSeeAPopUpWithAllTheTermsConditions() {
        SportsBettingPageContainer.sbpokerpage.clickTermsandConditions();
    }

    @When("^I click on Close either button or icon$")
    public void iClickOnCloseEitherButtonOrIcon() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.closeTermsPopup());
    }

    @And("^I see all the details of the particular selection$")
    public void iSeeAllTheDetailsOfTheParticularSelection() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyPromotionDetails());
    }

    @Then("^pop-up should get closed$")
    public void popUpShouldGetClosed(){
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.PopupClosed());
    }

    @When("^I click on image displaying DOWNLOAD FOR MAC$")
    public void iClickOnImageDisplayingDOWNLOADFORMAC() {
        SportsBettingPageContainer.sbpokerpage.clickDownloadForMAC();
    }

    @Then("^I am shown two images with QR respectively for APPLE and ANDROID devices with options$")
    public void iAmShownTwoImagesWithQRRespectivelyForAPPLEAndANDROIDDevicesWithOptions(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyPokerPageButtons());
    }


    @Given("^I see Poker page with Play Now and Download Now$")
    public void ISeePokerPageWithPlayNowAndDownloadNow() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyPokerPageButtons());
    }

    @When("^I click on PLAY NOW under Poker$")
    public void iClickOnPLAYNOWUnderPoker() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.clickPlayNowMobile());
    }

    @Then("^I see redirected page with game active to play$")
    public void iSeeRedirectedPageWithGameActiveToPlay() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyPlayNowPage());
    }

    @Then("^I see QR available for APPLE DEVICES$")
    public void iSeeQRAvailableForAPPLEDEVICES() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyPokerQRForApple());
    }

    @Then("^I see DOWNLOAD NOW under Poker$")
    public void iSeeDOWNLOADNOWUnderPoker() {
        Assert.assertTrue(SportsBettingPageContainer.sbpokerpage.verifyDownloadNowMobile());
    }
}

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

import java.util.List;

/**
 * Created by codoid-pc on 8/7/2019.
 */
public class SportsBettingHomeSteps {


    private sportsBetting.SportsBettingPageContainer SportsBettingPageContainer;
    private WebDriver driver;

    public SportsBettingHomeSteps(sportsBetting.SportsBettingPageContainer SportsBettingPageContainer) {
        this.SportsBettingPageContainer = SportsBettingPageContainer;
    }


    @When("^I login to the SportsBetting site with following credential (.*) and (.*)$")
    public void iLoginToTheSportsBettingSiteWithFollowingCredentialUsernameAndPassword(String strUser, String strPassword) {
        SportsBettingPageContainer.signUpPage.loginPTY(strUser, strPassword);
    }

    @When("^User login to the SportsBetting site with following credential (.*) and (.*)$")
    public void userLoginToTheSportsBettingSiteWithFollowingCredentialUsernameAndPassword(String strUser, String strPassword) {
        SportsBettingPageContainer.signUpPage.loginPTY(strUser, strPassword);
    }


    @When("^User click on the Join tab$")
    public void userClickOnTheJoinTab() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.clickonJoinTab());
    }


    @When("^User navigates through the (.*)$")
    public void userNavigatesThroughTheTabs(String strTabs) {
        SportsBettingPageContainer.signUpPage.clickHeaderTab(strTabs);
    }

    @Then("^User should see details related to selected Tab$")
    public void userShouldSeeDetailsRelatedToSelectedTab() {
    }

   /* @Then("^User fill up the sign up application with (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*)$")
    public void userFillUpTheSignUpApplicationWithFirstNameLastNameEmailPasswordCountryZipPhoneNumberDOB(String strFirstName, String strLastName, String strEmail, String strPassword, String strCountry, String strZip, String strPhoneNumber, String strDOB) {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifySignUpPageIsVisible());
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.enterUserDetailsInSignUpPage(strFirstName, strLastName, strEmail, strPassword, strCountry, strZip, strPhoneNumber, strDOB));
    }*/


//    @And("^User click on My Account link$")
//    public void userClickOnMyAccountLink() {
//        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountLnk());
//    }

//    @When("^User click Deposit Funds$")
//    public void userClickDepositFunds() {
//        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickDepositFundsLnk());
//    }

    @Then("^I enter following details (.*)$")
    public void IEnterFollowingDetailsInSignUpPageListDetails(List<String> lstDetails) {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifySignUpPageIsVisible());
        SportsBettingPageContainer.signUpPage.enterUserDetailsInSignUpPage(lstDetails);
    }


    @Then("^User should see details related to selected (.*)$")
    public void userShouldSeeDetailsRelatedToSelectedTab(String strTabName) {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLandingPage(strTabName));
    }

    @Then("^I should see SportsBetting Welcome page$")
    public void IShouldSeeSportsBettingWelcomePage() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyAccountCreatedPage());

    }

    @When("^I click Create Account$")
    public void IClickCreateAccount() {
        SportsBettingPageContainer.signUpPage.clickCreateAccountButton();
    }

    @Given("^I am on SportsBetting application$")
    public void iAmOnSportsBettingApplication() {
        Reporter.addStepLog(" URL: " + Constants.SPORTSBETTING_LIVE_URL);
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifySportsBettingUserLandingPage());
    }

    @When("^I move to (.*)$")
    public void iMoveToTab(String strTabs) {
        System.out.println(">>>>>>>>>>> iMoveToTab ");
        SportsBettingPageContainer.signUpPage.clickHeaderTab(strTabs);
    }

    @Then("^I should see details related to selected (.*)$")
    public void iShouldSeeDetailsRelatedToSelectedTab(String strTabName) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLandingPageTablet(strTabName));
        } else if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE)) {
            Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLandingPageMobile(strTabName));
        } else {
            Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLandingPage(strTabName));
        }
    }

    @Given("^As a SportsBetting user, I login with following credential (.*) and (.*)$")
    public void asASportsBettingUserILoginWithFollowingCredentialUsernameAndPassword(String strUser, String strPassword) {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYLogo());
        SportsBettingPageContainer.signUpPage.loginPTY(strUser, strPassword);
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifySportsBettingUserLandingPage());
    }

    @When("^I selects Contact Us page$")
    public void iSelectsContactUsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.clickContactUs());
    }

    @Then("^I should see the contact us page$")
    public void iShouldSeeTheContactUsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.verifyTelephoneNo());
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.verifyEmail());
    }

    @Given("^I am on Contact Us page$")
    public void IamsOnContactUsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.verifyContactUsPage());
    }

    @When("^I click on Live chat link$")
    public void userClickOnLiveChatLink() {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.clickLivechat());
    }

    @Then("^I should see the live chat window prompt$")
    public void userShouldSeeTheLiveChatWindowPrompt() {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.verifyChatUsPrompt());
        SportsBettingPageContainer.sbmycontactuspage.clickXIconInLiveChat();
    }

    @Then("^I navigate to \"([^\"]*)\" field in My Account page$")
    public void iMoveToSubTabFieldInMyAccountPage(String strSubTab) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountLnk());
        SportsBettingPageContainer.sbmyaccountpage.clickSubLinksInMyAccountPage(strSubTab);

    }

    @Given("^As a SportBetting user, I am on home page$")
    public void asASportBettingUserIAmOnHomePage() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifySportsBettingUserLandingPage());
    }

    @And("^I scroll down to bottom of the page$")
    public void iScrollDownToBottomOfThePage() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE)) {
            Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickHamburgicon());
        } else {
            SportsBettingPageContainer.signUpPage.jsScrollDown();
        }
    }

    @When("^I click Rules$")
    public void iClickRules() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.clickRules());
    }

    @Then("^I should be shown page related to rules$")
    public void iShouldBeShownPageRelatedToRules() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyRulesPage());
    }

    @And("^I select Join option$")
    public void iSelectJoinOption() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.clickonJoinTab());

    }

    @When("^User click logout Button$")
    public void userClickLogoutButton() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.clickLogoutButton());
    }

    @Then("^User is Logged out of the site$")
    public void userIsLoggedOutOfTheSite() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.logoutVerify());
    }

    @Then("^I should see the SportsBetting site homepage$")
    public void iShouldSeeTheSportsBettingSiteHomepage() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
    }

    @And("^Under homepage I click on (.*)$")
    public void underHomepageIClickOn (String strTab) {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.clickRulesUnderLeftNavigator(strTab));
    }

    @Then("^I am shown with all the rules related to sportsbetting web site$")
    public void iAmShownWithAllTheRulesRelatedToSportsbettingWebSite() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyRulesPage());
    }

    @Given("^as a User, I am already on the SportsBetting Rules page$")
    public void asAUserIAmAlreadyOnTheSportsBettingRulesPage() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyRulesPage());
    }

    @And("^I scroll down to Back To Top$")
    public void iScrollDownToBackToTop() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.scrollToBackToTop());
    }

    @When("^I click on Rules page Back To Top$")
    public void iClickOnRulesPageBackToTop() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.clickBackToTop());
    }

    @Then("^I see page is scrolled to top of Rules page$")
    public void iSeePageIsScrolledToTopOfRulesPage() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyRulesPage());
    }

    @Then("^I see page is redirected to the Sports tab page$")
    public void iSeePageIsRedirectedToTheSportsTabPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySportsbookpage());
    }

//    @Given("^as a User, I see all the games under SPORTS page$")
//    public void asAUserISeeAllTheGamesUnderSPORTSPage() {
//        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifySportsPage());
//    }

    @Then("^I see team selected added to Straight Bet pop-up for betting$")
    public void iSeeTeamSelectedAddedToStraightBetPopUpForBetting() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyStraightBetPopUp());
    }

    @Given("^as a User, I have already added single team under Straight Bet$")
    public void asAUserIHaveAlreadyAddedSingleTeamUnderStraightBet() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyStraightBetPopUp());
    }

    @When("^I click on straight bet form Risk Max Limit$")
    public void iClickOnStraightBetFormRiskMaxLimit() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickRiskMaxLimit());
    }

    @Then("^I see amount automatically filled in the bet field$")
    public void iSeeAmountAutomaticallyFilledInTheBetField() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyAmountUnderBetField());
    }

    @When("^I click on bet slip Close\\(Icon\\)$")
    public void iClickOnBetSlipCloseIcon() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.clickBetSlipClose());
    }

    @Then("^I see Straight Bet is closed and bet added is removed$")
    public void iSeeStraightBetIsClosedAndBetAddedIsRemoved() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifySportsTeamPage());
    }

    @And("^If no error is displayed$")
    public void ifNoErrorIsDisplayed() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyErrorMessageUnderBetSlip());
    }

    @And("^I close any add pop-up$")
    public void iCloseAnyAddPopUp() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.closeAddsPopUp());
    }

    @Given("^as a User, I see teams available to bet$")
    public void asAUserISeeTeamsAvailableToBet() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.closeAddsPopUp());
    }

    @Given("^as a User, I click homepage (.*)$")
    public void asAUserIClickHomepage(String strTab) {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.clickRulesUnderLeftNavigator(strTab));
    }

    @When("^I click on sportsBetting Contact Us$")
    public void iClickOnSportsBettingContactUs() {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.clickContactUsMobile());
    }

    @Then("^I see under Rules few contact-us-options$")
    public void iSeeUnderRulesFewContactUsOptions(DataTable strDatas) {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.verifyContactUs(strDatas));
    }

    @Given("^as a User, I see Contact us page$")
    public void asAUserISeeContactUsPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.verifyContactUsPageMobile());
    }

    @And("^I click on contact us page LIVE CHAT$")
    public void iClickOnContactUsPageLIVECHAT() {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.clickLiveChatInMobile());
    }

    @When("^a chat pop-up is opened$")
    public void aChatPopUpIsOpened() {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.verifyLiveChatPopUp());
    }

    @Then("^I am shown with text (.*)$")
    public void iAmShownWithText(String strText) {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.verifyLiveChatPopUpText(strText));
    }

    @Given("^as a User, I see live chat pop up$")
    public void asAUserISeeLiveChatPopUp() {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.verifyLiveChatPopUp());
    }

    @And("^I click drop down under Live Chat pop up$")
    public void iClickDropDownUnderLiveChatPopUp() {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.clickLiveChatDropDown());
    }

    @When("^I click End Chat under drop down$")
    public void iClickEndChatUnderDropDown() {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.clickLiveChatEndUnderDropDown());
    }

    @Then("^I see Live Chat pop up closes and contact up page visible$")
    public void iSeeLiveChatPopUpClosesAndContactUpPageVisible() {
        Assert.assertTrue(SportsBettingPageContainer.sbmycontactuspage.verifyContactUsPageMobile());
    }


//    @When("^I navigate to Livecasino's <SubTab>$")
//    public void iNavigateToLivecasinoSSubTab(String strTabs) {
//     Assert.assertTrue(SportsBettingPageContainer.signUpPage.clickLiveCasinoTab(strTabs));
//    }
}

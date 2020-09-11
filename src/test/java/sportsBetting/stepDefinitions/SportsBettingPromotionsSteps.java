package sportsBetting.stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SportsBettingPromotionsSteps {
    private sportsBetting.SportsBettingPageContainer SportsBettingPageContainer;
    private WebDriver driver;

    public SportsBettingPromotionsSteps(sportsBetting.SportsBettingPageContainer SportsBettingPageContainer) {
        this.SportsBettingPageContainer = SportsBettingPageContainer;
    }


    @Then("^I should see details related to promotion tab$")
    public void iShouldSeeDetailsRelatedToPromotionTab(DataTable tableTabs) {
        SportsBettingPageContainer.sbpromotionspage.verifyPromotionsPage(tableTabs);
    }

    @Given("^as a User, I am on the Promotion page$")
    public void asAUserIAmOnThePromotionPage() {

        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyPromotions());
    }

    // navigating thorugh promotion sub-tabs
    @When("^I click on promotions (.*)$")
    public void iClickOnSubTab(String strTabsPromotions) {
        SportsBettingPageContainer.sbpromotionspage.clickPromotionTabsNavigation(strTabsPromotions); // TODO: 15-04-2020--done
    }


    @Then("^I see different deposit options under Deposit sub-tab$")
    public void iSeeDifferentDepositOptionsUnderSubTab()  {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyDepositPagePromotions());



    }

    @Given("^as a User, I am inside the Deposit sub-tab$")
    public void asAUserIAmInsideTheSubTab(){
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyDepositPagePromotions());
    }

    @When("^I click on Deposit Now$")
    public void iClickOnDepositNow() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.clickDepositNowBtnPagePromotions());

    }


    @Then("^I am redirected to the promotion CASHIER page$")
    public void iAmRedirectedToTheCASHIERPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyViewMoreOptionsLink());
    }

    @When("^I click on Terms & Conditions$")
    public void iClickOnTermsConditions() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.clickTermsAndConditions());
    }

    @Then("^I see the Terms & Conditions on a pop-up with Close \\(button and Icon\\) on it$")
    public void iSeeTheTermsConditionsOnAPopUpWithCloseButtonAndIconOnIt() {
     Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyGeneralRulesInTermsAndConditionsPopUp());

    }

    @Given("^as a User, I am on the Terms & Conditions pop-up in sportsBetting$")
    public void asAUserIAmOnTheTermsConditionsPopUp() {
   //  Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyTermsAndConditionsPopUp());
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyTermsAndConditionsPopUp());


    }

    @When("^I click on Cancel \\(either button or icon\\)$")
    public void iClickOnCancelEitherButtonOrIcon() {
       SportsBettingPageContainer.sbpromotionspage.clickOnCloseIconInTermsAndConditionsPopUp();
    }

    @Then("^I see the Terms & Conditions pop-up gets closed$")
    public void iSeeTheTermsConditionsPopUpGetsClosed() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyDepositPagePromotions());
    }

    @When("^I click on PLAY NOW in promotion$")
    public void iClickOnPLAYNOW() {
        SportsBettingPageContainer.sbpromotionspage.clickOnPlayNow();

    }

    @Then("^I am redirected to the Bonus sub-tab under CASINO page$")
    public void iAmRedirectedToTheBonusSubTabUnderCASINOPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyCasinoPage());
    }


    @And("^I click Promotions tab$")
    public void iClickPromotionsTab() {
    SportsBettingPageContainer.sbpromotionspage.clickOnPromoitonsTab();}

    @When("^I click on promotion (.*)$")
    public void iClickOnReferAFriend(String tabsPromotions) {
        SportsBettingPageContainer.sbpromotionspage.clickPromotionTabsNavigation(tabsPromotions);
    }

    @Then("^I see Refers present with REFER NOW option$")
    public void iSeeRefersPresentWithREFERNOWOption() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyReferNowOption());

    }

    @Given("^as a User, I am on the Refer a Friend page$")
    public void asAUserIAmOnTheReferAFriendPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyReferNowOption());
    }

    @When("^I click on REFER NOW$")
    public void iClickOnREFERNOW() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.clickReferNowOption());
    }

    @Then("^I am redirected to My Account under the home page with Referal url to share$")
    public void iAmRedirectedToMyAccountUnderTheHomePageWithReferralUrlToShare() { // TODO: 15-04-2020  "Spelling"--changed
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyReferFriendPage());
    }

    @Then("^I see different sports promotions with options$")
    public void iSeeDifferentOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifySportsPagePromotions());
    }

    @Then("^I see different Racebook promotions with options$")
    public void iSeeDifferentRacebookPromotionsWithOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyRacebookPagePromotions());
    }

    @Then("^I see different casino promotions with options$")
    public void iSeeDifferentCasinoPromotionsWithOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyCasinoPagePromotions());

    }

    @Then("^I see different contest promotions with options$")
    public void iSeeDifferentContestPromotionsWithOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyContestPromotionPage());
    }

    @Given("^as a User, I am on the Contests page inside the Promotions tab$")
    public void asAUserIAmOnTheContestsPageInsideThePromotionsTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyContestPromotionPage());
    }

    @When("^I click on Closed$")
    public void iClickOnClosed() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.clickClosedContestPage());
    }

    @Then("^I am redirected to the Contests page of the Contests tab$")
    public void iAmRedirectedToTheContestsPageOfTheContestsTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyContestPage());

    }

    @Then("^I see different poker promotions with options$")
    public void iSeeDifferentPokerPromotionsWithOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyPokerPromotionPage());
    }

    @When("^I click on Opt In Casino promotion$")
    public void iClickOnOptIn() {

    Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.clickOptInNowbtnInCasino());}

    @When("^I click on Opt In Deposit promotion$")
    public void iClickOnOptInDepositPromotion() {
        SportsBettingPageContainer.sbpromotionspage.clickOptInNowbtnInDeposit();
    }

    @Then("^I am redirected to that particular Contest full details$")
    public void iAmRedirectedToThatParticularContestFullDetailsViewWithOption() {

        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyOptInNow());
    }

    @And("^I enter my (.*) iOpt In promotion$")
    public void iEnterMyEmailIOptInPromotion(String strEmailId) {
    SportsBettingPageContainer.sbpromotionspage.enteringMailIdInOptIn(strEmailId);
    }

    @When("^I click Opt In \\(If available\\)$")
    public void iClickOptInIfAvailable() {

        SportsBettingPageContainer.sbpromotionspage.clickOptInOptionInOptPage();

    }

    @Then("^I see Congratulations, You have been registered\\. message displayed as confirmation \\(If Opt In available\\)$")
    public void iSeeCongratulationsYouHaveBeenRegisteredMessageDisplayedAsConfirmationIfOptInAvailable() {

        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifySuccessMessage());
    }

    @And("^I click casino tab$")
    public void iClickCasinoTab() {
        SportsBettingPageContainer.sbpromotionspage.clickCasinoPromotion();
    }

    @When("^I click on Learn More$")
    public void iClickOnLearnMore() {
    SportsBettingPageContainer.sbpromotionspage.clickLearnMoreInPoker();
    }

    @Then("^I see detailed view of information for the particular chosen$")
    public void iSeeDetailedViewOfInformationForTheParticularChosenWith() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyLearnMorePokerPage());

    }

    @And("^I click on PLAY NOW in Poker Promotion$")
    public void iClickOnPLAYNOWInPokerPromotion() {
        SportsBettingPageContainer.sbpromotionspage.clickPlayNowInPoker();
    }

    @When("^I click on PLAY NOW inside promotion$")
    public void iClickOnPLAYNOWInsidePromotion() {
        SportsBettingPageContainer.sbpromotionspage.clickPlayNowInsidePromotion();
    }

    @Then("^I am redirected to the Poker page under the home page$")
    public void iAmRedirectedToThePokerPageUnderTheHomePage() {
        Assert.assertTrue(SportsBettingPageContainer.sbpromotionspage.verifyPokerPromotionInPokerpage());
    }

    @When("^I click on Deposit Now in Sports Promotion$")
    public void iClickOnDepositNowInSportsPromotion() {
   SportsBettingPageContainer.sbpromotionspage.clickDepositNowInSportsPromotion();
    }

    @When("^I click on Learn More in Sports Promotion$")
    public void iClickOnLearnMoreInSportsPromotion() {
        SportsBettingPageContainer.sbpromotionspage.clickLearnMoreInSports();
    }

    @When("^I click on Deposit Now in Racebook Promotion$")
    public void iClickOnDepositNowInRacebookPromotion() {
        SportsBettingPageContainer.sbpromotionspage.clickDepositNowInRacebookPromotion();
    }

    @And("^I click Poker tab$")
    public void iClickPokerTab() {
    SportsBettingPageContainer.sbpromotionspage.clickPokerPromotion();
    }

    @When("^I click on Opt In Poker promotion$")
    public void iClickOnOptInPokerPromotion() {
    SportsBettingPageContainer.sbpromotionspage.clickOptInNowbtnInPoker();
    }

    @And("^I enter my (.*) iOpt In casino promotion$")
    public void iEnterMyEmailIOptInCasinoPromotion(String strEmailId) {

        SportsBettingPageContainer.sbpromotionspage.enteringMailIdInCasinoOptIn(strEmailId);

    }

    @And("^I enter my (.*) iOpt In Poker promotion$")
    public void iEnterMyEmailIOptInPokerPromotion(String strEmailId) {

        SportsBettingPageContainer.sbpromotionspage.enteringMailIdInPokerOptIn(strEmailId);
    }
}

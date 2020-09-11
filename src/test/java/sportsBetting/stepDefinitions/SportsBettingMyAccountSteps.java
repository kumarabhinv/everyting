package sportsBetting.stepDefinitions;

import cap.utilities.TestDataUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

public class SportsBettingMyAccountSteps {
    private sportsBetting.SportsBettingPageContainer SportsBettingPageContainer;
    private WebDriver driver;

    public SportsBettingMyAccountSteps(sportsBetting.SportsBettingPageContainer SportsBettingPageContainer) {
        this.SportsBettingPageContainer = SportsBettingPageContainer;
    }

    @Given("^as a User, I already see homepage$")
    public void asAUserIAlreadySeeHomepage() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());

    }


    @Then("^page is redirected to My Account page with (.*)$")
    public void pageIsRedirectedToMyAccountPageWithHeaders(String strHeader) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyHeadersUnderMyAccount(strHeader));

    }

    @Given("^as a User, I already see My Account tab page$")
    public void asAUserIAlreadySeeMyAccountTabPage() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickNewMessageUnderMyAccount());
    }

    @Then("^I see My Account header containing different (.*)$")
    public void iSeeMyAccountHeaderContainingDifferentSubTabs(String strHeader1) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyHeaderUnderMyAccount(strHeader1));

    }

    @When("^I click on Deposit Funds$")
    public void iClickOnDepositFunds() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickDepositUnderMyAccount());
    }

    @Then("^I see a pop-up with deposit (.*)$")
    public void iSeeAPopUpWithCardOptions(String strUnderHeader) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyCardOptionsUnderMyAccount(strUnderHeader));
    }

    @Given("^as a User, I am on Deposit Funds pop-up page in sportsbetting$")
    public void asAUserIAmOnDepositFundsPopUpPage() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickNewMessageUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickDepositUnderMyAccount());
    }


//    @And("^I click on Insert Digits$")
//    public void iClickOnInsertDigits() {
//        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickInsertUnderMyAccount());
//    }


    @And("^I enter Card Number as (.*), Ebxpiry as (.*), CVV as(.*) and amount as (.*)$")
    public void iEnterCardNumberAsCardNumberEbxpiryAsExpiryCVVAsCvvAndAmountAsAmount(String strcardnumber, String strexpiry, String strcvv, String stramount) {
        SportsBettingPageContainer.sbmyaccountpage.insertValues(strcardnumber, strexpiry, stramount, strcvv);
    }


    @When("^I click Deposit option$")
    public void iClickDeposit() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickDepositFunction());
    }

    @Then("^user is redirected to Confirmation Page$")
    public void userIsRedirectedToTheConfirmationPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyConformationPageUnderMyAccount());
    }

//    @Then("^user is given fresh area to enter New Card Numbers$")
//    public void userIsGivenFreshAreaToEnterNewCardNumbers() {
//        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyNewPageUnderMyAccount());
//    }

    @When("^I click on Change Payment Method$")
    public void iClickOnChangePaymentMethod() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickChangePaymentUnderMyAccount());
    }

    @Then("^user is redirected to the Cashier page with multiple deposit options$")
    public void userIsRedirectedToTheCashierPageWithMultipleDepositOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyRedirectedPageUnderMyAccount());
    }


    @Then("^I see a redirected page with all the User profile related informations$")
    public void iSeeARedirectedPageWithAllTheUserProfileRelatedInformations() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyProfilePageUnderMyAccount());
    }

    @When("^I click on My Profile under My Account header$")
    public void iClickOnMyProfileUnderMyAccountHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyProfileUnderMyAccount());
    }

    @When("^I click My Account header containing different  Payouts$")
    public void iClickMyAccountHeaderContainingDifferentPayouts() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPayoutUnderMyAccount());
    }

    @When("^I click on View My Payout History$")
    public void iClickOnViewMyPayoutHistory() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPayoutHistoryUnderMyAccount());
    }

    @Then("^I a redirected page with Refresh button$")
    public void iARedirectedPageWithRefreshButton() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyRefreshButtonUnderPayoutHistory());
    }

    @And("^I see all the payouts done earlier if any else I see No data returned$")
    public void iSeeAllThePayoutsDoneEarlierIfAnyElseISeeNoDataReturned() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPayoutHistoryUnderMyAccount());
    }

    @When("^I click on Refresh button$")
    public void iClickOnRefreshButton() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickRefreshButtonUnderPayoutHistory());
    }

    @Then("^I see View My Payout History page can be refreshed$")
    public void iSeeViewMyPayoutHistoryPageCanBeRefreshed() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPayoutHistoryUnderMyAccount());
    }

    @Then("^I see a redirected page with all the Payout related options to choose from$")
    public void iSeeARedirectedPageWithAllThePayoutRelatedOptionsToChooseFrom() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyNewRequestPageUnderPayoutHistory());
    }

    @When("^I click on Request a New Payout$")
    public void iClickOnRequestANewPayout() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickNewRequestUnderPayoutHistory());
    }

    @When("^I click My Account header containing different Pending Wagers$")
    public void iClickMyAccountHeaderContainingDifferentPendingWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPendingWagerUnderMyAccount());
    }

    @Then("^I see a redirected page with all the pending wagers$")
    public void iSeeARedirectedPageWithAllThePendingWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPendingWagerUnderMyAccount());
    }

    @When("^I click on any ticket number from under TICKET header$")
    public void iClickOnAnyTicketNumberFromUnderTICKETHeader() {
        Assert.assertTrue((SportsBettingPageContainer.sbmyaccountpage.clickTicketUnderPendingWager()));
    }

    @Then("^I see Ticket Number expands showing all the details related  under the choice selected$")
    public void iSeeTicketNumberExpandsShowingAllTheDetailsRelatedUnderTheChoiceSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTicketUnderPendingWager());
    }

    @Then("^I see the details related get collapsed and few descriptions visible$")
    public void iSeeTheDetailsRelatedGetCollapsedAndFewDescriptionsVisible() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyCollapsePageUnderPendingWager());
    }

    @When("^I click My Account header containing different Graded Wagers$")
    public void iClickMyAccountHeaderContainingDifferentGradedWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickGradedWagerUnderMyAccount());
    }

    @Then("^I see a redirected page with all the graded wagers$")
    public void iSeeARedirectedPageWithAllTheGradedWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyRedirectedWagerPageUnderGradedWager());
    }

    @And("^I see few (.*) options$")
    public void iSeeFewSelectors(String strSelectors) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyHeadersWagerUnderGradedWager(strSelectors));
    }

    @Given("^I click My Account header containing different Transaction History$")
    public void iClickMyAccountHeaderContainingDifferentTransactionHistory() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTransactionHistoryUnderGradedWager());
    }

    @And("^I  will select any date from Start Date and End Date$")
    public void iWillSelectAnyDateFromStartDateAndEndDate() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.selectStartDateUnderTransactionPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.selectEndDateUnderTransactionPage());
    }

    @And("^I should select any option from under Show$")
    public void iShouldSelectAnyOptionFromUnderShow() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickShowUnderTransactionPage());
    }

    @When("^I click on Refresh$")
    public void iClickOnRefresh() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickRefreshRequestUnderTransactionPage());
    }

    @Then("^I see all Doc # Numbers shown for the particular choices selected$")
    public void iSeeAllDocNumbersShownForTheParticularChoicesSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTransactionPage());
    }

    @Given("^as a User, I already see Transaction History page$")
    public void asAUserIAlreadySeeTransactionHistoryPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTransactionPage());

    }

    @When("^I click on any doc number from under Doc header$")
    public void iClickOnAnyDocNumberFromUnderDocHeader() {
       SportsBettingPageContainer.sbmyaccountpage.clickDocumentUnderTransactionPage();
    }

    @Then("^I see Ticket Number expands showing few details related to the choice selected$")
    public void iSeeTicketNumberExpandsShowingFewDetailsRelatedToTheChoiceSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyExpandedPageUnderTransactionPage());
    }

    @Given("^as a User, I already see Ticket Number expanded showing all the details related under the choice selected$")
    public void asAUserIAlreadySeeTicketNumberExpandedShowingAllTheDetailsRelatedUnderTheChoiceSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyExpandedPageUnderTransactionPage());

    }


    @When("^I click on any doc number from under Docs header$")
    public void iClickOnAnyDocNumberFromUnderDocsHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clicksDocumentUnderTransactionPage());
    }

    @Then("^I  want to see the details related get collapsed and few descriptions visible$")
    public void iWantToSeeTheDetailsRelatedGetCollapsedAndFewDescriptionsVisible() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyCollapsedPageUnderTransactionPage());
    }

    @And("^I see New Messages instead of My Account$")
    public void iSeeNewMessagesInsteadOfMyAccount() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyNewMessageUnderMyAccount());
    }

    @When("^I click on New Messages$")
    public void iClickOnNewMessages() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickNewMessageUnderMyAccount());
    }

    @Then("^I see all the messages under My Messages sub-tab under My Account tab$")
    public void iSeeAllTheMessagesUnderMyMessagesSubTabUnderMyAccountTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyNewMessageUnderMyAccount());
    }

    @And("^I click My Account header containing different Daily Figures$")
    public void iClickMyAccountHeaderContainingDifferentDailyFigures() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickDailyFiguresUnderMyAccount());
    }

    @Then("^I see a redirected page with all the daily figures details$")
    public void iSeeARedirectedPageWithAllTheDailyFiguresDetails() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyDailyFiguresUnderMyAccount());
    }

    @And("^I have to see few (.*)$")
    public void iHaveToSeeFewHeader(String strHeader1) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyHeadersPageUnderMyAccount(strHeader1));
    }

    @When("^I click on any clickable value from under any header$")
    public void iClickOnAnyClickableValueFromUnderAnyHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickValueUnderDailyFigures());
    }

    @Then("^I see all the details shown for that particular selection$")
    public void iSeeAllTheDetailsShownForThatParticularSelection() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyLinkUnderDailyFigures());
    }

    @Given("^as a User, I already see all the details shown for that particular selection$")
    public void asAUserIAlreadySeeAllTheDetailsShownForThatParticularSelection() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickDailyFiguresUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLastWeekUnderDailyFigures());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickValueUnderDailyFigures());


    }

    @And("^I click on Last Week's Figures$")
    public void iClickOnLastWeekSFigures() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLastWeekUnderDailyFigures());
    }

    @Then("^I see all the results changing with respect to last week figures$")
    public void iSeeAllTheResultsChangingWithRespectToLastWeekFigures() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyLastWeekUnderDailyFigures());
    }

    @When("^I click on Current Week's Figures$")
    public void iClickOnCurrentWeekSFigures() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickCurrentWeekUnderDailyFigures());
    }

    @Then("^I see all the results changing with respect to current week figures$")
    public void iSeeAllTheResultsChangingWithRespectToCurrentWeekFigures() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyCurrentWeekUnderDailyFigures());
    }

    @When("^I click My Account header containing different Limits Information$")
    public void iClickMyAccountHeaderContainingDifferentLimitsInformation() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLimitsInformationUnderMyAccount());
    }

    @Then("^I see a redirected page with a dropdown for Select Sport$")
    public void iSeeARedirectedPageWithADropdownForSelectSport() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyLimitInformationUnderMyAccount());
    }

    @Given("^as a User, I am already under the Limits Information page$")
    public void asAUserIAmAlreadyUnderTheLimitsInformationPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLimitsInformationUnderMyAccount());
    }

    @When("^I will select any sport from under Select Sport dropdown$")
    public void iWillSelectAnySportFromUnderSelectSportDropdown() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickAnyGameUnderLimitInformation());
    }

    @Then("^I see all the results for that particular sport selected$")
    public void iSeeAllTheResultsForThatParticularSportSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyAnyGameUnderLimitInformation());
    }

    @When("^I click My Account header containing different Refer My Friends$")
    public void iClickMyAccountHeaderContainingDifferentReferMyFriends() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReferAFriendUnderMyAccount());
    }

    @Then("^I  have to see (.*)$")
    public void iHaveToSeeOptions(String strOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyOptionsUnderReferAFriend(strOptions));
    }

    @When("^I click on Refer a Friend$")
    public void iClickOnReferAFriend() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReferFriendUnderMyAccount());
    }

    @Then("^I am given with (.*)$")
    public void iAmGivenWithChoices(String strChoices) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyChoicesUnderReferAFriend(strChoices));
    }

    @And("^I would have see (.*) options$")
    public void iwouldhaveSeeSharingOptions(String strSharingOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifySharingOptionsUnderReferAFriend(strSharingOptions));
    }

    @Given("^as a User, I have already clicked on Refer a Friend$")
    public void asAUserIHaveAlreadyClickedOnReferAFriend() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickNewMessageUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReferFriendUnderMyAccount());
    }

    @When("^I  have to select (.*)$")
    public void iHaveToSelectChoices(String strChoices1) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickChoicesUnderReferAFriend(strChoices1));
    }

    @Then("^I see a referal link being generated for that particular choice$")
    public void iSeeAReferalLinkBeingGeneratedForThatParticularChoice() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyChoices1UnderReferAFriend());
    }

    @Then("^I see a pop-up for confirmation with link to share$")
    public void iSeeAPopUpForConfirmationWithLinkToShare() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPopUpUnderReferAFriend());
    }

    @When("^I click on Click here link$")
    public void iClickOnClickHereLink() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLinkUnderReferAFriend());
    }

    @When("^I click on any of the social media$")
    public void iClickOnAnyOfTheSocialMedia() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSocialMediaUnderReferAFriend());
    }

    @Then("^I see a pop-up to Login and share$")
    public void iSeeAPopUpToLoginAndShare() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifySocialMediaPopupUnderReferAFriend());
    }

    @And("^I enter First Name, Last Name and email$")
    public void iEnterFirstNameLastNameAndEmail(List<String> lstDetails) {
       // Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.enterDetailsUnderReferAFriend());
        SportsBettingPageContainer.sbmyaccountpage.enterFriendFirstName(TestDataUtil.getValue(lstDetails.get(0)));
        SportsBettingPageContainer.sbmyaccountpage.enterFriendEmailAddress(TestDataUtil.getValue(lstDetails.get(1)));
    }

    @When("^I click on Submit$")
    public void iClickOnSubmit() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSubmitUnderReferAFriend());
    }

    @Then("^I see a redirected page with referal successful or denied message$")
    public void iSeeARedirectedPageWithReferalSuccessfulOrDeniedMessage() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyReferAPageUnderReferAFriend());
    }

    @And("^I click on Add from Address Book$")
    public void iClickOnAddFromAddressBook() {
        SportsBettingPageContainer.sbmyaccountpage.clickAddressBookUnderReferAFriend();
    }

    @When("^I  has to select any choice from among the choices under pop-up$")
    public void iHasToSelectAnyChoiceFromAmongTheChoicesUnderPopUp() {
        SportsBettingPageContainer.sbmyaccountpage.selectAnyChoiceUnderReferAFriend();
    }

    @Then("^I suppose to be  with option as per the selected choice$")
    public void iSupposeToBeWithOptionAsPerTheSelectedChoice() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyAddressBookUnderReferAFriend());
    }

    @When("^I click on View My Referrals$")
    public void iClickOnViewMyReferrals() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickViewReferralsUnderMyAccount());
    }

    @Then("^I am shown with all the details related to the past referrals$")
    public void iAmShownWithAllTheDetailsRelatedToThePastReferrals() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPastReferralsUnderReferAFriend());
    }

    @When("^I click on Bet Calculator$")
    public void iClickOnBetCalculator() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickBetCalculatorUnderMyAccount());
    }

    @Then("^I am redirected to Betting Calculator page$")
    public void iAmRedirectedToBettingCalculatorPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyCalculatorPageUnderReferAFriend());
    }


    @Given("^as a User, I am already on Bet Calculator page$")
    public void asAUserIAmAlreadyOnBetCalculatorPage() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickNewMessageUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickBetCalculatorUnderMyAccount());
    }

    @And("^I click on Odds Converter$")
    public void iClickOnOddsConverter() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickOddCalculatorUnderBetCalculator());
    }

    @When("^I enter value under American header$")
    public void iEnterValueUnderAmericanHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.enterValueInOddUnderBetCalculator());
    }

    @Then("^I am shown with values corresponding to the other header automatically filled$")
    public void iAmShownWithValuesCorrespondingToTheOtherHeaderAutomaticallyFilled() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyAllOtherHeaderUnderBetCalculator());
    }

    @And("^I click on Win And Risk Calculator$")
    public void iClickOnWinAndRiskCalculator() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickWinAndRiskUnderBetCalculator());
    }

    @And("^I enter value under any odds-header$")
    public void iEnterValueUnderAnyOddsHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.enterOddsUnderBetCalculator());
    }

    @And("^I see other odds-headers gets filled automatically$")
    public void iSeeOtherOddsHeadersGetsFilledAutomatically() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyEnteredOddsUnderBetCalculator());
    }

    @When("^I enter value under either Win or Risk header$")
    public void iEnterValueUnderEitherWinOrRiskHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.enterRiskOrWinUnderBetCalculator());
    }

    @Then("^I see other header values automatically getting filled$")
    public void iSeeOtherHeaderValuesAutomaticallyGettingFilled() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyEnteredRiskOrWinUnderBetCalculator());
    }

    @And("^I click on Parlay Calculator$")
    public void iClickOnParlayCalculator() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickParlayCalculatorUnderMyAccount());
    }


    @And("^I  need to select any option from dropdown under Line Type header$")
    public void iNeedToSelectAnyOptionFromDropdownUnderLineTypeHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.selectOptionUnderParlayCalculator());
    }

    @And("^I  need to select any option from dropdown under Sport Type$")
    public void iNeedToSelectAnyOptionFromDropdownUnderSportType() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.selectSportTypeUnderParlayCalculator());
    }

    @When("^I enter value for Bet \\$$")
    public void iEnterValueForBet$() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.enterBetUnderParlayCalculator());
    }

    @Then("^I click on Calculate$")
    public void iClickOnCalculate() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickCalculateUnderParlayCalculator());
    }

    @And("^I see Winnings  automatically gets filled$")
    public void iSeeWinningsAutomaticallyGetsFilled() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyWinningsUnderParlayCalculator());
    }

    @And("^I will enter value  under American header$")
    public void iWillEnterValueUnderAmericanHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.enterValuesAmericanHeaderUnderParlayCalculator());
    }

    @Given("^as a User, I have already performed operations and I see some value under Winnings$")
    public void asAUserIHaveAlreadyPerformedOperationsAndISeeSomeValueUnderWinnings() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickNewMessageUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickBetCalculatorUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickParlayCalculatorUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.enterValuesAmericanHeaderUnderParlayCalculator());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.selectOptionUnderParlayCalculator());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.selectSportTypeUnderParlayCalculator());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.enterBetUnderParlayCalculator());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickCalculateUnderParlayCalculator());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyWinningsUnderParlayCalculator());
    }

    @When("^I click on Reset$")
    public void iClickOnReset() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickResetUnderParlayCalculator());
    }

    @Then("^I see all the fields gets reset$")
    public void iSeeAllTheFieldsGetsReset() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyAllFieldsUnderParlayCalculator());
    }

    @When("^I click on ADD ANOTHER ROW$")
    public void iClickOnADDANOTHERROW() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickAddAnotherRowUnderParlayCalculator());
    }

    @Then("^I see a new field gets added$")
    public void iSeeANewFieldGetsAdded() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyAnotherRowUnderParlayCalculator());
    }

    @And("^I click on Teaser Calculator$")
    public void iClickOnTeaserCalculator() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTeaserCalculatorUnderMyAccount());
    }

    @And("^I  has select any option from dropdown for Select Teaser Group$")
    public void iHasSelectAnyOptionFromDropdownForSelectTeaserGroup() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickGroupTypeUnderTeaserCalculator());
    }

    @And("^I enter vaule atleast two time under Points header$")
    public void iEnterVauleAtleastTwoTimeUnderPointsHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickEnterValuesOfTeaserUnderMyAccount());
    }


    @And("^I see New Point header values automatically gets filled$")
    public void iSeeNewPointHeaderValuesAutomaticallyGetsFilled() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyNewPointsUnderTeaserCalculator());
    }

    @And("^I seem to select any option from dropdown under Sport Type$")
    public void iSeemToSelectAnyOptionFromDropdownUnderSportType() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSportTypeUnderTeaserCalculator());
    }

    @And("^I seem to select any option from dropdown under line Type$")
    public void iSeemToSelectAnyOptionFromDropdownUnderLineType() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTeaserOptionUnderMyAccount());
    }


    @When("^I have to enter value for Bet \\$$")
    public void iHaveToEnterValueForBet$() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickBetUnderTeaserCalculator());
    }

    @Then("^I click on CalculateTeaser$")
    public void iClickOnCalculateTeaser() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickCalculatorUnderparlayCalculator());
    }

    @And("^I see Winnings under teaser  automatically gets filled$")
    public void iSeeWinningsUnderTeaserAutomaticallyGetsFilled() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyWinningsUnderTeaserCalculator());
    }

    @Given("^as a User, I have already performed operations and I see some value under Winnings \\$$")
    public void asAUserIHaveAlreadyPerformedOperationsAndISeeSomeValueUnderWinnings$() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickNewMessageUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickBetCalculatorUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTeaserCalculatorUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickBetUnderTeaserCalculator());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickGroupTypeUnderTeaserCalculator());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickEnterValuesOfTeaserUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyNewPointsUnderTeaserCalculator());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickGroupTypeUnderTeaserCalculator());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTeaserOptionUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickCalculatorUnderparlayCalculator());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyWinningsUnderTeaserCalculator());

    }

    @When("^I should click on Reset$")
    public void iShouldClickOnReset() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickResetButtonUnderTeaserCalculator());
    }

    @Then("^I check all the fields gets reset$")
    public void iCheckAllTheFieldsGetsReset() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyAllFieldsSetUnderTeaserCalculator());
    }

    @When("^I  has to click on ADD ANOTHER ROW$")
    public void iHasToClickOnADDANOTHERROW() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickAddRowUnderTeaserCalculator());
    }

    @Then("^I suppose see a new field gets added$")
    public void iSupposeSeeANewFieldGetsAdded() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyNewFieldUnderTeaserCalculator());
    }


    @Then("^the page is redirected and I see (.*)$")
    public void thePageIsRedirectedAndISeeHeaders(String strHeaders) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyMyMessagesHeaderUnderTeaserCalculator(strHeaders));
    }

    @Given("^as a User, I have already clicked My Messages$")
    public void asAUserIHaveAlreadyClickedMyMessages() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickNewMessageUnderMyAccount());
    }


    @And("^I write something under the text area given for Your message$")
    public void iWriteSomethingUnderTheTextAreaGivenForYourMessage() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clicKANoteUnderMyMessages());
    }

    @When("^I click on Send$")
    public void iClickOnSend() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSendUnderMyMessages());
    }

    @Then("^I see the message posted under Your messages history header$")
    public void iSeeTheMessagePostedUnderYourMessagesHistoryHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyMessageHistoryUnderMyMessages());
    }


    @And("^I have to select any (.*) from under Subject dropdown$")
    public void iHaveToSelectAnyChoiceFromUnderSubjectDropdown(String strChoices) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickChoicesUnderMyMessages());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickChoicesUnderOptionsMyMessages(strChoices));
    }

    @When("^I click on cancel$")
    public void iClickOnCancel() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickCancelButtonMyMessages());
    }

    @When("^I scroll down to Your messages history header$")
    public void iScrollDownToYourMessagesHistoryHeader() {
        SportsBettingPageContainer.sbmyaccountpage.verifyScroolDownUnderMyMessages();
    }


    @Then("^I see  the messages posted with Message details$")
    public void iSeeTheMessagesPostedWithMessageDetails() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyMessageDetailsUnderMyMessages());

    }

    @When("^I click on Message\\(s\\) details from under any message posted$")
    public void iClickOnMessageSDetailsFromUnderAnyMessagePosted() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMessageDetailsUnderMyMessages());
    }

    @Then("^I see all the replies to the message posted by the admin$")
    public void iSeeAllTheRepliesToTheMessagePostedByTheAdmin() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyMessagesFromAdminUnderMyMessages());
    }


    @Then("^I see Useful Links header having different (.*)$")
    public void iSeeUsefulLinksHeaderHavingDifferentSubTabs(String strUsefulLinks) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyUsefulLinkHeadersUnderMyMessages(strUsefulLinks));

    }

    @When("^I see Useful Links header$")
    public void iSeeUsefulLinksHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyUsefulLinksUnderMyAccount());
    }

    @When("^I click on Sports Schedules$")
    public void iClickOnSportsSchedules() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSportsSchedulesUnderUsefulLinks());
    }

    @Then("^I see page gets redirected to Getting Started sub-tab under Sports tab$")
    public void iSeePageGetsRedirectedToGettingStartedSubTabUnderSportsTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifySportScheduleUnderUsefulLinks());
    }

    @And("^I see all the schedules$")
    public void iSeeAllTheSchedules() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifySchedulesUnderUsefulLinks());
    }

    @When("^I click on How To Bet Online$")
    public void iClickOnHowToBetOnline() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickHowToBetOnlineUnderUsefulLinks());
    }

    @Then("^I see page gets redirected to Getting Started$")
    public void iSeePageGetsRedirectedToGettingStarted() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyHowToBetOnlineUnderUsefulLinks());
    }

    @And("^I have to see all the help related options$")
    public void iHaveToSeeAllTheHelpRelatedOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyHelpOptionsUnderUsefulLinks());
    }

    @When("^I click on Affiliate Program$")
    public void iClickOnAffiliateProgram() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickAffiliateProgramUnderUsefulLinks());
    }

    @Then("^I see page gets redirected to https://www\\.commissionkings\\.ag/$")
    public void iSeePageGetsRedirectedToHttpsWwwCommissionkingsAg() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyRedirectedPagesUnderUsefulLinks());
    }


    @And("^I would see (.*)$")
    public void iWouldSeeOptions(String strSeeOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyOptionsUnderBetCalculator(strSeeOptions));
    }
//
//    @Given("^as a user, I am on the homepage$")
//    public void asAUserIAmOnTheHomepage() {
//
//    }
    
    
    // My Account Mobile Steps


    @Given("^as a User, I have already clicked on Left Navigator$")
    public void asAUserIHaveAlreadyClickedOnLeftNavigator() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());

    }

    @When("^I click on My Account under Left Navigator$")
    public void iClickOnMyAccountUnderLeftNavigator() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
    }

    @Then("^page should be redirected to My Account page with sub-tabs$")
    public void pageShouldBeRedirectedToMyAccountPageWithSubTabs(DataTable strHeaders) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSubTabsUnderMyAccountMobile(strHeaders));
    }

    @Given("^as a User, I have already clicked on My Account under Left Navigator$")
    public void asAUserIHaveAlreadyClickedOnMyAccountUnderLeftNavigator() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
    }

    @When("^I click on Profile sub-tab$")
    public void iClickOnProfileSubTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickProfitUnderMyAccountMobile());
    }

    @Then("^I see three (.*) with \\+ and - sign$")
    public void iSeeThreeHeadersWithAndSign(String strThreeHeaders) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyThreeHeaders(strThreeHeaders));
    }

    @And("^I see Customer Service link$")
    public void iSeeCustomerServiceLink() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyCustomerLinkUnderProfile());
    }

    @Given("^as a User, I have already clicked on Profile under My Account$")
    public void asAUserIHaveAlreadyClickedOnProfileUnderMyAccount() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickProfitUnderMyAccountMobile());
    }


    @Then("^I see Personal Information header expanded$")
    public void iSeePersonalInformationHeaderExpanded() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPersonalInformationHeaderUnderProfile());
    }


    @Given("^as a User, I have already see all the profile \\(User\\) information under Profile Information$")
    public void asAUserIHaveAlreadySeeAllTheProfileUserInformationUnderProfileInformation() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickProfitUnderMyAccountMobile());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickInformationUnderProfile());
    }


    @When("^I click on Personal Information  - sign$")
    public void iClickOnPersonalInformationSign() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickInformationMinus());
    }

    @And("^I see all the profile \\(User\\) information under Profile Information$")
    public void iSeeAllTheProfileUserInformationUnderProfileInformation() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyProfileInformationUnderProfile());

    }

    @When("^I click on Personal Information plus sign$")
    public void iClickOnPersonalInformationPlusSign() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickInformationUnderProfile());
    }

    @Then("^I see Personal Information header collapsed and all the information gets hidden$")
    public void iSeePersonalInformationHeaderCollapsedAndAllTheInformationGetsHidden() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyCollapsedProfileInformation());
    }


    @Then("^I see my default time zone$")
    public void iSeeMyDefaultTimeZone() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyDefaultTimeZoneUnderProfile());
    }

    @And("^I see Change in order to change my time zone$")
    public void iSeeChangeInOrderToChangeMyTimeZone() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickChangeTimeZoneUnderProfile());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickChoicesUnderTimeZone());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTimeZoneUnderProfile());
    }

    @Given("^as a User, I have already see my default time zone$")
    public void asAUserIHaveAlreadySeeMyDefaultTimeZone() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickProfitUnderMyAccountMobile());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickInformationUnderProfile());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTimeZoneUnderProfile());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyDefaultTimeZoneUnderProfile());
    }

    @When("^I click on Time Zone \\( - sign \\)$")
    public void iClickOnTimeZoneSign() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMinusUnderTimeZone());
    }

    @Then("^I see Time Zone header collapsed and time zone information gets hidden$")
    public void iSeeTimeZoneHeaderCollapsedAndTimeZoneInformationGetsHidden() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyCollapsedTimeZoneUnderProfile());
    }

    @When("^I click on Odds Type \\( \\+ sign \\)$")
    public void iClickOnOddsTypeSign() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickOddOnesUnderProfile());
    }

    @Then("^I see my default odds selected$")
    public void iSeeMyDefaultOddsSelected() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyDefaultOddsUnderProfile());
    }

    @And("^I see Change in order to change my odds$")
    public void iSeeChangeInOrderToChangeMyOdds() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickChangeOddOnesUnderProfile());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickChoicesUnderOddOnes());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyOdddOnesUnderProfile());
    }

    @When("^I click on Time Zone plus sign$")
    public void iClickOnTimeZonePlusSign() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTimeZoneUnderProfile());
    }

    @When("^I click on Odds Type minus sign$")
    public void iClickOnOddsTypeMinusSign() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMinusUnderOddOnes());
    }

    @Then("^I see Odds Type header collapsed and odds information gets hidden$")
    public void iSeeOddsTypeHeaderCollapsedAndOddsInformationGetsHidden() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyHiddenOnesUnderProfile());
    }

    @When("^I click on Customer Service$")
    public void iClickOnCustomerService() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickCustomerServiceUnderProfile());
    }

    @Then("^page is redirected to Contact Us page under Left Navigator$")
    public void pageIsRedirectedToContactUsPageUnderLeftNavigator() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyRedirectedPage());
    }

    @When("^I click on Payouts sub-tab$")
    public void iClickOnPayoutsSubTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPayOutsUnderMyAccount());
    }

    @Then("^I see page gets redirected to the Payouts \\(Withdrawal\\) page of payouts tab under Left Navigator$")
    public void iSeePageGetsRedirectedToThePayoutsWithdrawalPageOfPayoutsTabUnderLeftNavigator() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyRedirectedPageUnderPayouts());
    }



    @When("^I click on Deposits sub-tab$")
    public void iClickOnDepositsSubTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickDepositUnderMyAccountInMobile());
    }

    @Then("^I see page gets redirected to the Deposits page of Deposit tab under Left Navigator$")
    public void iSeePageGetsRedirectedToTheDepositsPageOfDepositTabUnderLeftNavigator() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyRedirectedPageUnderDeposit());
    }

    @And("^I should see all the deposit related options$")
    public void iShouldSeeAllTheDepositRelatedOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyDepositOptionsUnderDeposit());
    }

    @When("^I click on Refer My Friends$")
    public void iClickOnReferMyFriends() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReferMyFriendsUnderMyAccount());
    }

    @Then("^I have to see refer (.*)$")
    public void iHaveToSeeSubTabs(String subTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifySubTabsUnderReferMyFriend(subTabs));
    }

    @Given("^as a User, I have already clicked on Refer My Friends under My Account$")
    public void asAUserIHaveAlreadyClickedOnReferMyFriendsUnderMyAccount() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReferMyFriendsUnderMyAccount());

    }

    @When("^I click on Refer Friends$")
    public void iClickOnReferFriends() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickRefreshFriendsUnderReferMyFriends());
    }

    @Then("^I was given with  (.*)$")
    public void iWasGivenWithChoices(String strOptions1) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyChoicesUnderReferFriend(strOptions1));
    }


    @Given("^as a User, I have already clicked on Refer Friends$")
    public void asAUserIHaveAlreadyClickedOnReferFriends() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReferMyFriendsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickRefreshFriendsUnderReferMyFriends());
    }

    @And("^I was to see (.*) options$")
    public void iWasToSeeSharingOptions(String strSharingOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifySharingOptionsUnderReferFriend(strSharingOptions));
    }

    @Then("^I see a referral link being generated for that particular choice$")
    public void iSeeAReferralLinkBeingGeneratedForThatParticularChoice() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyReferralLink());
    }

    @When("^I  should click on Click here link$")
    public void iShouldClickOnClickHereLink() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickClickHereUnderReferFriend());
    }

    @Then("^I should watch a pop-up for confirmation with link to share$")
    public void iShouldWatchAPopUpForConfirmationWithLinkToShare() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPopUpUnderReferFriend());
    }

    @When("^I click on any of the social media \\(icon\\)$")
    public void iClickOnAnyOfTheSocialMediaIcon() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSocialMediaIconUnderReferFriend());
    }

    @Then("^I should watch a pop-up to Login and share$")
    public void iShouldWatchAPopUpToLoginAndShare() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPopUpSocialMediaUnderReferFriend());
    }


    @And("^I  will enter First Name, Last Name and email$")
    public void iWillEnterFirstNameLastNameAndEmail(DataTable strUserPassword) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.enterValueUnderReferFriend(strUserPassword));
    }

    @When("^I  should click on Submit$")
    public void iShouldClickOnSubmit() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSubmitButtonUnderReferFriend());
    }

    @Then("^I spectate a redirected page with referral successful or denied message$")
    public void iSpectateARedirectedPageWithReferralSuccessfulOrDeniedMessage() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyRedirectedPageUnderReferFriend());
    }

    @And("^I should click on Add from Address Book$")
    public void iShouldClickOnAddFromAddressBook() {
        SportsBettingPageContainer.sbmyaccountpage.clickAddressBookUnderReferFriend();
    }

    @When("^I have to select any choice from among the choices under pop-up$")
    public void iHaveToSelectAnyChoiceFromAmongTheChoicesUnderPopUp() {
        SportsBettingPageContainer.sbmyaccountpage.clickAnyChoiceUnderReferFriend();
    }

    @Then("^I was landed with option as per the selected choice$")
    public void iWasLandedWithOptionAsPerTheSelectedChoice() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifySelectedChoicesUnderReferFriend());
    }

    @When("^I want to click on View My Referrals$")
    public void iWantToClickOnViewMyReferrals() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickViewReferralsUnderReferFriend());
    }

    @Then("^I have to shown with all the details related to the past referrals$")
    public void iHaveToShownWithAllTheDetailsRelatedToThePastReferrals() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPastReferralsUnderReferMyFriend());
    }

    @When("^I has to click on Reports$")
    public void iHasToClickOnReports() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReportsUnderMyAccount());
    }

    @Then("^I has to see (.*)$")
    public void iHasToSeeSubTabs(String strReports) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifySubTabsUnderReports(strReports));
    }

    @Given("^as a User, I have already clicked Reports under My Account$")
    public void asAUserIHaveAlreadyClickedReportsUnderMyAccount() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReportsUnderMyAccount());

    }

    @When("^I will click on Pending Wagers$")
    public void iWillClickOnPendingWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPendingWagersUnderReports());
    }

    @Then("^I want to see a redirected page options$")
    public void iWantToSeeARedirectedPageOptions(DataTable strPendingWager) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.seeRedirectedPageUnderPendingWager(strPendingWager));
    }

    @Given("^as a User, I have already clicked on Pending Wagers$")
    public void asAUserIHaveAlreadyClickedOnPendingWagers() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReportsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPendingWagersUnderReports());
    }

    @When("^I has to  click on twentyFour hours under Pending Wagers$")
    public void iHasToClickOnTwentyFourHoursUnderPendingWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTwentyFourUnderPendingWager());
    }


    @Then("^I am shown with all the Pending Wagers from under twentyfour hours duration$")
    public void iAmShownWithAllThePendingWagersFromUnderTwentyfourHoursDuration() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTwentyFourUnderPendingWager());
    }

    @When("^I click on fourty eight hours under Pending Wagers$")
    public void iClickOnFourtyEightHoursUnderPendingWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickFourtyEightUnderPendingWager());
    }

    @Then("^I am shown with all the Pending Wagers from under fourty eight hours duration$")
    public void iAmShownWithAllThePendingWagersFromUnderFourtyEightHoursDuration() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyFourtyEightUnderReports());
    }

    @When("^I click on All under Pending Wagers$")
    public void iClickOnAllUnderPendingWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickAllUnderReports());
    }

    @Then("^I am shown with all the Pending Wagers from the very beginning$")
    public void iAmShownWithAllThePendingWagersFromTheVeryBeginning() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyAllTabsUnderReports());
    }

    @Given("^as a User, I already see Pending Wagers page$")
    public void asAUserIAlreadySeePendingWagersPage() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReportsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPendingWagersUnderReports());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickAllUnderReports());
    }

    @And("^I see Ticket Number expands showing all the Wagers$")
    public void iSeeTicketNumberExpandsShowingAllTheWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.TicketExpandsUnderPendingWager());
    }

    @And("^I click on any ticket number from under TICKET header of any time-option$")
    public void iClickOnAnyTicketNumberFromUnderTICKETHeaderOfAnyTimeOption() {
//        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickFourtyEightUnderPendingWager());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTicketNumberExpandsUnderPendingWager());
    }

    @When("^I click on Wagers$")
    public void iClickOnWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickWagerUnderPendingWager());
    }

    @Then("^I see all the details related to the selected ticket and wager number$")
    public void iSeeAllTheDetailsRelatedToTheSelectedTicketAndWagerNumber() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.VerifyAllDetailsUnderTicket());
    }

    @When("^I click on Graded Wagers$")
    public void iClickOnGradedWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickGradedWagerUnderReports());
    }

    @Then("^I had to see a redirected page (.*)$")
    public void iHadToSeeARedirectedPageOptions(String strGradedWager) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickGradedWagerUnderReports(strGradedWager));

    }

    @Given("^as a User, I have already clicked on Graded Wagers$")
    public void asAUserIHaveAlreadyClickedOnGradedWagers() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReportsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickGradedWagerUnderReports());
    }

    @When("^I click on twenty four hours under Graded Wagers$")
    public void iClickOnTwentyFourHoursUnderGradedWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTwentyFourUnderGradedWager());
    }

    @Then("^I am shown with all the Graded Wagers from under twenty four hours duration$")
    public void iAmShownWithAllTheGradedWagersFromUnderTwentyFourHoursDuration() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTwentyFourUnderPendingWager());
    }

    @When("^I click on fourty eight hours under Graded Wagers$")
    public void iClickOnFourtyEightHoursUnderGradedWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickFourtyEightUnderPendingWager());
    }

    @Then("^I am shown with all the Graded Wagers from under fourty eight hours duration$")
    public void iAmShownWithAllTheGradedWagersFromUnderFourtyEightHoursDuration() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTwentyFourUnderPendingWager());
    }

    @And("^I wil select any start and end date under Select range$")
    public void iWilSelectAnyStartAndEndDateUnderSelectRange() {

        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.selectStartDateAndEndDateUnderGradedWager());
    }

    @And("^I had to select a redirected page select range$")
    public void iHadToSelectARedirectedPageSelectRange() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSelectRange());
    }

    @When("^I should be clicking on Submit$")
    public void iShouldBeClickingOnSubmit() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSubmitUnderReports());
    }

    @Then("^I am shown with all the Graded Wagers for the selected time range$")
    public void iAmShownWithAllTheGradedWagersForTheSelectedTimeRange() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyLandedGradedWagerUnderReports());
    }

    @And("^I will click on any ticket number from under TICKET header of any time-option$")
    public void iWillClickOnAnyTicketNumberFromUnderTICKETHeaderOfAnyTimeOption() {

        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSelectRange());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.selectStartDateAndEndDateUnderGradedWager());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSubmitUnderReports());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTicketNumberExpandsUnderPendingWager());
    }

    @And("^I want to watch Ticket Number expands showing all the Wagers$")
    public void iWantToWatchTicketNumberExpandsShowingAllTheWagers() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTicketUnderReports());
    }

    @When("^I click on Wagers \\(if collapsed\\)$")
    public void iClickOnWagersIfCollapsed() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTicketExpandUnderGradedWager());
    }

    @When("^I clicking on Wagers \\(if collapsed\\)$")
    public void iClickingOnWagersIfCollapsed() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickWagerUnderReports());
    }

    @Then("^I  have to watch all the details related to the selected ticket and wager number$")
    public void iHaveToWatchAllTheDetailsRelatedToTheSelectedTicketAndWagerNumber() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.VerifyAllDetailsUnderTicket());
    }

    @When("^I click on All Transactions$")
    public void iClickOnAllTransactions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickAllTransactionsUnderReports());
    }

    @Then("^I see a redirected page under all Transactions options$")
    public void iSeeARedirectedPageUnderAllTransactionsOptions(DataTable strPendingWager) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.seeRedirectedPageUnderPendingWager(strPendingWager));
    }

    @Given("^as a User, I have already clicked on All Transactions$")
    public void asAUserIHaveAlreadyClickedOnAllTransactions() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReportsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickAllTransactionsUnderReports());
    }

    @When("^I click on twenty four hours under All Transactions$")
    public void iClickOnTwentyFourHoursUnderAllTransactions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTwentyFourUnderPendingWager());
    }


    @Then("^I am shown with all the transactions under twenty hours duration$")
    public void iAmShownWithAllTheTransactionsUnderTwentyHoursDuration() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTwentyFourUnderAllTransactions());
    }

    @When("^I click on fourty eight under All Transactions$")
    public void iClickOnFourtyEightUnderAllTransactions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickFourtyEightUnderPendingWager());
    }

    @Then("^I am shown with all the transactions under under fourty eight hours duration$")
    public void iAmShownWithAllTheTransactionsUnderUnderFourtyEightHoursDuration() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTwentyFourUnderAllTransactions());
    }

    @And("^I had to select a redirected page select range under All Transactions$")
    public void iHadToSelectARedirectedPageSelectRangeUnderAllTransactions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSelectRange());

    }

    @And("^I want to select All transactions any start and end date under Select range$")
    public void iWantToSelectAllTransactionsAnyStartAndEndDateUnderSelectRange() {

        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.selectStartDateAndEndDateUnderGradedWager());
    }

    @Then("^I am shown with all the the transactions under for the selected time range$")
    public void iAmShownWithAllTheTheTransactionsUnderForTheSelectedTimeRange() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyLandedGradedWagerUnderReports());

    }

    @When("^I click on Submit under All Transactions$")
    public void iClickOnSubmitUnderAllTransactions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSubmitUnderReports());
    }

    @When("^I click on Daily Figures$")
    public void iClickOnDailyFigures() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickDailyFiguresUnderAllTransaction());
    }

    @Then("^I had to watch a redirected page  (.*)$")
    public void iHadToWatchARedirectedPageOptions(String strPendingWager) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyRedirectedPageUnderReports(strPendingWager));
    }

    @Given("^as a User, I have already clicked Daily Figures under Reports$")
    public void asAUserIHaveAlreadyClickedDailyFiguresUnderReports() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReportsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickDailyFiguresUnderAllTransaction());

    }

    @When("^I click on Current Week's$")
    public void iClickOnCurrentWeekS() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickCurrentWeekUnderReports());
    }

    @Then("^I will spectate a redirected page day-selector$")
    public void iWillSpectateARedirectedPageDaySelector(DataTable strPendingWager) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.seeRedirectedPageUnderPendingWager(strPendingWager));

    }

    @Given("^as a User, I already see all the days under Current Week's$")
    public void asAUserIAlreadySeeAllTheDaysUnderCurrentWeekS() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReportsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickDailyFiguresUnderAllTransaction());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickCurrentWeekUnderReports());
    }

    @When("^I click on any day under current week$")
    public void iClickOnAnyDayUnderCurrentWeek() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickCurrentDayUnderReports());
    }

    @Then("^I see all the daily figures related transaction for Current Week \\(if any\\)$")
    public void iSeeAllTheDailyFiguresRelatedTransactionForCurrentWeekIfAny() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyDailyFiguresUnderCurrentWeek());
    }


    @When("^I click on Last Week's$")
    public void iClickOnLastWeekS() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLastWeeksUnderDailyReports());
    }

    @Then("^I will watch a redirected page day-selector$")
    public void iWillWatchARedirectedPageDaySelector(DataTable strPendingWager) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.seeRedirectedPageUnderPendingWager(strPendingWager));
    }

    @Given("^as a User, I already see all the days under Last Week's$")
    public void asAUserIAlreadySeeAllTheDaysUnderLastWeekS() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReportsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickDailyFiguresUnderAllTransaction());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLastWeeksUnderDailyReports());

    }

    @When("^I click on any day Under Last Week$")
    public void iClickOnAnyDayUnderLastWeek() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickCurrentDayUnderReports());
    }

    @Then("^I see all the daily figures related transaction for Last Week \\(if any\\)$")
    public void iSeeAllTheDailyFiguresRelatedTransactionForLastWeekIfAny() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyDailyFiguresUnderCurrentWeek());
    }

    @When("^I click on Promotions$")
    public void iClickOnPromotions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPromotionsUnderMyAccount());
    }

    @Then("^I want to see different (.*)$")
    public void iwanttoSeeDifferentPromotionalOptions(String strOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPromotionalOptionsUnderPromotions(strOptions));
    }

    @Given("^as a User, I have already clicked on Promotions$")
    public void asAUserIHaveAlreadyClickedOnPromotions() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPromotionsUnderMyAccount());
    }

    @And("^I click on fifty percent Sports Welcome Bonus$")
    public void iClickOnFiftyPercentSportsWelcomeBonus() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickFiftyPercentUnderPromotions());
    }

    @And("^I see promo code for the selected option with Terms and Conditions$")
    public void iSeePromoCodeForTheSelectedOptionWithTermsAndConditions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPromoCodesUnderPromotions());
    }

    @Then("^I am shown with all the the terms and conditions related to the selected promotion choice$")
    public void iAmShownWithAllTheTheTermsAndConditionsRelatedToTheSelectedPromotionChoice() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTermsAndConditions());
    }


    @When("^I will be clicking on Terms and Conditions$")
    public void iWillBeClickingOnTermsAndConditions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTermsAndConditionsUnderPromotions());
    }

    @And("^I click on \\$twentyFive Rish-Free Props Bet$")
    public void iClickOn$twentyFiveRishFreePropsBet() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTwentyFiveDollarsUnderPromotion());
    }

    @And("^I see promo code for the selected option with Terms and Conditions under Rish Free$")
    public void iSeePromoCodeForTheSelectedOptionWithTermsAndConditionsUnderRishFree() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPromoCodesUnderPromotions());
    }

    @When("^I click on Terms and Conditions under Rish Free$")
    public void iClickOnTermsAndConditionsUnderRishFree() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTermsAndConditionsUnderPromotions());
    }

    @Then("^I am shown with all the the terms and conditions related to the selected promotion choice under Rish Free$")
    public void iAmShownWithAllTheTheTermsAndConditionsRelatedToTheSelectedPromotionChoiceUnderRishFree() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTermsAndConditions());
    }

    @And("^I click on \\$Fifty Mobile Betting Free Play$")
    public void iClickOn$FiftyMobileBettingFreePlay() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMobileBettingUnderPromotions());
    }

    @And("^I see promo code for the selected option with Terms and Conditions under Mobile betting$")
    public void iSeePromoCodeForTheSelectedOptionWithTermsAndConditionsUnderMobileBetting() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPromoCodesUnderPromotions());
    }

    @When("^I click on Terms and Conditions under Mobile betting$")
    public void iClickOnTermsAndConditionsUnderMobileBetting() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTermsAndConditionsUnderPromotions());
    }

    @Then("^I am shown with all the the terms and conditions related to the selected promotion choice under Mobile betting$")
    public void iAmShownWithAllTheTheTermsAndConditionsRelatedToTheSelectedPromotionChoiceUnderMobileBetting() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTermsAndConditions());
    }

    @Then("^I am shown with all the the terms and conditions related to the selected promotion choice under Live in  Game$")
    public void iAmShownWithAllTheTheTermsAndConditionsRelatedToTheSelectedPromotionChoiceUnderLiveInGame() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTermsAndConditions());
    }

    @And("^I see promo code for the selected option with Terms and Conditions under Live in  Game$")
    public void iSeePromoCodeForTheSelectedOptionWithTermsAndConditionsUnderLiveInGame() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPromoCodesUnderPromotions());
    }


    @When("^I click on Terms and Conditions under Live in  Game$")
    public void iClickOnTermsAndConditionsUnderLiveInGame() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTermsAndConditionsUnderPromotions());
    }

    @And("^I click on \\$Twenty Five Live In-Game Betting Free Play$")
    public void iClickOn$TwentyFiveLiveInGameBettingFreePlay() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLiveInBettingUnderPromotions());
    }

    @And("^I click on seven percent Horse Rebate$")
    public void iClickOnSevenPercentHorseRebate() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickHorseDebateUnderPromotions());
    }

    @And("^I see promo code for the selected option with Terms and Conditions under Horse Debate$")
    public void iSeePromoCodeForTheSelectedOptionWithTermsAndConditionsUnderHorseDebate() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPromoCodesUnderPromotions());
    }

    @When("^I click on Terms and Conditions under Horse Debate$")
    public void iClickOnTermsAndConditionsUnderHorseDebate() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTermsAndConditionsUnderPromotions());
    }

    @Then("^I am shown with all the the terms and conditions related to the selected promotion choice under Horse Debate$")
    public void iAmShownWithAllTheTheTermsAndConditionsRelatedToTheSelectedPromotionChoiceUnderHorseDebate() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTermsAndConditions());
    }

    @When("^I click on Refer-a-Friend Under Promotions$")
    public void iClickOnReferAFriendUnderPromotions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReferAFriendUnderPromotions());
    }

    @Then("^I see Refer a Friend Now and Terms and Conditions$")
    public void iSeeReferAFriendNowAndTermsAndConditions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyReferAFriendUnderPromotions());
    }

    @Given("^as a User, I have already clicked on Refer-a-Friend in mobile$")
    public void asAUserIHaveAlreadyClickedOnReferAFriendInMobile() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPromotionsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReferAFriendUnderPromotions());
    }

    @When("^I click on Refer a Friend Now$")
    public void iClickOnReferAFriendNow() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReferAFriendNowUnderPromotions());
    }

    @Then("^I see a redirected page with all the referral related instructions$")
    public void iSeeARedirectedPageWithAllTheReferralRelatedInstructions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyRedirectedPageUnderReferral());
    }

    @And("^I see REFER NOW button$")
    public void iSeeREFERNOWButton() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyReferNowButtonUnderReferral());
    }

    @Given("^as a User, I already see all the instructions related to Refer Friends$")
    public void asAUserIAlreadySeeAllTheInstructionsRelatedToReferFriends() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPromotionsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReferAFriendUnderPromotions());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReferAFriendNowUnderPromotions());
    }

    @When("^I click on REFER NOW under myaccount$")
    public void iClickOnREFERNOW() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReferNowUnderPromotions());
    }

    @Then("^I see the page gets redirected to Refer My Friends under My Account$")
    public void iSeeThePageGetsRedirectedToReferMyFriendsUnderMyAccount() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyRedirectedPageUnderPromotions());
    }

    @And("^I click on \\$Hundred thousand guaranteed Under promotions$")
    public void iClickOn$HundredThousandGuaranteedUnderPromotions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMoneyGuaranteedUnderPromotions());
    }

    @Then("^I see play Now Button$")
    public void iSeePlayNowButton() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPlayNowUnderMoneyGuaranteed());

    }

    @And("^I click on LearnMore$")
    public void iClickOnLearnMore() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLearnMoreUnderPromotions());
    }

    @When("^I see a redirected page with all the money guaranteed instructions$")
    public void iSeeARedirectedPageWithAllTheMoneyGuaranteedInstructions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPageUnderMoneyGuaranteed());
    }

    @Given("^as a User, I already see all the instructions related to money guaranteed$")
    public void asAUserIAlreadySeeAllTheInstructionsRelatedToMoneyGuaranteed() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPromotionsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMoneyGuaranteedUnderPromotions());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLearnMoreUnderPromotions());
    }

    @When("^I click on PLAY NOW$")
    public void iClickOnPLAYNOW() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPlayNowUnderMoneyGuaranteed());
    }

    @When("^I click on Terms and Conditions under Money Guaranteed$")
    public void iClickOnTermsAndConditionsUnderMoneyGuaranteed() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTermsAndConditionsUnderMoneyGuaranteed());
    }


    @Then("^I see the page gets redirected to page under My Account$")
    public void iSeeThePageGetsRedirectedToPageUnderMyAccount() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPlayNowPageUnderPromotions());
    }

    @Then("^I see refreshed page with all the terms and conditions related to \\$ hundred K GUARANTEED$")
    public void iSeeRefreshedPageWithAllTheTermsAndConditionsRelatedTo$HundredKGUARANTEED() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.VerifyTermsAndConditionsUnderMoneyGuaranteed());
    }

    @When("^I see a redirected page with all the Under Cash race instructions$")
    public void iSeeARedirectedPageWithAllTheUnderCashRaceInstructions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPageUnderMoneyGuaranteed());
    }

    @And("^I click on \\$ten thousand weekly cash race Under promotions$")
    public void iClickOn$tenThousandWeeklyCashRaceUnderPromotions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickWeeklyCashRaceUnderPromotions());
    }

    @And("^I click on LearnMore Under Cash race$")
    public void iClickOnLearnMoreUnderCashRace() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLearnMoreUnderPromotions());
    }

    @Then("^I see play Now Button Under Cash race$")
    public void iSeePlayNowButtonUnderCashRace() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPlayNowUnderMoneyGuaranteed());
    }

    @Given("^as a User, I already see all the instructions related to Cash race$")
    public void asAUserIAlreadySeeAllTheInstructionsRelatedToCashRace() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPromotionsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickWeeklyCashRaceUnderPromotions());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLearnMoreUnderPromotions());
    }

    @When("^I click on PLAY NOW Under Cash race$")
    public void iClickOnPLAYNOWUnderCashRace() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPlayNowUnderMoneyGuaranteed());
    }


    @Then("^I see the page gets redirected to  Cash race under My Account$")
    public void iSeeThePageGetsRedirectedToCashRaceUnderMyAccount() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPlayNowPageUnderPromotions());
    }

    @When("^I click on Terms and Conditions under Under Cash race$")
    public void iClickOnTermsAndConditionsUnderUnderCashRace() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTermsAndConditionsUnderMoneyGuaranteed());
    }

    @Then("^I see refreshed page with all the terms and conditions related to Under Cash race$")
    public void iSeeRefreshedPageWithAllTheTermsAndConditionsRelatedToUnderCashRace() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.VerifyTermsAndConditionsUnderMoneyGuaranteed());
    }

    @And("^I click on \\$ five thousand weekly sit and go leaderboard Under promotions$")
    public void iClickOn$FiveThousandWeeklySitAndGoLeaderboardUnderPromotions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickThousandWeeklySitAndGoLeaderBoard());
    }

    @And("^I click on LearnMore under weekly sit and go leaderboard$")
    public void iClickOnLearnMoreUnderWeeklySitAndGoLeaderboard() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLearnMoreUnderPromotions());
    }

    @When("^I see a redirected page with all weekly sit and go leaderboard instructions$")
    public void iSeeARedirectedPageWithAllWeeklySitAndGoLeaderboardInstructions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPageUnderMoneyGuaranteed());
    }

    @Then("^I see play Now Button under weekly sit and go leaderboard$")
    public void iSeePlayNowButtonUnderWeeklySitAndGoLeaderboard() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPlayNowUnderMoneyGuaranteed());
    }

    @Given("^as a User, I already see all the instructions related to weekly sit and go leader board$")
    public void asAUserIAlreadySeeAllTheInstructionsRelatedToWeeklySitAndGoLeaderBoard() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPromotionsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickThousandWeeklySitAndGoLeaderBoard());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLearnMoreUnderPromotions());
    }

    @Then("^I see the page gets redirected to  weekly sit and go leaderboard under My Account$")
    public void iSeeThePageGetsRedirectedToWeeklySitAndGoLeaderboardUnderMyAccount() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPlayNowPageUnderPromotions());
    }

    @When("^I click on PLAY NOW under weekly sit and go leaderboard$")
    public void iClickOnPLAYNOWUnderWeeklySitAndGoLeaderboard() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPlayNowUnderMoneyGuaranteed());
    }

    @When("^I click on Terms and Conditions under weekly sit and go leaderboard$")
    public void iClickOnTermsAndConditionsUnderWeeklySitAndGoLeaderboard() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTermsAndConditionsUnderWeeklySitAndGo());
    }

    @Then("^I see refreshed page with all the terms  and conditions related to under weekly sit and go leaderboard$")
    public void iSeeRefreshedPageWithAllTheTermsAndConditionsRelatedToUnderWeeklySitAndGoLeaderboard() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.VerifyTermsAndConditionsUnderMoneyGuaranteed());
    }

    @And("^I click on twenty percent monthly Reload Bonus Under promotions$")
    public void iClickOnTwentyPercentMonthlyReloadBonusUnderPromotions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMonthlyReloadBonus());
    }

    @And("^I click on LearnMore under  monthly Reload Bonus$")
    public void iClickOnLearnMoreUnderMonthlyReloadBonus() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLearnMoreUnderPromotions());
    }

    @When("^I see a redirected page with all monthly Reload Bonus instructions$")
    public void iSeeARedirectedPageWithAllMonthlyReloadBonusInstructions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPageUnderMoneyGuaranteed());
    }

    @Then("^I see play Now Button under monthly Reload Bonus$")
    public void iSeePlayNowButtonUnderMonthlyReloadBonus() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPlayNowUnderMoneyGuaranteed());
    }

    @Then("^I see the page gets redirected to  monthly Reload Bonus under My Account$")
    public void iSeeThePageGetsRedirectedToMonthlyReloadBonusUnderMyAccount() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPageUnderMonthlyRebate());
    }

    @Given("^as a User, I already see all the instructions related to monthlyReload Bonus$")
    public void asAUserIAlreadySeeAllTheInstructionsRelatedToMonthlyReloadBonus() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPromotionsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMonthlyReloadBonus());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLearnMoreUnderPromotions());
    }

    @When("^I click on PLAY NOW under monthly Reload Bonus$")
    public void iClickOnPLAYNOWUnderMonthlyReloadBonus() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPlayNowUnderMoneyGuaranteed());
    }

    @When("^I click on Terms and Conditions under monthly Reload Bonus$")
    public void iClickOnTermsAndConditionsUnderMonthlyReloadBonus() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTermsAndConditionsUnderMoneyGuaranteed());
    }

    @Then("^I see refreshed page with all the terms and conditions related to under monthly Reload Bonus$")
    public void iSeeRefreshedPageWithAllTheTermsAndConditionsRelatedToUnderMonthlyReloadBonus() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.VerifyTermsAndConditionsUnderMoneyGuaranteed());
    }


    @Then("^I see play Now Button under weekly casino rebate$")
    public void iSeePlayNowButtonUnderWeeklyCasinoRebate() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPlayNowUnderCasinoRebate());
    }

    @And("^I click on ten percent weekly casino rebate Under promotions$")
    public void iClickOnTenPercentWeeklyCasinoRebateUnderPromotions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickWeeklyCasinoRebateUnderPromotions());
    }

    @And("^I click on LearnMore under  weekly casino rebate$")
    public void iClickOnLearnMoreUnderWeeklyCasinoRebate() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLearnMoreUnderPromotions());
    }

    @When("^I see a redirected page with all weekly casino rebate instructions$")
    public void iSeeARedirectedPageWithAllWeeklyCasinoRebateInstructions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPageUnderMoneyGuaranteed());
    }

    @When("^I click on PLAY NOW under weekly casino rebate$")
    public void iClickOnPLAYNOWUnderWeeklyCasinoRebate() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPlayNowUnderCasinoRebate());
    }

    @Given("^as a User, I already see all the instructions related to weekly casino rebate$")
    public void asAUserIAlreadySeeAllTheInstructionsRelatedToWeeklyCasinoRebate() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPromotionsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickWeeklyCasinoRebateUnderPromotions());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLearnMoreUnderPromotions());
    }
    @Then("^I see the page gets redirected to weekly casino rebate under My Account$")
    public void iSeeThePageGetsRedirectedToWeeklyCasinoRebateUnderMyAccount() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPageUnderCasinoRebate());
    }

    @When("^I click on Terms and Conditions under weekly casino rebate$")
    public void iClickOnTermsAndConditionsUnderWeeklyCasinoRebate() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTermsAndConditionsUnderMoneyGuaranteed());
    }

    @Then("^I see refreshed page with all the terms and conditions related to under weekly casino rebate$")
    public void iSeeRefreshedPageWithAllTheTermsAndConditionsRelatedToUnderWeeklyCasinoRebate() {

    }

    @And("^I click on hundred thousand dollars casino iron man contest Under promotions$")
    public void iClickOnHundredThousandDollarsCasinoIronManContestUnderPromotions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.VerifyTermsAndConditionsUnderMoneyGuaranteed());;
    }

    @And("^I click on LearnMore under casino iron man contest$")
    public void iClickOnLearnMoreUnderCasinoIronManContest() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLearnMoreUnderPromotions());
    }

    @When("^I see a redirected page with all casino iron man contest  instructions$")
    public void iSeeARedirectedPageWithAllCasinoIronManContestInstructions() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPageUnderMoneyGuaranteed());
    }

    @Then("^I see play Now Button under casino iron man contest$")
    public void iSeePlayNowButtonUnderCasinoIronManContest() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPlayNowUnderMoneyGuaranteed());
    }

    @When("^I click on PLAY NOW under casino iron man contest$")
    public void iClickOnPLAYNOWUnderCasinoIronManContest() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPlayNowUnderMoneyGuaranteed());
    }

    @Given("^as a User, I already see all the instructions related casino iron man contest$")
    public void asAUserIAlreadySeeAllTheInstructionsRelatedCasinoIronManContest() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPromotionsUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickIronManContestUnderPromotions());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLearnMoreUnderPromotions());
    }

    @Then("^I see the page gets redirected to casino iron man contest  under My Account$")
    public void iSeeThePageGetsRedirectedToCasinoIronManContestUnderMyAccount() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPlayNowPageUnderIronManContest());
    }

    @When("^I click on Terms and Conditions under casino iron man contest$")
    public void iClickOnTermsAndConditionsUnderCasinoIronManContest() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTermsAndConditionsUnderMoneyGuaranteed());
    }

    @Then("^I see refreshed page with all the terms and conditions related to under casino iron man contest$")
    public void iSeeRefreshedPageWithAllTheTermsAndConditionsRelatedToUnderCasinoIronManContest() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.VerifyTermsAndConditionsUnderMoneyGuaranteed());
    }

    @When("^I click on My Messages under My Account$")
    public void iClickOnMyMessagesUnderMyAccount() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyMessagesUnderMyAccount());
    }

    @Then("^I see My Messages (.*)$")
    public void iSeeMyMessagesHeaders(String strMessages) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyMyMessageHeaderUnderPromotions(strMessages));
    }

    @Given("^as a User, I have already clicked on My Messages under My Account$")
    public void asAUserIHaveAlreadyClickedOnMyMessagesUnderMyAccount() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyMessagesUnderMyAccount());
    }

    @When("^I click on Compose a new message \\(if in collapsed state\\)$")
    public void iClickOnComposeANewMessageIfInCollapsedState() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickComposeMessageUnderMyMessages());
    }

    @Then("^I see a dropdown to select a subject, message field$")
    public void iSeeADropdownToSelectASubjectMessageField() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyDropdownAndMessageFieldUnderMyAccount());
//        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyMessagesButtonUnderMyComposeMessage(strComposeMessage));
    }

    @And("^I will see two compose Message (.*)$")
    public void iwillSeeTwoComposeMessageMessageButtons(String strComposeMessage) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyMessagesButtonUnderMyComposeMessage(strComposeMessage));
    }


    @And("^I would select any (.*) from Subject dropdown$")
    public void iWouldSelectAnyOptionsFromSubjectDropdown(String strComposeMessagesOption) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMessageOptionUnderMyMessages(strComposeMessagesOption));

    }

    @And("^I enter any message in message field$")
    public void iEnterAnyMessageInMessageField() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.enterMessageUnderComposeMessage());

    }

    @Given("^as a User, I already see all the compose message fields and dropdown$")
    public void asAUserIAlreadySeeAllTheComposeMessageFieldsAndDropdown() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyMessagesUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickComposeMessageUnderMyMessages());
    }

    @When("^I click on Send button$")
    public void iClickOnSendButton() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSendButtonUnderMyMessages());
    }

    @Then("^I see that message has is uploaded and displayed under Your messages History$")
    public void iSeeThatMessageHasIsUploadedAndDisplayedUnderYourMessagesHistory() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifySendMessageUnderComposeMessage());
    }

    @When("^I click on Cancel in mobile$")
    public void iClickOnCancelInMobile() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickCancelButtonUnderComposeMessage());
    }

    @Then("^I see that message has been deleted$")
    public void iSeeThatMessageHasBeenDeleted() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyDeletedMessageUnderMyMessage());
    }

    @And("^I see fresh fields to write a message$")
    public void iSeeFreshFieldsToWriteAMessage() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyFreshFieldUnderMyMessage());
    }

    @When("^I click on Your messages History \\(if in collapsed state\\)$")
    public void iClickOnYourMessagesHistoryIfInCollapsedState() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMessageHistoryUnderMyMessages());
    }

    @Then("^I see all the messages posted by user with Message\\(s\\) details$")
    public void iSeeAllTheMessagesPostedByUserWithMessageSDetails() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyAllMessagesUnderMessageHistory());
    }

    @And("^I see two (.*)$")
    public void iSeeTwoMessageButtons(String strMessageButton) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyTwoMessageButtonUnderMyMessages(strMessageButton));
    }

    @Given("^as a User, I already see all the message\\(s\\) under Your messages History$")
    public void asAUserIAlreadySeeAllTheMessageSUnderYourMessagesHistory() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyMessagesUnderMyAccount());
    }

    @When("^I click on Message\\(s\\) details$")
    public void iClickOnMessageSDetails() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.ClickMessageDetailsUnderComposeMessage());
    }

    @Then("^I see date, time and messages from admin \\(if any\\)$")
    public void iSeeDateTimeAndMessagesFromAdminIfAny() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyDateAndTimeOfAdminUnderMessageDetails());
    }

    @And("^I see a Reply header$")
    public void iSeeAReplyHeader() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifySeeReplyHeaderUnderMessageDetails());
    }

    @Given("^as a User, I already see Reply header in collapsed state$")
    public void asAUserIAlreadySeeReplyHeaderInCollapsedState() {
//        SportsBettingPageContainer.signUpPage.launchPTYURL();
//        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
//        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
//        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
//        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyMessagesUnderMyAccount());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifySeeReplyHeaderUnderMessageDetails());
    }

    @When("^I click on Reply$")
    public void iClickOnReply() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickReplyUnderMyMessages());
    }

    @Then("^I see message field, send and cancel buttons$")
    public void iSeeMessageFieldSendAndCancelButtons() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyMessageFieldUnderMyMessages());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyMessagesButtonUnderMyReply());
    }

    @When("^I click on Next$")
    public void iClickOnNext() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickOnNextUnderMyMessages());
    }

    @Then("^I see new messages being displayed relatively old to the one I see for now$")
    public void iSeeNewMessagesBeingDisplayedRelativelyOldToTheOneISeeForNow() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyNewMessageUnderMyMessages());
    }

    @Given("^as a User, I have already clicked on$")
    public void asAUserIHaveAlreadyClickedOn() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickLeftNavigatorUnderHomePage());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyAccountTab());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickMyMessagesUnderMyAccount());
        SportsBettingPageContainer.sbmyaccountpage.clickComposeMessage();
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickOnNextUnderMyMessages());
    }

    @When("^I click on Previous$")
    public void iClickOnPrevious() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickPreviousUnderMyMessages());
    }

    @Then("^I see new messages being displayed relatively new to the one I see for now$")
    public void iSeeNewMessagesBeingDisplayedRelativelyNewToTheOneISeeForNow() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyNewMessageUnderMyMessage());
    }

    @And("^I shall see all the (.*)$")
    public void iShallSeeAllTheWithdrawalRelatedOptions(String strWithDrawalOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyWithDrawlOptionsUnderPayouts(strWithDrawalOptions));
    }

    @When("^I click on OPT IN under casino iron man contest$")
    public void iClickOnOPTINUnderCasinoIronManContest() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickOptinUnderIronmanContest());
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickTextFieldAreaUnderIronmanContest());
    }

    @When("^I click on Deposit NOW under monthly Reload Bonus$")
    public void iClickOnDepositNOWUnderMonthlyReloadBonus() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickDepositNowUnderPromotions());
    }

    @Then("^I see opt Button under casino iron man contest$")
    public void iSeeOptButtonUnderCasinoIronManContest() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyOtnButtonUnderIronManContest());
    }

    @Then("^I see Deposit Now Button under monthly Reload Bonus$")
    public void iSeeDepositNowButtonUnderMonthlyReloadBonus() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyDepositNowUnderMonthlyBonus());
    }

    @And("^i click a dropdown subject$")
    public void iClickADropdownSubject() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.clickSubjectDropDownUnderMyMessages());
    }

//    @Given("^as a User, I see all the details shown for that particular selection$")
//    public void asAUserISeeAllTheDetailsShownForThatParticularSelection() {
//        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyLinkUnderDailyFigures());
//    }
//
//    @Then("^I see all the details shown for that particular selection gets collapsed$")
//    public void iSeeAllTheDetailsShownForThatParticularSelectionGetsCollapsed() {
//        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyCurrentWeekUnderDailyFigures());
//    }

    @And("^I see several promotions available under Promotion of My Account page$")
    public void iSeeSeveralPromotionsAvailableUnderPromotionOfMyAccountPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbmyaccountpage.verifyPromotionsUnderMyAccount());
    }
}

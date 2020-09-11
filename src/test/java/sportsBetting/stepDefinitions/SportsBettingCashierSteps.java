package sportsBetting.stepDefinitions;

import cap.helpers.Constants;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by codoid-pc on 8/7/2019.
 */
public class SportsBettingCashierSteps {


    private sportsBetting.SportsBettingPageContainer SportsBettingPageContainer;
    private WebDriver driver;

    public SportsBettingCashierSteps(sportsBetting.SportsBettingPageContainer SportsBettingPageContainer) {
        this.SportsBettingPageContainer = SportsBettingPageContainer;
    }

    @When("^User navigates through the <Tabs>$")
    public void userNavigatesThroughTheTabs() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.clickCashierTab());
    }

    @And("^I click on Cashier tab$")
    public void iClickOnCashierTab() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.clickCashierTab());
    }

    @And("^I click Exit Cashier$")
    public void iClickExitCashier() {
        SportsBettingPageContainer.sbcashierpage.clickExitCashierButton();
    }

    /*@Then("^I should see the SportsBetting site homepage$")
    public void iShouldSeeTheSportsBettingSiteHomepage() {
        Assert.assertTrue(SportsBettingPageContainer.signUpPage.verifyPTYPage());
    }*/

    @When("^I click on View More Options$")
    public void iClickOnViewMoreOptions() {
        SportsBettingPageContainer.sbcashierpage.clickViewMoreOptionsLink();
    }

    @Then("^I should see the more deposit Options$")
    public void iShouldSeeTheMoreDepositOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyDepositOptions());
    }

    @When("^I click on Credit Card$")
    public void iClickOnCreditCard() {
        SportsBettingPageContainer.sbcashierpage.clickCreditCardLink();
    }

    @Then("^I should see the credit card page$")
    public void iShouldSeeTheCreditCardPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyCreditCardPage());
    }

    @When("^I click on Back button in Credit Card Page$")
    public void iClickOnBackButtonInCreditCardPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.clickOnBackButtonInCreditCardPage());
    }

    @When("^I click on Withdrawal$")
    public void iClickOnWithdrawal() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.clickOnWithdrawalLink());
    }

    @Then("^I should see the Payout Page$")
    public void iShouldSeeThePayoutPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyWithDrawlRequestPage());
    }

    @When("^I click Request New Icon in Withdrawal options$")
    public void iClickRequestNewIconInWithdrawalOptions() {

        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.clickOnWithdrawalLink());
        // SportsBettingPageContainer.sbcashierpage.clickRequestNewIconInWithdrawlOptions();
    }

    @Then("^I should be shown (.*) under the Cashier tab$")
    public void iShouldBeShownSubTabsUnderTheCashierTab(String tabs) {
        SportsBettingPageContainer.sbcashierpage.verifyCashierTabs(tabs);
    }

    @Given("^as a user, I am on Cashier page$")
    public void asAUserIAmOnCashierPage() {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        SportsBettingPageContainer.signUpPage.clickHeaderTab("CASHIER");
    }

    @When("^I see sportsbetting (.*) tab$")
    public void iSeeDepositTab(String depositTab) {
        SportsBettingPageContainer.sbcashierpage.verifyCashierTabs(depositTab);
    }

    @Then("^I should be shown (.*) under the Deposit tab$")
    public void iShouldBeShownDepositOptionsUnderTheDepositTab(String depositTabs) {
        SportsBettingPageContainer.sbcashierpage.verifyCashierTabs(depositTabs);
    }

    @Given("^as a User, I move to Cashier (.*) page$")
    public void asAUserIMoveToCashierPage(String depositTab) {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            SportsBettingPageContainer.sbcashierpage.clickCashierSubTab("LEFT NAVIGATOR");
            SportsBettingPageContainer.sbcashierpage.clickCashierSubTab(depositTab);
        }
        else {
            SportsBettingPageContainer.sbcashierpage.closeIndexPopUp();
            SportsBettingPageContainer.signUpPage.clickHeaderTab("CASHIER");
        }
        SportsBettingPageContainer.sbcashierpage.verifyCashierTabs(depositTab);
    }

    @When("^I click on Cashier (.*)$")
    public void iClickOnCashier(String depositTab) {
        SportsBettingPageContainer.sbcashierpage.clickCashierSubTab(depositTab);
    }

    @Then("^I should be shown with all the deposit-options available under Deposit tab$")
    public void iShouldBeShownWithAllTheDepositOptionsAvailableUnderDepositTab(DataTable depositTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyCashierMoreTabs(depositTabs));
    }

    @When("^I click (.*) under the Deposit tab$")
    public void iClickUnderTheDepositTab(String strTab) {
        SportsBettingPageContainer.sbcashierpage.clickCashierSubTab(strTab);
    }

    @Then("^I see deposit page with several payment-options$")
    public void iSeeDepositPageWithSeveralPaymentOptions(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyBitcoinDepositOptions(strTabs));
    }

    @Given("^as a user, I am on Bitcoin page$")
    public void asAUserIAmOnBitcoinPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyBitcoinPage());
    }

    @Then("^I see all the promo-codes available under Bitcoin page$")
    public void iSeeAllThePromoCodesAvailableUnderBitcoinPage(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyPromoCodes(strTabs));
    }

    @Given("^as a User, I am on the Promo pop-up$")
    public void asAUserIAmOnThePromoPopUp() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyPopUp());
    }

    @Given("^as a User, I click and see the Promo pop-up$")
    public void asAUserICLickAndSeeThePromoPopUp() {
        SportsBettingPageContainer.sbcashierpage.clickCashierSubTab("View Promo Codes");
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyPopUp());
    }

    @Then("^I see, Promo code (.*) entered in the input for promo code$")
    public void iSeePromoCodeSBEnteredInTheInputForPromoCode(String strTab) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyPromotionEntered(strTab));
    }

    @And("^I enter promo code (.*)$")
    public void iEnterPromoCodeCodoid(String strTab) {
        SportsBettingPageContainer.sbcashierpage.enterPromoCode(strTab);
    }

    @When("^I press SUBMIT button$")
    public void iPressSUBMITButton() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.submitPopUpPromo("3"));
    }

    @When("^I press enter promo SUBMIT button$")
    public void iPressEnterPromoSUBMITButton() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.submitPopUpPromo("4"));
    }

    @Then("^I see, it opens a new tab with all the informations related to Bitcoin$")
    public void iSeeItOpensANewTabWithAllTheInformationsRelatedToBitcoin() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyAreYouNewToWindow());
    }

    @And("^I enter deposit amount as (.*) not below (.*) and not above (.*)$")
    public void iEnterDepositAmountAsAmountNotBelowAmountBelowAndNotAboveAmountAbove(int intAmount, int intAmountBelow, int intAmountAbove) {
        SportsBettingPageContainer.sbcashierpage.enterBitcoinDeposit(intAmount, intAmountBelow, intAmountAbove);
    }

    @And("^I see deposit page with Wallet Address and Current Price$")
    public void iSeeDepositPageWithWalletAddressAndCurrentPrice() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyBitcoinDepositSecondStep());
    }

    @Then("^I should navigate to the home page$")
    public void iShouldNavigateToTheHomePage() {
        SportsBettingPageContainer.sbcashierpage.closeIndexPopUp();
    }

    @Then("^user is redirected to the Deposit page$")
    public void userIsRedirectedToTheDepositPage() {
        SportsBettingPageContainer.sbcashierpage.verifyCashierTabs("Deposit");
    }

    @Given("^as a User, I am on Bitcoin page containing Wallet Address$")
    public void asAUserIAmOnBitcoinPageContainingWalletAddress() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.bitcoinDepositWalletAddress());
    }

    @Then("^the user is redirected to the Bitcoin input payment page$")
    public void theUserIsRedirectedToTheBitcoinInputPaymentPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyBitcoinInputPage());
    }

    @Then("^I am redirected to the Deposit page and I see different payment methods$")
    public void iAmRedirectedToTheDepositPageAndISeeDifferentPaymentMethods() {
        SportsBettingPageContainer.sbcashierpage.verifyCashierTabs("Deposit");
    }

    @Then("^I see Start Playing$")
    public void iSeeStartPlaying() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyStartPlaying());
    }

    @Given("^as a User, I am already on the Deposit Pending page$")
    public void asAUserIAmAlreadyOnTheDepositPendingPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyStartPlaying());
    }

    @Then("^I see different payment options$")
    public void iSeeDifferentPaymentOptions(DataTable strOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyCreditcardOptions(strOptions));
    }

    @And("^I enter credit card number (.*)$")
    public void iEnterCreditCardNumber(String strNumber) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.enterCreditCardDigit(strNumber));
    }

    @Then("^user is given fresh area to enter New Card Numbers$")
    public void userIsGivenFreshAreaToEnterNewCardNumbers() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyCreditCardFreshInput());
    }

    @Given("^as a User, Credit Card payment page is visible$")
    public void asAUserCreditCardPaymentPageIsVisible() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyCreditCardPage());
    }

    @Then("^I see all the promo-codes available under Credit Card page$")
    public void iSeeAllThePromoCodesAvailableUnderCreditCardPage(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyPromoCodes(strTabs));
    }

    @Then("^I see all the cryptocurrencies-methods under the Cryptocurrency page$")
    public void iSeeAllTheCryptocurrenciesMethodsUnderTheCryptocurrencyPage(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyCryptoCurrencySubTabs(strTabs));
    }

    @And("^I click on Continue on (.*) pop up$")
    public void iClickOnContinueOnPopUp(String strTab) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.clickEthereumPopUpContinue(strTab));
    }

    @Then("^I see Ethereum page with title (.*)$")
    public void iSeeEthereumPageWithTitle(String strTitle) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyEthereumDotComTitle(strTitle));
    }

    @Given("^as a User, I see the Ethereum payment page$")
    public void asAUserISeeTheEthereumPaymentPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyEthereumPage());
    }

    @Then("^I see all the deposit-options under the Litecoin payment page$")
    public void iSeeAllTheDepositOptionsUnderTheLitecoinPaymentPage(DataTable strOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyLitecoinOptions(strOptions));
    }

    @Given("^as a User, I am already on Cryptocurrency page$")
    public void asAUserIAmAlreadyOnCryptocurrencyPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyCryptoCurrencyPage());
    }

    @Then("^I see new tab with What is Cryptocurrency\\?$")
    public void iSeeNewTabWithWhatIsCryptocurrency() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyCryptoCurrencyTutorialPage());
    }

    @Then("^user is redirected to the Cryptocurrency page$")
    public void userIsRedirectedToTheCryptocurrencyPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyCryptoCurrencyPageWithFrame());
    }

    @Given("^as a User, I see the Litcoin payment page$")
    public void asAUserISeeTheLitcoinPaymentPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyLitecoinPage());
    }

    @Then("^I see all the deposit-options under the Ripple payment page$")
    public void iSeeAllTheDepositOptionsUnderTheRipplePaymentPage(DataTable strOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyRippleDepositPage(strOptions));
    }

    @Given("^as a User, I see the Ripple payment page$")
    public void asAUserISeeTheRipplePaymentPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyRipplePage());
    }

    @Then("^I see Ripple page with title (.*)$")
    public void iSeeRipplePageWithTitle(String strTitle) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyEthereumDotComTitle(strTitle));
    }

    @Then("^I see all the deposit-options under the Bitcoin Cash payment page$")
    public void iSeeAllTheDepositOptionsUnderTheBitcoinCashPaymentPage(DataTable strOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyBitcoinCashDepositPage(strOptions));
    }

    @Given("^as a User, I see the Bitcoin Cash payment page$")
    public void asAUserISeeTheBitcoinCashPaymentPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyBitcoinCashPage());
    }

    @Then("^I see Bitcoin Cash page with title (.*)$")
    public void iSeeBitcoinCashPageWithTitle(String strTitle) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyEthereumDotComTitle(strTitle));
    }

    @Then("^I see different deposit-options under the Skrill payment page$")
    public void iSeeDifferentDepositOptionsUnderTheSkrillPaymentPage(DataTable strOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifySkrillDepositPage(strOptions));
    }

    @Given("^as a User, I see the Skrill payment page$")
    public void asAUserISeeTheSkrillPaymentPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifySkrillPage());
    }

    @Then("^I see Skrill page with title (.*)$")
    public void iSeeSkrillPageWithTitle(String strTitle) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyEthereumDotComTitle(strTitle));
    }

    @Then("^I see different deposit-options under the Moneygram payment page$")
    public void iSeeDifferentDepositOptionsUnderTheMoneygramPaymentPage(DataTable strOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyMoneygramOptions(strOptions));
    }

    @Then("^I see Chat head open under the Deposit page for assistance$")
    public void iSeeChatHeadOpenUnderTheDepositPageForAssistance() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyChatPopUp());
    }

    @Then("^I see all the promo-codes available under ecoPayz page$")
    public void iSeeAllThePromoCodesAvailableUnderEcoPayzPage(DataTable strTabs) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyPromoCodes(strTabs));
    }

    @Given("^as a User, I see the EcoPayz payment page$")
    public void asAUserISeeTheEcoPayzPaymentPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyEcoPayzPage());
    }

    @Then("^I see EcoPayz page with title (.*)$")
    public void iSeeEcoPayzPageWithTitle(String strTitle) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyEthereumDotComTitle(strTitle));
    }

    @Given("^as a User, I see the Skrill 1 Tap payment page$")
    public void asAUserISeeTheSkrill1TapPaymentPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifySkrill1TapPage());
    }

    @Given("^as a User, I click Cashier and click (.*) tab$")
    public void asAUserIClickCashierAndClickTab(String strTab) {
        SportsBettingPageContainer.signUpPage.launchPTYURL();
        SportsBettingPageContainer.sbcashierpage.closeIndexPopUp();
        SportsBettingPageContainer.signUpPage.clickHeaderTab("CASHIER");
        SportsBettingPageContainer.sbcashierpage.clickCashierSubTab(strTab);
    }

    @Then("^I see Withdrawal Request header with Options$")
    public void iSeeWithdrawalRequestHeaderWithOptions(DataTable strWithdrawalOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyWithdrawalOptions(strWithdrawalOptions));
    }

    @And("^I close promo pop up$")
    public void iClosePromoPopUp() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.closePromoPopUp());
    }

    @Given("^as a User, I see Withdrawal page$")
    public void asAUserISeeWithdrawalPage() {
        SportsBettingPageContainer.sbcashierpage.verifyCashierWithdrawalPage();
    }

    @And("^I enter (.*) under the Withdrawal Page$")
    public void iEnterUnderTheWithdrawalPage(String strAmount) {
        SportsBettingPageContainer.sbcashierpage.enterAmountUnderWithdrawalPage(strAmount);
    }

    @When("^I click on (.*) Withdrawal option$")
    public void iClickOnWithdrawalOption(String strTab) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.clickWithdrawalOption(strTab));
    }

    @Then("^I see options on (.*) page$")
    public void iSeeOptionsOnPage(String strTab, DataTable strDatas) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyWithdrawalBitcoinOptions(strTab,strDatas));
    }

    @Given("^as a User, I see Bitcoin page for Withdrawal request$")
    public void asAUserISeeBitcoinPageForWithdrawalRequest() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyBitcoinWithdrawalPage());
    }

    @Then("^I see Withdrawal page with several payment options$")
    public void iSeeWithdrawalPageWithSeveralPaymentOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyCashierWithdrawalPage());
    }


    @Then("^I see new Bitcoin promotion page with title (.*)$")
    public void iSeeNewBitcoinPromotionPageWithTitle(String strTitle) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyEthereumDotComTitle(strTitle));
    }

    @Given("^as a User, I am on the Bitcoin Cash page for Withdrawal request$")
    public void asAUserIAmOnTheBitcoinCashPageForWithdrawalRequest() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyBitcoinCashWithdrawalPage());
    }

    @Given("^as a User, I am on the Ethereum page for Withdrawal request$")
    public void asAUserIAmOnTheEthereumPageForWithdrawalRequest() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyEthereumWithdrawalPage());
    }

    @Given("^as a User, I am on the Litecoin page for Withdrawal request$")
    public void asAUserIAmOnTheLitecoinPageForWithdrawalRequest() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyLitecoinWithdrawalPage());
    }

    @Given("^as a User, I am on the Ripple page for Withdrawal request$")
    public void asAUserIAmOnTheRipplePageForWithdrawalRequest() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyRippleWithdrawalPage());
    }

    @Given("^as a User, I am on the Bank Wire page for Withdrawal request$")
    public void asAUserIAmOnTheBankWirePageForWithdrawalRequest() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyBankWireWithdrawalPage());
    }

    @Then("^I See page redirects to the Cashier (.*) page$")
    public void iSeePageRedirectsToTheCashierPage(String strTabs) {
        if(strTabs.equalsIgnoreCase("Payout"))
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyCashierWithdrawalPage());
        else
        SportsBettingPageContainer.sbcashierpage.verifyCashierTabs("Bitcoin");
    }

    @Then("^I see a pop-up stating Leaving Cashier with three options$")
    public void iSeeAPopUpStatingLeavingCashierWithThreeOptions(DataTable strOptions) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyCashierClosePopUp(strOptions));
    }

    @Given("^as a User, I am on Leaving Cashier pop-up$")
    public void asAUserIAmOnLeavingCashierPopUp() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyCashierLeavePopUp());
    }

    @Then("^I see page redirects to Sports page under home page$")
    public void iSeePageRedirectsToSportsPageUnderHomePage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLandingPage("SPORTS"));
    }

    @Then("^I see page redirects to Cashier page under home page$")
    public void iSeePageRedirectsToCashierPageUnderHomePage() {
        Assert.assertTrue(SportsBettingPageContainer.sbsportspage.verifyLandingPage("CASHIER"));
    }

    @When("^I see a Chat head open under the Deposit page for assistance$")
    public void iSeeAChatHeadOpenUnderTheDepositPageForAssistance() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyChatPopUpUnderDeposit());
    }

    @Then("^I see a dropdown with several help related options$")
    public void iSeeADropdownWithSeveralHelpRelatedOptions() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyChatDropDown());
    }

    @Given("^I see a chat window with multiple help related topics to choose from$")
    public void iSeeAChatWindowWithMultipleHelpRelatedTopicsToChooseFrom() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyChatPopUpUnderDeposit());
    }

    @Then("^I see chat window gets closed$")
    public void iSeeChatWindowGetsClosed() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyClosingOfChatPopUp());
    }

    @Then("^I see a new windows tab gets opened with all the help related items$")
    public void iSeeANewWindowsTabGetsOpenedWithAllTheHelpRelatedItems() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyClickHereToLearnMoreNewTab());
    }

    @Then("^I see a a pop-up with choices$")
    public void iSeeAAPopUpWithChoices(DataTable strChoices) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyHelpPopUpChoices(strChoices));
    }

    @Given("^as a User, I am on the Help \\(Icon\\) pop-up$")
    public void asAUserIAmOnTheHelpIconPopUp() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyHelpPopUp());
    }

    @When("^I click on Live Help (.*)$")
    public void iClickOnLiveHelp(String strChoice) {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.clickOnHelpChoices(strChoice));
    }

    @Then("^I am shown with Contact Number$")
    public void iAmShownWithContactNumber() {
        if(!(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))) {
            Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyHelpPopUpContactOption());
        }
    }

    @And("^I click on Email shown$")
    public void IClickOnEmailShown() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyHelpPopUpEmailOption());
    }

    @Then("^Help pop-up goes away$")
    public void helpPopUpGoesAway() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyClosingOfHelpPopUp());
    }

    @Given("^as a User, I see SportsBetting mobile deposit page$")
    public void asAUserISeeSportsBettingMobileDepositPage() {
        Assert.assertTrue(SportsBettingPageContainer.sbcashierpage.verifyDepositPage());
    }
}


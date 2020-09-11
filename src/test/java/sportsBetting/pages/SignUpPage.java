package sportsBetting.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import com.cucumber.listener.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

public class SignUpPage extends BasePage {

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    //PTY
    @FindAll({
            @FindBy(how = How.XPATH, using = "//form[@id='user-login-Popup']//a[contains(.,'Login')]"),  // Tablet View
            @FindBy(how = How.NAME, using = "login"),
            @FindBy(how = How.XPATH, using = "//input[@value='LOGIN']")
    })
    protected WebElement btnLogin;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//img[@id='imgLogoCenter']"),
            @FindBy(how = How.XPATH, using = "//div[@id='logo']")
    })
    protected WebElement elmntPTYLogo;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[@id='balance-top'][contains(text(), '$')]"),
            @FindBy(how = How.XPATH, using = "//span[contains(text(),'$')]")
    })
    protected WebElement lblAmount;

    //scrolling
    @FindBy(how = How.ID, using = "scrolling")
    protected WebElement elmntScrolling;


    @FindAll({@FindBy(how = How.XPATH, using = "//div[@id='container']"),
            @FindBy(how = How.XPATH, using = "//li[@class='liMenu']"),
            @FindBy(how = How.XPATH, using = "//nav[@class='lobby__menu']")})

    protected WebElement elmntFrameBlackPage;

    @FindBy(how = How.XPATH, using = "//input[@id='checkModalPopup']")
    protected WebElement chkMessage;
    @FindAll({
    @FindBy(how = How.XPATH, using = "//div[@id='popup-opcrm']"),
            @FindBy(how = How.XPATH, using = "(//button[.='×'])")})
    protected WebElement elmtPopUp;

    @FindBy(how = How.XPATH, using = "//button[@id='closePopup']")
    protected WebElement btnclosepopup;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//span[contains(.,'Join')]"),
            @FindBy(how = How.XPATH, using = "//a[contains(.,'Join Us')]")

    })
    protected WebElement elmtJoinTab;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@id='HeaderWrapperTop']/div[2]/div"),
            @FindBy(how = How.XPATH, using = "//div[@id='scrolling']/ul"),
            @FindBy(how = How.XPATH, using = "//div[contains(@id,'nav')]//ul[@class='ulmenu']/li/a"),
            // @FindBy(how = How.XPATH, using = "//div[contains(@id,'nav')]//ul[@class='ulmenu']//li//span[.='Black' or .='Red']")
    })
    protected List<WebElement> elmntsHeaderTab;

    @FindBy(how = How.XPATH, using = "//center[normalize-space(.)='RACEBOOK']/parent::div")
    protected WebElement elmntsPokerTabMobile;

    @FindBy(how = How.XPATH, using = "//span[.='Sports']")
    protected WebElement SportsTabletTab;

    @FindBy(how = How.XPATH, using = "//span[.='E-Sports']")
    protected WebElement eSportsTabletTab;

    @FindAll({
            @FindBy(how = How.ID, using = "passwordPopup"), //Tablet view
            @FindBy(how = How.ID, using = "password"),
            @FindBy(how = How.ID, using = "Password")
    })
    protected WebElement loginPassword;

    @FindBy(how = How.ID, using = "PasswordJ")
    protected WebElement txtPassword;

    @FindAll({
            @FindBy(how = How.ID, using = "UsernamePopup"), //Tablet view
            @FindBy(how = How.ID, using = "Username"),
            @FindBy(how = How.ID, using = "CustomerID")
    })
    protected WebElement txtUsername;


    @FindBy(how = How.ID, using = "Country")
    protected WebElement txtCountry;

    @FindBy(how = How.ID, using = "Zip")
    protected WebElement txtZipCode;

    @FindBy(how = How.ID, using = "FirstName")
    protected WebElement txtFirstName;

    @FindBy(how = How.ID, using = "LastName")
    protected WebElement txtLastName;

    @FindBy(how = How.ID, using = "EMail")
    protected WebElement txtEmailId;

    @FindAll({
            @FindBy(how = How.ID, using = "Phone"), //Tablet
            @FindBy(how = How.ID, using = "HomePhone")
    })
    protected WebElement txtPhone;

    @FindBy(how = How.ID, using = "BirthDate")
    protected WebElement txtDOB;

    @FindAll({
            @FindBy(how = How.ID, using = "join-submit"), //Tablet
            @FindBy(how = How.ID, using = "btnsubmit")
    })
    protected WebElement btnCreateAccount;

    @FindAll({
            @FindBy(how = How.CSS, using = "a#betonline-logo"), //Tablet View
            @FindBy(how = How.XPATH, using = "//img[contains(@id,'imgLogo')]"),//Mobile View
            @FindBy(how = How.XPATH, using = "//div[@id='logo']/a/img[@alt='Sports Betting' or contains(@src,'sportsbetting')]")
    })
    protected WebElement elmtSportsBook;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(.,'SportsBetting')]"), //Tablet//Mobile
            @FindBy(how = How.XPATH, using = "//h1[contains(.,'BetOnline')]")
    })
    protected WebElement elmntSignUpHeader;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='Join Us']/parent::div/following-sibling::div/a[normalize-space(.)='Login']"),
            @FindBy(how = How.XPATH, using = "//span[@class='ui-btn-inner']/parent::a[@href='/login']")
    })
    protected WebElement btnMobLogin;

    @FindBy(how = How.XPATH, using = "//button[.='LIVE CASINO' or .='Live Casino']")
    protected WebElement elmntLiveCasino;

    protected String strTabLocator = new StringBuilder()
            .append("//span[.='")
            .append("<<TABNAME>>")
            .append("' or .='").append("<<CAPS>>").append("']").toString();


    protected String strHeaderTabLocator1 = new StringBuilder()
            .append("//li/a[.='")
            .append("<<TABNAME>>")
            .append("' or .='").append("<<CAPS>>").append("']").toString();

    protected String strHeaderTabLocatorTablet = new StringBuilder()
            .append("//span[.='")
            .append("<<TABNAME>>")
            .append("' or .='").append("<<CAPS>>").append("']").toString();

    protected String strHeaderTabLocatorMobile = new StringBuilder()
            .append("//center[normalize-space(.)='")//center[normalize-space(.)='SPORTS']/parent::li
            .append("<<TABNAME>>")
            .append("' or normalize-space(.)='").append("<<CAPS>>").append("']/parent::div").toString();

    protected String strHeaderTabLocator = new StringBuilder()
            .append("//li/a[.='")
            .append("<<TABNAME>>")
            .append("']").toString();

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='Join Us']"), //Tablet
            @FindBy(how = How.XPATH, using = "//li[@class='itemslide-active']//a")
    })
    protected WebElement elmntSportsTab;

    @FindBy(how = How.XPATH, using = "//button[.='LIVE CASINO' or .='Live Casino']/following::span[.='Black']")
    protected WebElement elmntBlackTab;

    @FindBy(how = How.XPATH, using = "//button[.='LIVE CASINO' or .='Live Casino']/following::span[.='Red']")
    protected WebElement elmntRedTab;

    @FindBy(how = How.XPATH, using = "//span[.='All']")
    protected WebElement elmntAll;

    protected String strHeaderTabMobile = new StringBuilder()
            .append("//center[@class='label_scroll'][.='<<TABNAME>>' or .='<<CAPS>>']/preceding-sibling::a").toString();


    @FindBy(how = How.XPATH, using = "//div[contains(@class,'popup')]/div[@id='contenttitle']")
    protected WebElement elmntExclusivePopup;
    @FindBy(how = How.XPATH, using = "//div/b[.='Exclusive Offer!']")
    protected WebElement lblExclusiveOffer;
    @FindBy(how = How.CSS, using = "button#closePopup")
    protected WebElement elmntCloseIcon;

    @FindBy(how = How.XPATH, using = " //div[contains(@class,'lazy-loader')][contains(@class,'active')]/img[@class='spinning']")
    protected WebElement elmntSignUpLoader;

    @FindBy(how = How.CSS, using = "div#homePage")
    protected WebElement elmntGameCarousel;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//p[contains(.,'A confirmation email has been sent to you')]"),
            @FindBy(how = How.XPATH, using = "//p[contains(.,'A confirmation email has been sent to you')]")
    })
    protected WebElement lblConfirmationEmail;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//h2[contains(.,'Welcome,')]"),
            @FindBy(how = How.XPATH, using = "//h2[contains(.,'Welcome,')]")
    })
    protected WebElement lblWelcomeUser;

    @FindBy(how = How.XPATH, using = "//div[contains(@id,'logout')]//span[normalize-space(.)='Account ID:']")
    protected WebElement elmntAccountIDfield;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//*[@class='dropdown-menu']/li/a[contains(text(), 'Logout')]"),  //Tablet
            @FindBy(how = How.XPATH, using = "//a[.='Logout']"), //Mobile
            @FindBy(how = How.XPATH, using = "//div[contains(@id,'logout')]//*[contains(text(),'LOGOUT') or @value='LOGOUT']")
    })
    protected WebElement btnLogout;
    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='Join Us']/parent::div/following-sibling::div/a[normalize-space(.)='Login']"),
            @FindBy(how = How.XPATH, using = " //input[@id='button-submit-login']"), //Desktop
            @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Log In']") //Mobile
    })
    protected WebElement btnTabLogin;

    @FindBy(how = How.XPATH, using = "//*[@class='account']/ul/li[contains(text(), '')]/following-sibling::li/a/i[contains(@id, 'iconUser')]")
    protected WebElement btnTabletLogoutDropDown;

    @FindBy(how = How.ID, using = "limenu")
    protected WebElement lnkLeftNavigator;

    @FindBy(how = How.XPATH, using = "//h2[contains(., 'Welcome')]")
    protected WebElement confirmJoinTablet;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//li//a[contains(text(),'Rules')]"),
            @FindBy(how = How.XPATH, using = "//a[.='Rules']")

    })
    protected WebElement elmntRules;

    @FindBy(how = How.XPATH, using = "//h2[contains(., 'General')]")
    protected WebElement rulesTabletContent;

    @FindBy(how = How.CLASS_NAME, using = "ath-application-icon")
    protected WebElement elmntLoginPopUp;

    @FindBy(how = How.XPATH, using = "//a[.='Rules']")
    protected WebElement lnkRules;

    @FindBy(how = How.XPATH, using = "(//a[.='Back To Top'])[1]")
    protected WebElement lnkBackToTop;

    @FindBy(how = How.XPATH, using = "//a[.='Bet Slip']")
    protected WebElement lnkBetSlip;

    @FindBy(how = How.XPATH, using = "//span[.='Sports']")
    protected WebElement elmntSportsBackArrow;

    @FindBy(how = How.XPATH, using = "//button[.='×']")
    protected WebElement btnAddsPopUp;

    // SportsBetting site project
    public void launchPTYURL() {
        try {
            visit(Constants.SPORTSBETTING_LIVE_URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean verifyPTYLogo() {
        waitForElement(elmntPTYLogo);
        takeScreenshot("verifyPTYLogo");
        return verifyElement(elmntPTYLogo);
    }

    public boolean verifyPTYPage() {
        if (verifyElement(elmtPopUp)) {
            chkMessage.click();
            if (chkMessage.isSelected()) {
                btnclosepopup.click();
            }
        }
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            waitForElement(elmntScrolling);
        }
        if (verifyElement(lblAmount)) {
            waitForElement(lblAmount);
            return verifyElement(lblAmount);
        }
        return false;
//       waitForElement(elmntFrameBlackPage);
//        return verifyElement(waitForElement(elmntFrameBlackPage));
    }


    public boolean verifySportsBettingUserLandingPage() {
        if (verifyElement(elmntExclusivePopup)) {
            waitForElement(lblExclusiveOffer);
            click(elmntCloseIcon);
        }
        waitForElement(elmtSportsBook);
        return verifyElement(elmtSportsBook);
    }

    public boolean clickonJoinTab() {
        waitForElement(elmtJoinTab);
        return click(elmtJoinTab);
    }

    public boolean verifySignUpPageIsVisible() {
        waitForElement(elmntSignUpHeader);
        return (verifyElement(elmntSignUpHeader));
    }

    public boolean enterUserDetailsInSignUpPage(String strFirstName, String strLastName, String strEmail, String strPassword, String strCountry, String strZip, String strPhoneNumber, String strDOB) {

        waitForSeconds(2);
        waitForElement(txtFirstName);
        enterValue(txtFirstName, strFirstName);
        enterValue(txtLastName, strLastName);
        enterValue(txtEmailId, strEmail);
        enterValue(txtPassword, strPassword);
        waitForSeconds(2);
        ElementselectByVisibleString(txtCountry, strCountry);
        enterValue(txtZipCode, strZip);
        enterValue(txtPhone, strPhoneNumber);
        enterValue(txtDOB, strDOB);
        takeScreenshot("enteringUserDetails");
        return click(btnCreateAccount);
    }

    public void loginPTY(String strUsername, String strPassword) {
        Reporter.addStepLog("Username: " + strUsername);
        Reporter.addStepLog("Password: " + strPassword);
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
            click(btnMobLogin);
        } else if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            click(btnTabLogin);
        }
        waitForElement(txtUsername);
        enterValue(txtUsername, strUsername);
        enterValue(loginPassword, strPassword);
        takeScreenshot("LoginFollowingCredential");
        jsClick(btnLogin);
    }

//    public void selecttabs(String strSBTabs) {
//        String[] tabs = strSBTabs.split(",");
//        for (String strTemp : tabs) {
//            WebElement btnAssignmentType = waitForElement(By.xpath(strTabLocator.replace("<<TABNAME>>", strTemp)));
//            waitForElement(btnAssignmentType);
//            waitForSeconds(2);
//            click(btnAssignmentType);
//        }


    public void enterUserDetailsInSignUpPage(List<String> lstDetails) {
        waitForSeconds(2);
        waitForElement(txtFirstName);
        enterValue(txtFirstName, lstDetails.get(0));
        enterValue(txtLastName, TestDataUtil.getValue(lstDetails.get(1)));
        enterValue(txtEmailId, TestDataUtil.getValue(lstDetails.get(2)).concat(Constants.MAIL_DOMAIN));
        enterValue(txtPassword, lstDetails.get(3));
        waitForSeconds(2);
        ElementselectByVisibleString(txtCountry, lstDetails.get(4));
        enterValue(txtZipCode, lstDetails.get(5));
        enterValue(txtPhone, lstDetails.get(6));
        enterValue(txtDOB, lstDetails.get(7));
        takeScreenshot("enteringUserDetails");

    }

    private boolean clickWelcomeTablet() {
        waitForElement(confirmJoinTablet);
        return click(confirmJoinTablet);
    }

    /*@Description: Navigate to Specific tab*/
    public void clickHeaderTab(String strSBTabs) {
        try {
            waitForElements(elmntsHeaderTab);

            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
                if (strSBTabs.equalsIgnoreCase("E-Sports")) {
                    waitForSeconds(2);
                    click(eSportsTabletTab);
                } else {
                    WebElement btnHeaderTabTablet = waitForElement(By.xpath(strHeaderTabLocatorTablet.replace("<<CAPS>>", startsWithCapitalize(strSBTabs)).replace("<<TABNAME>>", strSBTabs)));
                    waitForSeconds(2);
                    click(btnHeaderTabTablet);
                }
            } else if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE) || System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE_DEMO).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE)) {
                if (strSBTabs.toLowerCase().equalsIgnoreCase("Sports".toLowerCase()) || strSBTabs.toLowerCase().equalsIgnoreCase("Esports".toLowerCase()) || strSBTabs.toLowerCase().equalsIgnoreCase("Racebook".toLowerCase()) || strSBTabs.toLowerCase().equalsIgnoreCase("Player Props".toLowerCase())|| strSBTabs.toLowerCase().equalsIgnoreCase("Live".toLowerCase())) {
                    ScrollRightAction(elmntsPokerTabMobile);
               }
                WebElement btnHeaderTabMobile = waitForElement(By.xpath(strHeaderTabLocatorMobile.replace("<<CAPS>>", startsWithCapitalize(strSBTabs)).replace("<<TABNAME>>", strSBTabs)));
                waitForSeconds(2);
//                System.out.println("enter mobile tab selection method");
                click(btnHeaderTabMobile);
//                System.out.println("Click mobile tab selection method");

            } else if ((System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_BROWSER))) {
                if (strSBTabs.toLowerCase().equalsIgnoreCase("Black".toLowerCase()) || strSBTabs.toLowerCase().equalsIgnoreCase("Red".toLowerCase())) {

                    waitForElement(elmntLiveCasino);

                    mouseOver(elmntLiveCasino);


                    WebElement btnHeaderTab = waitForElement(By.xpath(strTabLocator.replace("<<CAPS>>", startsWithCapitalize(strSBTabs)).replace("<<TABNAME>>", strSBTabs)));
                    waitForSeconds(2);

                    click(btnHeaderTab);


                } else {

                    WebElement btnHeaderTab1 = waitForElement(By.xpath(strHeaderTabLocator1.replace("<<CAPS>>", startsWithCapitalize(strSBTabs)).replace("<<TABNAME>>", strSBTabs)));
                    waitForSeconds(2);
                    click(btnHeaderTab1);

                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        waitForSeconds(2);

    }

    /*@Description: Verify Account created page (Welcome Note and Confirmation Email label)*/
    public boolean verifyAccountCreatedPage() {
        // waitForInvisibilityOfElement(elmntSignUpLoader);
        return (verifyElement(waitForElement(lblWelcomeUser)) && verifyElement(waitForElement(lblConfirmationEmail)));
    }

    /*@Description: Verify Account created page (Welcome Note and Confirmation Email label)*/
    public void clickCreateAccountButton() {
        waitForElement(btnCreateAccount);
        click(btnCreateAccount);
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            Assert.assertTrue(this.clickWelcomeTablet());
        }
    }

    /*@Description: Verify Account created page (Welcome Note and Confirmation Email label)*/
    public boolean clickLogoutButton() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_TABLET)) {
            click(waitForElement(btnTabletLogoutDropDown));
        } else if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).contains(Constants.ENV_VARIABLE_MOBILE)) {
            click(waitForElement(lnkLeftNavigator));
        } else {
            waitForElement(elmntAccountIDfield);
        }
        return click(waitForElement(btnLogout));
    }

//    public void clickTabMobile() {
//        waitForElement(elmntSportsTab);
//        click(elmntSportsTab);
//    }


//    public boolean clickTabTablet() {
//        return click(SportsTabletTab);
//    }

    public boolean clickRules() {
        return click(elmntRules);
    }

    public boolean verifyRulesPage() {
        waitForElement(rulesTabletContent);
        return verifyElement(rulesTabletContent);
    }

    public boolean logoutVerify() {
        return verifyElement(waitForElement(btnTabLogin));
    }

    public boolean clickRulesUnderLeftNavigator(String strTab) {
        takeScreenshot(strTab);
        if(strTab.equalsIgnoreCase("Rules")) {
            return click(waitForElement(lnkRules));
        }
        else if(strTab.equalsIgnoreCase("Bet Slip"))
        {
            return click(waitForElement(lnkBetSlip));
        }
        else if(strTab.equalsIgnoreCase("Left Navigator"))
        {
            return click(waitForElement(lnkLeftNavigator));
        }
        else
        {
            return false;
        }
    }

    public boolean scrollToBackToTop() {
        scrollToElement(lnkBackToTop);
        return verifyElement(waitForElement(lnkBackToTop));
    }

    public boolean clickBackToTop() {
        takeScreenshot("try");
        waitForSeconds(1);
        return click(waitForElement(lnkBackToTop));
    }

    public boolean verifySportsPage() {
        return verifyElement(waitForElement(elmntSportsBackArrow));
    }

    public boolean closeAddsPopUp() {
        if(verifyElement(btnAddsPopUp))
        {
            return click(btnAddsPopUp);
        }
        Reporter.addStepLog("No pop up");
        return true;
    }

//    public boolean clickLiveCasinoTab(String strTabs) {
//        return true;
//    }
}



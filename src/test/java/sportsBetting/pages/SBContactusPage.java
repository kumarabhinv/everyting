package sportsBetting.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SBContactusPage extends BasePage {

    public SBContactusPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='top-links']//a[.='Contact Us']")
    protected WebElement elmntContactUs;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Live Help')]")
    protected WebElement elmntLiveChat;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'What is the nature')]")
    protected WebElement lblNameFieldInLiveChatPane;

    @FindBy(how = How.XPATH, using = "//span[.='1-888-843-9027']")
    protected WebElement elmntTelephoneNo;

    @FindBy(how = How.XPATH, using = "//span[.='cs@sportsbetting.ag']")
    protected WebElement elmntEmail;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'maximized')]//span[.='Chat with us']")
    protected WebElement elmntLiveChatPane;

    @FindBy(how = How.XPATH, using = "//div[@id='tabContainer']//h1[.='SUPPORT']")
    protected WebElement elmntSupportPage;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'maximized')]//button[@title='Close']/div")
    protected WebElement elmntCloseIconInLiveChat;

    @FindBy(how = How.XPATH, using = "//a[normalize-space(.)='Contact Us']")
    protected WebElement lnkContactUs;

    @FindBy(how = How.XPATH, using = "//a[@class='ui-link-inherit']")
    protected List<WebElement> lnkContactUsOptions;

    @FindBy(how = How.XPATH, using = "(//div[contains(., 'LIVE CHAT')])[1]")
    protected WebElement elmntLiveChatMobile;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'lp_header lpc_maximized')]")
    protected WebElement elmntLiveChatPopUp;

    protected String txtLiveChat = new StringBuilder()
            .append("//button[contains(., '")
            .append("<<LIVECHATTEXT>>")
            .append("')]")
            .toString();

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'maximized-header__text')]/descendant::span")
    protected WebElement txtLiveChatMobile;

    @FindBy(how = How.XPATH, using = "//button[contains(@class, 'header__menu-button')]")
    protected WebElement btnLiveChatDropDown;

    @FindBy(how = How.XPATH, using = "//button[contains(@id, 'EndChatAction_2')]")
    protected WebElement btnLiveChatEnd;

    /*@Description: Click Contact Us page */
    public boolean clickContactUs() {
        waitForElement(elmntContactUs);
        return click(elmntContactUs);
    }

    public boolean verifyContactUsPage() {
        waitForElement(elmntLiveChat);
        jsScrollDown();
        return verifyElement(elmntLiveChat);
    }

    /*@Description: Verify Telephone number label in Supoort page*/
    public boolean verifyTelephoneNo() {

        waitForElement(elmntSupportPage);
        jsScrollDown();
        return verifyElement(waitForElement(elmntTelephoneNo));
    }

    public boolean verifyEmail() {
        return verifyElement(waitForElement(elmntEmail));
    }

    /*@Description: Click "Live Help" for Live chat prompt*/
    public boolean clickLivechat() {
        waitForElement(elmntLiveChat);
        return click(elmntLiveChat);
    }

    /*@Description: Verify Live Chat prompt*/
    public boolean verifyChatUsPrompt() {
        boolean isVerified = verifyElement(waitForElement(elmntLiveChatPane)) && verifyElement(waitForElement(lblNameFieldInLiveChatPane));
        takeScreenshot("verifyChatUsPrompt");
        return isVerified;
    }

    /*@Description: Click X icon in Live chat*/
    public void clickXIconInLiveChat() {
        waitForElement(elmntCloseIconInLiveChat);
        click(elmntCloseIconInLiveChat);
    }

    public boolean clickContactUsMobile() {
        return click(waitForElement(lnkContactUs));
    }

    public boolean verifyContactUs(DataTable strDatas) {
        List<String> lstDatas = strDatas.asList(String.class);
        boolean boolResult = false;
        boolResult = compareList(waitForElements(lnkContactUsOptions), lstDatas.subList(0,3));
        return boolResult && lstDatas.get(3).equalsIgnoreCase(getText(waitForElement(elmntLiveChatMobile)));
    }

    public boolean verifyContactUsPageMobile() {
        return verifyElement(waitForElement(elmntLiveChatMobile));
    }

    public boolean clickLiveChatInMobile() {
        return click(elmntLiveChatMobile);
    }

    public boolean verifyLiveChatPopUp() {
        return verifyElement(waitForElement(elmntLiveChatPopUp));
    }

    public boolean verifyLiveChatPopUpText(String strText) {
        if(System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE).equalsIgnoreCase(Constants.ENV_VARIABLE_MOBILE))
        {
            return verifyElement(waitForElement(txtLiveChatMobile));
        }
        else {
            return verifyElement(waitForElement(By.xpath(txtLiveChat.replace("<<LIVECHATTEXT>>", strText))));
        }
    }

    public boolean clickLiveChatDropDown() {
        return click(waitForElement(btnLiveChatDropDown));
    }

    public boolean clickLiveChatEndUnderDropDown() {
        return click(waitForElement(btnLiveChatEnd));
    }
}

package sportsBetting;

import cap.helpers.Constants;
import cap.utilities.DateUtil;
import cap.utilities.SharedDriver;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import sportsBetting.pages.*;

import java.io.File;
import java.io.IOException;

/**
 * Created by codoid-pc on 1/9/2019.
 */
public class SportsBettingPageContainer {
    private WebDriver driver;
    public SBSportsPage sbsportspage;
    public SignUpPage signUpPage;
    public SBCashierPage sbcashierpage;
    public SBEsportsPage sbesportspage;
    public SBLiveCasinoPage sblivecasinopage;
    public SBPokerPage sbpokerpage;
    public SBPromotionsPage sbpromotionspage;
    public SBRaceBookPage sbracebookpage;
    public SBCasinoPage sbcasinopage;
    public SBLiveBettingPage sblivebettingpage;
    public SBMyAccountPage sbmyaccountpage;
    public SBContactusPage sbmycontactuspage;
    static public int i = 0;

    public SportsBettingPageContainer() {
        driver = SharedDriver.getDriver();
        initPages();
    }

    private void initPages() {

        sbmyaccountpage = new SBMyAccountPage(driver);
        sbcasinopage = new SBCasinoPage(driver);
        sbracebookpage = new SBRaceBookPage(driver);
        sbpromotionspage = new SBPromotionsPage(driver);
        sbpokerpage = new SBPokerPage(driver);
        sblivecasinopage = new SBLiveCasinoPage(driver);
        sbesportspage = new SBEsportsPage(driver);
        sbcashierpage = new SBCashierPage(driver);
        sblivebettingpage = new SBLiveBettingPage(driver);
        signUpPage = new SignUpPage(driver);
        sbsportspage = new SBSportsPage(driver);
        sbmycontactuspage = new SBContactusPage(driver);
    }

    @Before
    public void beforeScenario(Scenario scenario1) {
        System.out.println("SCENARIO NUMBER: " + (++i));
        System.out.println("SCENARIO NAME: " + scenario1.getName());
    }

    @After("~@mobile")
    public void afterScenario(Scenario scenario) {
        if (driver == null) {

        } else {

            if (scenario.getSourceTagNames().contains(Constants.LOGOUT_TAG)) {
                signUpPage.clickLogoutButton();
            }
            String strFilePath = Reporter.getExtentHtmlReport().config().getFilePath().replace("report.html", "");
            String strReportDir = System.getProperty("user.dir") + "/reports";
            scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            try {
                //This takes a screenshot from the driver at save it to the specified location
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                //Building up the destination path for the screenshot to save
                //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
                String strDestinationPath = System.getProperty("user.dir") + "/reports/images/" + screenshotName + ".png";

                //Copy taken screenshot from source location to destination location
                FileUtils.copyFile(sourcePath, new File(strFilePath + "/images/" + screenshotName + DateUtil.getCurrentDate("dd-MM-yyyy-HH-mm-ss-sss") + ".png"));

                //This attach the specified screenshot to the test
                Reporter.addScreenCaptureFromPath("images/" + screenshotName + DateUtil.getCurrentDate("dd-MM-yyyy-HH-mm-ss-sss") + ".png");
            } catch (IOException e) {
            }
            System.out.println("SCENARIO NUMBER " + i + " " + scenario.getStatus());
        }

    }

}

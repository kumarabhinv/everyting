package sportsBetting.cukes;

import cap.helpers.Constants;
import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.Platform;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.File;

@CucumberOptions(features = {"src/test/resources/features/sportsBetting/Regression/RT_SB_Esports.feature" },
        monochrome = true,
        glue = {"sportsBetting"}, tags = {"@TEST"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:",
                "pretty", "html:target/cucumber-report/single",
           //     "com.epam.reportportal.cucumber.ScenarioReporter",
                "json:target/cucumber-report/single/cucumber.json",
                "rerun:target/cucumber-report/single/rerun.txt"})

public class
SportsBettingCukes extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void setup() {
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath(System.getProperty("user.dir") + "/reports/report.html");
    }

    @AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("config/extent-config.xml"));
        Reporter.setSystemInfo("User", System.getProperty("user.name"));
        Reporter.setSystemInfo("Source Machine os", Platform.getCurrent().name());
        Reporter.setSystemInfo("Build Version", "0.0.1");
        Reporter.setSystemInfo("Automation Version", "1.0");
        Reporter.setSystemInfo("Browser", System.getProperty(Constants.ENV_VARIABLE_BROWSER_NAME));
        Reporter.setSystemInfo("Execution Type", System.getProperty("execution_type"));

    }
}

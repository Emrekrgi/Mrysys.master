package Runners;


import Utilities.BaseDriver;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.jsoup.Connection;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


@CucumberOptions
        (
                features = "src/test/java/FeatureFiles",
                glue = "StepDefinitions",
                plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                dryRun = false

        )


public class ParallelTestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browser")
    public void beforeClass(String browserName)
    {
        BaseDriver.threadBrowserName.set(browserName);
    }
    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("Windows Username",  System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("Username", "Senol");
        ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "QA-Lead");

    }
}

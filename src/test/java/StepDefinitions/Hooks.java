package StepDefinitions;

import Utilities.BaseDriver;
import Utilities.ExcelUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public  void before(){
        System.out.println("The Scenario is started");
    }
    @After
    public void after(Scenario scenario){

        ExcelUtility.writeToExcel("src/test/java/ApachePOI/SenaryoSonuclari.xlsx",
                scenario,BaseDriver.getThreadBrowserNAme());

        if (scenario.isFailed()){
            TakesScreenshot screenshot =((TakesScreenshot) BaseDriver.getDriver());
            byte[] stateInMemory= screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(stateInMemory, "image/png", "screenshot name");
        }
        System.out.println("The Scenario is finished");
        BaseDriver.quitDriver();
    }
}

package StepDefinitions;

import Pages.DialogPage;
import Pages.LeftBar;
import Pages.Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class GradeLevelsSteps extends Methods {

    LeftBar lb=new LeftBar();
    DialogPage dp=new DialogPage();

    @When("the user navigates to Grade Levels")
    public void theUserNavigatesToGradeLevels(DataTable links) {

        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = lb.getWebElement(strLinkList.get(i));
            lb.myClick(linkWebElement);
        }

    }

    @And("Click on the EDIT Button")
    public void clickOnTheEDITButton() throws InterruptedException {

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//button[@class='mdc-button mat-mdc-button mat-accent mat-flat-button mat-mdc-button-base']/*"), 0));
        Thread.sleep(1000);
        myScriptClick(dp.editButton);

    }
}

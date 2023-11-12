package StepDefinitions;

import Pages.DialogPage;
import Pages.Methods;
import Utilities.BaseDriver;
import Utilities.ExcelUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class DocumentTypesSteps {
    DialogPage dp = new DialogPage();


    @And("User Add Document Types with ApachePOI")
    public void userAddDocumentTypesWithApachePOI(DataTable dataTable) throws InterruptedException {
        ArrayList<ArrayList<String>> table =
                ExcelUtility.getData("src/test/java/ApachePOI/CampusTestData.xlsx", "DocumentTypes", 4);

        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> row = table.get(i);
            dp.myClick(dp.AddButton);
            dp.mySendKeys(dp.nameInput, row.get(0));
            dp.myClick(dp.stageLink);
            int randomPick = Methods.randomChoise(6);
            WebElement selectStage = dp.selectStage.get(randomPick);
            dp.myClick(selectStage);
            new Actions(BaseDriver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
            dp.mySendKeys(dp.description, row.get(1));
            dp.myClick(dp.requiredChecked);
            dp.myClick(dp.activeButtonOn);
            dp.myClick(dp.saveButton);
            dp.verifyContainsText(dp.successMessage, "success");

        }
    }

    @Then("User Edit Document Types with ApachePOI")
    public void userEditDocumentTypesWithApachePOI(DataTable dataTable) {

        ArrayList<ArrayList<String>> table =
                ExcelUtility.getData("src/test/java/ApachePOI/CampusTestData.xlsx", "DocumentTypes", 4);

        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> row = table.get(i);
            dp.mySendKeys(dp.fieldNameInput, row.get(0));
            dp.myClick(dp.searchButton);
            dp.wait.until(ExpectedConditions.elementToBeClickable(dp.searchButton));
            dp.myClick(dp.editButton);
            dp.mySendKeys(dp.nameInput, row.get(2));
            dp.mySendKeys(dp.description, row.get(3));
            dp.myClick(dp.requiredUnchecked);
            dp.myClick(dp.useCamUnchecked);
            dp.myClick(dp.activeButtonOff);
            dp.myClick(dp.saveButton);
            dp.verifyContainsText(dp.successMessage, "success");

        }
    }


    @And("User Delete Document Types with ApachePOI")
    public void userDeleteDocumentTypesWithApachePOI(DataTable dataTable) {

        ArrayList<ArrayList<String>> table =
                ExcelUtility.getData("src/test/java/ApachePOI/CampusTestData.xlsx", "DocumentTypes", 4);
        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> row = table.get(i);
            dp.mySendKeys(dp.fieldNameInput, row.get(2));
            dp.myClick(dp.searchButton);
            dp.wait.until(ExpectedConditions.elementToBeClickable(dp.searchButton));
            dp.myClick(dp.deleteIcon);
            dp.myClick(dp.deleteButton);
            dp.verifyContainsText(dp.successMessage, "success");


        }
    }
}



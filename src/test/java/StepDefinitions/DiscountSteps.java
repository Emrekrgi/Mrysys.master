package StepDefinitions;

import Pages.DialogPage;
import Utilities.ExcelUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class DiscountSteps {
    DialogPage dp=new DialogPage();
    @Then("User Add Discounts with ApachePOI")
    public void userAddDiscountsWithApachePOI(DataTable dataTable) {
        ArrayList<ArrayList<String>> table=
                ExcelUtility.getData("src/test/java/ApachePOI/CampusTestData.xlsx","Descriptions",6);

        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> row= table.get(i);
            dp.myClick(dp.AddButton);
            dp.mySendKeys(dp.descriptionInput, row.get(0));
            dp.mySendKeys(dp.integrationCode, row.get(1));
            dp.mySendKeys(dp.priorityInput, row.get(2));
            dp.myClick(dp.activeButtonOn);
            dp.myClick(dp.saveCloseButton);
            dp.verifyContainsText(dp.successMessage, "success");


        }
    }

    @When("User Edit Discounts with ApachePOI")
    public void userEditDiscountsWithApachePOI(DataTable dataTable) {

        ArrayList<ArrayList<String>> table=
                ExcelUtility.getData("src/test/java/ApachePOI/CampusTestData.xlsx","Descriptions",6);

        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> row = table.get(i);
            dp.mySendKeys(dp.descriptionField, row.get(0));
            dp.myClick(dp.searchButton);
            dp.wait.until(ExpectedConditions.elementToBeClickable(dp.searchButton));
            dp.myClick(dp.editButton);
            dp.mySendKeys(dp.descriptionInput, row.get(3));
            dp.mySendKeys(dp.integrationCode, row.get(4));
            dp.mySendKeys(dp.priorityInput, row.get(5));
            dp.myClick(dp.activeButtonOff);
            dp.myClick(dp.saveCloseButton);
            dp.verifyContainsText(dp.successMessage, "success");


        }
    }

    @And("User Delete Discounts with ApachePOI")
    public void userDeleteDiscountsWithApachePOI(DataTable dataTable) {

        ArrayList<ArrayList<String>> table=
                ExcelUtility.getData("src/test/java/ApachePOI/CampusTestData.xlsx","Descriptions",6);

        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> row = table.get(i);

            dp.mySendKeys(dp.descriptionField, row.get(3));
            dp.myClick(dp.searchButton);
            dp.wait.until(ExpectedConditions.elementToBeClickable(dp.searchButton));
            dp.myClick(dp.deleteIcon);
            dp.myClick(dp.deleteButton);
            dp.verifyContainsText(dp.successMessage, "success");

        }

    }
}

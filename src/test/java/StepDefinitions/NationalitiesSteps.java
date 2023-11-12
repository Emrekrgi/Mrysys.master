package StepDefinitions;

import Pages.DialogPage;
import Utilities.ExcelUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;


public class NationalitiesSteps {

    DialogPage dp=new DialogPage();

    @Then("User Add Nationalities with ApachePOI")
    public void userAddNationalitiesWithApachePOI(DataTable dataTable) {

        ArrayList<ArrayList<String >> table=
                ExcelUtility.getData("src/test/java/ApachePOI/CampusTestData.xlsx", "Nationalities",2);

        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> row= table.get(i);

            dp.myClick(dp.AddButton);
            dp.mySendKeys(dp.nameInput, row.get(0));
            dp.myClick(dp.saveButton);
            dp.verifyContainsText(dp.successMessage, "success");

        }
    }

    @When("User Edit Nationalities with ApachePOI")
    public void userEditNationalitiesWithApachePOI(DataTable dataTable) {

        ArrayList<ArrayList<String>> table=
                ExcelUtility.getData("src/test/java/ApachePOI/CampusTestData.xlsx","Nationalities",2);

        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> row= table.get(i);

            dp.mySendKeys(dp.nameInputNationalities, row.get(0));
            dp.myClick(dp.searchButton);
            dp.wait.until(ExpectedConditions.elementToBeClickable(dp.searchButton));
            dp.myClick(dp.editButton);
            dp.mySendKeys(dp.nameInput,row.get(1));
            dp.myClick(dp.saveButton);
            dp.verifyContainsText(dp.successMessage, "success");



        }

    }

    @And("User Delete Nationalities with ApachePOI")
    public void userDeleteNationalitiesWithApachePOI(DataTable dataTable) {

        ArrayList<ArrayList<String>> table=
                ExcelUtility.getData("src/test/java/ApachePOI/CampusTestData.xlsx", "Nationalities",2);

        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> row= table.get(i);
            dp.mySendKeys(dp.nameInputNationalities, row.get(1));
            dp.myClick(dp.searchButton);
            dp.wait.until(ExpectedConditions.elementToBeClickable(dp.searchButton));
            dp.myClick(dp.deleteIcon);
            dp.myClick(dp.deleteButton);
            dp.verifyContainsText(dp.successMessage, "success");


        }

    }
}

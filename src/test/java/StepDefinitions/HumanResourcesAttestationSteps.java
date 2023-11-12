package StepDefinitions;

import Pages.DialogPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HumanResourcesAttestationSteps {
    DialogPage dp = new DialogPage();

    @Then("User Click SearchButton And EditButton")
    public void userClickSearchButtonAndEditButton(DataTable dataTable) {

        dp.myClick(dp.searchButton);
        dp.wait.until(ExpectedConditions.elementToBeClickable(dp.searchButton));
        dp.myClick(dp.editButton);
    }

    @Then("User Delete  Attestations under Human Resources")
    public void userDeleteAttestationsUnderHumanResources(DataTable dataTable) {

        dp.myClick(dp.searchButton);
        dp.wait.until(ExpectedConditions.elementToBeClickable(dp.searchButton));
        dp.myClick(dp.deleteIcon);
        dp.myClick(dp.deleteButton);
        dp.verifyContainsText(dp.successMessage, "success");
    }
}

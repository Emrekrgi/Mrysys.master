package StepDefinitions;

import Pages.DialogPage;
import Pages.LeftBar;
import Utilities.BaseDriver;
import Utilities.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class LoginSteps extends ConfigReader {
    LeftBar lb = new LeftBar();
    DialogPage dp = new DialogPage();

    @Given("Navigate to website")
    public void navigateToWebsite() throws IOException {
        BaseDriver.getDriver().get(getUrl());
    }

    @And("Enter username that as {string} and password that as {string}")
    public void enterUsernameThatAsAndPasswordThatAs(String username, String password) throws IOException {
        lb.mySendKeys(lb.userNameInput, getUsername());
        lb.mySendKeys(lb.passwordInput, getPassword());
    }

    @When("Click login button")
    public void clickLoginButton() {
        lb.myClick(lb.loginButton);
    }

    @Then("Verify that user logged in")
    public void verifyThatUserLoggedIn() {
        dp.verifyContainsText(dp.loginVerify, "Dashboard");
    }

    @And("Enter username and password")
    public void enterUsernameAndPassword(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);
            WebElement element = lb.getWebElement(item.get(0));
            String text = item.get(1);
            lb.mySendKeys(element, text);

        }

    }

    @Then("User see The invalid  username or password warning")
    public void userSeeTheInvalidUsernameOrPasswordWarning(DataTable dataTable) {
        lb.verifyContainsText(lb.inValidUsernamePassword, "Invalid username or password");
    }

    @And("Enter username and  do not enter password")
    public void enterUsernameAndDoNotEnterPassword() {
        lb.mySendKeys(lb.userNameInput, "turkeyts");
    }

    @Then("Verify blank password Error")
    public void verifyBlankPasswordError() {

        lb.verifyContainsText(lb.blankPasswordError, "Password");


    }

    @When("Click login button from DataTable")
    public void clickLoginButtonDataTable(DataTable dataTable) {
        lb.myClick(lb.loginButton);
    }

    @Then("Verify that user logged in from DataTable")
    public void verifyThatUserLoggedInFromDataTable(DataTable dataTable) {
        dp.verifyContainsText(dp.loginVerify, "Dashboard");
    }
}

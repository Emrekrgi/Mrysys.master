package StepDefinitions;

import Pages.DialogPage;
import Pages.LeftBar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddSubjectCategoriesSteps {

    DialogPage dp = new DialogPage();
    LeftBar lb=new LeftBar();

    @When("User Click to Education")
    public void userClickToEducation() {
        lb.myClick(lb.educationLink);
    }

    @Then("User CLick to Setup")
    public void userCLickToSetup() {
        lb.myClick(lb.educationSetup);
    }

    @And("User Click to Subject Categories")
    public void userClickToSubjectCategories() {
        lb.myClick(lb.subjectCategoriesLink);
    }

    @And("User Create  New Subject Categories name as {string} and code as {string}")
    public void userCreateNewSubjectCategoriesNameAsAndCodeAs(String name, String code) throws InterruptedException {
        dp.myClick(dp.AddButton);
        dp.mySendKeys(dp.nameInput, name);
        dp.mySendKeys(dp.codeInput, code);
        dp.myClick(dp.activeButtonOn);
        dp.myClick(dp.activeButtonOff);
        dp.myClick(dp.saveButton);
    }

    @And("Success Message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dp.verifyContainsText(dp.successMessage, "success");
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dp.verifyContainsText(dp.alreadyExist, "already");
    }

    @And("User Search the Category searchText as {string}")
    public void userSearchTheCategorySearchTextAs(String searchtext) {

        dp.mySendKeys(dp.fieldNameInput, searchtext);


    }

    @And("User Edit  New Subject Categories name as {string} and code as {string}")
    public void userEditNewSubjectCategoriesNameAsAndCodeAs(String name, String code) throws InterruptedException {

        dp.ClickEditButton();
        dp.mySendKeys(dp.nameInput, name);
        dp.mySendKeys(dp.codeInput, code);
        dp.myClick(dp.saveButton);
    }

    @Then("Subject Category successfully updated message should be displayed")
    public void subjectCategorySuccessfullyUpdatedMessageShouldBeDisplayed() {
        dp.verifyContainsText(dp.successMessage, "success");
    }

    @And("User Delete The Subject Categories")
    public void userDeleteTheSubjectCategories() throws InterruptedException {
        dp.ClickDeleteIcon();
    }

    @Then("Subject Category successfully deleted message should be displayed")
    public void subjectCategorySuccessfullyDeletedMessageShouldBeDisplayed() {
        dp.verifyContainsText(dp.successMessage, "success");
    }
}

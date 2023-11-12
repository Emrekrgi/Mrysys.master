package StepDefinitions;

import Pages.DialogPage;
import Pages.LeftBar;
import Pages.Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SchoolLocationSteps {


    LeftBar lb = new LeftBar();
    DialogPage dp = new DialogPage();

    @When("Click on the element in LeftBar")
    public void clickOnTheElementInLeftBar(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = lb.getWebElement(strLinkList.get(i));
            lb.myClick(linkWebElement);
        }

    }

    @Then("Click on the Element in DialogPage")
    public void clickOnTheElementInDialogPage(DataTable buttons) {
        List<String> strLinkList = buttons.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = dp.getWebElement(strLinkList.get(i));
            dp.myClick(linkWebElement);
        }
    }


    @And("User Add the New School Locations")
    public void UserAddTheNewSchoolLocations(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);
            WebElement element = dp.getWebElement(item.get(0));
            String text = item.get(1);
            dp.mySendKeys(element, text);

        }

    }

    @Then("User Click randomly LocationType")
    public void userClickRandomlyLocationType(DataTable dataTable) {

        dp.myClick(dp.selectButton);

        int randomPick = Methods.randomChoise(3);
        WebElement LocationType = dp.locationType.get(randomPick);
        dp.myClick(LocationType);
    }


    @Then("User Delete The Element On DialogPage")
    public void userDeleteTheElementOnDialogPage(DataTable dataTable) {
        List<String> strLinkList = dataTable.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = dp.getWebElement(strLinkList.get(i));
            dp.myClick(linkWebElement);
        }
    }
}
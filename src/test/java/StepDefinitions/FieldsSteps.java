package StepDefinitions;

import Pages.DialogPage;
import Pages.LeftBar;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FieldsSteps {
   // AddingFields af=new AddingFields();
    LeftBar lb=new LeftBar();
    DialogPage dp=new DialogPage();

    @io.cucumber.java.en.
            When("the user navigates to fields")
    public void theUserNavigatesToFields(DataTable links) {


        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = lb.getWebElement(strLinkList.get(i));
            lb.myClick(linkWebElement);
        }


    }

    @And("Click on the save button in Dialog")
    public void clickOnTheSaveButtonInDialog(DataTable elements) {
        List<String> strLinkList = elements.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = dp.getWebElement(strLinkList.get(i));
            dp.myClick(linkWebElement);
        }

    }

    @And("Click on the Edit Button")
    public void clickOnTheEditButton() throws InterruptedException {
        DialogPage dc=new DialogPage();
        dc.ClickEditButton();
    }

    @And("User Sending Keys in DialogPage")
    public void userSendingKeysInDialogPage(DataTable dt) {
        List<List<String>> list=dt.asLists(String.class);

        for (int i = 0; i < list.size(); i++) {
            WebElement e=dp.getWebElement(list.get(i).get(0));
            String text=list.get(i).get(1);
            dp.mySendKeys(e,text);

        }




    }
}

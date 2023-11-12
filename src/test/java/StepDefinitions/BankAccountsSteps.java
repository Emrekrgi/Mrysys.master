package StepDefinitions;

import Pages.DialogPage;
import Pages.LeftBar;
import Pages.Methods;
import Utilities.ExcelUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class BankAccountsSteps {

    DialogPage dp=new DialogPage();
    LeftBar lb=new LeftBar();

    @Then("User Add BankAccounts with ApachePOI")
    public void userAddBankAccountsWithApachePOI(DataTable dataTable) {

        ArrayList<ArrayList<String>> table=
                ExcelUtility.getData("src/test/java/ApachePOI/CampusTestData.xlsx","BankAccounts",6);
        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> row= table.get(i);
            dp.myClick(dp.AddButton);
            dp.mySendKeys(dp.nameInput, row.get(0));
            dp.mySendKeys(dp.ibanInput, row.get(1));
            dp.mySendKeys(dp.integrationCode, row.get(2));
            dp.myClick(dp.currencySelect);
            int randomPick= Methods.randomChoise(8);
            WebElement CurrencyType= dp.currencyType.get(randomPick);
            dp.myClick(CurrencyType);
            dp.myClick(dp.activeButtonOn);
            dp.myClick(dp.saveButton);
            dp.verifyContainsText(dp.successMessage, "success");

        }

    }

    @Then("User Edit BankAccounts with ApachePOI")
    public void userEditBankAccountsWithApachePOI(DataTable dataTable) {

        ArrayList<ArrayList<String>> table=
                ExcelUtility.getData("src/test/java/ApachePOI/CampusTestData.xlsx","BankAccounts",6);

        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> row= table.get(i);

            dp.mySendKeys(dp.nameInputBank, row.get(0));
            dp.myClick(dp.searchButton);
            dp.wait.until(ExpectedConditions.elementToBeClickable(dp.searchButton));
            dp.myClick(dp.editButton);
            dp.mySendKeys(dp.nameInput, row.get(3));
            dp.mySendKeys(dp.ibanInput, row.get(4));
            dp.mySendKeys(dp.integrationCode, row.get(5));
            dp.myClick(dp.currencySelect);
            int randomPick= Methods.randomChoise(8);
            WebElement CurrencyType= dp.currencyType.get(randomPick);
            dp.myClick(CurrencyType);
            dp.myClick(dp.activeButtonOff);
            dp.myClick(dp.saveButton);
            dp.verifyContainsText(dp.successMessage, "success");
        }
    }

    @Then("User Delete BankAccounts with ApachePOI")
    public void userDeleteBankAccountsWithApachePOI(DataTable dataTable) {
        ArrayList<ArrayList<String>> table=
                ExcelUtility.getData("src/test/java/ApachePOI/CampusTestData.xlsx","BankAccounts",6);

        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> row= table.get(i);

            dp.mySendKeys(dp.nameInputBank, row.get(3));
            dp.myClick(dp.searchButton);
            dp.wait.until(ExpectedConditions.elementToBeClickable(dp.searchButton));
            dp.myClick(dp.deleteIcon);
            dp.myClick(dp.deleteButton);
            dp.verifyContainsText(dp.successMessage, "success");

        }

    }
}

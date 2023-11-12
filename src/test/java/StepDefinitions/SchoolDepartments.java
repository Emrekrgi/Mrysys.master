package StepDefinitions;

import Pages.DialogPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;


public class SchoolDepartments {
    DialogPage dp = new DialogPage();

    @And("User Add New School Departments with ApachePoi")
    public void userAddNewSchoolDepartmentsWithApachePoi(DataTable dataTable) throws IOException {
        String path = "src/test/java/ApachePOI/CampusTestData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("SchoolDepartment");

        String data = String.valueOf(sheet.getRow(0).getCell(0));
        String data2 = String.valueOf(sheet.getRow(0).getCell(1));
        dp.mySendKeys(dp.nameInput, data);
        dp.mySendKeys(dp.codeInput, data2);
        dp.myClick(dp.activeButtonOn);
        dp.myClick(dp.saveButton);
        dp.verifyContainsText(dp.successMessage, "success");

    }

    @And("User Edit School Departments with ApachePOI")
    public void userEditSchoolDepartmentsWithApachePOI(DataTable dataTable) throws IOException, InterruptedException {
        String path = "src/test/java/ApachePOI/CampusTestData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("SchoolDepartment");


        String data = String.valueOf(sheet.getRow(10).getCell(7));
        String data2 = String.valueOf(sheet.getRow(10).getCell(8));
        dp.mySendKeys(dp.nameInput, data);
        dp.mySendKeys(dp.codeInput, data2);
        dp.myClick(dp.activeButtonOff);
        dp.myClick(dp.saveButton);
        dp.verifyContainsText(dp.successMessage, "success");




    }
}


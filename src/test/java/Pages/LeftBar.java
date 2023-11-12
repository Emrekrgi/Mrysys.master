package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftBar extends Methods{
    public LeftBar() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    /////////////////////////Senol///////////////////////////////

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setupLink;
    @FindBy(xpath = " //span[text()='School Setup']")
    public WebElement schoolSetup;
    @FindBy(xpath = "//span[@class='nav-link-title ng-star-inserted'][normalize-space()='Locations']")
    public WebElement Locations;
    @FindBy(xpath = "//span[text()='Education']")
    public WebElement educationLink;
    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement educationSetup;
    @FindBy(xpath = " //span[@class='nav-link-title ng-star-inserted' and text()='Subject Categories']")
    public WebElement subjectCategoriesLink;
    @FindBy(id = "mat-input-0")
    public WebElement userNameInput;
    @FindBy(id = "mat-input-1")
    public WebElement passwordInput;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath = "//div[ contains( text(), 'Invalid' )  ] ")
    public WebElement inValidUsernamePassword;
    @FindBy(xpath = "//div//mat-error")
    public WebElement blankPasswordError;
    @FindBy(xpath="   //span[text()= 'Departments']")
    public WebElement departments;
    @FindBy(xpath="(//span[text()='Bank Accounts'])[1]")
    public WebElement bankAccounts;
    @FindBy(xpath="//span[text()='Nationalities']")
    public WebElement nationalities;
    @FindBy(xpath="(//span[text()='Discounts'])[1]")
    public WebElement discounts;
    @FindBy(xpath=" (//span[text()='Setup'])[3]")
    public WebElement setupHumanResources;
    @FindBy(xpath="  (//span[text()='Attestations'])[1]")
    public WebElement attestations;
    @FindBy(xpath="//fuse-nav-vertical-item//span[text()='Document Types']")
    public WebElement documentTypes;















    ////////////////////////////Emre///////////////////////////////////
    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement positionCategoriesSetup;
    @FindBy(xpath = "//span[text()='Position Categories']")
    public WebElement positionCategories;






    //////////////////////////////////////Malik///////////////////////////////////

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement addingFieldsSetup;
    @FindBy(xpath = "//*[text()='Parameters']")
    public WebElement parameters;
    @FindBy(xpath = "//span[text()='Fields']")
    public WebElement fields;
    @FindBy(xpath = "//span[text()='Grade Levels']")
    public WebElement gradeLevels;




    public WebElement getWebElement(String stringElement) {
        switch (stringElement) {
            case "setupLink": return this.setupLink;
            case "schoolSetup": return this.schoolSetup;
            case "Locations": return this.Locations;
            case "educationLink": return this.educationLink;
            case "educationSetup": return this.educationSetup;
            case "subjectCategoriesLink": return this.subjectCategoriesLink;
            case "userNameInput": return this.userNameInput;
            case "passwordInput": return this.passwordInput;
            case "loginButton": return this.loginButton;
            case "inValidUsernamePassword" : return this.inValidUsernamePassword;
            case "blankPasswordError" : return this.blankPasswordError;
            case "human resources": return this.humanResources;
            case "positionCategoriesSetup": return this.positionCategoriesSetup;
            case "position categories": return this.positionCategories;
            case "addingFieldsSetup" : return this.addingFieldsSetup;
            case "parameters" : return this.parameters;
            case "fields" : return  this.fields;
            case "departments": return this. departments;
            case "bankAccounts": return this. bankAccounts;
            case "nationalities": return this.nationalities;
            case "discounts": return this.discounts;
            case "setupHumanResources": return this.setupHumanResources;
            case "attestations": return this.attestations;
            case "documentTypes": return this.documentTypes;


            case "gradeLevels": return this.gradeLevels;

        }

        return null;
    }
}

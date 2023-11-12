Feature: Bank Account Functionality

  Background:
  Login with valid username and password
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in

  @RegressionTest
  Scenario: Add New Bank Accounts
    When  Click on the element in LeftBar
      | setupLink    |
      | parameters   |
      | bankAccounts |
    Then User Add BankAccounts with ApachePOI
      | AddButton       |
      | nameInput       |
      | ibanInput       |
      | integrationCode |
      | currencySelect  |
      | CurrencyType    |
      | activeButtonOn  |
      | saveButton      |
      | successMessage  |

  @RegressionTest
  Scenario: Edit The Bank Accounts
    When  Click on the element in LeftBar
      | setupLink    |
      | parameters   |
      | bankAccounts |
    Then User Edit BankAccounts with ApachePOI
      | nameInputBank   |
      | searchButton    |
      | editButton      |
      | nameInput       |
      | ibanInput       |
      | integrationCode |
      | currencySelect  |
      | CurrencyType    |
      | activeButtonOff |
      | saveButton      |
      | successMessage  |

  @RegressionTest
  Scenario: Delete The Bank Accounts
    When Click on the element in LeftBar
      | setupLink    |
      | parameters   |
      | bankAccounts |
    Then  User Delete BankAccounts with ApachePOI
      | nameInputBank  |
      | searchButton   |
      | deleteIcon     |
      | deleteButton   |
      | successMessage |






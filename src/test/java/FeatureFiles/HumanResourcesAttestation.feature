Feature: Human Resources Functionality

  Background:
  Login with valid username and password
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in

  Scenario Outline: The Admin Add Edit and Delete Attestations under Human Resources

    When Click on the element in LeftBar
      | human resources     |
      | setupHumanResources |
      | attestations        |
    And Click on the Element in DialogPage
      | AddButton |
    Then User Sending Keys in DialogPage
      | nameInput | <name> |
    And Click on the Element in DialogPage
      | saveButton     |
      | successMessage |
    When  User Sending Keys in DialogPage
      | fieldNameInput | <nameEdit> |
    Then User Click SearchButton And EditButton
      | searchButton |
      | editButton   |
    And User Sending Keys in DialogPage
      | nameInput | <edit> |
    And Click on the Element in DialogPage
      | saveButton     |
      | successMessage |
    When  User Sending Keys in DialogPage
      | fieldNameInput | <deleteKey> |

    Then User Delete  Attestations under Human Resources
      | searchButton   |
      | deleteIcon     |
      | deleteButton   |
      | successMessage |

    Examples:
      | name   | nameEdit | edit     | deleteKey |
      | aa1234 | aa1234   | QA12     | QA12      |
      | aa1344 | aa1344   | TESTER12 | TESTER12  |
      | aa1454 | aa1454   | TESTER13 | TESTER13  |




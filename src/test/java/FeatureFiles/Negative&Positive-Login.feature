Feature: Login functionality

  Background:
    Given Navigate to website

  @SmokeTest
  Scenario Outline: Login with invalid username and invalid password
    And Enter username and password
      | userNameInput | <username> |
      | passwordInput | <password> |
    When  Click login button from DataTable
      | loginButton |
    Then User see The invalid  username or password warning
      | inValidUsernamePassword |

    Examples:
      | username    | password |
      | TecHnoStudy | shfK67   |
      | techNOStudy | lAsdA7   |
      | turkeyTs    | TechNO4  |
      | TURsEYtS    | alT67s   |
      | TechNOStudy | PlSA452  |

  @SmokeTest

  Scenario: Login with valid username and blank password
    And  Enter username and  do not enter password
    When Click login button
    Then Verify blank password Error

  @RegressionTest
  Scenario Outline: Login with valid username and password
    And Enter username and password
      | userNameInput | <username> |
      | passwordInput | <password> |
    When Click login button from DataTable
      | loginButton |
    Then Verify that user logged in from DataTable
      | loginVerify |
    Examples:
      | username | password       |
      | turkeyts | TechnoStudy123 |




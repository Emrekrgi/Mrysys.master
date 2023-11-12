Feature: Add Subjects functionality

  Background:
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in

@RegressionTest
  Scenario Outline: The User Add New Subject Categories under Education
    When  User Click to Education
    Then  User CLick to Setup
    And   User Click to Subject Categories
    And   User Create  New Subject Categories name as "<name>" and code as "<code>"
    And   Success Message should be displayed
    When  User Create  New Subject Categories name as "<name>" and code as "<code>"
    Then  Already exist message should be displayed
    Examples:

      | name   | code |
      | pamuk  | pam  |
      | seker  | sek  |
      | helva  | hel  |
      | pekmez | pek  |

  @RegressionTest
  Scenario Outline: The User Edit Subject Categories under Education
    When User Click to Education
    Then User CLick to Setup
    Then User Click to Subject Categories
    And  User Search the Category searchText as "<searchText>"
    And   User Edit  New Subject Categories name as "<name>" and code as "<code>"
    Then  Subject Category successfully updated message should be displayed


    Examples:
      | searchText | name    | code     |
      | pamuk      | pedro13 | er123122 |
      | seker      | johan13 | er233122 |
      | helva      | cisse13 | er343122 |
      | pekmez     | abdul13 | er433122 |

  @RegressionTest
  Scenario Outline: The User Delete Subject Categories under Education
    When User Click to Education
    Then User CLick to Setup
    Then User Click to Subject Categories
    And  User Search the Category searchText as "<searchText>"
    And  User Delete The Subject Categories
    Then Subject Category successfully deleted message should be displayed

    Examples:
      | searchText |
      | pedro13    |
      | johan13    |
      | cisse13    |
      | abdul13    |

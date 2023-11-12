Feature: Position Categories Management

  Background:
    Given Navigate to website
    And Enter username that as "username" and password that as "password"
    When Click login button
    Then Verify that user logged in

  Scenario: Add Position Categories
    When the user navigates to position categories
      | human resources         |
      | positionCategoriesSetup |
      | position categories     |
    And the user clicks on the add button
    And the user clicks on the save button
    Then the position categories should be added successfully

  Scenario: Edit Position Categories
    When the user navigates to position categories
      | human resources         |
      | positionCategoriesSetup |
      | position categories     |
    And the user clicks on the edit button
    Then position categories should be edited successfully

  Scenario: Delete Position Categories
    When the user navigates to position categories
      | human resources         |
      | positionCategoriesSetup |
      | position categories     |
    And the user clicks on the delete button
    Then position categories should be deleted successfully


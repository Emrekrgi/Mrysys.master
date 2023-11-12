Feature: School Departments Functionality

  Background:
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in

  @RegressionTest
  Scenario: Add New School Department
    When  Click on the element in LeftBar
      | setupLink   |
      | schoolSetup |
      | departments |
    Then  Click on the Element in DialogPage
      | AddButton |
    And User Add New School Departments with ApachePoi
      | nameInput      |
      | codeInput      |
      | activeButtonOn |
      | saveButton     |
      | successMessage |
    Then Success Message should be displayed

  @RegressionTest
  Scenario: Edit School Department
    When  Click on the element in LeftBar
      | setupLink   |
      | schoolSetup |
      | departments |
    Then  Click on the Element in DialogPage
      | activeButton |
      | editButton   |
    And  User Edit School Departments with ApachePOI
      | nameInput        |
      | codeInput        |
      | activeButtonOff  |
      | saveButton       |
      | successMessage   |
    Then Success Message should be displayed

  @RegressionTest
  Scenario: Delete The School Department
    When  Click on the element in LeftBar
      | setupLink   |
      | schoolSetup |
      | departments |
    And User Delete The Element On DialogPage
      | deleteIcon   |
      | deleteButton |
    Then Success Message should be displayed





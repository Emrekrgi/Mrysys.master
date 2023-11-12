Feature: Login Functionality

  @RegressionTest
  Scenario: Login with valid username and password
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in

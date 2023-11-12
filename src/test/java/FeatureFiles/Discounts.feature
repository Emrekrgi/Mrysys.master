Feature: Discounts Functionality

  Background:
  Login with valid username and password
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in

  Scenario:
    When  Click on the element in LeftBar
      | setupLink  |
      | parameters |
      | discounts  |

    Then User Add Discounts with ApachePOI
      | AddButton        |
      | descriptionInput |
      | integrationCode  |
      | priorityInput    |
      | activeButtonOn   |
      | saveCloseButton  |
      | successMessage   |

    When  User Edit Discounts with ApachePOI
      | descriptionField |
      | searchButton     |
      | editButton       |
      | descriptionInput |
      | integrationCode  |
      | priorityInput    |
      | activeButtonOff  |
      | saveCloseButton  |
      | saveCloseButton  |
      | successMessage   |

    And  User Delete Discounts with ApachePOI
      | descriptionField |
      | searchButton     |
      | deleteIcon       |
      | deleteButton     |
      | successMessage   |




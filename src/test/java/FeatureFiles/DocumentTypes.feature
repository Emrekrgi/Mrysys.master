Feature: Document Types Functionality

  Background:
  Login with valid username and password
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in

  Scenario: The User Add Edit And Delete Document Types under Setup -> Parameters Document Types
    When  Click on the element in LeftBar
      | setupLink     |
      | parameters    |
      | documentTypes |
    And User Add Document Types with ApachePOI
      | AddButton       |
      | nameInput       |
      | stageLink       |
      | selectStage     |
      | description     |
      | requiredChecked |
      | activeButtonOn  |
      | saveButton      |
      | successMessage  |

    Then User Edit Document Types with ApachePOI
      | fieldNameInput    |
      | searchButton      |
      | editButton        |
      | nameInput         |
      | description       |
      | requiredUnchecked |
      | useCamUnchecked   |
      | activeButtonOff   |
      | saveButton        |
      | successMessage    |

    And  User Delete Document Types with ApachePOI
      | fieldNameInput |
      | searchButton   |
      | deleteIcon     |
      | deleteButton   |
      | successMessage |






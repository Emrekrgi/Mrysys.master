Feature: Nationalities functionality

  Background:
  Login with valid username and password
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in

  Scenario: The User Add Edit And Delete Nationalities under Setup -> Parameters -> Nationalities
    When  Click on the element in LeftBar
      | setupLink     |
      | parameters    |
      | nationalities |

    Then User Add Nationalities with ApachePOI
      | AddButton      |
      | nameInput      |
      | saveButton     |
      | successMessage |

    When User Edit Nationalities with ApachePOI
      | nameInputNationalities |
      | searchButton           |
      | editButton             |
      | nameInput              |
      | saveButton             |
      | successMessage         |

    And User Delete Nationalities with ApachePOI

      | nameInputNationalities |
      | searchButton           |
      | deleteIcon             |
      | deleteButton           |
      | successMessage         |



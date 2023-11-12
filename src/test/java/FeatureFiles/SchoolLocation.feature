Feature:  School Location Functionality

  Background:
    Given Navigate to website
    And   Enter username that as "username" and password that as "password"
    When  Click login button
    Then  Verify that user logged in
@SmokeTest
  Scenario Outline:Add the School Locations
    When  Click on the element in LeftBar
      | setupLink   |
      | schoolSetup |
      | Locations   |

    Then  Click on the Element in DialogPage
      | AddButton |

    And   User Add the New School Locations
      | nameInput      | <name>      |
      | shortNameInput | <shortname> |
      | capacityInput  | <capacity>  |


    Then  User Click randomly LocationType
      | selectButton |
      | LocationType |

    When Click on the Element in DialogPage
      | activeButtonOn |
      | saveButton     |
    And   Success Message should be displayed
    Examples:
      | name   | shortname | capacity |
      | class1 | c1        | 11       |
  @SmokeTest
  Scenario Outline: Edit the School Locations

    When  Click on the element in LeftBar
      | setupLink   |
      | schoolSetup |
      | Locations   |

    Then  Click on the Element in DialogPage
      | activeButton |
      | editButton   |


    And   User Add the New School Locations
      | nameInput      | <name>      |
      | shortNameInput | <shortname> |
      | capacityInput  | <capacity>  |


    Then  User Click randomly LocationType
      | selectButton |
      | LocationType |

    When Click on the Element in DialogPage
      | activeButtonOff |
      | saveButton      |
    And   Success Message should be displayed

    Examples:
      | name   | shortname | capacity |
      | class2 | cs2       | 9        |
  @SmokeTest
  Scenario Outline: Negative Test in School Locations
    When  Click on the element in LeftBar
      | setupLink   |
      | schoolSetup |
      | Locations   |

    Then  Click on the Element in DialogPage
      | AddButton |

    And   User Add the New School Locations
      | nameInput      | <name>      |
      | shortNameInput | <shortname> |
      | capacityInput  | <capacity>  |

    When Click on the Element in DialogPage
      | activeButtonOn |
      | saveButton     |
    Then  Already exist message should be displayed

    Examples:
      | name   | shortname | capacity |
      | class2 | cs2       | 9        |

  @SmokeTest
  Scenario: User Delete the School Locations
    When  Click on the element in LeftBar
      | setupLink   |
      | schoolSetup |
      | Locations   |
    Then User Delete The Element On DialogPage
      | deleteIcon   |
      | deleteButton |
    Then Success Message should be displayed








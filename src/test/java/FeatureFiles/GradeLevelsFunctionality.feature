Feature: Grade Levels Functionality

  Background:
    Given Navigate to website
    And Enter username that as "username" and password that as "password"
    When Click login button
    Then Verify that user logged in

  Scenario Outline: Adding New Fields to the Admin Panel
    When the user navigates to Grade Levels
      | addingFieldsSetup |
      | parameters        |
      | gradeLevels            |

    And Click on the Element in DialogPage
      | AddButton |

    And User Sending Keys in DialogPage
      | nameInput      | <name>      |
      | shortNameInput | <shortName> |
      | orderInput     | <order>     |

    And Click on the save button in Dialog
      | saveButton |

    Then Success Message should be displayed

    And Click on the Element in DialogPage
      | nameButton |

    And Click on the EDIT Button

    And User Sending Keys in DialogPage
      | nameInput | <newName> |

    And Click on the Element in DialogPage
      | saveButton |

    Then Success Message should be displayed

    And Click on the Element in DialogPage
      | deleteIcon   |
      | deleteButton |

    Then Success Message should be displayed

    Examples:
      | name    | shortName      | newName          | order |
      | AAAAA   | GUJU           | AAAAAAUPDATED    |   1   |


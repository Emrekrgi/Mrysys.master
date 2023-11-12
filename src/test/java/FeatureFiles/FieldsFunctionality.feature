Feature: Fields Functionality

  Background:
    Given Navigate to website
    And Enter username that as "username" and password that as "password"
    When Click login button
    Then Verify that user logged in

  Scenario Outline: Adding New Fields to the Admin Panel
    When the user navigates to fields
      | addingFieldsSetup |
      | parameters        |
      | fields            |

    And Click on the Element in DialogPage
      | AddButton |

    And User Sending Keys in DialogPage
      | nameInput | <name> |
      | codeInput | <code> |

    And Click on the save button in Dialog
      | saveButton |

    Then Success Message should be displayed


    And User Sending Keys in DialogPage
      | fieldNameInput | <name> |

    And Click on the Element in DialogPage
      | searchButton |

    And Click on the EDIT Button

    And User Sending Keys in DialogPage
      | nameInput | <newName> |

    And Click on the Element in DialogPage
      | saveButton |

    Then Success Message should be displayed

    And User Sending Keys in DialogPage
      | fieldNameInput | <newName> |

    And Click on the Element in DialogPage
      | searchButton |

    And Click on the Element in DialogPage
      | deleteIcon   |
      | deleteButton |

    Then Success Message should be displayed

    Examples:
      | name    | code      | newName |
      | qwertyuu | asdfghjkl | zxcvbnm |


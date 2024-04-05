Feature: User Registration

  Scenario: 1 Successful Registartion
    Given the user is on the nopCommerce Register page
    When the user enters valid required details (Firstname: "Zenitsu", Lastname: "Agatsuma", Email:"cucumber_test3@gmail.com", Password: "test@123", ConfirmPassword: "test@123" )
    And the user clicks on the Register button
    Then the user should see a Registration completed message

  Scenario: 2 Un-Successful Registartion
    Given the user is on the nopCommerce Register page
    When the user enters existing details from below
      | Firstname       | Zenitsu                  |
      | Lastname        | Agatsuma                 |
      | Email           | cucumber_test3@gmail.com |
      | Password        | test@123                 |
      | ConfirmPassword | test@123                 |
    And the user clicks on the Register button
    Then the user should see an Error message

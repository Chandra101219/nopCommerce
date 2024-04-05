Feature: Addresses

  Scenario: Adding new Address
    Given the user is on the nopCommerce login page
    When the user enters valid credentials (username: "cucumber_test3@gmail.com", password: "test@123")
    And the user clicks on the Login button
    And the user navigates to the nopCommerce MyAccount page
    And user clicks on the Addresses module and AddNew button
    And the user Adds Address details from below
      | Firstname  | Naruto                   |
      | Lastname   | Uzumaki                  |
      | Email      | cucumber_test2@gmail.com |
      | Country    | Japan                    |
      | City       | Konoha                   |
      | Address1   | Ninja house              |
      | Postalcode |                   548967 |
      | Phone      |               9876543210 |
    And the user clicks on the Save button
    Then the user should see a message saying address added

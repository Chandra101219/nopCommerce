Feature: User Login

  Scenario: 1 Login with valid credentials
    Given the user is on the nopCommerce login page
    When the user enters valid credentials (username: "cucumber_test3@gmail.com", password: "test@123")
    And the user clicks on the Login button
    Then the user should be redirected to the My Account page
    And the user should see a welcome message

  Scenario: 2 Login with invalid credentials
    Given the user is on the nopCommerce login page
    When the user enters invalid credentials (username: "cucumber_test123@gmail.com", password: "test12@123")
    And the user clicks on the Login button
    Then the user should be stays in the Login page
    And the user should see an error message

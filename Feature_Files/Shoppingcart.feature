Feature: Shopping Cart

  Scenario: view product in Shopping cart 
    Given the user is on the nopCommerce login page
    When the user enters valid credentials (username: "cucumber_test3@gmail.com", password: "test@123")
    And the user clicks on the Login button
    And the user navigates to shopping cart by clicking on hyperlink
    And the user clicks on terms&conditions checkbox and Checkout
    And the user navigated to Checkout page and Address loads from Addresses
    And the user selects deliverymethod and clicks on continue
    And the user selects payment method, verifies payment info and clicks on continue
    And the user clicks on confirm order
    Then the user get Order placed successfully with order id
    
    
    

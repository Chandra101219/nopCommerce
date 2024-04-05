Feature: Search Product

  Scenario: search for Product
    Given the user is on the nopCommerce login page
    When the user enters valid credentials (username: "cucumber_test3@gmail.com", password: "test@123")
    And the user clicks on the Login button
    And the user search for a product (productName: "HTC")
    And the user clicks on the required product from search result
    And the user navigates to the product details page and updates quantity (quantity: "2")
    And the user clicks on Add to cart button
    Then the user should see a message Added to cart Successfully

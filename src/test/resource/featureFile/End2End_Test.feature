Feature: User Checkout Flow on Magento website
  
  I want to test luma app by creating acount, login, searching a product, select a product, add to cart, procced to checkout,
  shipping address, shipping methods, review and payments, place order, success page

  Scenario: Complete checkout process on the Magento website
    Given I visit the Magento website
    When I click on the Create an Account linktext
    And I fill in the registration details with the following:
      | First Name       | John                 |
      | Last Name        | Doe                  |
      | Email            | john.doe@example.com |
      | Password         | P@ssw0rd             |
      | Confirm Password | P@ssw0rd             |
    And I click on Create an account button
    Then I should see the "Thank you for registering with Main Website Store." message
    And I click on logout from the application
    Then I should see the "You are signed out" message
    When I click on the Sign In linktext
    And I enter valid credentials with the following:
      | Email    | john.doe@example.com |
      | Password | P@ssw0rd             |
    And I click on the "Login" button
    Then I should be logged in successfully and redirected to the homepage
    When I search for a product "T-shirt"
    Then I should see a list of products related to "T-shirt"
    When I select a product "Balboa Persistence Tee"
    Then I should be taken to the product details page
    And I choose my "size","color" and "quantity" of the product
    When I click on "Add to Cart"
    Then the product should be added to the cart
    And I should see the "You added Balboa Persistence Tee to your shopping cart." message
    When I Navigate to Cart page
    When I click on the "Proceed to Checkout" button
    Then I should be taken to the checkout page
    When I enter the shipping address with the following:
      | First Name     | John          |
      | Last Name      | Doe           |
      | Street Address | 123 Main St   |
      | City           | Los Angeles   |
      | State          | California    |
      | Zip Code       |         90001 |
      | Country        | United States |
      | Phone Number   |    1234567890 |
    And I click on the Ship here button
    Then the shipping address should be updated
    When I select a shipping method Fixed
    And I click on the Next button
    Then the shipping method should be updated
    When I check the checkbox of -My billing and shipping address are the same
    When I review my order and see the following:
      | Product Name           | Quantity | Price  |
      | Balboa Persistence Tee |        1 | $34.00 |
    And the total price should be displayed correctly
    And I click on the -Place Order- button
    Then I should be redirected to the order confirmation page
    Then I should see the "Thank you for your purchase!" message
    And the order number should be displayed
    And I should have option to Print Receipt and Continue Shopping
    When I click on Order Number
    Then I navigate to Order details page
    And I review my order and see the following:
      | Product Name           | Quantity | Price  | Size | Color  | Grand Total | Shipping Method   | Payment Method      |
      | Balboa Persistence Tee |        1 | $29.00 | M    | Orange | $34.00      | Flat Rate - Fixed | Check / Money order |
    And the order status should be Pending
    And I should be have option to Print my Order
    And I should have option to Reorder

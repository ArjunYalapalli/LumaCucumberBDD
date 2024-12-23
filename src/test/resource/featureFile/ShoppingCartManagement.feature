Feature: Shopping Cart Management on Magento Software Testing Board

  Scenario: Add a product to the cart
    Given I am on the "Women" category page
    When I click on the "Floral Dress" product
    And I click the "Add to Cart" button
    Then the product should be added to the shopping cart
    And the shopping cart icon should display "1 item"

  Scenario: Remove a product from the cart
    Given I have added a "Floral Dress" to my cart
    When I open the shopping cart
    And I click the "Remove" button next to "Floral Dress"
    Then the shopping cart should be empty

  Scenario: Update quantity of items in the cart
    Given I have added "Floral Dress" to my cart
    When I open the shopping cart
    And I change the quantity of "Floral Dress" to 2
    Then the total price should update accordingly

  Scenario: Proceed to checkout
    Given I have items in my cart
    When I click on the "Proceed to Checkout" button
    Then I should be redirected to the checkout page

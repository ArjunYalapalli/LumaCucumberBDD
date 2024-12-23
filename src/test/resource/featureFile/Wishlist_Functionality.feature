Feature: Wishlist Management on Magento Software Testing Board

  Scenario: Add a product to the wishlist
    Given I am on the "Women" category page
    When I click on the "Black Jacket" product
    And I click the "Add to Wishlist" button
    Then the product should be added to my wishlist
    Then I should see the "Item added to your wishlist" message

  Scenario: View wishlist
    Given I have added items to my wishlist
    When I navigate to the "Wishlist" page
    Then I should see all the products in my wishlist

  Scenario: Remove a product from the wishlist
    Given I have added the "Black Jacket" to my wishlist
    When I navigate to the "Wishlist" page
    And I click the "Remove" button next to "Black Jacket"
    Then "Black Jacket" should be removed from my wishlist

  Scenario: Add a product to cart from wishlist
    Given I have products in my wishlist
    When I click the "Add to Cart" button next to an item in my wishlist
    Then that item should be added to my shopping cart
    And I should see the cart icon display the correct item count

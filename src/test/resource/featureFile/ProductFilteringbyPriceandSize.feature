Feature: Product Filtering by Price and Size

  Scenario: Filter products by price range
    Given I am on the "Women" category page
    When I apply the filter for "Price" with a range of "$30 - $50"
    Then I should see products within the price range "$30 - $50"

  Scenario: Filter products by size
    Given I am on the "Men" category page
    When I apply the filter for "Size" with option "M"
    Then I should see only products that are available in size "M"

  Scenario: Apply multiple filters (price and size)
    Given I am on the "Women" category page
    When I apply the filter for "Price" with a range of "$20 - $40"
    And I apply the filter for "Size" with option "S"
    Then I should see only products in the price range "$20 - $40" and size "S"

  Scenario: Reset product filters
    Given I have applied filters for price and size
    When I click on the "Reset Filters" button
    Then I should see all products displayed without any filters applied

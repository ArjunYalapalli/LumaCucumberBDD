Feature: Product search on Magento website
  
  As a customer,
  I want to be able to search for a product,
  So that I can view the product details and add it to the cart.

  Background: 
    Given I visit the Magento website

  Scenario: Search for a product by name
    When I search for "T-shirt" in the search bar
    Then I should see a list of products related to "T-shirt"

  Scenario: Search for a product that exists
    When I search for "Jacket"
    Then I should see products related to "Jacket"
    And the search results page should contain "Jacket"

  Scenario: Search for a product that doesn't exist
    When I search for "NonexistentProduct"
    Then I should see the "Your search returned no results." message

  Scenario: Search for a product using an incorrect spelling
    When I search for "Shooes" (misspelling of "Shoes")
    Then I should see a suggestion to search for "Shoes"
    And I should be able to click on the suggested product "Shoes"

  Scenario: Search for a product using a partial name
    When I search for "T-sh"
    Then I should see a list of products that contain "T-sh" in their names
    And the list should include "T-shirt"

  Scenario: Check if search results are sorted correctly
    When I search for "Sweater"
    Then I should see the products sorted by relevance or price (depending on sorting options)
    And I should be able to sort the products by "Price: Low to High" or "Price: High to Low"

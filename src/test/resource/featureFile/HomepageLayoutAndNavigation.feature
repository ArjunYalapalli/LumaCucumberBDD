Feature: Homepage Layout and Navigation on Magento Software Testing Board

  Scenario: Verify homepage layout
    Given I am on the homepage
    Then I should see the header with the logo, search bar, and navigation links
    And I should see the main banner image
    And I should see product categories displayed in a grid format

  Scenario: Navigate to the "Men" category from the homepage
    Given I am on the homepage
    When I click on the "Men" category in the navigation menu
    Then I should be redirected to the "Men" category page
    And I should see a list of men's products

  Scenario: Verify footer content
    Given I am on the homepage
    Then I should see the footer with links to "Privacy Policy", "Terms of Service", and "Contact Us"
    And I should see the social media icons in the footer

  Scenario: Check search bar functionality on homepage
    Given I am on the homepage
    When I enter the search term "Sneakers" into the search bar
    And I press the "Search" button
    Then I should be redirected to the search results page
    And I should see products related to "Sneakers"

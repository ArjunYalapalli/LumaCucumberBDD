Feature: Checkout Process on Magento Software Testing Board

  Scenario: Successful checkout with valid payment details
    Given I have items in my cart
    When I proceed to checkout
    And I enter valid shipping details
    And I enter valid payment details
    Then I should see an order confirmation message
    And I should receive an order confirmation email

  Scenario: Checkout with missing shipping details
    Given I have items in my cart
    When I proceed to checkout
    And I leave the shipping details blank
    Then I should see an error message "Please enter your shipping details"

  Scenario: Checkout with invalid payment details
    Given I have items in my cart
    When I proceed to checkout
    And I enter valid shipping details
    And I enter invalid payment details
    Then I should see an error message "Invalid payment details"

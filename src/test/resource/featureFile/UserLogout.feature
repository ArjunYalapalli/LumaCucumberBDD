Feature: User Logout Functionality on Magento Software Testing Board

  Scenario: Logout after a successful login
    Given I am logged in to my account
    When I click on the "Logout" button
    Then I should be logged out successfully
    And I should be redirected to the homepage
    And I should see the "Login" button


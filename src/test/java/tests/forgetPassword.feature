Feature: Forgot Password functionality on Magento Software Testing Board website
  
  As a user who has forgotten their password,
  I want to be able to reset my password through the Forgot Password option,
  So that I can regain access to my account.

  Background: 
    Given I am on the Sign In page

  Scenario: User clicks on the Forgot Your Password? link
    When I click on the "Forgot Your Password?" link
    Then I should be redirected to the Forgot Your Password page

  Scenario: User enters a valid email address to reset password
    Given I am on the Forgot Your Password page
    When I enter a valid email address in the email field
    And I click on the "Reset Password" button
    Then I should see a confirmation message "We have sent you an email with a link to reset your password."

  Scenario: User submits a blank email field
    Given I am on the Forgot Your Password page
    When I leave the email field blank
    And I click on the "Reset Password" button
    Then I should see an error message "This is a required field."

  Scenario: User submits a invalid email field
    Given I am on the Forgot Your Password page
    When I enter a invalid email address in the email field
    And I click on the "Reset Password" button
    Then I should see a confirmation message "Please enter a valid email address (Ex: johndoe@domain.com)."
Feature: Forgot Password functionality on Magento Software Testing Board website

  Background: 
    Given I am on the Sign In page

  @all @regression @smoke @forgetPassword
  Scenario: User clicks on the Forgot Your Password? link
    When I click on the Forgot Your Password? link
    Then I should be redirected to the Forgot Your Password page

  @forgetPassword @all
  Scenario: User enters a valid email address to reset password
    Given I am on the Forgot Your Password page
    When I enter a valid email address in the email field
    And I click on the Reset Password button
    Then I should see a confirmation message "If there is an account associated with arjunyalapalli44@gmail.com you will receive an email with a link to reset your password."

  @forgetPassword @all @sanity
  Scenario: User submits a blank email field
    Given I am on the Forgot Your Password page
    When I leave the email field blank
    And I click on the Reset Password button
    Then I should see an error message "This is a required field."

  @forgetPassword @all @arjun
  Scenario: User submits a invalid email field
    Given I am on the Forgot Your Password page
    When I enter a invalid email address in the email field
    And I click on the Reset Password button
    Then I should see a confirmation message "Please enter a valid email address (Ex: johndoe@domain.com)."

Feature: Login to Magento Website

  Background: 
    Given I visit the Magento website

  @all @login @regression
  Scenario: User successfully logs in with valid credentials
    When I click on the Sign In linktext
    And I enter the username "testUser456@gmail.com"
    And I enter the password "Test@123"
    And I click on the Sign In button
    Then I should see the "Welcome, test test1!" message

  @all @login @sanity
  Scenario: User logs in with invalid creadentials
    When I click on the Sign In linktext
    And I enter the username "invalid456@gmail.com"
    And I enter the password "invalid@123"
    And I click on the Sign In button
    Then I should see the "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later." message

  @all @login @smoke @arjun
  Scenario: User logs in with blank fields
    When I click on the Sign In linktext
    And I dont enter the username
    And I dont enter the password
    And I click on the Sign In button
    Then I should see the "This is a required field." message

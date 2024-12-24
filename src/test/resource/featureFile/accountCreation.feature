Feature: account creation

  @all @regression @accountCreation
  Scenario Outline: account creation of new member
    Given I visit the Magento website
    And I click on the Create an Account linktext
    When I enter the first name "<firstName>"
    And I enter the last name "<lastname>"
    And I enter the email "<email>"
    And I enter the Password "<password>"
    And I enter the confirm password "<confirmPassword>"
    Then I click on Create an account button
    Then I should see the "Thank you for registering with Main Website Store." message

    Examples: 
      | firstName | lastname | email           | password  | confirmPassword |
      | name1     | Ln1      | name1@gmail.com | name1@123 | name1@123       |
      | name2     | ln2      | name2@gmail.com | name2@123 | name2@123       |
      | name3     | ln3      | name3@gmail.com | name3@123 | name3@123       |

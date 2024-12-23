Feature: Account Information Management on Magento Software Testing Board

  # Scenario 1: View Account Information
  Scenario: View account information after successful login
    Given I am logged in to my account
    When I navigate to the "Account Information" page
    Then I should see my account details including my first name, last name, email, and phone number

  Scenario: View account information when not logged in
    Given I am not logged in
    When I try to access the "Account Information" page
    Then I should be redirected to the login page
    And I should see the "Please log in to view your account information" message

  # Scenario 2: Update Account Information
  Scenario: Successfully update account information
    Given I am logged in to my account
    When I navigate to the "Account Information" page
    And I update my first name to "UpdatedName" and my email to "updatedemail@example.com"
    And I click on the "Save Changes" button
    Then I should see the "Your account information has been updated" message
    And my updated details should be displayed on the "Account Information" page

  Scenario: Update account information with invalid email
    Given I am logged in to my account
    When I navigate to the "Account Information" page
    And I update my email to "invalidemail"
    And I click on the "Save Changes" button
    Then I should see an error message "Please enter a valid email address"

  Scenario: Update account information with missing fields
    Given I am logged in to my account
    When I navigate to the "Account Information" page
    And I leave the "Last Name" field blank
    And I click on the "Save Changes" button
    Then I should see an error message "This field is required"

  # Scenario 3: Change Password
  Scenario: Successfully change account password
    Given I am logged in to my account
    When I navigate to the "Change Password" section
    And I enter the current password "currentpassword123"
    And I enter a new password "newpassword456"
    And I confirm the new password "newpassword456"
    And I click on the "Save Changes" button
        Then I should see the "Your password has been changed successfully" message
    

  Scenario: Change password with incorrect current password
    Given I am logged in to my account
    When I navigate to the "Change Password" section
    And I enter an incorrect current password "wrongpassword"
    And I enter a new password "newpassword456"
    And I confirm the new password "newpassword456"
    Then I should see an error message "The current password is incorrect"

  # Scenario 4: Reset Account Information (Delete Account)
  Scenario: Successfully delete account
    Given I am logged in to my account
    When I navigate to the "Account Information" page
    And I click on the "Delete Account" button
    And I confirm my action by clicking "Yes, delete my account"
    Then I should see a confirmation message "Your account has been deleted successfully"
    And I should be logged out and redirected to the homepage

  Scenario: Attempt to delete account without confirmation
    Given I am logged in to my account
    When I navigate to the "Account Information" page
    And I click on the "Delete Account" button
    And I do not confirm the deletion
    Then I should remain on the "Account Information" page
    And I should see the "Account deletion was not completed" message

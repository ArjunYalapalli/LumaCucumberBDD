Feature: Product review functionality on Magento website
  
  As a customer,
  I want to be able to write a review for a product,
  So that I can share my feedback and help other customers make informed decisions.

  Scenario: Submit a product review successfully
    Given I am on the product page for "T-shirt"
    And I am logged into my account
    When I write a review with the title "Great Quality!" and the content "This T-shirt is very comfortable and fits well."
    And I rate the product 5 stars
    And I click the "Submit Review" button
    Then I should see a confirmation message that my review has been submitted
    And I should see my review appear on the product page with the rating and content

  Scenario: Submit a review without logging in
    Given I am on the product page for "Jacket"
    When I try to write a review with the title "Very Stylish" and the content "This jacket looks amazing."
    And I try to submit the review without being logged in
    Then I should see a prompt asking me to log in or create an account to submit a review

  Scenario: Submit a review with missing title
    Given I am on the product page for "Sweater"
    And I am logged into my account
    When I write a review with the content "The sweater is soft and warm."
    And I rate the product 4 stars
    And I click the "Submit Review" button
    Then I should see a validation message saying "Title is required"

  Scenario: Submit a review with invalid rating
    Given I am on the product page for "Shoes"
    And I am logged into my account
    When I write a review with the title "Not Comfortable" and the content "These shoes hurt my feet."
    And I try to rate the product with a rating of 6 stars (which is outside the valid range of 1-5)
    Then I should see an error message saying "Rating must be between 1 and 5 stars"

  Scenario: View product reviews
    Given I am on the product page for "Sneakers"
    When I scroll down to the reviews section
    Then I should see a list of all submitted reviews for this product
    And each review should display the reviewer's name, rating, title, and review content

  Scenario: Sort reviews by highest rating
    Given I am on the product page for "T-shirt"
    When I view the list of product reviews
    And I select "Sort by: Highest rating"
    Then the reviews should be sorted so that the highest-rated reviews appear first

  Scenario: Report an inappropriate review
    Given I am on the product page for "Laptop"
    When I view a review titled "Worst purchase ever" that contains inappropriate content
    Then I should see a "Report Review" option next to the review
    When I click the "Report Review" option
    Then I should see a confirmation message saying "Thank you for reporting this review. We will look into it."

  Scenario: Submit a review with an image
    Given I am on the product page for "Backpack"
    And I am logged into my account
    When I write a review with the title "Perfect for travel" and the content "Great backpack for carrying my essentials!"
    And I upload an image of the product I purchased
    And I rate the product 4 stars
    And I click the "Submit Review" button
    Then I should see the image uploaded alongside my review on the product page

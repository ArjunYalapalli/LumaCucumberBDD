Feature: Managing My Orders on Magento Software Testing Board

  # Scenario 1: View Order History
  Scenario: View order history with multiple orders
    Given I am logged in to my account
    When I navigate to the "My Orders" page
    Then I should see a list of all my previous orders with order numbers, dates, and total amounts

  Scenario: View order history with no orders
    Given I am logged in to my account
    When I navigate to the "My Orders" page
    Then I should see the "You have no orders yet" message
    And I should be prompted to browse products and make my first order

  # Scenario 2: View Order Details
  Scenario: View details of a specific order
    Given I am logged in to my account
    And I have at least one order in my order history
    When I click on an order from the order history list
    Then I should see the detailed information for that order, including product names, quantities, prices, shipping details, and payment method

  Scenario: View order details for an order that is being processed
    Given I am logged in to my account
    And I have an order with the status "Processing"
    When I click on the "Processing" order in the "My Orders" page
    Then I should see the status "Processing" displayed
    And I should see the "Your order is being processed" message

  # Scenario 3: Track Order Status
  Scenario: Track the delivery status of an order
    Given I am logged in to my account
    And I have an order with the status "Shipped"
    When I view the order details
    Then I should see the shipping carrier and tracking number
    And I should see a link to track the shipment

  Scenario: Track order with "Pending" status
    Given I am logged in to my account
    And I have an order with the status "Pending"
    When I view the order details
    Then I should see the status "Pending" displayed
    And I should see the "Your order is awaiting payment confirmation" message

  # Scenario 4: Reorder Previous Items
  Scenario: Reorder items from a previous order
    Given I am logged in to my account
    And I have an order with the status "Complete"
    When I view the order details for this order
    And I click the "Reorder" button
    Then I should be redirected to the cart with all items from the previous order added to the cart

  Scenario: Attempt to reorder from an incomplete order
    Given I am logged in to my account
    And I have an order with the status "Pending"
    When I view the order details for this order
    And I click on the "Reorder" button
    Then I should see an error message "You cannot reorder from an incomplete or pending order"

  # Scenario 5: Cancel an Order
  Scenario: Cancel an order with "Pending" status
    Given I am logged in to my account
    And I have an order with the status "Pending"
    When I view the order details for this order
    And I click on the "Cancel Order" button
    Then I should see a confirmation message "Are you sure you want to cancel this order?"
    When I confirm, the order should be marked as "Canceled" 
    And I should see the "Your order has been canceled successfully" message

  Scenario: Attempt to cancel an order with "Shipped" status
    Given I am logged in to my account
    And I have an order with the status "Shipped"
    When I view the order details for this order
    And I click on the "Cancel Order" button
    Then I should see an error message "You cannot cancel a shipped order"
    And the order status should remain "Shipped"

  # Scenario 6: Return an Order
  Scenario: Return a product from a completed order
    Given I am logged in to my account
    And I have an order with the status "Complete"
    When I view the order details for this order
    And I click the "Return" button next to a product
    Then I should see a form to fill out the return request
    And after submitting, I should see a confirmation message "Return request submitted successfully"

  Scenario: Attempt to return a product from a canceled order
    Given I am logged in to my account
    And I have an order with the status "Canceled"
    When I view the order details for this order
    And I click the "Return" button next to a product
    Then I should see an error message "You cannot return products from a canceled order"

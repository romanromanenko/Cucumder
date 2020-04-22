Feature: Create new user

  Scenario: Create new user
    Then Click login button
    Then Input information about new user and create him

  Scenario: Buy item
    Then Login user
    Then Open start page
    Then Open information about item
    Then Add item to cart
    Then Check cart
    Then Buy item by check

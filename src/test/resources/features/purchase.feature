Feature: Purchase E2E test
  Background:
    Given The user is on login page
    When The user enters "standard_user" and "secret_sauce" credentials


Scenario: Sauce Purchase
  When The user should be able to sort product "Price (high to low)"
    And The user selects the cheapest item "6"
    And The user selects the cheapest item "2"
    And The user clicks the open the basket
    Then The user verifys the header "Your Cart"
    And The user checks out
    Then The user verifys the header "Checkout: Your Information"
    And The user enters name "Beytullah", lastname "Oguz" and zipcode "06834" and click
    Then The user verifys the header "Checkout: Overview"
    And The user clicks finish button
    Then The user verifys the header "Checkout: Complete!"




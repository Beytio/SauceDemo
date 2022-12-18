Feature: Login Test

  @wip

  Scenario: Login as a standart_user
  Given The user is on login page
  When The user enters "standard_user" and "secret_sauce" credentials
  Then The user verifys the header "Products"


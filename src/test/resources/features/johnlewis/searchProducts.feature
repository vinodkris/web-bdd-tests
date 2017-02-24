@searchProducts

  Feature: Search for products from john lewis home page

    As a customer
  When I search for a product from john lewis home page
  Then I should see products relevant to my search

    Background:
      Given I navigate to "http://www.johnlewis.com/"

  Scenario: search for beats wireless headphones




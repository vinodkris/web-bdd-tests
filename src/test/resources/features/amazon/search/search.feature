@search
Feature: Search item in amazon
As a user of Amazon
I should be able to search for an item
So that I can see the item availability and purchase details


@smoke
Scenario Outline: verify searched items are displayed
  Given I navigate to "http://www.amazon.co.uk"
  When I search for "<item>"
  Then the list displaying searched items should display
  Examples:
    |item|
    |macbook|


@smoke
Scenario Outline: verify searched items auto-select departments
  Given I navigate to "http://www.amazon.co.uk"
  When I search for "<item>"
  Then the search in dropdown should be auto selected to "<Department>"
  Examples:
  |item|Department|
  |watch|Watches|
  |macbook|All|

@smoke
Scenario Outline: verify on clicking one of the results of searched item displays the item clicked
  Given I navigate to "http://www.amazon.co.uk"
  When I search for "<item>"
  And clicked on one of the result item
  Then the "<info>" about that item must be displayed
  Examples:
  |item|info|
  |macbook|macbook|

@smoke
Scenario Outline: verify search on a specific department
  Given I navigate to "http://www.amazon.co.uk"
  When I select "<department>" from departments
  When I search for "<item>"
  And clicked on one of the result item
  Then the "<info>" about that item must be displayed
  Examples:
    |item|info|department|
    |macbook|macbook|Computers|

@smoke
Scenario Outline: verify filtering with prime will only display products available on prime
  Given I navigate to "http://www.amazon.co.uk"
  When I search for "<item>"
  And filter result available with prime
  Then all displayed products should be available with prime
  Examples:
    |item|info|
    |macbook|macbook|
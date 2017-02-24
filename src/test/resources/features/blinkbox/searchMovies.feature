@bbsearchMovie
Feature: Search movies in blinkbox

As a user of blinkbox
I should be able to search for movies
So that I will be informed on the availablity of a movie on blinkbox

Background:
    Given I have launched a browser instance
    And I set the browser dimensions to the specified size
      | width | height |
      | 1280  | 770    |

Scenario: search for movies from blinkbox home page
	Given I navigate to "http://www.blinkbox.com/"
	When I search for movie "Notting hill"
	Then the search results should display "Notting hill" on the search results
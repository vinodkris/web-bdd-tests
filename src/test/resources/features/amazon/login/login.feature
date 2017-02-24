@login
Feature: Login to Amazon

As a registered user of Amazon
When I enter my login details
And click login
I should be able to login
So that I can shop

Scenario: login widget on amazon homepage
	Given I navigate to "http://www.amazon.co.uk"
	Then I should see the login widget



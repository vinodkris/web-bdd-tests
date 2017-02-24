@orders
Feature: orders sections under your account page
As a customer of amazon
when i logged in to amozon
and navigate to your account section
I should see the orders section
so that i can view and track my orders

Background:
Given I am on login page
When I enter login details
|username			    |password| accountname |
|vinodkris123@gmail.com |chimba123| vinod      |
And on clicking login

Scenario: Orders section in account page
Given amazon home page is displayed   	
When clicked on your account
Then I should see Your orders button

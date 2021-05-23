Feature: Home Page
In order to check my order details
As a Regustered user
I want to specify the features of order details page

Background:
Given A Register user exists
Given User is on Amazon Login Page
When User enters username
And User enters password
And User Clicks on Login Button
Then User navigated to Order Page

Scenario: Check Previous Order Details
When user clicks on Previous Order link
Then User checks Previous Order Details

Scenario: Check Open Order Details
When user clicks on Open Order link
Then User checks Open Order Details

Scenario: Check Cancelled Order Details
When user clicks on Cancelled Order link
Then User checks Cancelled Order Details

Feature: Login Feature

Scenario Outline: Login Fail - possible combinations
Given User is on Application Landing Page
When User clicks on login Button
Then User is diplayed login screen
When User enters "<username>" in Username
And  User enters "<password>" in Password
And User clicks Sign In button
Then User gets login failure

Examples:
| Username          | Password          |
| incorrectusername | 12345             |
| smehra16          | incorrectpassword |
| incorrectusername | incorrectpassword |

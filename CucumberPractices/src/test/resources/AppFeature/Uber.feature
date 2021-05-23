@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking Cab
Given User wants to select a car type "sedan" from uber app
When User selects car "sedan" and pickup point as "Delhi" and drop location as "Phagwara"
Then Driver starts the journey
And Driver ends the Journey
Then User pays 1000 USD

@Regression
Scenario: Booking Cab
Given User wants to select a car type "SUV" from uber app
When User selects car "sedan" and pickup point as "Blr" and drop location as "Hyd"
Then Driver starts the journey
And Driver ends the Journey
Then User pays 1000 USD

@Smoke @Prod
Scenario: Booking Cab
Given User wants to select a car type "mini" from uber app
When User selects car "sedan" and pickup point as "Pune" and drop location as "Mumbai"
Then Driver starts the journey
And Driver ends the Journey
Then User pays 1000 USD






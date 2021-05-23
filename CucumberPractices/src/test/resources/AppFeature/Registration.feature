Feature: User Registration

Scenario: User registration with different data
Given User is on Registration Page
When User enters following User details
	| Sankalpa | Mehra | sank@gmail.com | 99999 | Delhi |
	| Saniya | Sharma | sani@gmail.com | 4446833 | Pune |
	| Sakshi | Gupts | sak@gmail.com | 888777 | Mumbai |
Then User Registration should be successful

Scenario: User registration with different data with columns
Given User is on Registration Page
When User enters following User details with columns
	| firstname | lastname | email | phome | city |
	| Sankalpa | Mehra | sank@gmail.com | 99999 | Delhi |
	| Saniya | Sharma | sani@gmail.com | 4446833 | Pune |
	| Sakshi | Gupts | sak@gmail.com | 888777 | Mumbai |
Then User Registration should be successful

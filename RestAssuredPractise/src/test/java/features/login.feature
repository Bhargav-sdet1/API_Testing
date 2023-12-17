Feature: Application Login

Scenario: User navigate to Home page
Given user is on login page
When user login with valid username "Ram" and password "1234"
Then Verify Home page is displayed

Scenario: User navigate to Home page
Given user is on login page
When user login with valid username "Sita" and password "2345"
Then Verify Home page is displayed

Feature: Application Login

Scenario: User navigate to Home page
Given user is on login page
When user login with valid username and password
Then Verify Home page is displayed

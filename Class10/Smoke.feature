Feature: login verification 
#verify homepage category


Background:

Given browser is open 

Scenario: faecbook login verification
Given i go to facebook
And page is verified 
When look for login/sign in button//locator
And put valid username
And put valid password
Then i should be logged in 
And i should be able to check my notification


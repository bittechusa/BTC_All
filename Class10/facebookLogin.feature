Feature: facebook login validation

Background:
Given i open browser
|firefox|
|chrome|
And i nevigate to facebook homePage

@reg
Scenario: successfull login

When i type valid email in userIDBox
And i type valid password in passwordBox
And i click on logIn button
Then i should be on my profile page


@smoke
Scenario Outline: invalid  login scenario

When i type invalid email in "<userIDBox>"
And i type invalid password in "<passwordBox>"
And i click on logIn button
Then i should not be on my profile page


Examples:
|userIDBox| passwordBox|
|shahid|a1233432543|
|fdzfsdaf|a1234|
|dfsjdfh|sdfgusdjgf|

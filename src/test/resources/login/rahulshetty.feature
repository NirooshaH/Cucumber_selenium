Feature: login to page and palce order

Background:
Given Open the browser and go to the login page of order placing site

@positivetest
Scenario Outline: checking for valid creds and placing order
When user enter a valid UN "<Username>"
Then  user enter a valid PWD "<Password>"
Then click on login button
And validate the login sussfull! 
Then click 

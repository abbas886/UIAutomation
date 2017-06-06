Feature: User Login 

Scenario: 
   User navigates to Activity Stream web site
   Given    Open web site 



Scenario: Click Register Button
When I click register button
Then open registration page

Scenario: Click Login Button
When I click login button
Then open login page

Scenario: Registration process
Given I am in registration page
When I entered id as <"Sachine">
And I entered name as <"Sachine@gmail.com">
And I entered passwordsignup as <"Sachine">
And I entered passwordsignup_confirm as <"Sachine">
And click on Register button
Then open login page
   
   
Scenario: Enter valid credentials
When I entered username as <"Abbas">
And  password as <"Abbas">
And click on submit button
Then open home page

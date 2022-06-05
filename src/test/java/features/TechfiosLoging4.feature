@LogingFeature4
Feature: TechFios Billing Functionality validation

@LgScenario 
Scenario: 1 User should be abel to loing valid account
Given User is on  the TechFios loign page
When User enters "username" from Techfios database
When User enters "password" from Techfios database
When user clicks signin button
Then User should land on the dashbord page 


@LogingFeature @Regression
Feature: TechFios Billing Functionality validation

@Scenario1 @smoke
Scenario: 1 User should be abel to loing valid account
Given User is on  the TechFios loign page
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
When user clicks signin button
Then User should land on the dashbord page 

@Scenario2
Scenario: 2 User should be abel to loing valid account
Given User is on  the TechFios loign page
When User enters username as "demo@techfios.com"
When User enters password as "abc1234"
When user clicks signin button
Then User should land on the dashbord page 
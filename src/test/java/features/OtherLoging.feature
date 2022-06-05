@OtherLogingFeature @Regression
Feature: TechFios other Billing Functionality validation

Background:
  Given User is on  the TechFios loign page
 
  
@OtherScenario1 @smoke
Scenario Outline: 1 User should not abel to loing valid account from Database
When User enters username as "<username>"
When User enters password as "<password>"
When user clicks signin button
Then User should land on the dashbord page 

Examples:
|username|password|
|demo2@techfios.com|abc123|
|demo@techfios.com|abc1234|
|demo2@techfios.com|abc1234|

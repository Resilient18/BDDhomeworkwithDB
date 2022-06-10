@NewAccountFromDB  @Regression

Feature: TechFios Bank and cash New Account Functionality Validation

@DbScenario1
Scenario: User should be able to login with valid credentials and open a new account 
Given User is on the Techfios login page
When User enters "username" from TechFios database 
When User enters "password" from TechFios database
When User clicks signin button 
Then User should land on dashboard page
 
And User clicks bankCash button 
When User clicks newAccount
Then User enters "accounttitle" from TechFios database
Then User enters  "description" from TechFios database
Then User enters  "balance" from TechFios database
Then User enters  "accountNumber" from TechFios database
Then User enters  "contactPerson" from TechFios database
Then User enters  "phoneNumber" from TechFios database
Then User enters  "internetBankingUrl" from TechFios database
And User clicks submit button 
Then User should land on account page

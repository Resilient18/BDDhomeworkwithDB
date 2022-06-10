$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/NewAccount.feature");
formatter.feature({
  "line": 3,
  "name": "TechFios Bank and cash New Account Functionality Validation",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NewAccountFromDB"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 2778591500,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality-validation;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@DbScenario1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters \"username\" from TechFios database",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters \"password\" from TechFios database",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks signin button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks bankCash button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks newAccount",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enters \"accounttitle\" from TechFios database",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User enters  \"description\" from TechFios database",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User enters  \"balance\" from TechFios database",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User enters  \"accountNumber\" from TechFios database",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User enters  \"contactPerson\" from TechFios database",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User enters  \"phoneNumber\" from TechFios database",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User enters  \"internetBankingUrl\" from TechFios database",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User clicks submit button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User should land on account page",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "duration": 669494200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "AccountStepDefinition.user_enters_from_TechFios_database(String)"
});
formatter.result({
  "duration": 3676903600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "AccountStepDefinition.user_enters_from_TechFios_database(String)"
});
formatter.result({
  "duration": 3144426200,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.user_clicks_signin_button()"
});
formatter.result({
  "duration": 4006525800,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 187796100,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.user_clicks_bankCash_button()"
});
formatter.result({
  "duration": 3071747600,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.user_clicks_newAccount()"
});
formatter.result({
  "duration": 3561970600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "accounttitle",
      "offset": 13
    }
  ],
  "location": "AccountStepDefinition.user_enters_from_TechFios_database(String)"
});
formatter.result({
  "duration": 3135013700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "description",
      "offset": 14
    }
  ],
  "location": "AccountStepDefinition.user_enters_from_TechFios_database1(String)"
});
formatter.result({
  "duration": 3139692600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "balance",
      "offset": 14
    }
  ],
  "location": "AccountStepDefinition.user_enters_from_TechFios_database1(String)"
});
formatter.result({
  "duration": 3138116200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "accountNumber",
      "offset": 14
    }
  ],
  "location": "AccountStepDefinition.user_enters_from_TechFios_database1(String)"
});
formatter.result({
  "duration": 3096506000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "contactPerson",
      "offset": 14
    }
  ],
  "location": "AccountStepDefinition.user_enters_from_TechFios_database1(String)"
});
formatter.result({
  "duration": 3103129400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "phoneNumber",
      "offset": 14
    }
  ],
  "location": "AccountStepDefinition.user_enters_from_TechFios_database1(String)"
});
formatter.result({
  "duration": 3141309400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "internetBankingUrl",
      "offset": 14
    }
  ],
  "location": "AccountStepDefinition.user_enters_from_TechFios_database1(String)"
});
formatter.result({
  "duration": 134258600,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.user_clicks_submit_button()"
});
formatter.result({
  "duration": 759362400,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.user_should_land_on_account_page()"
});
formatter.result({
  "duration": 47114800,
  "status": "passed"
});
});
package steps;



import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBasePage;

public class AccountStepDefinition extends TestBasePage {
	
	//Given user is on the techfios login page
	
	LoginPage loginPage; 
	DatabasePage databasePage; 
	
	
	  @Before public void beforeRun() {
	  
	  initDriver(); 
	  loginPage = PageFactory.initElements(driver, LoginPage.class);
	  databasePage = new DatabasePage();
	  
	  }
	 
	
	
	  @Given("^User is on the Techfios login page$") 
	  public void user_is_on_the_techfios_login_page() {
		 
	  
	  driver.get("https://www.techfios.com/billing/?ng=admin/");
	  
	  }
	 
		
		  @When("^User enters username as \"([^\"]*)\"$") public void
		  user_enters_username_as(String username) {
		  
		  loginPage.enterUserName(username);
		  
		  }
		 
			@When("^User enters \"([^\"]*)\" from TechFios database$")
			public void user_enters_from_TechFios_database(String data)  {
			   
				switch(data) { 
				case "username":
					System.out.println("Username from DB :" + databasePage.getDataFromDb("username"));
					loginPage.enterUserName(databasePage.getDataFromDb("username"));	
					break;
				case "password": 
					System.out.println("Password from DB :" + databasePage.getDataFromDb("password"));
					loginPage.enterPassword(databasePage.getDataFromDb("password"));
					break;
				case "accounttitle": 
					System.out.println("accounttitle from DB :" + databasePage.getDataFromDb("accounttitle"));
					loginPage.enterAccountTitle(databasePage.getDataFromDb("accounttitle"));	
					break;
				default: 
					System.out.println("Invalid Data");	
				
			}
			}
			@When("^User clicks signin button$")
			public void user_clicks_signin_button()  {
			    loginPage.clickSignInButton();
			}

			@Then("^User should land on dashboard page$")
			public void user_should_land_on_dashboard_page()  {
			    Assert.assertEquals("Dashboard- iBilling" ,  loginPage.getPageTitle());
			    takesScreenshot(driver);
			    
			}

			@Then("^User clicks bankCash button$")
			public void user_clicks_bankCash_button()  {
			    loginPage.clickBankAndCashButton();
			   
			}

			@When("^User clicks newAccount$")
			public void user_clicks_newAccount() {
			    loginPage.clickNewAccountButton();
			}
 
			@Then("^User enters  \"([^\"]*)\" from TechFios database$")
			public void user_enters_from_TechFios_database1(String accountInfo)  {
			   
				switch(accountInfo) { 
				
				case "accounttitle": 
					System.out.println("accounttitle from DB :" + databasePage.getDataFromDb("accounttitle"));
					loginPage.enterAccountTitle(databasePage.getDataFromDb("accounttitle"));	
					break;
				
				case "description":
					System.out.println("description from DB :" + databasePage.getDataFromDb("description"));
					loginPage.enterDescription(databasePage.getDataFromDb("description"));	
					break;
				
				case "balance": 
					System.out.println("balance from DB :" + databasePage.getDataFromDb("balance"));
					loginPage.enterInitialBalance(databasePage.getDataFromDb("balance"));	
					break;
				case "accountNumber":
					System.out.println("accountNumber from DB :" + databasePage.getDataFromDb("accountNumber"));
					loginPage.enterAccountNumber(databasePage.getDataFromDb("accountNumber"));	
					break;
				case "contactPerson": 
					System.out.println("contactPerson from DB :" + databasePage.getDataFromDb("contactPerson"));
					loginPage.enterContactPerson(databasePage.getDataFromDb("contactPerson"));	
					break;
				case "phoneNumber": 
					System.out.println("PhoneNumber from DB :" + databasePage.getDataFromDb("phoneNumber"));
					loginPage.enterPhoneNumber(databasePage.getDataFromDb("phoneNumber"));	
					break;
				case "internetBankingUrl": 
					System.out.println("InternetBankingUrl from DB :" + databasePage.getDataFromDb("internetBankingUrl"));
					loginPage.enterInternetBankingUrl(databasePage.getDataFromDb("internetBankingUrl"));	
					break;
				}
				
				
			}
			
			@Then("^User clicks submit button$")
			public void user_clicks_submit_button()  {
				loginPage.clickSubmitButton();
			    
			}
			
			@Then ("^User should land on account page$")
				public void user_should_land_on_account_page() {
				loginPage.validateNewAccount();
			}

		
		
}

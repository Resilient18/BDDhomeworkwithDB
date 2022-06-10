package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage  {
	WebDriver driver; 
	
	public LoginPage(WebDriver driver) { 
		
		this.driver = driver; 
		
	}	
		//Element Library 
		
		 @FindBy(how = How.XPATH, using = "//input[@id='username']")
		 WebElement UserName;
		 @FindBy(how = How.XPATH, using = "//input[@id='password']")
		 WebElement Password;
		 @FindBy(how = How.XPATH, using = "//button[@name='login']")
		 WebElement SignInButton;
		 @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]" ) WebElement BankAndCashButton;
		 @FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Account')]") WebElement NewAccountButton;
		 @FindBy(how = How.XPATH, using = "//h5[contains(text(), 'Add New Account')]") WebElement AddNewAccount;
		 @FindBy(how = How.XPATH, using = "//input[@id ='account' ]") WebElement AccountTitle;
		 @FindBy(how = How.XPATH, using = "//input[@id ='description' ]") WebElement Description; 
		 @FindBy(how = How.XPATH, using = "//input[@id ='balance' ]") WebElement InitialBalance;
		 @FindBy(how =How.XPATH, using = "//input[@id ='account_number' ]") WebElement AccountNumber;
		 @FindBy(how = How.XPATH, using = "//input[@id ='contact_person' ]") WebElement ContactPerson;
		 @FindBy(how = How.XPATH, using = "//input[@id ='contact_phone' ]") WebElement PhoneNumber;
		 @FindBy(how = How.XPATH, using = "//input[@id ='ib_url']") WebElement InternetBankingUrl;
		 @FindBy(how = How.XPATH, using = "//button[@class  ='btn btn-primary' ]") WebElement SubmitButton;
		 @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]") WebElement AccountValidate;
		
		 public void enterUserName(String username) { 
			 UserName.sendKeys(username);
			 try { 
				 Thread.sleep(3000);
			 }catch(Exception e) { 
				 e.printStackTrace();
			 }
		 }
		 
		 public void enterPassword(String password) { 
			 Password.sendKeys(password);
			 try { 
				 Thread.sleep(3000);
			 }catch(Exception e) { 
				 e.printStackTrace();
			 }
		}
		 public void clickSignInButton() { 
			 SignInButton.click();
			 try { 
				 Thread.sleep(3000);
			 }catch(Exception e) { 
				 e.printStackTrace();
			 }
		 }
		 public String getPageTitle() { 
			 return driver.getTitle();
		 }
		 
		 public void clickBankAndCashButton() { 
			 BankAndCashButton.click();
			 try { 
				 Thread.sleep(3000);
			 }catch(Exception e) { 
				 e.printStackTrace();
			 }
		 }
		 public void clickNewAccountButton() { 
			 NewAccountButton.click();
			 try { 
				 Thread.sleep(3000);
			 }catch(Exception e) { 
				 e.printStackTrace();
			 }
		 }
		 
			
		 public void enterAccountTitle(String accounttitle) { 
			 AccountTitle.sendKeys(accounttitle);
			 try { 
				 Thread.sleep(3000);
			 }catch(Exception e) { 
				 e.printStackTrace();
			 }
				 
			 }
		 public void enterDescription(String description) { 
			 Description.sendKeys(description);
			 try { 
				 Thread.sleep(3000);
			 }catch(Exception e) { 
				 e.printStackTrace();
			 }
			 
		 }
		 public void enterInitialBalance(String balance) { 
			 InitialBalance.sendKeys(balance);
			 try { 
				 Thread.sleep(3000);
			 }catch(Exception e) { 
				 e.printStackTrace();
			 }
		}
		 
		 public void enterAccountNumber(String accountNumber) { 
			 AccountNumber.sendKeys(accountNumber);
			 try { 
				 Thread.sleep(3000);
			 }catch(Exception e) { 
				 e.printStackTrace();
			 }
		 }
		 
		 public void enterContactPerson(String contactPerson) { 
			 ContactPerson.sendKeys(contactPerson);
			 try { 
				 Thread.sleep(3000);
			 }catch(Exception e) { 
				 e.printStackTrace();
			 } 
		 }
		 
		 public void enterPhoneNumber(String phoneNumber) { 
			 
			 PhoneNumber.sendKeys(phoneNumber);
			 try { 
				 Thread.sleep(3000);
			 }catch(Exception e) { 
				 e.printStackTrace();
			 } 
		 }
		 public void enterInternetBankingUrl(String internetBankingUrl) { 
			 InternetBankingUrl.sendKeys(internetBankingUrl);
		 }
		 
		 public void clickSubmitButton() { 
			 
			 SubmitButton.click();
		 }
		 
		 public void validateNewAccount() { 
			 AccountValidate.isDisplayed();
			 
		 }
		 
		 
		 
		} 

	
	
	



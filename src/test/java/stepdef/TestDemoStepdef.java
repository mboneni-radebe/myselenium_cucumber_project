package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

import io.cucumber.java.en.And;
public class TestDemoStepdef {
	
	@Given("I open the browser")
	public void openTheBrowser()
	{
		//code to launch browser
		System.out.println("i m launching webdriver chrome");
	}
	
	@When("I enter the url")
	public void enterTheUrl()
	{
		System.out.println("url enyerted is="+"https://rediffmail.com");
	}
	@Then("I navigate to homepage")
	public void navigatetoHomepage()
	{
		System.out.println("navigated to homepage");
	}
	
	@And("I click on signin button")
	public void clickOnSignInButton()
	{
		System.out.println("clciking sigin button");
	}

	@When("I navigate to Login Page")
	public void navigatedtoLoginPage()
	{
		System.out.println("navigated to loginpage");
	}
	
	
	 
	 @And("I enter the password")
	 public void enterthePassword()
	 {
		 System.out.println("username=abc");
	 }
	
	
	 @And("I enter the username")
	 public void entertheUsername()
	 {
		 System.out.println("username=abc");
	 }
	 
	 
	 @When("I enter submit button")
	 public void clickonSubmitButton()
	 {
		 System.out.println("clicking on submit button");
	 }
	 
	 @Then("I navigated to welcome page")
	 public void navigatedWelecomePage()
	 {
		 System.out.println("navigated to welcome login page");
	 }
	 
	 @And("I verify the welcome user name")
	 public void I_verify_welcome_user_name()
	 {
		 System.out.println("validation success on welcome page");
		 //Assert.assertTrue(false);
	 }
	 
	 @When("I click on logout link")
	 public void clickonLogoutLink()
	 {
		 System.out.println("user logged out");
	 }
	 
	 @And("I verify the title")
	 public void verifyTitle()
	 {
		 System.out.println("title verified");
	 }
	 
	 
	 
	 
	 
}
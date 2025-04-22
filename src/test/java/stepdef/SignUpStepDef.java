package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStepDef {
	
	WebDriver driver;
	
	@Given("I launch the {string}")
	public void launchtheBrowser(String browsername)
	{
		System.out.println("the opened browser="+browsername);
	}
	
	@When("I open the {string}")
	public void openUrl(String url)
	{
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("url opend="+url);
	}
	
	@Then("I verify the {string} of homepage")
	public void verifystatushomepage(String status)
	{
		System.out.println("status="+status);
	}

}

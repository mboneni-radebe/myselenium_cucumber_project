@LoginScenario
Feature: verifying login functionality

  #common steps
  Background: login steps
    Given I open the browser
    When I enter the url
    Then I navigate to homepage
    And I click on signin button
    Then I navigate to Login Page
    And I enter the username
    And I enter the password
    When I enter submit button
    Then I navigated to welcome page

  @validLogin
  Scenario: verify rediffmail login functionality with valid credentials
    And I verify the welcome user name

  @Logoutfunc
  Scenario: verify rediffmail logout functionality
    And I verify the welcome user name
    When I click on logout link
    Then I navigate to homepage
    And I verify the title

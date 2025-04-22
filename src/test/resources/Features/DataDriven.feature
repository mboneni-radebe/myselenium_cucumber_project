#to pass different set of inputs to the steps from example tables

@datadrivenscenarios
Feature: implementing data driven

  @datadriven
  Scenario Outline: login with different browser
    Given I launch the '<browser>'
    When I open the "<url>"
    Then I navigate to homepage
    Then I verify the "<status>" of homepage

    Examples: 
      | browser | url                      											| status  |
      | chrome  | https://testautomationpractice.blogspot.com   | success |
      | firefox | https://www.facebook.com 											| Fail    |

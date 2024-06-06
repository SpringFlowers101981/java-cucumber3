@google
  Feature: Testing google page
    @google1
    Scenario: Verify main page
      Given I open "https://google.com"
      Then I verify page is opened
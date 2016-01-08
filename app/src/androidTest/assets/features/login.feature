Feature: App usability

  Scenario: Welcome page
    Given I am on login screen
    Then I should see message
    Then I take a screenshot

  Scenario: Login
    Given I am on login screen
    Then I take a screenshot
    Given I type login
    Given I type password
    Then I take a screenshot
    When I click on login button
    Then I see books
    Then I take a screenshot
    When I click on book 42
    Then I take a screenshot
    Then I see book details
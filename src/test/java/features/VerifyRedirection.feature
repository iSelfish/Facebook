Feature: Verify redirection

  Scenario: Search an item and check its description
    Given I am on the "https://www.google.com/" website
    When  I search for "Facebook"
    And I click facebook link
    Then I am redirected to "https://www.facebook.com/"
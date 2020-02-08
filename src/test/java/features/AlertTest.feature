Feature: Verify redirection

  Scenario: Search an item and check its description
    Given I am on the "https://www.google.com/" website
    When  I search for "Facebook"
    And I click facebook link
    And I enter "badlogin" as login and "badpassword" as password
    And click login button
    Then message "The email or phone number you’ve entered doesn’t match any account." is displayed.

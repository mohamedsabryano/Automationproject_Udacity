@smoker
Feature: user can login with register account

  Scenario: user can login with your valid account
    Given user navigate to home page
    And user click on Login link
    When user enter valid email
    And user enter valid password
    And user click on Login button
    Then My account is displayed

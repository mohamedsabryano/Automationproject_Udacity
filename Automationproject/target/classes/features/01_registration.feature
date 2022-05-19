@smoker
Feature: user should abel to  sign up with new accounts

    Scenario: user could sign up with valid data
      Given user navigate to home page
      And user click on register link
      When user fills your personal details with valid data
      And user fills your password with valid data
      And user click on register button
      Then success message is displayed

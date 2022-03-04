Feature: Facebook functionality

  Scenario: Facebook Loginpage
    Given User is on registration page
    When Enter first name and surname 
    And Enter mobile number
    And Enter new password
    And Select birth date

    Then Click on signup

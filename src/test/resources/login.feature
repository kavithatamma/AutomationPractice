Feature: Login


  Scenario:  Login with valid details
    Given I am on homepage
    When I click on Sign in link
    Then AUTHENTICATION page should be loaded
    And I enter valid credentials
    Then I can login successfully





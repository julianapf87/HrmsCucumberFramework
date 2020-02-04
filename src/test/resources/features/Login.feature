@spritn1 @login
Feature: Login

  @temp
  Scenario: Valid login
    Given I open the browser and navigated to the HRMS
    When I entered valid username and valid password
    And I click on login button
    Then I succesfully logged in
    And I close the browser

  @regression
  Scenario: Invalid Login
    Given I open the browser and navigated to the HRMS
    When I entered valid username and invalid password
    And I click on login button
    Then I see error message
    And I close the browser
@regression
  Scenario Outline: Invalid Login and message validation
    When I entered valid "<Username>" and "<Password>"
    And I click on login button
    Then I see "<ErrorMessage>"

    Examples: 
      | Username | Password   | ErrorMessage             |
      | Admin    | Admin123   | Invalid credential       |
      | Admin    |            | errormessage             |
      |          | Syntax@123 | Username cannot be empty |
      |          |            | Username cannot be empty |

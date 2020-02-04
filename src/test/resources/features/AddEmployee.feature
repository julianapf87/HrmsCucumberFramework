#Author : syntax team (julie@julie.com)
@sprint2 @addemployee
Feature: Add Employee

  Background: 
    Given I am logged into HRMS
    And I navigate to Add Employee Page
#
  #@smoke
  #Scenario: Add new Employee
    #When I add "<FirstName>", "<MiddleName>" and "<LastName>"
    #And I click Save
    #Then I see Employee has been succesfully added
    #And I close the browser
#
  #@regression
  #Scenario Outline: Add new Employee
    #When I add "John", "S" and "Smith"
    #And I click Save
    #Then I see Employee with  "<FirstName>", "<MiddleName>" and "<LastName>"
#
    #Examples: 
      #| FirstName | MiddleName | LastName |
      #| James     | J          | Smith    |
      #| Jane      | J          | Smith    |
      #| Sasha     | J          | Smith    |
      #| David     | J          | Smith    |
@smoke @test
  Scenario: Add and Modify employee details
    When I enter employee details
      | FirstName | MiddleName | LastName |
      | John      | J          | Smith    |
      | Jane      | J          | Smith    |
      | Sasha     | J          | Smith    |
      | David     | J          | Smith    |
    And I click Save
    And I click on Edit
    Then I am able to modify Employee Details
    | DriverLicense | ExpirationDate | SSN         | SIN    | Gender | MaritalStatus |
    | N788787878    | 2021-12-08     | 123-45-6789 | 123123 | Female | Other         |
    
    
      
  #Scenario: Add Employee without employee id
    #When I add firstName, middleName, and lastName
    #And I delete employee id
    #And I click Save
    #Then i see employee without employee id is being added
#
  #Scenario: Add Employee negative scenario
    #When I click Save
    #Then I see required error message next to the first and last name
#
  #Scenario: AddEmployee and Login Credentials
    #When I add firstName, middleName, and lastName
    #And I click on create login checkbox
    #And I enter username, password, and confirm password
    #And I click Save
    #Then I see Employee has been succesfully added

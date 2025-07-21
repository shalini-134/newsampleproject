#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
# (Comments)
#Sample Feature Definition Template
#


Feature: login feature
  i want to validate login functionality

 @Smoke
  Scenario: user should enter valid username and password
    Given user should be on login page
    When user enter valid username "S@gmail.com"
    And user enter valid password "1234"
    And clicks on submitbutton
    And close the browser

@regression
  Scenario Outline: user should enter valid username and password
    Given user should be on login page
    When user enter valid username1 "<username>"
    And user enter valid password1 "<password>"
    And clicks on submitbutton
    And close the browser
    Examples: 
      | username  | password |
      | S@gmail.com | 1234 |
      | Testing@gmail.com | P233243 |

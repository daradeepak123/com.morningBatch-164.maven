
@tag
Feature: Dashboard page validation
  

  @smoke @reg
  Scenario: User validates login functionality with positive creds
    Given User opens desired browser
    And User performs login
    Then User validates is login succesful 
    Then User closes the browser
   
   



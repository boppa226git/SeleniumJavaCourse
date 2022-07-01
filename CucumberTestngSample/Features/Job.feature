Feature: Login to HRM Application 
  
   @ValidCredentials
   Scenario Outline: Login with valid credentials
      
    Given User is on Home page
    When User enters username as "<username>"
    And User enters password as "<password>"
    Then User should be able to login sucessfully
   
    Examples:
    | username   | password   |
    | boppa226   |8790794571|
    
    Scenario Outline: Home page validation
      
    Given  user launch chrome browser 
    When User enters url as "https://www.facebook.com/"
    
   
    Examples:
    | username   | password   |
    | boppa226   |8790794571|
     
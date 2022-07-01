Feature: Jobsearch link validation
  
   @ValidCredentials
   Scenario Outline: job search link on top
      
    Given  user launch chrome browser 
    When User enters url as "https://www.aceenggacademy.com/"
    
    Scenario Outline: Home page validation
      
    Given  user launch chrome browser 
    When User enters url as "https://github.com/login/"
    
   
    Examples:
    | username   | password   |
    | boppa226   |8790794571|
     
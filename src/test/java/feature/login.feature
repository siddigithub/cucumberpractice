Feature: Login to application
  login and logout
  Scenario: login to the application
    Given I navigate to the login page
    #And I enter the username as "admin" and password as "admin"
    And I enter the details
        |username|password|
        |admin   |adminpassword|
    And I click on login button
    Then I should see the userform page

  #Scenario Outline: login to the application using scenario outline
    #Given I navigate to the login page
#And I enter the username as "admin" and password as "admin"
    #And I enter the <username> and <password> details
    #And I click on login button
    #Then I should see the userform page

    #Examples:
     # |username|password|
      #|admin   |adminpassword|
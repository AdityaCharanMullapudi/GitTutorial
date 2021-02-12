@FunctionalTests
Feature: Navigation to ForgotPassword page
This will verify that forgotpassword page is displayed when clicked on forgotpassword link.

@RegressionTests
  Scenario: Successful navigation to ForgotPassword page
  
  Given User is on the Home page.
    When I click on the ForgotPassword/Username link   
    Then I should navigate to ForgotPassword/Username page
    And Create New Password link should be displayed.
    
    @SmokeTests
    Scenario Outline: Warning message is displayed on unsuccessful login
    
    When entered "<username>" in the usernamefield
    And entered "<password>" in the passwordfield
    And clicked on SignOn button
    Then warning message should be displayed saying account is suspended
    And ForgotPassword/username link should be displayed
    
    Examples: 
    |username | password|
    |aditya_1| aditya@1234|
    |aditya_2| aditya@234556|
    |aditya_3|charan@34567|
    
   Scenario: Warning message is displayed on unsuccesful login using DataTables
   When entered username and password
   |aditya_3| aditya@334455|
   And clicked on SignOn button
    Then warning message should be displayed saying account is suspended
    And ForgotPassword/username link should be displayed
   
   @EndtoEndTests
   Scenario: Warning message is displayed on unsuccesful login using Maps in DataTables
   When entered the username and password
   |User_name|password|
   |charan_1|charan@1234|
   And clicked on SignOn button
    Then warning message should be displayed saying account is suspended
    And ForgotPassword/username link should be displayed
   
    
Feature: Check User login and log off Successfully
   In order to verify that user enter details, login and logout
   As a user of iBusiness
   I should be able to get into user account and logoff successfully.

   Scenario: Login
   Given I open HomePage
   When I click log yourself in link 
   And I enter "ecalix@test.com" as Username 
   And I enter "test123" as Password
   And I click on Sign In button
   Then I click log off button
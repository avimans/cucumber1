Feature:  i am validating the orangehrm  application
Background:
Given open browser and go to login page of orangehrm
Scenario: To test login with valid data
#given are the precondition or prerequesite
When enter the valid username "Admin"
#condititon or the test we are performing on the appplication
And enter the valid password "admin123"
And click on the login button
Then i should see "Welcome Kristen"

Scenario: to trst login with invalid data
#given are the precondition or prerequesite
When enter the invalid username "avinash"
#condititon or the test we are performing on the appplication
And enter the invalid password "avinash"
And click on the login buttonn
Then login should see "Invalid credentials"






























































































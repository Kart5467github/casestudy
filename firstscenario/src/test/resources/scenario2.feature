Feature: user logs in TestMeApp
Scenario Outline: user enters deatils for login
Given user enters the login page "http://10.232.237.143:443/TestMeApp/login.htm"
When user enters username "<username>"
And user enters password "<password>"
And user clicks on login
Then user logsin

Examples:
|username|password|
|AlexUser|Alex@123|

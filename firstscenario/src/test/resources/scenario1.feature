Feature: register in Test Me App
Scenario: user enters details and registers
Given url of tma website "http://10.232.237.143:443/TestMeApp"
When user enters "<username>" as username 
And user enters "<firstname>" as firstname
And user enters "<lastname>" as lastname
And user enters "<password>" as password
And user enters "<confirmpassword>" as confirmpassword
And user selects "<gender>" as male|female
And user enters "<email>" as email
And user enters "1234567890" as mobile number
And user enters "09-23-1548" as dateofbirth
And user enters "address is not available" as address
And user enters security question
And user enters "<answer>" as answer
And user clicks on register
Then user enters productpage


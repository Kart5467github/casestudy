Feature: user searches for a product
Scenario: user searches head and gets results
Given user logs in to TMA
When user enters the productname as "head"
And user clicks on finddetails button
And user gets the results in productspage
And user clicks on add to cart
And user clicks on cart button
And user proceeds to payment page
And user selects bank and continues
And user user enters "123456" as username and "Pass@456" as password and clicks login
And user enters "Trans@456" as Transactionpassword
Then user user enters order confirmationpage
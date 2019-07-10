Feature: searching add to cart
Scenario: the one where the user moves to cart without adding an item in it
Given Alex has registered into TMA
When Alex searches a particular product like headphones

Then TMA doesn't display the cart icon 
Feature: Search Results. Where one can sort, filter and see details of resulting products.

@001
Scenario Outline: Search and verify results
Given I am a non-registered customer And I navigate to www.ebay.co.uk in browser "<browser>" 
When I search for an item "<searchItem>"
Then I get a list of matching results for item "<searchItem>"
Then Resulting items cards show: postage price, No of bids, price or show BuyItNow tag
Then I can sort the results by Lowest Price And the results are listed in the page in the correct order
Then I can sort the results by Highest Price And the results are listed in the page in the correct order
Then I can filter the results by 'Buy it now' And all the results shown in the page have the 'Buy it now' tag 

Examples:
	|browser|searchItem|
	|chrome|Kids Winter Wear|
	|chrome|Mobiles|
	
@002
Scenario Outline: Search per category
Given I am a non-registered customer And I navigate to www.ebay.co.uk to do category specific search
When I enter a search term and select a specific Category "<category>"
Then I get a list of matching results And I can verify that the results shown as per the the selected category "<category>"

Examples:
	|category|
	|Electronics|
	#|Fashion|
	#|Motors|
	
	
@003
Scenario Outline: Search and navigate through results pages
Given I am a non-registered customer And I navigate to www.ebay.co.uk to search a specific item
When I search for a specific item "<specificSearchItem>"
Then I get a list of matching results And the results show more than one page
Then the user can navigate through the pages to continue looking at the items

Examples:
	|specificSearchItem|
	|Iphone|
	|Nike Shoes|
Scenario Outline: Login with valid details
Given I am on homepage
When I click on Sign in link
Then AUTHENTICATION page should be loaded
And I enter valid <EmailId> and <Password>
Then I should  login successfully
Examples:
| EmailId|Password|
|kavithatamma@hotmail.com|Govinda@0711|
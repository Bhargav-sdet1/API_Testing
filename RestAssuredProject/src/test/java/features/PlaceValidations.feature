Feature: Validating Add Place API's

Scenario Outline: Verify if place is being succesfully added using Add Place API
	Given Add place Payload with "<name>" "<language>" "<address>"
	When user calls "Add Place" API with POST http request
	Then Verify API call got success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	
Examples:
	|name	|language	|address	|
	|Bhargav|Telugu		|Hyderabad	|
	|Vithika|English	|Uppal		|
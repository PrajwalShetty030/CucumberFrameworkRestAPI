Feature: Validation Place API's
@AddPlace
Scenario Outline: Verify if place is being added using AddPlaceAPI

Given Add place payload with "<name>" "<language>" "<address>"
When user calls "AddPlaceAPI" with "POST" http request
Then the API call is success with status code 200
And "status" in response body is "OK"
And "scope" in response body is "APP"
And verify place_id created maps to "<name>" using "getPlaceAPI"

Examples:
	|name	|language	|address	|
	|Prajwal|English	|Mangalore	|
	#|Shetty	|Hindi		|Udupi		|
@DeletePlace	
Scenario: Verify if Delete Place functionality is working
Given DeletePlace Payload
When user calls "deletePlaceAPI" with "POST" http request
Then the API call is success with status code 200
And "status" in response body is "OK"
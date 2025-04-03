Feature: Test Plan Karate

	@POEI20252-615 @POEI20252-609 @wafa_TP
	Scenario: Get user
		Given url 'https://reqres.in/api/users'
		    And param page = 2
		    When method GET
		    Then status 200
		    And match response.data[0].id == 7
		

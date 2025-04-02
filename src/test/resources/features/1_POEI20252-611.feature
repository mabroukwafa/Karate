Feature: Test Plan Karate

	@POEI20252-611 @POEI20252-609 @wafa_TP
	Scenario: Add user 
		Given url 'https://reqres.in/api/users'
		    And request { name : 'morpheus' , job: 'leader'}
		    When method post
		    Then status 201
		    And match response.name =='morpheus'
		    And match response.job == 'leader'
		

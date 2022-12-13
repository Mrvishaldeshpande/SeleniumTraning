Feature: Testing Makemytrip

Background:
Given Baljeet land on MakeMytrip Page

	@Baljeet 
  Scenario: Testing MakeMytrip
    
    When Baljeet Click on Country button
    Then Rahul click on Select Country button
    Then Rushikant Click on USA Country
    Then Vishal Click on Apply Buttton
    Then everyone Verified USA is displayed
    
		@Vishal 
    Scenario Outline: Testing MakeMytrip for Bus
    
    When Baljeet click on Buses
    Then Baljeet Will select City <location>
    Examples: 
      |location|
      |Pune|
      |Mumbai|
    
     @Rahul @Vishal 
    Scenario: normal Test
    Given Rahul land on MakeMytrip Page
    When Rahul click on bus
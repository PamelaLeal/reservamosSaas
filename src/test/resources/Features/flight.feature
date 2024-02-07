Feature: Book a flight
  	this scenario will be to book one or more flights

  Scenario: book a travel
    Given Open the website
    When Select a "Bucaramanga" as a departure location
    And Select a "Bogotá" as a destination location
    And Choose a travel date
    And Click on the "Search"
    Then Choose a trip from the displayed options
    And Provide "15" as a seat, "Juan" as a passenger
    And Fill payment information and click complete
    Then make sure transaction was successful

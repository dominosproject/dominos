Feature: Adactin webpage testing
  Scenario: login the adactin webpage
    Given launch the url
    When user enter the username
    And user enter the password
    Then User click the login button

  Scenario Outline: Booking the hotel webpage
    When user select the location
    And user select the hotels
    And user select the room
    And User enter the check in date
    And user enter the check out date
    And user select the adults per room
    And user select children per room
    Then User click the search button
    Examples:


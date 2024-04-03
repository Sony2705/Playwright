Feature: Validating the functionality of adaction hotel booking app
  Scenario: Validating the login page
    Given Launch the url of adactin hotel application or website
    When  Enter the username in the username field
    And Enter the password in the password field
    Then  Click the login button and it navigate to the search hotel page

    Scenario 2: Validating the search hotel page
      When  Select the location from the location dropdown
      And  Select the hotel from the hotel dropdown
      And Select the room type from the room type dropdown
      And  Select the No of rooms from the no of room dropdown
      And  Enter the checkin date
      And  Enter the checkout date
      And  Select the adults room from the dropdown
      And  Select the child room from the dropdown
      Then  Click on the search button and it navigate to select hotel

      Scenario 3: Validating the select hotel
        When Select the hotel from the radio button
        And Click on the continue button and it navigate to the booking hotel

        Scenario 4: Validating the booking hotel
          When  Enter the first name
          And  Enter the last name
          And  Enter the billing address
          And  Enter the credit card number
          And  Select the credit card type
          And  Enter the credit card expiry Month
          And Enter the credit card expiry year
          And Enter the cvv number
          Then Click on the Book now button and it navigate to the booking confirmation

          Scenario 5: Validating the booking confirmation
            Then Click on My ilternary button and it navigate to the booked iternary

            Scenario 6: Validating the booked iternary
              When Click on the radio button
              Then  Click on the Logout button and it navigate to the successful logout page






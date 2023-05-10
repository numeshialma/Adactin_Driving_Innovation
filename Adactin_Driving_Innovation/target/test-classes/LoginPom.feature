Feature: Login Functionality
  In order to book a hotel
  As a valid Adactin Driving Innovation customer
  I want to login successfully

  Background: User is on Adactin Driving Innovation Login Page

    Given User is on Login Page --> Creation Page

      Scenario: Login Successful
        Given User enter user name as "NumeshiAlmaPiyasiri"
        And User enter password as "numeshi123"
        And User clicks login button
        And User enter location as "London"
        And User enter hotels as "Hotel Creek"
        And User enter room type as "Double"
        And User enter number of rooms as "4 - Four"
        And User enter check in date as "04/11/2022"
        And User enter check out date as "05/11/2022"
        And User enter adults per room as "3 - Three"
        And User enter children per rooms as "3 - Three"
        And User clicks on search button
        And User select hotel
        And User clicks continue button
        And User enter first name as "Numeshi"
        And User enter last name as "Piyasiri"
        And User enter address as "Main Rd,Big City"
        And User enter card number as "1234567891234567"
        And User enter card type as "VISA"
        And User enter month as "April"
        And User enter year as "2021"
        And User enter cvv as "123"
        When User clicks book now button
        Then  Salutation message will display as "Welcome to Adactin Group of Hotels"




Feature: Holiday Pacakges Booking Functionality 



  #Scenario 1
  
  @searchHP
  Scenario: Search for holiday packages 
    Given user is on homepage of Make My Trip website
    When user selects Holiday Package option
    And user enters the details 
    
    | Trip Details     |  Value       |
    | fromCity         |  Indore      |
    | toCity           |  Europe      |
   
    And clicks on Search button
    Then relevant holiday packages matching search criteria are displayed
    
#-------------------------------------------------------------------------------------------------------------


  #Scenario 2
  
  @searchPage
  Scenario: User applies filters to search Holiday Package
  Given user is on Holiday Package page
  When user performed Holiday Package search
  And user applies filters such as Duration, Hotel Category, Flights, Themes and Package Type
  Then Relevant search results are displayed
  
  #--------------------------------------------------------------------------------------------------------------
  
  
  #Scenario 3
  
  @searchSort
  Scenario: User sort holiday packages by price
    Given user is on the MakeMyTrip holiday package search page
    When user clicks on sorted by dropdown
    And choose to sort the holidays by Price-Low to High 
    Then the holidays should be displayed in ascending order of price
  
  
#-------------------------------------------------------------------------------------------------------------

  #Scenario 4
  
  @GetCallBackForm
  Scenario Outline: User requests a callback using outline data
    Given user is on the MakeMyTrip Holiday Packages landing page
    When user clicks on the "Get a Call Back" widget
    And user fills in the callback form with name "<Name>", phone "<Phone>" and email "<Email>"
    And user clicks on "Get a Call Back" button
    And fills the another form by selecting preffered travel date, hotel star category, number of nights, No. of travellers and language preference 
    And clicks on Submit button
    Then the message "Thank you <Name> " should be displayed after submitting 

  Examples:
  
  | Name   | Phone      |     Email     |
  | John   | 9876543210 | john@test.com |
 
 
 #--------------------------------------------------------------------------------------------------------------------------
 
   
   #Scenario 5
   
  @searchDefect
   Scenario: Hotel Category Filter with five star Selection
    Given User is on the filter section of MakeMyTrip holiday packages page 
    When User applies the hotel category filter for five star hotels
    And User clicks on the five star hotel category filter
    Then User should see a list of packages available for selcted hotel category

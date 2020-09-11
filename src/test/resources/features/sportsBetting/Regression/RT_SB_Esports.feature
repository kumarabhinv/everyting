Feature: Validating the functionality of Esports tab in sports betting.

  @DESKTOP @MOBILE
  Scenario Outline: User visits SportsBetting application
    Given I am on SportsBetting application
    When User login to the SportsBetting site with following credential <Username> and <Password>
    Then I should see the SportsBetting site homepage

    Examples:
      | Username | Password     |
      | SB808358 | C0d0!d_P@ss1 |

  @MOBILE
  Scenario: User verifies ESports tab present inside the home page
    Given as a User, I move to Esports page
    Then I see different options under ESports
      | Odds |
      | Time |


  @DESKTOP
  Scenario Outline:  User verifies Esports tab present inside the home page
    Given I am on SportsBetting application
    When I move to <Tab>
    Then I should see details related to selected <Tab>
    Examples:
      | Tab     |
      | ESPORTS |


  @DESKTOP  
  Scenario: User accesses Favorite sub-tab under Esports page
    Given as a User, I move to Esports page
    When I click on Favorite sub-tab
    Then User see No favorites message

  @DESKTOP  
  Scenario: User adds teams as Favorite
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on Early Markets sub-tab
    And I click on Star (Icon) of any team
    When I click on Favorite sub-tab
    Then verify team added to Favorite


  @DESKTOP 
  Scenario: User deletes teams from Favorite sub-tab under Esports page
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on Favorite sub-tab
    When I click on Star (Icon) of any team
    Then User see No favorites message

#  Chinese(中文繁體)// HOLD

  @DESKTOP1 
  Scenario: User validates 中文繁體 sub-tab present inside the Esports page
    Given I am on SportsBetting application
    And I click on Esports tab
    When I click on 中文繁體
    Then all text changing from English to Chinese(中文繁體)


#ENGLISH// HOLD
  @DESKTOP1 
  Scenario: User validates ENGLISH tab present inside the Esports page
    Given as a User, I have already clicked Chinese(中文繁體)
    When I click on ENGLISH
    Then I have see all text changing from Chinese to English


#BET HISTORY
  @DESKTOP 
  Scenario Outline: User accesses BET HISTORY tab present inside the Esports page
    Given I am on SportsBetting application
    And I click on Esports tab
    When I click on BET HISTORY
    Then I see betHistory <options>

    Examples:
      | options      |
      | PENDING BETS |
      | Bet History  |


#LIVE
  @DESKTOP 
  Scenario: User accesses LIVE sub-tab present inside the Esports page
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on Esports tab LIVE
#   And I see all the teams that are live with bet type
    And I see all teams that are live with bet type
      | 1X2   |
      | HDP   |
      | Map 1 |
      | Map 2 |
      | Map 3 |
    And I choose a team or multiple teams under any header
    When I place a bet
    Then I should see the bet is placed

  @MOBILE
  Scenario: User accesses "LIVE" sub-tab present inside the ESports page
    Given as a User, I see the ESports page
    And I click on Esports LIVE
    And I see all teams that are live with bet type
      | 1X2   |
      | HDP   |
      | Map 1 |
      | Map 2 |
      | Map 3 |
    And I choose a team or multiple teams under any header
    When I place a bet
    Then I should see the bet is placed

  @MOBILE
  Scenario: User views detailed view of any team under Live sub-tab
    Given as a User, I move to Esports page
    And I click on Esports tab LIVE
    When I click on any team name
    Then I see all the details related to that team with betting options

    #Pending Bets
  @DESKTOP 
  Scenario: User accesses Pending Bets tab present inside the Bet History page
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on BET HISTORY
    When I click on Pending Bets
    Then I should see all the Bets that are pending

    #Bet History
  @DESKTOP 
  Scenario: User accesses Bet History tab present inside the Bet History page
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on BET HISTORY
    And I click on Bet History inside BET HISTORY
    And I enter From date
    And I enter To date
    When I click SHOW
    Then I see all the Betting history


#Video (Icon)
  @DESKTOP 
  Scenario: User watches live video under LIVE sub-tab present inside the Esports page
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on Esports tab LIVE
    When I click on Video (Icon) available under any one team
    Then I see new window opened with Live Video playing in it

  @DESKTOP 
  Scenario: User views detailed view of any team under Live sub-tab
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on Esports tab LIVE
    When I click on any team name
    Then I see all the details related to that team with betting options

#Today

  @DESKTOP 
  Scenario:User accesses Today sub-tab present inside the Esports page
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on Today sub-tab
    And I see all teams that are live with bet type
      | 1X2   |
      | HDP   |
      | Map 1 |
      | Map 2 |
      | Map 3 |
    And I choose a team or multiple teams under any header
    When I place a bet
    Then I should see the bet is placed


  @MOBILE
  Scenario: User accesses "Today" sub-tab present inside the ESports page
    Given as a User, I move to Esports page
    And I click on Today sub-tab
    And I click on any team or multiple team's value under 1X2 header in any sub-tab
    When I place a bet
    Then I should see the bet is placed

  @TestB
  Scenario: User accesses "Today" sub-tab present inside the ESports page
    Given as a User, I move to Esports page
    And I click on any team or multiple team's value under 1X2 header in any sub-tab
    When I see that team/teams under BETSLIP
    Then I enter any value under STAKE of BETSLIP
    And I click on PLACE BET
    And I should see the bet is placed


#Header (1X2)
  @DESKTOP 
  Scenario: User bets inside the Esports page for 1X2 header
    Given as a User, I move to Esports page
    And I click on any team or multiple team's value under 1X2 header in any sub-tab
    When I see that team/teams under BETSLIP
    Then I enter any value under STAKE of BETSLIP
    And I click on PLACE BET
    And I should see the bet is placed


#Header (HDP)
  @DESKTOP 
  Scenario: User bets inside the Esports page for HDP header
    Given as a User, I move to Esports page
    And I click on Today sub-tab
    And I click on any team or multiple team's value under HDP header in any sub-tab
    When I see that team/teams under BETSLIP
    Then I enter any value under STAKE of BETSLIP
    And I click on PLACE BET
    And I should see the bet is placed


#Header (Map 1)
  @DESKTOP 
  Scenario: User bets inside the Esports page for Map 1 header
    Given as a User, I move to Esports page
    And I click on Esports tab Today sub-tab
    And I click on any team or multiple team's value under Map 1 header in any sub-tab
    When I see that team/teams under BETSLIP
    Then I enter any value under STAKE of BETSLIP
    And I click on PLACE BET
    And I should see the bet is placed


#Header (Map 2)
  @DESKTOP 
  Scenario: User bets inside the Esports page for Map 2 header
    Given as a User, I move to Esports page
    And I click on Esports tab Today sub-tab
    And I click on any team or multiple team's value under Map 2 header in any sub-tab
    When I see that team/teams under BETSLIP
    Then I enter any value under STAKE of BETSLIP
    And I click on PLACE BET
    And I should see the bet is placed


#Header (Map 3)
  @DESKTOP 
  Scenario: User bets inside the Esports page for Map 3 header
    Given as a User, I move to Esports page
    And I click on Esports tab Today sub-tab
    And I click on any team or multiple team's value under Map 3 header in any sub-tab
    When I see that team/teams under BETSLIP
    Then I enter any value under STAKE of BETSLIP
    And I click on PLACE BET
    And I should see the bet is placed


#Early Markets
  @DESKTOP 
  Scenario: User accesses Early Markets sub-tab present inside the Esports page
    Given as a User, I move to Esports page
    And I click on Early Markets sub-tab
    And I see all teams that are live with bet type
      | 1X2   |
      | HDP   |
      | Map 1 |
      | Map 2 |
      | Map 3 |
    And I choose a team or multiple teams under any header
    When I place a bet
    Then I should see the bet is placed

  @MOBILE
  Scenario: User accesses "Early Markets" sub-tab present inside the ESports page
    Given as a User, I move to Esports page
    And I click on Early Markets sub-tab
    And I choose a team or multiple teams under any header
    When I place a bet
    Then I should see the bet is placed

#  @TestB
#  Scenario: User adds a bet from under "Early Markets"
#    Given as a User, I already see all the teams that are present
#    And I select any date from the range of dates given
#    When I click on any value under any or multiple teams
#    Then I see all the selected values (teams) gets added to the "BET SLIP" under "Right Navigator"

#Outright
  @DESKTOP1 
  Scenario: User accesses Outright sub-tab present inside the Esports page
    Given as a User, I move to Esports page
    And I click on Outright sub-tab
    And I see all the teams that are present
    When I choose a contest
    And I place a bet
    Then I should see the bet is placed


  @MOBILE
  Scenario: User accesses "Outright" sub-tab present inside the ESports page
    Given as a User, I move to Esports page
    And I click on Outright sub-tab
    And I see all the teams that are present
    When I choose a contest
    And I place a bet
    Then I should see the bet is placed

#  @TestB
#  Scenario: User adds a bet from under "Outright" sub-tab
#    Given as a User, I already see all the teams that are present under "Outright" sub-tab
#    When I click on any value under any or multiple teams
#    Then I see all the selected values (teams) gets added to the "BET SLIP" under "Right Navigator"

#Results
  @DESKTOP 
  Scenario: User accesses Results sub-tab present inside the Esports page
    Given as a User, I move to Esports page
    When I click on Results sub-tab
    Then I see all the teams that are present with date range selector
    And I sholud see selectors and Markets options
      | Prematch       |
      | All categories |


  @MOBILE
  Scenario: User accesses "Results" sub-tab present inside the ESports page
    Given as a User, I move to Esports page
    When I click on Results sub-tab
    Then I see all the teams that are present with date range selector
    And I sholud see selectors and Markets options
      | Prematch       |
      | All categories |


#Prematch/Live
  @DESKTOP    @Test4
  Scenario: User accesses Prematch/Live selector present inside the Results page
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on Results sub-tab
    And I click on any date from the range of dates given
    When I select either Prematch or Live from the selector
    Then I sholud see all the teams falling under the selector and date

  @MOBILE
  Scenario: User accesses "Prematch/Live" selector present inside the Results page
    Given as a User, I move to Esports page
    And I click on Results sub-tab
    And I click on any date from the range of dates given
    When I select either Prematch or Live from the selector
    Then I sholud see all the teams falling under the selector and date

#Categories
  @DESKTOP    @Test4
  Scenario: User accesses Categories selector present inside the Results page
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on Results sub-tab
    When I click on any date from the range of dates given
    Then I select any one option from the selector (Category)
    And I sholud see all the teams falling under the Category and Date

  @MOBILE
  Scenario: User accesses "Categories" selector present inside the Results page
    Given as a User, I move to Esports page
    And I click on Results sub-tab
    When I click on any date from the range of dates given
    Then I select any one option from the selector (Category)
    And I sholud see all the teams falling under the Category and Date

#Markets
  @DESKTOP 
  Scenario: User accesses Markets under the Results page
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on Results sub-tab
    And I click on any date from the range of dates given
    When I select any one choice below Markets header
    Then I see all the information related to the choice (Markets) choosed


  @MOBILE
  Scenario: User accesses "Markets" under the Results page
    Given as a User, I move to Esports page
    And I click on Results sub-tab
    And I click on any date from the range of dates given
    When I select any one choice below Markets header
    Then I see all the information related to the choice (Markets) choosed

#Odds
  @DESKTOP 
  Scenario Outline: User accesses Odds selector under the Esports page
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on Early Markets sub-tab
    When I select any <options> under Odds selector
    Then I see all the values under sub-tab selected change accordingly

    Examples:
      | options    |
      | American   |
      | Decimal    |
      | Fractional |
      | Hong Kong  |

  @MOBILE
  Scenario Outline: User accesses "Odds" selector under the ESports page
    Given as a User, I move to Esports page
    And I click on Early Markets sub-tab
    When I select any <options> under Odds selector
    Then I see all the values under sub-tab selected change accordingly

    Examples:
      | options    |
      | American   |
      | Decimal    |
      | Fractional |
      | Hong Kong  |




#Time
  @DESKTOP 
  Scenario: User accesses Odds selector under the Esports page
    Given as a User, I move to Esports page
    And I click on Early Markets sub-tab
    When I select any time zone under Time selector
    Then I see all the games displayed for selected Time zone

  @MOBILE
  Scenario: User accesses "Odds" selector under the ESports page
    Given as a User, I move to Esports page
    And I click on Early Markets sub-tab
    When I select any time zone under Time selector
    Then I see all the games displayed for selected Time zone

#Right Navigator

  @MOBILE
  Scenario: User accesses "Right Navigator" under ESports tab
    Given as a User, I move to Esports page
    When I click on Esports tab Right Navigator
    Then I see BET SLIP and MY BETS inside the right navigator


  @MOBILE
  Scenario: User accesses "Bet Slip" sub-tab under the "Right Navigator" of ESports page
    Given as a User, I move to Esports page
    And I click on any value under any header present of any or multiple teams
    When I place a bet
    Then I should see the bet is placed


#Bet Slip
  @DESKTOP 
  Scenario Outline: User accesses Bet Slip sub-tab under the Esports page
    Given as a User, I move to Esports page
    And I click on any of Esports <sub-tab>
    And I choose a team
    When I see that team/teams under BETSLIP
    Then I enter any value under STAKE of BETSLIP
    And I click on PLACE BET
    And I should see the bet is placed

    Examples:
      | sub-tab       |
      | Live          |
      | Today         |
      | Early Markets |
#      | Outright      |

  @MOBILE
  Scenario: User decides to "Delete All" bets selected before placeing the bet inside "Right Navigator"
    Given as a User, I move to Esports page
    And I click on any value under any header present of any or multiple teams
    When I click on Delete All
    Then I see all the selections under Bet Slip gets removed

  @MOBILE
  Scenario: User decides to "Delete" one bet among the selected bets before placeing the bet
    Given as a User, I move to Esports page
    And I click on any value under any header present of any or multiple teams
    When I click on Cancel (icon) of the particluar team I want to remove among the selected teams
    Then I see all the team (I chose to remove) under Bet Slip gets removed

  @DESKTOP 
  Scenario: User decides to Delete one bet among the selected bets before placing the bet
    Given as a User, I move to Esports page
    And I click on Esports tab Today sub-tab
    And I click on any value under any header present of any or multiple teams
    And I see all the selected values along with team added to Bet Slip
    When I click on Cancel (icon) of the particluar team I want to remove among the selected teams
    Then I see all the team (I chose to remove) under Bet Slip gets removed

    #Status needs waitForSeconds more than 20
  @TestB
  Scenario Outline: User discretion to accept or reject "Status change" under "Bet Slip" inside "Right Navigator"
    Given as a User, I move to Esports page
    And I click on any value under any header present of any or multiple teams
    And I click on Odd/Price Change Settings under Bet Slip
    And I select Odd/Price Change <Options>
    When I place a bet
    Then I should see the bet is placed

    Examples:
      | Options                                      |
      | Accept only better odds/prices               |
      | Automatically accept all odds/prices changes |


  @MOBILE
  Scenario: User decides to go for "Bet Max" option while entering "Stake" under "Bet Slip" inside "Right Navigator"
    Given as a User, I move to Esports page
    And I click on any value under any header present of any or multiple teams
    When I click on Bet Max choice below Stake column
    Then I should see max bet amount in the stake column

  @MOBILE
  Scenario: User decides to go for "Straight" option while entering "Stake" under "Bet Slip" inside "Right Navigator"
    Given as a User, I move to Esports page
    And I click on any value under any header present of any or multiple teams
    And I click on Straight choice under Bet Slip
    When I enter Stake for each selection individually if more than one teams available and click place bet
    Then I should see the bet is placed

  @TestB
  Scenario: User decides to go for "Parlay" option while entering "Stake" under "Bet Slip" inside "Right Navigator"
    Given as a User, I move to Esports page
    And I click on any value under any header present of any or multiple teams
    And I click on Parlay choice under Bet Slip
    When I place a bet
    Then I should see the bet is placed


  @DESKTOP 
  Scenario: User decides to Delete All bets selected before placeing the bet
    Given as a User, I move to Esports page
    And I click on Esports tab Today sub-tab
    And I click on any value under any header present of any or multiple teams
    And I see all the selected values along with team added to Bet Slip
    When I click on Delete All
    Then I see all the selections under Bet Slip gets removed

    #not completed
  @DESKTOP1 
  Scenario: User discretion to accept or reject Status change under Bet Slip
    Given as a User, I move to Esports page
    And I click on Early Markets sub-tab
    And I click on any value under any header present of any or multiple teams
    And I see all the selected values along with team added to Bet Slip
    When I see Odds or status of selection/s have changed! Accept changes? with option to Accept or Decline
    Then I click either Accept or Decline
    And I see Bet Slip values changes accordingly


  @DESKTOP 
  Scenario Outline: User opts for Odd/Price Change Settings under Bet Slip
    Given as a User, I move to Esports page
    And I click on Esports tab Today sub-tab
    And I click on any value under any header present of any or multiple teams
    And I see all the selected values along with team added to Bet Slip
    And I click on Odd/Price Change Settings under Bet Slip
    And I select Odd/Price Change <Options>
    When I place a bet
    Then I should see the bet is placed

    Examples:
      | Options                                      |
      | Automatically accept all odds/prices changes |
      | Accept only better odds/prices               |


  @DESKTOP1 
  Scenario: User decides to go for Bet Max option while entering Stake under Bet Slip
    Given as a User, I move to Esports page
    And I click on Esports tab Today sub-tab
    And I choose a team or multiple teams under any header
    And I see all the selected values along with team added to Bet Slip
    And I click on Bet Max choice below Stake column
    When I place a max bet
    Then I should see the bet is placed


  @DESKTOP 
  Scenario: User decides to go for Straight option while entering Stake under Bet Slip
    Given as a User, I move to Esports page
    And I click on Esports tab Today sub-tab
    And I click on any value under any header present of any or multiple teams
    And I see all the selected values along with team added to Bet Slip
    And I click on Straight choice under Bet Slip
    When I enter Stake for each selection individually if more than one teams available and click place bet
    Then I should see the bet is placed


  @DESKTOP 
  Scenario: User decides to go for Parlay option while entering Stake under Bet Slip
    Given as a User, I move to Esports page
    And I click on Esports tab Today sub-tab
    And I click on any value under any header present of any or multiple teams
    And I see all the selected values along with team added to Bet Slip
    And I click on Parlay choice under Bet Slip
    When I place a bet
    Then I should see the bet is placed

#My Bets
  @DESKTOP 
  Scenario Outline: User accesses My Bets tab present inside the Esports page
    Given as a User, I move to Esports page
    When I click on My Bets
    Then I see My Bets <options>

    Examples:
      | options |
      | Pending |
      | History |

  @MOBILE
  Scenario Outline: User accesses "My Bets" tab present inside the ESports page
    Given as a User, I move to Esports page
    When I click on My Bets
    Then I see My Bets <options>

    Examples:
      | options |
      | Pending |
      | History |


  @MOBILE
  Scenario: User views items under "Pending" sub-tab present inside the "My Bets" present inside "Right Navigator"
    Given as a User, I move to Esports page
    And I click on My Bets
    When I click on History
    Then I see all the Betting history in My Bets

  @MOBILE
  Scenario: User views items under "History" sub-tab present inside the "My Bets" present inside "Right Navigator"
    Given as a User, I move to Esports page
    And I click on My Bets
    When I click on Pending Bets in My Bets
    Then I should see all the Bets that are pending in MyBets

  @DESKTOP 
  Scenario: User views items under History sub-tab present inside the My Bets tab
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on My Bets
    When I click on History
    Then I see all the Betting history in My Bets

  @DESKTOP 
  Scenario: User views items under Pending sub-tab present inside the My Bets tab
    Given I am on SportsBetting application
    And I click on Esports tab
    And I click on My Bets
    When I click on Pending Bets in My Bets
    Then I should see all the Bets that are pending in MyBets

    #LEFT NAVIGATOR

  @MOBILE
  Scenario: User verifies "Left Navigator" under ESports page
    Given as a User, I move to Esports page
    When I click on Esports Left Navigator
    Then I see different Esports options under Left Navigator
      | GAMES       |
      | COUNTRY     |
      | YOUR BETS   |
      | TEAM SEARCH |

#Team Search
  @DESKTOP 
  Scenario: User wants to find team(s) under Esports page
    Given as a User, I move to Esports page
    And I enter any name in the Team Search input field with not less than three alphabets
    When I click search Icon
    Then I see all the team(s) following under the searched keyword


  @MOBILE
  Scenario: User wants to find team(s) using "TEAM SEARCH" inside "LEFT NAVIGATOR"
    Given as a User, I move to Esports page
    And I click on Esports Left Navigator
    And I enter any name in the Team Search input field with not less than three alphabets
    When I click search Icon
    Then I see all the team(s) following under the searched keyword

  @DESKTOP 
  Scenario: User wants to Clear find team(s) under Esports page
    Given as a User, I move to Esports page
    When I click on Clear (icon) inside Team Search
    Then specific results gets removed and all the teams available gets displayed

  @MOBILE
  Scenario: User wants to "Clear" find team(s) under ESports page
    Given as a User, I move to Esports page
    And I click on Esports Left Navigator
    When I click on Clear (icon) inside Team Search
    Then specific results gets removed and all the teams available gets displayed

#COUNTRY

  @MOBILE
  Scenario: User clicks on "COUNTRY" inside "LEFT NAVIGATOR"
    Given as a User, I move to Esports page
    And I click on Esports Left Navigator
    When I click on Esports COUNTRY under Left Navigator
    Then I see countries inside Country
      | 中文繁體    |
      | English |




#Chinese(中文繁體)

  #Not ASCII format
  @TestB
  Scenario: User validates "中文繁體" sub-tab present inside "LEFT NAVIGATOR"
    Given as a User, I move to Esports page
    And I click on Esports Left Navigator
    When I click on Esports Country 中文繁體
    Then I see all text changing from English to Chinese


#ENGLISH

  #Since no chinese words
  @TestB
  Scenario: User validates "ENGLISH" tab present inside "LEFT NAVIGATOR"
    Given as a User, I have already clicked Chinese inside COUNTRY inside LEFT NAVIGATOR
    And I click on Esports Left Navigator
    And I click on Esports COUNTRY under Left Navigator
    When I click on Esports Country English
    Then I see all text changing from Chinese to English

#YOUR BETS

  @MOBILE
  Scenario: User clicks on "YOUR BETS" inside "LEFT NAVIGATOR"
    Given as a User, I move to Esports page
    And I click on Esports Left Navigator
    When I click on YOUR BETS under Left Navigator
    Then I see BET HISTORY option inside YOUR BETS

  @MOBILE
  Scenario: User accesses "BET HISTORY" option under "YOUR BETS" inside "LEFT NAVIGATOR"
    Given as a User, I have already clicked on YOUR BETS
    When I click on BET HISTORY inside YOUR BETS
    Then I see Pending and History under MY BETS inside RIGHT NAVIGATOR with same results

#FAVORITES

  @MOBILE
  Scenario: User accesses Favorite sub-tab under "LEFT NAVIGATOR"
    Given as a User, I move to Esports page
    When I click on Favorite sub-tab
    Then User see No favorites message

  @MOBILE
  Scenario: User adds teams as Favorite
    Given as a User, I move to Esports page
    And I click on Early Markets sub-tab
    And I click on Star (Icon) of any team
    When I click on Favorite sub-tab
    Then verify team added to Favorite

  @MOBILE
  Scenario: User deletes teams from Favorite sub-tab under "LEFT NAVIGATOR"
    Given as a User, I move to Esports page
    And I click on Favorite sub-tab
    When I click on Star (Icon) of any team
    Then User see No favorites message
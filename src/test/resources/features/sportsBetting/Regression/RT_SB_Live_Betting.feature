Feature:User validates all the functionalies of "LIVE BETTING" tab

  @DESKTOP
  Scenario Outline: User visits SportsBetting application
    Given I am on SportsBetting application
    When User login to the SportsBetting site with following credential <Username> and <Password>
    Then I should see the SportsBetting site homepage

    Examples:
      | Username | Password  |
      | SB808358 | C0d0!d_P@ss1 |

  @MOBILE
  Scenario: User verifies all the functionalities of "LIVE" tab under homepage
    Given I am on SportsBetting application
    When I move to LIVE
    Then I see redirected page with following sub-tabs
      | BET SLIP       |
      | Hide Top Menu  |
      | Hide Live Menu |
    And I should see few games with their respective Start timing displayed under their respective headers

#Hide Top Menu
  @MOBILE
  Scenario: User verifies the functionality of "Hide Top Menu" sub-tab under "Live" page
    Given as a User, I am already on the Live page
    And I see Hide Top Menu containing home-tabs
      | BLACK          |
      | RED            |
      | CASINO         |
      | CLASSIC CASINO |
      | POKER          |
      | ESPORTS        |
      | PLAYER PROPS   |
      | SPORTS         |
      | LIVE           |
      | RACEBOOK       |
    When I click on Live Page Hide Top Menu
    Then I see Hide Top Menu changes to Show Top Menu

  @MOBILE
  Scenario: User clicks on "Show Top Menu" sub-tab under "Live" page
    Given as a User, I see Live Page Show Top Menu
    When I click Live Page Show Top Menu
    Then I see Show Top Menu is changed to Hide Top Menu showing all the home-tabs again
      | BLACK          |
      | RED            |
      | CASINO         |
      | CLASSIC CASINO |
      | POKER          |
      | ESPORTS        |
      | PLAYER PROPS   |
      | SPORTS         |
      | LIVE           |
      | RACEBOOK       |

#Hide Live Menu
  @MOBILE
  Scenario: User verifies the functionality of "Hide Live Menu" sub-tab under "Live" page
    Given as a User, I am already on the Live page
    And I see Hide Live Menu containing live-tabs
      | Live Odds   |
      | Multi View  |
      | Calendar    |
      | My Wagers   |
      | Rules       |
      | Market Tips |
    When I click on Live Page Hide Live Menu
    Then I see Hide Live Menu changes to Show Live Menu

  @DESKTOP @LiveBetting @Scenario2 @batch5
  Scenario:  User verifies Live Betting sub tab
    Given I am on SportsBetting application
    When I move to LIVE BETTING
    Then I see MenuTypes under Live Betting sub tab.
      | Event View |
      | Multi View |
      | My Wagers  |
      | Calendar   |

  @MOBILE
  Scenario: User clicks on "Show Live Menu" sub-tab under "Live" page
    Given as a User, I see Live Page Show Live Menu
    When I click on Live Page Show Live Menu
    Then I see Show Live Menu is changed to Hide Live Menu showing all the live-tabs again
      | Live Odds   |
      | Multi View  |
      | Calendar    |
      | My Wagers   |
      | Rules       |
      | Market Tips |

  @DESKTOP @LiveBetting @Scenario3 @batch1
  Scenario Outline:  User verifies Event View menu type under the Live Betting sub tab
    Given as a user, I am on Live Betting tab
    When I click Event View
    Then I should see the <GameList> with Expand & Collapse icon
    Examples:
      | GameList |
      | UpComing |
      | Now Live |

  @MOBILE
  Scenario: User accesses "Live Odds" under "Hide Live Menu" sub-tab
    Given as a User, I am already on the Live page
    When I click on Live Page Live Odds Under Live Menu
    Then I see a refreshed page displaying two headers and a Bet Slip
      | In Progress |
      | Upcoming    |
    And I see a bar stating No Events Selected


  @MOBILE
  Scenario: User accesses "In Progress" header under "Live Odds"
    Given as a User, I am already on the Live Odds under Live Menu
    When I click on In Progress (displaying count of all the games in progress)
    Then I see all the games which are in progress and up for betting (If any)

  @MOBILE
  Scenario: User accesses "Upcoming" header under "Live Odds"
    Given as a User, I am already on the Live Odds under Live Menu
    When I click on Upcoming (displaying count of all the games upcoming in future)
    Then I see all the games which are to start with their start time

  @MOBILE
  Scenario: User accesses "In Progress" header under "Live Odds"
    Given as a User, I am already on the Live Odds under Live Menu
    When I click on In Progress (displaying count of all the games in progress)
    Then I see all the games which are in progress and up for betting (If any)

  @MOBILE
  Scenario: User selects any team/s from under "In Progress" header under "Live Odds"
    Given I see all the games which are in progress and up for betting (If any)
    When I select any team under Live odds under Live Menu
    Then I see all the games selected is displayed on the place of No Events Selected bar
    And I see a My Bets on This Game button being displayed along with team selected

  @TestB
  Scenario: User selects any odds from the teams displayed on the place of "No Events Selected" bar but is not active for betting
    Given I see all the games selected is displayed on the place of No Events Selected bar
    And I see "This event has no active propositions" below the team
    When I select any odds from any team
    Then I see no action is performed

  @MOBILE
  Scenario: User selects any odds from the teams displayed on the place of "No Events Selected" bar
    Given I see all the games selected is displayed on the place of No Events Selected bar
    When I select any odds from under team selected under Live Odds
    Then I see a pop-up roughly stating Bet has been added
    And I see odds with respective team gets added to Bet Slip
    And I click on CLEAR button under Bet Slip

  @DESKTOP @LiveBetting @Scenario4 @batch1
  Scenario: User verifies
    Given as a user, I am on Live Betting tab
    When I click Event View
    Then I should see Now Live with appropirate icon & location


  @MOBILE
  Scenario: User accesses "My Bets on This Game" displayed under "Live Odds"
    Given I see all the games selected is displayed on the place of No Events Selected bar
    When I click My Bets on This Game under Live Odds Team selected
    Then I see My Wagers gets auto-selected
    And I see all the wagers related details

  @MOBILE
  Scenario: User accesses "Multi View" under "Hide Live Menu" sub-tab
    Given as a User, I am already on the Live page
    And I click on Live Page Multi View Under Live Menu
    When I see list of games under there respective headers stating Select a game for this slot
    Then I click on any team under Multi View
    And I see MY BETS on the header of individual games

  @DESKTOP @LiveBetting @Scenario5 @batch1
  Scenario: User validates Now Live game list on Collapse mode
    Given as a user, I am on Live Betting tab
    And I click Event View
    When I click Now Live
    Then I should see all the live events displaying in Now Live

  @MOBILE
  Scenario: User adds teams from under "Multi View" to the "BET SLIP"
    Given I see MY BETS on the header of individual games
    And I click on any available game odds value under both Select a game for this slot header
    And I see a pop-up roughly stating Bet has been added
    And I click on Add an Event under Multi View
    When I click on any team under Multi View
    Then I see odds with respective team gets added to Bet Slip
    And I click on CLEAR button under Bet Slip

  @MOBILE
  Scenario: User accesses "MY BETS" under "Multi View"
    Given I see MY BETS on the header of individual games
    And I click My Bets on This Game under Live Odds Team selected
    When I see My Wagers gets auto-selected
    Then I see all the wagers related details

# #Only when live games are available
#  @DESKTOP @LiveBetting3 @Scenario6 @batch1
#  Scenario: User selects the live event from the Now Live game list
#    Given as a user, I am on Live Betting tab
#    And I click Event View
#    And I click Now Live
#    And I see live game events under Now Live
#    When I click any of the live event
#    Then I should see Live Match Summary details for the appropirate event

  @DESKTOP @LiveBetting @Scenario7 @batch1
  Scenario: User validates Upcoming game list
    Given as a user, I am on Live Betting tab
    And I click Event View
    Then I should see all Upcoming games with appropriate icon & location

  @DESKTOP @LiveBetting @Scenario8 @batch1
  Scenario: User validates Upcoming game list on Collapse mode
    Given as a user, I am on Live Betting tab
    And I click Event View
    #When I click Upcoming Collapse icon
    Then I should see all the Upcoming events count displaying in Upcoming games

  @DESKTOP @LiveBetting @Scenario9 @batch1
  Scenario: User validates Minimize and  Maximize the Event View's
    Given as a user, I am on Live Betting tab
    And I click Event View
    And I see event view in maximize mode
    When I click minimize icon
    Then I should see all the Events minimized

#Multi View
  #Only when live games are available
  @DESKTOP @LiveBetting @Scenario10 @batch1
  Scenario:  User verifies Multiple View menu type under the Live Betting sub tab
    Given as a user, I am on Live Betting tab
    When I click Multi View
    Then I should see all the Live events splitted as four slots with Expand & Collapse icon

  @DESKTOP @LiveBetting @Scenario11 @batch1
  Scenario:User able to open & close the live events Match Summary Details in multiple screen
    Given as a user,I am on Multi View games page
    And I see all the live events in splitted screens
    And I click live events in all the splitted screens
    And I see Match Summary Details open in all the splitted screens
    When I click close icon in any the splitted screens
    Then I should see Match Summary Details will closed particular screens.

    #Calendar
  @MOBILE
  Scenario: User accesses "Today" under "Calendar"
    Given as a User, I am already on the Live page
    And I click on Live Page Calendar Under Live Menu
    When I see Today is selected by default
    Then I see toady's date with all the scheduled matches

  @MOBILE
  Scenario: User accesses any week under "Calendar" except "Today"
    Given I see Today is selected by default
    When I select any week-tab under Calendar
    Then I see that particular day's date being displayed along with all the scheduled matches


#My Wagers
  @DESKTOP @LiveBetting @Scenario12 @batch1
  Scenario: User verifies My Wagers menu type under the Live Betting sub tab
    Given as a user, I am on Live Betting tab
    When I click My Wagers
    Then I should see Wagers Details
      | Proposition | Odds | Placed | Bet Amount | To Win | Outcome | Amount Paid |

  @DESKTOP @LiveBetting @Scenario13 @batch1
  Scenario:  User validates Today tab under the My Wagers menu type
    Given as a user, I am on My Wagers page
    When I click Today tab under My Wagers menu type
    Then I should see My wagers details according to the Today's Bet

  @DESKTOP @LiveBetting @Scenario14 @batch1
  Scenario:  User validates This Week tab under the My Wagers menu type
    Given as a user, I am on My Wagers page
    When I click This Week tab under My Wagers menu type
    Then I should see My wagers details according to the This weeks Bet.

  @DESKTOP @LiveBetting @Scenario15 @batch1
  Scenario:  User validates All Undecided tab under the My Wagers menu type
    Given as a user, I am on My Wagers page
    When I click All Undecided tab under My Wagers menu type
    Then I should see My wagers details according to the All undecided Bet

  @DESKTOP @LiveBetting @Scenario16 @batch1
  Scenario:  Once the bet results are out then bet should be removed from the All Undecided tab
    Given as a user, I am on My Wagers page
    When I click All Undecided tab under My Wagers menu type
    Then I should see outcome bets are removed from the All Undecided tab

  @DESKTOP @LiveBetting @Scenario17 @batch1
  Scenario:  User validates Placed Bets are in Pending status when the results are not published in My Wagers tab.
    Given as a user, I am on Live Betting tab
    When I click My Wagers
    Then I should see placed bets are in Pending status

  @DESKTOP @LiveBetting  @Scenario18 @batch1
  Scenario:  User checks outcome of placed bets when the game is finished.
    Given as a user, I am on My Wagers page
    When I click This Week tab under My Wagers menu type
    Then I should see outcome results with Amount Paid

    #My Wagers
  @MOBILE
  Scenario: User accesses "My Wagers" under "Hide Live Menu" sub-tab
    Given as a User, I am already on the Live page
    And I click on Live Page My Wagers Under Live Menu
    Then I see a refreshed page displaying wagers-tab
      | TODAY         |
      | THIS WEEK     |
      | ALL UNDECIDED |
    And I see all the wagers related details

  @MOBILE
  Scenario: User accesses any "wagers-tab" under "My Wagers"
    Given I see all the wagers related details
    When I select any of the wagers-tabs or team
    Then I see all the details being displayed under selected week-tabs


#Successfully Bet the Game

##Only when live games are available
#  @DESKTOP @LiveBetting @Scenario19 @Smoke1
#  Scenario:User able to successfully bet the live event game
#    Given as a user, I am on Live Betting tab
#    And I click Event View
#    And I click any live game
#    And I choose the team under live game
#    And i enter Bet Amount in betslip
#    When I click Place Bet button on Bet Slip
#    Then I should see successfully BetPosted
#

# #Only when live games are available
#  @DESKTOP @LiveBetting  @Scenario20 @Smoke
#  Scenario:  User validates My Bets on This Game button on cashier frame
#    Given as a user, I am on Live Betting tab
#    And I click any live game
#    When I click on My Bets on This Game button
#    Then I should see page navigates to the My Wagers tab
#    And I see bet details displaying as tab with team name

#Calender

  @DESKTOP @LiveBetting @Scenario23 @batch2
  Scenario:  User validates Info message when there is no live events scheduled on calendar
    Given I am on SportsBetting application
    And I move to LIVE BETTING
    When I click Calender
    Then I click days where no live events are scheduled on the Calendar

  @DESKTOP
  Scenario:  User validates Choose Sport filter option on Calendar view
    Given I am on SportsBetting application
    And I move to LIVE BETTING
    And I click Calender
    When I select any game from dropdown
    Then I should see calender view changed according to the selected sport type

    #Rules
  @DESKTOP
  Scenario:  User checks Rules menu type under the Live Betting sub tab
    Given I am on SportsBetting application
    And I move to LIVE BETTING
    When I click Rules in Live Betting page
    Then I should see Rules Content for all the sports

  @DESKTOP
  Scenario: User checks Calendar menu type under the Live Betting sub tab
    Given I am on SportsBetting application
    And I move to LIVE BETTING
    And I click Calender
    Then I should see calender view for all the live and upcoming events



    #Only when live games are available
#  @DESKTOP @LiveBetting @Scenario22
#  Scenario:  User navigates to the live event from the calendar view@DESKTOP @LiveBetting @Scenario22
#  Scenario:  User validates Choose Sport filter option on Calendar view
#    Given as a user, I am on Live Betting tab
#    And I click Calender
#    When I select Hockey from dropdown
#    Then I should see calender view changed according to the selected sport type
#    Given as a user, I am on Live Betting tab
#    When I click Calender
#    When I click live event from the Today tab
#    Then I should see user navigates to the appropriate live event summary page


    #Rules
  @MOBILE
  Scenario: User accesses "Rules" under "Hide Live Menu" sub-tab
    Given as a User, I am already on the Live page
    When I click on Live Page Rules Under Live Menu
    Then I see refreshed page with all the rules related to games

# Odds Format Change
#   #Only when live games are available
#  @DESKTOP @LiveBetting @Scenario25
#  Scenario Outline:  User validates Odds Format drop down
#   # Given as a user, I am on Live Betting tab
#    Given I am on SportsBetting application
#    When I move to LIVE BETTING
#    And I click any live game
#    When I Change <OddsFormat> from drop down
#    Then I should see Odds changed according to the selected OddsFormat
#    Examples:
#      | OddsFormat |
#      | American   |
#      | Decimal    |
#      | Fractional |

  #Bet Slip
  @MOBILE
  Scenario: User accesses "Bet Slip" under "Live" tab page when no team has been added
    Given as a User, I am already on the Live page
    When I click on BET SLIP under Live Menu
    Then I see a text stating Your bet slip is empty
    And I see a dropdown with odds-options displaying Accept favourable price change

  @MOBILE
  Scenario: User accesses "In Progress" header under "Live Odds"
    Given I click on Live Page Live Odds Under Live Menu
    When I click on In Progress (displaying count of all the games in progress)
    Then I see all the games which are in progress and up for betting (If any)

  @MOBILE
  Scenario: User selects any team/s from under "In Progress" header under "Live Odds"
    Given I see all the games which are in progress and up for betting (If any)
    When I select any team under Live odds under Live Menu
    Then I see all the games selected is displayed on the place of No Events Selected bar
    And I see a My Bets on This Game button being displayed along with team selected

  @MOBILE
  Scenario: User selects any odds from the teams displayed on the place of "No Events Selected" bar
    Given I see all the games selected is displayed on the place of No Events Selected bar
    When I select any odds from under team selected under Live Odds
    Then I see a pop-up roughly stating Bet has been added
    And I see odds with respective team gets added to Bet Slip

  @MOBILE
  Scenario: User accesses "Bet Slip" under "Live" tab page when team(s) have already been added
    Given I see odds with respective team gets added to Bet Slip
    When I click on BET SLIP under Live Menu
    Then I see all the teams added with input field for Bet Amount
    And I see CLEAR button and Close (Icon)

#How to Bet Live

  @DESKTOP @LiveBetting  @Scenario26 @batch2
  Scenario:  User verifies How to Bet Live sub tab
    Given I am on SportsBetting application
    And I move to LIVE BETTING
    When I click How To Bet Live tab
    Then I should see instructions for How to Bet Live

  #Bet Slip in Live Betting Tab
  @DESKTOP @LiveBetting  @Scenario27 @batch1 @batch2
  Scenario Outline: User checks Bet Slip on Live Betting tab.
    Given I am on SportsBetting application
    And I move to LIVE BETTING
    When I see Bet slip
    Then I should see following <BetSlipTabs>
    Examples:
      | BetSlipTabs |
      | Bet Slip    |
      | My Bets     |
#      | ?           |

  @DESKTOP @LiveBetting @Scenario28 @batch1 @batch2
  Scenario: User validates Alert Message for Quick Bet On in Bet Slip
    Given I am on SportsBetting application
    And I move to LIVE BETTING
    When I check Quick Bet on check box in bet slip
    Then I should see Alert popup

  @MOBILE
  Scenario: User accesses "ACCEPT CHANGES" under "Bet Slip"
    Given I see all the teams added with input field for Bet Amount
    And i enter Bet Amount in betslip
    When I click on ACCEPT CHANGES if appeared
    Then I see POST button to place bet

  @MOBILE
  Scenario: User places bet from "Bet Slip" under "Live" tab page
    Given I see POST button to place bet
    When I click Place Bet button on Bet Slip
    Then I see a pop-up either confirming bet placed or showing an error

  @MOBILE
  Scenario: User accesses "In Progress" header under "Live Odds"
    Given as a User, I am already on the Live Odds under Live Menu
    When I click on In Progress (displaying count of all the games in progress)
    Then I see all the games which are in progress and up for betting (If any)

    #Only when live games are available
#  @DESKTOP @LiveBetting @Scenario29 @batch1 @batch
#  Scenario: User validates Quick Bet On in Bet Slip
#    Given I am on SportsBetting application
#    And I move to LIVE BETTING
#    And I click Event View
#    And I click Quick Bet on check box in bet slip
#    And I click any live game
#    And I choose the team under live game
#    When I click on odds
#    Then I should see successfully BetPosted

#  rules tab is now not availabe in betslip
  @DESKTOP1 @LiveBetting @Scenario30 @batch2 @batch1
  Scenario: User validates Rules Tab in Bet slip
#    Given as a user, I am on Live Betting tab
    Given I am on SportsBetting application
    When I move to LIVE BETTING
    And I click on Rules tab in Bet slip
    Then I should see page navigates to the Rules subtab under Live Betting

  @MOBILE
  Scenario: User selects any team/s from under "In Progress" header under "Live Odds"
    Given I see all the games which are in progress and up for betting (If any)
    When I select any team under Live odds under Live Menu
    Then I see all the games selected is displayed on the place of No Events Selected bar
    And I see a My Bets on This Game button being displayed along with team selected

  @MOBILE
  Scenario: User selects any odds from the teams displayed on the place of "No Events Selected" bar
    Given I see all the games selected is displayed on the place of No Events Selected bar
    When I select any odds from under team selected under Live Odds
    Then I see a pop-up roughly stating Bet has been added
    And I see odds with respective team gets added to Bet Slip

  @MOBILE
  Scenario: User opts to clear all bet from "Bet Slip" under "Live" tab page
    Given I see odds with respective team gets added to Bet Slip
    And I click on BET SLIP under Live Menu
    When I click on CLEAR button under Bet Slip
    Then I see a text stating Your bet slip is empty

#
#  #Only when live games are available
#  @DESKTOP @LiveBetting @Scenario31
#  Scenario: User validates My Bets Tab in Bet slip
#    Given as a user, I am on Live Betting tab
#    And I click Quick Bet on check box in bet slip
#    And I click any live game
#    And I choose the team under live game
#    And I click on odds
#    When I successfully Place the bets
#    Then I should see All the placed bet slip in My Bets tab

#  #Only when live games are available
#  @DESKTOP1 @LiveBetting @Scenario32
#  Scenario: User able to remove the betslip, before it has been placed by clicking close icon
#    Given as a user, I am on Live Betting tab
#    And I click any live game
#    And I choose the team under live game
#    And I click on odds
#    And I see Betslip
#    When I click close icon in betslip
#    Then I should see bet slip is removed

  @DESKTOP @LiveBetting  @Scenario33 @batch1 @batch2
  Scenario: User validates Market Tips on Bet Slip
    Given as a user, I am on Live Betting tab
    When I see Bet slip
    Then I should see Market Tips for available sports

  @DESKTOP @LiveBetting @Scenario34 @batch1 @batch2
  Scenario: User validates when there is No Market Tips available for Live events on Bet Slip
    Given as a user, I am on Live Betting tab
    And I see Bet slip
    When I click no market tips available sport
    Then I should see Currently there are no market tips available Message

  @MOBILE
  Scenario: User accesses "In Progress" header under "Live Odds"
    Given as a User, I am already on the Live Odds under Live Menu
    When I click on In Progress (displaying count of all the games in progress)
    Then I see all the games which are in progress and up for betting (If any)

  @MOBILE
  Scenario: User selects any team/s from under "In Progress" header under "Live Odds"
    Given I see all the games which are in progress and up for betting (If any)
    When I select any team under Live odds under Live Menu
    Then I see all the games selected is displayed on the place of No Events Selected bar
    And I see a My Bets on This Game button being displayed along with team selected

  @MOBILE
  Scenario: User selects any odds from the teams displayed on the place of "No Events Selected" bar
    Given I see all the games selected is displayed on the place of No Events Selected bar
    When I select any odds from under team selected under Live Odds
    Then I see a pop-up roughly stating Bet has been added
    And I see odds with respective team gets added to Bet Slip

  @MOBILE
  Scenario: User opts to cancel one selection from "Bet Slip" under "Live" tab page
    Given I see odds with respective team gets added to Bet Slip
    And I click on BET SLIP under Live Menu
    When I click on Close (Icon) under Bet Slip
    Then I see a text stating Your bet slip is empty